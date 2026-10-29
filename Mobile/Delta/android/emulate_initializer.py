"""Bounded, offline ARM64 emulation of the first ELF initializer.

No host syscalls or network are forwarded. Unimplemented imports/syscalls stop
the emulation. Output is a derived memory image, never an original artifact.
"""
import json
import struct
import sys
from pathlib import Path
from elftools.elf.elffile import ELFFile
from unicorn import Uc, UcError, UC_ARCH_ARM64, UC_MODE_ARM, UC_HOOK_CODE, UC_HOOK_INTR, UC_HOOK_MEM_INVALID
from unicorn.arm64_const import *

ROOT = Path(__file__).parent
SOURCE = ROOT / 'extracted/lib/arm64-v8a/libzstd-jni-1.5.7-6.so'
u = Uc(UC_ARCH_ARM64, UC_MODE_ARM)
u.mem_map(0, 0x1200000)
u.mem_map(0x40000000, 0x1000000)
u.mem_map(0x50000000, 0x10000)
u.mem_map(0x60000000, 0x10000)
u.mem_map(0x70000000, 0x800000)
u.mem_map(0x7fff0000, 0x1000)
u.reg_write(UC_ARM64_REG_SP, 0x707f0000)
u.reg_write(UC_ARM64_REG_TPIDR_EL0, 0x60000000)
u.reg_write(UC_ARM64_REG_LR, 0x7fff0000)
imports = {}
symbols = {}
events = []
heap = 0x40000000
tls_values = {}
next_tls_key = 1
jni_methods = {}
jni_fields = {}
allocations = {}
iterate_state = None
synthetic_ticks = 0
sleep_calls = 0
last_jni_string = ''
jni_exception = False
source_bytes = SOURCE.read_bytes()
file_offset = 0
virtual_data = source_bytes

def log(**values):
    events.append(values)
    if len(events) < 60: print(json.dumps(values), flush=True)

def cstr(addr, maximum=4096):
    raw = bytes(u.mem_read(addr, maximum))
    return raw.split(b'\0', 1)[0]

def va_gp_args(addr, count):
    """Read integer/pointer arguments from Android arm64's va_list layout."""
    stack, gr_top, _vr_top, gr_offs, _vr_offs = struct.unpack('<QQQii', bytes(u.mem_read(addr, 32)))
    values=[]
    for _ in range(count):
        if gr_offs < 0:
            values.append(struct.unpack('<Q', bytes(u.mem_read(gr_top+gr_offs, 8)))[0])
            gr_offs += 8
        else:
            values.append(struct.unpack('<Q', bytes(u.mem_read(stack, 8)))[0])
            stack += 8
    return values

with SOURCE.open('rb') as f:
    elf = ELFFile(f)
    segments = []
    for seg in elf.iter_segments():
        if seg['p_type'] == 'PT_LOAD':
            u.mem_write(seg['p_vaddr'], seg.data())
            segments.append({k:seg[k] for k in ['p_offset','p_vaddr','p_filesz','p_memsz']})
    for name in ['.rela.dyn', '.rela.plt']:
        sec = elf.get_section_by_name(name)
        symtab = elf.get_section(sec['sh_link'])
        for rel in sec.iter_relocations():
            typ = rel['r_info_type']; sym = symtab.get_symbol(rel['r_info_sym'])
            if typ == 1027:
                value = rel['r_addend']
            elif typ in (257, 1025, 1026):
                if sym['st_shndx'] != 'SHN_UNDEF': value = sym['st_value'] + rel['r_addend']
                else:
                    n = sym.name
                    if n not in symbols:
                        address = 0x50000000 + len(symbols) * 16
                        symbols[n] = address; imports[address] = n
                        u.mem_write(address, bytes.fromhex('c0035fd6'))
                    value = symbols[n] + rel['r_addend']
            else:
                raise RuntimeError(f'Unsupported relocation {typ}')
            u.mem_write(rel['r_offset'], struct.pack('<Q', value & ((1 << 64)-1)))
    init = elf.get_section_by_name('.init_array')
    start = struct.unpack('<Q', bytes(u.mem_read(init['sh_addr'],8)))[0]
    constructors=[struct.unpack('<Q',bytes(u.mem_read(init['sh_addr']+i,8)))[0] for i in range(0,init['sh_size'],8)]

def external(uc, address, size, data):
    global heap, file_offset, next_tls_key, virtual_data, iterate_state, last_jni_string, jni_exception, sleep_calls
    name = imports.get(address)
    a = [uc.reg_read(UC_ARM64_REG_X0+i) for i in range(6)]
    log(kind='import', name=name, args=[hex(x) for x in a])
    if name in ('mprotect', 'pthread_mutex_lock', 'pthread_mutex_unlock', 'pthread_mutex_init', 'pthread_mutex_destroy', 'pthread_cond_broadcast', 'pthread_cond_signal', 'pthread_cond_init', 'pthread_cond_destroy', 'pthread_rwlock_init', 'pthread_rwlock_rdlock', 'pthread_rwlock_wrlock', 'pthread_rwlock_unlock', 'pthread_rwlock_destroy', 'pthread_atfork', '__register_atfork', '__android_log_print', '__android_log_write', 'sigemptyset', 'sigaddset', 'sigaction', 'sigprocmask'):
        result = 0
    elif name in ('memcpy', 'memmove', '__memcpy_chk', '__memmove_chk'):
        if a[2] > 0x1200000: raise RuntimeError('Oversized copy')
        uc.mem_write(a[0], bytes(uc.mem_read(a[1], a[2]))); result = a[0]
    elif name in ('memset', '__memset_chk'):
        if a[2] > 0x1200000: raise RuntimeError('Oversized memset')
        uc.mem_write(a[0],bytes([a[1]&255])*a[2]); result=a[0]
    elif name in ('malloc','calloc'):
        n=a[0] if name=='malloc' else a[0]*a[1]
        if n>0x800000 or heap+n>0x41000000: raise RuntimeError('Heap budget exceeded')
        result=heap; heap+=(n+15)&~15; allocations[result]=n
    elif name == 'realloc':
        n=a[1]
        if n>0x800000 or heap+n>0x41000000: raise RuntimeError('Heap budget exceeded')
        if a[0] and a[0] not in allocations: raise RuntimeError('Unknown realloc allocation')
        result=heap; heap+=(n+15)&~15; allocations[result]=n
        count=min(n,allocations.get(a[0],0))
        if count: uc.mem_write(result,bytes(uc.mem_read(a[0],count)))
    elif name == 'free': result=0
    elif name == 'getpagesize': result=4096
    elif name == 'sysconf' and a[0] in (0x27,0x28): result=4096
    elif name in ('strlen','__strlen_chk'): result=len(cstr(a[0]))
    elif name == 'strdup':
        raw=cstr(a[0])+b'\0'; result=heap; heap+=(len(raw)+15)&~15; allocations[result]=len(raw); uc.mem_write(result,raw)
    elif name in ('strcpy','__strcpy_chk'):
        raw=cstr(a[1])+b'\0'; uc.mem_write(a[0],raw); result=a[0]
    elif name == '__vsnprintf_chk':
        fmt=cstr(a[4]).decode(errors='replace')
        values=va_gp_args(a[5],1)
        if fmt != '%02x ': raise RuntimeError(f'Unsupported synthetic printf format {fmt!r}')
        rendered=(f'{values[0]&255:02x} ').encode()
        limit=a[1]; uc.mem_write(a[0],rendered[:max(0,limit-1)]+(b'\0' if limit else b''))
        log(kind='synthetic_printf',format=fmt,value=values[0]&255,rendered=rendered.decode())
        result=len(rendered)
    elif name in ('strncpy','__strncpy_chk'):
        raw=cstr(a[1],min(a[2],4096))[:a[2]]; uc.mem_write(a[0],raw.ljust(a[2],b'\0')); result=a[0]
    elif name == 'memcmp':
        x=bytes(uc.mem_read(a[0],a[2])); y=bytes(uc.mem_read(a[1],a[2])); result=(x>y)-(x<y)
    elif name == 'memchr':
        pos=bytes(uc.mem_read(a[0],a[2])).find(bytes([a[1]&255])); result=0 if pos<0 else a[0]+pos
    elif name in ('strchr','strrchr'):
        raw=cstr(a[0])+b'\0'; needle=bytes([a[1]&255]); pos=raw.find(needle) if name=='strchr' else raw.rfind(needle); result=0 if pos<0 else a[0]+pos
    elif name == 'strstr':
        pos=cstr(a[0]).find(cstr(a[1])); result=0 if pos<0 else a[0]+pos
    elif name in ('strcasecmp','strncasecmp'):
        n=min(a[2],4096) if name=='strncasecmp' else 4096
        x=cstr(a[0],n).lower(); y=cstr(a[1],n).lower(); result=(x>y)-(x<y)
    elif name in ('strcmp','strncmp'):
        n=min(a[2],4096) if name=='strncmp' else 4096
        x=cstr(a[0],n); y=cstr(a[1],n); result=(x>y)-(x<y)
    elif name == '__errno': result=0x60000100
    elif name == 'dladdr':
        # Synthetic linker metadata for this one mapped ELF image.
        uc.mem_write(0x60001000, str(SOURCE).encode()+b'\0')
        uc.mem_write(a[1], struct.pack('<QQQQ',0x60001000,0,0,0)); result=1
    elif name in ('open','open64','__open_2'):
        path=cstr(a[0]).decode(errors='replace'); log(kind='virtual_open',path=path)
        if path.endswith('/.__gloop_perm_check.tmp') and path.startswith('/storage/emulated/0/Android/data/com.roblox.client/'):
            log(kind='synthetic_writable_file',path=path); uc.reg_write(UC_ARM64_REG_X0,72); uc.reg_write(UC_ARM64_REG_PC,uc.reg_read(UC_ARM64_REG_LR)); return
        if path == str(SOURCE): virtual_data=source_bytes
        elif path == '/proc/self/status':
            virtual_data=b'Name:\tanalysis\nState:\tR (running)\nPid:\t1\nPPid:\t0\nTracerPid:\t0\nThreads:\t1\n'
            log(kind='synthetic_file',path=path,contents=virtual_data.decode())
        else:
            log(kind='blocked_file',path=path); uc.emu_stop(); return
        result=71; file_offset=0
    elif name in ('read','pread','pread64','__read_chk','__pread64_chk') and a[0]==71:
        offset=a[3] if 'pread' in name else file_offset
        chunk=virtual_data[offset:offset+min(a[2],0x1200000)]
        if chunk: uc.mem_write(a[1],chunk)
        result=len(chunk)
        if 'pread' not in name: file_offset+=result
    elif name in ('lseek','lseek64') and a[0]==71:
        offset=a[1] if a[1]<(1<<63) else a[1]-(1<<64)
        file_offset=offset+([0,file_offset,len(virtual_data)][a[2]]); result=file_offset
    elif name in ('fstat','fstat64') and a[0]==71:
        st=bytearray(128); struct.pack_into('<I',st,16,0o100644)
        struct.pack_into('<q',st,48,len(source_bytes)); struct.pack_into('<I',st,56,4096)
        uc.mem_write(a[1],bytes(st)); result=0
    elif name == 'close' and a[0] in (71,72): result=0
    elif name in ('write','__write_chk') and a[0]==72:
        log(kind='synthetic_file_write',bytes=a[2]); result=a[2]
    elif name in ('unlink','remove') and cstr(a[0]).endswith(b'/.__gloop_perm_check.tmp'): result=0
    elif name in ('mmap','mmap64'):
        n=(a[1]+4095)&~4095
        if n>0x1000000 or heap+n+4096>0x41000000: raise RuntimeError('Mapping budget exceeded')
        heap=(heap+4095)&~4095; result=heap; heap+=n
        if a[4]==71:
            chunk=source_bytes[a[5]:a[5]+a[1]]
            if chunk: uc.mem_write(result,chunk)
        elif not (a[3] & 0x20) and a[4] not in (0xffffffffffffffff,0xffffffff):
            raise RuntimeError(f'Unsupported virtual mmap fd {a[4]}')
    elif name == 'munmap': result=0
    elif name in ('__cxa_atexit','__cxa_finalize'): result=0
    elif name == 'getauxval': result=0
    elif name == '__system_property_get': uc.mem_write(a[1],b'\0'); result=0
    elif name == 'syscall' and a[0] in (172,178): result=1
    elif name == 'getenv': result=0
    elif name in ('newlocale','uselocale','duplocale'): result=0x60009000
    elif name == 'freelocale': result=0
    elif name == 'localeconv':
        uc.mem_write(0x6000b000,b'.\0\0')
        uc.mem_write(0x6000a000,struct.pack('<10Q',0x6000b000,*([0x6000b002]*9))+bytes([127])*32)
        result=0x6000a000
    elif name in ('__ctype_get_mb_cur_max','MB_CUR_MAX'): result=1
    elif name == 'pthread_once':
        if not any(uc.mem_read(a[0],4)):
            uc.mem_write(a[0],struct.pack('<I',1)); uc.reg_write(UC_ARM64_REG_PC,a[1]); return
        result=0
    elif name == 'pthread_key_create':
        uc.mem_write(a[0],struct.pack('<I',next_tls_key)); next_tls_key+=1; result=0
    elif name == 'pthread_getspecific': result=tls_values.get(a[0],0)
    elif name == 'pthread_setspecific': tls_values[a[0]]=a[1]; result=0
    elif name == 'JavaVM.GetEnv': uc.mem_write(a[1],struct.pack('<Q',0x60003000)); result=0
    elif name == 'JNI.GetVersion': result=0x10006
    elif name == 'JNI.FindClass':
        log(kind='jni_class',name=cstr(a[1]).decode(errors='replace')); result=0x60004000
    elif name in ('JNI.GetMethodID','JNI.GetStaticMethodID'):
        method=cstr(a[2]).decode(errors='replace'); signature=cstr(a[3]).decode(errors='replace')
        result=0x60005000+len(jni_methods)*16; jni_methods[result]=(method,signature)
        log(kind='jni_method',method=method,signature=signature,handle=hex(result))
    elif name == 'JNI.CallStaticObjectMethodV' and jni_methods.get(a[2],('',))[0] in ('currentApplication','currentActivityThread'):
        log(kind='synthetic_java',method=jni_methods[a[2]][0]); result=0x60006000
    elif name == 'JNI.NewGlobalRef': result=a[1]
    elif name == 'JNI.NewObjectV':
        log(kind='synthetic_java',method='object constructor',signature=jni_methods.get(a[2])); result=0x60006700
    elif name == 'JNI.CallVoidMethodV' and jni_methods.get(a[2],('',))[0] in ('getRealSize','getSize','getMetrics','getRealMetrics'):
        log(kind='synthetic_java',method=jni_methods[a[2]][0]); result=0
    elif name == 'JNI.CallLongMethodV' and jni_methods.get(a[2],('',))[0]=='getLongVersionCode':
        result=18934; log(kind='synthetic_java',method='PackageInfo.getLongVersionCode',value=result)
    elif name == 'JNI.GetObjectClass': result=0x60004000
    elif name == 'JNI.CallObjectMethodV' and jni_methods.get(a[2],('',))[0]=='getPackageInfo':
        # Package-manager probes are anti-tamper checks. Only the target app is
        # present in the synthetic environment; known bypass packages fail as
        # Android's PackageManager would and leave an exception to clear.
        if last_jni_string == 'com.roblox.client':
            result=0x60006100
            log(kind='synthetic_java',method='getPackageInfo',package=last_jni_string,present=True)
        else:
            result=0; jni_exception=True
            log(kind='synthetic_java',method='getPackageInfo',package=last_jni_string,present=False)
    elif name == 'JNI.CallObjectMethodV' and jni_methods.get(a[2],('',))[0] in ('getApplication','getApplicationContext','getApplicationInfo','getContentResolver','getPackageManager'):
        log(kind='synthetic_java',method=jni_methods[a[2]][0]); result=0x60006100
    elif name == 'JNI.CallObjectMethodV' and jni_methods.get(a[2],('',))[0] in ('getExternalFilesDir','getFilesDir','getCacheDir'):
        log(kind='synthetic_java',method=jni_methods[a[2]][0]); result=0x60006400
    elif name == 'JNI.CallObjectMethodV' and jni_methods.get(a[2],('',))[0] in ('getSystemService','getDefaultDisplay','getWindow','getDecorView'):
        log(kind='synthetic_java',method=jni_methods[a[2]][0]); result=0x60006600
    elif name == 'JNI.CallObjectMethodV' and jni_methods.get(a[2],('',))[0]=='getDeclaredMethods':
        # Reflection is used to inspect the host Activity. An empty synthetic
        # list keeps the trace deterministic while exposing the fallback path.
        result=0x60006800
        log(kind='synthetic_java',method='Class.getDeclaredMethods',count=0)
    elif name == 'JNI.CallObjectMethodV' and jni_methods.get(a[2],('',))[0] in ('getAbsolutePath','getPath','getPackageName'):
        method=jni_methods[a[2]][0]
        value='com.roblox.client' if method=='getPackageName' else '/storage/emulated/0' if a[1]==0x60006500 else '/storage/emulated/0/Android/data/com.roblox.client/files'
        if method=='getPackageName': last_jni_string=value
        result=heap; raw=value.encode()+b'\0'; heap+=(len(raw)+15)&~15; uc.mem_write(result,raw)
        log(kind='synthetic_java',method=method,value=value)
    elif name in ('JNI.GetFieldID','JNI.GetStaticFieldID'):
        field=cstr(a[2]).decode(errors='replace'); signature=cstr(a[3]).decode(errors='replace')
        result=0x60007000+len(jni_fields)*16; jni_fields[result]=field
        log(kind='jni_field',field=field,signature=signature)
    elif name == 'JNI.GetStaticIntField' and jni_fields.get(a[2])=='SDK_INT':
        result=35; log(kind='synthetic_java_field',field='SDK_INT',value=35)
    elif name == 'JNI.GetIntField' and jni_fields.get(a[2]) in ('x','y','widthPixels','heightPixels','densityDpi'):
        field=jni_fields[a[2]]; result={'x':1080,'y':1920,'widthPixels':1080,'heightPixels':1920,'densityDpi':420}[field]
        log(kind='synthetic_java_field',field=field,value=result)
    elif name == 'JNI.GetObjectField':
        field=jni_fields.get(a[2])
        values={'nativeLibraryDir':str(SOURCE.parent),'sourceDir':'/workspace/targets/Delta-2.743.1136.apk','dataDir':'/data/user/0/com.roblox.client','versionName':'2.743.1136'}
        if field not in values: log(kind='blocked_java_field',field=field); uc.emu_stop(); return
        value=values[field].encode()+b'\0'; result=heap; heap+=(len(value)+15)&~15; uc.mem_write(result,value)
        log(kind='synthetic_java_field',field=field,value=values[field])
    elif name == 'JNI.GetStringUTFChars': result=a[1]
    elif name == 'JNI.ReleaseStringUTFChars': result=0
    elif name == 'JNI.GetArrayLength' and a[1]==0x60006800:
        result=0
        log(kind='synthetic_java_array',handle=hex(a[1]),length=0)
    elif name == 'JNI.RegisterNatives':
        methods=[]
        for i in range(min(a[3],100)):
            n,s,fn=struct.unpack('<QQQ',bytes(uc.mem_read(a[2]+i*24,24)))
            methods.append({'name':cstr(n).decode(errors='replace'),'signature':cstr(s).decode(errors='replace'),'address':hex(fn)})
        log(kind='jni_register',methods=methods); result=0
    elif name == 'JNI.ExceptionCheck': result=1 if jni_exception else 0
    elif name == 'JNI.ExceptionOccurred': result=0x60006900 if jni_exception else 0
    elif name == 'JNI.ExceptionClear': jni_exception=False; result=0
    elif name == 'JNI.DeleteLocalRef': result=0
    elif name == 'JNI.NewStringUTF':
        raw=cstr(a[1])+b'\0'; log(kind='jni_string',value=raw[:-1].decode(errors='replace'))
        last_jni_string=raw[:-1].decode(errors='replace')
        result=heap; heap+=(len(raw)+15)&~15; uc.mem_write(result,raw)
    elif name == 'JNI.CallStaticObjectMethodV' and jni_methods.get(a[2],('',))[0]=='getString':
        value=b'0000000000000000\0'; result=heap; heap+=32; uc.mem_write(result,value)
        log(kind='synthetic_java',method='Settings.Secure.getString',value=value[:-1].decode())
    elif name == 'JNI.CallStaticObjectMethodV' and jni_methods.get(a[2],('',))[0]=='get':
        result=heap; heap+=16; uc.mem_write(result,b'\0')
        log(kind='synthetic_java',method='SystemProperties.get',value='')
    elif name == 'JNI.CallStaticObjectMethodV' and jni_methods.get(a[2],('',))[0]=='getExternalStorageDirectory':
        result=0x60006500; log(kind='synthetic_java',method='Environment.getExternalStorageDirectory')
    elif name == 'pthread_create':
        log(kind='deferred_thread',entry=hex(a[2]),argument=hex(a[3]))
        uc.mem_write(a[0],struct.pack('<Q',1)); result=0
    elif name == 'pthread_detach': result=0
    elif name in ('sleep','usleep','nanosleep'):
        sleep_calls+=1
        if name=='nanosleep':
            sec,nsec=struct.unpack('<QQ',bytes(uc.mem_read(a[0],16))); duration=sec+nsec/1_000_000_000
        elif name=='usleep': duration=a[0]/1_000_000
        else: duration=a[0]
        log(kind='synthetic_sleep',function=name,seconds=duration,count=sleep_calls)
        if sleep_calls>10:
            log(kind='blocked_sleep_loop',function=name); uc.emu_stop(); return
        result=0
    elif name == 'dl_iterate_phdr':
        # Supply the ELF headers of only the two selected APK libraries.
        info=0x60008000; roblox=SOURCE.parent/'libroblox.so'; base=0x10000000
        if not getattr(external,'roblox_mapped',False):
            with roblox.open('rb') as rf:
                re=ELFFile(rf)
                loads=[s for s in re.iter_segments() if s['p_type']=='PT_LOAD']
                length=(max(s['p_vaddr']+s['p_memsz'] for s in loads)+4095)&~4095
                uc.mem_map(base,length)
                for seg in loads: uc.mem_write(base+seg['p_vaddr'],seg.data())
                external.roblox_phdr=(base+re['e_phoff'],re['e_phnum'])
            def prevent_roblox_execution(uc,address,size,data):
                log(kind='blocked_roblox_execution',address=hex(address)); uc.emu_stop()
            uc.hook_add(UC_HOOK_CODE,prevent_roblox_execution,begin=base,end=base+length-1)
            external.roblox_mapped=True
        uc.mem_write(0x60008100,str(SOURCE).encode()+b'\0')
        uc.mem_write(0x60008200,str(roblox).encode()+b'\0')
        iterate_state={'callback':a[0],'data':a[1],'return':uc.reg_read(UC_ARM64_REG_LR),'items':[(0,0x60008100,64,9),(base,0x60008200,*external.roblox_phdr)]}
        imports[0x50007ff0]='analysis.iterate_next'; uc.mem_write(0x50007ff0,bytes.fromhex('c0035fd6'))
        uc.reg_write(UC_ARM64_REG_X0,0)
        external(uc,0x50007ff0,4,None); return
    elif name == 'analysis.iterate_next':
        if a[0] or not iterate_state['items']:
            uc.reg_write(UC_ARM64_REG_PC,iterate_state['return']); iterate_state=None; return
        base,n,ph,num=iterate_state['items'].pop(0)
        uc.mem_write(0x60008000,struct.pack('<QQQH',base,n,ph,num)+bytes(38))
        uc.reg_write(UC_ARM64_REG_X0,0x60008000); uc.reg_write(UC_ARM64_REG_X1,64); uc.reg_write(UC_ARM64_REG_X2,iterate_state['data'])
        uc.reg_write(UC_ARM64_REG_LR,0x50007ff0); uc.reg_write(UC_ARM64_REG_PC,iterate_state['callback']); return
    else:
        log(kind='blocked_import',name=name); uc.emu_stop(); return
    uc.reg_write(UC_ARM64_REG_X0,result&((1<<64)-1))
    uc.reg_write(UC_ARM64_REG_PC,uc.reg_read(UC_ARM64_REG_LR))

def interrupt(uc, number, data):
    global heap, synthetic_ticks
    nr=uc.reg_read(UC_ARM64_REG_X8)
    args=[uc.reg_read(UC_ARM64_REG_X0+i) for i in range(6)]
    log(kind='syscall',number=nr,args=[hex(x) for x in args[:3]])
    if nr == 226: uc.reg_write(UC_ARM64_REG_X0,0)
    elif nr == 79:
        path=cstr(args[1]).decode(errors='replace'); log(kind='synthetic_stat_missing',path=path)
        uc.reg_write(UC_ARM64_REG_X0,(1<<64)-2)
    elif nr == 34:
        path=cstr(args[1]).decode(errors='replace'); log(kind='synthetic_mkdir',path=path)
        uc.reg_write(UC_ARM64_REG_X0,0)
    elif nr == 56:
        path=cstr(args[1]).decode(errors='replace'); log(kind='synthetic_open_missing',path=path)
        uc.reg_write(UC_ARM64_REG_X0,(1<<64)-2)
    elif nr == 222 and args[3]&0x20:
        n=(args[1]+4095)&~4095; heap=(heap+4095)&~4095
        if heap+n>0x41000000: raise RuntimeError('Mapping budget exceeded')
        uc.reg_write(UC_ARM64_REG_X0,heap); heap+=n
    elif nr == 215: uc.reg_write(UC_ARM64_REG_X0,0)
    elif nr == 113:
        synthetic_ticks+=1000000
        uc.mem_write(args[1],struct.pack('<QQ',1792576800+synthetic_ticks//1000000000,synthetic_ticks%1000000000))
        uc.reg_write(UC_ARM64_REG_X0,0)
    else: log(kind='blocked_syscall',number=nr); uc.emu_stop()

def invalid(uc, access, address, size, value, data):
    log(kind='invalid_memory',access=access,address=hex(address),pc=hex(uc.reg_read(UC_ARM64_REG_PC)))
    return False

u.hook_add(UC_HOOK_CODE, external, begin=0x50000000, end=0x5000ffff)
u.hook_add(UC_HOOK_INTR, interrupt)
u.hook_add(UC_HOOK_MEM_INVALID, invalid)
jni_mode='--jni' in sys.argv or '--start' in sys.argv or '--worker' in sys.argv
ctor_mode='--constructors' in sys.argv
if jni_mode:
    u.mem_write(0,(ROOT/'constructed-memory.bin').read_bytes())
    saved_heap=(ROOT/'constructors-heap.bin').read_bytes(); u.mem_write(0x40000000,saved_heap)
    heap=0x40000000+((len(saved_heap)+15)&~15)
    u.mem_write(0x60002000,struct.pack('<Q',0x60002100))
    u.mem_write(0x60003000,struct.pack('<Q',0x60003100))
    known={4:'GetVersion',6:'FindClass',15:'ExceptionOccurred',17:'ExceptionClear',21:'NewGlobalRef',23:'DeleteLocalRef',28:'NewObjectV',31:'GetObjectClass',33:'GetMethodID',35:'CallObjectMethodV',53:'CallLongMethodV',62:'CallVoidMethodV',94:'GetFieldID',95:'GetObjectField',100:'GetIntField',113:'GetStaticMethodID',115:'CallStaticObjectMethodV',144:'GetStaticFieldID',150:'GetStaticIntField',167:'NewStringUTF',169:'GetStringUTFChars',170:'ReleaseStringUTFChars',171:'GetArrayLength',215:'RegisterNatives',228:'ExceptionCheck'}
    for base,count,table in [(0x50008000,8,0x60002100),(0x50009000,240,0x60003100)]:
        for i in range(count):
            addr=base+i*16
            imports[addr]=('JavaVM.GetEnv' if i==6 else f'JavaVM.{i}') if count==8 else 'JNI.'+known.get(i,str(i))
            u.mem_write(addr,bytes.fromhex('c0035fd6')); u.mem_write(table+i*8,struct.pack('<Q',addr))
    u.reg_write(UC_ARM64_REG_X0,0x60002000); u.reg_write(UC_ARM64_REG_X1,0)
    jobs=[(0,0x1066788)]
    if '--start' in sys.argv: jobs.append((1,0x601084))
    if '--worker' in sys.argv: jobs.append((2,0x642c80))
    for arg in sys.argv:
        if arg.startswith('--entry='): jobs.append((2,int(arg.split('=',1)[1],0)))
elif ctor_mode:
    u.mem_write(0,(ROOT/'emulated-memory.bin').read_bytes())
    # Analyze application constant initialization separately from C++ locale
    # initialization. These results are partial synthetic observations.
    log(kind='skipped_initializers',indices=[1,2,3],reason='Host CPU and C++ locale setup are outside constant recovery')
    jobs=list(enumerate(constructors[4:],4))
else: jobs=[(0,start)]
for index,entry in jobs:
    if jni_mode and index==2: u.reg_write(UC_ARM64_REG_X0,0)
    if jni_mode and index==1:
        for reg,value in [(UC_ARM64_REG_X0,0x60003000),(UC_ARM64_REG_X1,0x60004000),(UC_ARM64_REG_X2,0x60006200),(UC_ARM64_REG_X3,0x60006300)]: u.reg_write(reg,value)
    u.reg_write(UC_ARM64_REG_SP,0x707f0000); u.reg_write(UC_ARM64_REG_LR,0x7fff0000)
    log(kind='start',index=index,address=hex(entry))
    for batch in range(1 if ctor_mode else 8):
        event_count=len(events)
        try:
            u.emu_start(entry if batch==0 else u.reg_read(UC_ARM64_REG_PC),0x7fff0000,timeout=2000000 if ctor_mode else 45000000,count=3000000 if ctor_mode else 200000000)
        except (UcError, RuntimeError) as exc:
            log(kind='error',message=str(exc)); break
        if u.reg_read(UC_ARM64_REG_PC)==0x7fff0000: break
        if any(e['kind'].startswith('blocked') or e['kind']=='invalid_memory' for e in events[event_count:]): break
        log(kind='budget_chunk',batch=batch,pc=hex(u.reg_read(UC_ARM64_REG_PC)))
    if u.reg_read(UC_ARM64_REG_PC)!=0x7fff0000: break
pc=u.reg_read(UC_ARM64_REG_PC)
log(kind='stop',pc=hex(pc),returned=pc==0x7fff0000,return_value=hex(u.reg_read(UC_ARM64_REG_X0)))
entry_args=[arg for arg in sys.argv if arg.startswith('--entry=')]
prefix=('entry-'+entry_args[-1].split('=',1)[1].lower().replace('0x','') if entry_args else
        'worker' if '--worker' in sys.argv else 'start' if '--start' in sys.argv else
        'jni' if jni_mode else 'constructors' if ctor_mode else 'initializer')
(ROOT/(prefix+'-emulation.json')).write_text(json.dumps(events,indent=2))
(ROOT/('jni-memory.bin' if jni_mode else 'constructed-memory.bin' if ctor_mode else 'emulated-memory.bin')).write_bytes(bytes(u.mem_read(0,0x1200000)))
(ROOT/(prefix+'-heap.bin')).write_bytes(bytes(u.mem_read(0x40000000,heap-0x40000000)))
(ROOT/'elf-segments.json').write_text(json.dumps(segments,indent=2))

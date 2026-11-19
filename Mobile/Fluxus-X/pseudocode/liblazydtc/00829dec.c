/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00829dec
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_00829dec(undefined8 param_1)

{
  long lVar1;
  int iVar2;
  undefined8 *puVar3;
  undefined1 *local_50;
  undefined8 uStack_48;
  undefined4 local_40;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  if (((DAT_00d1d240 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d1d240), iVar2 != 0)) {
    DAT_00d1d230 = 0xae1891188566c54e;
    _DAT_00d1d238 = 0x107;
    __cxa_atexit(&LAB_0082bad4,&DAT_00d1d230,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1d240);
  }
  if (DAT_00d1d239 == '\x01') {
    DAT_00d1d230 = DAT_00d1d230 ^ 0xcb7bff79f115ab07;
    _DAT_00d1d238 = (ushort)(DAT_00d1d238 ^ 7);
  }
  FUN_008acba4(param_1,0xffffd8ee,&DAT_00d1d230);
  if (((DAT_00d1d250 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d1d250), iVar2 != 0)) {
    DAT_00d1d24c = '\x01';
    DAT_00d1d248 = 0x9702f6fb;
    __cxa_atexit(&LAB_0082bae0,&DAT_00d1d248,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1d250);
  }
  if (DAT_00d1d24c == '\x01') {
    DAT_00d1d24c = '\0';
    DAT_00d1d248 = DAT_00d1d248 ^ 0x97759395;
  }
  FUN_008acba4(param_1,0xffffffff,&DAT_00d1d248);
  uStack_48 = 0xf8a7d22e4dd449ff;
  local_50 = (undefined1 *)0xd0a5d2164dd350c7;
  local_40 = 0x39d35cf6;
  if (((DAT_00d1d270 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d1d270), iVar2 != 0)) {
                    /* try { // try from 0082a83c to 0082a84b has its CatchHandler @ 0082ac54 */
    FUN_0082bae8(&DAT_00d1d258,&local_50);
    __cxa_atexit(&LAB_0082bb94,&DAT_00d1d258,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1d270);
  }
  FUN_0082c2ac(&DAT_00d1d258);
  FUN_008ac4a8(param_1,&DAT_00d1d258);
  iVar2 = FUN_008adea0(param_1,1,1,0);
  if (iVar2 == 0) {
    FUN_008aab40(param_1,0xfffffffe);
    DAT_00d1d150 = FUN_008ae664(param_1,0xffffffff);
    FUN_008aa994(param_1,0xfffffffe);
    if (((DAT_00d1d288 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d1d288), iVar2 != 0)) {
      DAT_00d1d284 = '\x01';
      DAT_00d1d278 = 0xef67bce4e82a9e24;
      DAT_00d1d280 = 0x9b2c822c;
      __cxa_atexit(&LAB_0082bba0,&DAT_00d1d278,&PTR_LOOP_00c48880);
      __cxa_guard_release(&DAT_00d1d288);
    }
    if (DAT_00d1d284 == '\x01') {
      DAT_00d1d284 = '\0';
      DAT_00d1d278 = DAT_00d1d278 ^ 0x9d178d819b5ff149;
      DAT_00d1d280 = DAT_00d1d280 ^ 0x9b5ff149;
    }
    FUN_008ac76c(param_1,&LAB_0082ac80,&DAT_00d1d278,0,0);
    puVar3 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
    local_50 = (undefined1 *)*puVar3;
    FUN_00807f14(&DAT_00d1d128,&local_50,&local_50);
    local_50 = &LAB_0082ac80;
    FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
    FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1d278);
    if (((DAT_00d1d2a0 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d1d2a0), iVar2 != 0)) {
      DAT_00d1d29e = '\x01';
      DAT_00d1d290 = 0xa3d148e287236ee;
      DAT_00d1d298 = 0x28663cef;
      _DAT_00d1d29c = 0x258e;
      __cxa_atexit(&LAB_0082bbac,&DAT_00d1d290,&PTR_LOOP_00c48880);
      __cxa_guard_release(&DAT_00d1d2a0);
    }
    if (DAT_00d1d29e == '\x01') {
      DAT_00d1d29e = '\0';
      DAT_00d1d290 = DAT_00d1d290 ^ 0x6f4f25eb5b075983;
      DAT_00d1d298 = DAT_00d1d298 ^ 0x5b075983;
      _DAT_00d1d29c = _DAT_00d1d29c ^ 0x25eb;
    }
    FUN_008ac76c(param_1,&LAB_0082ace0,&DAT_00d1d290,0,0);
    puVar3 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
    local_50 = (undefined1 *)*puVar3;
    FUN_00807f14(&DAT_00d1d128,&local_50,&local_50);
    local_50 = &LAB_0082ace0;
    FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
    FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1d290);
    if (((DAT_00d1d2b8 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d1d2b8), iVar2 != 0)) {
      DAT_00d1d2b4 = '\x01';
      DAT_00d1d2a8 = 0x83518d2436f4460e;
      DAT_00d1d2b0 = 0x45f25a06;
      __cxa_atexit(&LAB_0082bbb8,&DAT_00d1d2a8,&PTR_LOOP_00c48880);
      __cxa_guard_release(&DAT_00d1d2b8);
    }
    if (DAT_00d1d2b4 == '\x01') {
      DAT_00d1d2b4 = '\0';
      DAT_00d1d2a8 = DAT_00d1d2a8 ^ 0xf121bf4145812963;
      DAT_00d1d2b0 = DAT_00d1d2b0 ^ 0x45812963;
    }
    FUN_008ac76c(param_1,&LAB_0082ad40,&DAT_00d1d2a8,0,0);
    puVar3 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
    local_50 = (undefined1 *)*puVar3;
    FUN_00807f14(&DAT_00d1d128,&local_50,&local_50);
    local_50 = &LAB_0082ad40;
    FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
    FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1d2a8);
    if (((DAT_00d1d2d0 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d1d2d0), iVar2 != 0)) {
      DAT_00d1d2ce = '\x01';
      DAT_00d1d2c0 = 0xe41bfbea7828aa9a;
      DAT_00d1d2c8 = 0x783ca09b;
      DAT_00d1d2cc = 0xc9ea;
      __cxa_atexit(&LAB_0082bbc4,&DAT_00d1d2c0,&PTR_LOOP_00c48880);
      __cxa_guard_release(&DAT_00d1d2d0);
    }
    if (DAT_00d1d2ce == '\x01') {
      DAT_00d1d2ce = '\0';
      DAT_00d1d2c0 = DAT_00d1d2c0 ^ 0x8169c98f0b5dc5f7;
      DAT_00d1d2c8 = DAT_00d1d2c8 ^ 0xb5dc5f7;
      DAT_00d1d2cc = DAT_00d1d2cc ^ 0xc98f;
    }
    FUN_008ac76c(param_1,&LAB_0082ada0,&DAT_00d1d2c0,0,0);
    puVar3 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
    local_50 = (undefined1 *)*puVar3;
    FUN_00807f14(&DAT_00d1d128,&local_50,&local_50);
    local_50 = &LAB_0082ada0;
    FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
    FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1d2c0);
    if (((DAT_00d1d320 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d1d320), iVar2 != 0)) {
      DAT_00d1d31c = '\x01';
      DAT_00d1d310 = 0x300824ab440ccf6;
      DAT_00d1d318 = 0xc75ec0f2;
      __cxa_atexit(&LAB_0082bf78,&DAT_00d1d310,&PTR_LOOP_00c48880);
      __cxa_guard_release(&DAT_00d1d320);
    }
    if (DAT_00d1d31c == '\x01') {
      DAT_00d1d31c = '\0';
      DAT_00d1d310 = DAT_00d1d310 ^ 0x6f63b32fc735a39b;
      DAT_00d1d318 = DAT_00d1d318 ^ 0xc735a39b;
    }
    FUN_008ac76c(param_1,&LAB_0082ae00,&DAT_00d1d310,0,0);
    puVar3 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
    local_50 = (undefined1 *)*puVar3;
    FUN_00807f14(&DAT_00d1d128,&local_50,&local_50);
    local_50 = &LAB_0082ae00;
    FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
    FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1d310);
    if (((DAT_00d1d338 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d1d338), iVar2 != 0)) {
      DAT_00d1d334 = '\x01';
      DAT_00d1d328 = 0xbdba672eae80f8aa;
      DAT_00d1d330 = 0xdd9ef4ae;
      __cxa_atexit(&LAB_0082bf84,&DAT_00d1d328,&PTR_LOOP_00c48880);
      __cxa_guard_release(&DAT_00d1d338);
    }
    if (DAT_00d1d334 == '\x01') {
      DAT_00d1d334 = '\0';
      DAT_00d1d328 = DAT_00d1d328 ^ 0xd1d9554bddf597c7;
      DAT_00d1d330 = DAT_00d1d330 ^ 0xddf597c7;
    }
    FUN_008ac76c(param_1,&LAB_0082aecc,&DAT_00d1d328,0,0);
    puVar3 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
    local_50 = (undefined1 *)*puVar3;
    FUN_00807f14(&DAT_00d1d128,&local_50,&local_50);
    local_50 = &LAB_0082aecc;
    FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
    FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1d328);
    if (((DAT_00d1d380 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d1d380), iVar2 != 0)) {
      DAT_00d1d37c = '\x01';
      DAT_00d1d370 = 0xa1e2c2da0eecdec4;
      DAT_00d1d378 = 0x7df5ddc6;
      __cxa_atexit(&LAB_0082c098,&DAT_00d1d370,&PTR_LOOP_00c48880);
      __cxa_guard_release(&DAT_00d1d380);
    }
    if (DAT_00d1d37c == '\x01') {
      DAT_00d1d37c = '\0';
      DAT_00d1d370 = DAT_00d1d370 ^ 0xd381b1bf7d99b1a9;
      DAT_00d1d378 = DAT_00d1d378 ^ 0x7d99b1a9;
    }
    FUN_008ac76c(param_1,&LAB_0082af44,&DAT_00d1d370,0,0);
    puVar3 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
    local_50 = (undefined1 *)*puVar3;
    FUN_00807f14(&DAT_00d1d128,&local_50,&local_50);
    local_50 = &LAB_0082af44;
    FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
    FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1d370);
    if (((DAT_00d1d398 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d1d398), iVar2 != 0)) {
      DAT_00d1d388 = 0xbb262a082abed406;
      DAT_00d1d390 = 0x2aa9da0e;
      _DAT_00d1d394 = 0x16d;
      __cxa_atexit(&LAB_0082c0a4,&DAT_00d1d388,&PTR_LOOP_00c48880);
      __cxa_guard_release(&DAT_00d1d398);
    }
    if (DAT_00d1d395 == '\x01') {
      _DAT_00d1d394 = (ushort)(DAT_00d1d394 ^ 0x6d);
      DAT_00d1d388 = DAT_00d1d388 ^ 0xcd49476d59cbbb6b;
      DAT_00d1d390 = DAT_00d1d390 ^ 0x59cbbb6b;
    }
    FUN_008ac76c(param_1,&LAB_0082b1b4,&DAT_00d1d388,0,0);
    puVar3 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
    local_50 = (undefined1 *)*puVar3;
    FUN_00807f14(&DAT_00d1d128,&local_50,&local_50);
    local_50 = &LAB_0082b1b4;
    FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
    FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1d388);
    if (((DAT_00d1d448 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d1d448), iVar2 != 0)) {
      DAT_00d1d438 = 0xcd8660bcba9076e0;
      DAT_00d1d440 = 0xa5806be8;
      _DAT_00d1d444 = 0x1d9;
      __cxa_atexit(&LAB_0082c1f4,&DAT_00d1d438,&PTR_LOOP_00c48880);
      __cxa_guard_release(&DAT_00d1d448);
    }
    if (DAT_00d1d445 == '\x01') {
      _DAT_00d1d444 = (ushort)(DAT_00d1d444 ^ 0xd9);
      DAT_00d1d438 = DAT_00d1d438 ^ 0xbbe90dd9c9e5198d;
      DAT_00d1d440 = DAT_00d1d440 ^ 0xc9e5198d;
    }
    FUN_008ac76c(param_1,&LAB_0082b20c,&DAT_00d1d438,0,0);
    puVar3 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
    local_50 = (undefined1 *)*puVar3;
    FUN_00807f14(&DAT_00d1d128,&local_50,&local_50);
    local_50 = &LAB_0082b20c;
    FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
    FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1d438);
  }
  else {
    FUN_008ab8a4(param_1,0xffffffff,0);
    FUN_008aa994(param_1,0xfffffffd);
  }
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}


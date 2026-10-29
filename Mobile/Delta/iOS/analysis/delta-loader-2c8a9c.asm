function 0x2c8a9c..0x2c8dfc (864 bytes)
002c8a9c  stp      x28, x27, [sp, #-0x20]!
002c8aa0  stp      x29, x30, [sp, #0x10]
002c8aa4  add      x29, sp, #0x10
002c8aa8  sub      sp, sp, #0x510
002c8aac  adrp     x8, #0xe5c000
002c8ab0  ldr      x8, [x8, #0xd8]
002c8ab4  ldr      x8, [x8]
002c8ab8  stur     x8, [x29, #-0x18]
002c8abc  mov      x8, sp
002c8ac0  str      x8, [sp, #8]
002c8ac4  add      x8, sp, #8
002c8ac8  str      x8, [sp]
002c8acc  adrp     x8, #0x2c8000
002c8ad0  add      x8, x8, #0xa9c
002c8ad4  mov      x9, #0xbeef
002c8ad8  movk     x9, #0xdead, lsl #16
002c8adc  adrp     x10, #0xe7c000
002c8ae0  add      x10, x10, #0xce0
002c8ae4  mov      x11, #0x48
002c8ae8  add      x11, x10, x11
002c8aec  mov      x12, #0x10
002c8af0  add      x10, x10, x12
002c8af4  cmp      x8, x9
002c8af8  csel     x8, x11, x10, eq
002c8afc  ldr      x8, [x8]
002c8b00  br       x8
002c8b04  mov      x0, #0
002c8b08  add      x1, sp, #0xe8
002c8b0c  bl       #0xc7aaa8 ; _dladdr
002c8b10  adrp     x8, #0xf11000
002c8b14  add      x8, x8, #0xc58
002c8b18  ldr      x8, [x8, #8]
002c8b1c  adrp     x9, #0xe7c000
002c8b20  add      x9, x9, #0xce0
002c8b24  mov      x10, #0x18
002c8b28  add      x10, x9, x10
002c8b2c  mov      x11, #0x38
002c8b30  add      x9, x9, x11
002c8b34  cmp      x8, #0
002c8b38  csel     x8, x10, x9, ne
002c8b3c  ldr      x8, [x8]
002c8b40  br       x8
002c8b44  adrp     x8, #0xf11000
002c8b48  add      x8, x8, #0xc58
002c8b4c  ldr      x0, [x8, #8]
002c8b50  add      x1, sp, #0xe7
002c8b54  mov      x2, #1
002c8b58  mov      x3, #0
002c8b5c  bl       #0xc7ae74 ; _pread
002c8b60  adrp     x8, #0xf11000
002c8b64  add      x8, x8, #0xc58
002c8b68  str      x0, [x8, #8]
002c8b6c  mov      w0, #0x1d
002c8b70  bl       #0xc7b21c ; _sysconf
002c8b74  adrp     x8, #0xf11000
002c8b78  add      x8, x8, #0xc58
002c8b7c  str      x0, [x8, #0x10]
002c8b80  mov      w0, #0xb
002c8b84  mov      x1, #0
002c8b88  bl       #0xc7b0c0 ; _signal
002c8b8c  bl       #0xc7a94c ; __dyld_image_count
002c8b90  adrp     x8, #0xe7c000
002c8b94  add      x8, x8, #0xce0
002c8b98  mov      x9, #0x50
002c8b9c  add      x9, x8, x9
002c8ba0  mov      x10, #0x68
002c8ba4  add      x8, x8, x10
002c8ba8  cmp      w0, #1
002c8bac  csel     x8, x9, x8, hi
002c8bb0  ldr      x8, [x8]
002c8bb4  br       x8
002c8bb8  mov      w0, #1
002c8bbc  bl       #0xc7a934 ; __dyld_get_image_name
002c8bc0  str      x0, [sp, #0xd8]
002c8bc4  mov      w0, #1
002c8bc8  bl       #0xc7a940 ; __dyld_get_image_vmaddr_slide
002c8bcc  and      w8, w0, #0xff
002c8bd0  strb     w8, [sp, #0xd7]
002c8bd4  mov      x0, #0x10000
002c8bd8  bl       #0xc7ad48 ; _malloc
002c8bdc  str      x0, [sp, #0xc8]
002c8be0  ldr      x0, [sp, #0xc8]
002c8be4  bl       #0xc7ab98 ; _free
002c8be8  adrp     x0, #0xc82000
002c8bec  add      x0, x0, #0x314 ; '/hi'
002c8bf0  mov      w1, #0
002c8bf4  bl       #0xc7ae20 ; _open
002c8bf8  str      w0, [sp, #0xc4]
002c8bfc  ldr      w8, [sp, #0xc4]
002c8c00  adrp     x9, #0xe7c000
002c8c04  add      x9, x9, #0xce0
002c8c08  mov      x10, #0x58
002c8c0c  add      x10, x9, x10
002c8c10  mov      x11, #0x20
002c8c14  add      x9, x9, x11
002c8c18  cmp      w8, #0
002c8c1c  csel     x8, x10, x9, gt
002c8c20  ldr      x8, [x8]
002c8c24  br       x8
002c8c28  add      x0, sp, #0x108
002c8c2c  mov      w1, #0x400
002c8c30  mov      x2, #0
002c8c34  bl       #0xc7ab38 ; _fgets
002c8c38  adrp     x8, #0xe7c000
002c8c3c  add      x8, x8, #0xce0
002c8c40  mov      x9, #0x28
002c8c44  add      x9, x8, x9
002c8c48  mov      x10, #0x60
002c8c4c  add      x8, x8, x10
002c8c50  cmp      x0, #0
002c8c54  csel     x8, x9, x8, ne
002c8c58  ldr      x8, [x8]
002c8c5c  br       x8
002c8c60  adrp     x8, #0xc7c000
002c8c64  add      x0, x8, #0x2f0 ; '/'
002c8c68  add      x1, sp, #0x30
002c8c6c  bl       #0xc7b114 ; _stat
002c8c70  adrp     x8, #0xf11000
002c8c74  add      x8, x8, #0xc58
002c8c78  str      w0, [x8]
002c8c7c  b        #0x2c8c28
002c8c80  adrp     x8, #0xc82000
002c8c84  add      x0, x8, #0x318 ; 'libstuff.so'
002c8c88  mov      w1, #2
002c8c8c  bl       #0xc7aacc ; _dlopen
002c8c90  str      x0, [sp, #0x28]
002c8c94  ldr      x8, [sp, #0x28]
002c8c98  adrp     x9, #0xe7c000
002c8c9c  add      x9, x9, #0xce0
002c8ca0  mov      x10, #0x70
002c8ca4  add      x10, x9, x10
002c8ca8  cmp      x8, #0
002c8cac  csel     x8, x10, x9, ne
002c8cb0  ldr      x8, [x8]
002c8cb4  br       x8
002c8cb8  ldr      x0, [sp, #0x28]
002c8cbc  adrp     x8, #0xc82000
002c8cc0  add      x1, x8, #0x324 ; 'init'
002c8cc4  bl       #0xc7aad8 ; _dlsym
002c8cc8  str      x0, [sp, #0x20]
002c8ccc  adrp     x8, #0xc82000
002c8cd0  add      x0, x8, #0x314 ; '/hi'
002c8cd4  mov      w8, #0x1c0
002c8cd8  uxth     w1, w8
002c8cdc  bl       #0xc7a9e8 ; _chmod
002c8ce0  ldr      w0, [sp, #0xc4]
002c8ce4  bl       #0xc7aa0c ; _close
002c8ce8  adrp     x8, #0xe7c000
002c8cec  add      x8, x8, #0xce0
002c8cf0  mov      x9, #0x30
002c8cf4  add      x9, x8, x9
002c8cf8  mov      x10, #0x40
002c8cfc  add      x8, x8, x10
002c8d00  cmp      w0, #0
002c8d04  csel     x8, x9, x8, ne
002c8d08  ldr      x8, [x8]
002c8d0c  br       x8
002c8d10  adrp     x8, #0xf11000
002c8d14  add      x8, x8, #0xc58
002c8d18  ldr      x1, [x8, #0x10]
002c8d1c  mov      x0, #0
002c8d20  mov      w2, #0
002c8d24  mov      w3, #0
002c8d28  mov      w4, #0
002c8d2c  mov      x5, #0
002c8d30  bl       #0xc7ada8 ; _mmap
002c8d34  str      x0, [sp, #0x18]
002c8d38  ldr      x0, [sp, #0x18]
002c8d3c  adrp     x8, #0xf11000
002c8d40  add      x8, x8, #0xc58
002c8d44  ldr      x1, [x8, #0x10]
002c8d48  mov      w2, #7
002c8d4c  bl       #0xc7adb4 ; _mprotect
002c8d50  b        #0x2c8d80
002c8d54  bl       #0xc7aac0 ; _dlerror
002c8d58  str      x0, [sp, #0x10]
002c8d5c  ldr      x0, [sp, #0x10]
002c8d60  adrp     x8, #0xf11000
002c8d64  add      x8, x8, #0xc58
002c8d68  ldr      x1, [x8, #0x10]
002c8d6c  mov      w2, #0
002c8d70  mov      w3, #0
002c8d74  mov      w4, #0
002c8d78  mov      x5, #0
002c8d7c  bl       #0xc7ada8 ; _mmap
002c8d80  ldur     x8, [x29, #-0x18]
002c8d84  adrp     x9, #0xe5c000
002c8d88  ldr      x9, [x9, #0xd8]
002c8d8c  ldr      x9, [x9]
002c8d90  subs     x8, x9, x8
002c8d94  b.ne     #0x2c8d9c
002c8d98  b        #0x2c8da0
002c8d9c  bl       #0xc7a904 ; ___stack_chk_fail
002c8da0  add      sp, sp, #0x510
002c8da4  ldp      x29, x30, [sp, #0x10]
002c8da8  ldp      x28, x27, [sp], #0x20
002c8dac  ret      
002c8db0  adrp     x8, #0xf01000
002c8db4  ldrb     w9, [x8, #0x328]
002c8db8  tbnz     w9, #0, #0x2c8e78
002c8dbc  mov      w9, #1
002c8dc0  strb     w9, [x8, #0x328]
002c8dc4  adrp     x8, #0xf01000
002c8dc8  add      x8, x8, #0x348
002c8dcc  eor      x9, x8, x8, lsr #33
002c8dd0  mov      x10, #0x8ccd
002c8dd4  movk     x10, #0xed55, lsl #16
002c8dd8  movk     x10, #0xafd7, lsl #32
002c8ddc  movk     x10, #0xff51, lsl #48
002c8de0  mul      x9, x9, x10
002c8de4  eor      x10, x9, x9, lsr #29
002c8de8  adrp     x11, #0xf01000
002c8dec  strh     w10, [x11, #0x34a]
002c8df0  lsr      x12, x10, #0x10
002c8df4  adrp     x13, #0xf01000
002c8df8  strh     w12, [x13, #0x34c]

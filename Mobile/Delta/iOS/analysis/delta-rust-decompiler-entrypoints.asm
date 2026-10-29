function 0xb6c688..0xb6cb88 (1280 bytes)
00b6c688  sub      sp, sp, #0x30
00b6c68c  stp      x20, x19, [sp, #0x10]
00b6c690  stp      x29, x30, [sp, #0x20]
00b6c694  add      x29, sp, #0x20
00b6c698  mov      x19, x1
00b6c69c  mov      x20, x0
00b6c6a0  ldp      x0, x8, [x1]
00b6c6a4  ldr      x8, [x8, #0x18]
00b6c6a8  adrp     x1, #0xe07000
00b6c6ac  add      x1, x1, #0x305
00b6c6b0  mov      w2, #6
00b6c6b4  blr      x8
00b6c6b8  str      x19, [sp]
00b6c6bc  strb     w0, [sp, #8]
00b6c6c0  strb     wzr, [sp, #9]
00b6c6c4  adrp     x1, #0xe0e000
00b6c6c8  add      x1, x1, #0xdb4
00b6c6cc  adrp     x4, #0xb6c000
00b6c6d0  add      x4, x4, #0x764
00b6c6d4  mov      x0, sp
00b6c6d8  mov      w2, #4
00b6c6dc  mov      x3, x20
00b6c6e0  bl       #0xbe9174
00b6c6e4  ldrb     w9, [sp, #9]
00b6c6e8  ldrb     w8, [sp, #8]
00b6c6ec  orr      w0, w9, w8
00b6c6f0  cmp      w9, #1
00b6c6f4  b.ne     #0xb6c738
00b6c6f8  tbnz     w8, #0, #0xb6c738
00b6c6fc  ldr      x8, [sp]
00b6c700  ldrb     w9, [x8, #0x12]
00b6c704  tbnz     w9, #7, #0xb6c720
00b6c708  ldp      x0, x8, [x8]
00b6c70c  ldr      x8, [x8, #0x18]
00b6c710  adrp     x1, #0xe0a000
00b6c714  add      x1, x1, #0x2bd
00b6c718  mov      w2, #2
00b6c71c  b        #0xb6c734
00b6c720  ldp      x0, x8, [x8]
00b6c724  ldr      x8, [x8, #0x18]
00b6c728  adrp     x1, #0xe0a000
00b6c72c  add      x1, x1, #0x28c
00b6c730  mov      w2, #1
00b6c734  blr      x8
00b6c738  and      w0, w0, #1
00b6c73c  ldp      x29, x30, [sp, #0x20]
00b6c740  ldp      x20, x19, [sp, #0x10]
00b6c744  add      sp, sp, #0x30
00b6c748  ret      
00b6c74c  ldp      x0, x8, [x1]
00b6c750  ldr      x3, [x8, #0x18]
00b6c754  adrp     x1, #0xe0d000
00b6c758  add      x1, x1, #0x9d5
00b6c75c  mov      w2, #5
00b6c760  br       x3
00b6c764  sub      sp, sp, #0x90
00b6c768  stp      x24, x23, [sp, #0x50]
00b6c76c  stp      x22, x21, [sp, #0x60]
00b6c770  stp      x20, x19, [sp, #0x70]
00b6c774  stp      x29, x30, [sp, #0x80]
00b6c778  add      x29, sp, #0x80
00b6c77c  mov      x20, x1
00b6c780  mov      x19, x0
00b6c784  add      x8, x0, #0x10
00b6c788  str      x8, [sp, #8]
00b6c78c  ldp      x21, x8, [x1]
00b6c790  ldr      x24, [x8, #0x18]
00b6c794  adrp     x1, #0xe07000
00b6c798  add      x1, x1, #0x41c
00b6c79c  mov      x0, x21
00b6c7a0  mov      w2, #9
00b6c7a4  blr      x24
00b6c7a8  mov      x8, x0
00b6c7ac  str      x20, [sp, #0x10]
00b6c7b0  mov      w22, #1
00b6c7b4  mov      w0, #1
00b6c7b8  tbnz     w8, #0, #0xb6c8d0
00b6c7bc  add      x23, x19, #0x18
00b6c7c0  ldrb     w8, [x20, #0x12]
00b6c7c4  tbnz     w8, #7, #0xb6c83c
00b6c7c8  adrp     x1, #0xe0a000
00b6c7cc  add      x1, x1, #0x2ba
00b6c7d0  mov      x0, x21
00b6c7d4  mov      w2, #3
00b6c7d8  blr      x24
00b6c7dc  tbnz     w0, #0, #0xb6c8cc
00b6c7e0  ldp      x0, x8, [x20]
00b6c7e4  ldr      x8, [x8, #0x18]
00b6c7e8  adrp     x1, #0xe07000
00b6c7ec  add      x1, x1, #0x425
00b6c7f0  mov      w2, #0xa
00b6c7f4  blr      x8
00b6c7f8  tbnz     w0, #0, #0xb6c8cc
00b6c7fc  ldp      x0, x8, [x20]
00b6c800  ldr      x8, [x8, #0x18]
00b6c804  adrp     x1, #0xe0a000
00b6c808  add      x1, x1, #0x281
00b6c80c  mov      w2, #2
00b6c810  blr      x8
00b6c814  tbnz     w0, #0, #0xb6c8cc
00b6c818  adrp     x8, #0xb81000
00b6c81c  add      x8, x8, #0x964
00b6c820  stp      x23, x8, [sp, #0x20]
00b6c824  ldp      x0, x1, [x20]
00b6c828  adrp     x2, #0xcba000
00b6c82c  add      x2, x2, #0xa6 ; '\nNodeIndex(�\x01)'
00b6c830  add      x3, sp, #0x20
00b6c834  bl       #0xbe769c
00b6c838  b        #0xb6c8d0
00b6c83c  adrp     x1, #0xe07000
00b6c840  add      x1, x1, #0xfbd
00b6c844  mov      x0, x21
00b6c848  mov      w2, #3
00b6c84c  blr      x24
00b6c850  mov      x8, x0
00b6c854  mov      w0, #1
00b6c858  tbnz     w8, #0, #0xb6c8d0
00b6c85c  strb     w0, [sp, #0x3f]
00b6c860  ldr      q0, [x20]
00b6c864  str      q0, [sp, #0x20]
00b6c868  add      x8, sp, #0x3f
00b6c86c  str      x8, [sp, #0x30]
00b6c870  adrp     x1, #0xe07000
00b6c874  add      x1, x1, #0x425
00b6c878  add      x0, sp, #0x20
00b6c87c  mov      w2, #0xa
00b6c880  bl       #0xbe8048
00b6c884  tbnz     w0, #0, #0xb6c8cc
00b6c888  adrp     x1, #0xe0a000
00b6c88c  add      x1, x1, #0x281
00b6c890  add      x0, sp, #0x20
00b6c894  mov      w2, #2
00b6c898  bl       #0xbe8048
00b6c89c  tbnz     w0, #0, #0xb6c8cc
00b6c8a0  adrp     x8, #0xb81000
00b6c8a4  add      x8, x8, #0x964
00b6c8a8  stp      x23, x8, [sp, #0x40]
00b6c8ac  adrp     x1, #0xefa000
00b6c8b0  add      x1, x1, #0x758
00b6c8b4  adrp     x2, #0xcba000
00b6c8b8  add      x2, x2, #0xa6 ; '\nNodeIndex(�\x01)'
00b6c8bc  add      x0, sp, #0x20
00b6c8c0  add      x3, sp, #0x40
00b6c8c4  bl       #0xbe769c
00b6c8c8  cbz      w0, #0xb6c988
00b6c8cc  mov      w0, #1
00b6c8d0  strb     w0, [sp, #0x18]
00b6c8d4  strb     w22, [sp, #0x19]
00b6c8d8  adrp     x1, #0xe07000
00b6c8dc  add      x1, x1, #0x42f
00b6c8e0  adrp     x4, #0xc03000
00b6c8e4  add      x4, x4, #0xb40
00b6c8e8  add      x0, sp, #0x10
00b6c8ec  mov      w2, #5
00b6c8f0  mov      x3, x19
00b6c8f4  bl       #0xbe9174
00b6c8f8  adrp     x1, #0xe0e000
00b6c8fc  add      x1, x1, #0xd68
00b6c900  adrp     x4, #0xb81000
00b6c904  add      x4, x4, #0x2ec
00b6c908  add      x0, sp, #0x10
00b6c90c  add      x3, sp, #8
00b6c910  mov      w2, #4
00b6c914  bl       #0xbe9174
00b6c918  ldrb     w9, [sp, #0x19]
00b6c91c  ldrb     w8, [sp, #0x18]
00b6c920  orr      w0, w9, w8
00b6c924  cmp      w9, #1
00b6c928  b.ne     #0xb6c96c
00b6c92c  tbnz     w8, #0, #0xb6c96c
00b6c930  ldr      x8, [sp, #0x10]
00b6c934  ldrb     w9, [x8, #0x12]
00b6c938  tbnz     w9, #7, #0xb6c954
00b6c93c  ldp      x0, x8, [x8]
00b6c940  ldr      x8, [x8, #0x18]
00b6c944  adrp     x1, #0xe0a000
00b6c948  add      x1, x1, #0x2bd
00b6c94c  mov      w2, #2
00b6c950  b        #0xb6c968
00b6c954  ldp      x0, x8, [x8]
00b6c958  ldr      x8, [x8, #0x18]
00b6c95c  adrp     x1, #0xe0a000
00b6c960  add      x1, x1, #0x28c
00b6c964  mov      w2, #1
00b6c968  blr      x8
00b6c96c  and      w0, w0, #1
00b6c970  ldp      x29, x30, [sp, #0x80]
00b6c974  ldp      x20, x19, [sp, #0x70]
00b6c978  ldp      x22, x21, [sp, #0x60]
00b6c97c  ldp      x24, x23, [sp, #0x50]
00b6c980  add      sp, sp, #0x90
00b6c984  ret      
00b6c988  adrp     x1, #0xe07000
00b6c98c  add      x1, x1, #0xfc0
00b6c990  add      x0, sp, #0x20
00b6c994  mov      w2, #2
00b6c998  bl       #0xbe8048
00b6c99c  b        #0xb6c8d0
00b6c9a0  stp      x22, x21, [sp, #-0x30]!
00b6c9a4  stp      x20, x19, [sp, #0x10]
00b6c9a8  stp      x29, x30, [sp, #0x20]
00b6c9ac  add      x29, sp, #0x20
00b6c9b0  ldr      x19, [x0, #0x10]
00b6c9b4  mov      w8, #2
00b6c9b8  cmp      w1, #0x10, lsl #12
00b6c9bc  mov      w9, #3
00b6c9c0  cinc     x9, x9, hs
00b6c9c4  cmp      w1, #0x800
00b6c9c8  csel     x8, x8, x9, lo
00b6c9cc  cmp      w1, #0x80
00b6c9d0  csinc    x20, x8, xzr, hs
00b6c9d4  ldr      x8, [x0]
00b6c9d8  sub      x8, x8, x19
00b6c9dc  cmp      x20, x8
00b6c9e0  b.hi     #0xb6c9fc
00b6c9e4  ldr      x9, [x0, #8]
00b6c9e8  add      x8, x9, x19
00b6c9ec  cmp      w1, #0x80
00b6c9f0  b.hs     #0xb6ca34
00b6c9f4  strb     w1, [x8]
00b6c9f8  b        #0xb6caa0
00b6c9fc  mov      x21, x0
00b6ca00  mov      x22, x1
00b6ca04  mov      x1, x19
00b6ca08  mov      x2, x20
00b6ca0c  mov      w3, #1
00b6ca10  mov      w4, #1
00b6ca14  bl       #0xc6c0cc
00b6ca18  mov      x1, x22
00b6ca1c  mov      x0, x21
00b6ca20  ldr      x8, [x21, #0x10]
00b6ca24  ldr      x9, [x21, #8]
00b6ca28  add      x8, x9, x8
00b6ca2c  cmp      w1, #0x80
00b6ca30  b.lo     #0xb6c9f4
00b6ca34  mov      w10, #-0x80
00b6ca38  mov      w9, #-0x80
00b6ca3c  bfxil    w9, w1, #0, #6
00b6ca40  cmp      w1, #0x800
00b6ca44  b.hs     #0xb6ca5c
00b6ca48  lsr      w10, w1, #6
00b6ca4c  orr      w10, w10, #0xc0
00b6ca50  strb     w10, [x8]
00b6ca54  strb     w9, [x8, #1]
00b6ca58  b        #0xb6caa0
00b6ca5c  mov      w11, #-0x80
00b6ca60  bfxil    w11, w1, #6, #6
00b6ca64  lsr      w12, w1, #0x10
00b6ca68  cbnz     w12, #0xb6ca84
00b6ca6c  lsr      w10, w1, #0xc
00b6ca70  orr      w10, w10, #0xe0
00b6ca74  strb     w10, [x8]
00b6ca78  strb     w11, [x8, #1]
00b6ca7c  strb     w9, [x8, #2]
00b6ca80  b        #0xb6caa0
00b6ca84  lsr      w12, w1, #0x12
00b6ca88  orr      w12, w12, #0xfffffff0
00b6ca8c  strb     w12, [x8]
00b6ca90  bfxil    w10, w1, #0xc, #6
00b6ca94  strb     w10, [x8, #1]
00b6ca98  strb     w11, [x8, #2]
00b6ca9c  strb     w9, [x8, #3]
00b6caa0  add      x8, x20, x19
00b6caa4  str      x8, [x0, #0x10]
00b6caa8  mov      w0, #0
00b6caac  ldp      x29, x30, [sp, #0x20]
00b6cab0  ldp      x20, x19, [sp, #0x10]
00b6cab4  ldp      x22, x21, [sp], #0x30
00b6cab8  ret      
00b6cabc  stp      x22, x21, [sp, #-0x30]!
00b6cac0  stp      x20, x19, [sp, #0x10]
00b6cac4  stp      x29, x30, [sp, #0x20]
00b6cac8  add      x29, sp, #0x20
00b6cacc  mov      x19, x2
00b6cad0  mov      x20, x0
00b6cad4  ldr      x21, [x0, #0x10]
00b6cad8  ldr      x8, [x0]
00b6cadc  sub      x8, x8, x21
00b6cae0  cmp      x2, x8
00b6cae4  b.hi     #0xb6cb18
00b6cae8  cbz      x19, #0xb6cafc
00b6caec  ldr      x8, [x20, #8]
00b6caf0  add      x0, x8, x21
00b6caf4  mov      x2, x19
00b6caf8  bl       #0xc7ad6c ; _memcpy
00b6cafc  add      x8, x21, x19
00b6cb00  str      x8, [x20, #0x10]
00b6cb04  mov      w0, #0
00b6cb08  ldp      x29, x30, [sp, #0x20]
00b6cb0c  ldp      x20, x19, [sp, #0x10]
00b6cb10  ldp      x22, x21, [sp], #0x30
00b6cb14  ret      
00b6cb18  mov      x0, x20
00b6cb1c  mov      x22, x1
00b6cb20  mov      x1, x21
00b6cb24  mov      x2, x19
00b6cb28  mov      w3, #1
00b6cb2c  mov      w4, #1
00b6cb30  bl       #0xc6c0cc
00b6cb34  mov      x1, x22
00b6cb38  ldr      x21, [x20, #0x10]
00b6cb3c  b        #0xb6caec
00b6cb40  stp      x29, x30, [sp, #-0x10]!
00b6cb44  mov      x29, sp
00b6cb48  ldp      x8, x9, [x1]
00b6cb4c  ldp      w12, w10, [x1, #0x14]
00b6cb50  ldr      x16, [x1, #0x20]
00b6cb54  mov      w17, #0x30
00b6cb58  mov      x2, #-0x8000000000000000
00b6cb5c  mov      w3, #0x108
00b6cb60  ldr      w11, [x1, #0x10]
00b6cb64  cmp      x9, x11
00b6cb68  b.ls     #0xb6cb80
00b6cb6c  madd     x13, x11, x17, x8
00b6cb70  ldr      w11, [x13, #0x20]
00b6cb74  str      w11, [x1, #0x10]
00b6cb78  ldr      w13, [x13, #0x2c]
00b6cb7c  b        #0xb6cb9c
00b6cb80  cmp      x9, x12
00b6cb84  b.ls     #0xb6cc70
function 0xb6cca8..0xb6d1a8 (1280 bytes)
00b6cca8  stp      x28, x27, [sp, #-0x60]!
00b6ccac  stp      x26, x25, [sp, #0x10]
00b6ccb0  stp      x24, x23, [sp, #0x20]
00b6ccb4  stp      x22, x21, [sp, #0x30]
00b6ccb8  stp      x20, x19, [sp, #0x40]
00b6ccbc  stp      x29, x30, [sp, #0x50]
00b6ccc0  add      x29, sp, #0x50
00b6ccc4  sub      sp, sp, #0x6c0
00b6ccc8  str      xzr, [sp]
00b6cccc  mov      x23, #0
00b6ccd0  cbz      x0, #0xb717b0
00b6ccd4  cbz      x1, #0xb717b0
00b6ccd8  mov      x10, x2
00b6ccdc  add      x28, sp, #0x600
00b6cce0  add      x21, sp, #0x4f0
00b6cce4  add      x27, sp, #0x1f0
00b6cce8  mov      x19, x0
00b6ccec  ldrb     w8, [x19], #1
00b6ccf0  sub      x2, x1, #1
00b6ccf4  strb     w8, [sp, #0x1d8]
00b6ccf8  cbz      w8, #0xb6cd44
00b6ccfc  sub      w8, w8, #4
00b6cd00  cmp      w8, #6
00b6cd04  b.hs     #0xb6eb5c
00b6cd08  cbz      x2, #0xb6cd6c
00b6cd0c  ldrb     w11, [x0, #1]
00b6cd10  cmp      w11, #3
00b6cd14  b.hi     #0xb6eb9c
00b6cd18  sub      x23, x1, #2
00b6cd1c  cmp      x1, #2
00b6cd20  b.ne     #0xb6ce10
00b6cd24  mov      x21, #0
00b6cd28  mov      w19, #1
00b6cd2c  mov      w24, #0x2f
00b6cd30  mov      x22, #0
00b6cd34  movi     v0.16b, #0
00b6cd38  fneg     v0.2d, v0.2d
00b6cd3c  mov      v0.d[1], x21
00b6cd40  b        #0xb6cd80
00b6cd44  add      x0, sp, #0x4f0
00b6cd48  mov      x1, x19
00b6cd4c  bl       #0xb71bb0
00b6cd50  ldr      x22, [sp, #0x4f8]
00b6cd54  ldr      x23, [sp, #0x500]
00b6cd58  tbz      x23, #0x3f, #0xb6d0ec
00b6cd5c  mov      x0, #0
00b6cd60  mov      x1, x23
00b6cd64  bl       #0xc6b970
00b6cd68  b        #0xb717dc
00b6cd6c  mov      x22, #0
00b6cd70  mov      x23, #0
00b6cd74  adrp     x8, #0xe0e000
00b6cd78  ldr      q0, [x8, #0x940]
00b6cd7c  mov      w24, #0x17
00b6cd80  fmov     x9, d0
00b6cd84  mov      x20, v0.d[1]
00b6cd88  and      x10, x24, #0xff
00b6cd8c  orr      x10, x22, x10
00b6cd90  mov      x11, #-0x8000000000000000
00b6cd94  cmp      x9, x11
00b6cd98  b.eq     #0xb6cda8
00b6cd9c  mov      x11, #-0x7fffffffffffffff
00b6cda0  cmp      x9, x11
00b6cda4  b.ne     #0xb6d168
00b6cda8  add      x8, sp, #0x4f0
00b6cdac  add      x8, x8, #8
00b6cdb0  str      x20, [sp, #0x4f0]
00b6cdb4  str      x19, [sp, #0x4f8]
00b6cdb8  str      x23, [sp, #0x500]
00b6cdbc  str      x10, [sp, #0x508]
00b6cdc0  mov      w9, #1
00b6cdc4  stp      xzr, x9, [sp, #0x1f0]
00b6cdc8  str      xzr, [sp, #0x200]
00b6cdcc  cbz      x20, #0xb6d12c
00b6cdd0  adrp     x9, #0xc0e000
00b6cdd4  add      x9, x9, #0x1b8
00b6cdd8  cmp      x20, #1
00b6cddc  b.ne     #0xb6d574
00b6cde0  str      x8, [sp, #0x3c0]
00b6cde4  add      x8, sp, #0x3c0
00b6cde8  str      x8, [sp, #0x460]
00b6cdec  str      x9, [sp, #0x468]
00b6cdf0  adrp     x1, #0xefb000
00b6cdf4  add      x1, x1, #0x3b0
00b6cdf8  adrp     x2, #0xcb9000
00b6cdfc  add      x2, x2, #0xae2 ; '\x0fParsing Error: �'
00b6ce00  add      x0, sp, #0x1f0
00b6ce04  add      x3, sp, #0x460
00b6ce08  bl       #0xbe769c
00b6ce0c  b        #0xb6d5a0
00b6ce10  add      x19, x0, #2
00b6ce14  ldrsb    w9, [x0, #2]
00b6ce18  tbnz     w9, #0x1f, #0xb6d62c
00b6ce1c  str      w10, [sp, #0xf0]
00b6ce20  mov      x10, #0
00b6ce24  mov      x8, #0
00b6ce28  mov      w0, #1
00b6ce2c  subs     x24, x23, x0
00b6ce30  b.lo     #0xb6d658
00b6ce34  add      x22, x19, x0
00b6ce38  sxtw     x9, w9
00b6ce3c  lsl      x9, x9, x10
00b6ce40  orr      x28, x9, x8
00b6ce44  cmp      x28, #0xaaa
00b6ce48  mov      w8, #0xaaa
00b6ce4c  csel     x20, x28, x8, lo
00b6ce50  cbz      x28, #0xb6d688
00b6ce54  str      w11, [sp, #0x118]
00b6ce58  str      x28, [sp, #0xe8]
00b6ce5c  mov      x28, x22
00b6ce60  add      x8, x20, x20, lsl #1
00b6ce64  lsl      x19, x8, #3
00b6ce68  mov      x0, x19
00b6ce6c  bl       #0xc7ad48 ; _malloc
00b6ce70  cbz      x0, #0xb70c84
00b6ce74  mov      x12, x0
00b6ce78  mov      x26, #0
00b6ce7c  mov      x22, #0
00b6ce80  str      x20, [sp, #0x4f0]
00b6ce84  str      x0, [sp, #0x4f8]
00b6ce88  mov      w19, #1
00b6ce8c  mov      w23, #2
00b6ce90  str      xzr, [sp, #0x500]
00b6ce94  cbz      x24, #0xb6e958
00b6ce98  mov      x1, x24
00b6ce9c  ldrsb    w8, [x28]
00b6cea0  and      x9, x8, #0xff
00b6cea4  tbnz     w8, #0x1f, #0xb6ceb8
00b6cea8  mov      x10, #0
00b6ceac  mov      x8, #0
00b6ceb0  mov      w0, #1
00b6ceb4  b        #0xb6d00c
00b6ceb8  cmp      x1, #1
00b6cebc  b.eq     #0xb6ea30
00b6cec0  and      x8, x9, #0x7f
00b6cec4  ldrsb    w10, [x28, #1]
00b6cec8  and      x9, x10, #0xff
00b6cecc  tbnz     w10, #0x1f, #0xb6cedc
00b6ced0  mov      w0, #2
00b6ced4  mov      w10, #7
00b6ced8  b        #0xb6d00c
00b6cedc  cmp      x1, #2
00b6cee0  b.eq     #0xb6e95c
00b6cee4  bfi      x8, x9, #7, #7
00b6cee8  ldrsb    w10, [x28, #2]
00b6ceec  and      x9, x10, #0xff
00b6cef0  tbnz     w10, #0x1f, #0xb6cf00
00b6cef4  mov      w0, #3
00b6cef8  mov      w10, #0xe
00b6cefc  b        #0xb6d00c
00b6cf00  cmp      x1, #3
00b6cf04  b.eq     #0xb6ecc8
00b6cf08  bfi      x8, x9, #0xe, #7
00b6cf0c  ldrsb    w10, [x28, #3]
00b6cf10  and      x9, x10, #0xff
00b6cf14  tbnz     w10, #0x1f, #0xb6cf24
00b6cf18  mov      w0, #4
00b6cf1c  mov      w10, #0x15
00b6cf20  b        #0xb6d00c
00b6cf24  cmp      x1, #4
00b6cf28  b.eq     #0xb6f010
00b6cf2c  bfi      x8, x9, #0x15, #7
00b6cf30  ldrsb    w10, [x28, #4]
00b6cf34  and      x9, x10, #0xff
00b6cf38  tbnz     w10, #0x1f, #0xb6cf48
00b6cf3c  mov      w0, #5
00b6cf40  mov      w10, #0x1c
00b6cf44  b        #0xb6d00c
00b6cf48  cmp      x1, #5
00b6cf4c  b.eq     #0xb70388
00b6cf50  bfi      x8, x9, #0x1c, #7
00b6cf54  ldrsb    w10, [x28, #5]
00b6cf58  and      x9, x10, #0xff
00b6cf5c  tbnz     w10, #0x1f, #0xb6cf6c
00b6cf60  mov      w0, #6
00b6cf64  mov      w10, #0x23
00b6cf68  b        #0xb6d00c
00b6cf6c  cmp      x1, #6
00b6cf70  b.eq     #0xb7087c
00b6cf74  and      w9, w9, #0x7f
00b6cf78  orr      x8, x8, x9, lsl #35
00b6cf7c  ldrsb    w10, [x28, #6]
00b6cf80  and      x9, x10, #0xff
00b6cf84  tbnz     w10, #0x1f, #0xb6cf94
00b6cf88  mov      w0, #7
00b6cf8c  mov      w10, #0x2a
00b6cf90  b        #0xb6d00c
00b6cf94  cmp      x1, #7
00b6cf98  b.eq     #0xb70a28
00b6cf9c  and      w9, w9, #0x7f
00b6cfa0  orr      x8, x8, x9, lsl #42
00b6cfa4  ldrsb    w10, [x28, #7]
00b6cfa8  and      x9, x10, #0xff
00b6cfac  tbnz     w10, #0x1f, #0xb6cfbc
00b6cfb0  mov      w0, #8
00b6cfb4  mov      w10, #0x31
00b6cfb8  b        #0xb6d008
00b6cfbc  cmp      x24, #8
00b6cfc0  b.eq     #0xb70af0
00b6cfc4  and      w9, w9, #0x7f
00b6cfc8  orr      x8, x8, x9, lsl #49
00b6cfcc  ldrsb    w10, [x28, #8]
00b6cfd0  and      x9, x10, #0xff
00b6cfd4  tbnz     w10, #0x1f, #0xb6cfe4
00b6cfd8  mov      w0, #9
00b6cfdc  mov      w10, #0x38
00b6cfe0  b        #0xb6d008
00b6cfe4  cmp      x24, #9
00b6cfe8  b.eq     #0xb70b48
00b6cfec  ldrsb    w10, [x28, #9]
00b6cff0  tbnz     w10, #0x1f, #0xb70b54
00b6cff4  and      w9, w9, #0x7f
00b6cff8  orr      x8, x8, x9, lsl #56
00b6cffc  and      x9, x10, #0xff
00b6d000  mov      w0, #0xa
00b6d004  mov      w10, #0x3f
00b6d008  mov      x1, x24
00b6d00c  subs     x11, x1, x0
00b6d010  b.lo     #0xb6f058
00b6d014  lsl      x9, x9, x10
00b6d018  orr      x21, x9, x8
00b6d01c  cmp      x11, x21
00b6d020  csel     x8, x11, xzr, lo
00b6d024  add      x20, x28, x0
00b6d028  cmp      x11, x21
00b6d02c  b.lo     #0xb6e964
00b6d030  sub      x27, x21, x8
00b6d034  subs     x24, x11, x27
00b6d038  b.lo     #0xb6f06c
00b6d03c  tbnz     x27, #0x3f, #0xb6d618
00b6d040  cbz      x27, #0xb6d064
00b6d044  mov      x28, x12
00b6d048  mov      x0, x27
00b6d04c  bl       #0xc7ad48 ; _malloc
00b6d050  cbz      x0, #0xb70cfc
00b6d054  mov      x25, x0
00b6d058  str      x27, [sp, #0x120]
00b6d05c  mov      x12, x28
00b6d060  b        #0xb6d06c
00b6d064  str      xzr, [sp, #0x120]
00b6d068  mov      w25, #1
00b6d06c  cbz      x21, #0xb6d088
00b6d070  mov      x0, x25
00b6d074  mov      x1, x20
00b6d078  mov      x2, x27
00b6d07c  mov      x21, x12
00b6d080  bl       #0xc7ad6c ; _memcpy
00b6d084  mov      x12, x21
00b6d088  ldr      x8, [sp, #0x4f0]
00b6d08c  cmp      x22, x8
00b6d090  b.ne     #0xb6d0a0
00b6d094  add      x0, sp, #0x4f0
00b6d098  bl       #0xc6c3c4
00b6d09c  ldr      x12, [sp, #0x4f8]
00b6d0a0  add      x22, x22, #1
00b6d0a4  add      x28, x20, x27
00b6d0a8  add      x8, x12, x26
00b6d0ac  ldr      x9, [sp, #0x120]
00b6d0b0  stp      x9, x25, [x8]
00b6d0b4  str      x27, [x8, #0x10]
00b6d0b8  str      x22, [sp, #0x500]
00b6d0bc  add      x26, x26, #0x18
00b6d0c0  ldr      x8, [sp, #0xe8]
00b6d0c4  cmp      x8, x22
00b6d0c8  b.ne     #0xb6ce94
00b6d0cc  ldr      x8, [sp, #0x4f0]
00b6d0d0  ldr      x9, [sp, #0x4f8]
00b6d0d4  ldr      x10, [sp, #0xe8]
00b6d0d8  mov      x19, x10
00b6d0dc  mov      x22, x28
00b6d0e0  mov      x28, x10
00b6d0e4  ldr      w11, [sp, #0x118]
00b6d0e8  b        #0xb6d6a0
00b6d0ec  cbz      x23, #0xb6d670
00b6d0f0  mov      x0, x23
00b6d0f4  bl       #0xc7ad48 ; _malloc
00b6d0f8  cbz      x0, #0xb70c54
00b6d0fc  mov      x19, x0
00b6d100  mov      x1, x22
00b6d104  mov      x2, x23
00b6d108  bl       #0xc7ad6c ; _memcpy
00b6d10c  mov      x20, x23
00b6d110  ldr      x8, [sp, #0x4f0]
00b6d114  cmp      x8, #1
00b6d118  b.lt     #0xb6d124
00b6d11c  mov      x0, x22
00b6d120  bl       #0xc7ab98 ; _free
00b6d124  mov      x9, #-0x8000000000000000
00b6d128  b        #0xb6d16c
00b6d12c  cbz      x19, #0xb6d89c
00b6d130  str      x8, [sp, #0x3c0]
00b6d134  add      x8, sp, #0x3c0
00b6d138  adrp     x9, #0xc13000
00b6d13c  add      x9, x9, #0x73c
00b6d140  str      x8, [sp, #0x460]
00b6d144  str      x9, [sp, #0x468]
00b6d148  adrp     x1, #0xefb000
00b6d14c  add      x1, x1, #0x3b0
00b6d150  adrp     x2, #0xcb9000
00b6d154  add      x2, x2, #0xaad ; '\x11Parsing requires �\x0c bytes/chars'
00b6d158  add      x0, sp, #0x1f0
00b6d15c  add      x3, sp, #0x460
00b6d160  bl       #0xbe769c
00b6d164  b        #0xb6d5a0
00b6d168  add      x21, sp, #0x4f0
00b6d16c  str      x10, [sp, #0x620]
00b6d170  str      x1, [sp, #0x628]
00b6d174  str      x8, [sp, #0x180]
00b6d178  ldr      q0, [x28, #0x20]
00b6d17c  str      q0, [sp, #0x170]
00b6d180  mov      x8, #-0x8000000000000000
00b6d184  cmp      x9, x8
00b6d188  b.ne     #0xb6d1d0
00b6d18c  stp      x20, x19, [sp, #0x138]
00b6d190  str      x23, [sp, #0x148]
00b6d194  cmp      x20, x8
00b6d198  b.eq     #0xb7166c
00b6d19c  cmp      x23, #0xf
00b6d1a0  b.hi     #0xb6d8e0
00b6d1a4  cbz      x23, #0xb6d1c0
function 0xb7a80c..0xb7ad0c (1280 bytes)
00b7a80c  sub      sp, sp, #0x110
00b7a810  stp      x28, x27, [sp, #0xb0]
00b7a814  stp      x26, x25, [sp, #0xc0]
00b7a818  stp      x24, x23, [sp, #0xd0]
00b7a81c  stp      x22, x21, [sp, #0xe0]
00b7a820  stp      x20, x19, [sp, #0xf0]
00b7a824  stp      x29, x30, [sp, #0x100]
00b7a828  add      x29, sp, #0x100
00b7a82c  mov      x22, x0
00b7a830  add      x21, x1, #8
00b7a834  ldaxrb   w8, [x21]
00b7a838  cbnz     w8, #0xb7abfc
00b7a83c  mov      w8, #1
00b7a840  stxrb    w9, w8, [x21]
00b7a844  cbnz     w9, #0xb7ac00
00b7a848  ldrb     w8, [x1, #0x58]
00b7a84c  tbz      w8, #0, #0xb7ac18
00b7a850  ldp      x24, x19, [x1, #0x18]
00b7a854  mov      w20, #3
00b7a858  mov      w0, #3
00b7a85c  bl       #0xc7ad48 ; _malloc
00b7a860  cmp      x0, #0
00b7a864  csel     x26, x20, x0, eq
00b7a868  csinc    x20, x20, xzr, ne
00b7a86c  cbz      x0, #0xb7ab58
00b7a870  lsl      x28, x19, #3
00b7a874  mov      w27, #0x20
00b7a878  movk     w27, #0x6000, lsl #16
00b7a87c  mov      w8, #0x2e2e
00b7a880  strb     w8, [x26, #2]
00b7a884  strh     w8, [x26]
00b7a888  cbz      x19, #0xb7a8cc
00b7a88c  mov      w8, #1
00b7a890  stp      xzr, x8, [sp, #0x68]
00b7a894  stp      w27, wzr, [sp, #0x90]
00b7a898  add      x8, sp, #0x68
00b7a89c  adrp     x9, #0xef8000
00b7a8a0  add      x9, x9, #0x140
00b7a8a4  stp      xzr, x8, [sp, #0x78]
00b7a8a8  str      x9, [sp, #0x88]
00b7a8ac  add      x1, sp, #0x80
00b7a8b0  mov      x0, x24
00b7a8b4  bl       #0xb86e9c
00b7a8b8  cbnz     w0, #0xb7ab90
00b7a8bc  ldr      x8, [sp, #0x68]
00b7a8c0  mov      x9, #-0x8000000000000000
00b7a8c4  cmp      x8, x9
00b7a8c8  b.ne     #0xb7a8ec
00b7a8cc  mov      x23, #0
00b7a8d0  mov      x25, #0
00b7a8d4  stp      x20, x26, [sp, #0x20]
00b7a8d8  mov      w8, #3
00b7a8dc  str      x8, [sp, #0x30]
00b7a8e0  mov      x20, #-0x8000000000000000
00b7a8e4  mov      w0, #1
00b7a8e8  b        #0xb7a914
00b7a8ec  add      x23, x24, #8
00b7a8f0  ldp      x9, x10, [sp, #0x70]
00b7a8f4  stp      x8, x9, [sp, #0x20]
00b7a8f8  str      x10, [sp, #0x30]
00b7a8fc  sub      x8, x28, #8
00b7a900  lsr      x8, x8, #2
00b7a904  add      x25, x8, #2
00b7a908  mov      x0, x25
00b7a90c  bl       #0xc7ad48 ; _malloc
00b7a910  cbz      x0, #0xb7acc4
00b7a914  str      x22, [sp, #8]
00b7a918  stp      x25, x0, [sp, #0x38]
00b7a91c  str      xzr, [sp, #0x48]
00b7a920  add      x8, sp, #0x20
00b7a924  str      x8, [sp, #0x80]
00b7a928  adrp     x8, #0xb7a000
00b7a92c  add      x8, x8, #0x7fc
00b7a930  str      x8, [sp, #0x88]
00b7a934  adrp     x1, #0xef8000
00b7a938  add      x1, x1, #0x140
00b7a93c  adrp     x2, #0xcba000
00b7a940  add      x2, x2, #0x67f ; '�'
00b7a944  add      x0, sp, #0x38
00b7a948  add      x3, sp, #0x80
00b7a94c  bl       #0xbe769c
00b7a950  cbnz     w0, #0xb7ab68
00b7a954  stp      x20, x21, [sp, #0x10]
00b7a958  str      x26, [sp]
00b7a95c  cbz      x23, #0xb7aa50
00b7a960  add      x28, x24, x28
00b7a964  cmp      x23, x28
00b7a968  b.eq     #0xb7aa50
00b7a96c  mov      w20, #1
00b7a970  add      x21, sp, #0x50
00b7a974  adrp     x19, #0xef8000
00b7a978  add      x19, x19, #0x310
00b7a97c  mov      w22, #0x202c
00b7a980  add      x26, sp, #0x80
00b7a984  adrp     x24, #0xef8000
00b7a988  add      x24, x24, #0x270
00b7a98c  adrp     x25, #0xcba000
00b7a990  add      x25, x25, #0x67f ; '�'
00b7a994  b        #0xb7a9a4
00b7a998  add      x23, x23, #8
00b7a99c  cmp      x23, x28
00b7a9a0  b.eq     #0xb7aa50
00b7a9a4  stp      xzr, x20, [sp, #0x50]
00b7a9a8  stp      xzr, x21, [sp, #0x60]
00b7a9ac  stp      w27, wzr, [sp, #0x78]
00b7a9b0  str      x19, [sp, #0x70]
00b7a9b4  add      x1, sp, #0x68
00b7a9b8  mov      x0, x23
00b7a9bc  bl       #0xb86e9c
00b7a9c0  cbnz     w0, #0xb7ab08
00b7a9c4  ldr      q0, [sp, #0x50]
00b7a9c8  str      q0, [sp, #0x80]
00b7a9cc  ldr      x8, [sp, #0x60]
00b7a9d0  str      x8, [sp, #0x90]
00b7a9d4  ldr      x1, [sp, #0x48]
00b7a9d8  ldr      x8, [sp, #0x38]
00b7a9dc  sub      x8, x8, x1
00b7a9e0  cmp      x8, #1
00b7a9e4  b.ls     #0xb7aa34
00b7a9e8  ldr      x8, [sp, #0x40]
00b7a9ec  strh     w22, [x8, x1]
00b7a9f0  ldr      x8, [sp, #0x48]
00b7a9f4  add      x8, x8, #2
00b7a9f8  str      x8, [sp, #0x48]
00b7a9fc  adrp     x8, #0xb7a000
00b7aa00  add      x8, x8, #0x7fc
00b7aa04  stp      x26, x8, [sp, #0x68]
00b7aa08  add      x0, sp, #0x38
00b7aa0c  add      x3, sp, #0x68
00b7aa10  mov      x1, x24
00b7aa14  mov      x2, x25
00b7aa18  bl       #0xbe769c
00b7aa1c  cbnz     w0, #0xb7ab30
00b7aa20  ldr      x8, [sp, #0x80]
00b7aa24  cbz      x8, #0xb7a998
00b7aa28  ldr      x0, [sp, #0x88]
00b7aa2c  bl       #0xc7ab98 ; _free
00b7aa30  b        #0xb7a998
00b7aa34  add      x0, sp, #0x38
00b7aa38  mov      w2, #2
00b7aa3c  mov      w3, #1
00b7aa40  mov      w4, #1
00b7aa44  bl       #0xc6c0cc
00b7aa48  ldr      x1, [sp, #0x48]
00b7aa4c  b        #0xb7a9e8
00b7aa50  mov      x8, #-0x8000000000000000
00b7aa54  ldp      x9, x21, [sp, #0x10]
00b7aa58  cmp      x9, x8
00b7aa5c  ldr      x22, [sp, #8]
00b7aa60  b.eq     #0xb7aae4
00b7aa64  ldr      x26, [sp]
00b7aa68  stp      x9, x26, [sp, #0x80]
00b7aa6c  mov      w8, #3
00b7aa70  str      x8, [sp, #0x90]
00b7aa74  ldr      x1, [sp, #0x48]
00b7aa78  ldr      x8, [sp, #0x38]
00b7aa7c  sub      x8, x8, x1
00b7aa80  cmp      x8, #1
00b7aa84  b.ls     #0xb7abb8
00b7aa88  ldr      x8, [sp, #0x40]
00b7aa8c  mov      w9, #0x202c
00b7aa90  strh     w9, [x8, x1]
00b7aa94  ldr      x8, [sp, #0x48]
00b7aa98  add      x8, x8, #2
00b7aa9c  str      x8, [sp, #0x48]
00b7aaa0  add      x8, sp, #0x80
00b7aaa4  str      x8, [sp, #0x68]
00b7aaa8  adrp     x8, #0xb7a000
00b7aaac  add      x8, x8, #0x7fc
00b7aab0  str      x8, [sp, #0x70]
00b7aab4  adrp     x1, #0xef8000
00b7aab8  add      x1, x1, #0x140
00b7aabc  adrp     x2, #0xcba000
00b7aac0  add      x2, x2, #0x67f ; '�'
00b7aac4  add      x0, sp, #0x38
00b7aac8  add      x3, sp, #0x68
00b7aacc  bl       #0xbe769c
00b7aad0  tbnz     w0, #0, #0xb7abd4
00b7aad4  ldr      x8, [sp, #0x80]
00b7aad8  cbz      x8, #0xb7aae4
00b7aadc  ldr      x0, [sp, #0x88]
00b7aae0  bl       #0xc7ab98 ; _free
00b7aae4  ldur     q0, [sp, #0x38]
00b7aae8  str      q0, [sp, #0x80]
00b7aaec  ldr      x8, [sp, #0x48]
00b7aaf0  str      x8, [sp, #0x90]
00b7aaf4  ldr      x8, [sp, #0x20]
00b7aaf8  cbz      x8, #0xb7ac34
00b7aafc  ldr      x0, [sp, #0x28]
00b7ab00  bl       #0xc7ab98 ; _free
00b7ab04  b        #0xb7ac34
00b7ab08  adrp     x0, #0xe09000
00b7ab0c  add      x0, x0, #0x226
00b7ab10  adrp     x3, #0xef8000
00b7ab14  add      x3, x3, #0x358
00b7ab18  adrp     x4, #0xefb000
00b7ab1c  add      x4, x4, #0x3e0
00b7ab20  sub      x2, x29, #0x59
00b7ab24  mov      w1, #0x37
00b7ab28  bl       #0xc73d64
00b7ab2c  b        #0xb7acd0
00b7ab30  adrp     x0, #0xe0d000
00b7ab34  add      x0, x0, #0x176
00b7ab38  adrp     x3, #0xef8000
00b7ab3c  add      x3, x3, #0x2c0
00b7ab40  adrp     x4, #0xef8000
00b7ab44  add      x4, x4, #0x340
00b7ab48  sub      x2, x29, #0x59
00b7ab4c  mov      w1, #0x2b
00b7ab50  bl       #0xc73d64
00b7ab54  b        #0xb7acd0
00b7ab58  mov      x0, x20
00b7ab5c  mov      x1, x26
00b7ab60  bl       #0xc6b970
00b7ab64  b        #0xb7acd0
00b7ab68  adrp     x0, #0xe0d000
00b7ab6c  add      x0, x0, #0x176
00b7ab70  adrp     x3, #0xef8000
00b7ab74  add      x3, x3, #0x170
00b7ab78  adrp     x4, #0xef8000
00b7ab7c  add      x4, x4, #0x378
00b7ab80  sub      x2, x29, #0x59
00b7ab84  mov      w1, #0x2b
00b7ab88  bl       #0xc73d64
00b7ab8c  b        #0xb7acd0
00b7ab90  adrp     x0, #0xe09000
00b7ab94  add      x0, x0, #0x226
00b7ab98  adrp     x3, #0xef8000
00b7ab9c  add      x3, x3, #0x170
00b7aba0  adrp     x4, #0xefb000
00b7aba4  add      x4, x4, #0x3e0
00b7aba8  sub      x2, x29, #0x59
00b7abac  mov      w1, #0x37
00b7abb0  bl       #0xc73d64
00b7abb4  b        #0xb7acd0
00b7abb8  add      x0, sp, #0x38
00b7abbc  mov      w2, #2
00b7abc0  mov      w3, #1
00b7abc4  mov      w4, #1
00b7abc8  bl       #0xc6c0cc
00b7abcc  ldr      x1, [sp, #0x48]
00b7abd0  b        #0xb7aa88
00b7abd4  adrp     x0, #0xe0d000
00b7abd8  add      x0, x0, #0x176
00b7abdc  adrp     x3, #0xef8000
00b7abe0  add      x3, x3, #0x170
00b7abe4  adrp     x4, #0xef8000
00b7abe8  add      x4, x4, #0x340
00b7abec  sub      x2, x29, #0x59
00b7abf0  mov      w1, #0x2b
00b7abf4  bl       #0xc73d64
00b7abf8  b        #0xb7acd0
00b7abfc  clrex    
00b7ac00  add      x0, x1, #8
00b7ac04  mov      x19, x1
00b7ac08  bl       #0xc7573c
00b7ac0c  mov      x1, x19
00b7ac10  ldrb     w8, [x19, #0x58]
00b7ac14  tbnz     w8, #0, #0xb7a850
00b7ac18  ldp      x8, x9, [x1, #0x18]
00b7ac1c  add      x9, x8, x9, lsl #3
00b7ac20  stp      x8, x9, [sp, #0x68]
00b7ac24  add      x0, sp, #0x80
00b7ac28  add      x1, sp, #0x68
00b7ac2c  mov      w2, #0x202c
00b7ac30  bl       #0xb9475c
00b7ac34  add      x8, sp, #0x80
00b7ac38  str      x8, [sp, #0x68]
00b7ac3c  adrp     x8, #0xb7a000
00b7ac40  add      x8, x8, #0x7fc
00b7ac44  str      x8, [sp, #0x70]
00b7ac48  ldp      x0, x1, [x22]
00b7ac4c  adrp     x2, #0xcba000
00b7ac50  add      x2, x2, #0x67f ; '�'
00b7ac54  add      x3, sp, #0x68
00b7ac58  bl       #0xbe769c
00b7ac5c  ldr      x8, [sp, #0x80]
00b7ac60  cbz      x8, #0xb7ac78
00b7ac64  ldr      x8, [sp, #0x88]
00b7ac68  mov      x19, x0
00b7ac6c  mov      x0, x8
00b7ac70  bl       #0xc7ab98 ; _free
00b7ac74  mov      x0, x19
00b7ac78  ldxrb    w8, [x21]
00b7ac7c  cmp      w8, #1
00b7ac80  b.ne     #0xb7acac
00b7ac84  stlxrb   w8, wzr, [x21]
00b7ac88  cbnz     w8, #0xb7ac78
00b7ac8c  ldp      x29, x30, [sp, #0x100]
00b7ac90  ldp      x20, x19, [sp, #0xf0]
00b7ac94  ldp      x22, x21, [sp, #0xe0]
00b7ac98  ldp      x24, x23, [sp, #0xd0]
00b7ac9c  ldp      x26, x25, [sp, #0xc0]
00b7aca0  ldp      x28, x27, [sp, #0xb0]
00b7aca4  add      sp, sp, #0x110
00b7aca8  ret      
00b7acac  clrex    
00b7acb0  mov      x19, x0
00b7acb4  mov      x0, x21
00b7acb8  bl       #0xc75418
00b7acbc  mov      x0, x19
00b7acc0  b        #0xb7ac8c
00b7acc4  mov      w0, #1
00b7acc8  mov      x1, x25
00b7accc  bl       #0xc6b970
00b7acd0  brk      #1
00b7acd4  mov      x22, x0
00b7acd8  b        #0xb7ad90
00b7acdc  b        #0xb7ad00
00b7ace0  mov      x22, x0
00b7ace4  ldr      x8, [sp, #0x80]
00b7ace8  cbz      x8, #0xb7adb4
00b7acec  ldr      x0, [sp, #0x88]
00b7acf0  bl       #0xc7ab98 ; _free
00b7acf4  b        #0xb7adb4
00b7acf8  b        #0xb7ad64
00b7acfc  b        #0xb7ad48
00b7ad00  mov      x22, x0
00b7ad04  ldr      x8, [sp, #0x80]
00b7ad08  cbnz     x8, #0xb7ad14
function 0xb814e4..0xb819e4 (1280 bytes)
00b814e4  sub      sp, sp, #0xa0
00b814e8  stp      x24, x23, [sp, #0x60]
00b814ec  stp      x22, x21, [sp, #0x70]
00b814f0  stp      x20, x19, [sp, #0x80]
00b814f4  stp      x29, x30, [sp, #0x90]
00b814f8  add      x29, sp, #0x90
00b814fc  mov      x20, x1
00b81500  mov      x19, x0
00b81504  add      x8, x0, #8
00b81508  str      x8, [sp, #8]
00b8150c  ldp      x21, x8, [x1]
00b81510  ldr      x23, [x8, #0x18]
00b81514  adrp     x1, #0xe0e000
00b81518  add      x1, x1, #0xd64
00b8151c  mov      x0, x21
00b81520  mov      w2, #4
00b81524  blr      x23
00b81528  mov      x8, x0
00b8152c  str      x20, [sp, #0x10]
00b81530  mov      w22, #1
00b81534  mov      w0, #1
00b81538  tbnz     w8, #0, #0xb81644
00b8153c  ldrb     w8, [x20, #0x12]
00b81540  tbnz     w8, #7, #0xb815ac
00b81544  adrp     x1, #0xe0a000
00b81548  add      x1, x1, #0x2ba
00b8154c  mov      x0, x21
00b81550  mov      w2, #3
00b81554  blr      x23
00b81558  tbnz     w0, #0, #0xb81640
00b8155c  ldp      x0, x8, [x20]
00b81560  ldr      x8, [x8, #0x18]
00b81564  adrp     x1, #0xe09000
00b81568  add      x1, x1, #0x220
00b8156c  mov      w2, #6
00b81570  blr      x8
00b81574  tbnz     w0, #0, #0xb81640
00b81578  ldp      x0, x8, [x20]
00b8157c  ldr      x8, [x8, #0x18]
00b81580  adrp     x1, #0xe0a000
00b81584  add      x1, x1, #0x281
00b81588  mov      w2, #2
00b8158c  blr      x8
00b81590  tbnz     w0, #0, #0xb81640
00b81594  adrp     x1, #0xe0a000
00b81598  add      x1, x1, #0x2d3
00b8159c  mov      x0, x20
00b815a0  mov      w2, #2
00b815a4  bl       #0xbe7850
00b815a8  b        #0xb81644
00b815ac  adrp     x1, #0xe07000
00b815b0  add      x1, x1, #0xfbd
00b815b4  mov      x0, x21
00b815b8  mov      w2, #3
00b815bc  blr      x23
00b815c0  mov      x8, x0
00b815c4  mov      w0, #1
00b815c8  tbnz     w8, #0, #0xb81644
00b815cc  strb     w0, [sp, #0x47]
00b815d0  ldr      q0, [x20]
00b815d4  str      q0, [sp, #0x20]
00b815d8  add      x8, sp, #0x47
00b815dc  str      x8, [sp, #0x30]
00b815e0  ldr      x10, [x20, #0x10]
00b815e4  add      x8, sp, #0x20
00b815e8  adrp     x9, #0xefa000
00b815ec  add      x9, x9, #0x758
00b815f0  str      x8, [sp, #0x48]
00b815f4  stp      x9, x10, [sp, #0x50]
00b815f8  adrp     x1, #0xe09000
00b815fc  add      x1, x1, #0x220
00b81600  add      x0, sp, #0x20
00b81604  mov      w2, #6
00b81608  bl       #0xbe8048
00b8160c  tbnz     w0, #0, #0xb81640
00b81610  adrp     x1, #0xe0a000
00b81614  add      x1, x1, #0x281
00b81618  add      x0, sp, #0x20
00b8161c  mov      w2, #2
00b81620  bl       #0xbe8048
00b81624  tbnz     w0, #0, #0xb81640
00b81628  adrp     x1, #0xe0a000
00b8162c  add      x1, x1, #0x2d3
00b81630  add      x0, sp, #0x48
00b81634  mov      w2, #2
00b81638  bl       #0xbe7850
00b8163c  cbz      w0, #0xb816fc
00b81640  mov      w0, #1
00b81644  strb     w0, [sp, #0x18]
00b81648  strb     w22, [sp, #0x19]
00b8164c  adrp     x1, #0xe0e000
00b81650  add      x1, x1, #0xd68
00b81654  adrp     x4, #0xb81000
00b81658  add      x4, x4, #0x8d0
00b8165c  add      x0, sp, #0x10
00b81660  mov      w2, #4
00b81664  mov      x3, x19
00b81668  bl       #0xbe9174
00b8166c  adrp     x1, #0xe0e000
00b81670  add      x1, x1, #0xd6c
00b81674  adrp     x4, #0xb81000
00b81678  add      x4, x4, #0x714
00b8167c  add      x0, sp, #0x10
00b81680  add      x3, sp, #8
00b81684  mov      w2, #4
00b81688  bl       #0xbe9174
00b8168c  ldrb     w9, [sp, #0x19]
00b81690  ldrb     w8, [sp, #0x18]
00b81694  orr      w0, w9, w8
00b81698  cmp      w9, #1
00b8169c  b.ne     #0xb816e0
00b816a0  tbnz     w8, #0, #0xb816e0
00b816a4  ldr      x8, [sp, #0x10]
00b816a8  ldrb     w9, [x8, #0x12]
00b816ac  tbnz     w9, #7, #0xb816c8
00b816b0  ldp      x0, x8, [x8]
00b816b4  ldr      x8, [x8, #0x18]
00b816b8  adrp     x1, #0xe0a000
00b816bc  add      x1, x1, #0x2bd
00b816c0  mov      w2, #2
00b816c4  b        #0xb816dc
00b816c8  ldp      x0, x8, [x8]
00b816cc  ldr      x8, [x8, #0x18]
00b816d0  adrp     x1, #0xe0a000
00b816d4  add      x1, x1, #0x28c
00b816d8  mov      w2, #1
00b816dc  blr      x8
00b816e0  and      w0, w0, #1
00b816e4  ldp      x29, x30, [sp, #0x90]
00b816e8  ldp      x20, x19, [sp, #0x80]
00b816ec  ldp      x22, x21, [sp, #0x70]
00b816f0  ldp      x24, x23, [sp, #0x60]
00b816f4  add      sp, sp, #0xa0
00b816f8  ret      
00b816fc  adrp     x1, #0xe07000
00b81700  add      x1, x1, #0xfc0
00b81704  add      x0, sp, #0x20
00b81708  mov      w2, #2
00b8170c  bl       #0xbe8048
00b81710  b        #0xb81644
00b81714  sub      sp, sp, #0x70
00b81718  stp      x24, x23, [sp, #0x30]
00b8171c  stp      x22, x21, [sp, #0x40]
00b81720  stp      x20, x19, [sp, #0x50]
00b81724  stp      x29, x30, [sp, #0x60]
00b81728  add      x29, sp, #0x60
00b8172c  mov      x21, x1
00b81730  ldr      x23, [x0]
00b81734  ldp      x19, x20, [x1]
00b81738  ldr      x22, [x20, #0x18]
00b8173c  adrp     x1, #0xe0a000
00b81740  add      x1, x1, #0x294
00b81744  mov      w24, #1
00b81748  mov      x0, x19
00b8174c  mov      w2, #1
00b81750  blr      x22
00b81754  mov      x8, x0
00b81758  mov      x0, x24
00b8175c  tbnz     w8, #0, #0xb81844
00b81760  ldr      w8, [x21, #0x10]
00b81764  tbnz     w8, #0x17, #0xb817e4
00b81768  adrp     x21, #0xb81000
00b8176c  add      x21, x21, #0x964
00b81770  stp      x23, x21, [sp]
00b81774  adrp     x2, #0xcba000
00b81778  add      x2, x2, #0xa6 ; '\nNodeIndex(�\x01)'
00b8177c  mov      x3, sp
00b81780  mov      x0, x19
00b81784  mov      x1, x20
00b81788  bl       #0xbe769c
00b8178c  tbnz     w0, #0, #0xb81840
00b81790  adrp     x1, #0xe0a000
00b81794  add      x1, x1, #0x26d
00b81798  mov      x0, x19
00b8179c  mov      w2, #2
00b817a0  blr      x22
00b817a4  tbnz     w0, #0, #0xb81840
00b817a8  add      x8, x23, #4
00b817ac  stp      x8, x21, [sp]
00b817b0  adrp     x2, #0xcba000
00b817b4  add      x2, x2, #0xa6 ; '\nNodeIndex(�\x01)'
00b817b8  mov      x3, sp
00b817bc  mov      x0, x19
00b817c0  mov      x1, x20
00b817c4  bl       #0xbe769c
00b817c8  tbnz     w0, #0, #0xb81840
00b817cc  adrp     x1, #0xe0a000
00b817d0  add      x1, x1, #0x295
00b817d4  mov      x0, x19
00b817d8  mov      w2, #1
00b817dc  blr      x22
00b817e0  b        #0xb81844
00b817e4  adrp     x1, #0xe0d000
00b817e8  add      x1, x1, #0x5dd
00b817ec  mov      x0, x19
00b817f0  mov      w2, #1
00b817f4  blr      x22
00b817f8  mov      x8, x0
00b817fc  mov      w0, #1
00b81800  tbnz     w8, #0, #0xb81844
00b81804  strb     w0, [sp, #0x1f]
00b81808  stp      x19, x20, [sp]
00b8180c  add      x8, sp, #0x1f
00b81810  str      x8, [sp, #0x10]
00b81814  adrp     x21, #0xb81000
00b81818  add      x21, x21, #0x964
00b8181c  stp      x23, x21, [sp, #0x20]
00b81820  adrp     x1, #0xefa000
00b81824  add      x1, x1, #0x758
00b81828  adrp     x2, #0xcba000
00b8182c  add      x2, x2, #0xa6 ; '\nNodeIndex(�\x01)'
00b81830  mov      x0, sp
00b81834  add      x3, sp, #0x20
00b81838  bl       #0xbe769c
00b8183c  cbz      w0, #0xb8185c
00b81840  mov      w0, #1
00b81844  ldp      x29, x30, [sp, #0x60]
00b81848  ldp      x20, x19, [sp, #0x50]
00b8184c  ldp      x22, x21, [sp, #0x40]
00b81850  ldp      x24, x23, [sp, #0x30]
00b81854  add      sp, sp, #0x70
00b81858  ret      
00b8185c  adrp     x1, #0xe07000
00b81860  add      x1, x1, #0xfc0
00b81864  mov      x0, sp
00b81868  mov      w2, #2
00b8186c  bl       #0xbe8048
00b81870  mov      x8, x0
00b81874  mov      w0, #1
00b81878  tbnz     w8, #0, #0xb81844
00b8187c  add      x8, x23, #4
00b81880  strb     w0, [sp, #0x1f]
00b81884  stp      x19, x20, [sp]
00b81888  add      x9, sp, #0x1f
00b8188c  str      x9, [sp, #0x10]
00b81890  stp      x8, x21, [sp, #0x20]
00b81894  adrp     x1, #0xefa000
00b81898  add      x1, x1, #0x758
00b8189c  adrp     x2, #0xcba000
00b818a0  add      x2, x2, #0xa6 ; '\nNodeIndex(�\x01)'
00b818a4  mov      x0, sp
00b818a8  add      x3, sp, #0x20
00b818ac  bl       #0xbe769c
00b818b0  cbnz     w0, #0xb81840
00b818b4  adrp     x1, #0xe07000
00b818b8  add      x1, x1, #0xfc0
00b818bc  mov      x0, sp
00b818c0  mov      w2, #2
00b818c4  bl       #0xbe8048
00b818c8  tbnz     w0, #0, #0xb81840
00b818cc  b        #0xb817cc
00b818d0  sub      sp, sp, #0x40
00b818d4  stp      x22, x21, [sp, #0x10]
00b818d8  stp      x20, x19, [sp, #0x20]
00b818dc  stp      x29, x30, [sp, #0x30]
00b818e0  add      x29, sp, #0x30
00b818e4  mov      x20, x1
00b818e8  mov      x21, x0
00b818ec  ldp      x0, x8, [x1]
00b818f0  ldr      x8, [x8, #0x18]
00b818f4  adrp     x1, #0xe0a000
00b818f8  add      x1, x1, #0x294
00b818fc  mov      w19, #1
00b81900  mov      w2, #1
00b81904  blr      x8
00b81908  str      x20, [sp]
00b8190c  strb     w0, [sp, #8]
00b81910  strb     wzr, [sp, #9]
00b81914  mov      x0, sp
00b81918  add      x2, x21, #8
00b8191c  mov      x1, x21
00b81920  bl       #0xb976b4
00b81924  ldrb     w8, [sp, #8]
00b81928  tbnz     w8, #0, #0xb8194c
00b8192c  ldr      x8, [sp]
00b81930  ldp      x0, x8, [x8]
00b81934  ldr      x8, [x8, #0x18]
00b81938  adrp     x1, #0xe0a000
00b8193c  add      x1, x1, #0x295
00b81940  mov      w2, #1
00b81944  blr      x8
00b81948  mov      x19, x0
00b8194c  mov      x0, x19
00b81950  ldp      x29, x30, [sp, #0x30]
00b81954  ldp      x20, x19, [sp, #0x20]
00b81958  ldp      x22, x21, [sp, #0x10]
00b8195c  add      sp, sp, #0x40
00b81960  ret      
00b81964  sub      sp, sp, #0x20
00b81968  stp      x29, x30, [sp, #0x10]
00b8196c  add      x29, sp, #0x10
00b81970  ldr      w8, [x1, #0x10]
00b81974  tbnz     w8, #0x19, #0xb81988
00b81978  tbnz     w8, #0x1a, #0xb819c0
00b8197c  ldp      x29, x30, [sp, #0x10]
00b81980  add      sp, sp, #0x20
00b81984  b        #0xbea8ec
00b81988  ldr      w11, [x0]
00b8198c  mov      w12, #7
00b81990  adrp     x9, #0xe0e000
00b81994  add      x9, x9, #0xb50
00b81998  add      x10, sp, #8
00b8199c  mov      x8, x12
00b819a0  lsr      w13, w11, #4
00b819a4  and      x11, x11, #0xf
00b819a8  ldrb     w11, [x9, x11]
00b819ac  strb     w11, [x10, x12]
00b819b0  sub      x12, x12, #1
00b819b4  mov      x11, x13
00b819b8  cbnz     w13, #0xb8199c
00b819bc  b        #0xb819f4
00b819c0  ldr      w11, [x0]
00b819c4  mov      w12, #7
00b819c8  adrp     x9, #0xe0e000
00b819cc  add      x9, x9, #0xb20
00b819d0  add      x10, sp, #8
00b819d4  mov      x8, x12
00b819d8  lsr      w13, w11, #4
00b819dc  and      x11, x11, #0xf
00b819e0  ldrb     w11, [x9, x11]

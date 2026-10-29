function 0x4c98a8..0x4c9a28 (384 bytes)
004c98a8  sub      sp, sp, #0x20
004c98ac  stp      x29, x30, [sp, #0x10]
004c98b0  add      x29, sp, #0x10
004c98b4  adrp     x8, #0xd1c000
004c98b8  ldr      x8, [x8, #0xd90]
004c98bc  adrp     x9, #0xe7f000
004c98c0  ldr      x9, [x9, #0xaa0]
004c98c4  sub      x8, x9, x8
004c98c8  sub      x0, x29, #1
004c98cc  blr      x8
004c98d0  ldp      x29, x30, [sp, #0x10]
004c98d4  add      sp, sp, #0x20
004c98d8  ret      
004c98dc  adrp     x8, #0xf00000
004c98e0  ldrb     w9, [x8, #0xbb8]
004c98e4  tbnz     w9, #0, #0x4c990c
004c98e8  mov      w9, #1
004c98ec  adrp     x10, #0xf0c000
004c98f0  add      x10, x10, #0x948
004c98f4  strb     w9, [x8, #0xbb8]
004c98f8  ldr      w8, [x10]
004c98fc  add      w8, w8, #1
004c9900  str      w8, [x10]
004c9904  adrp     x9, #0xf00000
004c9908  str      w8, [x9, #0xbb0]
004c990c  ret      
004c9910  sub      sp, sp, #0x10
004c9914  mov      x8, sp
004c9918  str      x8, [sp, #8]
004c991c  add      x8, sp, #8
004c9920  str      x8, [sp]
004c9924  adrp     x9, #0xf04000
004c9928  add      x9, x9, #0x5c0
004c992c  lsr      x8, x9, #0x21
004c9930  orr      x10, x8, x9
004c9934  orn      x8, x8, x9
004c9938  add      x8, x8, x9
004c993c  mvn      x8, x8
004c9940  add      x8, x10, x8
004c9944  mov      x10, #0x8ccd
004c9948  movk     x10, #0xed55, lsl #16
004c994c  movk     x10, #0xafd7, lsl #32
004c9950  movk     x10, #0xff51, lsl #48
004c9954  mul      x8, x8, x10
004c9958  lsr      x10, x8, #0x1d
004c995c  orr      x11, x8, x10
004c9960  mvn      x12, x8
004c9964  orn      x8, x10, x8
004c9968  sub      x8, x12, x8
004c996c  eor      x10, x11, x8
004c9970  and      x8, x11, x8
004c9974  add      x8, x10, x8, lsl #1
004c9978  ldr      x10, [sp, #8]
004c997c  ldr      x11, [sp]
004c9980  orr      x12, x11, x10
004c9984  add      x13, x11, x10
004c9988  mvn      x14, x11
004c998c  neg      x15, x12
004c9990  eor      x16, x13, x15
004c9994  and      x13, x13, x15
004c9998  add      x13, x16, x13, lsl #1
004c999c  neg      x13, x13
004c99a0  eor      x15, x13, x12
004c99a4  orn      x13, x13, x12
004c99a8  add      x12, x12, x13
004c99ac  add      x12, x15, x12, lsl #1
004c99b0  add      x12, x12, #2
004c99b4  add      x13, x11, x11, lsl #1
004c99b8  add      x13, x13, x14, lsl #2
004c99bc  add      x13, x13, #3
004c99c0  and      x13, x13, x10
004c99c4  sub      x10, x11, x10
004c99c8  lsl      x11, x13, #1
004c99cc  mvn      x14, x11
004c99d0  add      x13, x10, x13, lsl #2
004c99d4  add      x13, x13, #1
004c99d8  add      x14, x13, x14
004c99dc  sub      x11, x11, x13
004c99e0  eor      x13, x14, #1
004c99e4  ubfiz    x10, x10, #1, #1
004c99e8  add      x10, x10, x11, lsl #1
004c99ec  add      x10, x13, x10
004c99f0  orr      x11, x12, x10
004c99f4  and      x10, x10, x12
004c99f8  add      x10, x11, x10
004c99fc  add      x11, x10, #1
004c9a00  mov      w12, #0xcde8
004c9a04  add      x12, x10, x12
004c9a08  mov      w13, #0x3219
004c9a0c  add      x10, x10, x13
004c9a10  mov      w14, #0x3218
004c9a14  orr      x14, x11, x14
004c9a18  neg      x14, x14
004c9a1c  eor      x15, x10, x14
004c9a20  and      x10, x10, x14
004c9a24  add      x14, x11, x15
function 0x4ca394..0x4ca514 (384 bytes)
004ca394  sub      sp, sp, #0x20
004ca398  stp      x29, x30, [sp, #0x10]
004ca39c  add      x29, sp, #0x10
004ca3a0  adrp     x8, #0xd1c000
004ca3a4  ldr      x8, [x8, #0xdb8]
004ca3a8  adrp     x9, #0xe7f000
004ca3ac  ldr      x9, [x9, #0xac8]
004ca3b0  sub      x8, x9, x8
004ca3b4  sub      x0, x29, #1
004ca3b8  blr      x8
004ca3bc  ldp      x29, x30, [sp, #0x10]
004ca3c0  add      sp, sp, #0x20
004ca3c4  ret      
004ca3c8  sub      sp, sp, #0x10
004ca3cc  mov      x8, sp
004ca3d0  str      x8, [sp, #8]
004ca3d4  add      x8, sp, #8
004ca3d8  str      x8, [sp]
004ca3dc  adrp     x9, #0xf04000
004ca3e0  add      x9, x9, #0x420
004ca3e4  lsr      x8, x9, #0x21
004ca3e8  orr      x10, x8, x9
004ca3ec  orn      x8, x8, x9
004ca3f0  add      x8, x8, x9
004ca3f4  mvn      x8, x8
004ca3f8  add      x8, x10, x8
004ca3fc  mov      x10, #0x8ccd
004ca400  movk     x10, #0xed55, lsl #16
004ca404  movk     x10, #0xafd7, lsl #32
004ca408  movk     x10, #0xff51, lsl #48
004ca40c  mul      x8, x8, x10
004ca410  lsr      x10, x8, #0x1d
004ca414  orr      x12, x8, x10
004ca418  mvn      x11, x8
004ca41c  orn      x8, x10, x8
004ca420  sub      x8, x11, x8
004ca424  eor      x11, x12, x8
004ca428  and      x8, x12, x8
004ca42c  add      x8, x11, x8, lsl #1
004ca430  ldr      x10, [sp, #8]
004ca434  ldr      x12, [sp]
004ca438  mvn      x13, x12
004ca43c  add      x14, x12, #1
004ca440  lsl      x13, x13, #1
004ca444  add      x15, x14, x13
004ca448  orn      x16, x10, x15
004ca44c  bic      x17, x10, x12
004ca450  sub      x14, x14, x10
004ca454  add      x14, x14, x17
004ca458  add      x14, x14, x15
004ca45c  add      x14, x14, x16
004ca460  eor      x15, x12, #1
004ca464  ubfiz    x16, x12, #1, #1
004ca468  add      x15, x15, x16
004ca46c  add      x13, x15, x13
004ca470  add      x15, x13, x10
004ca474  orr      x13, x13, x10
004ca478  neg      x13, x13
004ca47c  eor      x16, x15, x13
004ca480  and      x13, x15, x13
004ca484  sub      x10, x12, x10
004ca488  lsl      x12, x13, #2
004ca48c  add      x12, x12, x16, lsl #1
004ca490  orr      x12, x12, #1
004ca494  eor      x13, x12, x10
004ca498  and      x10, x12, x10
004ca49c  add      x10, x13, x10, lsl #1
004ca4a0  mov      w12, #1
004ca4a4  sub      x10, x12, x10
004ca4a8  eor      x13, x10, x14
004ca4ac  and      x10, x10, x14
004ca4b0  add      x10, x13, x10, lsl #1
004ca4b4  neg      x14, x10
004ca4b8  orr      x14, x14, #1
004ca4bc  orr      x13, x13, #0xfffffffffffffffe
004ca4c0  add      x13, x13, x14
004ca4c4  add      x13, x13, #1
004ca4c8  add      x14, x13, x10, lsl #1
004ca4cc  mvn      x10, x14
004ca4d0  add      x10, x14, x10, lsl #1
004ca4d4  add      x15, x10, #1
004ca4d8  mov      w16, #0x5729
004ca4dc  orr      x17, x15, x16
004ca4e0  eon      x0, x10, x17
004ca4e4  bic      x17, x17, x10
004ca4e8  mov      w10, #-1
004ca4ec  eor      w1, w10, w14, lsl #1
004ca4f0  mov      w2, #0xae52
004ca4f4  and      x1, x1, x2
004ca4f8  and      x16, x14, x16
004ca4fc  add      x16, x14, x16
004ca500  add      x16, x16, x1
004ca504  add      x16, x16, x0
004ca508  add      x16, x16, x17, lsl #1
004ca50c  mov      x17, #-0x5729
004ca510  add      x16, x16, x17
function 0x4da67c..0x4da7fc (384 bytes)
004da67c  sub      sp, sp, #0x20
004da680  stp      x29, x30, [sp, #0x10]
004da684  add      x29, sp, #0x10
004da688  adrp     x8, #0xd1c000
004da68c  ldr      x8, [x8, #0xdb0]
004da690  adrp     x9, #0xe7f000
004da694  ldr      x9, [x9, #0xac0]
004da698  sub      x8, x9, x8
004da69c  sub      x0, x29, #1
004da6a0  blr      x8
004da6a4  ldp      x29, x30, [sp, #0x10]
004da6a8  add      sp, sp, #0x20
004da6ac  ret      
004da6b0  sub      sp, sp, #0x10
004da6b4  mov      x8, sp
004da6b8  str      x8, [sp, #8]
004da6bc  add      x8, sp, #8
004da6c0  str      x8, [sp]
004da6c4  adrp     x9, #0xf04000
004da6c8  add      x9, x9, #0x680
004da6cc  lsr      x8, x9, #0x21
004da6d0  orr      x10, x8, x9
004da6d4  orn      x8, x8, x9
004da6d8  add      x8, x8, x9
004da6dc  mvn      x8, x8
004da6e0  add      x8, x10, x8
004da6e4  mov      x10, #0x8ccd
004da6e8  movk     x10, #0xed55, lsl #16
004da6ec  movk     x10, #0xafd7, lsl #32
004da6f0  movk     x10, #0xff51, lsl #48
004da6f4  mul      x8, x8, x10
004da6f8  lsr      x10, x8, #0x1d
004da6fc  orr      x11, x8, x10
004da700  mvn      x12, x8
004da704  orn      x8, x10, x8
004da708  sub      x8, x12, x8
004da70c  eor      x10, x11, x8
004da710  and      x8, x11, x8
004da714  add      x8, x10, x8, lsl #1
004da718  ldr      x10, [sp, #8]
004da71c  ldr      x12, [sp]
004da720  mvn      x11, x10
004da724  add      x13, x10, #1
004da728  add      x11, x13, x11, lsl #1
004da72c  add      x14, x11, x12
004da730  orr      x11, x11, x12
004da734  neg      x11, x11
004da738  eor      x15, x14, x11
004da73c  and      x11, x14, x11
004da740  neg      x14, x12
004da744  bic      x16, x14, x10
004da748  orn      x14, x14, x10
004da74c  add      x13, x14, x13
004da750  add      x13, x13, x16
004da754  add      x13, x13, x15
004da758  add      x14, x12, x10
004da75c  add      x11, x14, x11, lsl #2
004da760  add      x13, x11, x13, lsl #1
004da764  mov      x11, #-1
004da768  eor      x15, x11, x12, lsl #1
004da76c  add      x14, x14, x15
004da770  orn      x15, x12, x10
004da774  add      x15, x14, x15
004da778  mvn      x15, x15
004da77c  add      x14, x14, x15
004da780  sub      x10, x12, x10
004da784  add      x10, x10, x14, lsl #2
004da788  sub      x10, x10, x14, lsl #1
004da78c  neg      x12, x10
004da790  sub      x14, x10, #1
004da794  and      x14, x14, x13
004da798  add      x15, x10, x13
004da79c  eor      x16, x10, x13
004da7a0  and      x17, x10, x13
004da7a4  sub      x15, x17, x15
004da7a8  add      x14, x15, x14
004da7ac  add      x14, x16, x14, lsl #1
004da7b0  sub      x10, x13, x10
004da7b4  and      x12, x13, x12
004da7b8  sub      x12, x12, x10
004da7bc  eor      x13, x12, x10
004da7c0  and      x10, x12, x10
004da7c4  lsl      x10, x10, #2
004da7c8  add      x10, x10, x13, lsl #1
004da7cc  orr      x10, x10, #1
004da7d0  eor      x12, x10, x14
004da7d4  and      x10, x10, x14
004da7d8  add      x10, x12, x10, lsl #1
004da7dc  mvn      x12, x10
004da7e0  add      x10, x12, x10, lsl #1
004da7e4  mov      w12, #0xc894
004da7e8  add      x13, x10, x12
004da7ec  orr      x14, x10, x12
004da7f0  neg      x14, x14
004da7f4  eor      x15, x13, x14
004da7f8  and      x13, x13, x14
function 0x505058..0x5051d8 (384 bytes)
00505058  sub      sp, sp, #0x20
0050505c  stp      x29, x30, [sp, #0x10]
00505060  add      x29, sp, #0x10
00505064  adrp     x8, #0xd1c000
00505068  ldr      x8, [x8, #0xd98]
0050506c  adrp     x9, #0xe7f000
00505070  ldr      x9, [x9, #0xaa8]
00505074  sub      x8, x9, x8
00505078  sub      x0, x29, #1
0050507c  blr      x8
00505080  ldp      x29, x30, [sp, #0x10]
00505084  add      sp, sp, #0x20
00505088  ret      
0050508c  sub      sp, sp, #0x10
00505090  mov      x8, sp
00505094  str      x8, [sp, #8]
00505098  add      x8, sp, #8
0050509c  str      x8, [sp]
005050a0  adrp     x9, #0xf04000
005050a4  add      x9, x9, #0x4c0
005050a8  lsr      x8, x9, #0x21
005050ac  orr      x10, x8, x9
005050b0  orn      x8, x8, x9
005050b4  add      x8, x8, x9
005050b8  mvn      x8, x8
005050bc  add      x8, x10, x8
005050c0  mov      x10, #0x8ccd
005050c4  movk     x10, #0xed55, lsl #16
005050c8  movk     x10, #0xafd7, lsl #32
005050cc  movk     x10, #0xff51, lsl #48
005050d0  mul      x8, x8, x10
005050d4  lsr      x10, x8, #0x1d
005050d8  orr      x11, x8, x10
005050dc  mvn      x12, x8
005050e0  orn      x8, x10, x8
005050e4  sub      x8, x12, x8
005050e8  eor      x10, x11, x8
005050ec  and      x8, x11, x8
005050f0  add      x8, x10, x8, lsl #1
005050f4  ldr      x10, [sp, #8]
005050f8  ldr      x11, [sp]
005050fc  bic      x12, x11, x10
00505100  neg      x13, x11
00505104  bic      x14, x13, x10
00505108  add      x15, x11, x10
0050510c  add      x14, x15, x14, lsl #1
00505110  orn      x13, x13, x10
00505114  add      x13, x10, x13
00505118  add      x13, x14, x13, lsl #1
0050511c  add      x13, x13, #2
00505120  lsl      x12, x12, #1
00505124  orn      x14, x12, x13
00505128  add      x14, x13, x14
0050512c  orr      x12, x13, x12
00505130  add      x12, x14, x12
00505134  add      x12, x12, #1
00505138  orr      x13, x11, x10
0050513c  mvn      x14, x11
00505140  add      x11, x11, x14, lsl #1
00505144  add      x14, x11, #1
00505148  orr      x10, x14, x10
0050514c  eon      x14, x11, x10
00505150  bic      x10, x10, x11
00505154  add      x10, x14, x10, lsl #1
00505158  neg      x11, x10
0050515c  bic      x14, x11, x13
00505160  add      x15, x10, x13
00505164  add      x14, x15, x14, lsl #1
00505168  orr      x11, x13, x11
0050516c  sub      x10, x13, x10
00505170  sub      x10, x10, x11
00505174  add      x10, x14, x10, lsl #1
00505178  mvn      x11, x10
0050517c  add      x10, x10, x11, lsl #1
00505180  add      x10, x10, #1
00505184  orn      x11, x10, x12
00505188  add      x11, x12, x11
0050518c  orr      x10, x10, x12
00505190  add      x10, x11, x10
00505194  add      x10, x10, #1
00505198  eor      x11, x10, #2
0050519c  lsl      x10, x10, #1
005051a0  and      x10, x10, #4
005051a4  add      x10, x10, x11
005051a8  mvn      x11, x10
005051ac  add      x11, x11, x10, lsl #1
005051b0  mov      w12, #0xc1c9
005051b4  and      x12, x11, x12
005051b8  neg      x13, x10
005051bc  add      w14, w10, w13, lsl #1
005051c0  mov      x15, #-0xc1ca
005051c4  orr      x14, x14, x15
005051c8  mov      w15, #0xc1cb
005051cc  add      x15, x11, x15
005051d0  add      x14, x15, x14
005051d4  eor      x15, x14, x12
function 0x506500..0x506680 (384 bytes)
00506500  sub      sp, sp, #0x20
00506504  stp      x29, x30, [sp, #0x10]
00506508  add      x29, sp, #0x10
0050650c  adrp     x8, #0xd1c000
00506510  ldr      x8, [x8, #0xdc8]
00506514  adrp     x9, #0xe7f000
00506518  ldr      x9, [x9, #0xad8]
0050651c  sub      x8, x9, x8
00506520  sub      x0, x29, #1
00506524  blr      x8
00506528  ldp      x29, x30, [sp, #0x10]
0050652c  add      sp, sp, #0x20
00506530  ret      
00506534  adrp     x8, #0xf00000
00506538  ldrb     w9, [x8, #0xd18]
0050653c  mvn      w10, w9
00506540  add      w10, w9, w10, lsl #1
00506544  add      w10, w10, #1
00506548  orr      w10, w10, #1
0050654c  add      w9, w10, w9
00506550  mov      w10, #0xff
00506554  bics     wzr, w10, w9
00506558  b.eq     #0x506560
0050655c  ret      
00506560  mov      w9, #1
00506564  strb     w9, [x8, #0xd18]
00506568  adrp     x8, #0xf0c000
0050656c  add      x8, x8, #0x948
00506570  ldr      w9, [x8]
00506574  eor      w10, w9, #2
00506578  lsl      w9, w9, #1
0050657c  and      w9, w9, #4
00506580  add      w9, w10, w9
00506584  sub      w9, w9, #1
00506588  str      w9, [x8]
0050658c  adrp     x8, #0xf00000
00506590  str      w9, [x8, #0xd10]
00506594  ret      
00506598  stp      x22, x21, [sp, #-0x30]!
0050659c  stp      x20, x19, [sp, #0x10]
005065a0  stp      x29, x30, [sp, #0x20]
005065a4  add      x29, sp, #0x20
005065a8  mov      w9, #0xdcd0
005065ac  adrp     x16, #0xe5c000
005065b0  ldr      x16, [x16, #0xd0]
005065b4  blr      x16
005065b8  sub      sp, sp, #0xd, lsl #12
005065bc  sub      sp, sp, #0xcd0
005065c0  adrp     x8, #0xe5c000
005065c4  ldr      x8, [x8, #0xd8]
005065c8  ldr      x8, [x8]
005065cc  stur     x8, [x29, #-0x28]
005065d0  bl       #0x4a7838
005065d4  bl       #0x4f45e0
005065d8  bl       #0x4cae40
005065dc  bl       #0x4e38f8
005065e0  adrp     x8, #0xd1f000
005065e4  ldr      q0, [x8, #0xc0]
005065e8  adrp     x8, #0xd1f000
005065ec  ldr      q1, [x8, #0xd0]
005065f0  stp      q0, q1, [sp, #0x20]
005065f4  adrp     x8, #0xd1f000
005065f8  ldr      q0, [x8, #0xe0]
005065fc  str      q0, [sp, #0x40]
00506600  adrp     x8, #0xd1e000
00506604  ldr      d0, [x8, #0xf58]
00506608  str      d0, [sp, #0x50]
0050660c  adrp     x8, #0xd1e000
00506610  ldr      d0, [x8, #0xf60]
00506614  str      s0, [sp, #0x58]
00506618  mov      w8, #0xf58a
0050661c  strh     w8, [sp, #0x5c]
00506620  stur     wzr, [sp, #0x5e]
00506624  strh     wzr, [sp, #0x62]
00506628  str      xzr, [sp]
0050662c  ldr      x8, [sp]
00506630  cmp      x8, #0x43
00506634  b.hi     #0x5066e4
00506638  add      x8, sp, #0x20
0050663c  mov      w9, #0x6217
00506640  movk     w9, #0x38e1, lsl #16
00506644  mov      w10, #0xe8
00506648  mov      w11, #0xa2be
0050664c  movk     w11, #0xe3ac, lsl #16
00506650  mov      w12, #0xbe
00506654  ldr      x13, [sp]
00506658  ldrb     w13, [x8, x13]
0050665c  ldr      x14, [sp]
00506660  add      w15, w14, w9
00506664  add      w16, w15, w13
00506668  sub      w14, w10, w14
0050666c  and      w13, w14, w13
00506670  neg      w14, w15
00506674  sub      w13, w14, w13
00506678  eor      w14, w16, w13
0050667c  and      w13, w16, w13
function 0x50c658..0x50c7d8 (384 bytes)
0050c658  stp      x28, x27, [sp, #-0x60]!
0050c65c  stp      x26, x25, [sp, #0x10]
0050c660  stp      x24, x23, [sp, #0x20]
0050c664  stp      x22, x21, [sp, #0x30]
0050c668  stp      x20, x19, [sp, #0x40]
0050c66c  stp      x29, x30, [sp, #0x50]
0050c670  add      x29, sp, #0x50
0050c674  sub      sp, sp, #0x60
0050c678  adrp     x8, #0xe5c000
0050c67c  ldr      x8, [x8, #0xd8]
0050c680  ldr      x8, [x8]
0050c684  stur     x8, [x29, #-0x58]
0050c688  sub      x8, x29, #0xa0
0050c68c  stur     x8, [x29, #-0x98]
0050c690  sub      x8, x29, #0x98
0050c694  stur     x8, [x29, #-0xa0]
0050c698  adrp     x8, #0xd1f000
0050c69c  ldr      x8, [x8, #0x150]
0050c6a0  adrp     x9, #0xe81000
0050c6a4  ldr      x9, [x9, #0xd30]
0050c6a8  sub      x8, x9, x8
0050c6ac  blr      x8
0050c6b0  mov      w8, #0xb6b
0050c6b4  movk     w8, #0xdb84, lsl #16
0050c6b8  mov      w12, #0xf494
0050c6bc  movk     w12, #0x247b, lsl #16
0050c6c0  mov      x9, #0x9fd7
0050c6c4  movk     x9, #0xfd26, lsl #16
0050c6c8  movk     x9, #0xcb6a, lsl #32
0050c6cc  movk     x9, #0x1811, lsl #48
0050c6d0  mov      x10, #0x664
0050c6d4  movk     x10, #0x6b4, lsl #16
0050c6d8  movk     x10, #0x4db2, lsl #32
0050c6dc  movk     x10, #0x7fa2, lsl #48
0050c6e0  stp      x9, x10, [x29, #-0x90]
0050c6e4  mov      x9, #0xfdd6
0050c6e8  movk     x9, #0x6769, lsl #16
0050c6ec  movk     x9, #0x5a86, lsl #32
0050c6f0  movk     x9, #0x92be, lsl #48
0050c6f4  mov      x10, #0xa2d2
0050c6f8  movk     x10, #0x3ce2, lsl #16
0050c6fc  movk     x10, #0x1a4a, lsl #32
0050c700  movk     x10, #0xe55f, lsl #48
0050c704  stp      x9, x10, [x29, #-0x70]
0050c708  mov      x9, #0xd53
0050c70c  movk     x9, #0xf62d, lsl #16
0050c710  movk     x9, #0xe983, lsl #32
0050c714  movk     x9, #0xe3e3, lsl #48
0050c718  mov      x10, #0xa4d4
0050c71c  movk     x10, #0x3a56, lsl #16
0050c720  movk     x10, #0x57f8, lsl #32
0050c724  movk     x10, #0x9afd, lsl #48
0050c728  stp      x9, x10, [x29, #-0x80]
0050c72c  sub      x9, x29, #0x70
0050c730  sub      x10, x29, #0x80
0050c734  sub      x11, x29, #0x90
0050c738  ldr      q0, [x11]
0050c73c  ldr      q1, [x9]
0050c740  eor      v0.16b, v1.16b, v0.16b
0050c744  str      q0, [x11]
0050c748  ldr      q1, [x10]
0050c74c  eor      v0.16b, v1.16b, v0.16b
0050c750  stur     x11, [x29, #-0xa8]
0050c754  str      q0, [x11]
0050c758  mov      w9, #4
0050c75c  adrp     x16, #0xe5c000
0050c760  ldr      x16, [x16, #0xd0]
0050c764  blr      x16
0050c768  mov      x13, sp
0050c76c  sub      x28, x13, #0x10
0050c770  mov      sp, x28
0050c774  mov      w9, #4
0050c778  adrp     x16, #0xe5c000
0050c77c  ldr      x16, [x16, #0xd0]
0050c780  blr      x16
0050c784  sub      x19, sp, #0x10
0050c788  mov      sp, x19
0050c78c  mov      w9, #4
0050c790  adrp     x16, #0xe5c000
0050c794  ldr      x16, [x16, #0xd0]
0050c798  blr      x16
0050c79c  sub      x23, sp, #0x10
0050c7a0  mov      sp, x23
0050c7a4  mov      w10, #-1
0050c7a8  ldur     w9, [x29, #-0x98]
0050c7ac  mov      w27, #-1
0050c7b0  eor      w10, w10, w9, lsl #1
0050c7b4  ldur     w11, [x29, #-0xa0]
0050c7b8  add      w14, w9, w11
0050c7bc  add      w10, w14, w10
0050c7c0  mvn      w14, w10
0050c7c4  orn      w15, w9, w11
0050c7c8  sub      w14, w14, w15
0050c7cc  eor      w15, w14, w10
0050c7d0  and      w10, w14, w10
0050c7d4  sub      w14, w9, w11
function 0x51d108..0x51d288 (384 bytes)
0051d108  sub      sp, sp, #0x30
0051d10c  stp      x29, x30, [sp, #0x20]
0051d110  add      x29, sp, #0x20
0051d114  add      x8, sp, #8
0051d118  str      x8, [sp, #0x10]
0051d11c  add      x8, sp, #0x10
0051d120  str      x8, [sp, #8]
0051d124  adrp     x8, #0xf04000
0051d128  ldrb     w9, [x8, #0x7f0]
0051d12c  add      w10, w9, #1
0051d130  orr      w9, w9, #1
0051d134  neg      w9, w9
0051d138  eor      w11, w10, w9
0051d13c  and      w9, w10, w9
0051d140  neg      w9, w9, lsl #1
0051d144  and      w9, w9, #0xfe
0051d148  cmp      w9, w11, uxtb
0051d14c  b.ne     #0x51d17c
0051d150  mov      w9, #1
0051d154  strb     w9, [x8, #0x7f0]
0051d158  adrp     x8, #0xd22000
0051d15c  ldr      x8, [x8, #0xaf0]
0051d160  adrp     x9, #0xe81000
0051d164  ldr      x9, [x9, #0xed0]
0051d168  sub      x8, x9, x8
0051d16c  sub      x0, x29, #1
0051d170  blr      x8
0051d174  adrp     x8, #0xf04000
0051d178  str      w0, [x8, #0x7e8]
0051d17c  ldp      x29, x30, [sp, #0x20]
0051d180  add      sp, sp, #0x30
0051d184  ret      
0051d188  adrp     x8, #0xf04000
0051d18c  ldrb     w9, [x8, #0x7e0]
0051d190  mvn      w10, w9
0051d194  add      w10, w9, w10, lsl #1
0051d198  and      w9, w9, #1
0051d19c  add      w9, w10, w9
0051d1a0  add      w9, w9, #1
0051d1a4  eon      w11, w10, w9
0051d1a8  bic      w9, w9, w10
0051d1ac  neg      w9, w9, lsl #1
0051d1b0  and      w9, w9, #0xfe
0051d1b4  cmp      w9, w11, uxtb
0051d1b8  b.ne     #0x51d32c
0051d1bc  mov      w9, #1
0051d1c0  strb     w9, [x8, #0x7e0]
0051d1c4  adrp     x11, #0xf04000
0051d1c8  add      x11, x11, #0x7f8
0051d1cc  lsr      x8, x11, #0x21
0051d1d0  mvn      x9, x11
0051d1d4  add      x9, x11, x9, lsl #1
0051d1d8  add      x9, x9, #1
0051d1dc  and      x9, x8, x9
0051d1e0  sub      x8, x11, x8
0051d1e4  add      x8, x8, x9, lsl #1
0051d1e8  mov      x9, #0x8ccd
0051d1ec  movk     x9, #0xed55, lsl #16
0051d1f0  movk     x9, #0xafd7, lsl #32
0051d1f4  movk     x9, #0xff51, lsl #48
0051d1f8  mul      x9, x8, x9
0051d1fc  lsr      x10, x9, #0x1d
0051d200  orr      x8, x10, x9
0051d204  orn      x10, x10, x9
0051d208  add      x10, x10, x9
0051d20c  mvn      x9, x10
0051d210  add      x9, x8, x9
0051d214  mov      w12, #0xffff
0051d218  add      w12, w9, w12
0051d21c  eor      w13, w12, #1
0051d220  ubfiz    w12, w12, #1, #1
0051d224  add      w12, w12, w13
0051d228  adrp     x13, #0xf04000
0051d22c  strh     w12, [x13, #0x7fa]
0051d230  lsr      x12, x9, #0x10
0051d234  adrp     x14, #0xf04000
0051d238  strh     w12, [x14, #0x7fc]
0051d23c  lsr      x12, x9, #0x20
0051d240  adrp     x15, #0xf04000
0051d244  strh     w12, [x15, #0x7fe]
0051d248  lsr      x12, x9, #0x30
0051d24c  adrp     x16, #0xf04000
0051d250  strh     w12, [x16, #0x800]
0051d254  ldrh     w12, [x11]
0051d258  ldrh     w13, [x13, #0x7fa]
0051d25c  mvn      w17, w12
0051d260  add      w17, w12, w17, lsl #1
0051d264  add      w17, w17, #1
0051d268  and      w17, w17, w13
0051d26c  sub      w12, w12, w13
0051d270  add      w12, w12, w17, lsl #1
0051d274  strh     w12, [x11]
0051d278  adrp     x11, #0xf04000
0051d27c  ldrh     w12, [x11, #0x802]
0051d280  ldrh     w13, [x14, #0x7fc]
0051d284  mvn      w14, w12
function 0x54fbb8..0x54fd38 (384 bytes)
0054fbb8  sub      sp, sp, #0x20
0054fbbc  stp      x29, x30, [sp, #0x10]
0054fbc0  add      x29, sp, #0x10
0054fbc4  adrp     x8, #0xd23000
0054fbc8  ldr      x8, [x8, #0x2a8]
0054fbcc  adrp     x9, #0xe82000
0054fbd0  ldr      x9, [x9, #0x588]
0054fbd4  sub      x8, x9, x8
0054fbd8  sub      x0, x29, #1
0054fbdc  blr      x8
0054fbe0  ldp      x29, x30, [sp, #0x10]
0054fbe4  add      sp, sp, #0x20
0054fbe8  ret      
0054fbec  sub      sp, sp, #0x20
0054fbf0  stp      x29, x30, [sp, #0x10]
0054fbf4  add      x29, sp, #0x10
0054fbf8  adrp     x8, #0xd23000
0054fbfc  ldr      x8, [x8, #0x2b0]
0054fc00  adrp     x9, #0xe82000
0054fc04  ldr      x9, [x9, #0x590]
0054fc08  sub      x8, x9, x8
0054fc0c  sub      x0, x29, #1
0054fc10  blr      x8
0054fc14  ldp      x29, x30, [sp, #0x10]
0054fc18  add      sp, sp, #0x20
0054fc1c  ret      
0054fc20  sub      sp, sp, #0x20
0054fc24  stp      x29, x30, [sp, #0x10]
0054fc28  add      x29, sp, #0x10
0054fc2c  adrp     x8, #0xd23000
0054fc30  ldr      x8, [x8, #0x2a0]
0054fc34  adrp     x9, #0xe82000
0054fc38  ldr      x9, [x9, #0x580]
0054fc3c  sub      x8, x9, x8
0054fc40  sub      x0, x29, #1
0054fc44  blr      x8
0054fc48  ldp      x29, x30, [sp, #0x10]
0054fc4c  add      sp, sp, #0x20
0054fc50  ret      
0054fc54  sub      sp, sp, #0x30
0054fc58  stp      x29, x30, [sp, #0x20]
0054fc5c  add      x29, sp, #0x20
0054fc60  add      x8, sp, #8
0054fc64  str      x8, [sp, #0x10]
0054fc68  add      x8, sp, #0x10
0054fc6c  str      x8, [sp, #8]
0054fc70  adrp     x8, #0xf04000
0054fc74  ldrb     w9, [x8, #0x880]
0054fc78  ldrb     w10, [sp, #8]
0054fc7c  sub      w11, w10, #0x3a
0054fc80  mov      w12, #0x39
0054fc84  and      w13, w10, w12
0054fc88  mov      w14, #0x3a
0054fc8c  sub      w13, w14, w13
0054fc90  eor      w14, w13, w11
0054fc94  and      w13, w13, w11
0054fc98  sub      w12, w12, w10
0054fc9c  lsl      w13, w13, #2
0054fca0  add      w13, w13, w14, lsl #1
0054fca4  and      w12, w13, w12
0054fca8  orn      w11, w11, w13
0054fcac  sub      w13, w13, w10
0054fcb0  add      w11, w13, w11
0054fcb4  add      w11, w11, w12
0054fcb8  add      w11, w11, #0x3a
0054fcbc  mvn      w12, w11
0054fcc0  add      w12, w11, w12, lsl #1
0054fcc4  add      w12, w12, #1
0054fcc8  orr      w12, w12, w10
0054fccc  orr      w10, w11, w10
0054fcd0  sub      w10, w10, w11
0054fcd4  sub      w10, w10, w12
0054fcd8  and      w11, w10, #1
0054fcdc  orr      w10, w10, #1
0054fce0  add      w10, w10, w11
0054fce4  sub      w10, w10, #2
0054fce8  eor      w11, w10, #2
0054fcec  lsl      w12, w10, #1
0054fcf0  and      w13, w12, #4
0054fcf4  add      w11, w13, w11
0054fcf8  mvn      w13, w10
0054fcfc  eor      w10, w10, #1
0054fd00  and      w12, w12, #2
0054fd04  add      w10, w10, w13, lsl #1
0054fd08  add      w10, w10, #1
0054fd0c  add      w12, w10, w12
0054fd10  lsl      w12, w12, #1
0054fd14  neg      w13, w12
0054fd18  and      w13, w13, #0xfffffffc
0054fd1c  bfxil    w12, w10, #0, #1
0054fd20  add      w10, w12, w13
0054fd24  eor      w12, w10, w11
0054fd28  and      w10, w10, w11
0054fd2c  add      w10, w12, w10, lsl #1
0054fd30  sub      w11, w10, #1
0054fd34  orr      w12, w11, #1
function 0x5507c4..0x550944 (384 bytes)
005507c4  sub      sp, sp, #0x30
005507c8  stp      x29, x30, [sp, #0x20]
005507cc  add      x29, sp, #0x20
005507d0  add      x8, sp, #8
005507d4  str      x8, [sp, #0x10]
005507d8  add      x8, sp, #0x10
005507dc  str      x8, [sp, #8]
005507e0  adrp     x8, #0xf04000
005507e4  ldrb     w9, [x8, #0x920]
005507e8  ldrb     w10, [sp, #8]
005507ec  add      w10, w9, #1
005507f0  orr      w9, w9, #1
005507f4  neg      w9, w9
005507f8  eor      w11, w10, w9
005507fc  and      w9, w10, w9
00550800  add      w9, w11, w9, lsl #1
00550804  and      w9, w9, #0xff
00550808  ldrb     w10, [sp, #0x10]
0055080c  ldrb     w11, [sp, #8]
00550810  orr      w12, w11, w10
00550814  mvn      w13, w10
00550818  orn      w14, w11, w10
0055081c  sub      w13, w13, w14
00550820  eor      w14, w13, w12
00550824  and      w12, w13, w12
00550828  add      w12, w14, w12, lsl #1
0055082c  orr      w13, w12, w10
00550830  mvn      w14, w12
00550834  orn      w10, w10, w12
00550838  sub      w10, w14, w10
0055083c  eor      w14, w10, w13
00550840  and      w10, w10, w13
00550844  add      w10, w14, w10, lsl #1
00550848  eor      w11, w12, w11
0055084c  mvn      w12, w10
00550850  add      w13, w10, #1
00550854  add      w12, w13, w12, lsl #1
00550858  and      w12, w12, w11
0055085c  orr      w14, w10, w11
00550860  orn      w10, w10, w11
00550864  add      w10, w13, w10
00550868  sub      w10, w10, w14
0055086c  add      w10, w10, w12, lsl #1
00550870  cmp      w9, w10, uxtb
00550874  b.ne     #0x5508a8
00550878  ldrb     w9, [sp, #8]
0055087c  mov      w9, #1
00550880  strb     w9, [x8, #0x920]
00550884  adrp     x8, #0xd23000
00550888  ldr      x8, [x8, #0x680]
0055088c  adrp     x9, #0xe82000
00550890  ldr      x9, [x9, #0x960]
00550894  sub      x8, x9, x8
00550898  sub      x0, x29, #1
0055089c  blr      x8
005508a0  adrp     x8, #0xf04000
005508a4  str      w0, [x8, #0x918]
005508a8  ldp      x29, x30, [sp, #0x20]
005508ac  add      sp, sp, #0x30
005508b0  ret      
005508b4  sub      sp, sp, #0x30
005508b8  stp      x29, x30, [sp, #0x20]
005508bc  add      x29, sp, #0x20
005508c0  add      x8, sp, #8
005508c4  str      x8, [sp, #0x10]
005508c8  add      x8, sp, #0x10
005508cc  str      x8, [sp, #8]
005508d0  adrp     x8, #0xf04000
005508d4  ldrb     w10, [x8, #0x910]
005508d8  eor      w11, w10, #0xfffffffe
005508dc  mov      w9, #1
005508e0  bic      w12, w9, w10
005508e4  add      w11, w12, w11
005508e8  add      w10, w10, #1
005508ec  eor      w12, w11, w10
005508f0  and      w10, w11, w10
005508f4  neg      w10, w10, lsl #1
005508f8  and      w10, w10, #0xfe
005508fc  cmp      w10, w12, uxtb
00550900  b.ne     #0x55092c
00550904  strb     w9, [x8, #0x910]
00550908  adrp     x8, #0xd23000
0055090c  ldr      x8, [x8, #0x678]
00550910  adrp     x9, #0xe82000
00550914  ldr      x9, [x9, #0x958]
00550918  sub      x8, x9, x8
0055091c  sub      x0, x29, #1
00550920  blr      x8
00550924  adrp     x8, #0xf04000
00550928  str      w0, [x8, #0x908]
0055092c  ldp      x29, x30, [sp, #0x20]
00550930  add      sp, sp, #0x30
00550934  ret      
00550938  sub      sp, sp, #0x20
0055093c  mov      x8, sp
00550940  str      x8, [sp, #8]

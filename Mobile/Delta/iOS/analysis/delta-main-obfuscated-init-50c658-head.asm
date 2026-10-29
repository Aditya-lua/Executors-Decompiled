function 0x50c658..0x50cf58 (2304 bytes)
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
0050c7d8  add      w14, w14, w15, lsl #1
0050c7dc  add      w10, w14, w10, lsl #2
0050c7e0  orr      w14, w11, w9
0050c7e4  and      w9, w11, w9
0050c7e8  sub      w9, w14, w9
0050c7ec  neg      w11, w9
0050c7f0  orr      w14, w10, w11
0050c7f4  sub      w9, w9, w10
0050c7f8  add      w9, w9, w14
0050c7fc  eor      w15, w9, w14
0050c800  and      w9, w9, w14
0050c804  add      w9, w15, w9, lsl #1
0050c808  orn      w11, w11, w10
0050c80c  add      w10, w10, #1
0050c810  eor      w14, w11, w10
0050c814  and      w10, w11, w10
0050c818  lsl      w10, w10, #2
0050c81c  add      w10, w10, w14, lsl #1
0050c820  and      w11, w9, w10
0050c824  orr      w9, w9, w10
0050c828  add      w9, w9, w11
0050c82c  bic      w8, w8, w9
0050c830  orr      w10, w9, w12
0050c834  add      w11, w12, w9
0050c838  add      w10, w11, w10
0050c83c  add      w8, w10, w8
0050c840  add      w8, w8, #1
0050c844  and      w10, w15, #1
0050c848  orr      w9, w9, #1
0050c84c  mov      w11, #0x519a
0050c850  movk     w11, #0x566a, lsl #16
0050c854  add      w10, w10, w11
0050c858  add      w9, w9, w10
0050c85c  mvn      w10, w9
0050c860  add      w9, w10, w9, lsl #1
0050c864  stur     w8, [x29, #-0xa0]
0050c868  stur     w9, [x29, #-0x98]
0050c86c  ldur     w8, [x29, #-0xa0]
0050c870  ldur     w9, [x29, #-0x98]
0050c874  mvn      w10, w9
0050c878  add      w8, w8, w10
0050c87c  add      w8, w8, #2
0050c880  add      w9, w8, w9, lsl #1
0050c884  and      w8, w8, #1
0050c888  orr      w9, w9, #1
0050c88c  add      w8, w9, w8
0050c890  sub      w8, w8, #2
0050c894  stur     w8, [x13, #-0x10]
0050c898  mov      w24, #0x50
0050c89c  mov      w25, #0x60
0050c8a0  adrp     x26, #0xe81000
0050c8a4  add      x26, x26, #0xe18
0050c8a8  mov      w22, #-2
0050c8ac  b        #0x50d190
0050c8b0  ldur     x8, [x29, #-0xa8]
0050c8b4  movi     v0.16b, #0
0050c8b8  str      q0, [x8]
0050c8bc  sub      x8, x29, #0x90
0050c8c0  ldur     x8, [x29, #-0x98]
0050c8c4  ldur     x9, [x29, #-0xa0]
0050c8c8  neg      x10, x9
0050c8cc  mvn      x11, x8
0050c8d0  add      x12, x9, x11
0050c8d4  bic      x13, x8, x9
0050c8d8  add      x13, x13, #1
0050c8dc  eor      x14, x13, x12
0050c8e0  and      x12, x13, x12
0050c8e4  eor      x13, x8, x10
0050c8e8  orr      x10, x8, x10
0050c8ec  add      x10, x9, x10
0050c8f0  sub      x10, x8, x10
0050c8f4  lsl      x12, x12, #2
0050c8f8  add      x12, x12, x14, lsl #1
0050c8fc  add      x10, x13, x10, lsl #1
0050c900  orn      x13, x12, x10
0050c904  add      x13, x10, x13
0050c908  orr      x10, x10, x12
0050c90c  add      x10, x13, x10
0050c910  add      x10, x10, #1
0050c914  add      x12, x10, x8
0050c918  add      x13, x8, #1
0050c91c  add      x11, x13, x11, lsl #1
0050c920  orn      x14, x10, x11
0050c924  orr      x8, x10, x8
0050c928  neg      x15, x8
0050c92c  and      x15, x12, x15
0050c930  sub      x8, x8, #1
0050c934  eor      x8, x8, x12
0050c938  sub      x8, x8, x15, lsl #1
0050c93c  add      x11, x13, x11
0050c940  add      x11, x11, x14
0050c944  add      x8, x11, x8
0050c948  add      x11, x8, #1
0050c94c  orr      x12, x10, x9
0050c950  add      x9, x10, x9
0050c954  neg      x10, x12
0050c958  and      x10, x9, x10
0050c95c  sub      x13, x12, #1
0050c960  eor      x9, x13, x9
0050c964  sub      x9, x9, x10, lsl #1
0050c968  add      x9, x9, x12
0050c96c  add      x10, x9, #1
0050c970  eor      x12, x10, x11
0050c974  mov      x15, #-2
0050c978  sub      x13, x15, x8
0050c97c  orr      x14, x10, x13
0050c980  sub      x9, x15, x9
0050c984  and      x15, x9, x11
0050c988  eor      x16, x10, #1
0050c98c  ubfiz    x17, x10, #1, #1
0050c990  add      x9, x16, x9, lsl #1
0050c994  add      x9, x9, x17
0050c998  orn      x11, x11, x9
0050c99c  add      x9, x9, x11
0050c9a0  lsl      x9, x9, #1
0050c9a4  add      x8, x8, x13, lsl #1
0050c9a8  add      x8, x8, x10
0050c9ac  add      x9, x9, #2
0050c9b0  mov      x10, #-4
0050c9b4  sub      x10, x10, x8
0050c9b8  orr      x10, x9, x10
0050c9bc  add      x10, x8, x10
0050c9c0  add      x8, x8, #3
0050c9c4  orr      x8, x9, x8
0050c9c8  add      x9, x15, x14
0050c9cc  add      x9, x9, x12
0050c9d0  add      x8, x10, x8
0050c9d4  add      x8, x8, #2
0050c9d8  mvn      x8, x8
0050c9dc  add      x8, x8, x9
0050c9e0  mvn      x9, x8
0050c9e4  add      x9, x9, x8, lsl #1
0050c9e8  neg      x10, x8
0050c9ec  orr      x10, x10, #1
0050c9f0  add      x8, x10, x8
0050c9f4  orr      x9, x9, #1
0050c9f8  add      x8, x8, x9
0050c9fc  ldur     w9, [x29, #-0x98]
0050ca00  ldur     w10, [x29, #-0xa0]
0050ca04  mvn      w11, w10
0050ca08  bic      w12, w9, w10
0050ca0c  sub      w13, w10, w9
0050ca10  add      w12, w13, w12
0050ca14  sub      w13, w9, w10
0050ca18  lsl      w12, w12, #1
0050ca1c  orn      w14, w12, w13
0050ca20  add      w14, w13, w14
0050ca24  orr      w12, w12, w13
0050ca28  add      w12, w14, w12
0050ca2c  add      w12, w12, #1
0050ca30  orr      w13, w10, w9
0050ca34  add      w11, w10, w11, lsl #1
0050ca38  add      w11, w11, #1
0050ca3c  orr      w9, w11, w9
0050ca40  add      w9, w9, w10
0050ca44  add      w10, w9, w13
0050ca48  mvn      w11, w9
0050ca4c  bic      w11, w11, w13
0050ca50  add      w10, w10, w11, lsl #1
0050ca54  bic      w9, w13, w9
0050ca58  add      w9, w10, w9, lsl #1
0050ca5c  add      w10, w9, #1
0050ca60  mvn      w11, w12
0050ca64  add      w11, w12, w11, lsl #1
0050ca68  add      w11, w11, #1
0050ca6c  mvn      w13, w11
0050ca70  orn      w13, w13, w9
0050ca74  add      w11, w11, w13
0050ca78  eor      w13, w10, w12
0050ca7c  and      w14, w10, w12
0050ca80  add      w13, w13, w14, lsl #1
0050ca84  add      w11, w13, w11, lsl #1
0050ca88  bic      w9, w9, w12
0050ca8c  sub      w10, w12, w10
0050ca90  add      w9, w10, w9
0050ca94  add      w9, w11, w9, lsl #1
0050ca98  add      w10, w9, #3
0050ca9c  mov      w11, #-5
0050caa0  sub      w11, w11, w9
0050caa4  mov      w12, #0xc288
0050caa8  movk     w12, #0x9f3a, lsl #16
0050caac  orr      w12, w11, w12
0050cab0  add      w9, w9, #5
0050cab4  add      w12, w9, w12
0050cab8  add      w9, w9, w11, lsl #1
0050cabc  mov      w11, #0x3d77
0050cac0  movk     w11, #0x60c5, lsl #16
0050cac4  and      w11, w9, w11
0050cac8  add      w9, w10, w9
0050cacc  sub      w9, w9, w11
0050cad0  add      w9, w9, #2
0050cad4  eor      w11, w9, w12
0050cad8  and      w9, w9, w12
0050cadc  add      w9, w11, w9, lsl #1
0050cae0  sub      w9, w9, #1
0050cae4  lsl      w11, w10, #1
0050cae8  add      w11, w11, #2
0050caec  mov      w12, #0x4b98
0050caf0  movk     w12, #0x34b1, lsl #16
0050caf4  and      w11, w11, w12
0050caf8  eor      w12, w11, w12
0050cafc  add      w10, w11, w10
0050cb00  add      w10, w10, w12
0050cb04  mov      w11, #0x5a34
0050cb08  movk     w11, #0xe5a7, lsl #16
0050cb0c  add      w10, w10, w11
0050cb10  stur     w9, [x29, #-0xa0]
0050cb14  stur     w10, [x29, #-0x98]
0050cb18  ldur     w9, [x29, #-0xa0]
0050cb1c  ldur     w10, [x29, #-0x98]
0050cb20  mvn      w11, w10
0050cb24  eor      w12, w10, #1
0050cb28  ubfiz    w10, w10, #1, #1
0050cb2c  add      w11, w12, w11, lsl #1
0050cb30  add      w10, w11, w10
0050cb34  neg      w11, w10
0050cb38  bic      w12, w11, w9
0050cb3c  orr      w11, w9, w11
0050cb40  sub      w13, w9, w10
0050cb44  sub      w11, w13, w11
0050cb48  add      w9, w9, w10
0050cb4c  add      w9, w9, w12, lsl #1
0050cb50  add      w9, w9, w11, lsl #1
0050cb54  sub      w9, w9, #1
0050cb58  str      w9, [x19]
0050cb5c  ldur     w9, [x29, #-0x98]
0050cb60  ldur     w10, [x29, #-0xa0]
0050cb64  neg      w11, w10
0050cb68  orr      w12, w10, w9
0050cb6c  neg      w13, w9
0050cb70  eor      w14, w12, w13
0050cb74  and      w12, w12, w13
0050cb78  bic      w13, w11, w9
0050cb7c  orr      w11, w9, w11
0050cb80  sub      w15, w9, w10
0050cb84  sub      w11, w15, w11
0050cb88  add      w15, w9, w10
0050cb8c  add      w13, w15, w13, lsl #1
0050cb90  add      w11, w13, w11, lsl #1
0050cb94  lsl      w12, w12, #2
0050cb98  add      w12, w12, w14, lsl #1
0050cb9c  add      w13, w11, w12
0050cba0  and      w14, w11, w12
0050cba4  mvn      w11, w11
0050cba8  orn      w11, w11, w12
0050cbac  add      w12, w13, w14
0050cbb0  add      w11, w12, w11
0050cbb4  add      w12, w11, #1
0050cbb8  eor      w9, w10, w9
0050cbbc  sub      w10, w9, #1
0050cbc0  and      w13, w12, w10
0050cbc4  add      w14, w12, w9
0050cbc8  sub      w13, w13, w14
0050cbcc  add      w13, w14, w13, lsl #1
0050cbd0  bic      w10, w10, w12
0050cbd4  sub      w9, w10, w9
0050cbd8  add      w10, w11, #2
0050cbdc  eor      w11, w9, w10
0050cbe0  and      w9, w9, w10
0050cbe4  lsl      w9, w9, #2
0050cbe8  add      w9, w9, w11, lsl #1
0050cbec  orr      w9, w9, #1
0050cbf0  eor      w10, w9, w13
0050cbf4  and      w9, w9, w13
0050cbf8  add      w11, w10, w9, lsl #1
0050cbfc  sub      w12, w11, #1
0050cc00  mov      w13, #0x8a77
0050cc04  movk     w13, #0xdcd3, lsl #16
0050cc08  eor      w13, w12, w13
0050cc0c  mov      w17, #0x7588
0050cc10  movk     w17, #0x232c, lsl #16
0050cc14  and      w14, w12, w17
0050cc18  eor      w15, w14, w17
0050cc1c  add      w13, w13, w11
0050cc20  add      w13, w13, w15
0050cc24  and      w15, w12, #1
0050cc28  orr      w16, w12, #1
0050cc2c  add      w16, w16, w17
0050cc30  add      w15, w16, w15
0050cc34  sub      w14, w15, w14
0050cc38  eor      w15, w13, w14
0050cc3c  and      w13, w13, w14
0050cc40  add      w13, w15, w13, lsl #1
0050cc44  mvn      w14, w13
0050cc48  add      w13, w14, w13, lsl #1
0050cc4c  mov      w14, #0xd706
0050cc50  movk     w14, #0x838f, lsl #16
0050cc54  bic      w12, w14, w12, lsl #1
0050cc58  neg      w14, w11
0050cc5c  mov      w15, #0xeb83
0050cc60  movk     w15, #0x41c7, lsl #16
0050cc64  orr      w14, w14, w15
0050cc68  add      w9, w9, w11
0050cc6c  add      w9, w9, w14
0050cc70  add      w9, w10, w9, lsl #1
0050cc74  mov      w10, #0x147b
0050cc78  movk     w10, #0xbe38, lsl #16
0050cc7c  add      w10, w12, w10
0050cc80  add      w9, w10, w9
0050cc84  stur     w13, [x29, #-0xa0]
0050cc88  stur     w9, [x29, #-0x98]
0050cc8c  ldur     w9, [x29, #-0xa0]
0050cc90  ldur     w10, [x29, #-0x98]
0050cc94  bic      w11, w9, w10
0050cc98  bic      w12, w10, w9
0050cc9c  orn      w13, w10, w9
0050cca0  add      w9, w9, w9, lsl #1
0050cca4  sub      w12, w12, w10
0050cca8  add      w9, w10, w9
0050ccac  sub      w9, w9, w11
0050ccb0  add      w9, w9, w13
0050ccb4  add      w9, w9, w12, lsl #1
0050ccb8  add      w9, w9, #1
0050ccbc  str      w9, [x23]
0050ccc0  ldr      w10, [x19]
0050ccc4  ldr      w9, [x23]
0050ccc8  ldur     w11, [x29, #-0x98]
0050cccc  ldur     w12, [x29, #-0xa0]
0050ccd0  mvn      w13, w11
0050ccd4  eor      w14, w11, #1
0050ccd8  ubfiz    w15, w11, #1, #1
0050ccdc  lsl      w13, w13, #1
0050cce0  add      w14, w14, w15
0050cce4  add      w14, w13, w14
0050cce8  mvn      w15, w14
0050ccec  add      w14, w14, w15, lsl #1
0050ccf0  add      w15, w14, #1
0050ccf4  orr      w15, w15, w12
0050ccf8  eon      w16, w14, w15
0050ccfc  bic      w14, w15, w14
0050cd00  neg      w15, w12
0050cd04  eor      w17, w11, w15
0050cd08  orn      w15, w15, w11
0050cd0c  add      w0, w11, #1
0050cd10  add      w15, w15, w0
0050cd14  add      w15, w17, w15, lsl #1
0050cd18  lsl      w14, w14, #2
0050cd1c  add      w14, w14, w16, lsl #1
0050cd20  and      w16, w14, w15
0050cd24  orr      w14, w15, w14
0050cd28  add      w14, w14, w16
0050cd2c  mvn      w15, w12
0050cd30  add      w12, w12, #1
0050cd34  add      w15, w12, w15, lsl #1
0050cd38  add      w16, w15, w11
0050cd3c  orr      w11, w15, w11
0050cd40  neg      w11, w11
0050cd44  eor      w15, w16, w11
0050cd48  and      w11, w16, w11
0050cd4c  add      w12, w12, w0
0050cd50  add      w12, w12, w13
0050cd54  lsl      w11, w11, #2
0050cd58  add      w11, w11, w15, lsl #1
0050cd5c  orr      w11, w11, #1
0050cd60  eor      w13, w11, w12
0050cd64  and      w11, w11, w12
0050cd68  add      w11, w13, w11, lsl #1
0050cd6c  mov      w12, #1
0050cd70  sub      w12, w12, w11
0050cd74  mvn      w13, w14
0050cd78  sub      w15, w11, #2
0050cd7c  orn      w15, w15, w14
0050cd80  sub      w11, w14, w11
0050cd84  add      w11, w11, w15
0050cd88  add      w11, w11, #2
0050cd8c  orn      w15, w12, w14
0050cd90  sub      w13, w13, w15
0050cd94  eor      w15, w11, w13
0050cd98  and      w11, w11, w13
0050cd9c  add      w11, w15, w11, lsl #1
0050cda0  and      w12, w12, w14
0050cda4  lsl      w12, w12, #1
0050cda8  orn      w13, w12, w11
0050cdac  add      w13, w11, w13
0050cdb0  orr      w11, w11, w12
0050cdb4  add      w11, w13, w11
0050cdb8  add      w12, w11, #1
0050cdbc  mvn      w13, w12
0050cdc0  add      w11, w11, #2
0050cdc4  add      w14, w11, w13, lsl #1
0050cdc8  mvn      w15, w14
0050cdcc  orr      w15, w15, #0xfffffffc
0050cdd0  add      w14, w12, w14
0050cdd4  add      w14, w14, w15
0050cdd8  add      w14, w14, #5
0050cddc  orr      w15, w12, #3
0050cde0  add      w15, w15, #1
0050cde4  eor      w16, w14, w15
0050cde8  and      w14, w14, w15
0050cdec  add      w14, w16, w14, lsl #1
0050cdf0  mvn      w15, w14
0050cdf4  add      w14, w15, w14, lsl #1
0050cdf8  mov      w15, #0xe0
0050cdfc  bic      w15, w15, w12, lsl #1
0050ce00  orr      w13, w13, #0x70
0050ce04  add      w11, w11, w13
0050ce08  add      w12, w15, w12
0050ce0c  add      w11, w12, w11, lsl #1
0050ce10  sub      w11, w11, #0x71
0050ce14  stur     w14, [x29, #-0xa0]
0050ce18  stur     w11, [x29, #-0x98]
0050ce1c  ldur     w11, [x29, #-0xa0]
0050ce20  ldur     w12, [x29, #-0x98]
0050ce24  add      w13, w12, w11
0050ce28  mvn      w14, w12
0050ce2c  add      w14, w12, w14, lsl #1
0050ce30  add      w14, w14, #1
0050ce34  orn      w14, w14, w11
0050ce38  orr      w11, w11, w12
0050ce3c  sub      w11, w14, w11
0050ce40  add      w11, w11, w13, lsl #1
0050ce44  add      w11, w11, #1
0050ce48  orr      w12, w11, w10
0050ce4c  sub      w13, w11, w10
0050ce50  orn      w11, w10, w11
0050ce54  add      w11, w13, w11
0050ce58  add      w10, w10, #1
0050ce5c  eor      w13, w11, w10
0050ce60  and      w10, w11, w10
0050ce64  add      w10, w13, w10, lsl #1
0050ce68  neg      w10, w10
0050ce6c  eor      w11, w10, w12
0050ce70  and      w10, w10, w12
0050ce74  add      w10, w11, w10, lsl #1
0050ce78  ldur     w11, [x29, #-0x98]
0050ce7c  ldur     w12, [x29, #-0xa0]
0050ce80  mvn      w13, w12
0050ce84  and      w14, w12, w11
0050ce88  eor      w15, w12, #1
0050ce8c  ubfiz    w16, w12, #1, #1
0050ce90  add      w13, w15, w13, lsl #1
0050ce94  add      w13, w13, w16
0050ce98  and      w13, w13, w11
0050ce9c  sub      w15, w12, w11
0050cea0  add      w13, w15, w13, lsl #1
0050cea4  mvn      w16, w13
0050cea8  eor      w13, w13, #1
0050ceac  ubfiz    w15, w15, #1, #1
0050ceb0  orr      w11, w11, w12
0050ceb4  sub      w11, w11, w14
0050ceb8  add      w11, w11, w15
0050cebc  add      w11, w11, w16, lsl #1
0050cec0  add      w11, w11, w13
0050cec4  add      w11, w11, #1
0050cec8  mov      w12, #-0x46
0050cecc  orr      w12, w11, w12
0050ced0  add      w12, w12, #0x46
0050ced4  mov      w13, #0x45
0050ced8  and      w13, w11, w13
0050cedc  add      w13, w11, w13
0050cee0  mov      w14, #-0x8b
0050cee4  orr      w14, w14, w11, lsl #1
0050cee8  sub      w13, w13, w14
0050ceec  sub      w13, w13, #0x45
0050cef0  eor      w14, w12, w13
0050cef4  and      w12, w12, w13
0050cef8  add      w12, w14, w12, lsl #1
0050cefc  sub      w12, w12, #1
0050cf00  mov      w14, #0x14
0050cf04  eor      w13, w11, w14
0050cf08  orn      w14, w14, w11
0050cf0c  add      w14, w11, w14
0050cf10  add      w13, w13, w14, lsl #1
0050cf14  add      w13, w13, #2
0050cf18  orr      w13, w13, #1
0050cf1c  orr      w11, w11, #0xfffffffe
0050cf20  add      w11, w11, w13
0050cf24  stur     w12, [x29, #-0xa0]
0050cf28  stur     w11, [x29, #-0x98]
0050cf2c  ldur     w11, [x29, #-0xa0]
0050cf30  ldur     w12, [x29, #-0x98]
0050cf34  add      w13, w12, #1
0050cf38  bic      w14, w13, w11
0050cf3c  and      w13, w13, w11
0050cf40  sub      w11, w11, w12
0050cf44  add      w12, w11, w13, lsl #1
0050cf48  add      w12, w12, w14, lsl #1
0050cf4c  eor      w13, w12, #0xfffffffe
0050cf50  ubfiz    w11, w11, #1, #1
0050cf54  add      w12, w13, w12, lsl #1

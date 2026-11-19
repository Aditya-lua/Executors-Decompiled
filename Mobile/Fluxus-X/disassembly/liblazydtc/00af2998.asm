; FUN_00af2998 @ 00af2998
00af2998	stp x28,x27,[sp, #-0x60]!
00af299c	stp x26,x25,[sp, #0x10]
00af29a0	stp x24,x23,[sp, #0x20]
00af29a4	stp x22,x21,[sp, #0x30]
00af29a8	stp x20,x19,[sp, #0x40]
00af29ac	stp x29,x30,[sp, #0x50]
00af29b0	add x29,sp,#0x50
00af29b4	mov x19,x5
00af29b8	mov x20,x4
00af29bc	mov w21,w3
00af29c0	mov x22,x2
00af29c4	mov x24,x1
00af29c8	mov x23,x0
00af29cc	bl 0x00c404d0
00af29d0	mov x25,x0
00af29d4	mov x0,x24
00af29d8	mov x1,x20
00af29dc	mov x2,x19
00af29e0	mov x3,xzr
00af29e4	mov x4,xzr
00af29e8	mov x5,xzr
00af29ec	mov x6,xzr
00af29f0	mov x7,xzr
00af29f4	bl 0x00c40320
00af29f8	cbz x0,0x00af2ab4
00af29fc	mov x24,x0
00af2a00	cbz x22,0x00af2a10
00af2a04	mov x0,x24
00af2a08	mov x1,x22
00af2a0c	bl 0x00c40310
00af2a10	mov w28,wzr
00af2a14	sub w26,w21,#0x1
00af2a18	mov x0,x24
00af2a1c	bl 0x00c34e90
00af2a20	cbz x0,0x00af2ac8
00af2a24	mov x27,x0
00af2a28	bl 0x00c34e50
00af2a2c	cmp w0,#0x6
00af2a30	b.eq 0x00af2a74
00af2a34	cmp w0,#0x5
00af2a38	b.eq 0x00af2a8c
00af2a3c	cmp w0,#0x1
00af2a40	b.ne 0x00af2abc
00af2a44	cmp w21,#0x1
00af2a48	b.lt 0x00af2abc
00af2a4c	mov x0,x27
00af2a50	bl 0x00c34e40
00af2a54	mov x1,x0
00af2a58	mov x0,x23
00af2a5c	mov x2,x22
00af2a60	mov w3,w26
00af2a64	mov x4,x20
00af2a68	mov x5,x19
00af2a6c	bl 0x00af2998
00af2a70	b 0x00af2aa0
00af2a74	mov x0,x27
00af2a78	bl 0x00c40260
00af2a7c	mov x1,x0
00af2a80	mov x0,x25
00af2a84	bl 0x00c32bf0
00af2a88	b 0x00af2aa0
00af2a8c	mov x0,x27
00af2a90	bl 0x00c34e30
00af2a94	mov x1,x0
00af2a98	mov x0,x25
00af2a9c	bl 0x00c31a80
00af2aa0	mov w28,w0
00af2aa4	mov x0,x27
00af2aa8	bl 0x00c34e20
00af2aac	cbnz w28,0x00af2a18
00af2ab0	b 0x00af2ac8
00af2ab4	mov w28,wzr
00af2ab8	b 0x00af2ad0
00af2abc	mov x0,x27
00af2ac0	bl 0x00c34e20
00af2ac4	mov w28,wzr
00af2ac8	mov x0,x24
00af2acc	bl 0x00c34e60
00af2ad0	ldp x29,x30,[sp, #0x50]
00af2ad4	ldp x20,x19,[sp, #0x40]
00af2ad8	ldp x22,x21,[sp, #0x30]
00af2adc	ldp x24,x23,[sp, #0x20]
00af2ae0	ldp x26,x25,[sp, #0x10]
00af2ae4	mov w0,w28
00af2ae8	ldp x28,x27,[sp], #0x60
00af2aec	ret

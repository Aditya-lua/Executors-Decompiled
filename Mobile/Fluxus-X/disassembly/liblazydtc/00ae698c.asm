; SRP_Calc_B_ex @ 00ae698c
00ae698c	stp x28,x27,[sp, #-0x60]!
00ae6990	stp x20,x19,[sp, #0x40]
00ae6994	mov x19,xzr
00ae6998	stp x26,x25,[sp, #0x10]
00ae699c	stp x24,x23,[sp, #0x20]
00ae69a0	stp x22,x21,[sp, #0x30]
00ae69a4	stp x29,x30,[sp, #0x50]
00ae69a8	add x29,sp,#0x50
00ae69ac	cbz x0,0x00ae6ac8
00ae69b0	mov x23,x1
00ae69b4	cbz x1,0x00ae6ac8
00ae69b8	mov x27,x2
00ae69bc	cbz x2,0x00ae6ac8
00ae69c0	mov x25,x3
00ae69c4	cbz x3,0x00ae6ac8
00ae69c8	mov x28,x0
00ae69cc	mov x0,x4
00ae69d0	mov x24,x5
00ae69d4	mov x26,x4
00ae69d8	bl 0x00c38a60
00ae69dc	cbz x0,0x00ae6a80
00ae69e0	mov x20,x0
00ae69e4	bl 0x00c37710
00ae69e8	mov x21,x0
00ae69ec	cbz x0,0x00ae6a88
00ae69f0	bl 0x00c37710
00ae69f4	mov x22,x0
00ae69f8	cbz x0,0x00ae6a8c
00ae69fc	bl 0x00c37710
00ae6a00	mov x19,x0
00ae6a04	cbz x0,0x00ae6a90
00ae6a08	mov x0,x22
00ae6a0c	mov x1,x27
00ae6a10	mov x2,x28
00ae6a14	mov x3,x23
00ae6a18	mov x4,x20
00ae6a1c	bl 0x00c38ad0
00ae6a20	cbz w0,0x00ae6a98
00ae6a24	mov x0,x23
00ae6a28	mov x1,x27
00ae6a2c	mov x2,x23
00ae6a30	mov x3,x26
00ae6a34	mov x4,x24
00ae6a38	bl 0x00ae6724
00ae6a3c	mov x24,x0
00ae6a40	cbz x0,0x00ae6a9c
00ae6a44	mov x0,x21
00ae6a48	mov x1,x25
00ae6a4c	mov x2,x24
00ae6a50	mov x3,x23
00ae6a54	mov x4,x20
00ae6a58	bl 0x00c38ef0
00ae6a5c	cbz w0,0x00ae6a9c
00ae6a60	mov x0,x19
00ae6a64	mov x1,x22
00ae6a68	mov x2,x21
00ae6a6c	mov x3,x23
00ae6a70	mov x4,x20
00ae6a74	bl 0x00c38eb0
00ae6a78	cbnz w0,0x00ae6aa8
00ae6a7c	b 0x00ae6a9c
00ae6a80	mov x19,xzr
00ae6a84	b 0x00ae6ac8
00ae6a88	mov x22,xzr
00ae6a8c	mov x19,xzr
00ae6a90	mov x24,xzr
00ae6a94	b 0x00ae6aa8
00ae6a98	mov x24,xzr
00ae6a9c	mov x0,x19
00ae6aa0	bl 0x00c36290
00ae6aa4	mov x19,xzr
00ae6aa8	mov x0,x20
00ae6aac	bl 0x00c38a30
00ae6ab0	mov x0,x21
00ae6ab4	bl 0x00c322e0
00ae6ab8	mov x0,x22
00ae6abc	bl 0x00c322e0
00ae6ac0	mov x0,x24
00ae6ac4	bl 0x00c36290
00ae6ac8	mov x0,x19
00ae6acc	ldp x29,x30,[sp, #0x50]
00ae6ad0	ldp x20,x19,[sp, #0x40]
00ae6ad4	ldp x22,x21,[sp, #0x30]
00ae6ad8	ldp x24,x23,[sp, #0x20]
00ae6adc	ldp x26,x25,[sp, #0x10]
00ae6ae0	ldp x28,x27,[sp], #0x60
00ae6ae4	ret

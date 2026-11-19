; PEM_do_header @ 00ab6950
00ab6950	str x28,[sp, #-0x50]!
00ab6954	stp x24,x23,[sp, #0x10]
00ab6958	stp x22,x21,[sp, #0x20]
00ab695c	stp x20,x19,[sp, #0x30]
00ab6960	stp x29,x30,[sp, #0x40]
00ab6964	add x29,sp,#0x40
00ab6968	sub sp,sp,#0x440
00ab696c	ldr x9,[x2]
00ab6970	mov w10,#0x80000000
00ab6974	cmp x9,x10
00ab6978	stur w9,[x29, #-0x34]
00ab697c	b.lt 0x00ab69b4
00ab6980	bl 0x00c342a0
00ab6984	adrp x0,0x2ce000
00ab6988	adrp x2,0x2bc000
00ab698c	add x0,x0,#0x16c
00ab6990	add x2,x2,#0x2eb
00ab6994	mov w1,#0x1ac
00ab6998	bl 0x00c342b0
00ab699c	mov w0,#0x9
00ab69a0	mov w1,#0x80
00ab69a4	mov x2,xzr
00ab69a8	bl 0x00c342c0
00ab69ac	mov w20,wzr
00ab69b0	b 0x00ab6b20
00ab69b4	ldr x9,[x0]
00ab69b8	mov x22,x0
00ab69bc	cbz x9,0x00ab6a94
00ab69c0	mov x8,x3
00ab69c4	mov x19,x2
00ab69c8	mov x20,x1
00ab69cc	mov x0,sp
00ab69d0	mov w1,#0x400
00ab69d4	mov w2,wzr
00ab69d8	mov x3,x4
00ab69dc	cbz x8,0x00ab6a9c
00ab69e0	blr x8
00ab69e4	mov w21,w0
00ab69e8	tbnz w0,#0x1f,0x00ab6aa8
00ab69ec	mov x23,x22
00ab69f0	ldr x24,[x23], #0x8
00ab69f4	bl 0x00c3d490
00ab69f8	mov x1,x0
00ab69fc	mov x3,sp
00ab6a00	mov w5,#0x1
00ab6a04	sub x6,x29,#0x80
00ab6a08	mov x0,x24
00ab6a0c	mov x2,x23
00ab6a10	mov w4,w21
00ab6a14	mov x7,xzr
00ab6a18	bl 0x00c3ce60
00ab6a1c	cbz w0,0x00ab69ac
00ab6a20	bl 0x00c34b90
00ab6a24	cbz x0,0x00ab69ac
00ab6a28	ldr x1,[x22]
00ab6a2c	sub x3,x29,#0x80
00ab6a30	mov x2,xzr
00ab6a34	mov x4,x23
00ab6a38	mov x21,x0
00ab6a3c	bl 0x00c36320
00ab6a40	cbz w0,0x00ab6ad0
00ab6a44	ldur w4,[x29, #-0x34]
00ab6a48	sub x2,x29,#0x34
00ab6a4c	mov x0,x21
00ab6a50	mov x1,x20
00ab6a54	mov x3,x20
00ab6a58	bl 0x00c36330
00ab6a5c	cbz w0,0x00ab6ad0
00ab6a60	ldursw x8,[x29, #-0x34]
00ab6a64	sub x2,x29,#0x34
00ab6a68	mov x0,x21
00ab6a6c	add x1,x20,x8
00ab6a70	str x8,[x19]
00ab6a74	bl 0x00c3cd10
00ab6a78	cbz w0,0x00ab6ad0
00ab6a7c	ldursw x8,[x29, #-0x34]
00ab6a80	ldr x9,[x19]
00ab6a84	mov w20,w0
00ab6a88	add x8,x9,x8
00ab6a8c	str x8,[x19]
00ab6a90	b 0x00ab6b00
00ab6a94	mov w20,#0x1
00ab6a98	b 0x00ab6b20
00ab6a9c	bl 0x00ab5958
00ab6aa0	mov w21,w0
00ab6aa4	tbz w0,#0x1f,0x00ab69ec
00ab6aa8	bl 0x00c342a0
00ab6aac	adrp x0,0x2ce000
00ab6ab0	adrp x2,0x2bc000
00ab6ab4	add x0,x0,#0x16c
00ab6ab8	add x2,x2,#0x2eb
00ab6abc	mov w1,#0x1b8
00ab6ac0	bl 0x00c342b0
00ab6ac4	mov w0,#0x9
00ab6ac8	mov w1,#0x68
00ab6acc	b 0x00ab69a4
00ab6ad0	bl 0x00c342a0
00ab6ad4	adrp x0,0x2ce000
00ab6ad8	adrp x2,0x2bc000
00ab6adc	add x0,x0,#0x16c
00ab6ae0	add x2,x2,#0x2eb
00ab6ae4	mov w1,#0x1d3
00ab6ae8	bl 0x00c342b0
00ab6aec	mov w0,#0x9
00ab6af0	mov w1,#0x65
00ab6af4	mov x2,xzr
00ab6af8	bl 0x00c342c0
00ab6afc	mov w20,wzr
00ab6b00	mov x0,x21
00ab6b04	bl 0x00c342d0
00ab6b08	mov x0,sp
00ab6b0c	mov w1,#0x400
00ab6b10	bl 0x00c34750
00ab6b14	sub x0,x29,#0x80
00ab6b18	mov w1,#0x40
00ab6b1c	bl 0x00c34750
00ab6b20	mov w0,w20
00ab6b24	add sp,sp,#0x440
00ab6b28	ldp x29,x30,[sp, #0x40]
00ab6b2c	ldp x20,x19,[sp, #0x30]
00ab6b30	ldp x22,x21,[sp, #0x20]
00ab6b34	ldp x24,x23,[sp, #0x10]
00ab6b38	ldr x28,[sp], #0x50
00ab6b3c	ret

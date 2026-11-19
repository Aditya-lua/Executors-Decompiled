; X509_build_chain @ 00b10944
00b10944	sub sp,sp,#0x50
00b10948	stp x24,x23,[sp, #0x10]
00b1094c	stp x22,x21,[sp, #0x20]
00b10950	stp x20,x19,[sp, #0x30]
00b10954	stp x29,x30,[sp, #0x40]
00b10958	add x29,sp,#0x40
00b1095c	str xzr,[sp, #0x8]
00b10960	cbz x0,0x00b10a28
00b10964	mov x23,x1
00b10968	mov x22,x0
00b1096c	mov x0,x4
00b10970	mov x1,x5
00b10974	mov w20,w3
00b10978	mov x21,x2
00b1097c	bl 0x00b0f518
00b10980	cbz x0,0x00b10a74
00b10984	cmp x21,#0x0
00b10988	csel x3,x23,xzr,ne
00b1098c	mov x1,x21
00b10990	mov x2,x22
00b10994	mov x19,x0
00b10998	bl 0x00b0f78c
00b1099c	cbz w0,0x00b10a68
00b109a0	cbnz x21,0x00b109c0
00b109a4	adrp x8,0xb10000
00b109a8	adrp x9,0xb10000
00b109ac	add x8,x8,#0x714
00b109b0	add x9,x9,#0x758
00b109b4	str x23,[x19, #0x28]
00b109b8	str x8,[x19, #0x40]
00b109bc	str x9,[x19, #0x78]
00b109c0	add x23,x19,#0x98
00b109c4	mov w2,#0x1
00b109c8	mov x0,x23
00b109cc	mov x1,x22
00b109d0	mov w24,#0x1
00b109d4	bl 0x00c3ef60
00b109d8	cbz w0,0x00b10a60
00b109dc	mov x0,x19
00b109e0	str w24,[x19, #0x94]
00b109e4	bl 0x00b10a8c
00b109e8	cbz x21,0x00b109f0
00b109ec	cbz w0,0x00b10a68
00b109f0	ldr x0,[x23]
00b109f4	bl 0x00c325e0
00b109f8	ldr x1,[x23]
00b109fc	cmp w0,#0x2
00b10a00	ccmp w20,#0x0,#0x0,ge
00b10a04	mov w8,#0x9
00b10a08	csinc w2,w8,wzr,eq
00b10a0c	add x0,sp,#0x8
00b10a10	bl 0x00c40be0
00b10a14	cbnz w0,0x00b10a68
00b10a18	ldr x0,[sp, #0x8]
00b10a1c	bl 0x00c34770
00b10a20	str xzr,[sp, #0x8]
00b10a24	b 0x00b10a68
00b10a28	bl 0x00c342a0
00b10a2c	adrp x0,0x2a0000
00b10a30	adrp x2,0x2dc000
00b10a34	add x0,x0,#0xe02
00b10a38	add x2,x2,#0xc5b
00b10a3c	mov w1,#0xd09
00b10a40	bl 0x00c342b0
00b10a44	mov w1,#0x102
00b10a48	mov w0,#0xb
00b10a4c	movk w1,#0xc, LSL #16
00b10a50	mov x2,xzr
00b10a54	bl 0x00c342c0
00b10a58	mov x0,xzr
00b10a5c	b 0x00b10a74
00b10a60	mov w8,#0x11
00b10a64	str w8,[x19, #0xb0]
00b10a68	mov x0,x19
00b10a6c	bl 0x00b0f668
00b10a70	ldr x0,[sp, #0x8]
00b10a74	ldp x29,x30,[sp, #0x40]
00b10a78	ldp x20,x19,[sp, #0x30]
00b10a7c	ldp x22,x21,[sp, #0x20]
00b10a80	ldp x24,x23,[sp, #0x10]
00b10a84	add sp,sp,#0x50
00b10a88	ret

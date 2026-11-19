; EVP_PKEY_get_ec_point_conv_form @ 00a6f924
00a6f924	sub sp,sp,#0xf0
00a6f928	stp x20,x19,[sp, #0xd0]
00a6f92c	stp x29,x30,[sp, #0xe0]
00a6f930	add x29,sp,#0xe0
00a6f934	cbz x0,0x00a6fa38
00a6f938	ldr x8,[x0, #0x60]
00a6f93c	mov x19,x0
00a6f940	cbz x8,0x00a6fa20
00a6f944	ldr x8,[x19, #0x68]
00a6f948	cbz x8,0x00a6fa20
00a6f94c	adrp x0,0x2cb000
00a6f950	add x0,x0,#0x7b8
00a6f954	add x8,sp,#0x58
00a6f958	add x1,sp,#0x8
00a6f95c	mov w2,#0x50
00a6f960	sub x20,x29,#0x60
00a6f964	bl 0x00c36280
00a6f968	ldr x8,[sp, #0x78]
00a6f96c	ldur q0,[sp, #0x68]
00a6f970	ldur q1,[sp, #0x58]
00a6f974	stur x8,[x29, #-0x40]
00a6f978	add x8,sp,#0x58
00a6f97c	str q0,[x20, #0x10]
00a6f980	stur q1,[x29, #-0x60]
00a6f984	bl 0x00c34c40
00a6f988	ldr x8,[sp, #0x78]
00a6f98c	ldur q0,[sp, #0x68]
00a6f990	ldur q1,[sp, #0x58]
00a6f994	sub x1,x29,#0x60
00a6f998	mov x0,x19
00a6f99c	stur x8,[x29, #-0x18]
00a6f9a0	stur q0,[x20, #0x38]
00a6f9a4	stur q1,[x20, #0x28]
00a6f9a8	bl 0x00a6f360
00a6f9ac	cbz w0,0x00a6fa34
00a6f9b0	mov w19,w0
00a6f9b4	sub x0,x29,#0x60
00a6f9b8	bl 0x00c3d030
00a6f9bc	cbz w0,0x00a6fa34
00a6f9c0	ldur x8,[x29, #-0x40]
00a6f9c4	cmp x8,#0x50
00a6f9c8	b.eq 0x00a6fa34
00a6f9cc	add x9,sp,#0x8
00a6f9d0	strb wzr,[x9, x8]
00a6f9d4	cbz w19,0x00a6fa34
00a6f9d8	adrp x1,0x2cd000
00a6f9dc	add x1,x1,#0x936
00a6f9e0	add x0,sp,#0x8
00a6f9e4	bl 0x00c301f0
00a6f9e8	cbz w0,0x00a6fa48
00a6f9ec	adrp x1,0x2a3000
00a6f9f0	add x1,x1,#0xf0c
00a6f9f4	add x0,sp,#0x8
00a6f9f8	bl 0x00c301f0
00a6f9fc	cbz w0,0x00a6fa50
00a6fa00	adrp x1,0x2a0000
00a6fa04	add x1,x1,#0x19
00a6fa08	add x0,sp,#0x8
00a6fa0c	bl 0x00c301f0
00a6fa10	cmp w0,#0x0
00a6fa14	orr w8,wzr,#0x6
00a6fa18	csel w0,w8,wzr,eq
00a6fa1c	b 0x00a6fa38
00a6fa20	mov x0,x19
00a6fa24	bl 0x00c3a8b0
00a6fa28	cbz x0,0x00a6fa38
00a6fa2c	bl 0x00c3a7f0
00a6fa30	b 0x00a6fa38
00a6fa34	mov w0,wzr
00a6fa38	ldp x29,x30,[sp, #0xe0]
00a6fa3c	ldp x20,x19,[sp, #0xd0]
00a6fa40	add sp,sp,#0xf0
00a6fa44	ret
00a6fa48	mov w0,#0x4
00a6fa4c	b 0x00a6fa38
00a6fa50	mov w0,#0x2
00a6fa54	b 0x00a6fa38

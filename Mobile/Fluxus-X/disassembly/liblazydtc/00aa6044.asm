; MD5_Update @ 00aa6044
00aa6044	str x23,[sp, #-0x40]!
00aa6048	stp x22,x21,[sp, #0x10]
00aa604c	stp x20,x19,[sp, #0x20]
00aa6050	stp x29,x30,[sp, #0x30]
00aa6054	add x29,sp,#0x30
00aa6058	cbz x2,0x00aa6138
00aa605c	ldp w8,w9,[x0, #0x10]
00aa6060	mov x19,x2
00aa6064	mov x21,x1
00aa6068	mov x20,x0
00aa606c	adds w8,w8,w19, LSL #0x3
00aa6070	b.cc 0x00aa607c
00aa6074	add w9,w9,#0x1
00aa6078	str w9,[x20, #0x14]
00aa607c	ldr w10,[x20, #0x58]
00aa6080	lsr x11,x19,#0x1d
00aa6084	add w9,w9,w11
00aa6088	stp w8,w9,[x20, #0x10]
00aa608c	cbz w10,0x00aa60e4
00aa6090	add x8,x10,x19
00aa6094	add x22,x20,#0x18
00aa6098	orr x8,x8,x19
00aa609c	cmp x8,#0x40
00aa60a0	add x0,x22,x10
00aa60a4	b.cc 0x00aa6120
00aa60a8	mov w8,#0x40
00aa60ac	sub x23,x8,x10
00aa60b0	mov x1,x21
00aa60b4	mov x2,x23
00aa60b8	bl 0x00c2ffd0
00aa60bc	mov w2,#0x1
00aa60c0	mov x0,x20
00aa60c4	mov x1,x22
00aa60c8	bl 0x00aa6150
00aa60cc	mov w2,#0x44
00aa60d0	mov x0,x22
00aa60d4	mov w1,wzr
00aa60d8	add x21,x21,x23
00aa60dc	sub x19,x19,x23
00aa60e0	bl 0x00c301c0
00aa60e4	lsr x2,x19,#0x6
00aa60e8	cbz x2,0x00aa6104
00aa60ec	mov x0,x20
00aa60f0	mov x1,x21
00aa60f4	bl 0x00aa6150
00aa60f8	and x8,x19,#-0x40
00aa60fc	add x21,x21,x8
00aa6100	sub x19,x19,x8
00aa6104	cbz x19,0x00aa6138
00aa6108	add x0,x20,#0x18
00aa610c	mov x1,x21
00aa6110	mov x2,x19
00aa6114	str w19,[x20, #0x58]
00aa6118	bl 0x00c2ffd0
00aa611c	b 0x00aa6138
00aa6120	mov x1,x21
00aa6124	mov x2,x19
00aa6128	bl 0x00c2ffd0
00aa612c	ldr w8,[x20, #0x58]
00aa6130	add w8,w8,w19
00aa6134	str w8,[x20, #0x58]
00aa6138	ldp x29,x30,[sp, #0x30]
00aa613c	ldp x20,x19,[sp, #0x20]
00aa6140	ldp x22,x21,[sp, #0x10]
00aa6144	mov w0,#0x1
00aa6148	ldr x23,[sp], #0x40
00aa614c	ret

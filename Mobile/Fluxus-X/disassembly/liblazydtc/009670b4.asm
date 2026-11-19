; FUN_009670b4 @ 009670b4
009670b4	sub sp,sp,#0xc0
009670b8	stp x20,x19,[sp, #0xa0]
009670bc	stp x29,x30,[sp, #0xb0]
009670c0	add x29,sp,#0xb0
009670c4	adrp x8,0xcc4000
009670c8	add x8,x8,#0x678
009670cc	ldr x0,[x5, #0x10]
009670d0	mov x20,x5
009670d4	mov x19,x6
009670d8	ldr x8,[x8]
009670dc	blr x8
009670e0	adrp x8,0x2ab000
009670e4	adrp x0,0x2db000
009670e8	add x8,x8,#0x32c
009670ec	add x0,x0,#0x619
009670f0	orr w5,wzr,#0x6
009670f4	mov w6,#0x82
009670f8	mov w7,#0x8
009670fc	mov w1,wzr
00967100	mov w2,wzr
00967104	mov w3,wzr
00967108	mov w4,wzr
0096710c	str xzr,[x20, #0x10]
00967110	str wzr,[x20, #0xc]
00967114	str wzr,[sp, #0x80]
00967118	str wzr,[sp, #0x78]
0096711c	str wzr,[sp, #0x70]
00967120	str wzr,[sp, #0x68]
00967124	str wzr,[sp, #0x60]
00967128	str wzr,[sp, #0x58]
0096712c	str wzr,[sp, #0x50]
00967130	str wzr,[sp, #0x48]
00967134	str wzr,[sp, #0x40]
00967138	str wzr,[sp, #0x38]
0096713c	str wzr,[sp, #0x30]
00967140	str wzr,[sp, #0x28]
00967144	str wzr,[sp, #0x20]
00967148	str wzr,[sp, #0x18]
0096714c	str wzr,[sp, #0x10]
00967150	str wzr,[sp, #0x8]
00967154	stp x8,x8,[sp, #0x88]
00967158	str wzr,[sp]
0096715c	bl 0x00c31d10
00967160	mov x1,x0
00967164	cbz x0,0x00967184
00967168	adrp x3,0xcb4000
0096716c	ldr x3,[x3, #0xca8]
00967170	mov w2,#0x20
00967174	mov x0,x19
00967178	bl 0x0092525c
0096717c	mov w0,wzr
00967180	b 0x00967188
00967184	mov w0,#0x1b
00967188	ldp x29,x30,[sp, #0xb0]
0096718c	ldp x20,x19,[sp, #0xa0]
00967190	add sp,sp,#0xc0
00967194	ret

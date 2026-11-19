; s2i_ASN1_IA5STRING @ 00afebf8
00afebf8	stp x20,x19,[sp, #-0x20]!
00afebfc	stp x29,x30,[sp, #0x10]
00afec00	add x29,sp,#0x10
00afec04	cbz x2,0x00afec44
00afec08	mov x20,x2
00afec0c	bl 0x00c38150
00afec10	mov x19,x0
00afec14	cbz x0,0x00afec78
00afec18	mov x0,x20
00afec1c	bl 0x00c2ff50
00afec20	mov x2,x0
00afec24	mov x0,x19
00afec28	mov x1,x20
00afec2c	bl 0x00c378a0
00afec30	cbnz w0,0x00afeca8
00afec34	mov x0,x19
00afec38	bl 0x00c38140
00afec3c	mov x19,xzr
00afec40	b 0x00afeca8
00afec44	bl 0x00c342a0
00afec48	adrp x0,0x2b4000
00afec4c	adrp x2,0x2d6000
00afec50	add x0,x0,#0xa61
00afec54	add x2,x2,#0x6af
00afec58	orr w1,wzr,#0x30
00afec5c	bl 0x00c342b0
00afec60	mov w0,#0x22
00afec64	mov w1,#0x6b
00afec68	mov x2,xzr
00afec6c	bl 0x00c342c0
00afec70	mov x19,xzr
00afec74	b 0x00afeca8
00afec78	bl 0x00c342a0
00afec7c	adrp x0,0x2b4000
00afec80	adrp x2,0x2d6000
00afec84	add x0,x0,#0xa61
00afec88	add x2,x2,#0x6af
00afec8c	orr w1,wzr,#0x3e
00afec90	bl 0x00c342b0
00afec94	mov w1,#0x100
00afec98	mov w0,#0x22
00afec9c	movk w1,#0xc, LSL #16
00afeca0	mov x2,xzr
00afeca4	bl 0x00c342c0
00afeca8	ldp x29,x30,[sp, #0x10]
00afecac	mov x0,x19
00afecb0	ldp x20,x19,[sp], #0x20
00afecb4	ret

; UI_add_input_boolean @ 00aedd18
00aedd18	mov x7,x6
00aedd1c	mov w6,w5
00aedd20	mov w5,wzr
00aedd24	b 0x00aedd28
00aedd28	sub sp,sp,#0x70
00aedd2c	stp x28,x27,[sp, #0x10]
00aedd30	stp x26,x25,[sp, #0x20]
00aedd34	stp x24,x23,[sp, #0x30]
00aedd38	stp x22,x21,[sp, #0x40]
00aedd3c	stp x20,x19,[sp, #0x50]
00aedd40	stp x29,x30,[sp, #0x60]
00aedd44	add x29,sp,#0x60
00aedd48	cbz x3,0x00aede30
00aedd4c	mov x19,x4
00aedd50	cbz x4,0x00aede4c
00aedd54	ldrb w8,[x3]
00aedd58	mov x23,x7
00aedd5c	mov w24,w6
00aedd60	mov w25,w5
00aedd64	mov x20,x3
00aedd68	mov x26,x1
00aedd6c	mov x21,x0
00aedd70	str x2,[sp, #0x8]
00aedd74	cbz w8,0x00aeddc8
00aedd78	adrp x27,0x2a0000
00aedd7c	adrp x28,0x2b2000
00aedd80	add x22,x20,#0x1
00aedd84	add x27,x27,#0xc2f
00aedd88	add x28,x28,#0xbbe
00aedd8c	and w1,w8,#0xff
00aedd90	mov x0,x19
00aedd94	bl 0x00c30890
00aedd98	cbz x0,0x00aeddc0
00aedd9c	bl 0x00c342a0
00aedda0	mov w1,#0xa6
00aedda4	mov x0,x27
00aedda8	mov x2,x28
00aeddac	bl 0x00c342b0
00aeddb0	mov w0,#0x28
00aeddb4	mov w1,#0x68
00aeddb8	mov x2,xzr
00aeddbc	bl 0x00c342c0
00aeddc0	ldrb w8,[x22], #0x1
00aeddc4	cbnz w8,0x00aedd8c
00aeddc8	orr w2,wzr,#0x3
00aeddcc	mov x0,x26
00aeddd0	mov w1,w25
00aeddd4	mov w3,w24
00aeddd8	mov x4,x23
00aedddc	bl 0x00aef184
00aedde0	cbz x0,0x00aede7c
00aedde4	ldr x8,[x21, #0x8]!
00aedde8	mov x23,x0
00aeddec	cbnz x8,0x00aeddfc
00aeddf0	bl 0x00c34780
00aeddf4	str x0,[x21]
00aeddf8	cbz x0,0x00aedea4
00aeddfc	ldr x8,[sp, #0x8]
00aede00	str x19,[x23, #0x38]
00aede04	mov x1,x23
00aede08	stp x8,x20,[x23, #0x28]
00aede0c	ldr x0,[x21]
00aede10	bl 0x00c347a0
00aede14	mov w19,w0
00aede18	cmp w0,#0x0
00aede1c	b.gt 0x00aede80
00aede20	mov x0,x23
00aede24	sub w19,w19,#0x1
00aede28	bl 0x00aed930
00aede2c	b 0x00aede80
00aede30	bl 0x00c342a0
00aede34	adrp x0,0x2a0000
00aede38	adrp x2,0x2b2000
00aede3c	add x0,x0,#0xc2f
00aede40	add x2,x2,#0xbbe
00aede44	mov w1,#0xa0
00aede48	b 0x00aede64
00aede4c	bl 0x00c342a0
00aede50	adrp x0,0x2a0000
00aede54	adrp x2,0x2b2000
00aede58	add x0,x0,#0xc2f
00aede5c	add x2,x2,#0xbbe
00aede60	mov w1,#0xa2
00aede64	bl 0x00c342b0
00aede68	mov w1,#0x102
00aede6c	mov w0,#0x28
00aede70	movk w1,#0xc, LSL #16
00aede74	mov x2,xzr
00aede78	bl 0x00c342c0
00aede7c	mov w19,#0xffffffff
00aede80	mov w0,w19
00aede84	ldp x29,x30,[sp, #0x60]
00aede88	ldp x20,x19,[sp, #0x50]
00aede8c	ldp x22,x21,[sp, #0x40]
00aede90	ldp x24,x23,[sp, #0x30]
00aede94	ldp x26,x25,[sp, #0x20]
00aede98	ldp x28,x27,[sp, #0x10]
00aede9c	add sp,sp,#0x70
00aedea0	ret
00aedea4	mov x0,x23
00aedea8	bl 0x00aed930
00aedeac	b 0x00aede7c

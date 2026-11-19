; RIPEMD160_Update @ 00acbe08
00acbe08	str x23,[sp, #-0x40]!
00acbe0c	stp x22,x21,[sp, #0x10]
00acbe10	stp x20,x19,[sp, #0x20]
00acbe14	stp x29,x30,[sp, #0x30]
00acbe18	add x29,sp,#0x30
00acbe1c	cbz x2,0x00acbefc
00acbe20	ldp w8,w9,[x0, #0x14]
00acbe24	mov x19,x2
00acbe28	mov x21,x1
00acbe2c	mov x20,x0
00acbe30	adds w8,w8,w19, LSL #0x3
00acbe34	b.cc 0x00acbe40
00acbe38	add w9,w9,#0x1
00acbe3c	str w9,[x20, #0x18]
00acbe40	ldr w10,[x20, #0x5c]
00acbe44	lsr x11,x19,#0x1d
00acbe48	add w9,w9,w11
00acbe4c	stp w8,w9,[x20, #0x14]
00acbe50	cbz w10,0x00acbea8
00acbe54	add x8,x10,x19
00acbe58	add x22,x20,#0x1c
00acbe5c	orr x8,x8,x19
00acbe60	cmp x8,#0x40
00acbe64	add x0,x22,x10
00acbe68	b.cc 0x00acbee4
00acbe6c	mov w8,#0x40
00acbe70	sub x23,x8,x10
00acbe74	mov x1,x21
00acbe78	mov x2,x23
00acbe7c	bl 0x00c2ffd0
00acbe80	mov w2,#0x1
00acbe84	mov x0,x20
00acbe88	mov x1,x22
00acbe8c	bl 0x00acbf14
00acbe90	mov w2,#0x44
00acbe94	mov x0,x22
00acbe98	mov w1,wzr
00acbe9c	add x21,x21,x23
00acbea0	sub x19,x19,x23
00acbea4	bl 0x00c301c0
00acbea8	lsr x2,x19,#0x6
00acbeac	cbz x2,0x00acbec8
00acbeb0	mov x0,x20
00acbeb4	mov x1,x21
00acbeb8	bl 0x00acbf14
00acbebc	and x8,x19,#-0x40
00acbec0	add x21,x21,x8
00acbec4	sub x19,x19,x8
00acbec8	cbz x19,0x00acbefc
00acbecc	add x0,x20,#0x1c
00acbed0	mov x1,x21
00acbed4	mov x2,x19
00acbed8	str w19,[x20, #0x5c]
00acbedc	bl 0x00c2ffd0
00acbee0	b 0x00acbefc
00acbee4	mov x1,x21
00acbee8	mov x2,x19
00acbeec	bl 0x00c2ffd0
00acbef0	ldr w8,[x20, #0x5c]
00acbef4	add w8,w8,w19
00acbef8	str w8,[x20, #0x5c]
00acbefc	ldp x29,x30,[sp, #0x30]
00acbf00	ldp x20,x19,[sp, #0x20]
00acbf04	ldp x22,x21,[sp, #0x10]
00acbf08	mov w0,#0x1
00acbf0c	ldr x23,[sp], #0x40
00acbf10	ret

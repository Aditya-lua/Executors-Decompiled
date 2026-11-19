; FUN_0083ba34 @ 0083ba34
0083ba34	cmp x2,#0x20
0083ba38	b.hi 0x0083ba94
0083ba3c	cmp x2,#0x10
0083ba40	b.hi 0x0083bb54
0083ba44	cmp x2,#0x9
0083ba48	b.cc 0x0083bdd4
0083ba4c	add x8,x1,x2
0083ba50	mov x11,#0x2d69
0083ba54	ldr x10,[x1]
0083ba58	ldur x8,[x8, #-0x8]
0083ba5c	movk x11,#0xeb38, LSL #16
0083ba60	movk x11,#0xea08, LSL #32
0083ba64	add x9,x8,x2
0083ba68	movk x11,#0x9ddf, LSL #48
0083ba6c	ror x9,x9,x2
0083ba70	eor x10,x9,x10
0083ba74	mul x10,x10,x11
0083ba78	eor x9,x9,x10, LSR #0x2f
0083ba7c	eor x9,x9,x10
0083ba80	mul x9,x9,x11
0083ba84	eor x9,x9,x9, LSR #0x2f
0083ba88	mul x9,x9,x11
0083ba8c	eor x0,x9,x8
0083ba90	ret
0083ba94	add x9,x1,x2
0083ba98	cmp x2,#0x40
0083ba9c	b.hi 0x0083bc00
0083baa0	ldp x10,x11,[x9, #-0x10]
0083baa4	mov x8,#0x3127
0083baa8	movk x8,#0x97cb, LSL #16
0083baac	ldp x13,x14,[x1]
0083bab0	movk x8,#0xc85c, LSL #32
0083bab4	ldp x0,x9,[x9, #-0x20]
0083bab8	movk x8,#0xc3a5, LSL #48
0083babc	add x12,x10,x2
0083bac0	madd x12,x12,x8,x13
0083bac4	ldp x15,x13,[x1, #0x10]
0083bac8	add x0,x0,x15
0083bacc	add x11,x11,x13
0083bad0	add x9,x9,x0
0083bad4	add x14,x12,x14
0083bad8	add x16,x12,x13
0083badc	ror x12,x12,#0x25
0083bae0	ror x17,x14,#0x7
0083bae4	ror x16,x16,#0x34
0083bae8	add x14,x14,x15
0083baec	ror x15,x14,#0x1f
0083baf0	add x10,x9,x10
0083baf4	ror x9,x9,#0x7
0083baf8	add x12,x17,x12
0083bafc	ror x17,x0,#0x25
0083bb00	add x12,x12,x16
0083bb04	add x16,x11,x0
0083bb08	add x11,x10,x11
0083bb0c	add x12,x12,x15
0083bb10	ror x15,x16,#0x34
0083bb14	add x13,x13,x17
0083bb18	ror x10,x10,#0x1f
0083bb1c	add x9,x13,x9
0083bb20	add x11,x11,x12
0083bb24	add x9,x9,x15
0083bb28	mul x11,x11,x8
0083bb2c	add x9,x9,x10
0083bb30	mov x10,#0x404f
0083bb34	movk x10,#0x2f90, LSL #16
0083bb38	add x9,x14,x9
0083bb3c	movk x10,#0x6a3b, LSL #32
0083bb40	movk x10,#0x9ae1, LSL #48
0083bb44	madd x9,x9,x10,x11
0083bb48	eor x9,x9,x9, LSR #0x2f
0083bb4c	madd x8,x9,x8,x12
0083bb50	b 0x0083bbf4
0083bb54	mov x9,#0xf273
0083bb58	ldp x8,x11,[x1]
0083bb5c	movk x9,#0xbe98, LSL #16
0083bb60	add x10,x1,x2
0083bb64	mov x12,#0x404f
0083bb68	movk x9,#0xb66f, LSL #32
0083bb6c	movk x12,#0x2f90, LSL #16
0083bb70	mov x14,#0x6557
0083bb74	movk x9,#0xb492, LSL #48
0083bb78	movk x12,#0x6a3b, LSL #32
0083bb7c	movk x14,#0x509e, LSL #16
0083bb80	mul x8,x8,x9
0083bb84	ldp x10,x9,[x10, #-0x10]
0083bb88	movk x12,#0x9ae1, LSL #48
0083bb8c	movk x14,#0xd7c7, LSL #32
0083bb90	movk x14,#0xc949, LSL #48
0083bb94	mul x9,x9,x12
0083bb98	sub x12,x8,x11
0083bb9c	eor x11,x11,x14
0083bba0	mov x14,#0x3127
0083bba4	movk x14,#0x97cb, LSL #16
0083bba8	ror x12,x12,#0x2b
0083bbac	ror x11,x11,#0x14
0083bbb0	movk x14,#0xc85c, LSL #32
0083bbb4	ror x13,x9,#0x1e
0083bbb8	movk x14,#0xc3a5, LSL #48
0083bbbc	add x11,x2,x11
0083bbc0	add x8,x8,x11
0083bbc4	add x12,x13,x12
0083bbc8	madd x10,x10,x14,x12
0083bbcc	sub x8,x8,x9
0083bbd0	eor x9,x10,x8
0083bbd4	mov x10,#0x2d69
0083bbd8	movk x10,#0xeb38, LSL #16
0083bbdc	movk x10,#0xea08, LSL #32
0083bbe0	movk x10,#0x9ddf, LSL #48
0083bbe4	mul x9,x9,x10
0083bbe8	eor x8,x8,x9, LSR #0x2f
0083bbec	eor x8,x8,x9
0083bbf0	mul x8,x8,x10
0083bbf4	eor x8,x8,x8, LSR #0x2f
0083bbf8	mul x0,x8,x10
0083bbfc	ret
0083bc00	ldp x15,x11,[x9, #-0x38]
0083bc04	mov x8,#0x2d69
0083bc08	ldp x13,x12,[x9, #-0x20]
0083bc0c	movk x8,#0xeb38, LSL #16
0083bc10	movk x8,#0xea08, LSL #32
0083bc14	ldur x16,[x9, #-0x40]
0083bc18	ldur x3,[x9, #-0x28]
0083bc1c	add x10,x11,x2
0083bc20	movk x8,#0x9ddf, LSL #48
0083bc24	eor x10,x12,x10
0083bc28	ldp x0,x4,[x9, #-0x10]
0083bc2c	mul x10,x10,x8
0083bc30	mov x9,#0xf273
0083bc34	add x16,x16,x2
0083bc38	movk x9,#0xbe98, LSL #16
0083bc3c	movk x9,#0xb66f, LSL #32
0083bc40	add x5,x3,x4
0083bc44	movk x9,#0xb492, LSL #48
0083bc48	add x13,x13,x9
0083bc4c	eor x14,x12,x10, LSR #0x2f
0083bc50	eor x10,x14,x10
0083bc54	ldr x14,[x1], #0x20
0083bc58	mul x10,x10,x8
0083bc5c	eor x10,x10,x10, LSR #0x2f
0083bc60	mul x17,x10,x8
0083bc64	add x10,x15,x0
0083bc68	add x15,x15,x11
0083bc6c	add x0,x12,x0
0083bc70	add x12,x16,x15
0083bc74	add x13,x10,x13
0083bc78	madd x11,x3,x9,x14
0083bc7c	add x14,x3,x16
0083bc80	ror x15,x12,#0x2c
0083bc84	add x0,x13,x0
0083bc88	add x12,x12,x3
0083bc8c	add x3,x13,x5
0083bc90	ror x5,x0,#0x2c
0083bc94	add x15,x15,x16
0083bc98	sub x16,x2,#0x1
0083bc9c	add x14,x14,x17
0083bca0	ror x2,x3,#0x15
0083bca4	and x3,x16,#-0x40
0083bca8	ror x14,x14,#0x15
0083bcac	add x13,x5,x13
0083bcb0	add x16,x15,x14
0083bcb4	add x15,x0,x4
0083bcb8	add x14,x13,x2
0083bcbc	neg x13,x3
0083bcc0	ldp x2,x0,[x1, #-0x20]
0083bcc4	add x11,x11,x12
0083bcc8	add x17,x17,x15
0083bccc	add x11,x11,x10
0083bcd0	madd x2,x16,x9,x2
0083bcd4	ror x17,x17,#0x21
0083bcd8	add x10,x10,x16
0083bcdc	adds x13,x13,#0x40
0083bce0	add x11,x11,x0
0083bce4	ldp x6,x4,[x1]
0083bce8	ror x16,x11,#0x25
0083bcec	mul x11,x17,x9
0083bcf0	ldp x3,x17,[x1, #0x10]
0083bcf4	add x12,x4,x12
0083bcf8	mul x16,x16,x9
0083bcfc	add x15,x2,x15
0083bd00	add x10,x10,x3
0083bd04	add x3,x4,x3
0083bd08	add x4,x14,x6
0083bd0c	ror x10,x10,#0x2a
0083bd10	add x4,x11,x4
0083bd14	madd x10,x10,x9,x12
0083bd18	ldp x5,x12,[x1, #-0x10]
0083bd1c	add x1,x1,#0x40
0083bd20	add x0,x0,x5
0083bd24	add x5,x5,x4
0083bd28	add x15,x15,x12
0083bd2c	add x0,x2,x0
0083bd30	add x12,x0,x12
0083bd34	ror x6,x0,#0x2c
0083bd38	eor x0,x16,x14
0083bd3c	add x14,x4,x3
0083bd40	add x16,x10,x5
0083bd44	add x15,x15,x0
0083bd48	ror x3,x14,#0x2c
0083bd4c	add x16,x16,x17
0083bd50	ror x5,x15,#0x15
0083bd54	add x2,x6,x2
0083bd58	ror x6,x16,#0x15
0083bd5c	add x15,x14,x17
0083bd60	add x14,x3,x4
0083bd64	add x16,x2,x5
0083bd68	mov x17,x0
0083bd6c	add x14,x14,x6
0083bd70	b.ne 0x0083bcc0
0083bd74	eor x12,x15,x12
0083bd78	eor x13,x14,x16
0083bd7c	eor x10,x10,x10, LSR #0x2f
0083bd80	mul x12,x12,x8
0083bd84	mul x13,x13,x8
0083bd88	madd x9,x10,x9,x0
0083bd8c	eor x15,x15,x12, LSR #0x2f
0083bd90	eor x14,x14,x13, LSR #0x2f
0083bd94	eor x12,x15,x12
0083bd98	mul x12,x12,x8
0083bd9c	eor x13,x14,x13
0083bda0	mul x13,x13,x8
0083bda4	eor x10,x12,x12, LSR #0x2f
0083bda8	eor x12,x13,x13, LSR #0x2f
0083bdac	madd x9,x10,x8,x9
0083bdb0	madd x10,x12,x8,x11
0083bdb4	eor x9,x10,x9
0083bdb8	mul x9,x9,x8
0083bdbc	eor x10,x10,x9, LSR #0x2f
0083bdc0	eor x9,x10,x9
0083bdc4	mul x9,x9,x8
0083bdc8	eor x9,x9,x9, LSR #0x2f
0083bdcc	mul x0,x9,x8
0083bdd0	ret
0083bdd4	cmp x2,#0x4
0083bdd8	b.cc 0x0083be14
0083bddc	ldr w8,[x1]
0083bde0	add x9,x1,x2
0083bde4	mov x10,#0x2d69
0083bde8	ldur w9,[x9, #-0x4]
0083bdec	movk x10,#0xeb38, LSL #16
0083bdf0	lsl w8,w8,#0x3
0083bdf4	movk x10,#0xea08, LSL #32
0083bdf8	movk x10,#0x9ddf, LSL #48
0083bdfc	add x8,x2,x8
0083be00	eor x8,x8,x9
0083be04	mul x8,x8,x10
0083be08	eor x9,x9,x8, LSR #0x2f
0083be0c	eor x8,x9,x8
0083be10	b 0x0083bbf0
0083be14	mov x0,#0x404f
0083be18	movk x0,#0x2f90, LSL #16
0083be1c	movk x0,#0x6a3b, LSL #32
0083be20	movk x0,#0x9ae1, LSL #48
0083be24	cbz x2,0x0083bdd0
0083be28	lsr x8,x2,#0x1
0083be2c	add x10,x1,x2
0083be30	ldrb w9,[x1]
0083be34	ldurb w10,[x10, #-0x1]
0083be38	ldrb w8,[x1, x8]
0083be3c	orr x8,x9,x8, LSL #0x8
0083be40	orr x9,x2,x10, LSL #0x2
0083be44	mov x10,#0x6557
0083be48	movk x10,#0x509e, LSL #16
0083be4c	movk x10,#0xd7c7, LSL #32
0083be50	mul x8,x8,x0
0083be54	movk x10,#0xc949, LSL #48
0083be58	mul x9,x9,x10
0083be5c	eor x8,x9,x8
0083be60	eor x8,x8,x8, LSR #0x2f
0083be64	mul x0,x8,x0
0083be68	ret

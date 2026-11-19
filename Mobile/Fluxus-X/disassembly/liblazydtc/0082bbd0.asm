; FUN_0082bbd0 @ 0082bbd0
0082bbd0	stp d9,d8,[sp, #-0x30]!
0082bbd4	stp x29,x30,[sp, #0x10]
0082bbd8	stp x20,x19,[sp, #0x20]
0082bbdc	add x29,sp,#0x10
0082bbe0	fmov d8,d1
0082bbe4	fmov d9,d0
0082bbe8	adrp x8,0xd1d000
0082bbec	add x8,x8,#0x2e0
0082bbf0	mov w20,w1
0082bbf4	mov x19,x0
0082bbf8	ldarb w9,[x8]
0082bbfc	adrp x8,0xd1d000
0082bc00	add x8,x8,#0x2d8
0082bc04	tbz w9,#0x0,0x0082bdc0
0082bc08	adrp x9,0xd1d000
0082bc0c	ldrb w9,[x9, #0x2dd]
0082bc10	cmp w9,#0x1
0082bc14	b.ne 0x0082bc48
0082bc18	ldr s0,[x8]
0082bc1c	adrp x9,0x29a000
0082bc20	mov w10,#0x41
0082bc24	ldr d1,[x9, #0xe28]
0082bc28	ldrb w9,[x8, #0x4]
0082bc2c	strb wzr,[x8, #0x5]
0082bc30	uxtl v0.8H,v0.8B
0082bc34	eor w9,w9,w10
0082bc38	strb w9,[x8, #0x4]
0082bc3c	eor v0.8B,v0.8B,v1.8B
0082bc40	uzp1 v0.8B,v0.8B,v0.8B
0082bc44	str s0,[x8]
0082bc48	adrp x2,0xd1d000
0082bc4c	add x2,x2,#0x2d8
0082bc50	mov x0,x19
0082bc54	mov w1,#0xffffd8ee
0082bc58	bl 0x008acba4
0082bc5c	adrp x8,0xd1d000
0082bc60	add x8,x8,#0x2f0
0082bc64	ldarb w9,[x8]
0082bc68	adrp x8,0xd1d000
0082bc6c	add x8,x8,#0x2e8
0082bc70	tbz w9,#0x0,0x0082be20
0082bc74	adrp x9,0xd1d000
0082bc78	ldrb w9,[x9, #0x2ee]
0082bc7c	cmp w9,#0x1
0082bc80	b.ne 0x0082bcc0
0082bc84	ldr s0,[x8]
0082bc88	adrp x9,0x29a000
0082bc8c	ldrb w11,[x8, #0x5]
0082bc90	ldr d1,[x9, #0x100]
0082bc94	ldrb w9,[x8, #0x4]
0082bc98	mov w10,#0x7d
0082bc9c	uxtl v0.8H,v0.8B
0082bca0	strb wzr,[x8, #0x6]
0082bca4	eor w9,w9,w10
0082bca8	eor w10,w11,#0x1
0082bcac	strb w9,[x8, #0x4]
0082bcb0	eor v0.8B,v0.8B,v1.8B
0082bcb4	strb w10,[x8, #0x5]
0082bcb8	uzp1 v0.8B,v0.8B,v0.8B
0082bcbc	str s0,[x8]
0082bcc0	adrp x2,0xd1d000
0082bcc4	add x2,x2,#0x2e8
0082bcc8	mov x0,x19
0082bccc	mov w1,#0xffffffff
0082bcd0	bl 0x008acba4
0082bcd4	mov x0,x19
0082bcd8	mov w1,#0xfffffffe
0082bcdc	bl 0x008aab40
0082bce0	adrp x8,0x29b000
0082bce4	mov x0,x19
0082bce8	ldr d0,[x8, #0xf18]
0082bcec	bl 0x008ac11c
0082bcf0	fmov d0,d9
0082bcf4	mov x0,x19
0082bcf8	bl 0x008ac11c
0082bcfc	fmov d0,d8
0082bd00	mov x0,x19
0082bd04	bl 0x008ac11c
0082bd08	ucvtf d0,w20
0082bd0c	mov x0,x19
0082bd10	bl 0x008ac11c
0082bd14	adrp x8,0xd1d000
0082bd18	add x8,x8,#0x308
0082bd1c	adrp x20,0xd1d000
0082bd20	add x20,x20,#0x2f8
0082bd24	ldarb w8,[x8]
0082bd28	tbz w8,#0x0,0x0082be88
0082bd2c	adrp x8,0xd1d000
0082bd30	ldrb w8,[x8, #0x305]
0082bd34	cmp w8,#0x1
0082bd38	b.ne 0x0082bd80
0082bd3c	ldr s0,[x20, #0x8]
0082bd40	adrp x8,0x29b000
0082bd44	mov w9,#0x3b
0082bd48	ldr d1,[x8, #0xf8]
0082bd4c	adrp x8,0x29b000
0082bd50	strb wzr,[x20, #0xd]
0082bd54	uxtl v0.8H,v0.8B
0082bd58	ldr d2,[x8, #0x5b0]
0082bd5c	ldrb w8,[x20, #0xc]
0082bd60	eor w8,w8,w9
0082bd64	eor v0.8B,v0.8B,v1.8B
0082bd68	ldr d1,[x20]
0082bd6c	strb w8,[x20, #0xc]
0082bd70	eor v1.8B,v1.8B,v2.8B
0082bd74	uzp1 v0.8B,v0.8B,v0.8B
0082bd78	str d1,[x20]
0082bd7c	str s0,[x20, #0x8]
0082bd80	nop
0082bd84	adr x1,0x82bee0
0082bd88	adrp x2,0xd1d000
0082bd8c	add x2,x2,#0x2f8
0082bd90	mov x0,x19
0082bd94	mov w3,#0x3
0082bd98	mov x4,xzr
0082bd9c	bl 0x008ac76c
0082bda0	mov x0,x19
0082bda4	mov w1,#0x2
0082bda8	mov w2,wzr
0082bdac	mov w3,wzr
0082bdb0	ldp x20,x19,[sp, #0x20]
0082bdb4	ldp x29,x30,[sp, #0x10]
0082bdb8	ldp d9,d8,[sp], #0x30
0082bdbc	b 0x008adea0
0082bdc0	adrp x0,0xd1d000
0082bdc4	add x0,x0,#0x2e0
0082bdc8	bl 0x00c2fe90
0082bdcc	adrp x8,0xd1d000
0082bdd0	add x8,x8,#0x2d8
0082bdd4	cbz w0,0x0082bc08
0082bdd8	adrp x9,0x29a000
0082bddc	nop
0082bde0	adr x0,0x82bf54
0082bde4	ldr d0,[x9, #0xf38]
0082bde8	mov w9,#0x141
0082bdec	adrp x2,0xc48000
0082bdf0	add x2,x2,#0x880
0082bdf4	adrp x1,0xd1d000
0082bdf8	add x1,x1,#0x2d8
0082bdfc	str s0,[x8]
0082be00	strh w9,[x8, #0x4]
0082be04	bl 0x00c2fe70
0082be08	adrp x0,0xd1d000
0082be0c	add x0,x0,#0x2e0
0082be10	bl 0x00c2fea0
0082be14	adrp x8,0xd1d000
0082be18	add x8,x8,#0x2d8
0082be1c	b 0x0082bc08
0082be20	adrp x0,0xd1d000
0082be24	add x0,x0,#0x2f0
0082be28	bl 0x00c2fe90
0082be2c	adrp x8,0xd1d000
0082be30	add x8,x8,#0x2e8
0082be34	cbz w0,0x0082bc74
0082be38	adrp x9,0x29a000
0082be3c	mov w10,#0x1
0082be40	nop
0082be44	adr x0,0x82bf60
0082be48	ldr d0,[x9, #0x5f8]
0082be4c	mov w9,#0x104
0082be50	adrp x2,0xc48000
0082be54	add x2,x2,#0x880
0082be58	adrp x1,0xd1d000
0082be5c	add x1,x1,#0x2e8
0082be60	strb w10,[x8, #0x6]
0082be64	str s0,[x8]
0082be68	strh w9,[x8, #0x4]
0082be6c	bl 0x00c2fe70
0082be70	adrp x0,0xd1d000
0082be74	add x0,x0,#0x2f0
0082be78	bl 0x00c2fea0
0082be7c	adrp x8,0xd1d000
0082be80	add x8,x8,#0x2e8
0082be84	b 0x0082bc74
0082be88	adrp x0,0xd1d000
0082be8c	add x0,x0,#0x308
0082be90	bl 0x00c2fe90
0082be94	cbz w0,0x0082bd2c
0082be98	adrp x8,0x29b000
0082be9c	adrp x9,0x29a000
0082bea0	nop
0082bea4	adr x0,0x82bf6c
0082bea8	ldr d0,[x8, #0x5a8]
0082beac	ldr d1,[x9, #0xcd8]
0082beb0	mov w8,#0x13b
0082beb4	adrp x2,0xc48000
0082beb8	add x2,x2,#0x880
0082bebc	mov x1,x20
0082bec0	str d0,[x20]
0082bec4	str s1,[x20, #0x8]
0082bec8	strh w8,[x20, #0xc]
0082becc	bl 0x00c2fe70
0082bed0	adrp x0,0xd1d000
0082bed4	add x0,x0,#0x308
0082bed8	bl 0x00c2fea0
0082bedc	b 0x0082bd2c

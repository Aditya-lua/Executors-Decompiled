; FUN_00898c60 @ 00898c60
00898c60	ldr x8,[x1, #0x38]
00898c64	ldr x12,[x1, #0x28]
00898c68	cmp x8,x12
00898c6c	b.ls 0x00898c78
00898c70	mov w0,wzr
00898c74	ret
00898c78	cbz x12,0x00898d70
00898c7c	ldr w15,[x0, #0xcf8]
00898c80	adrp x16,0xcb4000
00898c84	ldr x8,[x1, #0x20]
00898c88	ldp x13,x10,[x0, #0x130]
00898c8c	mov x9,#0x2d69
00898c90	ldr x11,[x0, #0x128]
00898c94	ldr x16,[x16, #0xb40]
00898c98	adrp x17,0xd1f000
00898c9c	mov x1,#0x959d
00898ca0	movk x9,#0xeb38, LSL #16
00898ca4	ldrb w17,[x17, #0xa8]
00898ca8	cmn w15,#0x1
00898cac	movk x1,#0xb8f4, LSL #16
00898cb0	movk x9,#0xea08, LSL #32
00898cb4	add x12,x8,x12, LSL #0x3
00898cb8	ldrb w14,[x0, #0x140]
00898cbc	ldr x15,[x0, #0x110]
00898cc0	ldrb w16,[x16]
00898cc4	cset w0,ne
00898cc8	movk x1,#0xd34f, LSL #32
00898ccc	movk x9,#0x9ddf, LSL #48
00898cd0	sub x13,x13,#0x1
00898cd4	and w17,w17,w0
00898cd8	movk x1,#0x949d, LSL #48
00898cdc	mov w2,#0x28
00898ce0	cbz x10,0x00898c70
00898ce4	ldr x0,[x8]
00898ce8	lsl w3,w0,#0x3
00898cec	lsr x4,x0,#0x20
00898cf0	add x3,x3,#0x8
00898cf4	eor x3,x3,x4
00898cf8	mul x3,x3,x9
00898cfc	eor x4,x4,x3, LSR #0x2f
00898d00	eor x3,x4,x3
00898d04	mul x3,x3,x9
00898d08	eor x3,x3,x3, LSR #0x2f
00898d0c	mul x3,x3,x1
00898d10	lsr x3,x3,x14
00898d14	lsr x4,x3,#0x6
00898d18	ldr x4,[x11, x4, LSL #0x3]
00898d1c	lsr x4,x4,x3
00898d20	tbz w4,#0x0,0x00898c70
00898d24	madd x4,x3,x2,x15
00898d28	ldr x5,[x4]
00898d2c	cmp x5,x0
00898d30	b.eq 0x00898d40
00898d34	add x3,x3,#0x1
00898d38	and x3,x3,x13
00898d3c	b 0x00898d14
00898d40	ldrb w3,[x4, #0x21]
00898d44	cmp w3,#0x1
00898d48	b.ne 0x00898c70
00898d4c	tbz w16,#0x0,0x00898d5c
00898d50	ldrb w0,[x0, #0x31]
00898d54	orn w0,w17,w0
00898d58	tbz w0,#0x0,0x00898c70
00898d5c	add x8,x8,#0x8
00898d60	mov w0,#0x1
00898d64	cmp x8,x12
00898d68	b.ne 0x00898ce0
00898d6c	b 0x00898c74
00898d70	mov w0,#0x1
00898d74	ret

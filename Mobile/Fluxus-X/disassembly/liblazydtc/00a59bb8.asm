; FUN_00a59bb8 @ 00a59bb8
00a59bb8	cbz x0,0x00a59bc4
00a59bbc	ldrb w8,[x0, #0x5c]
00a59bc0	tbnz w8,#0x1,0x00a59c50
00a59bc4	adrp x8,0x2c0000
00a59bc8	add x8,x8,#0xfc9
00a59bcc	cmp w3,#0x1
00a59bd0	b.lt 0x00a59c60
00a59bd4	mov x0,xzr
00a59bd8	add x10,x2,#0x1
00a59bdc	ldurb w12,[x10, #-0x1]
00a59be0	add x9,x1,x0
00a59be4	cmp w3,#0x2
00a59be8	lsl x11,x12,#0x10
00a59bec	b.le 0x00a59c6c
00a59bf0	ldrb w13,[x10]
00a59bf4	ldrb w14,[x10, #0x1]
00a59bf8	lsr x12,x12,#0x2
00a59bfc	ldrb w12,[x8, x12]
00a59c00	lsl w15,w13,#0x8
00a59c04	orr w11,w15,w11
00a59c08	and x15,x14,#0x3f
00a59c0c	ubfx x11,x11,#0xc,#0x6
00a59c10	bfm w14,w13,#0x18,#0x7
00a59c14	ubfx x14,x14,#0x6,#0x6
00a59c18	ldrb w13,[x8, x15]
00a59c1c	ldrb w11,[x8, x11]
00a59c20	ldrb w14,[x8, x14]
00a59c24	subs w3,w3,#0x3
00a59c28	add x0,x0,#0x4
00a59c2c	add x10,x10,#0x3
00a59c30	strb w12,[x9]
00a59c34	strb w13,[x9, #0x3]
00a59c38	strb w11,[x9, #0x1]
00a59c3c	strb w14,[x9, #0x2]
00a59c40	b.ne 0x00a59bdc
00a59c44	add x1,x1,x0
00a59c48	strb wzr,[x1]
00a59c4c	ret
00a59c50	adrp x8,0x2c7000
00a59c54	add x8,x8,#0x992
00a59c58	cmp w3,#0x1
00a59c5c	b.ge 0x00a59bd4
00a59c60	mov w0,wzr
00a59c64	strb wzr,[x1]
00a59c68	ret
00a59c6c	b.ne 0x00a59c78
00a59c70	ldrb w10,[x10]
00a59c74	orr x11,x11,x10, LSL #0x8
00a59c78	ubfx x12,x11,#0x12,#0x6
00a59c7c	ubfx x13,x11,#0xc,#0x6
00a59c80	ldrb w14,[x8, x12]
00a59c84	ldrb w13,[x8, x13]
00a59c88	add x10,x1,x0
00a59c8c	mov w12,#0x3d
00a59c90	cmp w3,#0x1
00a59c94	strb w14,[x9]
00a59c98	mov w9,#0x3d
00a59c9c	strb w13,[x10, #0x1]
00a59ca0	b.eq 0x00a59cac
00a59ca4	ubfx x9,x11,#0x6,#0x6
00a59ca8	ldrb w9,[x8, x9]
00a59cac	add x1,x10,#0x4
00a59cb0	add w0,w0,#0x4
00a59cb4	strb w9,[x10, #0x2]
00a59cb8	strb w12,[x10, #0x3]
00a59cbc	strb wzr,[x1]
00a59cc0	ret

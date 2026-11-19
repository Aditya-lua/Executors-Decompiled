; DES_ede3_cfb64_encrypt @ 00a94bf0
00a94bf0	str x27,[sp, #-0x60]!
00a94bf4	stp x26,x25,[sp, #0x10]
00a94bf8	stp x24,x23,[sp, #0x20]
00a94bfc	stp x22,x21,[sp, #0x30]
00a94c00	stp x20,x19,[sp, #0x40]
00a94c04	stp x29,x30,[sp, #0x50]
00a94c08	add x29,sp,#0x50
00a94c0c	ldr w8,[x29, #0x10]
00a94c10	ldr w27,[x7]
00a94c14	mov x19,x7
00a94c18	mov x20,x6
00a94c1c	mov x21,x5
00a94c20	mov x22,x4
00a94c24	mov x23,x3
00a94c28	mov x24,x2
00a94c2c	mov x25,x1
00a94c30	mov x26,x0
00a94c34	cbz w8,0x00a94cc4
00a94c38	cbz x24,0x00a94d4c
00a94c3c	cbnz w27,0x00a94c98
00a94c40	ldp w8,w9,[x20]
00a94c44	add x0,sp,#0x8
00a94c48	mov x1,x23
00a94c4c	mov x2,x22
00a94c50	mov x3,x21
00a94c54	stp w8,w9,[sp, #0x8]
00a94c58	bl 0x00c39a10
00a94c5c	ldp w8,w9,[sp, #0x8]
00a94c60	lsr w10,w8,#0x8
00a94c64	strb w8,[x20]
00a94c68	strb w10,[x20, #0x1]
00a94c6c	lsr w10,w8,#0x10
00a94c70	lsr w8,w8,#0x18
00a94c74	strb w9,[x20, #0x4]
00a94c78	strb w10,[x20, #0x2]
00a94c7c	lsr w10,w9,#0x8
00a94c80	strb w8,[x20, #0x3]
00a94c84	lsr w8,w9,#0x10
00a94c88	lsr w9,w9,#0x18
00a94c8c	strb w10,[x20, #0x5]
00a94c90	strb w8,[x20, #0x6]
00a94c94	strb w9,[x20, #0x7]
00a94c98	sxtw x9,w27
00a94c9c	ldrb w8,[x26], #0x1
00a94ca0	ldrb w10,[x20, x9]
00a94ca4	add w11,w27,#0x1
00a94ca8	subs x24,x24,#0x1
00a94cac	and w27,w11,#0x7
00a94cb0	eor w8,w10,w8
00a94cb4	strb w8,[x25], #0x1
00a94cb8	strb w8,[x20, x9]
00a94cbc	b.ne 0x00a94c3c
00a94cc0	b 0x00a94d4c
00a94cc4	cbz x24,0x00a94d4c
00a94cc8	cbnz w27,0x00a94d24
00a94ccc	ldp w8,w9,[x20]
00a94cd0	add x0,sp,#0x8
00a94cd4	mov x1,x23
00a94cd8	mov x2,x22
00a94cdc	mov x3,x21
00a94ce0	stp w8,w9,[sp, #0x8]
00a94ce4	bl 0x00c39a10
00a94ce8	ldp w8,w9,[sp, #0x8]
00a94cec	lsr w10,w8,#0x8
00a94cf0	strb w8,[x20]
00a94cf4	strb w10,[x20, #0x1]
00a94cf8	lsr w10,w8,#0x10
00a94cfc	lsr w8,w8,#0x18
00a94d00	strb w9,[x20, #0x4]
00a94d04	strb w10,[x20, #0x2]
00a94d08	lsr w10,w9,#0x8
00a94d0c	strb w8,[x20, #0x3]
00a94d10	lsr w8,w9,#0x10
00a94d14	lsr w9,w9,#0x18
00a94d18	strb w10,[x20, #0x5]
00a94d1c	strb w8,[x20, #0x6]
00a94d20	strb w9,[x20, #0x7]
00a94d24	sxtw x9,w27
00a94d28	ldrb w8,[x26], #0x1
00a94d2c	ldrb w10,[x20, x9]
00a94d30	add w11,w27,#0x1
00a94d34	subs x24,x24,#0x1
00a94d38	strb w8,[x20, x9]
00a94d3c	eor w8,w10,w8
00a94d40	strb w8,[x25], #0x1
00a94d44	and w27,w11,#0x7
00a94d48	b.ne 0x00a94cc8
00a94d4c	str w27,[x19]
00a94d50	ldp x29,x30,[sp, #0x50]
00a94d54	ldp x20,x19,[sp, #0x40]
00a94d58	ldp x22,x21,[sp, #0x30]
00a94d5c	ldp x24,x23,[sp, #0x20]
00a94d60	ldp x26,x25,[sp, #0x10]
00a94d64	ldr x27,[sp], #0x60
00a94d68	ret

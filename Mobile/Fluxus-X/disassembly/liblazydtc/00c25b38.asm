; FUN_00c25b38 @ 00c25b38
00c25b38	paciasp
00c25b3c	sub sp,sp,#0x40
00c25b40	stp x29,x30,[sp, #0x10]
00c25b44	stp x22,x21,[sp, #0x20]
00c25b48	stp x20,x19,[sp, #0x30]
00c25b4c	add x29,sp,#0x10
00c25b50	ldp x9,x8,[x0]
00c25b54	sub x10,x8,x9
00c25b58	cmp x10,#0x2
00c25b5c	b.cc 0x00c25b70
00c25b60	ldrh w10,[x9]
00c25b64	mov w11,#0x7644
00c25b68	cmp w10,w11
00c25b6c	b.eq 0x00c25b8c
00c25b70	mov x0,xzr
00c25b74	ldp x20,x19,[sp, #0x30]
00c25b78	ldp x22,x21,[sp, #0x20]
00c25b7c	ldp x29,x30,[sp, #0x10]
00c25b80	add sp,sp,#0x40
00c25b84	autiasp
00c25b88	ret
00c25b8c	add x20,x9,#0x2
00c25b90	mov x19,x0
00c25b94	cmp x8,x20
00c25b98	str x20,[x0]
00c25b9c	b.eq 0x00c25d20
00c25ba0	ldrb w10,[x20]
00c25ba4	cmp w10,#0x31
00c25ba8	b.cc 0x00c25d20
00c25bac	cmp w10,#0x39
00c25bb0	b.hi 0x00c25ca8
00c25bb4	add x21,x9,#0x2
00c25bb8	mov x9,x20
00c25bbc	ldrb w10,[x9]
00c25bc0	sub w10,w10,#0x3a
00c25bc4	cmn w10,#0xa
00c25bc8	b.cc 0x00c25be4
00c25bcc	add x9,x9,#0x1
00c25bd0	add x21,x21,#0x1
00c25bd4	cmp x9,x8
00c25bd8	str x9,[x0]
00c25bdc	b.ne 0x00c25bbc
00c25be0	mov x21,x8
00c25be4	ldr x22,[x0, #0x1330]
00c25be8	ldr x9,[x22, #0x8]
00c25bec	sub x8,x9,#0xfd0
00c25bf0	cmn x8,#0xff1
00c25bf4	b.hi 0x00c25c1c
00c25bf8	mov w0,#0x1000
00c25bfc	bl 0x00c308d0
00c25c00	cbz x0,0x00c25de8
00c25c04	mov x8,x0
00c25c08	mov x9,xzr
00c25c0c	stp x22,xzr,[x0]
00c25c10	mov x22,x0
00c25c14	mov x0,x19
00c25c18	str x8,[x19, #0x1330]
00c25c1c	add x8,x9,#0x20
00c25c20	add x10,x22,x9
00c25c24	mov w9,#0x540
00c25c28	str x8,[x22, #0x8]
00c25c2c	adrp x8,0xcb1000
00c25c30	add x8,x8,#0x4c0
00c25c34	str x8,[x10, #0x10]!
00c25c38	ldurh w8,[x10, #0x9]
00c25c3c	str x20,[x10, #0x10]
00c25c40	sub x11,x21,x20
00c25c44	mov w12,#0x8
00c25c48	and w8,w8,#0xf000
00c25c4c	strb w12,[x10, #0x8]
00c25c50	orr w8,w8,w9
00c25c54	str x11,[x10, #0x18]
00c25c58	sturh w8,[x10, #0x9]
00c25c5c	ldp x8,x9,[x0]
00c25c60	str x10,[sp, #0x8]
00c25c64	cmp x8,x9
00c25c68	b.eq 0x00c25b70
00c25c6c	ldrb w10,[x8]
00c25c70	cmp w10,#0x5f
00c25c74	b.ne 0x00c25b70
00c25c78	add x10,x8,#0x1
00c25c7c	cmp x10,x9
00c25c80	str x10,[x0]
00c25c84	b.eq 0x00c25dc8
00c25c88	ldrb w9,[x10]
00c25c8c	cmp w9,#0x70
00c25c90	b.ne 0x00c25dc8
00c25c94	add x8,x8,#0x2
00c25c98	add x1,sp,#0x8
00c25c9c	str x8,[x0]
00c25ca0	bl 0x00c2751c
00c25ca4	b 0x00c25b74
00c25ca8	cmp w10,#0x5f
00c25cac	b.ne 0x00c25d20
00c25cb0	add x8,x9,#0x3
00c25cb4	str x8,[x0]
00c25cb8	bl 0x00c10bfc
00c25cbc	cbz x0,0x00c25b74
00c25cc0	ldr x21,[x19, #0x1330]
00c25cc4	mov x20,x0
00c25cc8	ldr x8,[x21, #0x8]
00c25ccc	sub x9,x8,#0xfd0
00c25cd0	cmn x9,#0xff1
00c25cd4	b.hi 0x00c25cf4
00c25cd8	mov w0,#0x1000
00c25cdc	bl 0x00c308d0
00c25ce0	cbz x0,0x00c25de8
00c25ce4	mov x8,xzr
00c25ce8	stp x21,xzr,[x0]
00c25cec	mov x21,x0
00c25cf0	str x0,[x19, #0x1330]
00c25cf4	add x9,x8,#0x20
00c25cf8	add x0,x21,x8
00c25cfc	adrp x8,0xcb3000
00c25d00	add x8,x8,#0xe30
00c25d04	str x9,[x21, #0x8]
00c25d08	mov w10,#0x540
00c25d0c	str x8,[x0, #0x10]!
00c25d10	ldurh w8,[x0, #0x9]
00c25d14	mov w9,#0x1d
00c25d18	stp x20,xzr,[x0, #0x10]
00c25d1c	b 0x00c25db4
00c25d20	bl 0x00c16098
00c25d24	cbz x0,0x00c25b74
00c25d28	ldp x9,x10,[x19]
00c25d2c	cmp x9,x10
00c25d30	b.eq 0x00c25b70
00c25d34	ldrb w10,[x9]
00c25d38	cmp w10,#0x5f
00c25d3c	b.ne 0x00c25b70
00c25d40	mov x21,x0
00c25d44	add x9,x9,#0x1
00c25d48	mov x0,x19
00c25d4c	str x9,[x19]
00c25d50	bl 0x00c10bfc
00c25d54	cbz x0,0x00c25b74
00c25d58	ldr x22,[x19, #0x1330]
00c25d5c	mov x20,x0
00c25d60	ldr x8,[x22, #0x8]
00c25d64	sub x9,x8,#0xfd0
00c25d68	cmn x9,#0xff1
00c25d6c	b.hi 0x00c25d8c
00c25d70	mov w0,#0x1000
00c25d74	bl 0x00c308d0
00c25d78	cbz x0,0x00c25de8
00c25d7c	mov x8,xzr
00c25d80	stp x22,xzr,[x0]
00c25d84	mov x22,x0
00c25d88	str x0,[x19, #0x1330]
00c25d8c	add x9,x8,#0x20
00c25d90	add x0,x22,x8
00c25d94	adrp x8,0xcb3000
00c25d98	add x8,x8,#0xe30
00c25d9c	str x9,[x22, #0x8]
00c25da0	mov w10,#0x540
00c25da4	str x8,[x0, #0x10]!
00c25da8	ldurh w8,[x0, #0x9]
00c25dac	mov w9,#0x1d
00c25db0	stp x20,x21,[x0, #0x10]
00c25db4	and w8,w8,#0xf000
00c25db8	strb w9,[x0, #0x8]
00c25dbc	orr w8,w8,w10
00c25dc0	sturh w8,[x0, #0x9]
00c25dc4	b 0x00c25b74
00c25dc8	bl 0x00c10bfc
00c25dcc	str x0,[sp]
00c25dd0	cbz x0,0x00c25b74
00c25dd4	mov x1,sp
00c25dd8	add x2,sp,#0x8
00c25ddc	mov x0,x19
00c25de0	bl 0x00c275bc
00c25de4	b 0x00c25b74
00c25de8	bl 0x00c2fff0

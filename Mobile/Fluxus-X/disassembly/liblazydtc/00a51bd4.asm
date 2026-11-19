; ENGINE_add @ 00a51bd4
00a51bd4	stp x22,x21,[sp, #-0x30]!
00a51bd8	stp x20,x19,[sp, #0x10]
00a51bdc	mov x19,x0
00a51be0	stp x29,x30,[sp, #0x20]
00a51be4	add x29,sp,#0x20
00a51be8	cbz x0,0x00a51ca0
00a51bec	ldr x8,[x19]
00a51bf0	cbz x8,0x00a51c6c
00a51bf4	ldr x8,[x19, #0x8]
00a51bf8	cbz x8,0x00a51c6c
00a51bfc	adrp x21,0xcb5000
00a51c00	ldr x21,[x21, #0x5d8]
00a51c04	ldr x0,[x21]
00a51c08	bl 0x00c356a0
00a51c0c	cbz w0,0x00a51cd4
00a51c10	adrp x20,0xd21000
00a51c14	ldr x22,[x20, #0x9b8]
00a51c18	cbz x22,0x00a51cdc
00a51c1c	ldr x20,[x19]
00a51c20	ldr x0,[x22]
00a51c24	mov x1,x20
00a51c28	bl 0x00c301f0
00a51c2c	cbz w0,0x00a51c38
00a51c30	ldr x22,[x22, #0xc0]
00a51c34	cbnz x22,0x00a51c20
00a51c38	cbz w0,0x00a51d10
00a51c3c	adrp x8,0xd21000
00a51c40	ldr x8,[x8, #0x9c0]
00a51c44	cbz x8,0x00a51c50
00a51c48	ldr x9,[x8, #0xc0]
00a51c4c	cbz x9,0x00a51da4
00a51c50	bl 0x00c342a0
00a51c54	adrp x0,0x2cd000
00a51c58	adrp x2,0x2c9000
00a51c5c	add x0,x0,#0x9e1
00a51c60	add x2,x2,#0x81c
00a51c64	mov w1,#0x5d
00a51c68	b 0x00a51d00
00a51c6c	bl 0x00c342a0
00a51c70	adrp x0,0x2cd000
00a51c74	adrp x2,0x2c9000
00a51c78	add x0,x0,#0x9e1
00a51c7c	add x2,x2,#0x811
00a51c80	mov w1,#0x138
00a51c84	bl 0x00c342b0
00a51c88	mov w0,#0x26
00a51c8c	mov w1,#0x6c
00a51c90	mov x2,xzr
00a51c94	bl 0x00c342c0
00a51c98	mov w19,wzr
00a51c9c	b 0x00a51d74
00a51ca0	bl 0x00c342a0
00a51ca4	adrp x0,0x2cd000
00a51ca8	adrp x2,0x2c9000
00a51cac	add x0,x0,#0x9e1
00a51cb0	add x2,x2,#0x811
00a51cb4	mov w1,#0x134
00a51cb8	bl 0x00c342b0
00a51cbc	mov w1,#0x102
00a51cc0	mov w0,#0x26
00a51cc4	movk w1,#0xc, LSL #16
00a51cc8	mov x2,xzr
00a51ccc	bl 0x00c342c0
00a51cd0	b 0x00a51d74
00a51cd4	mov w19,wzr
00a51cd8	b 0x00a51d74
00a51cdc	adrp x8,0xd21000
00a51ce0	ldr x8,[x8, #0x9c0]
00a51ce4	cbz x8,0x00a51d88
00a51ce8	bl 0x00c342a0
00a51cec	adrp x0,0x2cd000
00a51cf0	adrp x2,0x2c9000
00a51cf4	add x0,x0,#0x9e1
00a51cf8	add x2,x2,#0x81c
00a51cfc	mov w1,#0x4e
00a51d00	bl 0x00c342b0
00a51d04	mov w0,#0x26
00a51d08	mov w1,#0x6e
00a51d0c	b 0x00a51d34
00a51d10	bl 0x00c342a0
00a51d14	adrp x0,0x2cd000
00a51d18	adrp x2,0x2c9000
00a51d1c	add x0,x0,#0x9e1
00a51d20	add x2,x2,#0x81c
00a51d24	mov w1,#0x48
00a51d28	bl 0x00c342b0
00a51d2c	mov w0,#0x26
00a51d30	mov w1,#0x67
00a51d34	mov x2,xzr
00a51d38	bl 0x00c342c0
00a51d3c	bl 0x00c342a0
00a51d40	adrp x0,0x2cd000
00a51d44	adrp x2,0x2c9000
00a51d48	add x0,x0,#0x9e1
00a51d4c	add x2,x2,#0x811
00a51d50	mov w1,#0x13e
00a51d54	bl 0x00c342b0
00a51d58	mov w0,#0x26
00a51d5c	mov w1,#0x6e
00a51d60	mov x2,xzr
00a51d64	bl 0x00c342c0
00a51d68	mov w19,wzr
00a51d6c	ldr x0,[x21]
00a51d70	bl 0x00c35690
00a51d74	mov w0,w19
00a51d78	ldp x29,x30,[sp, #0x20]
00a51d7c	ldp x20,x19,[sp, #0x10]
00a51d80	ldp x22,x21,[sp], #0x30
00a51d84	ret
00a51d88	adrp x0,0xa52000
00a51d8c	add x0,x0,#0x29c
00a51d90	bl 0x00c3bc10
00a51d94	cbz w0,0x00a51dd4
00a51d98	str x19,[x20, #0x9b8]
00a51d9c	str xzr,[x19, #0xb8]
00a51da0	b 0x00a51dac
00a51da4	str x19,[x8, #0xc0]
00a51da8	str x8,[x19, #0xb8]
00a51dac	add x8,x19,#0x9c
00a51db0	ldaxr w9,[x8]
00a51db4	add w9,w9,#0x1
00a51db8	stlxr w10,w9,[x8]
00a51dbc	cbnz w10,0x00a51db0
00a51dc0	adrp x8,0xd21000
00a51dc4	str x19,[x8, #0x9c0]
00a51dc8	str xzr,[x19, #0xc0]
00a51dcc	mov w19,#0x1
00a51dd0	b 0x00a51d6c
00a51dd4	bl 0x00c342a0
00a51dd8	adrp x0,0x2cd000
00a51ddc	adrp x2,0x2c9000
00a51de0	add x0,x0,#0x9e1
00a51de4	add x2,x2,#0x81c
00a51de8	mov w1,#0x55
00a51dec	b 0x00a51d00

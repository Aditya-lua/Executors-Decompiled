; BN_CTX_free @ 00a03bf0
00a03bf0	cbz x0,0x00a03d74
00a03bf4	str x21,[sp, #-0x30]!
00a03bf8	stp x20,x19,[sp, #0x10]
00a03bfc	stp x29,x30,[sp, #0x20]
00a03c00	mov x19,x0
00a03c04	ldr x0,[x0, #0x20]
00a03c08	adrp x1,0x2c7000
00a03c0c	add x1,x1,#0x763
00a03c10	mov w2,#0x102
00a03c14	add x29,sp,#0x20
00a03c18	bl 0x00c32310
00a03c1c	ldr x21,[x19]
00a03c20	str xzr,[x19, #0x20]
00a03c24	cbz x21,0x00a03d54
00a03c28	adrp x20,0x2c7000
00a03c2c	add x20,x20,#0x763
00a03c30	ldr x8,[x21]
00a03c34	cbz x8,0x00a03c40
00a03c38	mov x0,x21
00a03c3c	bl 0x00c322e0
00a03c40	mov x0,x21
00a03c44	ldr x8,[x0, #0x18]!
00a03c48	cbz x8,0x00a03c50
00a03c4c	bl 0x00c322e0
00a03c50	mov x0,x21
00a03c54	ldr x8,[x0, #0x30]!
00a03c58	cbz x8,0x00a03c60
00a03c5c	bl 0x00c322e0
00a03c60	mov x0,x21
00a03c64	ldr x8,[x0, #0x48]!
00a03c68	cbz x8,0x00a03c70
00a03c6c	bl 0x00c322e0
00a03c70	mov x0,x21
00a03c74	ldr x8,[x0, #0x60]!
00a03c78	cbz x8,0x00a03c80
00a03c7c	bl 0x00c322e0
00a03c80	mov x0,x21
00a03c84	ldr x8,[x0, #0x78]!
00a03c88	cbz x8,0x00a03c90
00a03c8c	bl 0x00c322e0
00a03c90	mov x0,x21
00a03c94	ldr x8,[x0, #0x90]!
00a03c98	cbz x8,0x00a03ca0
00a03c9c	bl 0x00c322e0
00a03ca0	mov x0,x21
00a03ca4	ldr x8,[x0, #0xa8]!
00a03ca8	cbz x8,0x00a03cb0
00a03cac	bl 0x00c322e0
00a03cb0	mov x0,x21
00a03cb4	ldr x8,[x0, #0xc0]!
00a03cb8	cbz x8,0x00a03cc0
00a03cbc	bl 0x00c322e0
00a03cc0	mov x0,x21
00a03cc4	ldr x8,[x0, #0xd8]!
00a03cc8	cbz x8,0x00a03cd0
00a03ccc	bl 0x00c322e0
00a03cd0	mov x0,x21
00a03cd4	ldr x8,[x0, #0xf0]!
00a03cd8	cbz x8,0x00a03ce0
00a03cdc	bl 0x00c322e0
00a03ce0	ldr x8,[x21, #0x108]
00a03ce4	cbz x8,0x00a03cf0
00a03ce8	add x0,x21,#0x108
00a03cec	bl 0x00c322e0
00a03cf0	ldr x8,[x21, #0x120]
00a03cf4	cbz x8,0x00a03d00
00a03cf8	add x0,x21,#0x120
00a03cfc	bl 0x00c322e0
00a03d00	ldr x8,[x21, #0x138]
00a03d04	cbz x8,0x00a03d10
00a03d08	add x0,x21,#0x138
00a03d0c	bl 0x00c322e0
00a03d10	ldr x8,[x21, #0x150]
00a03d14	cbz x8,0x00a03d20
00a03d18	add x0,x21,#0x150
00a03d1c	bl 0x00c322e0
00a03d20	ldr x8,[x21, #0x168]
00a03d24	cbz x8,0x00a03d30
00a03d28	add x0,x21,#0x168
00a03d2c	bl 0x00c322e0
00a03d30	ldr x0,[x19]
00a03d34	mov w2,#0x136
00a03d38	mov x1,x20
00a03d3c	ldr x8,[x0, #0x188]
00a03d40	str x8,[x19, #0x8]
00a03d44	bl 0x00c32310
00a03d48	ldr x21,[x19, #0x8]
00a03d4c	str x21,[x19]
00a03d50	cbnz x21,0x00a03c30
00a03d54	mov x0,x19
00a03d58	ldp x29,x30,[sp, #0x20]
00a03d5c	ldp x20,x19,[sp, #0x10]
00a03d60	adrp x1,0x2c7000
00a03d64	add x1,x1,#0x763
00a03d68	mov w2,#0xb2
00a03d6c	ldr x21,[sp], #0x30
00a03d70	b 0x00c32310
00a03d74	ret

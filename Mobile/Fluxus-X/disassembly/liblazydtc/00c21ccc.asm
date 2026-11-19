; FUN_00c21ccc @ 00c21ccc
00c21ccc	paciasp
00c21cd0	stp x29,x30,[sp, #-0x40]!
00c21cd4	stp x24,x23,[sp, #0x10]
00c21cd8	stp x22,x21,[sp, #0x20]
00c21cdc	stp x20,x19,[sp, #0x30]
00c21ce0	mov x29,sp
00c21ce4	ldp x8,x9,[x0]
00c21ce8	cmp x9,x8
00c21cec	b.eq 0x00c21d54
00c21cf0	ldrb w8,[x8]
00c21cf4	cmp w8,#0x44
00c21cf8	b.eq 0x00c21d6c
00c21cfc	cmp w8,#0x54
00c21d00	b.ne 0x00c21d54
00c21d04	mov x23,x0
00c21d08	bl 0x00c14ebc
00c21d0c	cbz x0,0x00c21e08
00c21d10	ldp x21,x9,[x23, #0x130]
00c21d14	mov x8,x23
00c21d18	cmp x21,x9
00c21d1c	b.ne 0x00c21e00
00c21d20	ldr x20,[x8, #0x128]
00c21d24	add x24,x8,#0x140
00c21d28	mov x22,x0
00c21d2c	sub x19,x21,x20
00c21d30	cmp x20,x24
00c21d34	lsl x1,x19,#0x1
00c21d38	b.eq 0x00c21dbc
00c21d3c	mov x0,x20
00c21d40	bl 0x00c30950
00c21d44	mov x8,x23
00c21d48	str x0,[x23, #0x128]
00c21d4c	cbnz x0,0x00c21dec
00c21d50	bl 0x00c30b40
00c21d54	ldp x20,x19,[sp, #0x30]
00c21d58	ldp x22,x21,[sp, #0x20]
00c21d5c	ldp x24,x23,[sp, #0x10]
00c21d60	ldp x29,x30,[sp], #0x40
00c21d64	autiasp
00c21d68	b 0x00c153b4
00c21d6c	mov x23,x0
00c21d70	bl 0x00c15284
00c21d74	cbz x0,0x00c21e08
00c21d78	ldp x21,x9,[x23, #0x130]
00c21d7c	mov x8,x23
00c21d80	cmp x21,x9
00c21d84	b.ne 0x00c21e00
00c21d88	ldr x20,[x8, #0x128]
00c21d8c	add x8,x8,#0x140
00c21d90	mov x22,x0
00c21d94	sub x19,x21,x20
00c21d98	cmp x20,x8
00c21d9c	lsl x1,x19,#0x1
00c21da0	b.eq 0x00c21e20
00c21da4	mov x0,x20
00c21da8	bl 0x00c30950
00c21dac	mov x8,x23
00c21db0	str x0,[x23, #0x128]
00c21db4	cbnz x0,0x00c21dec
00c21db8	bl 0x00c30b40
00c21dbc	mov x0,x1
00c21dc0	bl 0x00c308d0
00c21dc4	cbz x0,0x00c21e38
00c21dc8	cmp x21,x24
00c21dcc	b.eq 0x00c21de4
00c21dd0	mov x1,x20
00c21dd4	mov x2,x19
00c21dd8	mov x21,x0
00c21ddc	bl 0x00c2ff60
00c21de0	mov x0,x21
00c21de4	mov x8,x23
00c21de8	str x0,[x23, #0x128]
00c21dec	asr x9,x19,#0x2
00c21df0	add x21,x0,x19
00c21df4	add x9,x0,x9, LSL #0x3
00c21df8	mov x0,x22
00c21dfc	str x9,[x8, #0x138]
00c21e00	str x0,[x21], #0x8
00c21e04	str x21,[x8, #0x130]
00c21e08	ldp x20,x19,[sp, #0x30]
00c21e0c	ldp x22,x21,[sp, #0x20]
00c21e10	ldp x24,x23,[sp, #0x10]
00c21e14	ldp x29,x30,[sp], #0x40
00c21e18	autiasp
00c21e1c	ret
00c21e20	mov x0,x1
00c21e24	bl 0x00c308d0
00c21e28	cbz x0,0x00c21e3c
00c21e2c	cmp x21,x20
00c21e30	b.ne 0x00c21dd0
00c21e34	b 0x00c21de4
00c21e38	bl 0x00c30b40
00c21e3c	bl 0x00c30b40

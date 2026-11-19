; EC_POINT_oct2point @ 00a34c40
00a34c40	stp x29,x30,[sp, #-0x10]!
00a34c44	ldr x8,[x0]
00a34c48	mov x29,sp
00a34c4c	ldr x5,[x8, #0x98]
00a34c50	cbnz x5,0x00a34c88
00a34c54	ldrb w9,[x8]
00a34c58	tbnz w9,#0x0,0x00a34c88
00a34c5c	bl 0x00c342a0
00a34c60	adrp x0,0x2bd000
00a34c64	adrp x2,0x2c7000
00a34c68	add x0,x0,#0x968
00a34c6c	add x2,x2,#0x880
00a34c70	mov w1,#0x6e
00a34c74	bl 0x00c342b0
00a34c78	mov w1,#0x101
00a34c7c	mov w0,#0x10
00a34c80	movk w1,#0xc, LSL #16
00a34c84	b 0x00a34cb8
00a34c88	ldr x9,[x1]
00a34c8c	cmp x8,x9
00a34c90	b.eq 0x00a34ccc
00a34c94	bl 0x00c342a0
00a34c98	adrp x0,0x2bd000
00a34c9c	adrp x2,0x2c7000
00a34ca0	add x0,x0,#0x968
00a34ca4	add x2,x2,#0x880
00a34ca8	mov w1,#0x72
00a34cac	bl 0x00c342b0
00a34cb0	mov w0,#0x10
00a34cb4	mov w1,#0x65
00a34cb8	mov x2,xzr
00a34cbc	bl 0x00c342c0
00a34cc0	mov w0,wzr
00a34cc4	ldp x29,x30,[sp], #0x10
00a34cc8	ret
00a34ccc	ldr w9,[x0, #0x20]
00a34cd0	cbz w9,0x00a34ce4
00a34cd4	ldr w10,[x1, #0x8]
00a34cd8	cbz w10,0x00a34ce4
00a34cdc	cmp w9,w10
00a34ce0	b.ne 0x00a34c94
00a34ce4	ldrb w9,[x8]
00a34ce8	tbnz w9,#0x0,0x00a34cf4
00a34cec	ldp x29,x30,[sp], #0x10
00a34cf0	br x5
00a34cf4	ldr w8,[x8, #0x4]
00a34cf8	cmp w8,#0x196
00a34cfc	b.ne 0x00a34d08
00a34d00	ldp x29,x30,[sp], #0x10
00a34d04	b 0x00c3b140
00a34d08	ldp x29,x30,[sp], #0x10
00a34d0c	b 0x00c3a6c0

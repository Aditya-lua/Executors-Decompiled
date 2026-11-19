; ZSTD_decompressDCtx @ 00bb0cf4
00bb0cf4	stp x29,x30,[sp, #-0x40]!
00bb0cf8	stp x24,x23,[sp, #0x10]
00bb0cfc	stp x22,x21,[sp, #0x20]
00bb0d00	stp x20,x19,[sp, #0x30]
00bb0d04	mov x29,sp
00bb0d08	mov w19,#0x7600
00bb0d0c	ldr w8,[x0, x19#0x0]
00bb0d10	cmn w8,#0x1
00bb0d14	b.eq 0x00bb0d2c
00bb0d18	cmp w8,#0x1
00bb0d1c	b.ne 0x00bb0d34
00bb0d20	ldr x7,[x0, #0x75f0]
00bb0d24	str wzr,[x0, x19#0x0]
00bb0d28	b 0x00bb0d7c
00bb0d2c	ldr x7,[x0, #0x75f0]
00bb0d30	b 0x00bb0d7c
00bb0d34	ldr x8,[x0, #0x75e8]
00bb0d38	mov x20,x0
00bb0d3c	mov x21,x4
00bb0d40	mov x24,x3
00bb0d44	mov x22,x2
00bb0d48	mov x23,x1
00bb0d4c	mov x0,x8
00bb0d50	bl 0x00c435b0
00bb0d54	movi v0.2D,#0x0
00bb0d58	mov w8,#0x75e8
00bb0d5c	mov x1,x23
00bb0d60	mov x0,x20
00bb0d64	mov x2,x22
00bb0d68	mov x3,x24
00bb0d6c	mov x4,x21
00bb0d70	mov x7,xzr
00bb0d74	str wzr,[x20, x19#0x0]
00bb0d78	str q0,[x20,x8]
00bb0d7c	mov x5,xzr
00bb0d80	mov x6,xzr
00bb0d84	ldp x20,x19,[sp, #0x30]
00bb0d88	ldp x22,x21,[sp, #0x20]
00bb0d8c	ldp x24,x23,[sp, #0x10]
00bb0d90	ldp x29,x30,[sp], #0x40
00bb0d94	b 0x00bb0774

; FUN_00c1fb88 @ 00c1fb88
00c1fb88	paciasp
00c1fb8c	stp x29,x30,[sp, #-0x30]!
00c1fb90	str x21,[sp, #0x10]
00c1fb94	stp x20,x19,[sp, #0x20]
00c1fb98	mov x29,sp
00c1fb9c	ldr x21,[x0, #0x1330]
00c1fba0	mov x19,x1
00c1fba4	ldr x8,[x21, #0x8]
00c1fba8	sub x9,x8,#0xfd0
00c1fbac	cmn x9,#0xff1
00c1fbb0	b.hi 0x00c1fbd4
00c1fbb4	mov x20,x0
00c1fbb8	mov w0,#0x1000
00c1fbbc	bl 0x00c308d0
00c1fbc0	cbz x0,0x00c1fc24
00c1fbc4	mov x8,xzr
00c1fbc8	stp x21,xzr,[x0]
00c1fbcc	mov x21,x0
00c1fbd0	str x0,[x20, #0x1330]
00c1fbd4	add x9,x8,#0x20
00c1fbd8	add x0,x21,x8
00c1fbdc	adrp x8,0xcb2000
00c1fbe0	add x8,x8,#0x738
00c1fbe4	str x9,[x21, #0x8]
00c1fbe8	mov w9,#0x43
00c1fbec	str x8,[x0, #0x10]!
00c1fbf0	ldurh w8,[x0, #0x9]
00c1fbf4	strb w9,[x0, #0x8]
00c1fbf8	mov w9,#0x540
00c1fbfc	and w8,w8,#0xf000
00c1fc00	ldr q0,[x19]
00c1fc04	orr w8,w8,w9
00c1fc08	sturh w8,[x0, #0x9]
00c1fc0c	str q0,[x0, #0x10]
00c1fc10	ldp x20,x19,[sp, #0x20]
00c1fc14	ldr x21,[sp, #0x10]
00c1fc18	ldp x29,x30,[sp], #0x30
00c1fc1c	autiasp
00c1fc20	ret
00c1fc24	bl 0x00c2fff0

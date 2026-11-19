; FUN_00c25334 @ 00c25334
00c25334	paciasp
00c25338	stp x29,x30,[sp, #-0x30]!
00c2533c	str x21,[sp, #0x10]
00c25340	stp x20,x19,[sp, #0x20]
00c25344	mov x29,sp
00c25348	ldr x21,[x0, #0x1330]
00c2534c	mov x19,x1
00c25350	ldr x8,[x21, #0x8]
00c25354	sub x9,x8,#0xfd0
00c25358	cmn x9,#0xff1
00c2535c	b.hi 0x00c25380
00c25360	mov x20,x0
00c25364	mov w0,#0x1000
00c25368	bl 0x00c308d0
00c2536c	cbz x0,0x00c253dc
00c25370	mov x8,xzr
00c25374	stp x21,xzr,[x0]
00c25378	mov x21,x0
00c2537c	str x0,[x20, #0x1330]
00c25380	add x9,x8,#0x20
00c25384	mov x0,x19
00c25388	add x20,x21,x8
00c2538c	str x9,[x21, #0x8]
00c25390	bl 0x00c2ff50
00c25394	adrp x9,0xcb1000
00c25398	add x9,x9,#0x4c0
00c2539c	mov w11,#0x540
00c253a0	str x9,[x20, #0x10]!
00c253a4	ldurh w9,[x20, #0x9]
00c253a8	mov x8,x0
00c253ac	mov w10,#0x8
00c253b0	and w9,w9,#0xf000
00c253b4	strb w10,[x20, #0x8]
00c253b8	orr w9,w9,w11
00c253bc	stp x19,x8,[x20, #0x10]
00c253c0	sturh w9,[x20, #0x9]
00c253c4	mov x0,x20
00c253c8	ldp x20,x19,[sp, #0x20]
00c253cc	ldr x21,[sp, #0x10]
00c253d0	ldp x29,x30,[sp], #0x30
00c253d4	autiasp
00c253d8	ret
00c253dc	bl 0x00c2fff0

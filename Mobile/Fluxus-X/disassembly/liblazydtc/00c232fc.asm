; FUN_00c232fc @ 00c232fc
00c232fc	paciasp
00c23300	stp x29,x30,[sp, #-0x30]!
00c23304	str x21,[sp, #0x10]
00c23308	stp x20,x19,[sp, #0x20]
00c2330c	mov x29,sp
00c23310	ldrb w9,[x0, #0x18]
00c23314	mov x8,x0
00c23318	mov x19,x1
00c2331c	cmp w9,#0x1
00c23320	b.ne 0x00c23378
00c23324	ldp x9,x10,[x19, #0x8]
00c23328	ldr x0,[x19]
00c2332c	add x11,x9,#0x1
00c23330	cmp x11,x10
00c23334	b.ls 0x00c23364
00c23338	mov x20,x8
00c2333c	lsl x8,x10,#0x1
00c23340	add x9,x9,#0x3e1
00c23344	cmp x8,x9
00c23348	csel x1,x8,x9,hi
00c2334c	str x1,[x19, #0x10]
00c23350	bl 0x00c30950
00c23354	str x0,[x19]
00c23358	cbz x0,0x00c23400
00c2335c	ldr x9,[x19, #0x8]
00c23360	mov x8,x20
00c23364	mov w10,#0x7e
00c23368	strb w10,[x0, x9]
00c2336c	ldr x9,[x19, #0x8]
00c23370	add x9,x9,#0x1
00c23374	str x9,[x19, #0x8]
00c23378	ldr x0,[x8, #0x10]
00c2337c	ldr x8,[x0]
00c23380	ldr x8,[x8, #0x38]
00c23384	blr x8
00c23388	cbz x1,0x00c233e8
00c2338c	ldp x8,x9,[x19, #0x8]
00c23390	mov x21,x0
00c23394	ldr x0,[x19]
00c23398	mov x20,x1
00c2339c	add x10,x8,x1
00c233a0	cmp x10,x9
00c233a4	b.ls 0x00c233cc
00c233a8	lsl x8,x9,#0x1
00c233ac	add x9,x10,#0x3e0
00c233b0	cmp x8,x9
00c233b4	csel x1,x8,x9,hi
00c233b8	str x1,[x19, #0x10]
00c233bc	bl 0x00c30950
00c233c0	str x0,[x19]
00c233c4	cbz x0,0x00c233fc
00c233c8	ldr x8,[x19, #0x8]
00c233cc	add x0,x0,x8
00c233d0	mov x1,x21
00c233d4	mov x2,x20
00c233d8	bl 0x00c2ffd0
00c233dc	ldr x8,[x19, #0x8]
00c233e0	add x8,x8,x20
00c233e4	str x8,[x19, #0x8]
00c233e8	ldp x20,x19,[sp, #0x20]
00c233ec	ldr x21,[sp, #0x10]
00c233f0	ldp x29,x30,[sp], #0x30
00c233f4	autiasp
00c233f8	ret
00c233fc	bl 0x00c30b40
00c23400	bl 0x00c30b40

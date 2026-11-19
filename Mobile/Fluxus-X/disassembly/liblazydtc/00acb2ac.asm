; RC2_ecb_encrypt @ 00acb2ac
00acb2ac	sub sp,sp,#0x30
00acb2b0	stp x29,x30,[sp, #0x20]
00acb2b4	ldrb w8,[x0]
00acb2b8	ldrb w9,[x0, #0x1]
00acb2bc	ldrb w10,[x0, #0x2]
00acb2c0	ldrb w11,[x0, #0x3]
00acb2c4	str x19,[sp, #0x10]
00acb2c8	bfm x8,x9,#0x38,#0x7
00acb2cc	bfm x8,x10,#0x30,#0x7
00acb2d0	bfm x8,x11,#0x28,#0x7
00acb2d4	str x8,[sp]
00acb2d8	ldrb w8,[x0, #0x4]
00acb2dc	ldrb w9,[x0, #0x5]
00acb2e0	ldrb w10,[x0, #0x6]
00acb2e4	ldrb w11,[x0, #0x7]
00acb2e8	mov x19,x1
00acb2ec	bfm x8,x9,#0x38,#0x7
00acb2f0	bfm x8,x10,#0x30,#0x7
00acb2f4	bfm x8,x11,#0x28,#0x7
00acb2f8	mov x0,sp
00acb2fc	mov x1,x2
00acb300	add x29,sp,#0x20
00acb304	str x8,[sp, #0x8]
00acb308	cbz w3,0x00acb314
00acb30c	bl 0x00c3f9f0
00acb310	b 0x00acb318
00acb314	bl 0x00c3f9e0
00acb318	ldr x8,[sp]
00acb31c	lsr x9,x8,#0x8
00acb320	strb w8,[x19]
00acb324	strb w9,[x19, #0x1]
00acb328	lsr x9,x8,#0x10
00acb32c	lsr x8,x8,#0x18
00acb330	strb w9,[x19, #0x2]
00acb334	strb w8,[x19, #0x3]
00acb338	ldr x8,[sp, #0x8]
00acb33c	lsr x9,x8,#0x8
00acb340	strb w8,[x19, #0x4]
00acb344	strb w9,[x19, #0x5]
00acb348	lsr x9,x8,#0x10
00acb34c	lsr x8,x8,#0x18
00acb350	strb w9,[x19, #0x6]
00acb354	strb w8,[x19, #0x7]
00acb358	ldp x29,x30,[sp, #0x20]
00acb35c	ldr x19,[sp, #0x10]
00acb360	add sp,sp,#0x30
00acb364	ret

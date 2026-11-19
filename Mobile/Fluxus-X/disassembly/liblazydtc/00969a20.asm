; FUN_00969a20 @ 00969a20
00969a20	stp x22,x21,[sp, #-0x30]!
00969a24	stp x20,x19,[sp, #0x10]
00969a28	stp x29,x30,[sp, #0x20]
00969a2c	add x29,sp,#0x20
00969a30	ldr x21,[x0, #0x10]
00969a34	mov x19,x0
00969a38	ldr x20,[x21, #0x38]
00969a3c	str x1,[x21, #0x38]
00969a40	cbz x21,0x00969aac
00969a44	adrp x8,0xcc4000
00969a48	ldr x8,[x8, #0xd08]
00969a4c	mov x0,x19
00969a50	ldr x8,[x8, #0x80]
00969a54	blr x8
00969a58	ldp x8,x0,[x21]
00969a5c	str wzr,[x21, #0x50]
00969a60	cmp x0,x8
00969a64	b.eq 0x00969a78
00969a68	adrp x8,0xcc4000
00969a6c	add x8,x8,#0x678
00969a70	ldr x8,[x8]
00969a74	blr x8
00969a78	adrp x22,0xcc4000
00969a7c	add x22,x22,#0x678
00969a80	ldr x0,[x21, #0x10]
00969a84	ldr x8,[x22]
00969a88	blr x8
00969a8c	ldr x8,[x22]
00969a90	ldr x0,[x21]
00969a94	blr x8
00969a98	str wzr,[x21, #0x18]
00969a9c	stp xzr,xzr,[x21, #0x8]
00969aa0	str xzr,[x21]
00969aa4	ldr x8,[x19, #0x10]
00969aa8	b 0x00969ab0
00969aac	mov x8,xzr
00969ab0	ldrb w9,[x19, #0x24]
00969ab4	and w9,w9,#0xfe
00969ab8	strb w9,[x19, #0x24]
00969abc	str x20,[x8, #0x38]
00969ac0	ldr x20,[x19, #0x10]
00969ac4	cbz x20,0x00969ae8
00969ac8	adrp x21,0xcc4000
00969acc	add x21,x21,#0x678
00969ad0	ldr x0,[x20, #0x30]
00969ad4	ldr x8,[x21]
00969ad8	blr x8
00969adc	ldr x8,[x21]
00969ae0	mov x0,x20
00969ae4	blr x8
00969ae8	str xzr,[x19, #0x10]
00969aec	ldp x29,x30,[sp, #0x20]
00969af0	ldp x20,x19,[sp, #0x10]
00969af4	ldp x22,x21,[sp], #0x30
00969af8	ret

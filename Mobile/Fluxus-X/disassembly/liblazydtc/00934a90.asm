; FUN_00934a90 @ 00934a90
00934a90	str x19,[sp, #-0x20]!
00934a94	stp x29,x30,[sp, #0x10]
00934a98	add x29,sp,#0x10
00934a9c	ldrb w8,[x0, #0x10]
00934aa0	mov x19,x0
00934aa4	tbz w8,#0x0,0x00934abc
00934aa8	adrp x8,0xcc4000
00934aac	add x8,x8,#0x678
00934ab0	ldr x0,[x19]
00934ab4	ldr x8,[x8]
00934ab8	blr x8
00934abc	stp xzr,xzr,[x19]
00934ac0	str xzr,[x19, #0x10]
00934ac4	ldp x29,x30,[sp, #0x10]
00934ac8	ldr x19,[sp], #0x20
00934acc	ret

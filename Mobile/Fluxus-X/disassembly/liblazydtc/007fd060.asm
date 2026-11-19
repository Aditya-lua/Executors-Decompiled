; FUN_007fd060 @ 007fd060
007fd060	cmp x1,#0x1
007fd064	b.lt 0x007fd0c8
007fd068	stp x29,x30,[sp, #-0x30]!
007fd06c	str x21,[sp, #0x10]
007fd070	stp x20,x19,[sp, #0x20]
007fd074	mov x29,sp
007fd078	adrp x8,0xcca000
007fd07c	mov w9,#0x1
007fd080	mov x19,x0
007fd084	ldr x21,[x8, #0x938]
007fd088	mov x20,x1
007fd08c	add x8,x21,#0x29
007fd090	stlrb w9,[x8]
007fd094	adrp x8,0xcca000
007fd098	ldr x8,[x8, #0x948]
007fd09c	mov x0,x8
007fd0a0	bl 0x008046a0
007fd0a4	mov x0,x19
007fd0a8	mov x1,x20
007fd0ac	add x8,x21,#0x28
007fd0b0	stp xzr,xzr,[x21, #0x8]
007fd0b4	stlrb wzr,[x8]
007fd0b8	str xzr,[x21]
007fd0bc	ldp x20,x19,[sp, #0x20]
007fd0c0	ldr x21,[sp, #0x10]
007fd0c4	ldp x29,x30,[sp], #0x30
007fd0c8	adrp x8,0xcca000
007fd0cc	ldr x2,[x8, #0x968]
007fd0d0	br x2

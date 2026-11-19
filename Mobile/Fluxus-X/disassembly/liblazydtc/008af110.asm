; FUN_008af110 @ 008af110
008af110	sub sp,sp,#0x40
008af114	stp x29,x30,[sp, #0x10]
008af118	str x21,[sp, #0x20]
008af11c	stp x20,x19,[sp, #0x30]
008af120	add x29,sp,#0x10
008af124	mrs x21,tpidr_el0
008af128	add x2,sp,#0x4
008af12c	mov w19,w1
008af130	ldr x8,[x21, #0x28]
008af134	mov x20,x0
008af138	str x8,[sp, #0x8]
008af13c	bl 0x008ab528
008af140	ldr w8,[sp, #0x4]
008af144	cbz w8,0x008af16c
008af148	ldr x8,[x21, #0x28]
008af14c	ldr x9,[sp, #0x8]
008af150	cmp x8,x9
008af154	b.ne 0x008af18c
008af158	ldp x20,x19,[sp, #0x30]
008af15c	ldr x21,[sp, #0x20]
008af160	ldp x29,x30,[sp, #0x10]
008af164	add sp,sp,#0x40
008af168	ret
008af16c	ldr x8,[x21, #0x28]
008af170	ldr x9,[sp, #0x8]
008af174	cmp x8,x9
008af178	b.ne 0x008af18c
008af17c	mov x0,x20
008af180	mov w1,w19
008af184	mov w2,#0x3
008af188	bl 0x008af05c
008af18c	bl 0x00c2fec0

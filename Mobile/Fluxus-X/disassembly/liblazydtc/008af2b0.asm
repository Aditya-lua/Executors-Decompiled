; FUN_008af2b0 @ 008af2b0
008af2b0	sub sp,sp,#0x40
008af2b4	stp x29,x30,[sp, #0x10]
008af2b8	str x21,[sp, #0x20]
008af2bc	stp x20,x19,[sp, #0x30]
008af2c0	add x29,sp,#0x10
008af2c4	mrs x21,tpidr_el0
008af2c8	add x2,sp,#0x4
008af2cc	mov w19,w1
008af2d0	ldr x8,[x21, #0x28]
008af2d4	mov x20,x0
008af2d8	str x8,[sp, #0x8]
008af2dc	bl 0x008ab66c
008af2e0	ldr w8,[sp, #0x4]
008af2e4	cbz w8,0x008af30c
008af2e8	ldr x8,[x21, #0x28]
008af2ec	ldr x9,[sp, #0x8]
008af2f0	cmp x8,x9
008af2f4	b.ne 0x008af32c
008af2f8	ldp x20,x19,[sp, #0x30]
008af2fc	ldr x21,[sp, #0x20]
008af300	ldp x29,x30,[sp, #0x10]
008af304	add sp,sp,#0x40
008af308	ret
008af30c	ldr x8,[x21, #0x28]
008af310	ldr x9,[sp, #0x8]
008af314	cmp x8,x9
008af318	b.ne 0x008af32c
008af31c	mov x0,x20
008af320	mov w1,w19
008af324	mov w2,#0x3
008af328	bl 0x008af05c
008af32c	bl 0x00c2fec0

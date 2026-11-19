; FUN_007fdc48 @ 007fdc48
007fdc48	sub sp,sp,#0x50
007fdc4c	stp x29,x30,[sp, #0x20]
007fdc50	stp x22,x21,[sp, #0x30]
007fdc54	stp x20,x19,[sp, #0x40]
007fdc58	add x29,sp,#0x20
007fdc5c	mrs x22,tpidr_el0
007fdc60	mov x19,x0
007fdc64	mov w0,#0x8
007fdc68	ldr x8,[x22, #0x28]
007fdc6c	mov x20,x1
007fdc70	stur x8,[x29, #-0x8]
007fdc74	bl 0x00c2fed0
007fdc78	mov x21,x0
007fdc7c	bl 0x00c2ffa0
007fdc80	str x21,[sp, #0x10]
007fdc84	mov w0,#0x10
007fdc88	bl 0x00c2fed0
007fdc8c	mov x3,x0
007fdc90	stp x0,xzr,[sp, #0x8]
007fdc94	stp x21,x20,[x0]
007fdc98	nop
007fdc9c	adr x2,0x7ff484
007fdca0	mov x0,x19
007fdca4	mov x1,xzr
007fdca8	bl 0x00c2ffb0
007fdcac	cbnz w0,0x007fdcd4
007fdcb0	ldr x8,[x22, #0x28]
007fdcb4	ldur x9,[x29, #-0x8]
007fdcb8	cmp x8,x9
007fdcbc	b.ne 0x007fdd38
007fdcc0	ldp x20,x19,[sp, #0x40]
007fdcc4	ldp x22,x21,[sp, #0x30]
007fdcc8	ldp x29,x30,[sp, #0x20]
007fdccc	add sp,sp,#0x50
007fdcd0	ret
007fdcd4	ldr x8,[x22, #0x28]
007fdcd8	ldur x9,[x29, #-0x8]
007fdcdc	cmp x8,x9
007fdce0	b.ne 0x007fdd38
007fdce4	adrp x1,0x2a7000
007fdce8	add x1,x1,#0x22
007fdcec	bl 0x00c2ffc0
007fdd38	bl 0x00c2fec0

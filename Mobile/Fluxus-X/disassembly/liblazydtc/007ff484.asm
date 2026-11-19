; FUN_007ff484 @ 007ff484
007ff484	sub sp,sp,#0x40
007ff488	stp x29,x30,[sp, #0x10]
007ff48c	str x21,[sp, #0x20]
007ff490	stp x20,x19,[sp, #0x30]
007ff494	add x29,sp,#0x10
007ff498	mrs x21,tpidr_el0
007ff49c	mov x19,x0
007ff4a0	ldr x8,[x21, #0x28]
007ff4a4	str x8,[sp, #0x8]
007ff4a8	str x0,[sp]
007ff4ac	bl 0x00c30180
007ff4b0	ldr x1,[x19]
007ff4b4	ldr w0,[x0]
007ff4b8	str xzr,[x19]
007ff4bc	bl 0x00c30190
007ff4c0	ldr x8,[x19, #0x8]
007ff4c4	blr x8
007ff4c8	ldr x20,[x19]
007ff4cc	str xzr,[x19]
007ff4d0	cbz x20,0x007ff4e8
007ff4d4	mov x0,x20
007ff4d8	bl 0x00c301a0
007ff4dc	mov x0,x20
007ff4e0	mov w1,#0x8
007ff4e4	bl 0x00c2fe80
007ff4e8	ldr x8,[x21, #0x28]
007ff4ec	ldr x9,[sp, #0x8]
007ff4f0	cmp x8,x9
007ff4f4	b.ne 0x007ff540
007ff4f8	mov x0,x19
007ff4fc	mov w1,#0x10
007ff500	bl 0x00c2fe80
007ff504	mov x0,xzr
007ff508	ldp x20,x19,[sp, #0x30]
007ff50c	ldr x21,[sp, #0x20]
007ff510	ldp x29,x30,[sp, #0x10]
007ff514	add sp,sp,#0x40
007ff518	ret
007ff540	bl 0x00c2fec0

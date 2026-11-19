; cpr::Session::intercept @ 008ebe90
008ebe90	stp x24,x23,[sp, #-0x40]!
008ebe94	stp x22,x21,[sp, #0x10]
008ebe98	stp x20,x19,[sp, #0x20]
008ebe9c	stp x29,x30,[sp, #0x30]
008ebea0	add x29,sp,#0x30
008ebea4	ldr x10,[x0, #0x298]
008ebea8	ldr x9,[x0, #0x280]
008ebeac	mov x20,x0
008ebeb0	mov x22,x8
008ebeb4	lsr x11,x10,#0x5
008ebeb8	and x11,x11,#0x7fffffffffffff8
008ebebc	add x9,x9,x11
008ebec0	ldr x11,[x9]
008ebec4	add x11,x11,w10, UXTB  #0x4
008ebec8	ldp x21,x19,[x11]
008ebecc	cbz x19,0x008ebf00
008ebed0	add x8,x19,#0x8
008ebed4	ldxr x9,[x8]
008ebed8	add x9,x9,#0x1
008ebedc	stxr w10,x9,[x8]
008ebee0	cbnz w10,0x008ebed4
008ebee4	ldr x8,[x20, #0x298]
008ebee8	ldr x9,[x20, #0x280]
008ebeec	lsr x10,x8,#0x5
008ebef0	and x10,x10,#0x7fffffffffffff8
008ebef4	add x9,x9,x10
008ebef8	and x8,x8,#0xff
008ebefc	b 0x008ebf04
008ebf00	and x8,x10,#0xff
008ebf04	ldr x9,[x9]
008ebf08	add x24,x20,#0x298
008ebf0c	add x8,x9,x8, LSL #0x4
008ebf10	ldr x23,[x8, #0x8]
008ebf14	cbz x23,0x008ebf48
008ebf18	add x8,x23,#0x8
008ebf1c	ldaxr x9,[x8]
008ebf20	sub x10,x9,#0x1
008ebf24	stlxr w11,x10,[x8]
008ebf28	cbnz w11,0x008ebf1c
008ebf2c	cbnz x9,0x008ebf48
008ebf30	ldr x8,[x23]
008ebf34	mov x0,x23
008ebf38	ldr x8,[x8, #0x10]
008ebf3c	blr x8
008ebf40	mov x0,x23
008ebf44	bl 0x00c2ff00
008ebf48	adrp x8,0x29c000
008ebf4c	ldr q0,[x24]
008ebf50	ldr q1,[x8, #0xf10]
008ebf54	add v0.2D,v0.2D,v1.2D
008ebf58	fmov x8,d0
008ebf5c	cmp x8,#0x200
008ebf60	str q0,[x24]
008ebf64	b.cc 0x008ebf8c
008ebf68	ldr x8,[x20, #0x280]
008ebf6c	ldr x0,[x8]
008ebf70	bl 0x00c301d0
008ebf74	ldr x8,[x20, #0x280]
008ebf78	ldr x9,[x20, #0x298]
008ebf7c	add x8,x8,#0x8
008ebf80	sub x9,x9,#0x100
008ebf84	str x8,[x20, #0x280]
008ebf88	str x9,[x20, #0x298]
008ebf8c	ldr x8,[x21]
008ebf90	ldr x9,[x8, #0x10]
008ebf94	mov x8,x22
008ebf98	mov x0,x21
008ebf9c	mov x1,x20
008ebfa0	blr x9
008ebfa4	cbz x19,0x008ebfc0
008ebfa8	add x8,x19,#0x8
008ebfac	ldaxr x9,[x8]
008ebfb0	sub x10,x9,#0x1
008ebfb4	stlxr w11,x10,[x8]
008ebfb8	cbnz w11,0x008ebfac
008ebfbc	cbz x9,0x008ebfd4
008ebfc0	ldp x29,x30,[sp, #0x30]
008ebfc4	ldp x20,x19,[sp, #0x20]
008ebfc8	ldp x22,x21,[sp, #0x10]
008ebfcc	ldp x24,x23,[sp], #0x40
008ebfd0	ret
008ebfd4	ldr x8,[x19]
008ebfd8	mov x0,x19
008ebfdc	ldr x8,[x8, #0x10]
008ebfe0	blr x8
008ebfe4	mov x0,x19
008ebfe8	ldp x29,x30,[sp, #0x30]
008ebfec	ldp x20,x19,[sp, #0x20]
008ebff0	ldp x22,x21,[sp, #0x10]
008ebff4	ldp x24,x23,[sp], #0x40
008ebff8	b 0x00c2ff00

; cpr::Session::GetFullRequestUrl @ 008f2a30
008f2a30	sub sp,sp,#0x70
008f2a34	stp x22,x21,[sp, #0x40]
008f2a38	stp x20,x19,[sp, #0x50]
008f2a3c	stp x29,x30,[sp, #0x60]
008f2a40	add x29,sp,#0x60
008f2a44	mrs x21,tpidr_el0
008f2a48	mov x19,x8
008f2a4c	ldr x8,[x21, #0x28]
008f2a50	mov x20,x0
008f2a54	add x22,sp,#0x20
008f2a58	stur x8,[x29, #-0x28]
008f2a5c	ldr x1,[x0, #0x18]
008f2a60	add x0,x0,#0x48
008f2a64	add x8,sp,#0x20
008f2a68	bl 0x00c30f50
008f2a6c	ldrb w8,[sp, #0x20]
008f2a70	ldr x9,[sp, #0x28]
008f2a74	adrp x10,0x2a3000
008f2a78	add x10,x10,#0x5cf
008f2a7c	lsr w11,w8,#0x1
008f2a80	tst w8,#0x1
008f2a84	csel x8,x11,x9,eq
008f2a88	adrp x9,0x2ab000
008f2a8c	add x9,x9,#0x32c
008f2a90	cmp x8,#0x0
008f2a94	add x0,x20,#0x30
008f2a98	csel x1,x9,x10,eq
008f2a9c	add x8,sp,#0x8
008f2aa0	bl 0x00c30fa0
008f2aa4	ldrb w8,[sp, #0x20]
008f2aa8	ldp x10,x9,[sp, #0x28]
008f2aac	orr x11,x22,#0x1
008f2ab0	tst w8,#0x1
008f2ab4	lsr w12,w8,#0x1
008f2ab8	csel x1,x11,x9,eq
008f2abc	csel x2,x12,x10,eq
008f2ac0	add x0,sp,#0x8
008f2ac4	bl 0x00c308c0
008f2ac8	ldr x8,[x0, #0x10]
008f2acc	str x8,[x19, #0x10]
008f2ad0	ldr q0,[x0]
008f2ad4	str q0,[x19]
008f2ad8	stp xzr,xzr,[x0, #0x8]
008f2adc	str xzr,[x0]
008f2ae0	ldrb w8,[sp, #0x8]
008f2ae4	tbz w8,#0x0,0x008f2af0
008f2ae8	ldr x0,[sp, #0x18]
008f2aec	bl 0x00c301d0
008f2af0	ldrb w8,[sp, #0x20]
008f2af4	tbz w8,#0x0,0x008f2b00
008f2af8	ldr x0,[sp, #0x30]
008f2afc	bl 0x00c301d0
008f2b00	ldr x8,[x21, #0x28]
008f2b04	ldur x9,[x29, #-0x28]
008f2b08	cmp x8,x9
008f2b0c	b.ne 0x008f2b24
008f2b10	ldp x29,x30,[sp, #0x60]
008f2b14	ldp x20,x19,[sp, #0x50]
008f2b18	ldp x22,x21,[sp, #0x40]
008f2b1c	add sp,sp,#0x70
008f2b20	ret
008f2b24	bl 0x00c2fec0

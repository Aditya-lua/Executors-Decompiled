; cpr::Cookie::GetValue @ 008e8224
008e8224	stp x22,x21,[sp, #-0x30]!
008e8228	stp x20,x19,[sp, #0x10]
008e822c	stp x29,x30,[sp, #0x20]
008e8230	add x29,sp,#0x20
008e8234	mov x19,x8
008e8238	stp xzr,xzr,[x8, #0x8]
008e823c	str xzr,[x8]
008e8240	mov x8,x0
008e8244	ldrb w9,[x8, #0x18]!
008e8248	tbnz w9,#0x0,0x008e8260
008e824c	ldr x9,[x8, #0x10]
008e8250	str x9,[x19, #0x10]
008e8254	ldr q0,[x8]
008e8258	str q0,[x19]
008e825c	b 0x008e82bc
008e8260	ldr x20,[x0, #0x20]
008e8264	cmn x20,#0x10
008e8268	b.cs 0x008e82cc
008e826c	ldr x21,[x0, #0x28]
008e8270	cmp x20,#0x17
008e8274	b.cs 0x008e8288
008e8278	lsl w8,w20,#0x1
008e827c	strb w8,[x19], #0x1
008e8280	cbnz x20,0x008e82a8
008e8284	b 0x008e82b8
008e8288	add x8,x20,#0x10
008e828c	and x22,x8,#-0x10
008e8290	mov x0,x22
008e8294	bl 0x00c2fed0
008e8298	orr x8,x22,#0x1
008e829c	stp x20,x0,[x19, #0x8]
008e82a0	str x8,[x19]
008e82a4	mov x19,x0
008e82a8	mov x0,x19
008e82ac	mov x1,x21
008e82b0	mov x2,x20
008e82b4	bl 0x00c2ffd0
008e82b8	strb wzr,[x19, x20]
008e82bc	ldp x29,x30,[sp, #0x20]
008e82c0	ldp x20,x19,[sp, #0x10]
008e82c4	ldp x22,x21,[sp], #0x30
008e82c8	ret
008e82cc	mov x0,x19
008e82d0	bl 0x00c30ce0

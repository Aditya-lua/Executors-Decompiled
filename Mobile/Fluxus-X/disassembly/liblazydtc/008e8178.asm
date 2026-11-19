; cpr::Cookie::GetName @ 008e8178
008e8178	stp x22,x21,[sp, #-0x30]!
008e817c	stp x20,x19,[sp, #0x10]
008e8180	stp x29,x30,[sp, #0x20]
008e8184	add x29,sp,#0x20
008e8188	stp xzr,xzr,[x8, #0x8]
008e818c	str xzr,[x8]
008e8190	mov x19,x8
008e8194	ldrb w8,[x0]
008e8198	tbnz w8,#0x0,0x008e81b0
008e819c	ldr x8,[x0, #0x10]
008e81a0	str x8,[x19, #0x10]
008e81a4	ldr q0,[x0]
008e81a8	str q0,[x19]
008e81ac	b 0x008e820c
008e81b0	ldr x20,[x0, #0x8]
008e81b4	cmn x20,#0x10
008e81b8	b.cs 0x008e821c
008e81bc	ldr x21,[x0, #0x10]
008e81c0	cmp x20,#0x17
008e81c4	b.cs 0x008e81d8
008e81c8	lsl w8,w20,#0x1
008e81cc	strb w8,[x19], #0x1
008e81d0	cbnz x20,0x008e81f8
008e81d4	b 0x008e8208
008e81d8	add x8,x20,#0x10
008e81dc	and x22,x8,#-0x10
008e81e0	mov x0,x22
008e81e4	bl 0x00c2fed0
008e81e8	orr x8,x22,#0x1
008e81ec	stp x20,x0,[x19, #0x8]
008e81f0	str x8,[x19]
008e81f4	mov x19,x0
008e81f8	mov x0,x19
008e81fc	mov x1,x21
008e8200	mov x2,x20
008e8204	bl 0x00c2ffd0
008e8208	strb wzr,[x19, x20]
008e820c	ldp x29,x30,[sp, #0x20]
008e8210	ldp x20,x19,[sp, #0x10]
008e8214	ldp x22,x21,[sp], #0x30
008e8218	ret
008e821c	mov x0,x19
008e8220	bl 0x00c30ce0

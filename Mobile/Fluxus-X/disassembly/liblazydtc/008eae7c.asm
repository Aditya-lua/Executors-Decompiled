; cpr::ProxyAuthentication::operator[] @ 008eae7c
008eae7c	sub sp,sp,#0x70
008eae80	str x21,[sp, #0x40]
008eae84	stp x20,x19,[sp, #0x50]
008eae88	stp x29,x30,[sp, #0x60]
008eae8c	add x29,sp,#0x60
008eae90	mrs x21,tpidr_el0
008eae94	ldr x8,[x21, #0x28]
008eae98	mov x2,x1
008eae9c	mov x19,x0
008eaea0	stur x8,[x29, #-0x28]
008eaea4	str x1,[sp, #0x10]
008eaea8	add x1,sp,#0x18
008eaeac	bl 0x00c31180
008eaeb0	ldr x8,[x0]
008eaeb4	mov x20,x0
008eaeb8	cbnz x8,0x008eaf14
008eaebc	adrp x1,0x745000
008eaec0	add x1,x1,#0x14e
008eaec4	add x8,sp,#0x20
008eaec8	add x2,sp,#0x10
008eaecc	add x3,sp,#0x8
008eaed0	mov x0,x19
008eaed4	bl 0x00c31190
008eaed8	ldp x8,x1,[sp, #0x18]
008eaedc	stp xzr,xzr,[x1]
008eaee0	str x8,[x1, #0x10]
008eaee4	str x1,[x20]
008eaee8	ldr x8,[x19]
008eaeec	ldr x8,[x8]
008eaef0	cbz x8,0x008eaefc
008eaef4	str x8,[x19]
008eaef8	ldr x1,[x20]
008eaefc	ldr x0,[x19, #0x8]
008eaf00	bl 0x00c30c90
008eaf04	ldr x8,[x19, #0x10]
008eaf08	add x8,x8,#0x1
008eaf0c	str x8,[x19, #0x10]
008eaf10	ldr x8,[sp, #0x20]
008eaf14	mov x9,x8
008eaf18	ldrb w10,[x9, #0x40]!
008eaf1c	tbnz w10,#0x0,0x008eaf28
008eaf20	add x0,x9,#0x1
008eaf24	b 0x008eaf2c
008eaf28	ldr x0,[x8, #0x50]
008eaf2c	ldr x8,[x21, #0x28]
008eaf30	ldur x9,[x29, #-0x28]
008eaf34	cmp x8,x9
008eaf38	b.ne 0x008eaf50
008eaf3c	ldp x29,x30,[sp, #0x60]
008eaf40	ldp x20,x19,[sp, #0x50]
008eaf44	ldr x21,[sp, #0x40]
008eaf48	add sp,sp,#0x70
008eaf4c	ret
008eaf50	bl 0x00c2fec0

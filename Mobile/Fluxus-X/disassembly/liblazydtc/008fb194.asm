; cpr::Proxies::Proxies @ 008fb194
008fb194	sub sp,sp,#0x70
008fb198	stp x24,x23,[sp, #0x30]
008fb19c	stp x22,x21,[sp, #0x40]
008fb1a0	stp x20,x19,[sp, #0x50]
008fb1a4	stp x29,x30,[sp, #0x60]
008fb1a8	add x29,sp,#0x60
008fb1ac	mrs x23,tpidr_el0
008fb1b0	ldr x8,[x23, #0x28]
008fb1b4	mov x21,x0
008fb1b8	mov x19,x0
008fb1bc	str x8,[sp, #0x28]
008fb1c0	ldp x20,x8,[x1]
008fb1c4	str xzr,[x21, #0x8]!
008fb1c8	str xzr,[x0, #0x10]
008fb1cc	str x21,[x0]
008fb1d0	cbz x8,0x008fb254
008fb1d4	add x8,x8,x8, LSL #0x1
008fb1d8	lsl x24,x8,#0x4
008fb1dc	add x2,sp,#0x8
008fb1e0	mov x3,sp
008fb1e4	mov x0,x19
008fb1e8	mov x1,x21
008fb1ec	mov x4,x20
008fb1f0	bl 0x00c31120
008fb1f4	ldr x8,[x0]
008fb1f8	mov x22,x0
008fb1fc	cbnz x8,0x008fb248
008fb200	add x8,sp,#0x10
008fb204	mov x0,x19
008fb208	mov x1,x20
008fb20c	bl 0x00c31140
008fb210	ldp x8,x1,[sp, #0x8]
008fb214	stp xzr,xzr,[x1]
008fb218	str x8,[x1, #0x10]
008fb21c	str x1,[x22]
008fb220	ldr x8,[x19]
008fb224	ldr x8,[x8]
008fb228	cbz x8,0x008fb234
008fb22c	str x8,[x19]
008fb230	ldr x1,[x22]
008fb234	ldr x0,[x19, #0x8]
008fb238	bl 0x00c30c90
008fb23c	ldr x8,[x19, #0x10]
008fb240	add x8,x8,#0x1
008fb244	str x8,[x19, #0x10]
008fb248	subs x24,x24,#0x30
008fb24c	add x20,x20,#0x30
008fb250	b.ne 0x008fb1dc
008fb254	ldr x8,[x23, #0x28]
008fb258	ldr x9,[sp, #0x28]
008fb25c	cmp x8,x9
008fb260	b.ne 0x008fb27c
008fb264	ldp x29,x30,[sp, #0x60]
008fb268	ldp x20,x19,[sp, #0x50]
008fb26c	ldp x22,x21,[sp, #0x40]
008fb270	ldp x24,x23,[sp, #0x30]
008fb274	add sp,sp,#0x70
008fb278	ret
008fb27c	bl 0x00c2fec0

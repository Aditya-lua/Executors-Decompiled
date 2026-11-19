; ssl3_write_pending @ 009cb108
009cb108	stp x28,x27,[sp, #-0x60]!
009cb10c	stp x26,x25,[sp, #0x10]
009cb110	stp x24,x23,[sp, #0x20]
009cb114	stp x22,x21,[sp, #0x30]
009cb118	stp x20,x19,[sp, #0x40]
009cb11c	stp x29,x30,[sp, #0x50]
009cb120	ldr x8,[x0, #0x1cd8]
009cb124	mov x19,x0
009cb128	add x29,sp,#0x50
009cb12c	cmp x8,x3
009cb130	b.hi 0x009cb168
009cb134	ldrb w8,[x19, #0x9f0]
009cb138	mov x20,x4
009cb13c	tbnz w8,#0x1,0x009cb14c
009cb140	ldr x8,[x19, #0x1cf0]
009cb144	cmp x8,x2
009cb148	b.ne 0x009cb168
009cb14c	ldr w8,[x19, #0x1ce0]
009cb150	cmp w8,w1
009cb154	b.ne 0x009cb168
009cb158	mov x23,xzr
009cb15c	mov x24,xzr
009cb160	mov w25,#0x2
009cb164	b 0x009cb1bc
009cb168	bl 0x00c342a0
009cb16c	adrp x0,0x2d3000
009cb170	adrp x2,0x2bb000
009cb174	add x0,x0,#0x7fb
009cb178	add x2,x2,#0x884
009cb17c	mov w1,#0x4a7
009cb180	bl 0x00c342b0
009cb184	mov w1,#0x50
009cb188	orr w2,wzr,#0x7f
009cb18c	mov x0,x19
009cb190	mov x3,xzr
009cb194	bl 0x00c34410
009cb198	mov w0,#0xffffffff
009cb19c	ldp x29,x30,[sp, #0x50]
009cb1a0	ldp x20,x19,[sp, #0x40]
009cb1a4	ldp x22,x21,[sp, #0x30]
009cb1a8	ldp x24,x23,[sp, #0x20]
009cb1ac	ldp x26,x25,[sp, #0x10]
009cb1b0	ldp x28,x27,[sp], #0x60
009cb1b4	ret
009cb1b8	mov x23,x26
009cb1bc	orr w8,wzr,#0x30
009cb1c0	madd x8,x23,x8,x19
009cb1c4	ldr x21,[x8, #0xcc8]
009cb1c8	add x22,x8,#0xcc8
009cb1cc	add x27,x8,#0xca8
009cb1d0	add x28,x8,#0xcc0
009cb1d4	add x26,x23,#0x1
009cb1d8	b 0x009cb1f0
009cb1dc	ldr x10,[x28]
009cb1e0	mov x24,x8
009cb1e4	add x9,x10,x9
009cb1e8	str x9,[x28]
009cb1ec	str x21,[x22]
009cb1f0	cbnz x21,0x009cb204
009cb1f4	ldr x8,[x19, #0xc70]
009cb1f8	sub x8,x8,#0x1
009cb1fc	cmp x23,x8
009cb200	b.cc 0x009cb1b8
009cb204	bl 0x00c30710
009cb208	str wzr,[x0]
009cb20c	ldr x0,[x19, #0x18]
009cb210	cbz x0,0x009cb27c
009cb214	str w25,[x19, #0x28]
009cb218	ldr x8,[x27]
009cb21c	ldr x9,[x28]
009cb220	mov w2,w21
009cb224	add x1,x8,x9
009cb228	bl 0x00c34240
009cb22c	sxtw x8,w0
009cb230	cmp w0,#0x0
009cb234	csel x9,x8,x24,ge
009cb238	tbnz w0,#0x1f,0x009cb2b0
009cb23c	ldr x10,[x22]
009cb240	subs x21,x10,x9
009cb244	b.ne 0x009cb26c
009cb248	str xzr,[x22]
009cb24c	ldr x10,[x28]
009cb250	mov x24,x8
009cb254	add x9,x10,x9
009cb258	str x9,[x28]
009cb25c	ldr x9,[x19, #0xc70]
009cb260	cmp x26,x9
009cb264	b.cc 0x009cb1f0
009cb268	b 0x009cb2c8
009cb26c	cmp w0,#0x0
009cb270	b.gt 0x009cb1dc
009cb274	mov w0,wzr
009cb278	b 0x009cb2b0
009cb27c	bl 0x00c342a0
009cb280	adrp x0,0x2d3000
009cb284	adrp x2,0x2bb000
009cb288	add x0,x0,#0x7fb
009cb28c	add x2,x2,#0x884
009cb290	mov w1,#0x4c7
009cb294	bl 0x00c342b0
009cb298	mov w1,#0x50
009cb29c	mov w2,#0x80
009cb2a0	mov x0,x19
009cb2a4	mov x3,xzr
009cb2a8	bl 0x00c34410
009cb2ac	mov w0,#0xffffffff
009cb2b0	ldr x8,[x19, #0x8]
009cb2b4	ldr x8,[x8, #0xc0]
009cb2b8	ldrb w8,[x8, #0x60]
009cb2bc	tbz w8,#0x3,0x009cb19c
009cb2c0	str xzr,[x22]
009cb2c4	b 0x009cb19c
009cb2c8	ldr x8,[x19, #0x1ce8]
009cb2cc	mov w0,#0x1
009cb2d0	str w0,[x19, #0x28]
009cb2d4	str x8,[x20]
009cb2d8	b 0x009cb19c

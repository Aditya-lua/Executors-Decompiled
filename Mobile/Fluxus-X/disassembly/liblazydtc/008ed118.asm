; cpr::Session::SetReadCallback @ 008ed118
008ed118	sub sp,sp,#0x80
008ed11c	stp x24,x23,[sp, #0x40]
008ed120	stp x22,x21,[sp, #0x50]
008ed124	stp x20,x19,[sp, #0x60]
008ed128	stp x29,x30,[sp, #0x70]
008ed12c	add x29,sp,#0x70
008ed130	mrs x23,tpidr_el0
008ed134	ldr x8,[x23, #0x28]
008ed138	mov x19,x0
008ed13c	mov x20,x1
008ed140	add x21,x19,#0xe0
008ed144	str x8,[sp, #0x38]
008ed148	ldr q0,[x1]
008ed14c	add x22,x19,#0xf0
008ed150	str q0,[x0, #0xe0]
008ed154	ldr x0,[x1, #0x30]
008ed158	cbz x0,0x008ed17c
008ed15c	add x8,x20,#0x10
008ed160	cmp x8,x0
008ed164	b.eq 0x008ed184
008ed168	ldr x8,[x0]
008ed16c	ldr x8,[x8, #0x10]
008ed170	blr x8
008ed174	str x0,[sp, #0x20]
008ed178	b 0x008ed19c
008ed17c	str xzr,[sp, #0x20]
008ed180	b 0x008ed19c
008ed184	mov x8,sp
008ed188	str x8,[sp, #0x20]
008ed18c	ldr x8,[x0]
008ed190	mov x1,sp
008ed194	ldr x8,[x8, #0x18]
008ed198	blr x8
008ed19c	mov x0,sp
008ed1a0	mov x1,x22
008ed1a4	mov x24,sp
008ed1a8	bl 0x00c31730
008ed1ac	ldr x0,[sp, #0x20]
008ed1b0	cmp x24,x0
008ed1b4	b.eq 0x008ed1c8
008ed1b8	cbz x0,0x008ed1d4
008ed1bc	ldr x8,[x0]
008ed1c0	ldr x8,[x8, #0x28]
008ed1c4	b 0x008ed1d0
008ed1c8	ldr x8,[x0]
008ed1cc	ldr x8,[x8, #0x20]
008ed1d0	blr x8
008ed1d4	ldr x8,[x19, #0x18]
008ed1d8	ldr x2,[x20, #0x8]
008ed1dc	mov w1,#0x75a3
008ed1e0	ldr x0,[x8]
008ed1e4	bl 0x00c317c0
008ed1e8	ldr x8,[x19, #0x18]
008ed1ec	ldr x2,[x20, #0x8]
008ed1f0	mov w1,#0x75a8
008ed1f4	ldr x0,[x8]
008ed1f8	bl 0x00c317c0
008ed1fc	ldr x8,[x19, #0x18]
008ed200	adrp x2,0xcb4000
008ed204	mov w1,#0x4e2c
008ed208	ldr x0,[x8]
008ed20c	ldr x2,[x2, #0xcd8]
008ed210	bl 0x00c317c0
008ed214	ldr x8,[x19, #0x18]
008ed218	mov w1,#0x2719
008ed21c	mov x2,x21
008ed220	ldr x0,[x8]
008ed224	bl 0x00c317c0
008ed228	ldr x8,[x20, #0x8]
008ed22c	cmn x8,#0x1
008ed230	cset w8,eq
008ed234	strb w8,[x19, #0x11]
008ed238	ldr x8,[x23, #0x28]
008ed23c	ldr x9,[sp, #0x38]
008ed240	cmp x8,x9
008ed244	b.ne 0x008ed260
008ed248	ldp x29,x30,[sp, #0x70]
008ed24c	ldp x20,x19,[sp, #0x60]
008ed250	ldp x22,x21,[sp, #0x50]
008ed254	ldp x24,x23,[sp, #0x40]
008ed258	add sp,sp,#0x80
008ed25c	ret
008ed260	bl 0x00c2fec0

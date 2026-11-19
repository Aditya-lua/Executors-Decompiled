; FUN_008cb070 @ 008cb070
008cb070	stp x29,x30,[sp, #-0x60]!
008cb074	str x27,[sp, #0x10]
008cb078	stp x26,x25,[sp, #0x20]
008cb07c	stp x24,x23,[sp, #0x30]
008cb080	stp x22,x21,[sp, #0x40]
008cb084	stp x20,x19,[sp, #0x50]
008cb088	mov x29,sp
008cb08c	ldr q0,[x2]
008cb090	ldr x23,[x0, #0x68]
008cb094	mov x19,x0
008cb098	ldr x22,[x0, #0x58]
008cb09c	mov x20,x1
008cb0a0	str q0,[x23]
008cb0a4	ldr q0,[x3]
008cb0a8	str q0,[x23, #0x10]
008cb0ac	ldr q0,[x4]
008cb0b0	str q0,[x23, #0x20]
008cb0b4	ldrb w8,[x0, #0x6]
008cb0b8	cmp w8,#0x1
008cb0bc	b.ne 0x008cb0f8
008cb0c0	ldr x8,[x19, #0x50]
008cb0c4	ldr x8,[x8, #0x8]
008cb0c8	ldr w9,[x8, #0xc]
008cb0cc	cmp w9,#0x7
008cb0d0	b.ne 0x008cb0f8
008cb0d4	ldr x8,[x8]
008cb0d8	ldrb w8,[x8, #0x6]
008cb0dc	cbnz w8,0x008cb0f8
008cb0e0	ldr w8,[x23, #0xc]
008cb0e4	cmp w8,#0x7
008cb0e8	b.ne 0x008cb0f8
008cb0ec	ldr x8,[x23]
008cb0f0	ldrb w8,[x8, #0x6]
008cb0f4	cbz w8,0x008cb16c
008cb0f8	ldr x8,[x19, #0x48]
008cb0fc	ldr x1,[x19, #0x68]
008cb100	sub x8,x8,x1
008cb104	cmp x8,#0x30
008cb108	b.gt 0x008cb11c
008cb10c	mov x0,x19
008cb110	mov w1,#0x3
008cb114	bl 0x008b41e4
008cb118	ldr x1,[x19, #0x68]
008cb11c	add x8,x1,#0x30
008cb120	mov x0,x19
008cb124	mov w2,#0x1
008cb128	str x8,[x19, #0x68]
008cb12c	bl 0x008b465c
008cb130	ldr x8,[x19, #0x58]
008cb134	ldr x9,[x19, #0x68]
008cb138	sub x10,x9,#0x10
008cb13c	sub x11,x20,x22
008cb140	str x10,[x19, #0x68]
008cb144	add x0,x8,x11
008cb148	ldur q0,[x9, #-0x10]
008cb14c	str q0,[x8,x11]
008cb150	ldp x20,x19,[sp, #0x50]
008cb154	ldr x27,[sp, #0x10]
008cb158	ldp x22,x21,[sp, #0x40]
008cb15c	ldp x24,x23,[sp, #0x30]
008cb160	ldp x26,x25,[sp, #0x20]
008cb164	ldp x29,x30,[sp], #0x60
008cb168	ret
008cb16c	ldr x8,[x19, #0x68]
008cb170	ldrh w9,[x19, #0x28]
008cb174	add x8,x8,#0x30
008cb178	add w9,w9,#0x1
008cb17c	str x8,[x19, #0x68]
008cb180	and w8,w9,#0xffff
008cb184	ldr x26,[x23]
008cb188	cmp w8,#0xc8
008cb18c	strh w9,[x19, #0x28]
008cb190	b.cc 0x008cb19c
008cb194	mov x0,x19
008cb198	bl 0x008b42d8
008cb19c	ldrb w8,[x26, #0x6]
008cb1a0	ldr x24,[x19, #0x58]
008cb1a4	cbz w8,0x008cb1b0
008cb1a8	mov x25,xzr
008cb1ac	b 0x008cb1e8
008cb1b0	adrp x8,0xd1f000
008cb1b4	add x8,x8,#0xdf0
008cb1b8	ldr x25,[x26, #0x18]
008cb1bc	ldrb w8,[x8]
008cb1c0	cmp w8,#0x1
008cb1c4	b.ne 0x008cb1e8
008cb1c8	ldr x8,[x25, #0xd0]
008cb1cc	cbz x8,0x008cb1e8
008cb1d0	str x8,[x26, #0x18]
008cb1d4	mov x25,x8
008cb1d8	ldr x8,[x8, #0xd0]
008cb1dc	cbnz x8,0x008cb1d0
008cb1e0	ldrb w8,[x25, #0x5]
008cb1e4	strb w8,[x26, #0x4]
008cb1e8	adrp x8,0xcb4000
008cb1ec	add x27,x23,#0x10
008cb1f0	ldr x8,[x8, #0xbd8]
008cb1f4	ldrb w8,[x8]
008cb1f8	cmp w8,#0x1
008cb1fc	b.ne 0x008cb20c
008cb200	ldr w8,[x25, #0x48]
008cb204	add w8,w8,#0x1
008cb208	str w8,[x25, #0x48]
008cb20c	ldr x8,[x19, #0x50]
008cb210	ldr x9,[x19, #0x18]
008cb214	cmp x8,x9
008cb218	b.eq 0x008cb228
008cb21c	add x21,x8,#0x30
008cb220	str x21,[x19, #0x50]
008cb224	b 0x008cb234
008cb228	mov x0,x19
008cb22c	bl 0x008b4200
008cb230	mov x21,x0
008cb234	ldr x8,[x19, #0x68]
008cb238	ldrb w9,[x26, #0x4]
008cb23c	movi v0.2S,#0x1
008cb240	ldr x10,[x25, #0x30]
008cb244	str x27,[x21, #0x10]
008cb248	add x8,x8,x9, LSL #0x4
008cb24c	stp x25,x23,[x21]
008cb250	str x10,[x21, #0x20]
008cb254	ldr x9,[x19, #0x48]
008cb258	ldr x10,[x19, #0x68]
008cb25c	str x8,[x21, #0x18]
008cb260	ldrb w8,[x26, #0x4]
008cb264	str d0,[x21, #0x28]
008cb268	sub x9,x9,x10
008cb26c	str x27,[x19, #0x70]
008cb270	cmp x9,w8, UXTW  #0x4
008cb274	b.gt 0x008cb29c
008cb278	ldr w9,[x19, #0x40]
008cb27c	mov x0,x19
008cb280	mov w2,#0x1
008cb284	lsl w10,w9,#0x1
008cb288	add w11,w9,w8
008cb28c	cmp w9,w8
008cb290	csel w1,w11,w10,lt
008cb294	bl 0x008b3fdc
008cb298	ldp x10,x27,[x19, #0x68]
008cb29c	ldrb w8,[x25, #0x7]
008cb2a0	add x8,x27,x8, LSL #0x4
008cb2a4	cmp x10,x8
008cb2a8	b.cs 0x008cb2d0
008cb2ac	add x9,x10,#0x10
008cb2b0	mvn x11,x10
008cb2b4	cmp x8,x9
008cb2b8	csel x9,x8,x9,hi
008cb2bc	add x9,x9,x11
008cb2c0	cmp x9,#0x10
008cb2c4	b.cs 0x008cb2d8
008cb2c8	mov x9,x10
008cb2cc	b 0x008cb308
008cb2d0	mov x9,x10
008cb2d4	b 0x008cb320
008cb2d8	lsr x9,x9,#0x4
008cb2dc	add x11,x9,#0x1
008cb2e0	and x12,x11,#0x1ffffffffffffffe
008cb2e4	add x9,x10,x12, LSL #0x4
008cb2e8	add x10,x10,#0x1c
008cb2ec	mov x13,x12
008cb2f0	subs x13,x13,#0x2
008cb2f4	stur wzr,[x10, #-0x10]
008cb2f8	str wzr,[x10], #0x20
008cb2fc	b.ne 0x008cb2f0
008cb300	cmp x11,x12
008cb304	b.eq 0x008cb320
008cb308	mov x10,x9
008cb30c	add x9,x10,#0x10
008cb310	str wzr,[x10, #0xc]
008cb314	cmp x9,x8
008cb318	mov x10,x9
008cb31c	b.cc 0x008cb30c
008cb320	ldrb w8,[x25, #0x3]
008cb324	cbnz w8,0x008cb32c
008cb328	ldr x9,[x21, #0x18]
008cb32c	ldr x8,[x25, #0x58]
008cb330	str x9,[x19, #0x68]
008cb334	cbz x8,0x008cb34c
008cb338	ldr x8,[x25, #0x50]
008cb33c	cbz x8,0x008cb34c
008cb340	ldr w8,[x21, #0x2c]
008cb344	orr w8,w8,#0x4
008cb348	str w8,[x21, #0x2c]
008cb34c	mov x0,x19
008cb350	sub x21,x23,x24
008cb354	bl 0x008be71c
008cb358	ldr x8,[x19, #0x58]
008cb35c	ldrh w9,[x19, #0x28]
008cb360	add x10,x8,x21
008cb364	sub w11,w9,#0x1
008cb368	add x9,x10,#0x10
008cb36c	strh w11,[x19, #0x28]
008cb370	b 0x008cb138

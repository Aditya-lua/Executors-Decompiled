; std::__ndk1::basic_filebuf<char,std::__ndk1::char_traits<char>>::basic_filebuf @ 00bd81b0
00bd81b0	paciasp
00bd81b4	stp x29,x30,[sp, #-0x20]!
00bd81b8	stp x20,x19,[sp, #0x10]
00bd81bc	mov x29,sp
00bd81c0	adrp x8,0xcb4000
00bd81c4	mov x20,x1
00bd81c8	add x1,x1,#0x8
00bd81cc	ldr x8,[x8, #0xa08]
00bd81d0	mov x19,x0
00bd81d4	add x8,x8,#0x10
00bd81d8	str x8,[x0], #0x8
00bd81dc	bl 0x00c30660
00bd81e0	mov x8,x20
00bd81e4	adrp x10,0xcb4000
00bd81e8	ldr q0,[x8, #0x10]!
00bd81ec	add x11,x8,#0x48
00bd81f0	str q0,[x19, #0x10]
00bd81f4	ldr q0,[x8, #0x10]
00bd81f8	str q0,[x19, #0x20]
00bd81fc	ldr q0,[x8, #0x20]
00bd8200	str q0,[x19, #0x30]
00bd8204	ldr x10,[x10, #0xf68]
00bd8208	ldr x9,[x8, #0x30]
00bd820c	add x10,x10,#0x10
00bd8210	cmp x9,x11
00bd8214	str x10,[x19]
00bd8218	b.eq 0x00bd8228
00bd821c	ldp x11,x13,[x20, #0x48]
00bd8220	str x9,[x19, #0x40]
00bd8224	b 0x00bd8248
00bd8228	add x9,x19,#0x58
00bd822c	ldr x12,[x20, #0x50]
00bd8230	str x9,[x19, #0x40]
00bd8234	ldp x11,x10,[x20, #0x40]
00bd8238	sub x10,x10,x11
00bd823c	sub x12,x12,x11
00bd8240	add x11,x9,x10
00bd8244	add x13,x9,x12
00bd8248	mov x10,x20
00bd824c	ldr x12,[x20, #0x68]
00bd8250	stp x11,x13,[x19, #0x48]
00bd8254	ldr x11,[x10, #0x60]!
00bd8258	ldr x13,[x20, #0x70]
00bd825c	stp x11,x12,[x19, #0x60]
00bd8260	mov x11,x20
00bd8264	ldur q0,[x20, #0x78]
00bd8268	str x13,[x19, #0x70]
00bd826c	stur q0,[x19, #0x78]
00bd8270	ldr x13,[x11, #0x88]!
00bd8274	str x13,[x19, #0x88]
00bd8278	ldr x13,[x11, #0x8]
00bd827c	str x13,[x19, #0x90]
00bd8280	ldr d0,[x11, #0x10]
00bd8284	ldrb w13,[x11, #0x18]
00bd8288	str d0,[x19, #0x98]
00bd828c	strb w13,[x19, #0xa0]
00bd8290	ldurh w13,[x11, #0x19]
00bd8294	sturh w13,[x19, #0xa1]
00bd8298	ldur x13,[x11, #-0x60]
00bd829c	cbz x13,0x00bd8300
00bd82a0	ldr x14,[x20, #0x68]
00bd82a4	cmp x13,x14
00bd82a8	csel x9,x12,x9,eq
00bd82ac	ldr x12,[x20, #0x38]
00bd82b0	str x9,[x19, #0x30]
00bd82b4	str x9,[x19, #0x28]
00bd82b8	sub x12,x12,x13
00bd82bc	ldp x15,x14,[x20, #0x28]
00bd82c0	add x12,x9,x12
00bd82c4	sub x13,x14,x15
00bd82c8	add x9,x9,x13
00bd82cc	stp x9,x12,[x19, #0x30]
00bd82d0	movi v0.2D,#0x0
00bd82d4	str xzr,[x8, #0x40]
00bd82d8	stp xzr,xzr,[x11, #0x8]
00bd82dc	str xzr,[x11]
00bd82e0	stp q0,q0,[x8]
00bd82e4	stp q0,q0,[x8, #0x20]
00bd82e8	stp q0,q0,[x10]
00bd82ec	strh wzr,[x11, #0x18]
00bd82f0	ldp x20,x19,[sp, #0x10]
00bd82f4	ldp x29,x30,[sp], #0x20
00bd82f8	autiasp
00bd82fc	ret
00bd8300	ldr x13,[x8]
00bd8304	cbz x13,0x00bd82d0
00bd8308	ldp x15,x16,[x20, #0x18]
00bd830c	ldr x14,[x20, #0x68]
00bd8310	cmp x13,x14
00bd8314	sub x14,x15,x13
00bd8318	sub x13,x16,x13
00bd831c	b.eq 0x00bd8334
00bd8320	add x12,x9,x14
00bd8324	stp x9,x12,[x19, #0x10]
00bd8328	add x9,x9,x13
00bd832c	str x9,[x19, #0x20]
00bd8330	b 0x00bd82d0
00bd8334	add x9,x12,x14
00bd8338	stp x12,x9,[x19, #0x10]
00bd833c	add x12,x12,x13
00bd8340	str x12,[x19, #0x20]
00bd8344	b 0x00bd82d0

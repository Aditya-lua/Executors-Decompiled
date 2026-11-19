; X509_STORE_CTX_get1_certs @ 00b0b1c8
00b0b1c8	sub sp,sp,#0x1e0
00b0b1cc	stp x28,x23,[sp, #0x1a0]
00b0b1d0	stp x22,x21,[sp, #0x1b0]
00b0b1d4	stp x20,x19,[sp, #0x1c0]
00b0b1d8	stp x29,x30,[sp, #0x1d0]
00b0b1dc	ldr x22,[x0]
00b0b1e0	add x29,sp,#0x1d0
00b0b1e4	cbz x22,0x00b0b394
00b0b1e8	mov x20,x0
00b0b1ec	ldr x0,[x22, #0x98]
00b0b1f0	mov x19,x1
00b0b1f4	bl 0x00c356a0
00b0b1f8	cbz w0,0x00b0b394
00b0b1fc	ldr x0,[x22, #0x8]
00b0b200	mov w8,#0x1
00b0b204	sub x23,x29,#0x40
00b0b208	stur w8,[x29, #-0x40]
00b0b20c	add x8,sp,#0x10
00b0b210	sub x1,x29,#0x40
00b0b214	add x2,sp,#0xc
00b0b218	str x8,[x23, #0x8]
00b0b21c	str x19,[sp, #0x58]
00b0b220	bl 0x00c40220
00b0b224	mov w21,w0
00b0b228	tbnz w0,#0x1f,0x00b0b280
00b0b22c	bl 0x00c34780
00b0b230	ldr w8,[sp, #0xc]
00b0b234	mov x19,x0
00b0b238	cmp w8,#0x1
00b0b23c	b.lt 0x00b0b274
00b0b240	mov w20,wzr
00b0b244	ldr x0,[x22, #0x8]
00b0b248	add w1,w21,w20
00b0b24c	bl 0x00c32610
00b0b250	ldr x1,[x0, #0x8]
00b0b254	mov w2,#0x1
00b0b258	mov x0,x19
00b0b25c	bl 0x00c40bc0
00b0b260	cbz w0,0x00b0b2e0
00b0b264	ldr w8,[sp, #0xc]
00b0b268	add w20,w20,#0x1
00b0b26c	cmp w20,w8
00b0b270	b.lt 0x00b0b244
00b0b274	ldr x0,[x22, #0x98]
00b0b278	bl 0x00c35690
00b0b27c	b 0x00b0b398
00b0b280	adrp x1,0x2aa000
00b0b284	add x1,x1,#0xba3
00b0b288	mov w0,#0x10
00b0b28c	orr w2,wzr,#0x1c0
00b0b290	bl 0x00c34250
00b0b294	cbz x0,0x00b0b2fc
00b0b298	str wzr,[x0]
00b0b29c	mov x21,x0
00b0b2a0	ldr x0,[x22, #0x98]
00b0b2a4	bl 0x00c35690
00b0b2a8	mov w1,#0x1
00b0b2ac	mov x0,x20
00b0b2b0	mov x2,x19
00b0b2b4	mov x3,x21
00b0b2b8	bl 0x00b0aa34
00b0b2bc	ldr w8,[x21]
00b0b2c0	mov w20,w0
00b0b2c4	cmp w8,#0x2
00b0b2c8	b.eq 0x00b0b338
00b0b2cc	cmp w8,#0x1
00b0b2d0	b.ne 0x00b0b340
00b0b2d4	ldr x0,[x21, #0x8]
00b0b2d8	bl 0x00c31a90
00b0b2dc	b 0x00b0b340
00b0b2e0	ldr x0,[x22, #0x98]
00b0b2e4	bl 0x00c35690
00b0b2e8	adrp x1,0xcb4000
00b0b2ec	ldr x1,[x1, #0xd88]
00b0b2f0	mov x0,x19
00b0b2f4	bl 0x00c32600
00b0b2f8	b 0x00b0b394
00b0b2fc	bl 0x00c342a0
00b0b300	adrp x0,0x2aa000
00b0b304	adrp x2,0x2b0000
00b0b308	add x0,x0,#0xba3
00b0b30c	add x2,x2,#0xa62
00b0b310	mov w1,#0x1c3
00b0b314	bl 0x00c342b0
00b0b318	mov w1,#0x100
00b0b31c	mov w0,#0xb
00b0b320	movk w1,#0xc, LSL #16
00b0b324	mov x2,xzr
00b0b328	bl 0x00c342c0
00b0b32c	ldr x0,[x22, #0x98]
00b0b330	bl 0x00c35690
00b0b334	b 0x00b0b394
00b0b338	ldr x0,[x21, #0x8]
00b0b33c	bl 0x00c382b0
00b0b340	adrp x1,0x2aa000
00b0b344	add x1,x1,#0xba3
00b0b348	mov w2,#0x1f3
00b0b34c	mov x0,x21
00b0b350	bl 0x00c32310
00b0b354	cbz w20,0x00b0b394
00b0b358	ldr x0,[x22, #0x98]
00b0b35c	bl 0x00c356a0
00b0b360	cbz w0,0x00b0b394
00b0b364	ldr x0,[x22, #0x8]
00b0b368	mov w8,#0x1
00b0b36c	stur w8,[x29, #-0x40]
00b0b370	add x8,sp,#0x10
00b0b374	sub x1,x29,#0x40
00b0b378	add x2,sp,#0xc
00b0b37c	str x8,[x23, #0x8]
00b0b380	str x19,[sp, #0x58]
00b0b384	bl 0x00c40220
00b0b388	mov w21,w0
00b0b38c	tbz w0,#0x1f,0x00b0b22c
00b0b390	b 0x00b0b32c
00b0b394	mov x19,xzr
00b0b398	mov x0,x19
00b0b39c	ldp x29,x30,[sp, #0x1d0]
00b0b3a0	ldp x20,x19,[sp, #0x1c0]
00b0b3a4	ldp x22,x21,[sp, #0x1b0]
00b0b3a8	ldp x28,x23,[sp, #0x1a0]
00b0b3ac	add sp,sp,#0x1e0
00b0b3b0	ret

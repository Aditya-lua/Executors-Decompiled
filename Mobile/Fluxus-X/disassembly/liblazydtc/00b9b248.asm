; mbedtls_ecdh_get_params @ 00b9b248
00b9b248	stp x24,x23,[sp, #-0x40]!
00b9b24c	stp x22,x21,[sp, #0x10]
00b9b250	stp x20,x19,[sp, #0x20]
00b9b254	stp x29,x30,[sp, #0x30]
00b9b258	add x29,sp,#0x30
00b9b25c	mov w21,w2
00b9b260	mov x19,x1
00b9b264	cmp w2,#0x1
00b9b268	mov x20,x0
00b9b26c	b.hi 0x00b9b318
00b9b270	ldr w8,[x20, #0x4]
00b9b274	ldr w22,[x19]
00b9b278	cbz w8,0x00b9b28c
00b9b27c	cmp w8,w22
00b9b280	b.ne 0x00b9b318
00b9b284	add x24,x20,#0x8
00b9b288	b 0x00b9b2e4
00b9b28c	add x23,x20,#0x10
00b9b290	mov w8,#0x1
00b9b294	mov x24,x20
00b9b298	mov x0,x23
00b9b29c	strb wzr,[x20]
00b9b2a0	str w8,[x24, #0x8]!
00b9b2a4	str w22,[x20, #0x4]
00b9b2a8	bl 0x00c426c0
00b9b2ac	add x0,x20,#0xd0
00b9b2b0	bl 0x00c41c00
00b9b2b4	add x0,x20,#0xe0
00b9b2b8	bl 0x00c42760
00b9b2bc	add x0,x20,#0x110
00b9b2c0	bl 0x00c42760
00b9b2c4	add x0,x20,#0x140
00b9b2c8	bl 0x00c41c00
00b9b2cc	mov x0,x23
00b9b2d0	mov w1,w22
00b9b2d4	bl 0x00c42800
00b9b2d8	cbz w0,0x00b9b2e4
00b9b2dc	mov w0,#0xffffb180
00b9b2e0	b 0x00b9b31c
00b9b2e4	ldr w8,[x24]
00b9b2e8	cmp w8,#0x1
00b9b2ec	b.ne 0x00b9b318
00b9b2f0	cbz w21,0x00b9b330
00b9b2f4	cmp w21,#0x1
00b9b2f8	b.ne 0x00b9b318
00b9b2fc	add x0,x20,#0x110
00b9b300	add x1,x19,#0xd0
00b9b304	ldp x29,x30,[sp, #0x30]
00b9b308	ldp x20,x19,[sp, #0x20]
00b9b30c	ldp x22,x21,[sp, #0x10]
00b9b310	ldp x24,x23,[sp], #0x40
00b9b314	b 0x00c42630
00b9b318	mov w0,#0xffffb080
00b9b31c	ldp x29,x30,[sp, #0x30]
00b9b320	ldp x20,x19,[sp, #0x20]
00b9b324	ldp x22,x21,[sp, #0x10]
00b9b328	ldp x24,x23,[sp], #0x40
00b9b32c	ret
00b9b330	add x0,x20,#0xe0
00b9b334	add x1,x19,#0xd0
00b9b338	bl 0x00c42630
00b9b33c	cbnz w0,0x00b9b31c
00b9b340	add x0,x20,#0xd0
00b9b344	add x1,x19,#0xc0
00b9b348	ldp x29,x30,[sp, #0x30]
00b9b34c	ldp x20,x19,[sp, #0x20]
00b9b350	ldp x22,x21,[sp, #0x10]
00b9b354	ldp x24,x23,[sp], #0x40
00b9b358	b 0x00c41b60

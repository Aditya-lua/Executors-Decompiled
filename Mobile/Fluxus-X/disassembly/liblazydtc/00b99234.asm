; mbedtls_psa_cipher_decrypt @ 00b99234
00b99234	sub sp,sp,#0xe0
00b99238	stp x26,x25,[sp, #0x90]
00b9923c	stp x24,x23,[sp, #0xa0]
00b99240	stp x22,x21,[sp, #0xb0]
00b99244	stp x20,x19,[sp, #0xc0]
00b99248	stp x29,x30,[sp, #0xd0]
00b9924c	add x29,sp,#0xd0
00b99250	mrs x26,tpidr_el0
00b99254	ldr x8,[x26, #0x28]
00b99258	mov x24,x1
00b9925c	mov x25,x0
00b99260	add x0,sp,#0x10
00b99264	mov w2,#0x68
00b99268	mov w1,wzr
00b9926c	mov x19,x7
00b99270	mov x20,x6
00b99274	mov x22,x5
00b99278	mov x23,x4
00b9927c	mov w21,w3
00b99280	stur x8,[x29, #-0x48]
00b99284	bl 0x00c301c0
00b99288	add x0,sp,#0x10
00b9928c	mov x1,x25
00b99290	mov x2,x24
00b99294	mov w3,w21
00b99298	mov w4,wzr
00b9929c	bl 0x00b98a78
00b992a0	mov w21,w0
00b992a4	cbz w0,0x00b99308
00b992a8	ldr w8,[sp, #0x10]
00b992ac	mov w9,#0x4000000
00b992b0	and w8,w8,#0x7f000000
00b992b4	cmp w8,w9
00b992b8	b.ne 0x00b992d0
00b992bc	add x8,sp,#0x10
00b992c0	add x0,x8,#0x8
00b992c4	bl 0x00c30290
00b992c8	mov w8,wzr
00b992cc	b 0x00b992d4
00b992d0	mov w8,#0xffffff77
00b992d4	ldr x9,[x26, #0x28]
00b992d8	ldur x10,[x29, #-0x48]
00b992dc	cmp w21,#0x0
00b992e0	csel w0,w8,w21,eq
00b992e4	cmp x9,x10
00b992e8	b.ne 0x00b9940c
00b992ec	ldp x29,x30,[sp, #0xd0]
00b992f0	ldp x20,x19,[sp, #0xc0]
00b992f4	ldp x22,x21,[sp, #0xb0]
00b992f8	ldp x24,x23,[sp, #0xa0]
00b992fc	ldp x26,x25,[sp, #0x90]
00b99300	add sp,sp,#0xe0
00b99304	ret
00b99308	ldrb w2,[sp, #0x14]
00b9930c	cbz x2,0x00b99334
00b99310	add x8,sp,#0x10
00b99314	add x0,x8,#0x8
00b99318	mov x1,x23
00b9931c	bl 0x00c42170
00b99320	bl 0x00c42bf0
00b99324	mov w21,w0
00b99328	cbnz w0,0x00b992a8
00b9932c	ldrb w8,[sp, #0x14]
00b99330	b 0x00b99338
00b99334	mov x8,xzr
00b99338	add x9,x23,x8
00b9933c	cmp x23,#0x0
00b99340	csel x1,xzr,x9,eq
00b99344	sub x2,x22,x8
00b99348	add x0,sp,#0x10
00b9934c	add x5,sp,#0x8
00b99350	mov x3,x20
00b99354	mov x4,x19
00b99358	add x23,sp,#0x10
00b9935c	bl 0x00c42ee0
00b99360	mov w21,w0
00b99364	cbnz w0,0x00b992a8
00b99368	ldr x22,[sp, #0x8]
00b9936c	ldr x8,[sp, #0x48]
00b99370	cmp x20,#0x0
00b99374	add x9,x20,x22
00b99378	csel x20,xzr,x9,eq
00b9937c	cbz x8,0x00b993a0
00b99380	ldr w8,[sp, #0x10]
00b99384	mov w9,#0x4400
00b99388	movk w9,#0x440, LSL #16
00b9938c	orr w8,w8,#0x400
00b99390	cmp w8,w9
00b99394	b.ne 0x00b993a0
00b99398	mov w21,#0xffffff79
00b9939c	b 0x00b993e8
00b993a0	add x0,x23,#0x8
00b993a4	sub x1,x29,#0x58
00b993a8	add x2,sp,#0x8
00b993ac	bl 0x00c42150
00b993b0	bl 0x00c42bf0
00b993b4	mov w21,w0
00b993b8	cbnz w0,0x00b993e8
00b993bc	ldr x2,[sp, #0x8]
00b993c0	cbz x2,0x00b993e4
00b993c4	sub x8,x19,x22
00b993c8	cmp x2,x8
00b993cc	b.ls 0x00b993d8
00b993d0	mov w21,#0xffffff76
00b993d4	b 0x00b993e8
00b993d8	sub x1,x29,#0x58
00b993dc	mov x0,x20
00b993e0	bl 0x00c2ffd0
00b993e4	mov w21,wzr
00b993e8	sub x0,x29,#0x58
00b993ec	mov w1,#0x10
00b993f0	bl 0x00c42220
00b993f4	cbnz w21,0x00b992a8
00b993f8	ldr x8,[sp, #0x8]
00b993fc	ldr x9,[x29, #0x10]
00b99400	add x8,x8,x22
00b99404	str x8,[x9]
00b99408	b 0x00b992a8
00b9940c	bl 0x00c2fec0

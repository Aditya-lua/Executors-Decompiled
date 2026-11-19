; mbedtls_hmac_drbg_update @ 00b9c200
00b9c200	sub sp,sp,#0xb0
00b9c204	str x27,[sp, #0x50]
00b9c208	stp x26,x25,[sp, #0x60]
00b9c20c	stp x24,x23,[sp, #0x70]
00b9c210	stp x22,x21,[sp, #0x80]
00b9c214	stp x20,x19,[sp, #0x90]
00b9c218	stp x29,x30,[sp, #0xa0]
00b9c21c	add x29,sp,#0xa0
00b9c220	mrs x25,tpidr_el0
00b9c224	ldr x8,[x25, #0x28]
00b9c228	mov x21,x0
00b9c22c	mov x20,x0
00b9c230	mov x19,x2
00b9c234	str x8,[sp, #0x48]
00b9c238	ldr x0,[x21], #0x18
00b9c23c	mov x22,x1
00b9c240	bl 0x00c302d0
00b9c244	cmp x22,#0x0
00b9c248	cset w8,ne
00b9c24c	cmp x19,#0x0
00b9c250	cset w9,ne
00b9c254	and w26,w8,w9
00b9c258	tst w8,w9
00b9c25c	mov w8,#0x1
00b9c260	and x23,x0,#0xff
00b9c264	cinc w27,w8,ne
00b9c268	strb wzr,[sp, #0x4]
00b9c26c	mov x0,x20
00b9c270	bl 0x00c42960
00b9c274	mov w24,w0
00b9c278	cbnz w0,0x00b9c338
00b9c27c	mov x0,x20
00b9c280	mov x1,x21
00b9c284	mov x2,x23
00b9c288	bl 0x00c42980
00b9c28c	mov w24,w0
00b9c290	cbnz w0,0x00b9c338
00b9c294	add x1,sp,#0x4
00b9c298	mov w2,#0x1
00b9c29c	mov x0,x20
00b9c2a0	bl 0x00c42980
00b9c2a4	mov w24,w0
00b9c2a8	cbnz w0,0x00b9c338
00b9c2ac	cbz w26,0x00b9c2c8
00b9c2b0	mov x0,x20
00b9c2b4	mov x1,x22
00b9c2b8	mov x2,x19
00b9c2bc	bl 0x00c42980
00b9c2c0	mov w24,w0
00b9c2c4	cbnz w0,0x00b9c338
00b9c2c8	add x1,sp,#0x8
00b9c2cc	mov x0,x20
00b9c2d0	bl 0x00c42950
00b9c2d4	mov w24,w0
00b9c2d8	cbnz w0,0x00b9c338
00b9c2dc	add x1,sp,#0x8
00b9c2e0	mov x0,x20
00b9c2e4	mov x2,x23
00b9c2e8	bl 0x00c42970
00b9c2ec	mov w24,w0
00b9c2f0	cbnz w0,0x00b9c338
00b9c2f4	mov x0,x20
00b9c2f8	mov x1,x21
00b9c2fc	mov x2,x23
00b9c300	bl 0x00c42980
00b9c304	mov w24,w0
00b9c308	cbnz w0,0x00b9c338
00b9c30c	mov x0,x20
00b9c310	mov x1,x21
00b9c314	bl 0x00c42950
00b9c318	mov w24,w0
00b9c31c	cbnz w0,0x00b9c338
00b9c320	ldrb w8,[sp, #0x4]
00b9c324	add w8,w8,#0x1
00b9c328	cmp w27,w8, UXTB 
00b9c32c	strb w8,[sp, #0x4]
00b9c330	b.hi 0x00b9c26c
00b9c334	mov w24,wzr
00b9c338	add x0,sp,#0x8
00b9c33c	mov w1,#0x40
00b9c340	bl 0x00c42220
00b9c344	ldr x8,[x25, #0x28]
00b9c348	ldr x9,[sp, #0x48]
00b9c34c	cmp x8,x9
00b9c350	b.ne 0x00b9c378
00b9c354	mov w0,w24
00b9c358	ldp x29,x30,[sp, #0xa0]
00b9c35c	ldp x20,x19,[sp, #0x90]
00b9c360	ldp x22,x21,[sp, #0x80]
00b9c364	ldp x24,x23,[sp, #0x70]
00b9c368	ldp x26,x25,[sp, #0x60]
00b9c36c	ldr x27,[sp, #0x50]
00b9c370	add sp,sp,#0xb0
00b9c374	ret
00b9c378	bl 0x00c2fec0

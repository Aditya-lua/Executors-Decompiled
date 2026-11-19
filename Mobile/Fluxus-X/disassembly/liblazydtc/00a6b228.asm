; ossl_pkcs5_pbkdf2_hmac_ex @ 00a6b228
00a6b228	sub sp,sp,#0x1a0
00a6b22c	stp x29,x30,[sp, #0x190]
00a6b230	add x29,sp,#0x190
00a6b234	stp x28,x27,[sp, #0x140]
00a6b238	stp x22,x21,[sp, #0x170]
00a6b23c	ldp x27,x22,[x29, #0x10]
00a6b240	stp x24,x23,[sp, #0x160]
00a6b244	mov x24,x0
00a6b248	mov w8,#0x1
00a6b24c	mov x0,x5
00a6b250	stp x26,x25,[sp, #0x150]
00a6b254	stp x20,x19,[sp, #0x180]
00a6b258	mov x19,x7
00a6b25c	mov w20,w6
00a6b260	mov w23,w3
00a6b264	mov x25,x2
00a6b268	mov w26,w1
00a6b26c	stp w8,w4,[x29, #-0x68]
00a6b270	bl 0x00c36230
00a6b274	adrp x28,0x2ab000
00a6b278	mov x21,x0
00a6b27c	add x28,x28,#0x32c
00a6b280	cbz x24,0x00a6b29c
00a6b284	cmn w26,#0x1
00a6b288	b.ne 0x00a6b2a4
00a6b28c	mov x0,x24
00a6b290	bl 0x00c2ff50
00a6b294	mov x26,x0
00a6b298	b 0x00a6b2a4
00a6b29c	mov w26,wzr
00a6b2a0	mov x24,x28
00a6b2a4	cmp w23,#0x0
00a6b2a8	adrp x1,0x2bf000
00a6b2ac	ccmp x25,#0x0,#0x0,eq
00a6b2b0	add x1,x1,#0xd31
00a6b2b4	mov x0,x27
00a6b2b8	mov x2,x22
00a6b2bc	csel x25,x28,x25,eq
00a6b2c0	bl 0x00c36210
00a6b2c4	cbz x0,0x00a6b40c
00a6b2c8	mov x27,x0
00a6b2cc	bl 0x00c361f0
00a6b2d0	mov x22,x0
00a6b2d4	mov x0,x27
00a6b2d8	bl 0x00c36220
00a6b2dc	cbz x22,0x00a6b40c
00a6b2e0	adrp x0,0x2c3000
00a6b2e4	sxtw x2,w26
00a6b2e8	add x0,x0,#0xa6a
00a6b2ec	add x8,sp,#0x8
00a6b2f0	mov x1,x24
00a6b2f4	add x27,sp,#0x30
00a6b2f8	bl 0x00c34c50
00a6b2fc	ldr x8,[sp, #0x28]
00a6b300	ldur q0,[sp, #0x18]
00a6b304	ldur q1,[sp, #0x8]
00a6b308	adrp x0,0x2c5000
00a6b30c	str x8,[sp, #0x50]
00a6b310	add x0,x0,#0xb06
00a6b314	add x8,sp,#0x8
00a6b318	sub x1,x29,#0x68
00a6b31c	stp q1,q0,[sp, #0x30]
00a6b320	bl 0x00c36260
00a6b324	ldr x8,[sp, #0x28]
00a6b328	ldur q0,[sp, #0x18]
00a6b32c	ldur q1,[sp, #0x8]
00a6b330	adrp x0,0x2a7000
00a6b334	str x8,[sp, #0x78]
00a6b338	sxtw x2,w23
00a6b33c	add x0,x0,#0xb6c
00a6b340	add x8,sp,#0x8
00a6b344	mov x1,x25
00a6b348	stur q0,[sp, #0x68]
00a6b34c	stur q1,[sp, #0x58]
00a6b350	bl 0x00c34c50
00a6b354	ldr x8,[sp, #0x28]
00a6b358	ldur q0,[sp, #0x18]
00a6b35c	ldur q1,[sp, #0x8]
00a6b360	adrp x0,0x2ac000
00a6b364	str x8,[sp, #0xa0]
00a6b368	add x0,x0,#0x172
00a6b36c	add x8,sp,#0x8
00a6b370	sub x1,x29,#0x64
00a6b374	str q0,[x27, #0x60]
00a6b378	str q1,[sp, #0x80]
00a6b37c	bl 0x00c36260
00a6b380	ldr x8,[sp, #0x28]
00a6b384	ldur q0,[sp, #0x18]
00a6b388	ldur q1,[sp, #0x8]
00a6b38c	adrp x0,0x29d000
00a6b390	str x8,[sp, #0xc8]
00a6b394	add x0,x0,#0xe2e
00a6b398	add x8,sp,#0x8
00a6b39c	mov x1,x21
00a6b3a0	mov x2,xzr
00a6b3a4	stur q0,[x27, #0x88]
00a6b3a8	stur q1,[x27, #0x78]
00a6b3ac	bl 0x00c36280
00a6b3b0	ldr x8,[sp, #0x28]
00a6b3b4	ldur q0,[sp, #0x8]
00a6b3b8	ldur q1,[sp, #0x18]
00a6b3bc	str x8,[sp, #0xf0]
00a6b3c0	add x8,sp,#0x8
00a6b3c4	stp q0,q1,[x27, #0xa0]
00a6b3c8	bl 0x00c34c40
00a6b3cc	ldr x8,[sp, #0x28]
00a6b3d0	ldur q0,[sp, #0x18]
00a6b3d4	ldur q1,[sp, #0x8]
00a6b3d8	sxtw x2,w20
00a6b3dc	add x3,sp,#0x30
00a6b3e0	mov x0,x22
00a6b3e4	mov x1,x19
00a6b3e8	str x8,[sp, #0x118]
00a6b3ec	stur q0,[x27, #0xd8]
00a6b3f0	stur q1,[x27, #0xc8]
00a6b3f4	bl 0x00c36200
00a6b3f8	cmp w0,#0x1
00a6b3fc	mov x0,x22
00a6b400	cset w19,eq
00a6b404	bl 0x00c361e0
00a6b408	b 0x00a6b410
00a6b40c	mov w19,wzr
00a6b410	mov w0,w19
00a6b414	ldp x29,x30,[sp, #0x190]
00a6b418	ldp x20,x19,[sp, #0x180]
00a6b41c	ldp x22,x21,[sp, #0x170]
00a6b420	ldp x24,x23,[sp, #0x160]
00a6b424	ldp x26,x25,[sp, #0x150]
00a6b428	ldp x28,x27,[sp, #0x140]
00a6b42c	add sp,sp,#0x1a0
00a6b430	ret

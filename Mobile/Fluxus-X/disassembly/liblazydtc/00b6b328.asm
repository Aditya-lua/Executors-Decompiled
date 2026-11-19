; mbedtls_ccm_update_ad @ 00b6b328
00b6b328	sub sp,sp,#0x70
00b6b32c	str x27,[sp, #0x10]
00b6b330	stp x26,x25,[sp, #0x20]
00b6b334	stp x24,x23,[sp, #0x30]
00b6b338	stp x22,x21,[sp, #0x40]
00b6b33c	stp x20,x19,[sp, #0x50]
00b6b340	stp x29,x30,[sp, #0x60]
00b6b344	add x29,sp,#0x60
00b6b348	mrs x23,tpidr_el0
00b6b34c	ldr x8,[x23, #0x28]
00b6b350	mov x20,x2
00b6b354	mov x19,x0
00b6b358	mov x21,x1
00b6b35c	str x8,[sp, #0x8]
00b6b360	ldr w8,[x0, #0xa8]
00b6b364	tbnz w8,#0x4,0x00b6b3cc
00b6b368	cbz x20,0x00b6b3ac
00b6b36c	tbnz w8,#0x3,0x00b6b3cc
00b6b370	tbnz w8,#0x2,0x00b6b3b4
00b6b374	ldr x9,[x19, #0x28]
00b6b378	cmp x9,x20
00b6b37c	b.cc 0x00b6b3cc
00b6b380	ldrb w10,[x19]
00b6b384	ldrb w11,[x19, #0x1]
00b6b388	orr w8,w8,#0x4
00b6b38c	str w8,[x19, #0xa8]
00b6b390	eor w10,w10,w9, LSR #0x8
00b6b394	eor w9,w11,w9
00b6b398	strb w10,[x19]
00b6b39c	strb w9,[x19, #0x1]
00b6b3a0	mov x24,x19
00b6b3a4	ldr x8,[x24, #0x38]!
00b6b3a8	b 0x00b6b400
00b6b3ac	mov w0,wzr
00b6b3b0	b 0x00b6b3d0
00b6b3b4	mov x24,x19
00b6b3b8	ldr x8,[x24, #0x38]!
00b6b3bc	ldur x9,[x24, #-0x10]
00b6b3c0	add x10,x8,x20
00b6b3c4	cmp x10,x9
00b6b3c8	b.ls 0x00b6b400
00b6b3cc	orr w0,wzr,#0xfffffff3
00b6b3d0	ldr x8,[x23, #0x28]
00b6b3d4	ldr x9,[sp, #0x8]
00b6b3d8	cmp x8,x9
00b6b3dc	b.ne 0x00b6b5a4
00b6b3e0	ldp x29,x30,[sp, #0x60]
00b6b3e4	ldp x20,x19,[sp, #0x50]
00b6b3e8	ldp x22,x21,[sp, #0x40]
00b6b3ec	ldp x24,x23,[sp, #0x30]
00b6b3f0	ldp x26,x25,[sp, #0x20]
00b6b3f4	ldr x27,[sp, #0x10]
00b6b3f8	add sp,sp,#0x70
00b6b3fc	ret
00b6b400	add x22,x19,#0x48
00b6b404	sub x25,x19,#0x1
00b6b408	mov w26,#0x10
00b6b40c	b 0x00b6b454
00b6b410	and x15,x13,#-0x20
00b6b414	mov x16,xzr
00b6b418	orr x14,x9,x15
00b6b41c	orr x17,x9,x16
00b6b420	add x18,x12,x17
00b6b424	add x17,x21,x17
00b6b428	ldp q0,q1,[x18]
00b6b42c	ldp q2,q3,[x17]
00b6b430	add x16,x16,#0x20
00b6b434	cmp x15,x16
00b6b438	eor v0.16B,v2.16B,v0.16B
00b6b43c	eor v1.16B,v3.16B,v1.16B
00b6b440	stp q0,q1,[x18]
00b6b444	b.ne 0x00b6b41c
00b6b448	cmp x13,x15
00b6b44c	b.eq 0x00b6b51c
00b6b450	b 0x00b6b4e8
00b6b454	add w8,w8,#0x2
00b6b458	and x8,x8,#0xf
00b6b45c	sub x10,x26,x8
00b6b460	cmp x10,x20
00b6b464	csel x27,x20,x10,hi
00b6b468	mov x9,xzr
00b6b46c	cmp x27,#0x10
00b6b470	add x12,x19,x8
00b6b474	b.cc 0x00b6b48c
00b6b478	ldr q0,[x12]
00b6b47c	ldr q1,[x21]
00b6b480	mov w9,#0x10
00b6b484	eor v0.16B,v1.16B,v0.16B
00b6b488	str q0,[x12]
00b6b48c	cmp x9,x27
00b6b490	b.cs 0x00b6b51c
00b6b494	mvn x10,x20
00b6b498	sub x11,x8,#0x11
00b6b49c	cmp x11,x10
00b6b4a0	mvn x13,x9
00b6b4a4	csinv x14,x11,x20,cs
00b6b4a8	sub x13,x13,x14
00b6b4ac	cmp x13,#0x20
00b6b4b0	b.cc 0x00b6b4e4
00b6b4b4	orr x14,x9,x8
00b6b4b8	cmp x11,x10
00b6b4bc	add x15,x19,x14
00b6b4c0	add x16,x21,x27
00b6b4c4	csinv x14,x11,x20,cs
00b6b4c8	cmp x15,x16
00b6b4cc	b.cs 0x00b6b410
00b6b4d0	sub x14,x8,x14
00b6b4d4	add x14,x25,x14
00b6b4d8	add x15,x21,x9
00b6b4dc	cmp x15,x14
00b6b4e0	b.cs 0x00b6b410
00b6b4e4	mov x14,x9
00b6b4e8	cmp x10,x11
00b6b4ec	csel x10,x10,x11,hi
00b6b4f0	add x12,x14,x8
00b6b4f4	mvn x10,x10
00b6b4f8	add x9,x21,x14
00b6b4fc	sub x10,x10,x14
00b6b500	add x11,x19,x12
00b6b504	ldrb w12,[x11]
00b6b508	ldrb w13,[x9], #0x1
00b6b50c	subs x10,x10,#0x1
00b6b510	eor w12,w13,w12
00b6b514	strb w12,[x11], #0x1
00b6b518	b.ne 0x00b6b504
00b6b51c	ldr x9,[x24]
00b6b520	add x10,x27,x8
00b6b524	cmp x10,#0x10
00b6b528	add x8,x9,x27
00b6b52c	str x8,[x24]
00b6b530	b.eq 0x00b6b540
00b6b534	ldr x9,[x19, #0x28]
00b6b538	cmp x8,x9
00b6b53c	b.ne 0x00b6b560
00b6b540	mov w2,#0x10
00b6b544	mov x4,sp
00b6b548	mov x0,x22
00b6b54c	mov x1,x19
00b6b550	mov x3,x19
00b6b554	bl 0x00c42180
00b6b558	cbnz w0,0x00b6b594
00b6b55c	ldr x8,[x24]
00b6b560	sub x20,x20,x27
00b6b564	add x21,x21,x27
00b6b568	cbnz x20,0x00b6b454
00b6b56c	ldr x9,[x19, #0x28]
00b6b570	mov w0,wzr
00b6b574	cmp x8,x9
00b6b578	b.ne 0x00b6b3d0
00b6b57c	ldr w8,[x19, #0xa8]
00b6b580	mov w0,wzr
00b6b584	str xzr,[x19, #0x38]
00b6b588	orr w8,w8,#0x8
00b6b58c	str w8,[x19, #0xa8]
00b6b590	b 0x00b6b3d0
00b6b594	ldr w8,[x19, #0xa8]
00b6b598	orr w8,w8,#0x10
00b6b59c	str w8,[x19, #0xa8]
00b6b5a0	b 0x00b6b3d0
00b6b5a4	bl 0x00c2fec0

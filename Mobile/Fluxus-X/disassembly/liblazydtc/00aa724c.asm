; CRYPTO_cbc128_encrypt @ 00aa724c
00aa724c	sub sp,sp,#0x70
00aa7250	stp x28,x27,[sp, #0x10]
00aa7254	stp x26,x25,[sp, #0x20]
00aa7258	stp x24,x23,[sp, #0x30]
00aa725c	stp x22,x21,[sp, #0x40]
00aa7260	stp x20,x19,[sp, #0x50]
00aa7264	stp x29,x30,[sp, #0x60]
00aa7268	add x29,sp,#0x60
00aa726c	cbz x2,0x00aa74e4
00aa7270	mov x20,x5
00aa7274	mov x21,x3
00aa7278	mov x19,x2
00aa727c	mov x25,x1
00aa7280	subs x23,x2,#0x10
00aa7284	str x4,[sp, #0x8]
00aa7288	b.cc 0x00aa7308
00aa728c	and x27,x23,#-0x10
00aa7290	add x22,x27,#0x10
00aa7294	add x26,x25,x22
00aa7298	mov x8,x4
00aa729c	mov x28,x0
00aa72a0	mov x24,x25
00aa72a4	str x0,[sp]
00aa72a8	ldr x9,[x28]
00aa72ac	ldr x10,[x8]
00aa72b0	mov x0,x24
00aa72b4	mov x1,x24
00aa72b8	mov x2,x21
00aa72bc	eor x9,x10,x9
00aa72c0	str x9,[x24]
00aa72c4	ldr x9,[x28, #0x8]
00aa72c8	ldr x8,[x8, #0x8]
00aa72cc	eor x8,x8,x9
00aa72d0	str x8,[x24, #0x8]
00aa72d4	blr x20
00aa72d8	sub x19,x19,#0x10
00aa72dc	mov x8,x24
00aa72e0	add x24,x24,#0x10
00aa72e4	cmp x19,#0xf
00aa72e8	add x28,x28,#0x10
00aa72ec	b.hi 0x00aa72a8
00aa72f0	subs x19,x23,x27
00aa72f4	add x24,x25,x27
00aa72f8	b.eq 0x00aa74d0
00aa72fc	ldr x0,[sp]
00aa7300	add x0,x0,x22
00aa7304	b 0x00aa7310
00aa7308	mov x24,x4
00aa730c	mov x26,x25
00aa7310	mov x25,xzr
00aa7314	add x27,x26,#0x11
00aa7318	mov x8,x24
00aa731c	mov x28,x0
00aa7320	mov x23,x0
00aa7324	mov x24,x26
00aa7328	mov x22,x19
00aa732c	b 0x00aa7348
00aa7330	sub x22,x22,#0x10
00aa7334	add x23,x23,#0x10
00aa7338	mov x8,x24
00aa733c	add x24,x24,#0x10
00aa7340	add x25,x25,#0x1
00aa7344	add x27,x27,#0x10
00aa7348	lsl x9,x25,#0x4
00aa734c	sub x10,x19,x9
00aa7350	cmp x10,#0x1
00aa7354	csinc x10,x10,xzr,hi
00aa7358	neg x11,x10
00aa735c	cmn x11,#0x10
00aa7360	orr x11,xzr,#-0x10
00aa7364	csneg x12,x11,x10,ls
00aa7368	neg x11,x12
00aa736c	cmp x11,#0x1f
00aa7370	add x10,x26,x9
00aa7374	b.ls 0x00aa73e8
00aa7378	add x9,x28,x9
00aa737c	add x13,x8,x11
00aa7380	add x11,x9,x11
00aa7384	sub x12,x10,x12
00aa7388	cmp x10,x11
00aa738c	cset w11,cc
00aa7390	cmp x9,x12
00aa7394	cset w9,cc
00aa7398	cmp x10,x13
00aa739c	and w13,w11,w9
00aa73a0	cset w9,cc
00aa73a4	cmp x8,x12
00aa73a8	cset w11,cc
00aa73ac	tbnz w13,#0x0,0x00aa73e8
00aa73b0	and w9,w9,w11
00aa73b4	tbnz w9,#0x0,0x00aa73e8
00aa73b8	mov x9,xzr
00aa73bc	add x11,x8,#0x10
00aa73c0	add x12,x23,x9
00aa73c4	add x13,x11,x9
00aa73c8	ldp q0,q1,[x12]
00aa73cc	ldp q2,q3,[x13, #-0x10]
00aa73d0	add x12,x24,x9
00aa73d4	adds x9,x9,#0x20
00aa73d8	eor v0.16B,v2.16B,v0.16B
00aa73dc	eor v1.16B,v3.16B,v1.16B
00aa73e0	stp q0,q1,[x12]
00aa73e4	b.ne 0x00aa73c0
00aa73e8	mov x9,xzr
00aa73ec	add x12,x10,#0x10
00aa73f0	add x15,x8,#0x11
00aa73f4	mov x16,x27
00aa73f8	mov w13,#0x10
00aa73fc	ldrb w17,[x23, x9]
00aa7400	ldrb w18,[x8, x9]
00aa7404	mov x14,x9
00aa7408	add x9,x9,#0x1
00aa740c	mov x10,x15
00aa7410	mov x11,x16
00aa7414	cmp x9,#0xf
00aa7418	eor w15,w18,w17
00aa741c	sub x13,x13,#0x1
00aa7420	strb w15,[x24, x14]
00aa7424	b.hi 0x00aa7438
00aa7428	add x15,x10,#0x1
00aa742c	cmp x9,x22
00aa7430	add x16,x11,#0x1
00aa7434	b.cc 0x00aa73fc
00aa7438	cmp x9,#0xf
00aa743c	b.hi 0x00aa74b8
00aa7440	mov w15,#0x10
00aa7444	sub x15,x15,x9
00aa7448	cmp x15,#0x1f
00aa744c	b.ls 0x00aa74a4
00aa7450	add x16,x24,x9
00aa7454	add x17,x8,#0x10
00aa7458	cmp x16,x17
00aa745c	b.cs 0x00aa746c
00aa7460	add x16,x8,x9
00aa7464	cmp x16,x12
00aa7468	b.cc 0x00aa74a4
00aa746c	orr w16,wzr,#0xf
00aa7470	and x13,x13,#-0x20
00aa7474	sub x14,x16,x14
00aa7478	and x12,x15,#-0x20
00aa747c	add x9,x13,x9
00aa7480	and x13,x14,#-0x20
00aa7484	ldp q0,q1,[x10, #-0x10]
00aa7488	add x10,x10,#0x20
00aa748c	subs x13,x13,#0x20
00aa7490	stp q0,q1,[x11, #-0x10]
00aa7494	add x11,x11,#0x20
00aa7498	b.ne 0x00aa7484
00aa749c	cmp x15,x12
00aa74a0	b.eq 0x00aa74b8
00aa74a4	ldrb w10,[x8, x9]
00aa74a8	strb w10,[x24, x9]
00aa74ac	add x9,x9,#0x1
00aa74b0	cmp x9,#0x10
00aa74b4	b.ne 0x00aa74a4
00aa74b8	mov x0,x24
00aa74bc	mov x1,x24
00aa74c0	mov x2,x21
00aa74c4	blr x20
00aa74c8	cmp x22,#0x11
00aa74cc	b.cs 0x00aa7330
00aa74d0	ldr x8,[sp, #0x8]
00aa74d4	cmp x24,x8
00aa74d8	b.eq 0x00aa74e4
00aa74dc	ldr q0,[x24]
00aa74e0	str q0,[x8]
00aa74e4	ldp x29,x30,[sp, #0x60]
00aa74e8	ldp x20,x19,[sp, #0x50]
00aa74ec	ldp x22,x21,[sp, #0x40]
00aa74f0	ldp x24,x23,[sp, #0x30]
00aa74f4	ldp x26,x25,[sp, #0x20]
00aa74f8	ldp x28,x27,[sp, #0x10]
00aa74fc	add sp,sp,#0x70
00aa7500	ret

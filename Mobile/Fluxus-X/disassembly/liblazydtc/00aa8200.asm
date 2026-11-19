; CRYPTO_ccm128_encrypt_ccm64 @ 00aa8200
00aa8200	sub sp,sp,#0x70
00aa8204	stp x28,x27,[sp, #0x10]
00aa8208	stp x26,x25,[sp, #0x20]
00aa820c	stp x24,x23,[sp, #0x30]
00aa8210	stp x22,x21,[sp, #0x40]
00aa8214	stp x20,x19,[sp, #0x50]
00aa8218	stp x29,x30,[sp, #0x60]
00aa821c	ldrb w26,[x0]
00aa8220	ldp x27,x20,[x0, #0x28]
00aa8224	mov x24,x4
00aa8228	mov x21,x3
00aa822c	mov x22,x2
00aa8230	mov x19,x0
00aa8234	mov x23,x1
00aa8238	add x29,sp,#0x60
00aa823c	tbnz w26,#0x6,0x00aa825c
00aa8240	add x1,x19,#0x10
00aa8244	mov x0,x19
00aa8248	mov x2,x20
00aa824c	blr x27
00aa8250	ldr x8,[x19, #0x20]
00aa8254	add x8,x8,#0x1
00aa8258	str x8,[x19, #0x20]
00aa825c	ands w8,w26,#0x7
00aa8260	strb w8,[x19]
00aa8264	eor w28,w8,#0xf
00aa8268	mov x8,xzr
00aa826c	b.eq 0x00aa8290
00aa8270	mov x9,x28
00aa8274	ldrb w10,[x19, x9]
00aa8278	strb wzr,[x19, x9]
00aa827c	add x9,x9,#0x1
00aa8280	cmp x9,#0xf
00aa8284	orr x8,x8,x10
00aa8288	lsl x8,x8,#0x8
00aa828c	b.cc 0x00aa8274
00aa8290	ldrb w9,[x19, #0xf]
00aa8294	orr x8,x8,x9
00aa8298	mov w9,#0x1
00aa829c	cmp x8,x21
00aa82a0	strb w9,[x19, #0xf]
00aa82a4	b.ne 0x00aa82d4
00aa82a8	ldr x8,[x19, #0x20]
00aa82ac	add x9,x21,#0xf
00aa82b0	lsr x9,x9,#0x3
00aa82b4	orr x9,x9,#0x1
00aa82b8	add x8,x8,x9
00aa82bc	orr x9,xzr,#0x2000000000000000
00aa82c0	cmp x8,x9
00aa82c4	str x8,[x19, #0x20]
00aa82c8	b.ls 0x00aa82dc
00aa82cc	orr w0,wzr,#0xfffffffe
00aa82d0	b 0x00aa849c
00aa82d4	mov w0,#0xffffffff
00aa82d8	b 0x00aa849c
00aa82dc	lsr x25,x21,#0x4
00aa82e0	cbz x25,0x00aa834c
00aa82e4	add x5,x19,#0x10
00aa82e8	mov x0,x23
00aa82ec	mov x1,x22
00aa82f0	mov x2,x25
00aa82f4	mov x3,x20
00aa82f8	mov x4,x19
00aa82fc	blr x24
00aa8300	and x8,x21,#-0x10
00aa8304	subs x21,x21,x8
00aa8308	b.eq 0x00aa8460
00aa830c	mov x9,xzr
00aa8310	add x23,x23,x8
00aa8314	add x22,x22,x8
00aa8318	orr w8,wzr,#0xf
00aa831c	ldrb w10,[x19, x8]
00aa8320	add x9,x9,w25, UXTB 
00aa8324	cmp x8,#0x8
00aa8328	add x10,x9,x10
00aa832c	strb w10,[x19, x8]
00aa8330	b.eq 0x00aa834c
00aa8334	lsr x9,x10,#0x8
00aa8338	orr x10,x10,x25
00aa833c	lsr x25,x25,#0x8
00aa8340	lsr x10,x10,#0x8
00aa8344	sub x8,x8,#0x1
00aa8348	cbnz x10,0x00aa831c
00aa834c	cbz x21,0x00aa8460
00aa8350	cmp x21,#0x20
00aa8354	add x0,x19,#0x10
00aa8358	b.cc 0x00aa8394
00aa835c	sub x9,x21,#0x1
00aa8360	cmn w9,#0x1
00aa8364	b.eq 0x00aa8394
00aa8368	mov x8,xzr
00aa836c	lsr x10,x9,#0x20
00aa8370	mov w9,wzr
00aa8374	cbnz x10,0x00aa839c
00aa8378	add x8,x19,#0x10
00aa837c	add x9,x23,x21
00aa8380	cmp x9,x8
00aa8384	b.ls 0x00aa84bc
00aa8388	add x8,x8,x21
00aa838c	cmp x23,x8
00aa8390	b.cs 0x00aa84bc
00aa8394	mov x8,xzr
00aa8398	mov w9,wzr
00aa839c	add w9,w9,#0x1
00aa83a0	ldrb w10,[x23, x8]
00aa83a4	ldrb w11,[x0, x8]
00aa83a8	eor w10,w11,w10
00aa83ac	strb w10,[x0, x8]
00aa83b0	mov w8,w9
00aa83b4	cmp x21,x8
00aa83b8	add w9,w9,#0x1
00aa83bc	b.hi 0x00aa83a0
00aa83c0	mov x1,x0
00aa83c4	mov x2,x20
00aa83c8	blr x27
00aa83cc	mov x1,sp
00aa83d0	mov x0,x19
00aa83d4	mov x2,x20
00aa83d8	mov x24,sp
00aa83dc	blr x27
00aa83e0	cmp x21,#0x1
00aa83e4	csinc x9,x21,xzr,hi
00aa83e8	cmp x9,#0x20
00aa83ec	b.cc 0x00aa8434
00aa83f0	cmp x21,#0x1
00aa83f4	csinc x8,x21,xzr,hi
00aa83f8	sub x10,x8,#0x1
00aa83fc	cmn w10,#0x1
00aa8400	b.eq 0x00aa8434
00aa8404	mov x8,xzr
00aa8408	lsr x11,x10,#0x20
00aa840c	mov w10,wzr
00aa8410	cbnz x11,0x00aa843c
00aa8414	cmp x21,#0x1
00aa8418	csinc x8,x21,xzr,hi
00aa841c	add x10,x23,x8
00aa8420	cmp x22,x10
00aa8424	b.cs 0x00aa8500
00aa8428	add x8,x22,x8
00aa842c	cmp x23,x8
00aa8430	b.cs 0x00aa8500
00aa8434	mov x8,xzr
00aa8438	mov w10,wzr
00aa843c	add w9,w10,#0x1
00aa8440	ldrb w10,[x24, x8]
00aa8444	ldrb w11,[x23, x8]
00aa8448	eor w10,w11,w10
00aa844c	strb w10,[x22, x8]
00aa8450	mov w8,w9
00aa8454	cmp x21,x8
00aa8458	add w9,w9,#0x1
00aa845c	b.hi 0x00aa8440
00aa8460	mov w8,#0x10
00aa8464	add x0,x19,x28
00aa8468	sub w2,w8,w28
00aa846c	mov w1,wzr
00aa8470	bl 0x00c301c0
00aa8474	mov x1,sp
00aa8478	mov x0,x19
00aa847c	mov x2,x20
00aa8480	blr x27
00aa8484	ldr q0,[sp]
00aa8488	ldr q1,[x19, #0x10]
00aa848c	mov w0,wzr
00aa8490	strb w26,[x19]
00aa8494	eor v0.16B,v1.16B,v0.16B
00aa8498	str q0,[x19, #0x10]
00aa849c	ldp x29,x30,[sp, #0x60]
00aa84a0	ldp x20,x19,[sp, #0x50]
00aa84a4	ldp x22,x21,[sp, #0x40]
00aa84a8	ldp x24,x23,[sp, #0x30]
00aa84ac	ldp x26,x25,[sp, #0x20]
00aa84b0	ldp x28,x27,[sp, #0x10]
00aa84b4	add sp,sp,#0x70
00aa84b8	ret
00aa84bc	and x8,x21,#-0x20
00aa84c0	add x9,x23,#0x10
00aa84c4	add x10,x19,#0x20
00aa84c8	mov x11,x8
00aa84cc	ldp q0,q1,[x9, #-0x10]
00aa84d0	ldp q2,q3,[x10, #-0x10]
00aa84d4	add x9,x9,#0x20
00aa84d8	subs x11,x11,#0x20
00aa84dc	eor v0.16B,v2.16B,v0.16B
00aa84e0	eor v1.16B,v3.16B,v1.16B
00aa84e4	stp q0,q1,[x10, #-0x10]
00aa84e8	add x10,x10,#0x20
00aa84ec	b.ne 0x00aa84cc
00aa84f0	cmp x21,x8
00aa84f4	mov w9,w8
00aa84f8	b.ne 0x00aa839c
00aa84fc	b 0x00aa83c0
00aa8500	and x8,x9,#-0x20
00aa8504	mov x11,sp
00aa8508	add x10,x23,#0x10
00aa850c	add x11,x11,#0x10
00aa8510	add x12,x22,#0x10
00aa8514	mov x13,x8
00aa8518	ldp q0,q1,[x11, #-0x10]
00aa851c	ldp q2,q3,[x10, #-0x10]
00aa8520	add x11,x11,#0x20
00aa8524	add x10,x10,#0x20
00aa8528	subs x13,x13,#0x20
00aa852c	eor v0.16B,v2.16B,v0.16B
00aa8530	eor v1.16B,v3.16B,v1.16B
00aa8534	stp q0,q1,[x12, #-0x10]
00aa8538	add x12,x12,#0x20
00aa853c	b.ne 0x00aa8518
00aa8540	cmp x9,x8
00aa8544	mov w10,w8
00aa8548	b.ne 0x00aa843c
00aa854c	b 0x00aa8460

; OSSL_PARAM_get_uint32 @ 00a9e444
00a9e444	str x21,[sp, #-0x30]!
00a9e448	mov x8,x0
00a9e44c	mov w0,wzr
00a9e450	stp x20,x19,[sp, #0x10]
00a9e454	stp x29,x30,[sp, #0x20]
00a9e458	add x29,sp,#0x20
00a9e45c	cbz x8,0x00a9e5dc
00a9e460	mov x19,x1
00a9e464	cbz x1,0x00a9e5dc
00a9e468	ldr w9,[x8, #0x8]
00a9e46c	cmp w9,#0x1
00a9e470	b.eq 0x00a9e4a8
00a9e474	cmp w9,#0x3
00a9e478	b.eq 0x00a9e4cc
00a9e47c	cmp w9,#0x2
00a9e480	mov w0,wzr
00a9e484	b.ne 0x00a9e5dc
00a9e488	ldr x21,[x8, #0x18]
00a9e48c	cmp x21,#0x8
00a9e490	b.eq 0x00a9e514
00a9e494	cmp x21,#0x4
00a9e498	b.ne 0x00a9e530
00a9e49c	ldr x8,[x8, #0x10]
00a9e4a0	ldr w8,[x8]
00a9e4a4	b 0x00a9e5cc
00a9e4a8	ldr x21,[x8, #0x18]
00a9e4ac	cmp x21,#0x8
00a9e4b0	b.eq 0x00a9e514
00a9e4b4	cmp x21,#0x4
00a9e4b8	b.ne 0x00a9e564
00a9e4bc	ldr x8,[x8, #0x10]
00a9e4c0	ldr w8,[x8]
00a9e4c4	tbz w8,#0x1f,0x00a9e5cc
00a9e4c8	b 0x00a9e5d8
00a9e4cc	ldr x9,[x8, #0x18]
00a9e4d0	mov w0,wzr
00a9e4d4	cmp x9,#0x8
00a9e4d8	b.ne 0x00a9e5dc
00a9e4dc	ldr x8,[x8, #0x10]
00a9e4e0	ldr d0,[x8]
00a9e4e4	fcmp d0,#0.0
00a9e4e8	b.lt 0x00a9e5d8
00a9e4ec	adrp x8,0x29a000
00a9e4f0	ldr d1,[x8, #0x540]
00a9e4f4	mov w0,wzr
00a9e4f8	fcmp d0,d1
00a9e4fc	b.hi 0x00a9e5dc
00a9e500	fcvtzu w8,d0
00a9e504	ucvtf d1,w8
00a9e508	fcmp d0,d1
00a9e50c	b.eq 0x00a9e5cc
00a9e510	b 0x00a9e5d8
00a9e514	ldr x8,[x8, #0x10]
00a9e518	mov w0,wzr
00a9e51c	ldr x8,[x8]
00a9e520	lsr x9,x8,#0x20
00a9e524	cbnz x9,0x00a9e5dc
00a9e528	str w8,[x19]
00a9e52c	b 0x00a9e5d0
00a9e530	ldr x20,[x8, #0x10]
00a9e534	cmp x21,#0x3
00a9e538	b.ls 0x00a9e57c
00a9e53c	subs x8,x21,#0x4
00a9e540	b.eq 0x00a9e5c8
00a9e544	mov x9,xzr
00a9e548	add x10,x20,#0x4
00a9e54c	ldrb w11,[x10, x9]
00a9e550	cbnz w11,0x00a9e5d8
00a9e554	add x9,x9,#0x1
00a9e558	cmp x9,x8
00a9e55c	b.cc 0x00a9e54c
00a9e560	b 0x00a9e5c8
00a9e564	ldr x20,[x8, #0x10]
00a9e568	add x8,x20,x21
00a9e56c	ldursb w8,[x8, #-0x1]
00a9e570	tbnz w8,#0x1f,0x00a9e5d8
00a9e574	cmp x21,#0x3
00a9e578	b.hi 0x00a9e5a4
00a9e57c	mov w8,#0x4
00a9e580	sub x2,x8,x21
00a9e584	add x0,x19,x21
00a9e588	mov w1,wzr
00a9e58c	bl 0x00c301c0
00a9e590	mov x0,x19
00a9e594	mov x1,x20
00a9e598	mov x2,x21
00a9e59c	bl 0x00c2ffd0
00a9e5a0	b 0x00a9e5d0
00a9e5a4	subs x8,x21,#0x4
00a9e5a8	b.eq 0x00a9e5c8
00a9e5ac	mov x9,xzr
00a9e5b0	add x10,x20,#0x4
00a9e5b4	ldrb w11,[x10, x9]
00a9e5b8	cbnz w11,0x00a9e5d8
00a9e5bc	add x9,x9,#0x1
00a9e5c0	cmp x9,x8
00a9e5c4	b.cc 0x00a9e5b4
00a9e5c8	ldr w8,[x20]
00a9e5cc	str w8,[x19]
00a9e5d0	mov w0,#0x1
00a9e5d4	b 0x00a9e5dc
00a9e5d8	mov w0,wzr
00a9e5dc	ldp x29,x30,[sp, #0x20]
00a9e5e0	ldp x20,x19,[sp, #0x10]
00a9e5e4	ldr x21,[sp], #0x30
00a9e5e8	ret

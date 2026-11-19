; BF_set_key @ 00a8e3a4
00a8e3a4	str x21,[sp, #-0x30]!
00a8e3a8	mov w21,w1
00a8e3ac	adrp x1,0x76a000
00a8e3b0	stp x20,x19,[sp, #0x10]
00a8e3b4	mov x20,x2
00a8e3b8	add x1,x1,#0x558
00a8e3bc	mov w2,#0x1048
00a8e3c0	stp x29,x30,[sp, #0x20]
00a8e3c4	add x29,sp,#0x20
00a8e3c8	mov x19,x0
00a8e3cc	bl 0x00c2ffd0
00a8e3d0	cmp w21,#0x48
00a8e3d4	mov w9,#0x48
00a8e3d8	csel w9,w21,w9,lt
00a8e3dc	mov w10,#0x6a88
00a8e3e0	mov x8,xzr
00a8e3e4	add x9,x20,w9, SXTW 
00a8e3e8	movk w10,#0x243f, LSL #16
00a8e3ec	mov x11,x20
00a8e3f0	b 0x00a8e408
00a8e3f4	add x10,x19,x8
00a8e3f8	ldr w10,[x10, #0x4]
00a8e3fc	cmp x11,x9
00a8e400	csel x11,x11,x20,cc
00a8e404	add x8,x8,#0x4
00a8e408	ldrb w12,[x11], #0x1
00a8e40c	cmp x11,x9
00a8e410	csel x11,x11,x20,cc
00a8e414	ldrb w13,[x11], #0x1
00a8e418	cmp x11,x9
00a8e41c	csel x11,x11,x20,cc
00a8e420	ldrb w14,[x11], #0x1
00a8e424	bfm w13,w12,#0x18,#0x17
00a8e428	cmp x11,x9
00a8e42c	csel x11,x11,x20,cc
00a8e430	ldrb w15,[x11], #0x1
00a8e434	bfm w14,w13,#0x18,#0x17
00a8e438	cmp x8,#0x44
00a8e43c	bfm w15,w14,#0x18,#0x17
00a8e440	eor w10,w15,w10
00a8e444	str w10,[x19, x8#0x0]
00a8e448	b.ne 0x00a8e3f4
00a8e44c	add x0,sp,#0x8
00a8e450	mov x1,x19
00a8e454	str xzr,[sp, #0x8]
00a8e458	bl 0x00c38420
00a8e45c	ldr x8,[sp, #0x8]
00a8e460	add x0,sp,#0x8
00a8e464	mov x1,x19
00a8e468	str x8,[x19]
00a8e46c	bl 0x00c38420
00a8e470	ldr x8,[sp, #0x8]
00a8e474	add x0,sp,#0x8
00a8e478	mov x1,x19
00a8e47c	str x8,[x19, #0x8]
00a8e480	bl 0x00c38420
00a8e484	ldr x8,[sp, #0x8]
00a8e488	add x0,sp,#0x8
00a8e48c	mov x1,x19
00a8e490	str x8,[x19, #0x10]
00a8e494	bl 0x00c38420
00a8e498	ldr x8,[sp, #0x8]
00a8e49c	add x0,sp,#0x8
00a8e4a0	mov x1,x19
00a8e4a4	str x8,[x19, #0x18]
00a8e4a8	bl 0x00c38420
00a8e4ac	ldr x8,[sp, #0x8]
00a8e4b0	add x0,sp,#0x8
00a8e4b4	mov x1,x19
00a8e4b8	str x8,[x19, #0x20]
00a8e4bc	bl 0x00c38420
00a8e4c0	ldr x8,[sp, #0x8]
00a8e4c4	add x0,sp,#0x8
00a8e4c8	mov x1,x19
00a8e4cc	str x8,[x19, #0x28]
00a8e4d0	bl 0x00c38420
00a8e4d4	ldr x8,[sp, #0x8]
00a8e4d8	add x0,sp,#0x8
00a8e4dc	mov x1,x19
00a8e4e0	str x8,[x19, #0x30]
00a8e4e4	bl 0x00c38420
00a8e4e8	ldr x8,[sp, #0x8]
00a8e4ec	add x0,sp,#0x8
00a8e4f0	mov x1,x19
00a8e4f4	str x8,[x19, #0x38]
00a8e4f8	bl 0x00c38420
00a8e4fc	ldr x8,[sp, #0x8]
00a8e500	mov x20,xzr
00a8e504	mov w21,#0x48
00a8e508	str x8,[x19, #0x40]
00a8e50c	add x0,sp,#0x8
00a8e510	mov x1,x19
00a8e514	bl 0x00c38420
00a8e518	ldr x8,[sp, #0x8]
00a8e51c	add x20,x20,#0x2
00a8e520	cmp x20,#0x400
00a8e524	str x8,[x19, x21#0x0]
00a8e528	add x21,x21,#0x8
00a8e52c	b.cc 0x00a8e50c
00a8e530	ldp x29,x30,[sp, #0x20]
00a8e534	ldp x20,x19,[sp, #0x10]
00a8e538	ldr x21,[sp], #0x30
00a8e53c	ret

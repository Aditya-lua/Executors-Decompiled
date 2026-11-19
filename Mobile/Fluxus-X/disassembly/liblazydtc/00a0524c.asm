; bn_sub_words @ 00a0524c
00a0524c	cmp w3,#0x1
00a05250	b.lt 0x00a05344
00a05254	mov w10,wzr
00a05258	subs w11,w3,#0x4
00a0525c	b.cc 0x00a0534c
00a05260	and w8,w11,#0xfffffffc
00a05264	add x12,x8,#0x4
00a05268	lsl x9,x12,#0x3
00a0526c	add x8,x1,x9
00a05270	add x9,x0,x9
00a05274	mov w13,#0x2
00a05278	mov x14,x2
00a0527c	ldr x15,[x1]
00a05280	ldr x16,[x14]
00a05284	sub w3,w3,#0x4
00a05288	sub x10,x15,w10, SXTW 
00a0528c	cmp x10,x15
00a05290	sub x15,x10,x16
00a05294	str x15,[x0]
00a05298	ldr x17,[x1, #0x8]
00a0529c	cset w16,hi
00a052a0	cmp x15,x10
00a052a4	ldr x15,[x14, #0x8]
00a052a8	cset w10,hi
00a052ac	sub x16,x17,x16
00a052b0	sub x10,x16,x10
00a052b4	sub x15,x10,x15
00a052b8	str x15,[x0, #0x8]
00a052bc	cmp x10,x17
00a052c0	ldr x17,[x1, #0x10]
00a052c4	cset w16,hi
00a052c8	cmp x15,x10
00a052cc	ldr x15,[x14, #0x10]
00a052d0	cset w10,hi
00a052d4	sub x16,x17,x16
00a052d8	sub x10,x16,x10
00a052dc	sub x15,x10,x15
00a052e0	cmp x10,x17
00a052e4	str x15,[x0, #0x10]
00a052e8	cset w16,hi
00a052ec	cmp x15,x10
00a052f0	ldr x15,[x1, #0x18]
00a052f4	ldr x17,[x14, #0x18]
00a052f8	cset w10,hi
00a052fc	add x1,x1,#0x20
00a05300	sub x16,x15,x16
00a05304	sub x10,x16,x10
00a05308	sub x16,x10,x17
00a0530c	cmp x10,x15
00a05310	cset w15,hi
00a05314	csinc w17,w13,wzr,hi
00a05318	cmp x16,x10
00a0531c	add x14,x14,#0x20
00a05320	str x16,[x0, #0x18]
00a05324	csel w10,w15,w17,ls
00a05328	cmp w3,#0x3
00a0532c	add x0,x0,#0x20
00a05330	b.hi 0x00a0527c
00a05334	ands w3,w11,#0x3
00a05338	b.eq 0x00a05388
00a0533c	add x2,x2,x12, LSL #0x3
00a05340	b 0x00a05354
00a05344	mov x0,xzr
00a05348	ret
00a0534c	mov x8,x1
00a05350	mov x9,x0
00a05354	mov w11,#0x2
00a05358	ldr x12,[x8], #0x8
00a0535c	ldr x13,[x2], #0x8
00a05360	sub x10,x12,w10, SXTW 
00a05364	sub x13,x10,x13
00a05368	cmp x10,x12
00a0536c	cset w12,hi
00a05370	csinc w14,w11,wzr,hi
00a05374	cmp x13,x10
00a05378	csel w10,w12,w14,ls
00a0537c	subs w3,w3,#0x1
00a05380	str x13,[x9], #0x8
00a05384	b.ne 0x00a05358
00a05388	sxtw x0,w10
00a0538c	ret

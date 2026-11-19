; FUN_00a4c270 @ 00a4c270
00a4c270	cbz x2,0x00a4c2a8
00a4c274	mov x10,xzr
00a4c278	mov x9,xzr
00a4c27c	mov x8,xzr
00a4c280	ldrb w11,[x1, x8]
00a4c284	add x8,x8,#0x1
00a4c288	cmp x8,#0x7
00a4c28c	lsl x11,x11,x10
00a4c290	orr x9,x11,x9
00a4c294	b.hi 0x00a4c2b0
00a4c298	cmp x8,x2
00a4c29c	add x10,x10,#0x8
00a4c2a0	b.cc 0x00a4c280
00a4c2a4	b 0x00a4c2b0
00a4c2a8	mov x8,xzr
00a4c2ac	mov x9,xzr
00a4c2b0	cmp x8,x2
00a4c2b4	str x9,[x0]
00a4c2b8	b.cs 0x00a4c304
00a4c2bc	mov x10,xzr
00a4c2c0	mov x9,xzr
00a4c2c4	mov x12,xzr
00a4c2c8	add x11,x1,x8
00a4c2cc	ldrb w14,[x11, x12]
00a4c2d0	add x13,x12,#0x1
00a4c2d4	cmp x13,#0x7
00a4c2d8	lsl x14,x14,x10
00a4c2dc	orr x9,x14,x9
00a4c2e0	b.hi 0x00a4c2fc
00a4c2e4	add x12,x8,x12
00a4c2e8	add x12,x12,#0x1
00a4c2ec	cmp x12,x2
00a4c2f0	add x10,x10,#0x8
00a4c2f4	mov x12,x13
00a4c2f8	b.cc 0x00a4c2cc
00a4c2fc	add x8,x8,x13
00a4c300	b 0x00a4c308
00a4c304	mov x9,xzr
00a4c308	cmp x8,x2
00a4c30c	str x9,[x0, #0x8]
00a4c310	b.cs 0x00a4c35c
00a4c314	mov x10,xzr
00a4c318	mov x9,xzr
00a4c31c	mov x12,xzr
00a4c320	add x11,x1,x8
00a4c324	ldrb w14,[x11, x12]
00a4c328	add x13,x12,#0x1
00a4c32c	cmp x13,#0x7
00a4c330	lsl x14,x14,x10
00a4c334	orr x9,x14,x9
00a4c338	b.hi 0x00a4c354
00a4c33c	add x12,x8,x12
00a4c340	add x12,x12,#0x1
00a4c344	cmp x12,x2
00a4c348	add x10,x10,#0x8
00a4c34c	mov x12,x13
00a4c350	b.cc 0x00a4c324
00a4c354	add x8,x8,x13
00a4c358	b 0x00a4c360
00a4c35c	mov x9,xzr
00a4c360	cmp x8,x2
00a4c364	str x9,[x0, #0x10]
00a4c368	b.cs 0x00a4c3b4
00a4c36c	mov x10,xzr
00a4c370	mov x9,xzr
00a4c374	mov x12,xzr
00a4c378	add x11,x1,x8
00a4c37c	ldrb w14,[x11, x12]
00a4c380	add x13,x12,#0x1
00a4c384	cmp x13,#0x7
00a4c388	lsl x14,x14,x10
00a4c38c	orr x9,x14,x9
00a4c390	b.hi 0x00a4c3ac
00a4c394	add x12,x8,x12
00a4c398	add x12,x12,#0x1
00a4c39c	cmp x12,x2
00a4c3a0	add x10,x10,#0x8
00a4c3a4	mov x12,x13
00a4c3a8	b.cc 0x00a4c37c
00a4c3ac	add x8,x8,x13
00a4c3b0	b 0x00a4c3b8
00a4c3b4	mov x9,xzr
00a4c3b8	cmp x8,x2
00a4c3bc	str x9,[x0, #0x18]
00a4c3c0	b.cs 0x00a4c40c
00a4c3c4	mov x10,xzr
00a4c3c8	mov x9,xzr
00a4c3cc	mov x12,xzr
00a4c3d0	add x11,x1,x8
00a4c3d4	ldrb w14,[x11, x12]
00a4c3d8	add x13,x12,#0x1
00a4c3dc	cmp x13,#0x7
00a4c3e0	lsl x14,x14,x10
00a4c3e4	orr x9,x14,x9
00a4c3e8	b.hi 0x00a4c404
00a4c3ec	add x12,x8,x12
00a4c3f0	add x12,x12,#0x1
00a4c3f4	cmp x12,x2
00a4c3f8	add x10,x10,#0x8
00a4c3fc	mov x12,x13
00a4c400	b.cc 0x00a4c3d4
00a4c404	add x8,x8,x13
00a4c408	b 0x00a4c410
00a4c40c	mov x9,xzr
00a4c410	cmp x8,x2
00a4c414	str x9,[x0, #0x20]
00a4c418	b.cs 0x00a4c464
00a4c41c	mov x9,xzr
00a4c420	mov x10,xzr
00a4c424	mov x12,xzr
00a4c428	add x11,x1,x8
00a4c42c	ldrb w14,[x11, x12]
00a4c430	add x13,x12,#0x1
00a4c434	cmp x13,#0x7
00a4c438	lsl x14,x14,x9
00a4c43c	orr x10,x14,x10
00a4c440	b.hi 0x00a4c45c
00a4c444	add x12,x8,x12
00a4c448	add x12,x12,#0x1
00a4c44c	cmp x12,x2
00a4c450	add x9,x9,#0x8
00a4c454	mov x12,x13
00a4c458	b.cc 0x00a4c42c
00a4c45c	add x8,x8,x13
00a4c460	b 0x00a4c468
00a4c464	mov x10,xzr
00a4c468	mov x9,xzr
00a4c46c	cmp x8,x2
00a4c470	str x10,[x0, #0x28]
00a4c474	b.cs 0x00a4c4b8
00a4c478	mov x10,xzr
00a4c47c	mov x9,xzr
00a4c480	mov x12,xzr
00a4c484	add x11,x8,#0x1
00a4c488	add x8,x1,x8
00a4c48c	ldrb w14,[x8, x12]
00a4c490	add x13,x12,#0x1
00a4c494	cmp x13,#0x7
00a4c498	lsl x14,x14,x10
00a4c49c	orr x9,x14,x9
00a4c4a0	b.hi 0x00a4c4b8
00a4c4a4	add x12,x11,x12
00a4c4a8	cmp x12,x2
00a4c4ac	add x10,x10,#0x8
00a4c4b0	mov x12,x13
00a4c4b4	b.cc 0x00a4c48c
00a4c4b8	str x9,[x0, #0x30]
00a4c4bc	ret

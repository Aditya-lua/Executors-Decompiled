; FUN_00b7f304 @ 00b7f304
00b7f304	str x21,[sp, #-0x30]!
00b7f308	stp x20,x19,[sp, #0x10]
00b7f30c	stp x29,x30,[sp, #0x20]
00b7f310	add x29,sp,#0x20
00b7f314	ldrsh w9,[x1, #0x8]
00b7f318	ldrsh w10,[x2, #0x8]
00b7f31c	mov x8,x1
00b7f320	mov x19,x0
00b7f324	mul w11,w9,w3
00b7f328	mul w10,w11,w10
00b7f32c	and w20,w9,#0xffff
00b7f330	tbnz w10,#0x1f,0x00b7f34c
00b7f334	mov x0,x19
00b7f338	mov x1,x8
00b7f33c	bl 0x00c41b00
00b7f340	cbnz w0,0x00b7f428
00b7f344	strh w20,[x19, #0x8]
00b7f348	b 0x00b7f428
00b7f34c	ldrh w9,[x8, #0xa]
00b7f350	sub x9,x9,#0x1
00b7f354	cmn x9,#0x1
00b7f358	b.eq 0x00b7f374
00b7f35c	ldr x10,[x8]
00b7f360	ldr x10,[x10, x9, LSL #0x3]
00b7f364	sub x9,x9,#0x1
00b7f368	cbz x10,0x00b7f354
00b7f36c	add x9,x9,#0x2
00b7f370	b 0x00b7f378
00b7f374	mov x9,xzr
00b7f378	ldrh w10,[x2, #0xa]
00b7f37c	sub x10,x10,#0x1
00b7f380	cmn x10,#0x1
00b7f384	b.eq 0x00b7f3fc
00b7f388	ldr x11,[x2]
00b7f38c	ldr x11,[x11, x10, LSL #0x3]
00b7f390	sub x10,x10,#0x1
00b7f394	cbz x11,0x00b7f380
00b7f398	add x10,x10,#0x2
00b7f39c	cmp x9,x10
00b7f3a0	b.hi 0x00b7f408
00b7f3a4	cmp x10,x9
00b7f3a8	b.hi 0x00b7f3e0
00b7f3ac	sub x9,x9,#0x1
00b7f3b0	cmn x9,#0x1
00b7f3b4	b.eq 0x00b7f438
00b7f3b8	ldr x10,[x8]
00b7f3bc	ldr x11,[x2]
00b7f3c0	lsl x12,x9,#0x3
00b7f3c4	ldr x10,[x10, x12#0x0]
00b7f3c8	ldr x11,[x11, x12#0x0]
00b7f3cc	cmp x10,x11
00b7f3d0	b.hi 0x00b7f408
00b7f3d4	cmp x10,x11
00b7f3d8	sub x9,x9,#0x1
00b7f3dc	b.cs 0x00b7f3b0
00b7f3e0	mov x0,x19
00b7f3e4	mov x1,x2
00b7f3e8	mov x2,x8
00b7f3ec	bl 0x00c41d40
00b7f3f0	cbnz w0,0x00b7f428
00b7f3f4	neg w8,w20
00b7f3f8	b 0x00b7f424
00b7f3fc	mov x10,xzr
00b7f400	cmp x9,x10
00b7f404	b.ls 0x00b7f3a4
00b7f408	mov w21,#0x1
00b7f40c	mov x0,x19
00b7f410	mov x1,x8
00b7f414	bl 0x00c41d40
00b7f418	cbnz w0,0x00b7f428
00b7f41c	cmp w21,#0x0
00b7f420	csinc w8,w20,wzr,ne
00b7f424	strh w8,[x19, #0x8]
00b7f428	ldp x29,x30,[sp, #0x20]
00b7f42c	ldp x20,x19,[sp, #0x10]
00b7f430	ldr x21,[sp], #0x30
00b7f434	ret
00b7f438	mov w21,wzr
00b7f43c	b 0x00b7f40c

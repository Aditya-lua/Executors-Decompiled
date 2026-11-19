; FUN_0088c318 @ 0088c318
0088c318	stp x29,x30,[sp, #-0x30]!
0088c31c	str x21,[sp, #0x10]
0088c320	stp x20,x19,[sp, #0x20]
0088c324	mov x29,sp
0088c328	ldr x8,[x0, #0xc8]
0088c32c	mov x20,x1
0088c330	mov x19,x0
0088c334	add x1,x0,#0xc30
0088c338	cbz x8,0x0088c3f4
0088c33c	lsr x8,x1,#0x3
0088c340	mov w9,#0x8
0088c344	lsr x10,x1,#0x20
0088c348	bfm x9,x8,#0x3a,#0x19
0088c34c	eor x8,x9,x10
0088c350	mov x9,#0x2d69
0088c354	movk x9,#0xeb38, LSL #16
0088c358	movk x9,#0xea08, LSL #32
0088c35c	movk x9,#0x9ddf, LSL #48
0088c360	mul x8,x8,x9
0088c364	eor x10,x10,x8, LSR #0x2f
0088c368	eor x8,x10,x8
0088c36c	mul x8,x8,x9
0088c370	mov x9,#0x959d
0088c374	movk x9,#0xb8f4, LSL #16
0088c378	movk x9,#0xd34f, LSL #32
0088c37c	movk x9,#0x949d, LSL #48
0088c380	eor x8,x8,x8, LSR #0x2f
0088c384	mul x8,x8,x9
0088c388	ldrb w9,[x19, #0xd0]
0088c38c	lsr x9,x8,x9
0088c390	ldr x8,[x19, #0xb8]
0088c394	lsr x10,x9,#0x6
0088c398	ldr x10,[x8, x10, LSL #0x3]
0088c39c	lsr x10,x10,x9
0088c3a0	tbz w10,#0x0,0x0088c3f4
0088c3a4	ldr x11,[x19, #0xc0]
0088c3a8	ldr x10,[x19, #0xa0]
0088c3ac	mov w12,#0x18
0088c3b0	sub x11,x11,#0x1
0088c3b4	madd x13,x9,x12,x10
0088c3b8	ldr x14,[x13]
0088c3bc	cmp x14,x1
0088c3c0	b.eq 0x0088c3e0
0088c3c4	add x9,x9,#0x1
0088c3c8	and x9,x9,x11
0088c3cc	lsr x13,x9,#0x6
0088c3d0	ldr x13,[x8, x13, LSL #0x3]
0088c3d4	lsr x13,x13,x9
0088c3d8	tbnz w13,#0x0,0x0088c3b4
0088c3dc	b 0x0088c3f4
0088c3e0	ldrb w8,[x13, #0x9]
0088c3e4	cmp w8,#0x1
0088c3e8	b.ne 0x0088c3f4
0088c3ec	ldrb w21,[x13, #0x8]
0088c3f0	b 0x0088c438
0088c3f4	mov x0,x19
0088c3f8	bl 0x0088dd6c
0088c3fc	ldr w21,[x19, #0x64c]
0088c400	add w8,w21,#0x1
0088c404	cmp w8,#0x100
0088c408	b.cs 0x0088c44c
0088c40c	ldr w9,[x19, #0x650]
0088c410	mov w3,w0
0088c414	ldr x0,[x19]
0088c418	str w8,[x19, #0x64c]
0088c41c	mov w1,#0x9
0088c420	mov w2,w21
0088c424	cmp w9,w8
0088c428	mov w4,wzr
0088c42c	csel w8,w9,w8,hi
0088c430	str w8,[x19, #0x650]
0088c434	bl 0x00875b54
0088c438	mov w0,w21
0088c43c	ldp x20,x19,[sp, #0x20]
0088c440	ldr x21,[sp, #0x10]
0088c444	ldp x29,x30,[sp], #0x30
0088c448	ret
0088c44c	adrp x1,0x2d0000
0088c450	add x1,x1,#0xc00
0088c454	add x0,x20,#0xc
0088c458	mov w2,#0x1
0088c45c	mov w3,#0xff
0088c460	bl 0x0087fcd8

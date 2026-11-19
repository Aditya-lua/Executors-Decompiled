; FUN_0098f2d0 @ 0098f2d0
0098f2d0	sub sp,sp,#0x50
0098f2d4	str d8,[sp, #0x10]
0098f2d8	str x23,[sp, #0x18]
0098f2dc	stp x22,x21,[sp, #0x20]
0098f2e0	stp x20,x19,[sp, #0x30]
0098f2e4	stp x29,x30,[sp, #0x40]
0098f2e8	add x29,sp,#0x40
0098f2ec	ldr d0,[x2]
0098f2f0	mov x19,x2
0098f2f4	mov x21,x1
0098f2f8	mov x22,x0
0098f2fc	fcmp d0,#0.0
0098f300	b.gt 0x0098f30c
0098f304	mov w0,#0x1
0098f308	b 0x0098f3c8
0098f30c	bl 0x00c31900
0098f310	mov x20,x0
0098f314	bl 0x00c31910
0098f318	ldr d8,[x19]
0098f31c	mov x23,x0
0098f320	mov v0.16B,v8.16B
0098f324	bl 0x00c2ad94
0098f328	adrp x8,0x29c000
0098f32c	ldr q1,[x8, #0x1c0]
0098f330	bl 0x00c2aeac
0098f334	adrp x8,0x29c000
0098f338	ldr q1,[x8, #0x120]
0098f33c	bl 0x00c2a8b4
0098f340	mov x0,x23
0098f344	str q0,[sp]
0098f348	bl 0x00c2ae48
0098f34c	adrp x8,0x29c000
0098f350	ldr q1,[x8, #0xe30]
0098f354	bl 0x00c2aeac
0098f358	ldr q1,[sp]
0098f35c	bl 0x00c2acf4
0098f360	cmp w0,#0x0
0098f364	b.ge 0x0098f394
0098f368	adrp x8,0x29b000
0098f36c	ldr d0,[x8, #0x970]
0098f370	mov w8,#0x3e8
0098f374	fmul d0,d8,d0
0098f378	fcvtzs x9,d0
0098f37c	scvtf d1,x9
0098f380	fcmp d0,d1
0098f384	cset w10,gt
0098f388	madd x8,x23,x8,x9
0098f38c	add x2,x8,x10
0098f390	b 0x0098f398
0098f394	orr x2,xzr,#0x7fffffffffffffff
0098f398	mov x0,x22
0098f39c	mov x1,x21
0098f3a0	bl 0x00c318e0
0098f3a4	bl 0x00c31900
0098f3a8	adrp x8,0x29b000
0098f3ac	ldr d0,[x19]
0098f3b0	ldr d1,[x8, #0x970]
0098f3b4	sub x8,x0,x20
0098f3b8	scvtf d2,x8
0098f3bc	fmul d0,d0,d1
0098f3c0	fcmp d0,d2
0098f3c4	cset w0,le
0098f3c8	ldp x29,x30,[sp, #0x40]
0098f3cc	ldp x20,x19,[sp, #0x30]
0098f3d0	ldp x22,x21,[sp, #0x20]
0098f3d4	ldr x23,[sp, #0x18]
0098f3d8	ldr d8,[sp, #0x10]
0098f3dc	add sp,sp,#0x50
0098f3e0	ret

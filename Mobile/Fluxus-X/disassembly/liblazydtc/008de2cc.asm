; FUN_008de2cc @ 008de2cc
008de2cc	stp x29,x30,[sp, #-0x30]!
008de2d0	stp x28,x21,[sp, #0x10]
008de2d4	stp x20,x19,[sp, #0x20]
008de2d8	mov x29,sp
008de2dc	sub sp,sp,#0x7d0
008de2e0	mov x8,#-0x19
008de2e4	mrs x21,tpidr_el0
008de2e8	orr x10,xzr,#-0x3fffc01
008de2ec	movk x8,#0xfbff, LSL #16
008de2f0	ldr x9,[x21, #0x28]
008de2f4	add x8,x2,x8
008de2f8	cmp x8,x10
008de2fc	stur x9,[x29, #-0x8]
008de300	b.cc 0x008de470
008de304	ldrb w8,[x1]
008de308	cbz w8,0x008de470
008de30c	add x9,x1,x2
008de310	mov x8,x9
008de314	ldurb w11,[x9, #-0x8]
008de318	ldrb w10,[x8, #-0x18]!
008de31c	eor w11,w10,w11
008de320	and w11,w11,#0xff
008de324	cmp w11,#0x70
008de328	b.ne 0x008de470
008de32c	ldurb w11,[x9, #-0x4]
008de330	eor w10,w11,w10
008de334	cmp w10,#0x32
008de338	b.ne 0x008de470
008de33c	ldurb w11,[x9, #-0x7]
008de340	ldurb w10,[x9, #-0x17]
008de344	eor w11,w10,w11
008de348	and w11,w11,#0xff
008de34c	cmp w11,#0x18
008de350	b.ne 0x008de470
008de354	ldurb w11,[x9, #-0x3]
008de358	eor w10,w11,w10
008de35c	cmp w10,#0xc4
008de360	b.ne 0x008de470
008de364	ldurb w11,[x9, #-0x6]
008de368	ldurb w10,[x9, #-0x16]
008de36c	eor w11,w10,w11
008de370	and w11,w11,#0xff
008de374	cmp w11,#0x17
008de378	b.ne 0x008de470
008de37c	ldurb w11,[x9, #-0x2]
008de380	eor w10,w11,w10
008de384	cmp w10,#0x6a
008de388	b.ne 0x008de470
008de38c	ldurb w11,[x9, #-0x5]
008de390	ldurb w10,[x9, #-0x15]
008de394	eor w11,w10,w11
008de398	and w11,w11,#0xff
008de39c	cmp w11,#0x74
008de3a0	b.ne 0x008de470
008de3a4	ldurb w9,[x9, #-0x1]
008de3a8	eor w9,w9,w10
008de3ac	cmp w9,#0x1
008de3b0	b.ne 0x008de470
008de3b4	ldr q0,[x8]
008de3b8	ldr x0,[x0]
008de3bc	mov x20,x2
008de3c0	mov x19,x1
008de3c4	mov x9,xzr
008de3c8	mov x10,xzr
008de3cc	mov x12,xzr
008de3d0	mov x11,xzr
008de3d4	add x8,sp,#0x20
008de3d8	str q0,[sp, #0x20]
008de3dc	ldrb w13,[x8, x10]
008de3e0	and x14,x9,#0x38
008de3e4	mov x1,x12
008de3e8	cmp x10,#0x8
008de3ec	add x10,x10,#0x1
008de3f0	add x9,x9,#0x8
008de3f4	lsl x12,x13,x14
008de3f8	csel x13,x1,x11,cc
008de3fc	orr x2,x12,x13
008de400	csel x11,x11,x2,cc
008de404	csel x12,x2,x1,cc
008de408	cmp x10,#0x10
008de40c	b.ne 0x008de3dc
008de410	bl 0x008decbc
008de414	str x0,[sp, #0x10]
008de418	add x0,sp,#0x50
008de41c	sub x20,x20,#0x18
008de420	str w1,[sp, #0x18]
008de424	bl 0x00c30a40
008de428	add x0,sp,#0x50
008de42c	mov x1,x19
008de430	mov x2,x20
008de434	bl 0x00c30a50
008de438	movi v0.2D,#0x0
008de43c	add x0,sp,#0x50
008de440	add x1,sp,#0x30
008de444	mov w2,#0x20
008de448	stp q0,q0,[sp, #0x30]
008de44c	bl 0x00c30a60
008de450	ldur x8,[sp, #0x34]
008de454	ldr x9,[sp, #0x10]
008de458	ldr w10,[sp, #0x3c]
008de45c	ldr w11,[sp, #0x18]
008de460	cmp x9,x8
008de464	ccmp x11,x10,#0x0,eq
008de468	cset w0,eq
008de46c	b 0x008de474
008de470	mov w0,wzr
008de474	ldr x8,[x21, #0x28]
008de478	ldur x9,[x29, #-0x8]
008de47c	cmp x8,x9
008de480	b.ne 0x008de498
008de484	add sp,sp,#0x7d0
008de488	ldp x20,x19,[sp, #0x20]
008de48c	ldp x28,x21,[sp, #0x10]
008de490	ldp x29,x30,[sp], #0x30
008de494	ret
008de498	bl 0x00c2fec0

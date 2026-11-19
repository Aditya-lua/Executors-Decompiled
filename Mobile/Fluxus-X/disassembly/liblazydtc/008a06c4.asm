; FUN_008a06c4 @ 008a06c4
008a06c4	stp x29,x30,[sp, #-0x50]!
008a06c8	str x25,[sp, #0x10]
008a06cc	stp x24,x23,[sp, #0x20]
008a06d0	stp x22,x21,[sp, #0x30]
008a06d4	stp x20,x19,[sp, #0x40]
008a06d8	mov x29,sp
008a06dc	ldp x8,x9,[x0, #0x8]
008a06e0	mov x19,x0
008a06e4	mov x21,x1
008a06e8	cmp x8,x9
008a06ec	b.cs 0x008a0710
008a06f0	ldp q2,q0,[x21, #0x10]
008a06f4	ldr x9,[x21, #0x30]
008a06f8	ldr q1,[x21]
008a06fc	add x21,x8,#0x38
008a0700	str x9,[x8, #0x30]
008a0704	stp q2,q0,[x8, #0x10]
008a0708	str q1,[x8]
008a070c	b 0x008a07e0
008a0710	ldr x20,[x19]
008a0714	mov x11,#0x6db7
008a0718	mov x10,#0x1
008a071c	movk x11,#0xb6db, LSL #16
008a0720	sub x23,x8,x20
008a0724	movk x11,#0xdb6d, LSL #32
008a0728	asr x8,x23,#0x3
008a072c	movk x11,#0x6db6, LSL #48
008a0730	madd x10,x8,x11,x10
008a0734	mov x8,#0x2492
008a0738	movk x8,#0x9249, LSL #16
008a073c	movk x8,#0x4924, LSL #32
008a0740	movk x8,#0x492, LSL #48
008a0744	cmp x10,x8
008a0748	b.hi 0x008a07fc
008a074c	sub x22,x9,x20
008a0750	mov x12,#0x9249
008a0754	asr x9,x22,#0x3
008a0758	movk x12,#0x4924, LSL #16
008a075c	movk x12,#0x2492, LSL #32
008a0760	mul x9,x9,x11
008a0764	movk x12,#0x249, LSL #48
008a0768	lsl x11,x9,#0x1
008a076c	cmp x11,x10
008a0770	csel x10,x11,x10,hi
008a0774	cmp x9,x12
008a0778	csel x9,x10,x8,cc
008a077c	cmp x9,x8
008a0780	b.hi 0x008a0800
008a0784	lsl x8,x9,#0x6
008a0788	sub x24,x8,x9, LSL #0x3
008a078c	mov x0,x24
008a0790	bl 0x00c2fed0
008a0794	ldp q0,q1,[x21]
008a0798	add x8,x0,x23
008a079c	ldr q2,[x21, #0x20]
008a07a0	ldr x9,[x21, #0x30]
008a07a4	mov x1,x20
008a07a8	mov x2,x23
008a07ac	mov x25,x0
008a07b0	add x24,x0,x24
008a07b4	stp q0,q1,[x8]
008a07b8	add x21,x8,#0x38
008a07bc	str q2,[x8, #0x20]
008a07c0	str x9,[x8, #0x30]
008a07c4	bl 0x00c2ffd0
008a07c8	stp x25,x21,[x19]
008a07cc	str x24,[x19, #0x10]
008a07d0	cbz x20,0x008a07e0
008a07d4	mov x0,x20
008a07d8	mov x1,x22
008a07dc	bl 0x00c2fe80
008a07e0	str x21,[x19, #0x8]
008a07e4	ldp x20,x19,[sp, #0x40]
008a07e8	ldr x25,[sp, #0x10]
008a07ec	ldp x22,x21,[sp, #0x30]
008a07f0	ldp x24,x23,[sp, #0x20]
008a07f4	ldp x29,x30,[sp], #0x50
008a07f8	ret
008a07fc	bl 0x008a0804
008a0800	bl 0x007fe1b8

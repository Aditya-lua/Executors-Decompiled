; FUN_0086e2d0 @ 0086e2d0
0086e2d0	stp x29,x30,[sp, #-0x50]!
0086e2d4	stp x26,x25,[sp, #0x10]
0086e2d8	stp x24,x23,[sp, #0x20]
0086e2dc	stp x22,x21,[sp, #0x30]
0086e2e0	stp x20,x19,[sp, #0x40]
0086e2e4	mov x29,sp
0086e2e8	ldp x25,x8,[x0, #0x8]
0086e2ec	mov x19,x0
0086e2f0	mov x23,x1
0086e2f4	cmp x25,x8
0086e2f8	b.cs 0x0086e308
0086e2fc	ldr x8,[x23]
0086e300	str x8,[x25], #0x8
0086e304	b 0x0086e390
0086e308	ldr x20,[x19]
0086e30c	sub x22,x25,x20
0086e310	asr x26,x22,#0x3
0086e314	add x9,x26,#0x1
0086e318	lsr x10,x9,#0x3d
0086e31c	cbnz x10,0x0086e3ac
0086e320	sub x21,x8,x20
0086e324	orr x10,xzr,#0x7ffffffffffffff8
0086e328	asr x8,x21,#0x2
0086e32c	cmp x8,x9
0086e330	csel x8,x8,x9,hi
0086e334	cmp x21,x10
0086e338	mov x9,#0x1fffffffffffffff
0086e33c	csel x8,x8,x9,cc
0086e340	lsr x9,x8,#0x3d
0086e344	cbnz x9,0x0086e3b0
0086e348	lsl x24,x8,#0x3
0086e34c	mov x0,x24
0086e350	bl 0x00c2fed0
0086e354	add x25,x0,x22
0086e358	ldr x8,[x23]
0086e35c	add x24,x0,x24
0086e360	sub x23,x25,x26, LSL #0x3
0086e364	mov x1,x20
0086e368	mov x2,x22
0086e36c	str x8,[x25], #0x8
0086e370	mov x0,x23
0086e374	bl 0x00c2ffd0
0086e378	stp x23,x25,[x19]
0086e37c	str x24,[x19, #0x10]
0086e380	cbz x20,0x0086e390
0086e384	mov x0,x20
0086e388	mov x1,x21
0086e38c	bl 0x00c2fe80
0086e390	str x25,[x19, #0x8]
0086e394	ldp x20,x19,[sp, #0x40]
0086e398	ldp x22,x21,[sp, #0x30]
0086e39c	ldp x24,x23,[sp, #0x20]
0086e3a0	ldp x26,x25,[sp, #0x10]
0086e3a4	ldp x29,x30,[sp], #0x50
0086e3a8	ret
0086e3ac	bl 0x0086f78c
0086e3b0	bl 0x007fe1b8

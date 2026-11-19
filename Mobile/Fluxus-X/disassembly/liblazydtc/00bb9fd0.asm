; FUN_00bb9fd0 @ 00bb9fd0
00bb9fd0	cbz x2,0x00bba010
00bb9fd4	add x8,x1,#0x8
00bb9fd8	cmp x2,#0x8
00bb9fdc	stp x1,x8,[x0, #0x18]
00bb9fe0	b.cc 0x00bba024
00bb9fe4	add x8,x1,x2
00bb9fe8	ldr x9,[x8, #-0x8]!
00bb9fec	str x8,[x0, #0x10]
00bb9ff0	str x9,[x0]
00bb9ff4	ldrb w8,[x8, #0x7]
00bb9ff8	cbz w8,0x00bba0d8
00bb9ffc	clz w8,w8
00bba000	mov w9,#0x8
00bba004	eor w8,w8,#0x1f
00bba008	sub w8,w9,w8
00bba00c	b 0x00bba0cc
00bba010	movi v0.2D,#0x0
00bba014	str xzr,[x0, #0x20]
00bba018	stp q0,q0,[x0]
00bba01c	mov x0,#-0x48
00bba020	ret
00bba024	str x1,[x0, #0x10]
00bba028	cmp x2,#0x4
00bba02c	ldrb w8,[x1]
00bba030	str x8,[x0]
00bba034	b.gt 0x00bba054
00bba038	cmp x2,#0x2
00bba03c	b.eq 0x00bba0a8
00bba040	cmp x2,#0x3
00bba044	b.eq 0x00bba09c
00bba048	cmp x2,#0x4
00bba04c	b.eq 0x00bba090
00bba050	b 0x00bba0b4
00bba054	cmp x2,#0x5
00bba058	b.eq 0x00bba084
00bba05c	cmp x2,#0x6
00bba060	b.eq 0x00bba078
00bba064	cmp x2,#0x7
00bba068	b.ne 0x00bba0b4
00bba06c	ldrb w9,[x1, #0x6]
00bba070	orr x8,x8,x9, LSL #0x30
00bba074	str x8,[x0]
00bba078	ldrb w9,[x1, #0x5]
00bba07c	add x8,x8,x9, LSL #0x28
00bba080	str x8,[x0]
00bba084	ldrb w9,[x1, #0x4]
00bba088	add x8,x8,x9, LSL #0x20
00bba08c	str x8,[x0]
00bba090	ldrb w9,[x1, #0x3]
00bba094	add x8,x8,x9, LSL #0x18
00bba098	str x8,[x0]
00bba09c	ldrb w9,[x1, #0x2]
00bba0a0	add x8,x8,x9, LSL #0x10
00bba0a4	str x8,[x0]
00bba0a8	ldrb w9,[x1, #0x1]
00bba0ac	add x8,x8,x9, LSL #0x8
00bba0b0	str x8,[x0]
00bba0b4	add x8,x1,x2
00bba0b8	ldurb w8,[x8, #-0x1]
00bba0bc	cbz w8,0x00bba0e4
00bba0c0	clz w8,w8
00bba0c4	sub w8,w8,w2, LSL #0x3
00bba0c8	add w8,w8,#0x29
00bba0cc	str w8,[x0, #0x8]
00bba0d0	mov x0,x2
00bba0d4	ret
00bba0d8	str wzr,[x0, #0x8]
00bba0dc	mov x0,#-0x1
00bba0e0	ret
00bba0e4	str wzr,[x0, #0x8]
00bba0e8	mov x0,#-0x14
00bba0ec	ret

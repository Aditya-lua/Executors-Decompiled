; FUN_007fe004 @ 007fe004
007fe004	stp x29,x30,[sp, #-0x50]!
007fe008	str x25,[sp, #0x10]
007fe00c	stp x24,x23,[sp, #0x20]
007fe010	stp x22,x21,[sp, #0x30]
007fe014	stp x20,x19,[sp, #0x40]
007fe018	mov x29,sp
007fe01c	ldr x8,[x0]
007fe020	mov x19,x2
007fe024	mov x20,x0
007fe028	and x21,x8,#-0x2
007fe02c	subs x9,x2,x21
007fe030	b.cs 0x007fe050
007fe034	ldr x23,[x20, #0x10]
007fe038	str x19,[x20, #0x8]
007fe03c	cbz x19,0x007fe0f0
007fe040	mov x0,x23
007fe044	mov x2,x19
007fe048	bl 0x00c2ff60
007fe04c	b 0x007fe0f0
007fe050	mov x10,#-0x9
007fe054	add x9,x9,#0x1
007fe058	sub x10,x10,x21
007fe05c	cmp x9,x10
007fe060	b.hi 0x007fe110
007fe064	ldr x10,[x20, #0x10]
007fe068	tst x8,#0x1
007fe06c	mov x8,#-0xe
007fe070	sub x9,x21,#0x1
007fe074	movk x8,#0x7fff, LSL #48
007fe078	mov x24,x1
007fe07c	csinc x22,x10,x20,ne
007fe080	cmp x9,x8
007fe084	b.hi 0x007fe0b4
007fe088	lsl x8,x9,#0x1
007fe08c	mov w10,#0x1a
007fe090	cmp x19,x8
007fe094	csel x8,x19,x8,hi
007fe098	orr x9,x8,#0x7
007fe09c	cmp x9,#0x17
007fe0a0	csinc x9,x10,x9,eq
007fe0a4	cmp x8,#0x17
007fe0a8	mov w8,#0x17
007fe0ac	csel x25,x8,x9,cc
007fe0b0	b 0x007fe0b8
007fe0b4	mov x25,#-0x9
007fe0b8	mov x0,x25
007fe0bc	bl 0x00c2fed0
007fe0c0	mov x23,x0
007fe0c4	cbz x19,0x007fe0d8
007fe0c8	mov x0,x23
007fe0cc	mov x1,x24
007fe0d0	mov x2,x19
007fe0d4	bl 0x00c2ffd0
007fe0d8	mov x0,x22
007fe0dc	mov x1,x21
007fe0e0	bl 0x00c2fe80
007fe0e4	orr x8,x25,#0x1
007fe0e8	stp x19,x23,[x20, #0x8]
007fe0ec	str x8,[x20]
007fe0f0	mov x0,x20
007fe0f4	strb wzr,[x23, x19]
007fe0f8	ldp x20,x19,[sp, #0x40]
007fe0fc	ldr x25,[sp, #0x10]
007fe100	ldp x22,x21,[sp, #0x30]
007fe104	ldp x24,x23,[sp, #0x20]
007fe108	ldp x29,x30,[sp], #0x50
007fe10c	ret
007fe110	bl 0x007fe124

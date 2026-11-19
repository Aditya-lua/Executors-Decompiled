; OPENSSL_asc2uni @ 00abcf20
00abcf20	stp x24,x23,[sp, #-0x40]!
00abcf24	stp x22,x21,[sp, #0x10]
00abcf28	stp x20,x19,[sp, #0x20]
00abcf2c	mov x20,x3
00abcf30	mov x19,x2
00abcf34	mov w22,w1
00abcf38	cmn w1,#0x1
00abcf3c	mov x21,x0
00abcf40	stp x29,x30,[sp, #0x30]
00abcf44	add x29,sp,#0x30
00abcf48	b.eq 0x00abcf54
00abcf4c	tbz w22,#0x1f,0x00abcf64
00abcf50	b 0x00abd098
00abcf54	mov x0,x21
00abcf58	bl 0x00c2ff50
00abcf5c	mov x22,x0
00abcf60	tbnz w22,#0x1f,0x00abd098
00abcf64	sbfiz x24,x22,#0x1,#0x20
00abcf68	add w23,w24,#0x2
00abcf6c	adrp x1,0x2b4000
00abcf70	sxtw x0,w23
00abcf74	add x1,x1,#0x83a
00abcf78	mov w2,#0x1b
00abcf7c	bl 0x00c32320
00abcf80	cbz x0,0x00abd068
00abcf84	cmp w22,#0x1
00abcf88	b.lt 0x00abd048
00abcf8c	cmp x24,#0x2
00abcf90	mov w8,#0x2
00abcf94	csel x8,x24,x8,gt
00abcf98	sub x8,x8,#0x1
00abcf9c	lsr x8,x8,#0x1
00abcfa0	add x9,x8,#0x1
00abcfa4	cmp x9,#0x1f
00abcfa8	mov x8,xzr
00abcfac	b.ls 0x00abd028
00abcfb0	cmp x24,#0x2
00abcfb4	mov w8,#0x2
00abcfb8	csel x8,x24,x8,gt
00abcfbc	sub x10,x8,#0x1
00abcfc0	add x10,x21,x10, LSR #0x1
00abcfc4	add x10,x10,#0x1
00abcfc8	cmp x0,x10
00abcfcc	b.cs 0x00abcfe0
00abcfd0	add x8,x0,x8
00abcfd4	cmp x8,x21
00abcfd8	mov x8,xzr
00abcfdc	b.hi 0x00abd028
00abcfe0	and x10,x9,#-0x20
00abcfe4	mov x11,xzr
00abcfe8	add x12,x0,#0x20
00abcfec	lsl x8,x10,#0x1
00abcff0	movi v0.2D,#0x0
00abcff4	and x13,x11,#0x7fffffffffffffe0
00abcff8	add x13,x21,x13
00abcffc	ldp q3,q1,[x13]
00abd000	sub x13,x12,#0x20
00abd004	add x11,x11,#0x20
00abd008	cmp x10,x11
00abd00c	mov v2.16B,v0.16B
00abd010	st2 {v2.16B,v3.16B},[x13]
00abd014	st2 {v0.16B,v1.16B},[x12]
00abd018	add x12,x12,#0x40
00abd01c	b.ne 0x00abcff4
00abd020	cmp x9,x10
00abd024	b.eq 0x00abd048
00abd028	add x9,x21,x8, LSR #0x1
00abd02c	add x10,x0,x8
00abd030	strb wzr,[x10]
00abd034	ldrb w11,[x9], #0x1
00abd038	add x8,x8,#0x2
00abd03c	cmp x8,x24
00abd040	strb w11,[x10, #0x1]
00abd044	b.lt 0x00abd02c
00abd048	orr w8,w24,#0x1
00abd04c	strb wzr,[x0, x24]
00abd050	strb wzr,[x0, w8, SXTW ]
00abd054	cbz x20,0x00abd05c
00abd058	str w23,[x20]
00abd05c	cbz x19,0x00abd09c
00abd060	str x0,[x19]
00abd064	b 0x00abd09c
00abd068	bl 0x00c342a0
00abd06c	adrp x0,0x2b4000
00abd070	adrp x2,0x2b2000
00abd074	add x0,x0,#0x83a
00abd078	add x2,x2,#0x99c
00abd07c	orr w1,wzr,#0x1c
00abd080	bl 0x00c342b0
00abd084	mov w1,#0x100
00abd088	mov w0,#0x23
00abd08c	movk w1,#0xc, LSL #16
00abd090	mov x2,xzr
00abd094	bl 0x00c342c0
00abd098	mov x0,xzr
00abd09c	ldp x29,x30,[sp, #0x30]
00abd0a0	ldp x20,x19,[sp, #0x20]
00abd0a4	ldp x22,x21,[sp, #0x10]
00abd0a8	ldp x24,x23,[sp], #0x40
00abd0ac	ret

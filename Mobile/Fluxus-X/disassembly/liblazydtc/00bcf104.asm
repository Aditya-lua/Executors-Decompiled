; FUN_00bcf104 @ 00bcf104
00bcf104	paciasp
00bcf108	sub sp,sp,#0x30
00bcf10c	stp x29,x30,[sp, #0x10]
00bcf110	stp x20,x19,[sp, #0x20]
00bcf114	add x29,sp,#0x10
00bcf118	mov x19,x0
00bcf11c	mov x20,x1
00bcf120	add x0,sp,#0x8
00bcf124	mov x1,x19
00bcf128	mov w2,wzr
00bcf12c	stur wzr,[x29, #-0x4]
00bcf130	bl 0x00c30140
00bcf134	ldrb w8,[sp, #0x8]
00bcf138	cmp w8,#0x1
00bcf13c	b.ne 0x00bcf1b0
00bcf140	ldr x8,[x19]
00bcf144	ldur x9,[x8, #-0x18]
00bcf148	mov x8,sp
00bcf14c	add x0,x19,x9
00bcf150	bl 0x00c30070
00bcf154	adrp x1,0xcb4000
00bcf158	mov x0,sp
00bcf15c	ldr x1,[x1, #0xf38]
00bcf160	bl 0x00c30080
00bcf164	ldr x8,[x19]
00bcf168	ldr x9,[x0]
00bcf16c	ldur x8,[x8, #-0x18]
00bcf170	add x3,x19,x8
00bcf174	ldr x8,[x9, #0x18]
00bcf178	ldr x1,[x3, #0x28]
00bcf17c	sub x4,x29,#0x4
00bcf180	mov x2,xzr
00bcf184	mov x5,x20
00bcf188	blr x8
00bcf18c	mov x0,sp
00bcf190	bl 0x00c30090
00bcf194	ldr x8,[x19]
00bcf198	ldur x8,[x8, #-0x18]
00bcf19c	add x0,x19,x8
00bcf1a0	ldur w8,[x29, #-0x4]
00bcf1a4	ldr w9,[x0, #0x20]
00bcf1a8	orr w1,w9,w8
00bcf1ac	bl 0x00c30130
00bcf1b0	mov x0,x19
00bcf1b4	ldp x20,x19,[sp, #0x20]
00bcf1b8	ldp x29,x30,[sp, #0x10]
00bcf1bc	add sp,sp,#0x30
00bcf1c0	autiasp
00bcf1c4	ret

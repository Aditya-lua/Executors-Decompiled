; FUN_00bcf634 @ 00bcf634
00bcf634	paciasp
00bcf638	sub sp,sp,#0x30
00bcf63c	stp x29,x30,[sp, #0x10]
00bcf640	stp x20,x19,[sp, #0x20]
00bcf644	add x29,sp,#0x10
00bcf648	mov x19,x0
00bcf64c	mov x20,x1
00bcf650	add x0,sp,#0x8
00bcf654	mov x1,x19
00bcf658	mov w2,wzr
00bcf65c	stur wzr,[x29, #-0x4]
00bcf660	bl 0x00c30140
00bcf664	ldrb w8,[sp, #0x8]
00bcf668	cmp w8,#0x1
00bcf66c	b.ne 0x00bcf6e0
00bcf670	ldr x8,[x19]
00bcf674	ldur x9,[x8, #-0x18]
00bcf678	mov x8,sp
00bcf67c	add x0,x19,x9
00bcf680	bl 0x00c30070
00bcf684	adrp x1,0xcb4000
00bcf688	mov x0,sp
00bcf68c	ldr x1,[x1, #0xf38]
00bcf690	bl 0x00c30080
00bcf694	ldr x8,[x19]
00bcf698	ldr x9,[x0]
00bcf69c	ldur x8,[x8, #-0x18]
00bcf6a0	add x3,x19,x8
00bcf6a4	ldr x8,[x9, #0x28]
00bcf6a8	ldr x1,[x3, #0x28]
00bcf6ac	sub x4,x29,#0x4
00bcf6b0	mov x2,xzr
00bcf6b4	mov x5,x20
00bcf6b8	blr x8
00bcf6bc	mov x0,sp
00bcf6c0	bl 0x00c30090
00bcf6c4	ldr x8,[x19]
00bcf6c8	ldur x8,[x8, #-0x18]
00bcf6cc	add x0,x19,x8
00bcf6d0	ldur w8,[x29, #-0x4]
00bcf6d4	ldr w9,[x0, #0x20]
00bcf6d8	orr w1,w9,w8
00bcf6dc	bl 0x00c30130
00bcf6e0	mov x0,x19
00bcf6e4	ldp x20,x19,[sp, #0x20]
00bcf6e8	ldp x29,x30,[sp, #0x10]
00bcf6ec	add sp,sp,#0x30
00bcf6f0	autiasp
00bcf6f4	ret

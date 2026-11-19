; FUN_00bd3638 @ 00bd3638
00bd3638	paciasp
00bd363c	sub sp,sp,#0x30
00bd3640	stp x29,x30,[sp, #0x10]
00bd3644	stp x20,x19,[sp, #0x20]
00bd3648	add x29,sp,#0x10
00bd364c	mov x19,x0
00bd3650	mov x20,x1
00bd3654	add x0,sp,#0x8
00bd3658	mov x1,x19
00bd365c	mov w2,wzr
00bd3660	stur wzr,[x29, #-0x4]
00bd3664	bl 0x00c44060
00bd3668	ldrb w8,[sp, #0x8]
00bd366c	cmp w8,#0x1
00bd3670	b.ne 0x00bd36e4
00bd3674	ldr x8,[x19]
00bd3678	ldur x9,[x8, #-0x18]
00bd367c	mov x8,sp
00bd3680	add x0,x19,x9
00bd3684	bl 0x00c30070
00bd3688	adrp x1,0xcb5000
00bd368c	mov x0,sp
00bd3690	ldr x1,[x1, #0xba0]
00bd3694	bl 0x00c30080
00bd3698	ldr x8,[x19]
00bd369c	ldr x9,[x0]
00bd36a0	ldur x8,[x8, #-0x18]
00bd36a4	add x3,x19,x8
00bd36a8	ldr x8,[x9, #0x30]
00bd36ac	ldr x1,[x3, #0x28]
00bd36b0	sub x4,x29,#0x4
00bd36b4	mov x2,xzr
00bd36b8	mov x5,x20
00bd36bc	blr x8
00bd36c0	mov x0,sp
00bd36c4	bl 0x00c30090
00bd36c8	ldr x8,[x19]
00bd36cc	ldur x8,[x8, #-0x18]
00bd36d0	add x0,x19,x8
00bd36d4	ldur w8,[x29, #-0x4]
00bd36d8	ldr w9,[x0, #0x20]
00bd36dc	orr w1,w9,w8
00bd36e0	bl 0x00c30130
00bd36e4	mov x0,x19
00bd36e8	ldp x20,x19,[sp, #0x20]
00bd36ec	ldp x29,x30,[sp, #0x10]
00bd36f0	add sp,sp,#0x30
00bd36f4	autiasp
00bd36f8	ret

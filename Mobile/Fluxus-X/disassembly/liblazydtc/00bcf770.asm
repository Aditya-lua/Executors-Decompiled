; FUN_00bcf770 @ 00bcf770
00bcf770	paciasp
00bcf774	sub sp,sp,#0x30
00bcf778	stp x29,x30,[sp, #0x10]
00bcf77c	stp x20,x19,[sp, #0x20]
00bcf780	add x29,sp,#0x10
00bcf784	mov x19,x0
00bcf788	mov x20,x1
00bcf78c	add x0,sp,#0x8
00bcf790	mov x1,x19
00bcf794	mov w2,wzr
00bcf798	stur wzr,[x29, #-0x4]
00bcf79c	bl 0x00c30140
00bcf7a0	ldrb w8,[sp, #0x8]
00bcf7a4	cmp w8,#0x1
00bcf7a8	b.ne 0x00bcf81c
00bcf7ac	ldr x8,[x19]
00bcf7b0	ldur x9,[x8, #-0x18]
00bcf7b4	mov x8,sp
00bcf7b8	add x0,x19,x9
00bcf7bc	bl 0x00c30070
00bcf7c0	adrp x1,0xcb4000
00bcf7c4	mov x0,sp
00bcf7c8	ldr x1,[x1, #0xf38]
00bcf7cc	bl 0x00c30080
00bcf7d0	ldr x8,[x19]
00bcf7d4	ldr x9,[x0]
00bcf7d8	ldur x8,[x8, #-0x18]
00bcf7dc	add x3,x19,x8
00bcf7e0	ldr x8,[x9, #0x48]
00bcf7e4	ldr x1,[x3, #0x28]
00bcf7e8	sub x4,x29,#0x4
00bcf7ec	mov x2,xzr
00bcf7f0	mov x5,x20
00bcf7f4	blr x8
00bcf7f8	mov x0,sp
00bcf7fc	bl 0x00c30090
00bcf800	ldr x8,[x19]
00bcf804	ldur x8,[x8, #-0x18]
00bcf808	add x0,x19,x8
00bcf80c	ldur w8,[x29, #-0x4]
00bcf810	ldr w9,[x0, #0x20]
00bcf814	orr w1,w9,w8
00bcf818	bl 0x00c30130
00bcf81c	mov x0,x19
00bcf820	ldp x20,x19,[sp, #0x20]
00bcf824	ldp x29,x30,[sp, #0x10]
00bcf828	add sp,sp,#0x30
00bcf82c	autiasp
00bcf830	ret

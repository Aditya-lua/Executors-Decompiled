; FUN_0096ac38 @ 0096ac38
0096ac38	stp x22,x21,[sp, #-0x30]!
0096ac3c	stp x20,x19,[sp, #0x10]
0096ac40	stp x29,x30,[sp, #0x20]
0096ac44	add x29,sp,#0x20
0096ac48	adrp x20,0xcc4000
0096ac4c	ldr x8,[x20, #0xd08]
0096ac50	adrp x9,0xc51000
0096ac54	add x9,x9,#0x540
0096ac58	cmp x8,x9
0096ac5c	b.ne 0x0096acb4
0096ac60	adrp x21,0xcc4000
0096ac64	ldr x8,[x21, #0xd10]
0096ac68	cbz x8,0x0096acb4
0096ac6c	adrp x0,0x2cf000
0096ac70	add x0,x0,#0x3a0
0096ac74	bl 0x00c31d90
0096ac78	mov x19,x0
0096ac7c	cbz x0,0x0096acac
0096ac80	ldr x8,[x21, #0xd10]
0096ac84	cbz x8,0x0096acac
0096ac88	adrp x9,0xcc4000
0096ac8c	add x9,x9,#0xd10
0096ac90	add x22,x9,#0x8
0096ac94	ldr x1,[x8, #0x8]
0096ac98	mov x0,x19
0096ac9c	bl 0x00c31b40
0096aca0	cbnz w0,0x0096acc8
0096aca4	ldr x8,[x22], #0x8
0096aca8	cbnz x8,0x0096ac94
0096acac	ldr x8,[x21, #0xd10]
0096acb0	b 0x0096accc
0096acb4	ldp x29,x30,[sp, #0x20]
0096acb8	ldp x20,x19,[sp, #0x10]
0096acbc	mov w0,#0x1
0096acc0	ldp x22,x21,[sp], #0x30
0096acc4	ret
0096acc8	ldur x8,[x22, #-0x8]
0096accc	adrp x9,0xcc4000
0096acd0	add x9,x9,#0x678
0096acd4	mov x0,x19
0096acd8	str x8,[x20, #0xd08]
0096acdc	ldr x9,[x9]
0096ace0	blr x9
0096ace4	ldr x8,[x20, #0xd08]
0096ace8	ldp x29,x30,[sp, #0x20]
0096acec	ldp x20,x19,[sp, #0x10]
0096acf0	ldr x0,[x8, #0x20]
0096acf4	ldp x22,x21,[sp], #0x30
0096acf8	br x0

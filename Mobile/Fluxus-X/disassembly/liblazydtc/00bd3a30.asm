; FUN_00bd3a30 @ 00bd3a30
00bd3a30	paciasp
00bd3a34	sub sp,sp,#0x30
00bd3a38	stp x29,x30,[sp, #0x10]
00bd3a3c	stp x20,x19,[sp, #0x20]
00bd3a40	add x29,sp,#0x10
00bd3a44	mov x19,x0
00bd3a48	mov x20,x1
00bd3a4c	add x0,sp,#0x8
00bd3a50	mov x1,x19
00bd3a54	mov w2,wzr
00bd3a58	stur wzr,[x29, #-0x4]
00bd3a5c	bl 0x00c44060
00bd3a60	ldrb w8,[sp, #0x8]
00bd3a64	cmp w8,#0x1
00bd3a68	b.ne 0x00bd3adc
00bd3a6c	ldr x8,[x19]
00bd3a70	ldur x9,[x8, #-0x18]
00bd3a74	mov x8,sp
00bd3a78	add x0,x19,x9
00bd3a7c	bl 0x00c30070
00bd3a80	adrp x1,0xcb5000
00bd3a84	mov x0,sp
00bd3a88	ldr x1,[x1, #0xba0]
00bd3a8c	bl 0x00c30080
00bd3a90	ldr x8,[x19]
00bd3a94	ldr x9,[x0]
00bd3a98	ldur x8,[x8, #-0x18]
00bd3a9c	add x3,x19,x8
00bd3aa0	ldr x8,[x9, #0x20]
00bd3aa4	ldr x1,[x3, #0x28]
00bd3aa8	sub x4,x29,#0x4
00bd3aac	mov x2,xzr
00bd3ab0	mov x5,x20
00bd3ab4	blr x8
00bd3ab8	mov x0,sp
00bd3abc	bl 0x00c30090
00bd3ac0	ldr x8,[x19]
00bd3ac4	ldur x8,[x8, #-0x18]
00bd3ac8	add x0,x19,x8
00bd3acc	ldur w8,[x29, #-0x4]
00bd3ad0	ldr w9,[x0, #0x20]
00bd3ad4	orr w1,w9,w8
00bd3ad8	bl 0x00c30130
00bd3adc	mov x0,x19
00bd3ae0	ldp x20,x19,[sp, #0x20]
00bd3ae4	ldp x29,x30,[sp, #0x10]
00bd3ae8	add sp,sp,#0x30
00bd3aec	autiasp
00bd3af0	ret

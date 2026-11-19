; FUN_00bd3ca8 @ 00bd3ca8
00bd3ca8	paciasp
00bd3cac	sub sp,sp,#0x30
00bd3cb0	stp x29,x30,[sp, #0x10]
00bd3cb4	stp x20,x19,[sp, #0x20]
00bd3cb8	add x29,sp,#0x10
00bd3cbc	mov x19,x0
00bd3cc0	mov x20,x1
00bd3cc4	add x0,sp,#0x8
00bd3cc8	mov x1,x19
00bd3ccc	mov w2,wzr
00bd3cd0	stur wzr,[x29, #-0x4]
00bd3cd4	bl 0x00c44060
00bd3cd8	ldrb w8,[sp, #0x8]
00bd3cdc	cmp w8,#0x1
00bd3ce0	b.ne 0x00bd3d54
00bd3ce4	ldr x8,[x19]
00bd3ce8	ldur x9,[x8, #-0x18]
00bd3cec	mov x8,sp
00bd3cf0	add x0,x19,x9
00bd3cf4	bl 0x00c30070
00bd3cf8	adrp x1,0xcb5000
00bd3cfc	mov x0,sp
00bd3d00	ldr x1,[x1, #0xba0]
00bd3d04	bl 0x00c30080
00bd3d08	ldr x8,[x19]
00bd3d0c	ldr x9,[x0]
00bd3d10	ldur x8,[x8, #-0x18]
00bd3d14	add x3,x19,x8
00bd3d18	ldr x8,[x9, #0x28]
00bd3d1c	ldr x1,[x3, #0x28]
00bd3d20	sub x4,x29,#0x4
00bd3d24	mov x2,xzr
00bd3d28	mov x5,x20
00bd3d2c	blr x8
00bd3d30	mov x0,sp
00bd3d34	bl 0x00c30090
00bd3d38	ldr x8,[x19]
00bd3d3c	ldur x8,[x8, #-0x18]
00bd3d40	add x0,x19,x8
00bd3d44	ldur w8,[x29, #-0x4]
00bd3d48	ldr w9,[x0, #0x20]
00bd3d4c	orr w1,w9,w8
00bd3d50	bl 0x00c30130
00bd3d54	mov x0,x19
00bd3d58	ldp x20,x19,[sp, #0x20]
00bd3d5c	ldp x29,x30,[sp, #0x10]
00bd3d60	add sp,sp,#0x30
00bd3d64	autiasp
00bd3d68	ret

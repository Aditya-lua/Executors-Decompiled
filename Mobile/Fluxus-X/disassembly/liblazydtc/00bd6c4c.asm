; FUN_00bd6c4c @ 00bd6c4c
00bd6c4c	paciasp
00bd6c50	sub sp,sp,#0x60
00bd6c54	stp x29,x30,[sp, #0x20]
00bd6c58	str x23,[sp, #0x30]
00bd6c5c	stp x22,x21,[sp, #0x40]
00bd6c60	stp x20,x19,[sp, #0x50]
00bd6c64	add x29,sp,#0x20
00bd6c68	mov x19,x0
00bd6c6c	str q0,[sp]
00bd6c70	add x0,sp,#0x10
00bd6c74	mov x1,x19
00bd6c78	bl 0x00c44040
00bd6c7c	ldrb w8,[sp, #0x10]
00bd6c80	cmp w8,#0x1
00bd6c84	b.ne 0x00bd6d54
00bd6c88	ldr x8,[x19]
00bd6c8c	ldur x9,[x8, #-0x18]
00bd6c90	add x8,x29,#0x18
00bd6c94	add x0,x19,x9
00bd6c98	bl 0x00c30070
00bd6c9c	adrp x1,0xcb5000
00bd6ca0	add x0,x29,#0x18
00bd6ca4	ldr x1,[x1, #0xbb0]
00bd6ca8	bl 0x00c30080
00bd6cac	mov x20,x0
00bd6cb0	add x0,x29,#0x18
00bd6cb4	bl 0x00c30090
00bd6cb8	ldr x8,[x19]
00bd6cbc	ldur x8,[x8, #-0x18]
00bd6cc0	add x2,x19,x8
00bd6cc4	ldr w3,[x2, #0x90]
00bd6cc8	ldr x21,[x2, #0x28]
00bd6ccc	cmn w3,#0x1
00bd6cd0	b.ne 0x00bd6d1c
00bd6cd4	add x8,x29,#0x18
00bd6cd8	mov x0,x2
00bd6cdc	mov x23,x2
00bd6ce0	bl 0x00c30070
00bd6ce4	adrp x1,0xcb5000
00bd6ce8	add x0,x29,#0x18
00bd6cec	ldr x1,[x1, #0xb98]
00bd6cf0	bl 0x00c30080
00bd6cf4	ldr x8,[x0]
00bd6cf8	ldr x8,[x8, #0x58]
00bd6cfc	mov w1,#0x20
00bd6d00	blr x8
00bd6d04	mov w22,w0
00bd6d08	add x0,x29,#0x18
00bd6d0c	bl 0x00c30090
00bd6d10	mov x2,x23
00bd6d14	mov w3,w22
00bd6d18	str w22,[x23, #0x90]
00bd6d1c	ldr x8,[x20]
00bd6d20	ldr x8,[x8, #0x48]
00bd6d24	ldr q0,[sp]
00bd6d28	mov x0,x20
00bd6d2c	mov x1,x21
00bd6d30	blr x8
00bd6d34	cbnz x0,0x00bd6d54
00bd6d38	ldr x8,[x19]
00bd6d3c	mov w9,#0x5
00bd6d40	ldur x8,[x8, #-0x18]
00bd6d44	add x0,x19,x8
00bd6d48	ldr w8,[x0, #0x20]
00bd6d4c	orr w1,w8,w9
00bd6d50	bl 0x00c30130
00bd6d54	add x0,sp,#0x10
00bd6d58	bl 0x00c44050
00bd6d5c	mov x0,x19
00bd6d60	ldp x20,x19,[sp, #0x50]
00bd6d64	ldr x23,[sp, #0x30]
00bd6d68	ldp x22,x21,[sp, #0x40]
00bd6d6c	ldp x29,x30,[sp, #0x20]
00bd6d70	add sp,sp,#0x60
00bd6d74	autiasp
00bd6d78	ret

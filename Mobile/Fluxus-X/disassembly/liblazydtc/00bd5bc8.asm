; FUN_00bd5bc8 @ 00bd5bc8
00bd5bc8	paciasp
00bd5bcc	sub sp,sp,#0x60
00bd5bd0	stp x29,x30,[sp, #0x20]
00bd5bd4	stp x24,x23,[sp, #0x30]
00bd5bd8	stp x22,x21,[sp, #0x40]
00bd5bdc	stp x20,x19,[sp, #0x50]
00bd5be0	add x29,sp,#0x20
00bd5be4	mov w20,w1
00bd5be8	mov x19,x0
00bd5bec	add x0,sp,#0x8
00bd5bf0	mov x1,x19
00bd5bf4	bl 0x00c44040
00bd5bf8	ldrb w8,[sp, #0x8]
00bd5bfc	cmp w8,#0x1
00bd5c00	b.ne 0x00bd5cd0
00bd5c04	ldr x8,[x19]
00bd5c08	ldur x9,[x8, #-0x18]
00bd5c0c	sub x8,x29,#0x8
00bd5c10	add x0,x19,x9
00bd5c14	bl 0x00c30070
00bd5c18	adrp x1,0xcb5000
00bd5c1c	sub x0,x29,#0x8
00bd5c20	ldr x1,[x1, #0xbb0]
00bd5c24	bl 0x00c30080
00bd5c28	mov x21,x0
00bd5c2c	sub x0,x29,#0x8
00bd5c30	bl 0x00c30090
00bd5c34	ldr x8,[x19]
00bd5c38	ldur x8,[x8, #-0x18]
00bd5c3c	add x2,x19,x8
00bd5c40	ldr w3,[x2, #0x90]
00bd5c44	ldr x22,[x2, #0x28]
00bd5c48	cmn w3,#0x1
00bd5c4c	b.ne 0x00bd5c98
00bd5c50	sub x8,x29,#0x8
00bd5c54	mov x0,x2
00bd5c58	mov x24,x2
00bd5c5c	bl 0x00c30070
00bd5c60	adrp x1,0xcb5000
00bd5c64	sub x0,x29,#0x8
00bd5c68	ldr x1,[x1, #0xb98]
00bd5c6c	bl 0x00c30080
00bd5c70	ldr x8,[x0]
00bd5c74	ldr x8,[x8, #0x58]
00bd5c78	mov w1,#0x20
00bd5c7c	blr x8
00bd5c80	mov w23,w0
00bd5c84	sub x0,x29,#0x8
00bd5c88	bl 0x00c30090
00bd5c8c	mov x2,x24
00bd5c90	mov w3,w23
00bd5c94	str w23,[x24, #0x90]
00bd5c98	ldr x8,[x21]
00bd5c9c	ldr x8,[x8, #0x18]
00bd5ca0	and w4,w20,#0x1
00bd5ca4	mov x0,x21
00bd5ca8	mov x1,x22
00bd5cac	blr x8
00bd5cb0	cbnz x0,0x00bd5cd0
00bd5cb4	ldr x8,[x19]
00bd5cb8	mov w9,#0x5
00bd5cbc	ldur x8,[x8, #-0x18]
00bd5cc0	add x0,x19,x8
00bd5cc4	ldr w8,[x0, #0x20]
00bd5cc8	orr w1,w8,w9
00bd5ccc	bl 0x00c30130
00bd5cd0	add x0,sp,#0x8
00bd5cd4	bl 0x00c44050
00bd5cd8	mov x0,x19
00bd5cdc	ldp x20,x19,[sp, #0x50]
00bd5ce0	ldp x22,x21,[sp, #0x40]
00bd5ce4	ldp x24,x23,[sp, #0x30]
00bd5ce8	ldp x29,x30,[sp, #0x20]
00bd5cec	add sp,sp,#0x60
00bd5cf0	autiasp
00bd5cf4	ret

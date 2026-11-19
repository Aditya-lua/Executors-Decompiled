; FUN_00bd6aa8 @ 00bd6aa8
00bd6aa8	paciasp
00bd6aac	sub sp,sp,#0x60
00bd6ab0	str d8,[sp, #0x20]
00bd6ab4	stp x29,x30,[sp, #0x28]
00bd6ab8	str x23,[sp, #0x38]
00bd6abc	stp x22,x21,[sp, #0x40]
00bd6ac0	stp x20,x19,[sp, #0x50]
00bd6ac4	add x29,sp,#0x28
00bd6ac8	fmov d8,d0
00bd6acc	mov x19,x0
00bd6ad0	add x0,sp,#0x8
00bd6ad4	mov x1,x19
00bd6ad8	bl 0x00c44040
00bd6adc	ldrb w8,[sp, #0x8]
00bd6ae0	cmp w8,#0x1
00bd6ae4	b.ne 0x00bd6bb4
00bd6ae8	ldr x8,[x19]
00bd6aec	ldur x9,[x8, #-0x18]
00bd6af0	sub x8,x29,#0x10
00bd6af4	add x0,x19,x9
00bd6af8	bl 0x00c30070
00bd6afc	adrp x1,0xcb5000
00bd6b00	sub x0,x29,#0x10
00bd6b04	ldr x1,[x1, #0xbb0]
00bd6b08	bl 0x00c30080
00bd6b0c	mov x20,x0
00bd6b10	sub x0,x29,#0x10
00bd6b14	bl 0x00c30090
00bd6b18	ldr x8,[x19]
00bd6b1c	ldur x8,[x8, #-0x18]
00bd6b20	add x2,x19,x8
00bd6b24	ldr w3,[x2, #0x90]
00bd6b28	ldr x21,[x2, #0x28]
00bd6b2c	cmn w3,#0x1
00bd6b30	b.ne 0x00bd6b7c
00bd6b34	sub x8,x29,#0x10
00bd6b38	mov x0,x2
00bd6b3c	mov x23,x2
00bd6b40	bl 0x00c30070
00bd6b44	adrp x1,0xcb5000
00bd6b48	sub x0,x29,#0x10
00bd6b4c	ldr x1,[x1, #0xb98]
00bd6b50	bl 0x00c30080
00bd6b54	ldr x8,[x0]
00bd6b58	ldr x8,[x8, #0x58]
00bd6b5c	mov w1,#0x20
00bd6b60	blr x8
00bd6b64	mov w22,w0
00bd6b68	sub x0,x29,#0x10
00bd6b6c	bl 0x00c30090
00bd6b70	mov x2,x23
00bd6b74	mov w3,w22
00bd6b78	str w22,[x23, #0x90]
00bd6b7c	ldr x8,[x20]
00bd6b80	ldr x8,[x8, #0x40]
00bd6b84	fmov d0,d8
00bd6b88	mov x0,x20
00bd6b8c	mov x1,x21
00bd6b90	blr x8
00bd6b94	cbnz x0,0x00bd6bb4
00bd6b98	ldr x8,[x19]
00bd6b9c	mov w9,#0x5
00bd6ba0	ldur x8,[x8, #-0x18]
00bd6ba4	add x0,x19,x8
00bd6ba8	ldr w8,[x0, #0x20]
00bd6bac	orr w1,w8,w9
00bd6bb0	bl 0x00c30130
00bd6bb4	add x0,sp,#0x8
00bd6bb8	bl 0x00c44050
00bd6bbc	mov x0,x19
00bd6bc0	ldp x20,x19,[sp, #0x50]
00bd6bc4	ldr x23,[sp, #0x38]
00bd6bc8	ldp x22,x21,[sp, #0x40]
00bd6bcc	ldr d8,[sp, #0x20]
00bd6bd0	ldp x29,x30,[sp, #0x28]
00bd6bd4	add sp,sp,#0x60
00bd6bd8	autiasp
00bd6bdc	ret

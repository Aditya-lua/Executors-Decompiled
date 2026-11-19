; FUN_00bd1b9c @ 00bd1b9c
00bd1b9c	paciasp
00bd1ba0	sub sp,sp,#0x60
00bd1ba4	stp x29,x30,[sp, #0x20]
00bd1ba8	str x23,[sp, #0x30]
00bd1bac	stp x22,x21,[sp, #0x40]
00bd1bb0	stp x20,x19,[sp, #0x50]
00bd1bb4	add x29,sp,#0x20
00bd1bb8	mov x19,x0
00bd1bbc	str q0,[sp]
00bd1bc0	add x0,sp,#0x10
00bd1bc4	mov x1,x19
00bd1bc8	bl 0x00c43fa0
00bd1bcc	ldrb w8,[sp, #0x10]
00bd1bd0	cmp w8,#0x1
00bd1bd4	b.ne 0x00bd1ca4
00bd1bd8	ldr x8,[x19]
00bd1bdc	ldur x9,[x8, #-0x18]
00bd1be0	add x8,x29,#0x18
00bd1be4	add x0,x19,x9
00bd1be8	bl 0x00c30070
00bd1bec	adrp x1,0xcb4000
00bd1bf0	add x0,x29,#0x18
00bd1bf4	ldr x1,[x1, #0xf40]
00bd1bf8	bl 0x00c30080
00bd1bfc	mov x20,x0
00bd1c00	add x0,x29,#0x18
00bd1c04	bl 0x00c30090
00bd1c08	ldr x8,[x19]
00bd1c0c	ldur x8,[x8, #-0x18]
00bd1c10	add x2,x19,x8
00bd1c14	ldr w3,[x2, #0x90]
00bd1c18	ldr x21,[x2, #0x28]
00bd1c1c	cmn w3,#0x1
00bd1c20	b.ne 0x00bd1c6c
00bd1c24	add x8,x29,#0x18
00bd1c28	mov x0,x2
00bd1c2c	mov x23,x2
00bd1c30	bl 0x00c30070
00bd1c34	adrp x1,0xcb4000
00bd1c38	add x0,x29,#0x18
00bd1c3c	ldr x1,[x1, #0x998]
00bd1c40	bl 0x00c30080
00bd1c44	ldr x8,[x0]
00bd1c48	ldr x8,[x8, #0x38]
00bd1c4c	mov w1,#0x20
00bd1c50	blr x8
00bd1c54	mov w22,w0
00bd1c58	add x0,x29,#0x18
00bd1c5c	bl 0x00c30090
00bd1c60	and w3,w22,#0xff
00bd1c64	mov x2,x23
00bd1c68	str w3,[x23, #0x90]
00bd1c6c	ldr x8,[x20]
00bd1c70	ldr x8,[x8, #0x48]
00bd1c74	ldr q0,[sp]
00bd1c78	mov x0,x20
00bd1c7c	mov x1,x21
00bd1c80	blr x8
00bd1c84	cbnz x0,0x00bd1ca4
00bd1c88	ldr x8,[x19]
00bd1c8c	mov w9,#0x5
00bd1c90	ldur x8,[x8, #-0x18]
00bd1c94	add x0,x19,x8
00bd1c98	ldr w8,[x0, #0x20]
00bd1c9c	orr w1,w8,w9
00bd1ca0	bl 0x00c30130
00bd1ca4	add x0,sp,#0x10
00bd1ca8	bl 0x00c43fb0
00bd1cac	mov x0,x19
00bd1cb0	ldp x20,x19,[sp, #0x50]
00bd1cb4	ldr x23,[sp, #0x30]
00bd1cb8	ldp x22,x21,[sp, #0x40]
00bd1cbc	ldp x29,x30,[sp, #0x20]
00bd1cc0	add sp,sp,#0x60
00bd1cc4	autiasp
00bd1cc8	ret

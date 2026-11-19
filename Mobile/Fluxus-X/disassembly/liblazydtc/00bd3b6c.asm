; FUN_00bd3b6c @ 00bd3b6c
00bd3b6c	paciasp
00bd3b70	sub sp,sp,#0x30
00bd3b74	stp x29,x30,[sp, #0x10]
00bd3b78	stp x20,x19,[sp, #0x20]
00bd3b7c	add x29,sp,#0x10
00bd3b80	mov x19,x0
00bd3b84	mov x20,x1
00bd3b88	add x0,sp,#0x8
00bd3b8c	mov x1,x19
00bd3b90	mov w2,wzr
00bd3b94	stur wzr,[x29, #-0x4]
00bd3b98	bl 0x00c44060
00bd3b9c	ldrb w8,[sp, #0x8]
00bd3ba0	cmp w8,#0x1
00bd3ba4	b.ne 0x00bd3c18
00bd3ba8	ldr x8,[x19]
00bd3bac	ldur x9,[x8, #-0x18]
00bd3bb0	mov x8,sp
00bd3bb4	add x0,x19,x9
00bd3bb8	bl 0x00c30070
00bd3bbc	adrp x1,0xcb5000
00bd3bc0	mov x0,sp
00bd3bc4	ldr x1,[x1, #0xba0]
00bd3bc8	bl 0x00c30080
00bd3bcc	ldr x8,[x19]
00bd3bd0	ldr x9,[x0]
00bd3bd4	ldur x8,[x8, #-0x18]
00bd3bd8	add x3,x19,x8
00bd3bdc	ldr x8,[x9, #0x40]
00bd3be0	ldr x1,[x3, #0x28]
00bd3be4	sub x4,x29,#0x4
00bd3be8	mov x2,xzr
00bd3bec	mov x5,x20
00bd3bf0	blr x8
00bd3bf4	mov x0,sp
00bd3bf8	bl 0x00c30090
00bd3bfc	ldr x8,[x19]
00bd3c00	ldur x8,[x8, #-0x18]
00bd3c04	add x0,x19,x8
00bd3c08	ldur w8,[x29, #-0x4]
00bd3c0c	ldr w9,[x0, #0x20]
00bd3c10	orr w1,w9,w8
00bd3c14	bl 0x00c30130
00bd3c18	mov x0,x19
00bd3c1c	ldp x20,x19,[sp, #0x20]
00bd3c20	ldp x29,x30,[sp, #0x10]
00bd3c24	add sp,sp,#0x30
00bd3c28	autiasp
00bd3c2c	ret

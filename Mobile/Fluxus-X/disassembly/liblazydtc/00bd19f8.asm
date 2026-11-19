; FUN_00bd19f8 @ 00bd19f8
00bd19f8	paciasp
00bd19fc	sub sp,sp,#0x60
00bd1a00	str d8,[sp, #0x20]
00bd1a04	stp x29,x30,[sp, #0x28]
00bd1a08	str x23,[sp, #0x38]
00bd1a0c	stp x22,x21,[sp, #0x40]
00bd1a10	stp x20,x19,[sp, #0x50]
00bd1a14	add x29,sp,#0x28
00bd1a18	fmov d8,d0
00bd1a1c	mov x19,x0
00bd1a20	add x0,sp,#0x8
00bd1a24	mov x1,x19
00bd1a28	bl 0x00c43fa0
00bd1a2c	ldrb w8,[sp, #0x8]
00bd1a30	cmp w8,#0x1
00bd1a34	b.ne 0x00bd1b04
00bd1a38	ldr x8,[x19]
00bd1a3c	ldur x9,[x8, #-0x18]
00bd1a40	sub x8,x29,#0x10
00bd1a44	add x0,x19,x9
00bd1a48	bl 0x00c30070
00bd1a4c	adrp x1,0xcb4000
00bd1a50	sub x0,x29,#0x10
00bd1a54	ldr x1,[x1, #0xf40]
00bd1a58	bl 0x00c30080
00bd1a5c	mov x20,x0
00bd1a60	sub x0,x29,#0x10
00bd1a64	bl 0x00c30090
00bd1a68	ldr x8,[x19]
00bd1a6c	ldur x8,[x8, #-0x18]
00bd1a70	add x2,x19,x8
00bd1a74	ldr w3,[x2, #0x90]
00bd1a78	ldr x21,[x2, #0x28]
00bd1a7c	cmn w3,#0x1
00bd1a80	b.ne 0x00bd1acc
00bd1a84	sub x8,x29,#0x10
00bd1a88	mov x0,x2
00bd1a8c	mov x23,x2
00bd1a90	bl 0x00c30070
00bd1a94	adrp x1,0xcb4000
00bd1a98	sub x0,x29,#0x10
00bd1a9c	ldr x1,[x1, #0x998]
00bd1aa0	bl 0x00c30080
00bd1aa4	ldr x8,[x0]
00bd1aa8	ldr x8,[x8, #0x38]
00bd1aac	mov w1,#0x20
00bd1ab0	blr x8
00bd1ab4	mov w22,w0
00bd1ab8	sub x0,x29,#0x10
00bd1abc	bl 0x00c30090
00bd1ac0	and w3,w22,#0xff
00bd1ac4	mov x2,x23
00bd1ac8	str w3,[x23, #0x90]
00bd1acc	ldr x8,[x20]
00bd1ad0	ldr x8,[x8, #0x40]
00bd1ad4	fmov d0,d8
00bd1ad8	mov x0,x20
00bd1adc	mov x1,x21
00bd1ae0	blr x8
00bd1ae4	cbnz x0,0x00bd1b04
00bd1ae8	ldr x8,[x19]
00bd1aec	mov w9,#0x5
00bd1af0	ldur x8,[x8, #-0x18]
00bd1af4	add x0,x19,x8
00bd1af8	ldr w8,[x0, #0x20]
00bd1afc	orr w1,w8,w9
00bd1b00	bl 0x00c30130
00bd1b04	add x0,sp,#0x8
00bd1b08	bl 0x00c43fb0
00bd1b0c	mov x0,x19
00bd1b10	ldp x20,x19,[sp, #0x50]
00bd1b14	ldr x23,[sp, #0x38]
00bd1b18	ldp x22,x21,[sp, #0x40]
00bd1b1c	ldr d8,[sp, #0x20]
00bd1b20	ldp x29,x30,[sp, #0x28]
00bd1b24	add sp,sp,#0x60
00bd1b28	autiasp
00bd1b2c	ret

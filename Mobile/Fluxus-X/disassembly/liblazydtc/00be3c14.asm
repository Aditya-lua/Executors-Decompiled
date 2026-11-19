; std::__ndk1::__num_get<wchar_t>::__stage2_int_prep @ 00be3c14
00be3c14	paciasp
00be3c18	sub sp,sp,#0x60
00be3c1c	stp x29,x30,[sp, #0x20]
00be3c20	str x23,[sp, #0x30]
00be3c24	stp x22,x21,[sp, #0x40]
00be3c28	stp x20,x19,[sp, #0x50]
00be3c2c	add x29,sp,#0x20
00be3c30	mov x19,x8
00be3c34	add x8,sp,#0x8
00be3c38	mov x20,x2
00be3c3c	mov x21,x1
00be3c40	bl 0x00c30070
00be3c44	adrp x23,0xcb5000
00be3c48	ldr x23,[x23, #0xb98]
00be3c4c	ldr x22,[sp, #0x8]
00be3c50	str x23,[sp, #0x10]
00be3c54	ldar x8,[x23]
00be3c58	cmn x8,#0x1
00be3c5c	b.eq 0x00be3c88
00be3c60	add x8,sp,#0x10
00be3c64	add x9,x29,#0x18
00be3c68	str x8,[x29, #0x18]
00be3c6c	stur x9,[x29, #-0x8]
00be3c70	adrp x0,0xcb5000
00be3c74	nop
00be3c78	adr x2,0xc0bab0
00be3c7c	ldr x0,[x0, #0xb98]
00be3c80	sub x1,x29,#0x8
00be3c84	bl 0x00c305d0
00be3c88	ldp x8,x10,[x22, #0x10]
00be3c8c	ldrsw x9,[x23, #0x8]
00be3c90	sub x9,x9,#0x1
00be3c94	sub x10,x10,x8
00be3c98	cmp x9,x10, ASR #0x3
00be3c9c	b.cs 0x00be3d74
00be3ca0	ldr x0,[x8, x9, LSL #0x3]
00be3ca4	cbz x0,0x00be3d74
00be3ca8	ldr x8,[x0]
00be3cac	ldr x8,[x8, #0x60]
00be3cb0	adrp x1,0xcb5000
00be3cb4	mov x3,x21
00be3cb8	ldr x1,[x1, #0xc08]
00be3cbc	add x2,x1,#0x1a
00be3cc0	blr x8
00be3cc4	adrp x22,0xcb5000
00be3cc8	ldr x22,[x22, #0xc10]
00be3ccc	ldr x21,[sp, #0x8]
00be3cd0	str x22,[sp, #0x10]
00be3cd4	ldar x8,[x22]
00be3cd8	cmn x8,#0x1
00be3cdc	b.eq 0x00be3d08
00be3ce0	add x8,sp,#0x10
00be3ce4	add x9,x29,#0x18
00be3ce8	str x8,[x29, #0x18]
00be3cec	stur x9,[x29, #-0x8]
00be3cf0	adrp x0,0xcb5000
00be3cf4	nop
00be3cf8	adr x2,0xc0bab0
00be3cfc	ldr x0,[x0, #0xc10]
00be3d00	sub x1,x29,#0x8
00be3d04	bl 0x00c305d0
00be3d08	ldp x8,x10,[x21, #0x10]
00be3d0c	ldrsw x9,[x22, #0x8]
00be3d10	sub x9,x9,#0x1
00be3d14	sub x10,x10,x8
00be3d18	cmp x9,x10, ASR #0x3
00be3d1c	b.cs 0x00be3d78
00be3d20	ldr x21,[x8, x9, LSL #0x3]
00be3d24	cbz x21,0x00be3d78
00be3d28	ldr x8,[x21]
00be3d2c	ldr x8,[x8, #0x20]
00be3d30	mov x0,x21
00be3d34	blr x8
00be3d38	str w0,[x20]
00be3d3c	ldr x8,[x21]
00be3d40	ldr x9,[x8, #0x28]
00be3d44	mov x8,x19
00be3d48	mov x0,x21
00be3d4c	blr x9
00be3d50	add x0,sp,#0x8
00be3d54	bl 0x00c30090
00be3d58	ldp x20,x19,[sp, #0x50]
00be3d5c	ldr x23,[sp, #0x30]
00be3d60	ldp x22,x21,[sp, #0x40]
00be3d64	ldp x29,x30,[sp, #0x20]
00be3d68	add sp,sp,#0x60
00be3d6c	autiasp
00be3d70	ret
00be3d74	bl 0x00bd8968
00be3d78	bl 0x00bd8968

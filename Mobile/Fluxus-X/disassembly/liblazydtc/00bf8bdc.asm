; FUN_00bf8bdc @ 00bf8bdc
00bf8bdc	paciasp
00bf8be0	sub sp,sp,#0x50
00bf8be4	stp x29,x30,[sp, #0x20]
00bf8be8	stp x22,x21,[sp, #0x30]
00bf8bec	stp x20,x19,[sp, #0x40]
00bf8bf0	add x29,sp,#0x20
00bf8bf4	adrp x20,0xcb5000
00bf8bf8	mov x19,x1
00bf8bfc	mov x21,x0
00bf8c00	ldr x20,[x20, #0xc90]
00bf8c04	str x20,[sp, #0x8]
00bf8c08	ldar x8,[x20]
00bf8c0c	cmn x8,#0x1
00bf8c10	b.eq 0x00bf8c3c
00bf8c14	add x8,sp,#0x8
00bf8c18	sub x9,x29,#0x8
00bf8c1c	adrp x0,0xcb5000
00bf8c20	stur x8,[x29, #-0x8]
00bf8c24	nop
00bf8c28	adr x2,0xc0bab0
00bf8c2c	str x9,[sp, #0x10]
00bf8c30	add x1,sp,#0x10
00bf8c34	ldr x0,[x0, #0xc90]
00bf8c38	bl 0x00c305d0
00bf8c3c	ldp x8,x10,[x19, #0x10]
00bf8c40	ldrsw x9,[x20, #0x8]
00bf8c44	sub x22,x9,#0x1
00bf8c48	sub x9,x10,x8
00bf8c4c	cmp x22,x9, ASR #0x3
00bf8c50	b.cs 0x00bf8cf0
00bf8c54	ldr x19,[x8, x22, LSL #0x3]
00bf8c58	cbz x19,0x00bf8cf0
00bf8c5c	add x1,x19,#0x8
00bf8c60	mov w0,#0x1
00bf8c64	bl 0x00c2bce0
00bf8c68	mov x20,x21
00bf8c6c	ldp x8,x9,[x20, #0x10]!
00bf8c70	sub x9,x9,x8
00bf8c74	asr x10,x9,#0x3
00bf8c78	cmp x10,x22
00bf8c7c	b.hi 0x00bf8ca8
00bf8c80	add x9,x22,#0x1
00bf8c84	subs x1,x9,x10
00bf8c88	b.ls 0x00bf8c9c
00bf8c8c	mov x0,x20
00bf8c90	bl 0x00c0b6e4
00bf8c94	ldr x8,[x20]
00bf8c98	b 0x00bf8ca8
00bf8c9c	b.cs 0x00bf8ca8
00bf8ca0	add x9,x8,x9, LSL #0x3
00bf8ca4	str x9,[x21, #0x18]
00bf8ca8	ldr x21,[x8, x22, LSL #0x3]
00bf8cac	cbz x21,0x00bf8cd0
00bf8cb0	add x1,x21,#0x8
00bf8cb4	mov x0,#-0x1
00bf8cb8	bl 0x00c2bd10
00bf8cbc	cbnz x0,0x00bf8cd0
00bf8cc0	ldr x8,[x21]
00bf8cc4	mov x0,x21
00bf8cc8	ldr x8,[x8, #0x10]
00bf8ccc	blr x8
00bf8cd0	ldr x8,[x20]
00bf8cd4	str x19,[x8, x22, LSL #0x3]
00bf8cd8	ldp x20,x19,[sp, #0x40]
00bf8cdc	ldp x22,x21,[sp, #0x30]
00bf8ce0	ldp x29,x30,[sp, #0x20]
00bf8ce4	add sp,sp,#0x50
00bf8ce8	autiasp
00bf8cec	ret
00bf8cf0	bl 0x00bd8968

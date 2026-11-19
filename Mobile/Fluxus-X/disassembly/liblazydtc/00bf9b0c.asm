; FUN_00bf9b0c @ 00bf9b0c
00bf9b0c	paciasp
00bf9b10	sub sp,sp,#0x50
00bf9b14	stp x29,x30,[sp, #0x20]
00bf9b18	stp x22,x21,[sp, #0x30]
00bf9b1c	stp x20,x19,[sp, #0x40]
00bf9b20	add x29,sp,#0x20
00bf9b24	adrp x20,0xcb5000
00bf9b28	mov x19,x1
00bf9b2c	mov x21,x0
00bf9b30	ldr x20,[x20, #0xc10]
00bf9b34	str x20,[sp, #0x8]
00bf9b38	ldar x8,[x20]
00bf9b3c	cmn x8,#0x1
00bf9b40	b.eq 0x00bf9b6c
00bf9b44	add x8,sp,#0x8
00bf9b48	sub x9,x29,#0x8
00bf9b4c	adrp x0,0xcb5000
00bf9b50	stur x8,[x29, #-0x8]
00bf9b54	nop
00bf9b58	adr x2,0xc0bab0
00bf9b5c	str x9,[sp, #0x10]
00bf9b60	add x1,sp,#0x10
00bf9b64	ldr x0,[x0, #0xc10]
00bf9b68	bl 0x00c305d0
00bf9b6c	ldp x8,x10,[x19, #0x10]
00bf9b70	ldrsw x9,[x20, #0x8]
00bf9b74	sub x22,x9,#0x1
00bf9b78	sub x9,x10,x8
00bf9b7c	cmp x22,x9, ASR #0x3
00bf9b80	b.cs 0x00bf9c20
00bf9b84	ldr x19,[x8, x22, LSL #0x3]
00bf9b88	cbz x19,0x00bf9c20
00bf9b8c	add x1,x19,#0x8
00bf9b90	mov w0,#0x1
00bf9b94	bl 0x00c2bce0
00bf9b98	mov x20,x21
00bf9b9c	ldp x8,x9,[x20, #0x10]!
00bf9ba0	sub x9,x9,x8
00bf9ba4	asr x10,x9,#0x3
00bf9ba8	cmp x10,x22
00bf9bac	b.hi 0x00bf9bd8
00bf9bb0	add x9,x22,#0x1
00bf9bb4	subs x1,x9,x10
00bf9bb8	b.ls 0x00bf9bcc
00bf9bbc	mov x0,x20
00bf9bc0	bl 0x00c0b6e4
00bf9bc4	ldr x8,[x20]
00bf9bc8	b 0x00bf9bd8
00bf9bcc	b.cs 0x00bf9bd8
00bf9bd0	add x9,x8,x9, LSL #0x3
00bf9bd4	str x9,[x21, #0x18]
00bf9bd8	ldr x21,[x8, x22, LSL #0x3]
00bf9bdc	cbz x21,0x00bf9c00
00bf9be0	add x1,x21,#0x8
00bf9be4	mov x0,#-0x1
00bf9be8	bl 0x00c2bd10
00bf9bec	cbnz x0,0x00bf9c00
00bf9bf0	ldr x8,[x21]
00bf9bf4	mov x0,x21
00bf9bf8	ldr x8,[x8, #0x10]
00bf9bfc	blr x8
00bf9c00	ldr x8,[x20]
00bf9c04	str x19,[x8, x22, LSL #0x3]
00bf9c08	ldp x20,x19,[sp, #0x40]
00bf9c0c	ldp x22,x21,[sp, #0x30]
00bf9c10	ldp x29,x30,[sp, #0x20]
00bf9c14	add sp,sp,#0x50
00bf9c18	autiasp
00bf9c1c	ret
00bf9c20	bl 0x00bd8968

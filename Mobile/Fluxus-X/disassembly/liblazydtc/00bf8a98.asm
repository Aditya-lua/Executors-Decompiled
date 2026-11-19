; FUN_00bf8a98 @ 00bf8a98
00bf8a98	paciasp
00bf8a9c	sub sp,sp,#0x50
00bf8aa0	stp x29,x30,[sp, #0x20]
00bf8aa4	stp x22,x21,[sp, #0x30]
00bf8aa8	stp x20,x19,[sp, #0x40]
00bf8aac	add x29,sp,#0x20
00bf8ab0	adrp x20,0xcb5000
00bf8ab4	mov x19,x1
00bf8ab8	mov x21,x0
00bf8abc	ldr x20,[x20, #0xc80]
00bf8ac0	str x20,[sp, #0x8]
00bf8ac4	ldar x8,[x20]
00bf8ac8	cmn x8,#0x1
00bf8acc	b.eq 0x00bf8af8
00bf8ad0	add x8,sp,#0x8
00bf8ad4	sub x9,x29,#0x8
00bf8ad8	adrp x0,0xcb5000
00bf8adc	stur x8,[x29, #-0x8]
00bf8ae0	nop
00bf8ae4	adr x2,0xc0bab0
00bf8ae8	str x9,[sp, #0x10]
00bf8aec	add x1,sp,#0x10
00bf8af0	ldr x0,[x0, #0xc80]
00bf8af4	bl 0x00c305d0
00bf8af8	ldp x8,x10,[x19, #0x10]
00bf8afc	ldrsw x9,[x20, #0x8]
00bf8b00	sub x22,x9,#0x1
00bf8b04	sub x9,x10,x8
00bf8b08	cmp x22,x9, ASR #0x3
00bf8b0c	b.cs 0x00bf8bac
00bf8b10	ldr x19,[x8, x22, LSL #0x3]
00bf8b14	cbz x19,0x00bf8bac
00bf8b18	add x1,x19,#0x8
00bf8b1c	mov w0,#0x1
00bf8b20	bl 0x00c2bce0
00bf8b24	mov x20,x21
00bf8b28	ldp x8,x9,[x20, #0x10]!
00bf8b2c	sub x9,x9,x8
00bf8b30	asr x10,x9,#0x3
00bf8b34	cmp x10,x22
00bf8b38	b.hi 0x00bf8b64
00bf8b3c	add x9,x22,#0x1
00bf8b40	subs x1,x9,x10
00bf8b44	b.ls 0x00bf8b58
00bf8b48	mov x0,x20
00bf8b4c	bl 0x00c0b6e4
00bf8b50	ldr x8,[x20]
00bf8b54	b 0x00bf8b64
00bf8b58	b.cs 0x00bf8b64
00bf8b5c	add x9,x8,x9, LSL #0x3
00bf8b60	str x9,[x21, #0x18]
00bf8b64	ldr x21,[x8, x22, LSL #0x3]
00bf8b68	cbz x21,0x00bf8b8c
00bf8b6c	add x1,x21,#0x8
00bf8b70	mov x0,#-0x1
00bf8b74	bl 0x00c2bd10
00bf8b78	cbnz x0,0x00bf8b8c
00bf8b7c	ldr x8,[x21]
00bf8b80	mov x0,x21
00bf8b84	ldr x8,[x8, #0x10]
00bf8b88	blr x8
00bf8b8c	ldr x8,[x20]
00bf8b90	str x19,[x8, x22, LSL #0x3]
00bf8b94	ldp x20,x19,[sp, #0x40]
00bf8b98	ldp x22,x21,[sp, #0x30]
00bf8b9c	ldp x29,x30,[sp, #0x20]
00bf8ba0	add sp,sp,#0x50
00bf8ba4	autiasp
00bf8ba8	ret
00bf8bac	bl 0x00bd8968

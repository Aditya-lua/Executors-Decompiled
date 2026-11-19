; FUN_00bf6a70 @ 00bf6a70
00bf6a70	paciasp
00bf6a74	sub sp,sp,#0x50
00bf6a78	stp x29,x30,[sp, #0x20]
00bf6a7c	stp x22,x21,[sp, #0x30]
00bf6a80	stp x20,x19,[sp, #0x40]
00bf6a84	add x29,sp,#0x20
00bf6a88	adrp x20,0xcb5000
00bf6a8c	mov x19,x1
00bf6a90	mov x21,x0
00bf6a94	ldr x20,[x20, #0xc20]
00bf6a98	str x20,[sp, #0x8]
00bf6a9c	ldar x8,[x20]
00bf6aa0	cmn x8,#0x1
00bf6aa4	b.eq 0x00bf6ad0
00bf6aa8	add x8,sp,#0x8
00bf6aac	sub x9,x29,#0x8
00bf6ab0	adrp x0,0xcb5000
00bf6ab4	stur x8,[x29, #-0x8]
00bf6ab8	nop
00bf6abc	adr x2,0xc0bab0
00bf6ac0	str x9,[sp, #0x10]
00bf6ac4	add x1,sp,#0x10
00bf6ac8	ldr x0,[x0, #0xc20]
00bf6acc	bl 0x00c305d0
00bf6ad0	ldrsw x8,[x20, #0x8]
00bf6ad4	add x1,x19,#0x8
00bf6ad8	mov w0,#0x1
00bf6adc	sub x22,x8,#0x1
00bf6ae0	bl 0x00c2bce0
00bf6ae4	mov x20,x21
00bf6ae8	ldp x8,x9,[x20, #0x10]!
00bf6aec	sub x9,x9,x8
00bf6af0	asr x10,x9,#0x3
00bf6af4	cmp x10,x22
00bf6af8	b.hi 0x00bf6b24
00bf6afc	add x9,x22,#0x1
00bf6b00	subs x1,x9,x10
00bf6b04	b.ls 0x00bf6b18
00bf6b08	mov x0,x20
00bf6b0c	bl 0x00c0b6e4
00bf6b10	ldr x8,[x20]
00bf6b14	b 0x00bf6b24
00bf6b18	b.cs 0x00bf6b24
00bf6b1c	add x9,x8,x9, LSL #0x3
00bf6b20	str x9,[x21, #0x18]
00bf6b24	ldr x21,[x8, x22, LSL #0x3]
00bf6b28	cbz x21,0x00bf6b4c
00bf6b2c	add x1,x21,#0x8
00bf6b30	mov x0,#-0x1
00bf6b34	bl 0x00c2bd10
00bf6b38	cbnz x0,0x00bf6b4c
00bf6b3c	ldr x8,[x21]
00bf6b40	mov x0,x21
00bf6b44	ldr x8,[x8, #0x10]
00bf6b48	blr x8
00bf6b4c	ldr x8,[x20]
00bf6b50	str x19,[x8, x22, LSL #0x3]
00bf6b54	ldp x20,x19,[sp, #0x40]
00bf6b58	ldp x22,x21,[sp, #0x30]
00bf6b5c	ldp x29,x30,[sp, #0x20]
00bf6b60	add sp,sp,#0x50
00bf6b64	autiasp
00bf6b68	ret

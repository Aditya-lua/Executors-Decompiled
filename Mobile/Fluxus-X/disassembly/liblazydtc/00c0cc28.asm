; FUN_00c0cc28 @ 00c0cc28
00c0cc28	paciasp
00c0cc2c	sub sp,sp,#0x50
00c0cc30	stp x29,x30,[sp, #0x20]
00c0cc34	stp x22,x21,[sp, #0x30]
00c0cc38	stp x20,x19,[sp, #0x40]
00c0cc3c	add x29,sp,#0x20
00c0cc40	mov x19,x8
00c0cc44	mov x8,sp
00c0cc48	mov x20,x1
00c0cc4c	bl 0x00c30070
00c0cc50	adrp x22,0xcb5000
00c0cc54	ldr x22,[x22, #0xc10]
00c0cc58	ldr x21,[sp]
00c0cc5c	str x22,[sp, #0x8]
00c0cc60	ldar x8,[x22]
00c0cc64	cmn x8,#0x1
00c0cc68	b.eq 0x00c0cc94
00c0cc6c	add x8,sp,#0x8
00c0cc70	sub x9,x29,#0x8
00c0cc74	stur x8,[x29, #-0x8]
00c0cc78	str x9,[sp, #0x10]
00c0cc7c	adrp x0,0xcb5000
00c0cc80	nop
00c0cc84	adr x2,0xc0bab0
00c0cc88	ldr x0,[x0, #0xc10]
00c0cc8c	add x1,sp,#0x10
00c0cc90	bl 0x00c305d0
00c0cc94	ldp x8,x10,[x21, #0x10]
00c0cc98	ldrsw x9,[x22, #0x8]
00c0cc9c	sub x9,x9,#0x1
00c0cca0	sub x10,x10,x8
00c0cca4	cmp x9,x10, ASR #0x3
00c0cca8	b.cs 0x00c0ccfc
00c0ccac	ldr x21,[x8, x9, LSL #0x3]
00c0ccb0	cbz x21,0x00c0ccfc
00c0ccb4	ldr x8,[x21]
00c0ccb8	ldr x8,[x8, #0x20]
00c0ccbc	mov x0,x21
00c0ccc0	blr x8
00c0ccc4	ldr x8,[x21]
00c0ccc8	str w0,[x20]
00c0cccc	ldr x9,[x8, #0x28]
00c0ccd0	mov x8,x19
00c0ccd4	mov x0,x21
00c0ccd8	blr x9
00c0ccdc	mov x0,sp
00c0cce0	bl 0x00c30090
00c0cce4	ldp x20,x19,[sp, #0x40]
00c0cce8	ldp x22,x21,[sp, #0x30]
00c0ccec	ldp x29,x30,[sp, #0x20]
00c0ccf0	add sp,sp,#0x50
00c0ccf4	autiasp
00c0ccf8	ret
00c0ccfc	bl 0x00bd8968

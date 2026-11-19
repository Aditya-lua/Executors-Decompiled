; FUN_00c0cb44 @ 00c0cb44
00c0cb44	paciasp
00c0cb48	sub sp,sp,#0x50
00c0cb4c	stp x29,x30,[sp, #0x20]
00c0cb50	str x21,[sp, #0x30]
00c0cb54	stp x20,x19,[sp, #0x40]
00c0cb58	add x29,sp,#0x20
00c0cb5c	mov x0,x1
00c0cb60	add x8,sp,#0x8
00c0cb64	mov x19,x2
00c0cb68	bl 0x00c30070
00c0cb6c	adrp x21,0xcb5000
00c0cb70	ldr x21,[x21, #0xb98]
00c0cb74	ldr x20,[sp, #0x8]
00c0cb78	str x21,[sp, #0x10]
00c0cb7c	ldar x8,[x21]
00c0cb80	cmn x8,#0x1
00c0cb84	b.eq 0x00c0cbb0
00c0cb88	add x8,sp,#0x10
00c0cb8c	add x9,x29,#0x18
00c0cb90	str x8,[x29, #0x18]
00c0cb94	stur x9,[x29, #-0x8]
00c0cb98	adrp x0,0xcb5000
00c0cb9c	nop
00c0cba0	adr x2,0xc0bab0
00c0cba4	ldr x0,[x0, #0xb98]
00c0cba8	sub x1,x29,#0x8
00c0cbac	bl 0x00c305d0
00c0cbb0	ldp x8,x10,[x20, #0x10]
00c0cbb4	ldrsw x9,[x21, #0x8]
00c0cbb8	sub x9,x9,#0x1
00c0cbbc	sub x10,x10,x8
00c0cbc0	cmp x9,x10, ASR #0x3
00c0cbc4	b.cs 0x00c0cc10
00c0cbc8	ldr x0,[x8, x9, LSL #0x3]
00c0cbcc	cbz x0,0x00c0cc10
00c0cbd0	ldr x8,[x0]
00c0cbd4	ldr x8,[x8, #0x60]
00c0cbd8	adrp x1,0xcb5000
00c0cbdc	mov x3,x19
00c0cbe0	ldr x1,[x1, #0xc08]
00c0cbe4	add x2,x1,#0x1a
00c0cbe8	blr x8
00c0cbec	add x0,sp,#0x8
00c0cbf0	bl 0x00c30090
00c0cbf4	mov x0,x19
00c0cbf8	ldp x20,x19,[sp, #0x40]
00c0cbfc	ldr x21,[sp, #0x30]
00c0cc00	ldp x29,x30,[sp, #0x20]
00c0cc04	add sp,sp,#0x50
00c0cc08	autiasp
00c0cc0c	ret
00c0cc10	bl 0x00bd8968

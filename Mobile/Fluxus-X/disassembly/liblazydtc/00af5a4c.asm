; X509V3_EXT_d2i @ 00af5a4c
00af5a4c	sub sp,sp,#0x30
00af5a50	stp x20,x19,[sp, #0x10]
00af5a54	stp x29,x30,[sp, #0x20]
00af5a58	add x29,sp,#0x20
00af5a5c	mov x20,x0
00af5a60	bl 0x00af57ec
00af5a64	cbz x0,0x00af5ac4
00af5a68	mov x19,x0
00af5a6c	mov x0,x20
00af5a70	bl 0x00c32b60
00af5a74	mov x20,x0
00af5a78	bl 0x00c32130
00af5a7c	str x0,[sp, #0x8]
00af5a80	mov x0,x20
00af5a84	bl 0x00c32140
00af5a88	ldr x8,[x19, #0x8]
00af5a8c	cbz x8,0x00af5ab0
00af5a90	sxtw x19,w0
00af5a94	blr x8
00af5a98	mov x3,x0
00af5a9c	add x1,sp,#0x8
00af5aa0	mov x0,xzr
00af5aa4	mov x2,x19
00af5aa8	bl 0x00c36150
00af5aac	b 0x00af5ac4
00af5ab0	ldr x8,[x19, #0x20]
00af5ab4	sxtw x2,w0
00af5ab8	add x1,sp,#0x8
00af5abc	mov x0,xzr
00af5ac0	blr x8
00af5ac4	ldp x29,x30,[sp, #0x20]
00af5ac8	ldp x20,x19,[sp, #0x10]
00af5acc	add sp,sp,#0x30
00af5ad0	ret

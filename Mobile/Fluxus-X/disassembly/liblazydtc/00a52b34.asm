; FUN_00a52b34 @ 00a52b34
00a52b34	sub sp,sp,#0x50
00a52b38	stp x24,x23,[sp, #0x10]
00a52b3c	stp x22,x21,[sp, #0x20]
00a52b40	stp x20,x19,[sp, #0x30]
00a52b44	stp x29,x30,[sp, #0x40]
00a52b48	ldr x8,[x3, #0x8]
00a52b4c	add x29,sp,#0x40
00a52b50	cbnz x8,0x00a52bec
00a52b54	mov w21,w0
00a52b58	mov x0,x1
00a52b5c	mov x19,x3
00a52b60	mov x20,x1
00a52b64	bl 0x00c325e0
00a52b68	cmp w0,#0x1
00a52b6c	b.lt 0x00a52bec
00a52b70	mov w22,wzr
00a52b74	mov x0,x20
00a52b78	mov w1,w22
00a52b7c	bl 0x00c32610
00a52b80	ldr x8,[x0, #0x50]
00a52b84	add x1,sp,#0x8
00a52b88	mov x2,xzr
00a52b8c	mov w3,w21
00a52b90	mov x23,x0
00a52b94	blr x8
00a52b98	ldr x8,[sp, #0x8]
00a52b9c	cbz x8,0x00a52bcc
00a52ba0	ldr x24,[x8, #0x10]
00a52ba4	mov x0,x24
00a52ba8	bl 0x00c2ff50
00a52bac	ldr w8,[x19, #0x18]
00a52bb0	cmp w8,w0
00a52bb4	b.ne 0x00a52bcc
00a52bb8	ldr x1,[x19, #0x10]
00a52bbc	sxtw x2,w0
00a52bc0	mov x0,x24
00a52bc4	bl 0x00c35ef0
00a52bc8	cbz w0,0x00a52be4
00a52bcc	mov x0,x20
00a52bd0	add w22,w22,#0x1
00a52bd4	bl 0x00c325e0
00a52bd8	cmp w22,w0
00a52bdc	b.lt 0x00a52b74
00a52be0	b 0x00a52bec
00a52be4	ldr x8,[sp, #0x8]
00a52be8	stp x23,x8,[x19]
00a52bec	ldp x29,x30,[sp, #0x40]
00a52bf0	ldp x20,x19,[sp, #0x30]
00a52bf4	ldp x22,x21,[sp, #0x20]
00a52bf8	ldp x24,x23,[sp, #0x10]
00a52bfc	add sp,sp,#0x50
00a52c00	ret

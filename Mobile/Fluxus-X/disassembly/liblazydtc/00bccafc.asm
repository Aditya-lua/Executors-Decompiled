; std::__ndk1::shared_future<void>::operator= @ 00bccafc
00bccafc	paciasp
00bccb00	stp x29,x30,[sp, #-0x30]!
00bccb04	str x21,[sp, #0x10]
00bccb08	stp x20,x19,[sp, #0x20]
00bccb0c	mov x29,sp
00bccb10	ldr x8,[x1]
00bccb14	mov x20,x1
00bccb18	mov x19,x0
00bccb1c	cbz x8,0x00bccb2c
00bccb20	add x1,x8,#0x8
00bccb24	mov w0,#0x1
00bccb28	bl 0x00c2bce0
00bccb2c	ldr x21,[x19]
00bccb30	cbz x21,0x00bccb54
00bccb34	add x1,x21,#0x8
00bccb38	mov x0,#-0x1
00bccb3c	bl 0x00c2bd10
00bccb40	cbnz x0,0x00bccb54
00bccb44	ldr x8,[x21]
00bccb48	mov x0,x21
00bccb4c	ldr x8,[x8, #0x10]
00bccb50	blr x8
00bccb54	ldr x8,[x20]
00bccb58	mov x0,x19
00bccb5c	str x8,[x19]
00bccb60	ldp x20,x19,[sp, #0x20]
00bccb64	ldr x21,[sp, #0x10]
00bccb68	ldp x29,x30,[sp], #0x30
00bccb6c	autiasp
00bccb70	ret

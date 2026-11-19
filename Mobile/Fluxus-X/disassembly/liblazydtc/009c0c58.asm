; tls1_new @ 009c0c58
009c0c58	str x19,[sp, #-0x20]!
009c0c5c	stp x29,x30,[sp, #0x10]
009c0c60	add x29,sp,#0x10
009c0c64	mov x19,x0
009c0c68	bl 0x00c34490
009c0c6c	cbz w0,0x009c0c88
009c0c70	ldr x8,[x19, #0x8]
009c0c74	mov x0,x19
009c0c78	ldr x8,[x8, #0x18]
009c0c7c	blr x8
009c0c80	cmp w0,#0x0
009c0c84	cset w0,ne
009c0c88	ldp x29,x30,[sp, #0x10]
009c0c8c	ldr x19,[sp], #0x20
009c0c90	ret

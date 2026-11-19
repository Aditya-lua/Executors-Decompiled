; EVP_RAND_CTX_get_params @ 00ac9a30
00ac9a30	stp x20,x19,[sp, #-0x20]!
00ac9a34	stp x29,x30,[sp, #0x10]
00ac9a38	ldr x8,[x0]
00ac9a3c	mov x19,x0
00ac9a40	mov x20,x1
00ac9a44	add x29,sp,#0x10
00ac9a48	ldr x9,[x8, #0x78]
00ac9a4c	cbz x9,0x00ac9a60
00ac9a50	ldr x0,[x19, #0x8]
00ac9a54	blr x9
00ac9a58	cbz w0,0x00ac9a8c
00ac9a5c	ldr x8,[x19]
00ac9a60	ldr x8,[x8, #0xa8]
00ac9a64	ldr x0,[x19, #0x8]
00ac9a68	mov x1,x20
00ac9a6c	blr x8
00ac9a70	ldr x8,[x19]
00ac9a74	mov w20,w0
00ac9a78	ldr x8,[x8, #0x80]
00ac9a7c	cbz x8,0x00ac9a90
00ac9a80	ldr x0,[x19, #0x8]
00ac9a84	blr x8
00ac9a88	b 0x00ac9a90
00ac9a8c	mov w20,wzr
00ac9a90	ldp x29,x30,[sp, #0x10]
00ac9a94	mov w0,w20
00ac9a98	ldp x20,x19,[sp], #0x20
00ac9a9c	ret

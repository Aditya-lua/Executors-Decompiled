; SSL_get_cipher_list @ 009b5a78
009b5a78	stp x20,x19,[sp, #-0x20]!
009b5a7c	stp x29,x30,[sp, #0x10]
009b5a80	add x29,sp,#0x10
009b5a84	cbz x0,0x009b5ad4
009b5a88	ldr x20,[x0, #0x528]
009b5a8c	mov w19,w1
009b5a90	cbz x20,0x009b5ac0
009b5a94	mov x0,x20
009b5a98	bl 0x00c325e0
009b5a9c	cmp w0,w19
009b5aa0	mov x0,xzr
009b5aa4	b.le 0x009b5ad4
009b5aa8	mov x0,x20
009b5aac	mov w1,w19
009b5ab0	bl 0x00c32610
009b5ab4	cbz x0,0x009b5ad4
009b5ab8	ldr x0,[x0, #0x8]
009b5abc	b 0x009b5ad4
009b5ac0	ldr x8,[x0, #0x9a8]
009b5ac4	cbz x8,0x009b5ad0
009b5ac8	ldr x20,[x8, #0x10]
009b5acc	cbnz x20,0x009b5a94
009b5ad0	mov x0,xzr
009b5ad4	ldp x29,x30,[sp, #0x10]
009b5ad8	ldp x20,x19,[sp], #0x20
009b5adc	ret

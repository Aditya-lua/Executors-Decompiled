; ssl_hmac_new @ 009c3a1c
009c3a1c	stp x20,x19,[sp, #-0x20]!
009c3a20	adrp x1,0x2c3000
009c3a24	mov x20,x0
009c3a28	add x1,x1,#0x5d8
009c3a2c	mov w0,#0x10
009c3a30	mov w2,#0xd54
009c3a34	stp x29,x30,[sp, #0x10]
009c3a38	add x29,sp,#0x10
009c3a3c	bl 0x00c34250
009c3a40	mov x19,x0
009c3a44	cbz x0,0x009c3ac8
009c3a48	ldr x8,[x20, #0x248]
009c3a4c	cbz x8,0x009c3a88
009c3a50	ldr x0,[x20]
009c3a54	ldr x2,[x20, #0x440]
009c3a58	adrp x1,0x2c3000
009c3a5c	add x1,x1,#0x5d3
009c3a60	bl 0x00c363a0
009c3a64	mov x20,x0
009c3a68	cbz x0,0x009c3aa0
009c3a6c	mov x0,x20
009c3a70	bl 0x00c36390
009c3a74	str x0,[x19]
009c3a78	cbz x0,0x009c3aa0
009c3a7c	mov x0,x20
009c3a80	bl 0x00c363c0
009c3a84	b 0x009c3ac8
009c3a88	ldr x8,[x20, #0x240]
009c3a8c	cbz x8,0x009c3a50
009c3a90	mov x0,x19
009c3a94	bl 0x00c36660
009c3a98	cbnz w0,0x009c3ac8
009c3a9c	mov x20,xzr
009c3aa0	ldr x0,[x19]
009c3aa4	bl 0x00c36370
009c3aa8	mov x0,x20
009c3aac	bl 0x00c363c0
009c3ab0	adrp x1,0x2c3000
009c3ab4	add x1,x1,#0x5d8
009c3ab8	mov w2,#0xd69
009c3abc	mov x0,x19
009c3ac0	bl 0x00c32310
009c3ac4	mov x19,xzr
009c3ac8	ldp x29,x30,[sp, #0x10]
009c3acc	mov x0,x19
009c3ad0	ldp x20,x19,[sp], #0x20
009c3ad4	ret

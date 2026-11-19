; BIO_ctrl @ 009fcb54
009fcb54	stp x22,x21,[sp, #-0x30]!
009fcb58	stp x20,x19,[sp, #0x10]
009fcb5c	stp x29,x30,[sp, #0x20]
009fcb60	add x29,sp,#0x20
009fcb64	cbz x0,0x009fcbe8
009fcb68	ldr x8,[x0, #0x8]
009fcb6c	mov x22,x0
009fcb70	cbz x8,0x009fcbb4
009fcb74	ldr x8,[x8, #0x40]
009fcb78	cbz x8,0x009fcbb4
009fcb7c	ldp x10,x9,[x22, #0x10]
009fcb80	mov x21,x3
009fcb84	mov x19,x2
009fcb88	mov w20,w1
009fcb8c	cbz x10,0x009fcc00
009fcb90	cbnz x9,0x009fcc04
009fcb94	orr w1,wzr,#0x6
009fcb98	mov w5,#0x1
009fcb9c	mov x0,x22
009fcba0	mov x2,x21
009fcba4	mov w3,w20
009fcba8	mov x4,x19
009fcbac	blr x10
009fcbb0	b 0x009fcc28
009fcbb4	bl 0x00c342a0
009fcbb8	adrp x0,0x2b2000
009fcbbc	adrp x2,0x29d000
009fcbc0	add x0,x0,#0x42
009fcbc4	add x2,x2,#0xf6f
009fcbc8	mov w1,#0x23a
009fcbcc	bl 0x00c342b0
009fcbd0	mov w0,#0x20
009fcbd4	mov w1,#0x79
009fcbd8	mov x2,xzr
009fcbdc	bl 0x00c342c0
009fcbe0	orr x6,xzr,#-0x2
009fcbe4	b 0x009fcbec
009fcbe8	mov x6,#-0x1
009fcbec	ldp x29,x30,[sp, #0x20]
009fcbf0	ldp x20,x19,[sp, #0x10]
009fcbf4	mov x0,x6
009fcbf8	ldp x22,x21,[sp], #0x30
009fcbfc	ret
009fcc00	cbz x9,0x009fcc3c
009fcc04	orr w1,wzr,#0x6
009fcc08	mov w6,#0x1
009fcc0c	mov x0,x22
009fcc10	mov x2,x21
009fcc14	mov x3,xzr
009fcc18	mov w4,w20
009fcc1c	mov x5,x19
009fcc20	mov x7,xzr
009fcc24	blr x9
009fcc28	mov x6,x0
009fcc2c	cmp x0,#0x1
009fcc30	b.lt 0x009fcbec
009fcc34	ldr x8,[x22, #0x8]
009fcc38	ldr x8,[x8, #0x40]
009fcc3c	mov x0,x22
009fcc40	mov w1,w20
009fcc44	mov x2,x19
009fcc48	mov x3,x21
009fcc4c	blr x8
009fcc50	ldp x7,x8,[x22, #0x10]
009fcc54	mov x6,x0
009fcc58	cbz x7,0x009fcc88
009fcc5c	cbnz x8,0x009fcc8c
009fcc60	mov w3,w20
009fcc64	mov x4,x19
009fcc68	ldp x29,x30,[sp, #0x20]
009fcc6c	ldp x20,x19,[sp, #0x10]
009fcc70	mov w1,#0x86
009fcc74	mov x0,x22
009fcc78	mov x2,x21
009fcc7c	mov x5,x6
009fcc80	ldp x22,x21,[sp], #0x30
009fcc84	br x7
009fcc88	cbz x8,0x009fcbec
009fcc8c	mov w4,w20
009fcc90	mov x5,x19
009fcc94	ldp x29,x30,[sp, #0x20]
009fcc98	ldp x20,x19,[sp, #0x10]
009fcc9c	mov w1,#0x86
009fcca0	mov x0,x22
009fcca4	mov x2,x21
009fcca8	mov x3,xzr
009fccac	mov x7,xzr
009fccb0	ldp x22,x21,[sp], #0x30
009fccb4	br x8

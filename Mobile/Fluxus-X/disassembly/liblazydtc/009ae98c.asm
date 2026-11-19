; FUN_009ae98c @ 009ae98c
009ae98c	str x21,[sp, #-0x30]!
009ae990	stp x20,x19,[sp, #0x10]
009ae994	stp x29,x30,[sp, #0x20]
009ae998	add x29,sp,#0x20
009ae99c	mov x21,x1
009ae9a0	mov x20,x0
009ae9a4	bl 0x00c34780
009ae9a8	cbz x0,0x009aea34
009ae9ac	ldrb w8,[x21]
009ae9b0	mov x19,x0
009ae9b4	cbz w8,0x009ae9e8
009ae9b8	adrp x3,0x9b1000
009ae9bc	add x3,x3,#0x4ec
009ae9c0	mov w1,#0x3a
009ae9c4	mov w2,#0x1
009ae9c8	mov x0,x21
009ae9cc	mov x4,x19
009ae9d0	bl 0x00c35230
009ae9d4	cmp w0,#0x1
009ae9d8	b.lt 0x009ae9fc
009ae9dc	mov x0,x19
009ae9e0	bl 0x00c325e0
009ae9e4	cbz w0,0x009ae9fc
009ae9e8	ldr x0,[x20]
009ae9ec	bl 0x00c34770
009ae9f0	mov w0,#0x1
009ae9f4	str x19,[x20]
009ae9f8	b 0x009aea34
009ae9fc	bl 0x00c342a0
009aea00	adrp x0,0x2af000
009aea04	adrp x2,0x2b3000
009aea08	add x0,x0,#0x931
009aea0c	add x2,x2,#0xc9b
009aea10	mov w1,#0x53f
009aea14	bl 0x00c342b0
009aea18	mov w0,#0x14
009aea1c	mov w1,#0xb9
009aea20	mov x2,xzr
009aea24	bl 0x00c342c0
009aea28	mov x0,x19
009aea2c	bl 0x00c34770
009aea30	mov w0,wzr
009aea34	ldp x29,x30,[sp, #0x20]
009aea38	ldp x20,x19,[sp, #0x10]
009aea3c	ldr x21,[sp], #0x30
009aea40	ret

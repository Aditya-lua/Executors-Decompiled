; X509_NAME_print_ex_fp @ 009ed47c
009ed47c	str x21,[sp, #-0x30]!
009ed480	stp x20,x19,[sp, #0x10]
009ed484	mov w19,w2
009ed488	mov x20,x1
009ed48c	mov x1,x0
009ed490	stp x29,x30,[sp, #0x20]
009ed494	add x29,sp,#0x20
009ed498	cbz x3,0x009ed4c0
009ed49c	mov x4,x3
009ed4a0	mov x2,x20
009ed4a4	mov w3,w19
009ed4a8	ldp x29,x30,[sp, #0x20]
009ed4ac	ldp x20,x19,[sp, #0x10]
009ed4b0	adrp x0,0x9ed000
009ed4b4	add x0,x0,#0x508
009ed4b8	ldr x21,[sp], #0x30
009ed4bc	b 0x009ed088
009ed4c0	mov x0,x1
009ed4c4	mov w1,wzr
009ed4c8	bl 0x00c37810
009ed4cc	cbz x0,0x009ed4f4
009ed4d0	mov x1,x20
009ed4d4	mov w2,w19
009ed4d8	mov x21,x0
009ed4dc	bl 0x00c37870
009ed4e0	mov w19,w0
009ed4e4	mov x0,x21
009ed4e8	bl 0x00c31a40
009ed4ec	mov w0,w19
009ed4f0	b 0x009ed4f8
009ed4f4	mov w0,#0xffffffff
009ed4f8	ldp x29,x30,[sp, #0x20]
009ed4fc	ldp x20,x19,[sp, #0x10]
009ed500	ldr x21,[sp], #0x30
009ed504	ret

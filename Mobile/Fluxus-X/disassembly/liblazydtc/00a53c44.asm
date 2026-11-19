; ENGINE_register_all_RAND @ 00a53c44
00a53c44	stp x22,x21,[sp, #-0x30]!
00a53c48	stp x20,x19,[sp, #0x10]
00a53c4c	stp x29,x30,[sp, #0x20]
00a53c50	add x29,sp,#0x20
00a53c54	bl 0x00c32380
00a53c58	cbz x0,0x00a53cac
00a53c5c	adrp x20,0xd21000
00a53c60	adrp x21,0xa53000
00a53c64	adrp x22,0x766000
00a53c68	mov x19,x0
00a53c6c	add x20,x20,#0xa08
00a53c70	add x21,x21,#0xc38
00a53c74	add x22,x22,#0xc
00a53c78	ldr x8,[x19, #0x30]
00a53c7c	cbz x8,0x00a53c9c
00a53c80	mov w4,#0x1
00a53c84	mov x0,x20
00a53c88	mov x1,x21
00a53c8c	mov x2,x19
00a53c90	mov x3,x22
00a53c94	mov w5,wzr
00a53c98	bl 0x00c3bce0
00a53c9c	mov x0,x19
00a53ca0	bl 0x00c323a0
00a53ca4	mov x19,x0
00a53ca8	cbnz x0,0x00a53c78
00a53cac	ldp x29,x30,[sp, #0x20]
00a53cb0	ldp x20,x19,[sp, #0x10]
00a53cb4	ldp x22,x21,[sp], #0x30
00a53cb8	ret

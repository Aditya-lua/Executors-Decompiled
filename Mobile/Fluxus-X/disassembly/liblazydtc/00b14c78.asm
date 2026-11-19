; X509_NAME_get_index_by_OBJ @ 00b14c78
00b14c78	stp x22,x21,[sp, #-0x30]!
00b14c7c	stp x20,x19,[sp, #0x10]
00b14c80	stp x29,x30,[sp, #0x20]
00b14c84	add x29,sp,#0x20
00b14c88	cbz x0,0x00b14cd4
00b14c8c	ldr x21,[x0]
00b14c90	cmp w2,#0x0
00b14c94	mov x20,x1
00b14c98	csinv w19,w2,wzr,ge
00b14c9c	mov x0,x21
00b14ca0	bl 0x00c325e0
00b14ca4	mov w22,w0
00b14ca8	add w19,w19,#0x1
00b14cac	cmp w19,w22
00b14cb0	b.ge 0x00b14cd4
00b14cb4	mov x0,x21
00b14cb8	mov w1,w19
00b14cbc	bl 0x00c32610
00b14cc0	ldr x0,[x0]
00b14cc4	mov x1,x20
00b14cc8	bl 0x00c37ab0
00b14ccc	cbnz w0,0x00b14ca8
00b14cd0	b 0x00b14cd8
00b14cd4	mov w19,#0xffffffff
00b14cd8	mov w0,w19
00b14cdc	ldp x29,x30,[sp, #0x20]
00b14ce0	ldp x20,x19,[sp, #0x10]
00b14ce4	ldp x22,x21,[sp], #0x30
00b14ce8	ret

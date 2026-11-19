; X509_REQ_new_ex @ 00b1e848
00b1e848	str x21,[sp, #-0x30]!
00b1e84c	mov x21,x0
00b1e850	adrp x0,0xc82000
00b1e854	add x0,x0,#0x7b0
00b1e858	stp x20,x19,[sp, #0x10]
00b1e85c	stp x29,x30,[sp, #0x20]
00b1e860	add x29,sp,#0x20
00b1e864	mov x20,x1
00b1e868	bl 0x00c372e0
00b1e86c	mov x19,x0
00b1e870	cbz x0,0x00b1e8c4
00b1e874	ldr x0,[x19, #0x70]
00b1e878	adrp x1,0x2d0000
00b1e87c	add x1,x1,#0x618
00b1e880	mov w2,#0x98
00b1e884	str x21,[x19, #0x68]
00b1e888	bl 0x00c32310
00b1e88c	str xzr,[x19, #0x70]
00b1e890	cbz x20,0x00b1e8c4
00b1e894	adrp x1,0x2d0000
00b1e898	add x1,x1,#0x618
00b1e89c	mov w2,#0x9b
00b1e8a0	mov x0,x20
00b1e8a4	bl 0x00c34600
00b1e8a8	str x0,[x19, #0x70]
00b1e8ac	cbnz x0,0x00b1e8c4
00b1e8b0	adrp x1,0xc82000
00b1e8b4	add x1,x1,#0x7b0
00b1e8b8	mov x0,x19
00b1e8bc	bl 0x00c36160
00b1e8c0	mov x19,xzr
00b1e8c4	mov x0,x19
00b1e8c8	ldp x29,x30,[sp, #0x20]
00b1e8cc	ldp x20,x19,[sp, #0x10]
00b1e8d0	ldr x21,[sp], #0x30
00b1e8d4	ret

; EVP_MD_meth_free @ 00a5f85c
00a5f85c	stp x20,x19,[sp, #-0x20]!
00a5f860	stp x29,x30,[sp, #0x10]
00a5f864	add x29,sp,#0x10
00a5f868	cbz x0,0x00a5f8bc
00a5f86c	ldr w8,[x0, #0x18]
00a5f870	mov x19,x0
00a5f874	cmp w8,#0x2
00a5f878	b.ne 0x00a5f8bc
00a5f87c	ldr x0,[x19, #0x60]
00a5f880	adrp x20,0x2a0000
00a5f884	add x20,x20,#0x246
00a5f888	mov w2,#0x354
00a5f88c	mov x1,x20
00a5f890	bl 0x00c32310
00a5f894	ldr x0,[x19, #0x70]
00a5f898	bl 0x00c3b690
00a5f89c	ldr x0,[x19, #0x80]
00a5f8a0	bl 0x00c34d40
00a5f8a4	ldp x29,x30,[sp, #0x10]
00a5f8a8	mov w2,#0x357
00a5f8ac	mov x0,x19
00a5f8b0	mov x1,x20
00a5f8b4	ldp x20,x19,[sp], #0x20
00a5f8b8	b 0x00c32310
00a5f8bc	ldp x29,x30,[sp, #0x10]
00a5f8c0	ldp x20,x19,[sp], #0x20
00a5f8c4	ret

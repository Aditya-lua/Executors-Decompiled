; evp_method_store_remove_all_provided @ 00a5d870
00a5d870	str x19,[sp, #-0x20]!
00a5d874	stp x29,x30,[sp, #0x10]
00a5d878	add x29,sp,#0x10
00a5d87c	mov x19,x0
00a5d880	bl 0x00c3b2f0
00a5d884	adrp x2,0xc5d000
00a5d888	add x2,x2,#0x6b8
00a5d88c	mov w1,wzr
00a5d890	bl 0x00c3b520
00a5d894	cbz x0,0x00a5d8a8
00a5d898	ldp x29,x30,[sp, #0x10]
00a5d89c	mov x1,x19
00a5d8a0	ldr x19,[sp], #0x20
00a5d8a4	b 0x00c3b5e0
00a5d8a8	ldp x29,x30,[sp, #0x10]
00a5d8ac	mov w0,#0x1
00a5d8b0	ldr x19,[sp], #0x20
00a5d8b4	ret

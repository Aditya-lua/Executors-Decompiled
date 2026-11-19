; ossl_blake2s256_init @ 00b2d870
00b2d870	sub sp,sp,#0x40
00b2d874	str x19,[sp, #0x20]
00b2d878	mov x19,x0
00b2d87c	mov x0,sp
00b2d880	stp x29,x30,[sp, #0x30]
00b2d884	add x29,sp,#0x30
00b2d888	bl 0x00c41650
00b2d88c	mov x1,sp
00b2d890	mov x0,x19
00b2d894	bl 0x00c41640
00b2d898	ldp x29,x30,[sp, #0x30]
00b2d89c	ldr x19,[sp, #0x20]
00b2d8a0	add sp,sp,#0x40
00b2d8a4	ret

; ossl_curve448_scalar_mul @ 00a4bc14
00a4bc14	str x19,[sp, #-0x20]!
00a4bc18	stp x29,x30,[sp, #0x10]
00a4bc1c	add x29,sp,#0x10
00a4bc20	mov x19,x0
00a4bc24	bl 0x00a4bc44
00a4bc28	ldp x29,x30,[sp, #0x10]
00a4bc2c	adrp x2,0x765000
00a4bc30	add x2,x2,#0xef0
00a4bc34	mov x0,x19
00a4bc38	mov x1,x19
00a4bc3c	ldr x19,[sp], #0x20
00a4bc40	b 0x00a4bc44

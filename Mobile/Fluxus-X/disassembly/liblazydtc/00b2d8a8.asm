; ossl_blake2b512_init @ 00b2d8a8
00b2d8a8	sub sp,sp,#0x60
00b2d8ac	str x19,[sp, #0x40]
00b2d8b0	mov x19,x0
00b2d8b4	mov x0,sp
00b2d8b8	stp x29,x30,[sp, #0x50]
00b2d8bc	add x29,sp,#0x50
00b2d8c0	bl 0x00c41630
00b2d8c4	mov x1,sp
00b2d8c8	mov x0,x19
00b2d8cc	bl 0x00c41620
00b2d8d0	ldp x29,x30,[sp, #0x50]
00b2d8d4	ldr x19,[sp, #0x40]
00b2d8d8	add sp,sp,#0x60
00b2d8dc	ret

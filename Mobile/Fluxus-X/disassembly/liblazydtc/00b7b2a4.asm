; mbedtls_platform_zeroize @ 00b7b2a4
00b7b2a4	str x19,[sp, #-0x20]!
00b7b2a8	stp x29,x30,[sp, #0x10]
00b7b2ac	add x29,sp,#0x10
00b7b2b0	mov x2,x1
00b7b2b4	mov x19,x0
00b7b2b8	cbz x1,0x00b7b2d0
00b7b2bc	adrp x8,0xca8000
00b7b2c0	ldr x8,[x8, #0x4e8]
00b7b2c4	mov x0,x19
00b7b2c8	mov w1,wzr
00b7b2cc	blr x8
00b7b2d0	ldp x29,x30,[sp, #0x10]
00b7b2d4	ldr x19,[sp], #0x20
00b7b2d8	ret

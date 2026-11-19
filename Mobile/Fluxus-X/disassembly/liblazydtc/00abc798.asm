; PKCS12_SAFEBAG_get0_safes @ 00abc798
00abc798	str x19,[sp, #-0x20]!
00abc79c	stp x29,x30,[sp, #0x10]
00abc7a0	mov x19,x0
00abc7a4	ldr x0,[x0]
00abc7a8	add x29,sp,#0x10
00abc7ac	bl 0x00c37750
00abc7b0	cmp w0,#0x9b
00abc7b4	mov x0,xzr
00abc7b8	b.ne 0x00abc7c0
00abc7bc	ldr x0,[x19, #0x8]
00abc7c0	ldp x29,x30,[sp, #0x10]
00abc7c4	ldr x19,[sp], #0x20
00abc7c8	ret

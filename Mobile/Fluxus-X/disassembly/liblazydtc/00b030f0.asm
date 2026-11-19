; X509_get0_authority_issuer @ 00b030f0
00b030f0	str x19,[sp, #-0x20]!
00b030f4	stp x29,x30,[sp, #0x10]
00b030f8	add x29,sp,#0x10
00b030fc	mov x19,x0
00b03100	bl 0x00b01d98
00b03104	cbz w0,0x00b03118
00b03108	ldr x8,[x19, #0x100]
00b0310c	cbz x8,0x00b03118
00b03110	ldr x0,[x8, #0x8]
00b03114	b 0x00b0311c
00b03118	mov x0,xzr
00b0311c	ldp x29,x30,[sp, #0x10]
00b03120	ldr x19,[sp], #0x20
00b03124	ret

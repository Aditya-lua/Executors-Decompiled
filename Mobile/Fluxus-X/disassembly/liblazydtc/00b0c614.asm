; X509_REQ_set0_signature @ 00b0c614
00b0c614	stp x20,x19,[sp, #-0x20]!
00b0c618	stp x29,x30,[sp, #0x10]
00b0c61c	mov x19,x0
00b0c620	ldr x0,[x0, #0x48]
00b0c624	mov x20,x1
00b0c628	add x29,sp,#0x10
00b0c62c	cbz x0,0x00b0c634
00b0c630	bl 0x00c38030
00b0c634	str x20,[x19, #0x48]
00b0c638	ldp x29,x30,[sp, #0x10]
00b0c63c	ldp x20,x19,[sp], #0x20
00b0c640	ret

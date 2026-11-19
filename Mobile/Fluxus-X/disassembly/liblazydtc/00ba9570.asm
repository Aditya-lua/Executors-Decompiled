; mbedtls_oid_get_sig_alg_desc @ 00ba9570
00ba9570	str x19,[sp, #-0x20]!
00ba9574	stp x29,x30,[sp, #0x10]
00ba9578	add x29,sp,#0x10
00ba957c	mov x19,x1
00ba9580	bl 0x00ba95ac
00ba9584	mov x8,x0
00ba9588	cbz x0,0x00ba959c
00ba958c	ldr x8,[x8, #0x18]
00ba9590	mov w0,wzr
00ba9594	str x8,[x19]
00ba9598	b 0x00ba95a0
00ba959c	mov w0,#0xffffffd2
00ba95a0	ldp x29,x30,[sp, #0x10]
00ba95a4	ldr x19,[sp], #0x20
00ba95a8	ret

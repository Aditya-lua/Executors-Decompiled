; EVP_MD_CTX_reset @ 00a5757c
00a5757c	cbz x0,0x00a575cc
00a57580	str x19,[sp, #-0x20]!
00a57584	mov w1,#0x400
00a57588	stp x29,x30,[sp, #0x10]
00a5758c	add x29,sp,#0x10
00a57590	mov x19,x0
00a57594	bl 0x00c3c1d0
00a57598	cbnz w0,0x00a575a8
00a5759c	ldr x0,[x19, #0x28]
00a575a0	bl 0x00c34620
00a575a4	str xzr,[x19, #0x28]
00a575a8	mov x0,x19
00a575ac	mov w1,wzr
00a575b0	mov w2,wzr
00a575b4	bl 0x00a573e4
00a575b8	mov w1,#0x48
00a575bc	mov x0,x19
00a575c0	bl 0x00c34750
00a575c4	ldp x29,x30,[sp, #0x10]
00a575c8	ldr x19,[sp], #0x20
00a575cc	mov w0,#0x1
00a575d0	ret

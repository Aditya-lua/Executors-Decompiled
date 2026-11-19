; EVP_DigestInit @ 00a57e7c
00a57e7c	stp x20,x19,[sp, #-0x20]!
00a57e80	mov x19,x1
00a57e84	mov x20,x0
00a57e88	stp x29,x30,[sp, #0x10]
00a57e8c	add x29,sp,#0x10
00a57e90	cbz x0,0x00a57ecc
00a57e94	mov w1,#0x400
00a57e98	mov x0,x20
00a57e9c	bl 0x00c3c1d0
00a57ea0	cbnz w0,0x00a57eb0
00a57ea4	ldr x0,[x20, #0x28]
00a57ea8	bl 0x00c34620
00a57eac	str xzr,[x20, #0x28]
00a57eb0	mov x0,x20
00a57eb4	mov w1,wzr
00a57eb8	mov w2,wzr
00a57ebc	bl 0x00a573e4
00a57ec0	mov w1,#0x48
00a57ec4	mov x0,x20
00a57ec8	bl 0x00c34750
00a57ecc	ldp x29,x30,[sp, #0x10]
00a57ed0	mov x0,x20
00a57ed4	mov x1,x19
00a57ed8	mov x2,xzr
00a57edc	mov x3,xzr
00a57ee0	ldp x20,x19,[sp], #0x20
00a57ee4	b 0x00a577c0

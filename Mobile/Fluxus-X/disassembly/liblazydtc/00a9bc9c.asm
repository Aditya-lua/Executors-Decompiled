; OPENSSL_strcasecmp @ 00a9bc9c
00a9bc9c	str x21,[sp, #-0x30]!
00a9bca0	stp x20,x19,[sp, #0x10]
00a9bca4	mov x19,x1
00a9bca8	mov x20,x0
00a9bcac	stp x29,x30,[sp, #0x20]
00a9bcb0	add x29,sp,#0x20
00a9bcb4	ldrb w0,[x20]
00a9bcb8	bl 0x00c3de30
00a9bcbc	ldrb w8,[x19]
00a9bcc0	mov w21,w0
00a9bcc4	mov w0,w8
00a9bcc8	bl 0x00c3de30
00a9bccc	subs w0,w21,w0
00a9bcd0	b.ne 0x00a9bce4
00a9bcd4	ldrb w8,[x20], #0x1
00a9bcd8	add x19,x19,#0x1
00a9bcdc	cbnz w8,0x00a9bcb4
00a9bce0	mov w0,wzr
00a9bce4	ldp x29,x30,[sp, #0x20]
00a9bce8	ldp x20,x19,[sp, #0x10]
00a9bcec	ldr x21,[sp], #0x30
00a9bcf0	ret

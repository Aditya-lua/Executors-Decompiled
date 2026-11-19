; OPENSSL_strncasecmp @ 00a9bcf4
00a9bcf4	str x23,[sp, #-0x40]!
00a9bcf8	stp x22,x21,[sp, #0x10]
00a9bcfc	stp x20,x19,[sp, #0x20]
00a9bd00	stp x29,x30,[sp, #0x30]
00a9bd04	add x29,sp,#0x30
00a9bd08	cbz x2,0x00a9bd50
00a9bd0c	mov x19,x2
00a9bd10	mov x20,x1
00a9bd14	mov x21,x0
00a9bd18	mov x23,xzr
00a9bd1c	ldrb w0,[x21, x23]
00a9bd20	bl 0x00c3de30
00a9bd24	ldrb w8,[x20, x23]
00a9bd28	mov w22,w0
00a9bd2c	mov w0,w8
00a9bd30	bl 0x00c3de30
00a9bd34	subs w0,w22,w0
00a9bd38	b.ne 0x00a9bd54
00a9bd3c	ldrb w8,[x21, x23]
00a9bd40	cbz w8,0x00a9bd50
00a9bd44	add x23,x23,#0x1
00a9bd48	cmp x23,x19
00a9bd4c	b.cc 0x00a9bd1c
00a9bd50	mov w0,wzr
00a9bd54	ldp x29,x30,[sp, #0x30]
00a9bd58	ldp x20,x19,[sp, #0x20]
00a9bd5c	ldp x22,x21,[sp, #0x10]
00a9bd60	ldr x23,[sp], #0x40
00a9bd64	ret

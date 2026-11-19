; ossl_err_load_DSA_strings @ 00a99108
00a99108	stp x29,x30,[sp, #-0x10]!
00a9910c	mov w0,#0x72
00a99110	movk w0,#0x500, LSL #16
00a99114	mov x29,sp
00a99118	bl 0x00c35520
00a9911c	cbnz x0,0x00a9912c
00a99120	adrp x0,0xc6c000
00a99124	add x0,x0,#0x1f8
00a99128	bl 0x00c35510
00a9912c	mov w0,#0x1
00a99130	ldp x29,x30,[sp], #0x10
00a99134	ret

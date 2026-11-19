; X509_TRUST_get_count @ 00b0cde8
00b0cde8	adrp x8,0xd22000
00b0cdec	ldr x0,[x8, #0x7e8]
00b0cdf0	cbz x0,0x00b0ce0c
00b0cdf4	stp x29,x30,[sp, #-0x10]!
00b0cdf8	mov x29,sp
00b0cdfc	bl 0x00c325e0
00b0ce00	add w0,w0,#0x8
00b0ce04	ldp x29,x30,[sp], #0x10
00b0ce08	ret
00b0ce0c	mov w0,#0x8
00b0ce10	ret

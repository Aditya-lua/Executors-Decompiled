; EVP_RAND_enable_locking @ 00ac9114
00ac9114	ldr x8,[x0]
00ac9118	ldr x1,[x8, #0x70]
00ac911c	cbz x1,0x00ac9128
00ac9120	ldr x0,[x0, #0x8]
00ac9124	br x1
00ac9128	stp x29,x30,[sp, #-0x10]!
00ac912c	mov x29,sp
00ac9130	bl 0x00c342a0
00ac9134	adrp x0,0x2ce000
00ac9138	adrp x2,0x2dc000
00ac913c	add x0,x0,#0x291
00ac9140	add x2,x2,#0x8f4
00ac9144	orr w1,wzr,#0x60
00ac9148	bl 0x00c342b0
00ac914c	orr w0,wzr,#0x6
00ac9150	mov w1,#0xd5
00ac9154	mov x2,xzr
00ac9158	bl 0x00c342c0
00ac915c	mov w0,wzr
00ac9160	ldp x29,x30,[sp], #0x10
00ac9164	ret

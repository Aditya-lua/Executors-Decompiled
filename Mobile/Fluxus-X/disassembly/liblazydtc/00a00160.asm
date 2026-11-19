; BIO_closesocket @ 00a00160
00a00160	tbnz w0,#0x1f,0x00a00180
00a00164	stp x29,x30,[sp, #-0x10]!
00a00168	mov x29,sp
00a0016c	bl 0x00c31bf0
00a00170	lsr w8,w0,#0x1f
00a00174	eor w0,w8,#0x1
00a00178	ldp x29,x30,[sp], #0x10
00a0017c	ret
00a00180	mov w0,wzr
00a00184	ret

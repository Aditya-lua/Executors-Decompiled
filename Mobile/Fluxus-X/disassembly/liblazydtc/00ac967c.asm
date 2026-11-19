; EVP_RAND_up_ref @ 00ac967c
00ac967c	cbz x0,0x00ac9694
00ac9680	add x8,x0,#0x20
00ac9684	ldxr w9,[x8]
00ac9688	add w9,w9,#0x1
00ac968c	stxr w10,w9,[x8]
00ac9690	cbnz w10,0x00ac9684
00ac9694	mov w0,#0x1
00ac9698	ret

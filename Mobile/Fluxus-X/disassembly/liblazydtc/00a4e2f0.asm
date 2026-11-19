; ossl_core_bio_up_ref @ 00a4e2f0
00a4e2f0	ldxr w8,[x0]
00a4e2f4	add w8,w8,#0x1
00a4e2f8	stxr w9,w8,[x0]
00a4e2fc	cbnz w9,0x00a4e2f0
00a4e300	mov w0,#0x1
00a4e304	ret

; SCT_get_signature_nid @ 00a14168
00a14168	ldr w9,[x0]
00a1416c	mov w8,wzr
00a14170	cbnz w9,0x00a141a0
00a14174	ldrb w8,[x0, #0x40]
00a14178	cmp w8,#0x4
00a1417c	mov w8,wzr
00a14180	b.ne 0x00a141a0
00a14184	ldrb w8,[x0, #0x41]
00a14188	mov w9,#0x29c
00a1418c	cmp w8,#0x1
00a14190	csel w9,w9,wzr,eq
00a14194	cmp w8,#0x3
00a14198	mov w8,#0x31a
00a1419c	csel w8,w8,w9,eq
00a141a0	mov w0,w8
00a141a4	ret

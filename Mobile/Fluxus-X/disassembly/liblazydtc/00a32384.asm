; EC_GROUP_get_basis_type @ 00a32384
00a32384	ldr x8,[x0]
00a32388	ldr w8,[x8, #0x4]
00a3238c	cmp w8,#0x197
00a32390	mov w8,wzr
00a32394	b.ne 0x00a323d0
00a32398	ldr w8,[x0, #0x48]
00a3239c	cbz w8,0x00a323d0
00a323a0	ldr w8,[x0, #0x4c]
00a323a4	cbz w8,0x00a323d0
00a323a8	ldr w8,[x0, #0x50]
00a323ac	cbz w8,0x00a323cc
00a323b0	ldr w8,[x0, #0x54]
00a323b4	cbz w8,0x00a323d0
00a323b8	ldr w8,[x0, #0x58]
00a323bc	cmp w8,#0x0
00a323c0	mov w8,#0x2ab
00a323c4	csel w0,w8,wzr,eq
00a323c8	ret
00a323cc	mov w8,#0x2aa
00a323d0	mov w0,w8
00a323d4	ret

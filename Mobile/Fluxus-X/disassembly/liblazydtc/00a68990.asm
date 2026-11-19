; EVP_MAC_names_do_all @ 00a68990
00a68990	mov x8,x0
00a68994	ldr x0,[x0]
00a68998	cbz x0,0x00a689ac
00a6899c	mov x3,x2
00a689a0	mov x2,x1
00a689a4	ldr w1,[x8, #0x8]
00a689a8	b 0x00c3bfa0
00a689ac	mov w0,#0x1
00a689b0	ret

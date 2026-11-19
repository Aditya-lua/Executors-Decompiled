; EVP_MD_names_do_all @ 00a5f698
00a5f698	mov x8,x0
00a5f69c	ldr x0,[x0, #0x70]
00a5f6a0	cbz x0,0x00a5f6b4
00a5f6a4	mov x3,x2
00a5f6a8	mov x2,x1
00a5f6ac	ldr w1,[x8, #0x58]
00a5f6b0	b 0x00c3bfa0
00a5f6b4	mov w0,#0x1
00a5f6b8	ret

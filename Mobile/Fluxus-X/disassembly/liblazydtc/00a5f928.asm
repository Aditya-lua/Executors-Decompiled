; EVP_MD_meth_set_flags @ 00a5f928
00a5f928	ldr x9,[x0, #0x10]
00a5f92c	mov x8,x0
00a5f930	mov w0,wzr
00a5f934	cbz x9,0x00a5f93c
00a5f938	ret
00a5f93c	mov w0,#0x1
00a5f940	str x1,[x8, #0x10]
00a5f944	ret

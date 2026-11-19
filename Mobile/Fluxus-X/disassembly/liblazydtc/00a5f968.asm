; EVP_MD_meth_set_update @ 00a5f968
00a5f968	ldr x9,[x0, #0x28]
00a5f96c	mov x8,x0
00a5f970	mov w0,wzr
00a5f974	cbz x9,0x00a5f97c
00a5f978	ret
00a5f97c	mov w0,#0x1
00a5f980	str x1,[x8, #0x28]
00a5f984	ret

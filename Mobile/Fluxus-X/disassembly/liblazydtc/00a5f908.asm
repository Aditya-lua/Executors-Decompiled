; EVP_MD_meth_set_app_datasize @ 00a5f908
00a5f908	ldr w9,[x0, #0x4c]
00a5f90c	mov x8,x0
00a5f910	mov w0,wzr
00a5f914	cbz w9,0x00a5f91c
00a5f918	ret
00a5f91c	mov w0,#0x1
00a5f920	str w1,[x8, #0x4c]
00a5f924	ret

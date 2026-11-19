; EVP_MAC_get_params @ 00a688f4
00a688f4	ldr x2,[x0, #0x78]
00a688f8	cbz x2,0x00a68904
00a688fc	mov x0,x1
00a68900	br x2
00a68904	mov w0,#0x1
00a68908	ret

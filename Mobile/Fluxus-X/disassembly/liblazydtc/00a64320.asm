; EVP_KDF_names_do_all @ 00a64320
00a64320	mov x8,x0
00a64324	ldr x0,[x0]
00a64328	cbz x0,0x00a6433c
00a6432c	mov x3,x2
00a64330	mov x2,x1
00a64334	ldr w1,[x8, #0x8]
00a64338	b 0x00c3bfa0
00a6433c	mov w0,#0x1
00a64340	ret

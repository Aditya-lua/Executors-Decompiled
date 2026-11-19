; EVP_KEYMGMT_names_do_all @ 00a66910
00a66910	mov x8,x0
00a66914	ldr x0,[x0, #0x18]
00a66918	cbz x0,0x00a6692c
00a6691c	mov x3,x2
00a66920	mov x2,x1
00a66924	ldr w1,[x8, #0x4]
00a66928	b 0x00c3bfa0
00a6692c	mov w0,#0x1
00a66930	ret

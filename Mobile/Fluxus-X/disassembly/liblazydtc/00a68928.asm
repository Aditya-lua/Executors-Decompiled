; EVP_MAC_CTX_set_params @ 00a68928
00a68928	ldr x8,[x0]
00a6892c	ldr x2,[x8, #0x88]
00a68930	cbz x2,0x00a6893c
00a68934	ldr x0,[x0, #0x8]
00a68938	br x2
00a6893c	mov w0,#0x1
00a68940	ret

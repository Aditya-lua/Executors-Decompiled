; X509_LOOKUP_ctrl_ex @ 00b0a2d0
00b0a2d0	ldr x8,[x0, #0x8]
00b0a2d4	cbz x8,0x00b0a2e4
00b0a2d8	ldr x7,[x8, #0x58]
00b0a2dc	cbz x7,0x00b0a2ec
00b0a2e0	br x7
00b0a2e4	mov w0,#0xffffffff
00b0a2e8	ret
00b0a2ec	ldr x5,[x8, #0x28]
00b0a2f0	cbz x5,0x00b0a2f8
00b0a2f4	br x5
00b0a2f8	mov w0,#0x1
00b0a2fc	ret

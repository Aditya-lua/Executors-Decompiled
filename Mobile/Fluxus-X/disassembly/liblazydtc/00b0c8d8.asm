; X509_SIG_INFO_get @ 00b0c8d8
00b0c8d8	cbz x1,0x00b0c8e4
00b0c8dc	ldr w8,[x0]
00b0c8e0	str w8,[x1]
00b0c8e4	cbz x2,0x00b0c8f0
00b0c8e8	ldr w8,[x0, #0x4]
00b0c8ec	str w8,[x2]
00b0c8f0	cbz x3,0x00b0c8fc
00b0c8f4	ldr w8,[x0, #0x8]
00b0c8f8	str w8,[x3]
00b0c8fc	cbz x4,0x00b0c908
00b0c900	ldr w8,[x0, #0xc]
00b0c904	str w8,[x4]
00b0c908	ldr w8,[x0, #0xc]
00b0c90c	and w0,w8,#0x1
00b0c910	ret

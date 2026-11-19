; X509_CRL_get0_by_serial @ 00b1b354
00b1b354	ldr x8,[x0, #0xd0]
00b1b358	ldr x4,[x8, #0x18]
00b1b35c	cbz x4,0x00b1b368
00b1b360	mov x3,xzr
00b1b364	br x4
00b1b368	mov w0,wzr
00b1b36c	ret

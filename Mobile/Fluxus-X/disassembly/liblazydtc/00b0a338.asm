; X509_LOOKUP_by_subject_ex @ 00b0a338
00b0a338	ldr w8,[x0, #0x4]
00b0a33c	cbz w8,0x00b0a348
00b0a340	mov w0,wzr
00b0a344	ret
00b0a348	ldr x8,[x0, #0x8]
00b0a34c	cbz x8,0x00b0a340
00b0a350	ldr x7,[x8, #0x30]
00b0a354	ldr x6,[x8, #0x50]
00b0a358	cbz x7,0x00b0a364
00b0a35c	cbnz x6,0x00b0a368
00b0a360	br x7
00b0a364	cbz x6,0x00b0a340
00b0a368	br x6

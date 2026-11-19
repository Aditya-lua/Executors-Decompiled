; X509_LOOKUP_by_subject @ 00b0a36c
00b0a36c	ldr w8,[x0, #0x4]
00b0a370	cbz w8,0x00b0a37c
00b0a374	mov w0,wzr
00b0a378	ret
00b0a37c	ldr x8,[x0, #0x8]
00b0a380	cbz x8,0x00b0a374
00b0a384	ldr x4,[x8, #0x30]
00b0a388	ldr x6,[x8, #0x50]
00b0a38c	cbz x4,0x00b0a398
00b0a390	cbnz x6,0x00b0a39c
00b0a394	br x4
00b0a398	cbz x6,0x00b0a374
00b0a39c	mov x4,xzr
00b0a3a0	mov x5,xzr
00b0a3a4	br x6

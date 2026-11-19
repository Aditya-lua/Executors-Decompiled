; SSL_SESSION_is_resumable @ 009bea88
009bea88	ldr w9,[x0, #0x2b0]
009bea8c	mov x8,x0
009bea90	mov w0,wzr
009bea94	cbz w9,0x009bea9c
009bea98	ret
009bea9c	ldr x9,[x8, #0x250]
009beaa0	cbz x9,0x009beaac
009beaa4	mov w0,#0x1
009beaa8	ret
009beaac	ldr x8,[x8, #0x340]
009beab0	cmp x8,#0x0
009beab4	cset w0,ne
009beab8	ret

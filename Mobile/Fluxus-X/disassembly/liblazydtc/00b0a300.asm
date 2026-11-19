; X509_LOOKUP_ctrl @ 00b0a300
00b0a300	ldr x8,[x0, #0x8]
00b0a304	cbz x8,0x00b0a31c
00b0a308	ldr x7,[x8, #0x58]
00b0a30c	cbz x7,0x00b0a324
00b0a310	mov x5,xzr
00b0a314	mov x6,xzr
00b0a318	br x7
00b0a31c	mov w0,#0xffffffff
00b0a320	ret
00b0a324	ldr x5,[x8, #0x28]
00b0a328	cbz x5,0x00b0a330
00b0a32c	br x5
00b0a330	mov w0,#0x1
00b0a334	ret

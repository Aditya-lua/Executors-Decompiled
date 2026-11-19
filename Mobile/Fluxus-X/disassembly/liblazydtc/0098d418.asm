; ix::WebSocket::getPerMessageDeflateOptions @ 0098d418
0098d418	str x21,[sp, #-0x30]!
0098d41c	stp x20,x19,[sp, #0x10]
0098d420	stp x29,x30,[sp, #0x20]
0098d424	add x29,sp,#0x20
0098d428	add x20,x0,#0x3a0
0098d42c	mov x19,x0
0098d430	mov x0,x20
0098d434	bl 0x00c2ff10
0098d438	ldrb w21,[x19, #0x314]
0098d43c	ldr w19,[x19, #0x310]
0098d440	mov x0,x20
0098d444	bl 0x00c2ff20
0098d448	bfm x19,x21,#0x20,#0x7
0098d44c	mov x0,x19
0098d450	ldp x29,x30,[sp, #0x20]
0098d454	ldp x20,x19,[sp, #0x10]
0098d458	ldr x21,[sp], #0x30
0098d45c	ret

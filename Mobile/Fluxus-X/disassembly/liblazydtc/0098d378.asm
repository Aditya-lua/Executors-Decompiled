; ix::WebSocket::setPerMessageDeflateOptions @ 0098d378
0098d378	str x21,[sp, #-0x30]!
0098d37c	stp x20,x19,[sp, #0x10]
0098d380	stp x29,x30,[sp, #0x20]
0098d384	add x29,sp,#0x20
0098d388	add x21,x0,#0x3a0
0098d38c	mov x20,x0
0098d390	mov x0,x21
0098d394	mov x19,x1
0098d398	bl 0x00c2ff10
0098d39c	ldrb w8,[x19, #0x4]
0098d3a0	mov x0,x21
0098d3a4	strb w8,[x20, #0x314]
0098d3a8	ldr w8,[x19]
0098d3ac	str w8,[x20, #0x310]
0098d3b0	ldp x29,x30,[sp, #0x20]
0098d3b4	ldp x20,x19,[sp, #0x10]
0098d3b8	ldr x21,[sp], #0x30
0098d3bc	b 0x00c2ff20

; ix::WebSocketTransport::closeSocket @ 00998370
00998370	stp x20,x19,[sp, #-0x20]!
00998374	stp x29,x30,[sp, #0x10]
00998378	add x29,sp,#0x10
0099837c	add x19,x0,#0xb8
00998380	mov x20,x0
00998384	mov x0,x19
00998388	bl 0x00c2ff10
0099838c	ldr x0,[x20, #0xb0]
00998390	ldr x8,[x0]
00998394	ldr x8,[x8, #0x20]
00998398	blr x8
0099839c	ldp x29,x30,[sp, #0x10]
009983a0	mov x0,x19
009983a4	ldp x20,x19,[sp], #0x20
009983a8	b 0x00c2ff20

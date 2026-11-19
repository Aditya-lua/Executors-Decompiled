; ix::WebSocketTransport::isSendBufferEmpty @ 009983c0
009983c0	stp x20,x19,[sp, #-0x20]!
009983c4	stp x29,x30,[sp, #0x10]
009983c8	add x29,sp,#0x10
009983cc	add x20,x0,#0x68
009983d0	mov x19,x0
009983d4	mov x0,x20
009983d8	bl 0x00c2ff10
009983dc	ldp x8,x9,[x19, #0x50]
009983e0	mov x0,x20
009983e4	cmp x8,x9
009983e8	cset w19,eq
009983ec	bl 0x00c2ff20
009983f0	ldp x29,x30,[sp, #0x10]
009983f4	mov w0,w19
009983f8	ldp x20,x19,[sp], #0x20
009983fc	ret

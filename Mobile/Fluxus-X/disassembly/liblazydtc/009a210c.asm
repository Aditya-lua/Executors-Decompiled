; ix::WebSocketPerMessageDeflate::~WebSocketPerMessageDeflate @ 009a210c
009a210c	stp x20,x19,[sp, #-0x20]!
009a2110	stp x29,x30,[sp, #0x10]
009a2114	add x29,sp,#0x10
009a2118	ldr x20,[x0, #0x8]
009a211c	mov x19,x0
009a2120	str xzr,[x0, #0x8]
009a2124	cbz x20,0x009a2138
009a2128	mov x0,x20
009a212c	bl 0x00c33d30
009a2130	mov x0,x20
009a2134	bl 0x00c301d0
009a2138	ldr x20,[x19]
009a213c	str xzr,[x19]
009a2140	cbz x20,0x009a215c
009a2144	mov x0,x20
009a2148	bl 0x00c33cf0
009a214c	ldp x29,x30,[sp, #0x10]
009a2150	mov x0,x20
009a2154	ldp x20,x19,[sp], #0x20
009a2158	b 0x00c301d0
009a215c	ldp x29,x30,[sp, #0x10]
009a2160	ldp x20,x19,[sp], #0x20
009a2164	ret

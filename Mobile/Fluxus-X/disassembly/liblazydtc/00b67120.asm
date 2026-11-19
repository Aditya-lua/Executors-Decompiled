; ossl_ccm_initctx @ 00b67120
00b67120	ldrb w9,[x0]
00b67124	adrp x10,0x29c000
00b67128	ldr q0,[x10, #0x9d0]
00b6712c	lsr x8,x1,#0x3
00b67130	mov x11,#-0x1
00b67134	stp x8,x11,[x0, #0x18]
00b67138	and w8,w9,#0xffffffe1
00b6713c	strb w8,[x0]
00b67140	stur q0,[x0, #0x8]
00b67144	str x2,[x0, #0x90]
00b67148	ret

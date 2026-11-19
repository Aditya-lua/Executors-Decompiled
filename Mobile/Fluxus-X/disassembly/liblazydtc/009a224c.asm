; ix::WebSocketPerMessageDeflateCompressor::init @ 009a224c
009a224c	stp x20,x19,[sp, #-0x20]!
009a2250	stp x29,x30,[sp, #0x10]
009a2254	add x29,sp,#0x10
009a2258	mov w5,wzr
009a225c	mov w8,#0x4008
009a2260	adrp x6,0x2a3000
009a2264	mov w20,w2
009a2268	mov x19,x0
009a226c	add x0,x0,x8
009a2270	sub w3,w5,w1, UXTB 
009a2274	add x6,x6,#0x6b5
009a2278	mov w1,#0xffffffff
009a227c	mov w2,#0x8
009a2280	mov w4,#0x4
009a2284	orr w7,wzr,#0x70
009a2288	bl 0x00c33290
009a228c	mov w8,w0
009a2290	mov w0,wzr
009a2294	cbnz w8,0x009a22ac
009a2298	tst w20,#0x1
009a229c	mov w8,#0x2
009a22a0	cinc w8,w8,ne
009a22a4	mov w0,#0x1
009a22a8	str w8,[x19]
009a22ac	ldp x29,x30,[sp, #0x10]
009a22b0	ldp x20,x19,[sp], #0x20
009a22b4	ret

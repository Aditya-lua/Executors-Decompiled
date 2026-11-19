; ix::WebSocketPerMessageDeflateDecompressor::init @ 009a2dec
009a2dec	stp x20,x19,[sp, #-0x20]!
009a2df0	stp x29,x30,[sp, #0x10]
009a2df4	add x29,sp,#0x10
009a2df8	mov w20,w2
009a2dfc	mov w8,wzr
009a2e00	mov w9,#0x4008
009a2e04	adrp x2,0x2a3000
009a2e08	mov x19,x0
009a2e0c	add x0,x0,x9
009a2e10	sub w1,w8,w1, UXTB 
009a2e14	add x2,x2,#0x6b5
009a2e18	orr w3,wzr,#0x70
009a2e1c	bl 0x00c31e10
009a2e20	mov w8,w0
009a2e24	mov w0,wzr
009a2e28	cbnz w8,0x009a2e40
009a2e2c	tst w20,#0x1
009a2e30	mov w8,#0x2
009a2e34	cinc w8,w8,ne
009a2e38	mov w0,#0x1
009a2e3c	str w8,[x19]
009a2e40	ldp x29,x30,[sp, #0x10]
009a2e44	ldp x20,x19,[sp], #0x20
009a2e48	ret

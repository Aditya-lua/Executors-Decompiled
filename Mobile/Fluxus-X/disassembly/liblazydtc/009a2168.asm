; ix::WebSocketPerMessageDeflate::init @ 009a2168
009a2168	stp x22,x21,[sp, #-0x30]!
009a216c	stp x20,x19,[sp, #0x10]
009a2170	stp x29,x30,[sp, #0x20]
009a2174	add x29,sp,#0x20
009a2178	mov x19,x0
009a217c	mov x0,x1
009a2180	mov x20,x1
009a2184	bl 0x00c33da0
009a2188	mov w21,w0
009a218c	mov x0,x20
009a2190	bl 0x00c33d80
009a2194	mov w22,w0
009a2198	mov x0,x20
009a219c	bl 0x00c33d90
009a21a0	ldr x8,[x19]
009a21a4	and w21,w21,#0x1
009a21a8	mov w20,w0
009a21ac	mov w1,w22
009a21b0	mov x0,x8
009a21b4	mov w2,w21
009a21b8	bl 0x00c33cb0
009a21bc	tbz w0,#0x0,0x009a21dc
009a21c0	ldr x0,[x19, #0x8]
009a21c4	mov w1,w20
009a21c8	ldp x29,x30,[sp, #0x20]
009a21cc	ldp x20,x19,[sp, #0x10]
009a21d0	mov w2,w21
009a21d4	ldp x22,x21,[sp], #0x30
009a21d8	b 0x00c33d10
009a21dc	ldp x29,x30,[sp, #0x20]
009a21e0	ldp x20,x19,[sp, #0x10]
009a21e4	mov w0,wzr
009a21e8	ldp x22,x21,[sp], #0x30
009a21ec	ret

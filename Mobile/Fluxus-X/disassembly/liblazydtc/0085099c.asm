; FUN_0085099c @ 0085099c
0085099c	adrp x8,0xd1b000
008509a0	adrp x9,0xc4a000
008509a4	add x9,x9,#0x508
008509a8	ldr w8,[x8, #0x230]
008509ac	str x9,[x0]
008509b0	str w8,[x0, #0x8]
008509b4	adrp x8,0xc49000
008509b8	add x8,x8,#0xb90
008509bc	ldr q0,[x1]
008509c0	str x8,[x0]
008509c4	strb wzr,[x0, #0x1c]
008509c8	stur q0,[x0, #0xc]
008509cc	ldr x8,[x2]
008509d0	stp x3,x4,[x0, #0x28]
008509d4	str x8,[x0, #0x20]
008509d8	ldr q0,[x5]
008509dc	str x6,[x0, #0x48]
008509e0	stur q0,[x0, #0x38]
008509e4	ret

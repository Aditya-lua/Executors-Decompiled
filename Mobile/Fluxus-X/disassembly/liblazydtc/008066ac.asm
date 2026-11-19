; _INIT_71 @ 008066ac
008066ac	adrp x8,0xd1b000
008066b0	ldrb w9,[x8, #0x2a8]
008066b4	tbnz w9,#0x0,0x008066dc
008066b8	adrp x9,0xcb4000
008066bc	mov w11,#0x1
008066c0	ldr x9,[x9, #0x9b0]
008066c4	strb w11,[x8, #0x2a8]
008066c8	ldr w10,[x9]
008066cc	add w8,w10,#0x1
008066d0	adrp x10,0xd1b000
008066d4	str w8,[x9]
008066d8	str w8,[x10, #0x2a0]
008066dc	ret

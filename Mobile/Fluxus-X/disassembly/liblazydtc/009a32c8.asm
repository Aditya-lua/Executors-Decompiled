; _INIT_185 @ 009a32c8
009a32c8	adrp x0,0xcb4000
009a32cc	ldr x0,[x0, #0x9c0]
009a32d0	adrp x1,0xd21000
009a32d4	adrp x2,0xc48000
009a32d8	add x1,x1,#0x850
009a32dc	mov w8,#0x8
009a32e0	orr w9,wzr,#0xffff0000
009a32e4	add x2,x2,#0x880
009a32e8	stp xzr,xzr,[x1]
009a32ec	str xzr,[x1, #0x10]
009a32f0	strb w8,[x1]
009a32f4	stur w9,[x1, #0x1]
009a32f8	strb wzr,[x1, #0x5]
009a32fc	b 0x00c2fe70

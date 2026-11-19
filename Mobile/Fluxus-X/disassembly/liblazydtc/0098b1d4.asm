; _INIT_182 @ 0098b1d4
0098b1d4	adrp x1,0xcb4000
0098b1d8	ldr x1,[x1, #0xfb8]
0098b1dc	adrp x9,0x2a1000
0098b1e0	mov w8,#0x12
0098b1e4	add x9,x9,#0x77e
0098b1e8	stp xzr,xzr,[x1]
0098b1ec	strb w8,[x1]
0098b1f0	ldr x8,[x9]
0098b1f4	mov w9,#0x31
0098b1f8	sturh w9,[x1, #0x9]
0098b1fc	adrp x0,0xcb4000
0098b200	ldr x0,[x0, #0x9c0]
0098b204	adrp x2,0xc48000
0098b208	add x2,x2,#0x880
0098b20c	stur x8,[x1, #0x1]
0098b210	str xzr,[x1, #0x10]
0098b214	b 0x00c2fe70

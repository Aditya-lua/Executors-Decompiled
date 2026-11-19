; _INIT_138 @ 0087cbb0
0087cbb0	adrp x9,0xd1e000
0087cbb4	adrp x8,0xd1e000
0087cbb8	add x8,x8,#0xf08
0087cbbc	ldr x10,[x9, #0xec0]
0087cbc0	adrp x11,0x29d000
0087cbc4	add x11,x11,#0x4ea
0087cbc8	strh wzr,[x8]
0087cbcc	str wzr,[x8, #0x18]
0087cbd0	stp x11,x10,[x8, #0x8]
0087cbd4	str x8,[x9, #0xec0]
0087cbd8	ret

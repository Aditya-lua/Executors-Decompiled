; _INIT_142 @ 008aa28c
008aa28c	adrp x9,0xd1e000
008aa290	adrp x8,0xd1f000
008aa294	add x8,x8,#0x170
008aa298	ldr x10,[x9, #0xec0]
008aa29c	adrp x11,0x2c6000
008aa2a0	add x11,x11,#0xb44
008aa2a4	strh wzr,[x8]
008aa2a8	str wzr,[x8, #0x18]
008aa2ac	stp x11,x10,[x8, #0x8]
008aa2b0	str x8,[x9, #0xec0]
008aa2b4	ret

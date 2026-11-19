; _INIT_145 @ 008af35c
008af35c	movi v0.2D,#0x0
008af360	adrp x1,0xd1f000
008af364	add x1,x1,#0x210
008af368	mov w8,#0x3f800000
008af36c	nop
008af370	adr x0,0x7fbc70
008af374	adrp x2,0xc48000
008af378	add x2,x2,#0x880
008af37c	str w8,[x1, #0x20]
008af380	stp q0,q0,[x1]
008af384	b 0x00c2fe70

; _INIT_144 @ 008af330
008af330	movi v0.2D,#0x0
008af334	adrp x1,0xd1f000
008af338	add x1,x1,#0x1e8
008af33c	mov w8,#0x3f800000
008af340	nop
008af344	adr x0,0x7fbc70
008af348	adrp x2,0xc48000
008af34c	add x2,x2,#0x880
008af350	str w8,[x1, #0x20]
008af354	stp q0,q0,[x1]
008af358	b 0x00c2fe70

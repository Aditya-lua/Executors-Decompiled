; _INIT_141 @ 008a0e9c
008a0e9c	adrp x9,0xd1e000
008a0ea0	adrp x8,0xd1f000
008a0ea4	add x8,x8,#0x150
008a0ea8	ldr x10,[x9, #0xec0]
008a0eac	adrp x11,0x2d8000
008a0eb0	add x11,x11,#0xf87
008a0eb4	strh wzr,[x8]
008a0eb8	str wzr,[x8, #0x18]
008a0ebc	stp x11,x10,[x8, #0x8]
008a0ec0	str x8,[x9, #0xec0]
008a0ec4	ret

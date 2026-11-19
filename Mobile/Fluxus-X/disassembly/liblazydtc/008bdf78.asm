; _INIT_169 @ 008bdf78
008bdf78	stp x29,x30,[sp, #-0x10]!
008bdf7c	mov x29,sp
008bdf80	movi v0.2D,#0x0
008bdf84	adrp x1,0xd1f000
008bdf88	add x1,x1,#0xc98
008bdf8c	mov w8,#0x3f800000
008bdf90	nop
008bdf94	adr x0,0x7fbc70
008bdf98	adrp x2,0xc48000
008bdf9c	add x2,x2,#0x880
008bdfa0	str w8,[x1, #0x20]
008bdfa4	stp q0,q0,[x1]
008bdfa8	bl 0x00c2fe70
008bdfac	adrp x8,0xd1f000
008bdfb0	add x8,x8,#0xcc0
008bdfb4	mov w9,#0x100
008bdfb8	adrp x10,0xd1e000
008bdfbc	strh w9,[x8]
008bdfc0	adrp x11,0x2d7000
008bdfc4	add x11,x11,#0x139
008bdfc8	ldr x9,[x10, #0xec0]
008bdfcc	str wzr,[x8, #0x18]
008bdfd0	stp x11,x9,[x8, #0x8]
008bdfd4	str x8,[x10, #0xec0]
008bdfd8	ldp x29,x30,[sp], #0x10
008bdfdc	ret

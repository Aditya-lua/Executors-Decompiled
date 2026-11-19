; _INIT_167 @ 008ba510
008ba510	stp x29,x30,[sp, #-0x10]!
008ba514	mov x29,sp
008ba518	movi v0.2D,#0x0
008ba51c	adrp x1,0xd1f000
008ba520	add x1,x1,#0xbf8
008ba524	mov w8,#0x3f800000
008ba528	nop
008ba52c	adr x0,0x7fbc70
008ba530	adrp x2,0xc48000
008ba534	add x2,x2,#0x880
008ba538	str w8,[x1, #0x20]
008ba53c	stp q0,q0,[x1]
008ba540	bl 0x00c2fe70
008ba544	adrp x10,0xd1e000
008ba548	adrp x8,0xd1f000
008ba54c	add x8,x8,#0xc20
008ba550	ldr x11,[x10, #0xec0]
008ba554	adrp x12,0x2b5000
008ba558	add x12,x12,#0x250
008ba55c	mov w9,#0x100
008ba560	str wzr,[x8, #0x18]
008ba564	stp x12,x11,[x8, #0x8]
008ba568	adrp x11,0xd1f000
008ba56c	add x11,x11,#0xc40
008ba570	strh w9,[x8]
008ba574	strh w9,[x11]
008ba578	adrp x9,0x29f000
008ba57c	add x9,x9,#0x388
008ba580	stp x9,x8,[x11, #0x8]
008ba584	str wzr,[x11, #0x18]
008ba588	str x11,[x10, #0xec0]
008ba58c	ldp x29,x30,[sp], #0x10
008ba590	ret

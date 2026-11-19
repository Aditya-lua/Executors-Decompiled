; _INIT_154 @ 008b3e78
008b3e78	stp x29,x30,[sp, #-0x10]!
008b3e7c	mov x29,sp
008b3e80	movi v0.2D,#0x0
008b3e84	adrp x1,0xd1f000
008b3e88	add x1,x1,#0x398
008b3e8c	mov w8,#0x3f800000
008b3e90	nop
008b3e94	adr x0,0x7fbc70
008b3e98	adrp x2,0xc48000
008b3e9c	add x2,x2,#0x880
008b3ea0	str w8,[x1, #0x20]
008b3ea4	stp q0,q0,[x1]
008b3ea8	bl 0x00c2fe70
008b3eac	adrp x9,0xd1e000
008b3eb0	adrp x8,0xd1f000
008b3eb4	add x8,x8,#0x3c0
008b3eb8	ldr x10,[x9, #0xec0]
008b3ebc	adrp x11,0x2c8000
008b3ec0	add x11,x11,#0xc7f
008b3ec4	strh wzr,[x8]
008b3ec8	str wzr,[x8, #0x18]
008b3ecc	stp x11,x10,[x8, #0x8]
008b3ed0	str x8,[x9, #0xec0]
008b3ed4	ldp x29,x30,[sp], #0x10
008b3ed8	ret

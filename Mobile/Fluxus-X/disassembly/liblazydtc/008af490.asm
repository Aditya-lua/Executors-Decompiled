; _INIT_148 @ 008af490
008af490	stp x29,x30,[sp, #-0x10]!
008af494	mov x29,sp
008af498	movi v0.2D,#0x0
008af49c	adrp x1,0xd1f000
008af4a0	add x1,x1,#0x288
008af4a4	mov w8,#0x3f800000
008af4a8	nop
008af4ac	adr x0,0x7fbc70
008af4b0	adrp x2,0xc48000
008af4b4	add x2,x2,#0x880
008af4b8	str w8,[x1, #0x20]
008af4bc	stp q0,q0,[x1]
008af4c0	bl 0x00c2fe70
008af4c4	adrp x9,0xd1e000
008af4c8	adrp x8,0xd1f000
008af4cc	add x8,x8,#0x2b0
008af4d0	ldr x10,[x9, #0xec0]
008af4d4	adrp x11,0x2d2000
008af4d8	add x11,x11,#0xd32
008af4dc	strh wzr,[x8]
008af4e0	str wzr,[x8, #0x18]
008af4e4	stp x11,x10,[x8, #0x8]
008af4e8	str x8,[x9, #0xec0]
008af4ec	ldp x29,x30,[sp], #0x10
008af4f0	ret

; _INIT_143 @ 008aebb0
008aebb0	stp x29,x30,[sp, #-0x10]!
008aebb4	mov x29,sp
008aebb8	movi v0.2D,#0x0
008aebbc	adrp x1,0xd1f000
008aebc0	add x1,x1,#0x190
008aebc4	mov w8,#0x3f800000
008aebc8	nop
008aebcc	adr x0,0x7fbc70
008aebd0	adrp x2,0xc48000
008aebd4	add x2,x2,#0x880
008aebd8	str w8,[x1, #0x20]
008aebdc	stp q0,q0,[x1]
008aebe0	bl 0x00c2fe70
008aebe4	adrp x9,0xd1e000
008aebe8	adrp x8,0xd1f000
008aebec	add x8,x8,#0x1b8
008aebf0	ldr x10,[x9, #0xec0]
008aebf4	adrp x11,0x2ac000
008aebf8	add x11,x11,#0xf81
008aebfc	strh wzr,[x8]
008aec00	str wzr,[x8, #0x18]
008aec04	stp x11,x10,[x8, #0x8]
008aec08	str x8,[x9, #0xec0]
008aec0c	ldp x29,x30,[sp], #0x10
008aec10	ret

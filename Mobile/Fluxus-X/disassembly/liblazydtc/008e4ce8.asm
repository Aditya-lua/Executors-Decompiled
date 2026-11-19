; FUN_008e4ce8 @ 008e4ce8
008e4ce8	stp x30,x19,[sp, #-0x10]!
008e4cec	adrp x19,0xd1f000
008e4cf0	ldr x0,[x19, #0xed8]
008e4cf4	cbnz x0,0x008e4d08
008e4cf8	mov w0,#0x10
008e4cfc	bl 0x00c2fed0
008e4d00	str x0,[x19, #0xed8]
008e4d04	stp x0,x0,[x0]
008e4d08	ldp x30,x19,[sp], #0x10
008e4d0c	ret

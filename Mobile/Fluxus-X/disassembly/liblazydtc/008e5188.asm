; FUN_008e5188 @ 008e5188
008e5188	str x30,[sp, #-0x20]!
008e518c	stp x20,x19,[sp, #0x10]
008e5190	adrp x8,0xc4e000
008e5194	add x8,x8,#0x460
008e5198	add x9,x8,#0x58
008e519c	mov x20,x0
008e51a0	stp x8,x9,[x0]
008e51a4	lsl w0,w1,#0x3
008e51a8	mov w19,w1
008e51ac	bl 0x008e4ff0
008e51b0	str x0,[x20, #0x10]
008e51b4	stp wzr,w19,[x20, #0x18]
008e51b8	ldp x20,x19,[sp, #0x10]
008e51bc	ldr x30,[sp], #0x20
008e51c0	ret

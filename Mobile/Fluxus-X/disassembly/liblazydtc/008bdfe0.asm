; FUN_008bdfe0 @ 008bdfe0
008bdfe0	stp x29,x30,[sp, #-0x20]!
008bdfe4	stp x20,x19,[sp, #0x10]
008bdfe8	mov x29,sp
008bdfec	mov w20,w1
008bdff0	mov x1,x2
008bdff4	mov x19,x0
008bdff8	bl 0x008bb440
008bdffc	ldr w8,[x0, #0xc]
008be000	cbnz w8,0x008be01c
008be004	mov w8,#0x1
008be008	ldrb w9,[x19, #0x6]
008be00c	mov x0,xzr
008be010	lsl w8,w8,w20
008be014	orr w8,w9,w8
008be018	strb w8,[x19, #0x6]
008be01c	ldp x20,x19,[sp, #0x10]
008be020	ldp x29,x30,[sp], #0x20
008be024	ret

; FUN_008b47a8 @ 008b47a8
008b47a8	ldrh w9,[x0, #0x28]
008b47ac	ldrh w10,[x0, #0x2a]
008b47b0	mov x8,x0
008b47b4	cmp w9,w10
008b47b8	b.hi 0x008b47d8
008b47bc	ldr x9,[x8, #0x68]
008b47c0	mov w10,#0x1
008b47c4	mov w0,#0xffffffff
008b47c8	strb w10,[x8, #0x3]
008b47cc	sub x9,x9,w1, SXTW  #0x4
008b47d0	str x9,[x8, #0x70]
008b47d4	ret
008b47d8	stp x29,x30,[sp, #-0x10]!
008b47dc	mov x29,sp
008b47e0	adrp x1,0x2c4000
008b47e4	add x1,x1,#0xd26
008b47e8	mov x0,x8
008b47ec	bl 0x008b39cc

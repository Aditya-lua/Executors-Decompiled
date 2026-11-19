; FUN_008a13dc @ 008a13dc
008a13dc	stp x29,x30,[sp, #-0x20]!
008a13e0	str x19,[sp, #0x10]
008a13e4	mov x29,sp
008a13e8	mov x19,x0
008a13ec	bl 0x008a210c
008a13f0	ldr x9,[x19, #0x50]
008a13f4	mov x8,x0
008a13f8	mov w0,wzr
008a13fc	add x8,x8,x9
008a1400	and x9,x8,#-0x7f7f7f7f7f7f7f80
008a1404	and x8,x8,#0x7f7f7f7f7f7f7f7f
008a1408	sub x9,x9,x9, LSR #0x7
008a140c	orr x8,x9,x8
008a1410	stp x8,xzr,[x19, #0x50]
008a1414	ldr x19,[sp, #0x10]
008a1418	ldp x29,x30,[sp], #0x20
008a141c	ret

; FUN_008829cc @ 008829cc
008829cc	stp x29,x30,[sp, #-0x20]!
008829d0	str x19,[sp, #0x10]
008829d4	mov x29,sp
008829d8	mov x19,x0
008829dc	ldr x0,[x0]
008829e0	cbz x0,0x00882a10
008829e4	bl 0x00c301d0
008829e8	ldr x0,[x19, #0x18]
008829ec	str xzr,[x19]
008829f0	bl 0x00c301d0
008829f4	mov x0,xzr
008829f8	stp xzr,xzr,[x19, #0x8]
008829fc	str xzr,[x19, #0x18]
00882a00	bl 0x00c301d0
00882a04	mov w8,#0x40
00882a08	str xzr,[x19, #0x20]
00882a0c	strb w8,[x19, #0x30]
00882a10	ldr x0,[x19, #0x18]
00882a14	ldr x19,[sp, #0x10]
00882a18	ldp x29,x30,[sp], #0x20
00882a1c	b 0x00c301d0

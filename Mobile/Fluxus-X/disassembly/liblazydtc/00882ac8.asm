; FUN_00882ac8 @ 00882ac8
00882ac8	stp x29,x30,[sp, #-0x20]!
00882acc	str x19,[sp, #0x10]
00882ad0	mov x29,sp
00882ad4	mov x19,x0
00882ad8	ldr x0,[x0]
00882adc	cbz x0,0x00882b0c
00882ae0	bl 0x00c301d0
00882ae4	ldr x0,[x19, #0x18]
00882ae8	str xzr,[x19]
00882aec	bl 0x00c301d0
00882af0	mov x0,xzr
00882af4	stp xzr,xzr,[x19, #0x8]
00882af8	str xzr,[x19, #0x18]
00882afc	bl 0x00c301d0
00882b00	mov w8,#0x40
00882b04	str xzr,[x19, #0x20]
00882b08	strb w8,[x19, #0x30]
00882b0c	ldr x0,[x19, #0x18]
00882b10	ldr x19,[sp, #0x10]
00882b14	ldp x29,x30,[sp], #0x20
00882b18	b 0x00c301d0

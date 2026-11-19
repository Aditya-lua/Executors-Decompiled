; FUN_00882b1c @ 00882b1c
00882b1c	stp x29,x30,[sp, #-0x20]!
00882b20	str x19,[sp, #0x10]
00882b24	mov x29,sp
00882b28	mov x19,x0
00882b2c	ldr x0,[x0]
00882b30	cbz x0,0x00882b60
00882b34	bl 0x00c301d0
00882b38	ldr x0,[x19, #0x18]
00882b3c	str xzr,[x19]
00882b40	bl 0x00c301d0
00882b44	mov x0,xzr
00882b48	stp xzr,xzr,[x19, #0x8]
00882b4c	str xzr,[x19, #0x18]
00882b50	bl 0x00c301d0
00882b54	mov w8,#0x40
00882b58	str xzr,[x19, #0x20]
00882b5c	strb w8,[x19, #0x30]
00882b60	ldr x0,[x19, #0x18]
00882b64	ldr x19,[sp, #0x10]
00882b68	ldp x29,x30,[sp], #0x20
00882b6c	b 0x00c301d0

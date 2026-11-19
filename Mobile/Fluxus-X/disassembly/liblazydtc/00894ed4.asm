; FUN_00894ed4 @ 00894ed4
00894ed4	stp x29,x30,[sp, #-0x20]!
00894ed8	str x19,[sp, #0x10]
00894edc	mov x29,sp
00894ee0	mov x19,x0
00894ee4	ldr x0,[x0, #0x18]
00894ee8	adrp x8,0xc4b000
00894eec	add x8,x8,#0xb0
00894ef0	str x8,[x19]
00894ef4	cbz x0,0x00894f24
00894ef8	bl 0x00c301d0
00894efc	ldr x0,[x19, #0x30]
00894f00	str xzr,[x19, #0x18]
00894f04	bl 0x00c301d0
00894f08	mov x0,xzr
00894f0c	stp xzr,xzr,[x19, #0x20]
00894f10	str xzr,[x19, #0x30]
00894f14	bl 0x00c301d0
00894f18	mov w8,#0x40
00894f1c	str xzr,[x19, #0x38]
00894f20	strb w8,[x19, #0x48]
00894f24	ldr x0,[x19, #0x30]
00894f28	ldr x19,[sp, #0x10]
00894f2c	ldp x29,x30,[sp], #0x20
00894f30	b 0x00c301d0

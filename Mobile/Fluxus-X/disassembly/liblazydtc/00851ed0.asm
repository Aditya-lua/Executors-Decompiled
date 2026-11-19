; FUN_00851ed0 @ 00851ed0
00851ed0	adrp x8,0xd1e000
00851ed4	ldr w8,[x8, #0x9f0]
00851ed8	str w8,[x0]
00851edc	ldp q0,q1,[x1]
00851ee0	ldr q2,[x1, #0x20]
00851ee4	stur q2,[x0, #0x28]
00851ee8	stur q0,[x0, #0x8]
00851eec	stur q1,[x0, #0x18]
00851ef0	ret

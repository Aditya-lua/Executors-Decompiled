; FUN_00830edc @ 00830edc
00830edc	stp x29,x30,[sp, #-0x20]!
00830ee0	stp x20,x19,[sp, #0x10]
00830ee4	mov x29,sp
00830ee8	mov x19,x0
00830eec	ldr x0,[x0, #0x10]
00830ef0	cbz x0,0x00830f08
00830ef4	ldr x20,[x0]
00830ef8	mov w1,#0x20
00830efc	bl 0x00c2fe80
00830f00	mov x0,x20
00830f04	cbnz x20,0x00830ef4
00830f08	ldr x0,[x19]
00830f0c	str xzr,[x19]
00830f10	cbz x0,0x00830f28
00830f14	ldr x8,[x19, #0x8]
00830f18	lsl x1,x8,#0x3
00830f1c	ldp x20,x19,[sp, #0x10]
00830f20	ldp x29,x30,[sp], #0x20
00830f24	b 0x00c2fe80
00830f28	ldp x20,x19,[sp, #0x10]
00830f2c	ldp x29,x30,[sp], #0x20
00830f30	ret

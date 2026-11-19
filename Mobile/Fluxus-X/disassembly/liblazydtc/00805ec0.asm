; _INIT_32 @ 00805ec0
00805ec0	adrp x8,0xd1b000
00805ec4	ldrb w9,[x8, #0x38]
00805ec8	tbnz w9,#0x0,0x00805ef0
00805ecc	adrp x9,0xcb4000
00805ed0	mov w11,#0x1
00805ed4	ldr x9,[x9, #0x9b0]
00805ed8	strb w11,[x8, #0x38]
00805edc	ldr w10,[x9]
00805ee0	add w8,w10,#0x1
00805ee4	adrp x10,0xd1b000
00805ee8	str w8,[x9]
00805eec	str w8,[x10, #0x30]
00805ef0	ret

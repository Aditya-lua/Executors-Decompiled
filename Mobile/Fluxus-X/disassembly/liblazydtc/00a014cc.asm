; BN_get_params @ 00a014cc
00a014cc	cmp w0,#0x3
00a014d0	b.hi 0x00a014f8
00a014d4	adrp x9,0x751000
00a014d8	mov w8,w0
00a014dc	add x9,x9,#0xed8
00a014e0	ldrsw x8,[x9, x8, LSL #0x2]
00a014e4	add x8,x8,x9
00a014e8	br x8
00a014ec	adrp x8,0xd21000
00a014f0	ldr w0,[x8, #0x900]
00a014f4	ret
00a014f8	mov w0,wzr
00a014fc	ret
00a01500	adrp x8,0xd21000
00a01504	ldr w0,[x8, #0x904]
00a01508	ret
00a0150c	adrp x8,0xd21000
00a01510	ldr w0,[x8, #0x908]
00a01514	ret
00a01518	adrp x8,0xd21000
00a0151c	ldr w0,[x8, #0x90c]
00a01520	ret

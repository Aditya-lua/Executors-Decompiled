; FUN_00850ea4 @ 00850ea4
00850ea4	adrp x8,0xd1b000
00850ea8	adrp x9,0xc4a000
00850eac	add x9,x9,#0x508
00850eb0	ldr w8,[x8, #0x280]
00850eb4	str x9,[x0]
00850eb8	str w8,[x0, #0x8]
00850ebc	adrp x8,0xc49000
00850ec0	add x8,x8,#0xce0
00850ec4	ldr q0,[x1]
00850ec8	str x8,[x0]
00850ecc	stur q0,[x0, #0xc]
00850ed0	ret

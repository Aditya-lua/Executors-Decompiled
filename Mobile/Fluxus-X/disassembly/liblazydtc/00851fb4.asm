; FUN_00851fb4 @ 00851fb4
00851fb4	adrp x8,0xd1e000
00851fb8	stp x1,x2,[x0, #0x8]
00851fbc	ldr w8,[x8, #0xa80]
00851fc0	stp x3,x4,[x0, #0x18]
00851fc4	str x5,[x0, #0x28]
00851fc8	str w8,[x0]
00851fcc	ret

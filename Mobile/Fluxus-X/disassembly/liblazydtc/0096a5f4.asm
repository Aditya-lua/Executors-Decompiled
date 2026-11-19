; FUN_0096a5f4 @ 0096a5f4
0096a5f4	adrp x8,0xcc4000
0096a5f8	ldr x8,[x8, #0xd08]
0096a5fc	ldr w8,[x8, #0x10]
0096a600	tst w8,w1
0096a604	cset w0,ne
0096a608	ret

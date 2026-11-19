; FUN_009fd66c @ 009fd66c
009fd66c	stp x29,x30,[sp, #-0x10]!
009fd670	mov x29,sp
009fd674	bl 0x00c34d50
009fd678	adrp x8,0xcb5000
009fd67c	ldr x8,[x8, #0x3c0]
009fd680	cmp x0,#0x0
009fd684	adrp x9,0xd21000
009fd688	str x0,[x8]
009fd68c	cset w8,ne
009fd690	str w8,[x9, #0x8fc]
009fd694	ldp x29,x30,[sp], #0x10
009fd698	ret

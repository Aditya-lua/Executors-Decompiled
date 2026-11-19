; FUN_008ab214 @ 008ab214
008ab214	cmn w1,#0x1
008ab218	b.eq 0x008ab22c
008ab21c	adrp x8,0xc4d000
008ab220	add x8,x8,#0x168
008ab224	ldr x0,[x8, w1, SXTW #0x3]
008ab228	ret
008ab22c	adrp x0,0x2ba000
008ab230	add x0,x0,#0xf0d
008ab234	ret

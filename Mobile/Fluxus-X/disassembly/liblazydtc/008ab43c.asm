; FUN_008ab43c @ 008ab43c
008ab43c	stp x29,x30,[sp, #-0x10]!
008ab440	mov x29,sp
008ab444	bl 0x008ab0e0
008ab448	cmp w0,#0x5
008ab44c	ccmp w0,#0x3,#0x4,ne
008ab450	cset w0,eq
008ab454	ldp x29,x30,[sp], #0x10
008ab458	ret

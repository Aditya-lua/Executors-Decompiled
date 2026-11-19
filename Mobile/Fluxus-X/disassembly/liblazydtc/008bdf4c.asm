; _INIT_168 @ 008bdf4c
008bdf4c	movi v0.2D,#0x0
008bdf50	adrp x1,0xd1f000
008bdf54	add x1,x1,#0xc60
008bdf58	mov w8,#0x3f800000
008bdf5c	nop
008bdf60	adr x0,0x7fbc70
008bdf64	adrp x2,0xc48000
008bdf68	add x2,x2,#0x880
008bdf6c	str w8,[x1, #0x20]
008bdf70	stp q0,q0,[x1]
008bdf74	b 0x00c2fe70

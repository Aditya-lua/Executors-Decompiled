; FUN_008abe60 @ 008abe60
008abe60	stp x29,x30,[sp, #-0x20]!
008abe64	str x19,[sp, #0x10]
008abe68	mov x29,sp
008abe6c	cmp w1,#0x1
008abe70	b.lt 0x008abeac
008abe74	ldp x9,x8,[x0, #0x68]
008abe78	add x8,x8,w1, UXTW  #0x4
008abe7c	sub x0,x8,#0x10
008abe80	cmp x0,x9
008abe84	b.cc 0x008abec8
008abe88	adrp x8,0xd1f000
008abe8c	add x8,x8,#0x1e0
008abe90	adrp x19,0xd1f000
008abe94	ldarb w8,[x8]
008abe98	tbz w8,#0x0,0x008abeec
008abe9c	ldr x8,[x19, #0x1d8]
008abea0	add x8,x8,#0x7f2, LSL #12
008abea4	add x0,x8,#0xef0
008abea8	b 0x008abec8
008abeac	mov w8,#0xffffd8f1
008abeb0	cmp w1,w8
008abeb4	b.lt 0x008abec4
008abeb8	ldr x8,[x0, #0x68]
008abebc	add x0,x8,w1, SXTW  #0x4
008abec0	b 0x008abec8
008abec4	bl 0x008aea7c
008abec8	ldr w8,[x0, #0xc]
008abecc	cmp w8,#0x9
008abed0	b.ne 0x008abedc
008abed4	ldr x0,[x0]
008abed8	b 0x008abee0
008abedc	mov x0,xzr
008abee0	ldr x19,[sp, #0x10]
008abee4	ldp x29,x30,[sp], #0x20
008abee8	ret
008abeec	adrp x0,0xd1f000
008abef0	add x0,x0,#0x1e0
008abef4	bl 0x00c2fe90
008abef8	cbz w0,0x008abe9c
008abefc	adrp x8,0xcca000
008abf00	ldr x0,[x8, #0x8c8]
008abf04	bl 0x007fe1ec
008abf08	str x0,[x19, #0x1d8]
008abf0c	adrp x0,0xd1f000
008abf10	add x0,x0,#0x1e0
008abf14	bl 0x00c2fea0
008abf18	b 0x008abe9c

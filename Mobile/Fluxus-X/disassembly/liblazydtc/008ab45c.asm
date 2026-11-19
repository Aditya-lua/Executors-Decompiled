; FUN_008ab45c @ 008ab45c
008ab45c	stp x29,x30,[sp, #-0x20]!
008ab460	str x19,[sp, #0x10]
008ab464	mov x29,sp
008ab468	cmp w1,#0x1
008ab46c	b.lt 0x008ab4a8
008ab470	ldp x9,x8,[x0, #0x68]
008ab474	add x8,x8,w1, UXTW  #0x4
008ab478	sub x0,x8,#0x10
008ab47c	cmp x0,x9
008ab480	b.cc 0x008ab4c4
008ab484	adrp x8,0xd1f000
008ab488	add x8,x8,#0x1e0
008ab48c	adrp x19,0xd1f000
008ab490	ldarb w8,[x8]
008ab494	tbz w8,#0x0,0x008ab4e0
008ab498	ldr x8,[x19, #0x1d8]
008ab49c	add x8,x8,#0x7f2, LSL #12
008ab4a0	add x0,x8,#0xef0
008ab4a4	b 0x008ab4c4
008ab4a8	mov w8,#0xffffd8f1
008ab4ac	cmp w1,w8
008ab4b0	b.lt 0x008ab4c0
008ab4b4	ldr x8,[x0, #0x68]
008ab4b8	add x0,x8,w1, SXTW  #0x4
008ab4bc	b 0x008ab4c4
008ab4c0	bl 0x008aea7c
008ab4c4	ldr w8,[x0, #0xc]
008ab4c8	cmp w8,#0x8
008ab4cc	ccmp w8,#0x2,#0x4,ne
008ab4d0	cset w0,eq
008ab4d4	ldr x19,[sp, #0x10]
008ab4d8	ldp x29,x30,[sp], #0x20
008ab4dc	ret
008ab4e0	adrp x0,0xd1f000
008ab4e4	add x0,x0,#0x1e0
008ab4e8	bl 0x00c2fe90
008ab4ec	cbz w0,0x008ab498
008ab4f0	adrp x8,0xcca000
008ab4f4	ldr x0,[x8, #0x8c8]
008ab4f8	bl 0x007fe1ec
008ab4fc	str x0,[x19, #0x1d8]
008ab500	adrp x0,0xd1f000
008ab504	add x0,x0,#0x1e0
008ab508	bl 0x00c2fea0
008ab50c	b 0x008ab498

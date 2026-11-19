; FUN_008ab0e0 @ 008ab0e0
008ab0e0	stp x29,x30,[sp, #-0x30]!
008ab0e4	str x21,[sp, #0x10]
008ab0e8	stp x20,x19,[sp, #0x20]
008ab0ec	mov x29,sp
008ab0f0	mov w19,#0x2ef0
008ab0f4	cmp w1,#0x1
008ab0f8	adrp x21,0xd1f000
008ab0fc	add x21,x21,#0x1e0
008ab100	movk w19,#0x7f, LSL #16
008ab104	adrp x20,0xd1f000
008ab108	b.lt 0x008ab134
008ab10c	ldp x9,x8,[x0, #0x68]
008ab110	add x8,x8,w1, UXTW  #0x4
008ab114	sub x0,x8,#0x10
008ab118	cmp x0,x9
008ab11c	b.cc 0x008ab150
008ab120	ldarb w8,[x21]
008ab124	tbz w8,#0x0,0x008ab1c8
008ab128	ldr x8,[x20, #0x1d8]
008ab12c	add x0,x8,x19
008ab130	b 0x008ab150
008ab134	mov w8,#0xffffd8f1
008ab138	cmp w1,w8
008ab13c	b.lt 0x008ab14c
008ab140	ldr x8,[x0, #0x68]
008ab144	add x0,x8,w1, SXTW  #0x4
008ab148	b 0x008ab150
008ab14c	bl 0x008aea7c
008ab150	ldarb w8,[x21]
008ab154	tbz w8,#0x0,0x008ab184
008ab158	ldr x8,[x20, #0x1d8]
008ab15c	add x8,x8,x19
008ab160	cmp x0,x8
008ab164	b.eq 0x008ab170
008ab168	ldr w0,[x0, #0xc]
008ab16c	b 0x008ab174
008ab170	mov w0,#0xffffffff
008ab174	ldp x20,x19,[sp, #0x20]
008ab178	ldr x21,[sp, #0x10]
008ab17c	ldp x29,x30,[sp], #0x30
008ab180	ret
008ab184	adrp x8,0xd1f000
008ab188	add x8,x8,#0x1e0
008ab18c	mov x21,x0
008ab190	mov x0,x8
008ab194	bl 0x00c2fe90
008ab198	mov w8,w0
008ab19c	mov x0,x21
008ab1a0	cbz w8,0x008ab158
008ab1a4	adrp x8,0xcca000
008ab1a8	ldr x0,[x8, #0x8c8]
008ab1ac	bl 0x007fe1ec
008ab1b0	str x0,[x20, #0x1d8]
008ab1b4	adrp x0,0xd1f000
008ab1b8	add x0,x0,#0x1e0
008ab1bc	bl 0x00c2fea0
008ab1c0	mov x0,x21
008ab1c4	b 0x008ab158
008ab1c8	adrp x0,0xd1f000
008ab1cc	add x0,x0,#0x1e0
008ab1d0	bl 0x00c2fe90
008ab1d4	cbz w0,0x008ab128
008ab1d8	adrp x8,0xcca000
008ab1dc	ldr x0,[x8, #0x8c8]
008ab1e0	bl 0x007fe1ec
008ab1e4	str x0,[x20, #0x1d8]
008ab1e8	adrp x0,0xd1f000
008ab1ec	add x0,x0,#0x1e0
008ab1f0	bl 0x00c2fea0
008ab1f4	b 0x008ab128

; FUN_008ab318 @ 008ab318
008ab318	sub sp,sp,#0x40
008ab31c	stp x29,x30,[sp, #0x20]
008ab320	stp x20,x19,[sp, #0x30]
008ab324	add x29,sp,#0x20
008ab328	mrs x19,tpidr_el0
008ab32c	ldr x8,[x19, #0x28]
008ab330	cmp w1,#0x1
008ab334	stur x8,[x29, #-0x8]
008ab338	b.lt 0x008ab374
008ab33c	ldp x9,x8,[x0, #0x68]
008ab340	add x8,x8,w1, UXTW  #0x4
008ab344	sub x0,x8,#0x10
008ab348	cmp x0,x9
008ab34c	b.cc 0x008ab390
008ab350	adrp x8,0xd1f000
008ab354	add x8,x8,#0x1e0
008ab358	ldarb w9,[x8]
008ab35c	adrp x8,0xd1f000
008ab360	tbz w9,#0x0,0x008ab3d4
008ab364	ldr x8,[x8, #0x1d8]
008ab368	add x8,x8,#0x7f2, LSL #12
008ab36c	add x0,x8,#0xef0
008ab370	b 0x008ab390
008ab374	mov w8,#0xffffd8f1
008ab378	cmp w1,w8
008ab37c	b.lt 0x008ab38c
008ab380	ldr x8,[x0, #0x68]
008ab384	add x0,x8,w1, SXTW  #0x4
008ab388	b 0x008ab390
008ab38c	bl 0x008aea7c
008ab390	ldr w8,[x0, #0xc]
008ab394	cmp w8,#0x3
008ab398	b.ne 0x008ab3a4
008ab39c	mov w0,#0x1
008ab3a0	b 0x008ab3b4
008ab3a4	add x1,sp,#0x8
008ab3a8	bl 0x008cacb4
008ab3ac	cmp x0,#0x0
008ab3b0	cset w0,ne
008ab3b4	ldr x8,[x19, #0x28]
008ab3b8	ldur x9,[x29, #-0x8]
008ab3bc	cmp x8,x9
008ab3c0	b.ne 0x008ab438
008ab3c4	ldp x20,x19,[sp, #0x30]
008ab3c8	ldp x29,x30,[sp, #0x20]
008ab3cc	add sp,sp,#0x40
008ab3d0	ret
008ab3d4	adrp x0,0xd1f000
008ab3d8	add x0,x0,#0x1e0
008ab3dc	bl 0x00c2fe90
008ab3e0	adrp x8,0xd1f000
008ab3e4	cbz w0,0x008ab364
008ab3e8	adrp x8,0xcca000
008ab3ec	ldr x0,[x8, #0x8c8]
008ab3f0	bl 0x007fe1ec
008ab3f4	adrp x20,0xd1f000
008ab3f8	str x0,[x20, #0x1d8]
008ab3fc	adrp x0,0xd1f000
008ab400	add x0,x0,#0x1e0
008ab404	bl 0x00c2fea0
008ab408	mov x8,x20
008ab40c	b 0x008ab364
008ab438	bl 0x00c2fec0

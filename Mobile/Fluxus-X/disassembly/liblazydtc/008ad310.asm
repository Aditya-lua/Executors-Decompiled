; FUN_008ad310 @ 008ad310
008ad310	stp x29,x30,[sp, #-0x20]!
008ad314	str x19,[sp, #0x10]
008ad318	mov x29,sp
008ad31c	cmp w1,#0x1
008ad320	b.lt 0x008ad35c
008ad324	ldp x9,x8,[x0, #0x68]
008ad328	add x8,x8,w1, UXTW  #0x4
008ad32c	sub x0,x8,#0x10
008ad330	cmp x0,x9
008ad334	b.cc 0x008ad378
008ad338	adrp x8,0xd1f000
008ad33c	add x8,x8,#0x1e0
008ad340	adrp x19,0xd1f000
008ad344	ldarb w8,[x8]
008ad348	tbz w8,#0x0,0x008ad388
008ad34c	ldr x8,[x19, #0x1d8]
008ad350	add x8,x8,#0x7f2, LSL #12
008ad354	add x0,x8,#0xef0
008ad358	b 0x008ad378
008ad35c	mov w8,#0xffffd8f1
008ad360	cmp w1,w8
008ad364	b.lt 0x008ad374
008ad368	ldr x8,[x0, #0x68]
008ad36c	add x0,x8,w1, SXTW  #0x4
008ad370	b 0x008ad378
008ad374	bl 0x008aea7c
008ad378	ldr x0,[x0]
008ad37c	ldr x19,[sp, #0x10]
008ad380	ldp x29,x30,[sp], #0x20
008ad384	b 0x008bd774
008ad388	adrp x0,0xd1f000
008ad38c	add x0,x0,#0x1e0
008ad390	bl 0x00c2fe90
008ad394	cbz w0,0x008ad34c
008ad398	adrp x8,0xcca000
008ad39c	ldr x0,[x8, #0x8c8]
008ad3a0	bl 0x007fe1ec
008ad3a4	str x0,[x19, #0x1d8]
008ad3a8	adrp x0,0xd1f000
008ad3ac	add x0,x0,#0x1e0
008ad3b0	bl 0x00c2fea0
008ad3b4	b 0x008ad34c

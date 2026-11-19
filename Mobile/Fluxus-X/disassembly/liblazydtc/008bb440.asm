; FUN_008bb440 @ 008bb440
008bb440	stp x29,x30,[sp, #-0x20]!
008bb444	str x19,[sp, #0x10]
008bb448	mov x29,sp
008bb44c	ldrb w9,[x0, #0x5]
008bb450	mov w8,#0xffffffff
008bb454	ldr w10,[x1, #0x10]
008bb458	lsl w8,w8,w9
008bb45c	ldr x9,[x0, #0x28]
008bb460	bic w8,w10,w8
008bb464	add x0,x9,x8, LSL #0x5
008bb468	ldr w8,[x0, #0x1c]
008bb46c	and w9,w8,#0xf
008bb470	cmp w9,#0x5
008bb474	b.ne 0x008bb484
008bb478	ldr x9,[x0, #0x10]
008bb47c	cmp x9,x1
008bb480	b.eq 0x008bb4b8
008bb484	cmp w8,#0x10
008bb488	b.cc 0x008bb498
008bb48c	sbfx x8,x8,#0x4,#0x1c
008bb490	add x0,x0,x8, LSL #0x5
008bb494	b 0x008bb468
008bb498	adrp x8,0xd1f000
008bb49c	add x8,x8,#0x1e0
008bb4a0	adrp x19,0xd1f000
008bb4a4	ldarb w8,[x8]
008bb4a8	tbz w8,#0x0,0x008bb4c4
008bb4ac	ldr x8,[x19, #0x1d8]
008bb4b0	add x8,x8,#0x7f2, LSL #12
008bb4b4	add x0,x8,#0xef0
008bb4b8	ldr x19,[sp, #0x10]
008bb4bc	ldp x29,x30,[sp], #0x20
008bb4c0	ret
008bb4c4	adrp x0,0xd1f000
008bb4c8	add x0,x0,#0x1e0
008bb4cc	bl 0x00c2fe90
008bb4d0	cbz w0,0x008bb4ac
008bb4d4	adrp x8,0xcca000
008bb4d8	ldr x0,[x8, #0x8c8]
008bb4dc	bl 0x007fe1ec
008bb4e0	str x0,[x19, #0x1d8]
008bb4e4	adrp x0,0xd1f000
008bb4e8	add x0,x0,#0x1e0
008bb4ec	bl 0x00c2fea0
008bb4f0	b 0x008bb4ac

; FUN_008ad3d0 @ 008ad3d0
008ad3d0	stp x29,x30,[sp, #-0x20]!
008ad3d4	str x19,[sp, #0x10]
008ad3d8	mov x29,sp
008ad3dc	cmp w1,#0x1
008ad3e0	b.lt 0x008ad41c
008ad3e4	ldp x9,x8,[x0, #0x68]
008ad3e8	add x8,x8,w1, UXTW  #0x4
008ad3ec	sub x0,x8,#0x10
008ad3f0	cmp x0,x9
008ad3f4	b.cc 0x008ad440
008ad3f8	adrp x8,0xd1f000
008ad3fc	add x8,x8,#0x1e0
008ad400	adrp x19,0xd1f000
008ad404	ldarb w8,[x8]
008ad408	tbz w8,#0x0,0x008ad45c
008ad40c	ldr x8,[x19, #0x1d8]
008ad410	add x8,x8,#0x7f2, LSL #12
008ad414	add x0,x8,#0xef0
008ad418	b 0x008ad440
008ad41c	mov w8,#0xffffd8f1
008ad420	cmp w1,w8
008ad424	b.lt 0x008ad434
008ad428	ldr x8,[x0, #0x68]
008ad42c	add x0,x8,w1, SXTW  #0x4
008ad430	b 0x008ad440
008ad434	mov w19,w2
008ad438	bl 0x008aea7c
008ad43c	mov w2,w19
008ad440	ldr x8,[x0]
008ad444	cmp w2,#0x0
008ad448	cset w9,ne
008ad44c	strb w9,[x8, #0x3]
008ad450	ldr x19,[sp, #0x10]
008ad454	ldp x29,x30,[sp], #0x20
008ad458	ret
008ad45c	adrp x0,0xd1f000
008ad460	add x0,x0,#0x1e0
008ad464	str w2,[x29, #0x1c]
008ad468	bl 0x00c2fe90
008ad46c	ldr w2,[x29, #0x1c]
008ad470	cbz w0,0x008ad40c
008ad474	adrp x8,0xcca000
008ad478	ldr x0,[x8, #0x8c8]
008ad47c	bl 0x007fe1ec
008ad480	str x0,[x19, #0x1d8]
008ad484	adrp x0,0xd1f000
008ad488	add x0,x0,#0x1e0
008ad48c	bl 0x00c2fea0
008ad490	ldr w2,[x29, #0x1c]
008ad494	b 0x008ad40c

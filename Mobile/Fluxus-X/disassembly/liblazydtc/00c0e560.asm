; FUN_00c0e560 @ 00c0e560
00c0e560	bti c
00c0e564	ldr x8,[x1, #0x10]
00c0e568	ldr x9,[x0, #0x8]
00c0e56c	ldr x8,[x8, #0x8]
00c0e570	cmp x9,x8
00c0e574	b.eq 0x00c0e588
00c0e578	ldr x0,[x0, #0x10]
00c0e57c	ldr x8,[x0]
00c0e580	ldr x16,[x8, #0x38]
00c0e584	br x16
00c0e588	ldr w8,[x1, #0x3c]
00c0e58c	cbz w8,0x00c0e5c8
00c0e590	ldr x9,[x1, #0x28]
00c0e594	ldr x10,[x1, #0x50]
00c0e598	cmp x9,x10
00c0e59c	b.ne 0x00c0e5ac
00c0e5a0	ldr x9,[x1, #0x20]
00c0e5a4	cmp x9,x2
00c0e5a8	b.eq 0x00c0e5e0
00c0e5ac	add w8,w8,#0x1
00c0e5b0	mov w9,#0x2
00c0e5b4	str w8,[x1, #0x3c]
00c0e5b8	mov w8,#0x1
00c0e5bc	str w9,[x1, #0x30]
00c0e5c0	strb w8,[x1, #0x4e]
00c0e5c4	ret
00c0e5c8	ldr x8,[x1, #0x50]
00c0e5cc	mov w9,#0x1
00c0e5d0	str w3,[x1, #0x30]
00c0e5d4	str w9,[x1, #0x3c]
00c0e5d8	stp x2,x8,[x1, #0x20]
00c0e5dc	ret
00c0e5e0	ldr w8,[x1, #0x30]
00c0e5e4	cmp w8,#0x2
00c0e5e8	b.ne 0x00c0e5c4
00c0e5ec	str w3,[x1, #0x30]
00c0e5f0	ret

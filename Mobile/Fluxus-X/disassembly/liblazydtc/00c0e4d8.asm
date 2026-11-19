; FUN_00c0e4d8 @ 00c0e4d8
00c0e4d8	bti c
00c0e4dc	ldr x8,[x1, #0x10]
00c0e4e0	ldr x9,[x0, #0x8]
00c0e4e4	ldr x8,[x8, #0x8]
00c0e4e8	cmp x9,x8
00c0e4ec	b.eq 0x00c0e4f4
00c0e4f0	ret
00c0e4f4	ldr w8,[x1, #0x3c]
00c0e4f8	cbz w8,0x00c0e534
00c0e4fc	ldr x9,[x1, #0x28]
00c0e500	ldr x10,[x1, #0x50]
00c0e504	cmp x9,x10
00c0e508	b.ne 0x00c0e518
00c0e50c	ldr x9,[x1, #0x20]
00c0e510	cmp x9,x2
00c0e514	b.eq 0x00c0e54c
00c0e518	add w8,w8,#0x1
00c0e51c	mov w9,#0x2
00c0e520	str w8,[x1, #0x3c]
00c0e524	mov w8,#0x1
00c0e528	str w9,[x1, #0x30]
00c0e52c	strb w8,[x1, #0x4e]
00c0e530	ret
00c0e534	ldr x8,[x1, #0x50]
00c0e538	mov w9,#0x1
00c0e53c	str w3,[x1, #0x30]
00c0e540	str w9,[x1, #0x3c]
00c0e544	stp x2,x8,[x1, #0x20]
00c0e548	ret
00c0e54c	ldr w8,[x1, #0x30]
00c0e550	cmp w8,#0x2
00c0e554	b.ne 0x00c0e4f0
00c0e558	str w3,[x1, #0x30]
00c0e55c	ret

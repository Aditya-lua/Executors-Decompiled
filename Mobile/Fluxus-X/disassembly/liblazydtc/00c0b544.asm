; FUN_00c0b544 @ 00c0b544
00c0b544	bti c
00c0b548	ldr x8,[x0]
00c0b54c	ldr x0,[x8]
00c0b550	cbz x0,0x00c0b574
00c0b554	add x9,x8,#0x18
00c0b558	str x0,[x8, #0x8]
00c0b55c	cmp x0,x9
00c0b560	b.eq 0x00c0b570
00c0b564	ldr x8,[x8, #0x10]
00c0b568	sub x1,x8,x0
00c0b56c	b 0x00c2fe80
00c0b570	strb wzr,[x8, #0x108]
00c0b574	ret

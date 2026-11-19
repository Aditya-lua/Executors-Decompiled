; WPACKET_set_max_size @ 00a9ce0c
00a9ce0c	ldr x8,[x0, #0x28]
00a9ce10	cbz x8,0x00a9ce70
00a9ce14	mov x9,x8
00a9ce18	ldr x8,[x8]
00a9ce1c	cbnz x8,0x00a9ce14
00a9ce20	ldr x8,[x9, #0x10]
00a9ce24	mov w9,#0x8
00a9ce28	cmp x8,#0x0
00a9ce2c	csel x9,x9,x8,eq
00a9ce30	sub x8,x9,#0x1
00a9ce34	cmp x8,#0x6
00a9ce38	b.hi 0x00a9ce58
00a9ce3c	lsl x9,x9,#0x3
00a9ce40	mov w10,#0x1
00a9ce44	lsl x9,x10,x9
00a9ce48	add x8,x9,x8
00a9ce4c	cmp x8,x1
00a9ce50	mov w8,wzr
00a9ce54	b.cc 0x00a9ce70
00a9ce58	ldr x8,[x0, #0x18]
00a9ce5c	cmp x8,x1
00a9ce60	mov w8,wzr
00a9ce64	b.hi 0x00a9ce70
00a9ce68	mov w8,#0x1
00a9ce6c	str x1,[x0, #0x20]
00a9ce70	mov w0,w8
00a9ce74	ret

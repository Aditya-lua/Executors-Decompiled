; WPACKET_init_len @ 00a9c830
00a9c830	cbz x1,0x00a9c84c
00a9c834	sub x8,x2,#0x1
00a9c838	cmp x8,#0x6
00a9c83c	stp x1,xzr,[x0]
00a9c840	b.ls 0x00a9c854
00a9c844	mov x8,#-0x1
00a9c848	b 0x00a9c864
00a9c84c	mov w0,wzr
00a9c850	ret
00a9c854	lsl x9,x2,#0x3
00a9c858	mov w10,#0x1
00a9c85c	lsl x9,x10,x9
00a9c860	add x8,x9,x8
00a9c864	ldrb w9,[x0, #0x30]
00a9c868	str x8,[x0, #0x20]
00a9c86c	mov x1,x2
00a9c870	and w8,w9,#0xfe
00a9c874	strb w8,[x0, #0x30]
00a9c878	b 0x00a9c6c0

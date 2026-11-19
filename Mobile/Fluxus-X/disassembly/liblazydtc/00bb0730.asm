; ZSTD_insertBlock @ 00bb0730
00bb0730	stp x29,x30,[sp, #-0x30]!
00bb0734	str x21,[sp, #0x10]
00bb0738	stp x20,x19,[sp, #0x20]
00bb073c	mov x29,sp
00bb0740	mov x19,x2
00bb0744	mov x20,x1
00bb0748	mov x21,x0
00bb074c	bl 0x00c43630
00bb0750	add x8,x20,x19
00bb0754	mov x0,x19
00bb0758	str x8,[x21, #0x74c0]
00bb075c	ldp x20,x19,[sp, #0x20]
00bb0760	ldr x21,[sp, #0x10]
00bb0764	ldp x29,x30,[sp], #0x30
00bb0768	ret

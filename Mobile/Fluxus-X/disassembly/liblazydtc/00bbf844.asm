; ZSTD_decompressBlock_deprecated @ 00bbf844
00bbf844	stp x29,x30,[sp, #-0x20]!
00bbf848	stp x20,x19,[sp, #0x10]
00bbf84c	mov x29,sp
00bbf850	mov x19,x0
00bbf854	mov x20,x1
00bbf858	mov w8,#0x75e0
00bbf85c	str wzr,[x0, x8#0x0]
00bbf860	cbz x2,0x00bbf88c
00bbf864	ldr x8,[x19, #0x74c0]
00bbf868	cmp x20,x8
00bbf86c	b.eq 0x00bbf88c
00bbf870	ldr x9,[x19, #0x74c8]
00bbf874	str x8,[x19, #0x74d8]
00bbf878	str x20,[x19, #0x74c8]
00bbf87c	sub x8,x9,x8
00bbf880	str x20,[x19, #0x74c0]
00bbf884	add x8,x20,x8
00bbf888	str x8,[x19, #0x74d0]
00bbf88c	mov x0,x19
00bbf890	mov x1,x20
00bbf894	mov w5,wzr
00bbf898	bl 0x00c43640
00bbf89c	cmn x0,#0x78
00bbf8a0	b.hi 0x00bbf8ac
00bbf8a4	add x8,x20,x0
00bbf8a8	str x8,[x19, #0x74c0]
00bbf8ac	ldp x20,x19,[sp, #0x10]
00bbf8b0	ldp x29,x30,[sp], #0x20
00bbf8b4	ret

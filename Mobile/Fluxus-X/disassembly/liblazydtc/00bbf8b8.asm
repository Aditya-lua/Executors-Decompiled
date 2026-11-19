; ZSTD_decompressBlock @ 00bbf8b8
00bbf8b8	stp x29,x30,[sp, #-0x20]!
00bbf8bc	stp x20,x19,[sp, #0x10]
00bbf8c0	mov x29,sp
00bbf8c4	mov x19,x0
00bbf8c8	mov x20,x1
00bbf8cc	mov w8,#0x75e0
00bbf8d0	str wzr,[x0, x8#0x0]
00bbf8d4	cbz x2,0x00bbf900
00bbf8d8	ldr x8,[x19, #0x74c0]
00bbf8dc	cmp x20,x8
00bbf8e0	b.eq 0x00bbf900
00bbf8e4	ldr x9,[x19, #0x74c8]
00bbf8e8	str x8,[x19, #0x74d8]
00bbf8ec	str x20,[x19, #0x74c8]
00bbf8f0	sub x8,x9,x8
00bbf8f4	str x20,[x19, #0x74c0]
00bbf8f8	add x8,x20,x8
00bbf8fc	str x8,[x19, #0x74d0]
00bbf900	mov x0,x19
00bbf904	mov x1,x20
00bbf908	mov w5,wzr
00bbf90c	bl 0x00c43640
00bbf910	cmn x0,#0x78
00bbf914	b.hi 0x00bbf920
00bbf918	add x8,x20,x0
00bbf91c	str x8,[x19, #0x74c0]
00bbf920	ldp x20,x19,[sp, #0x10]
00bbf924	ldp x29,x30,[sp], #0x20
00bbf928	ret

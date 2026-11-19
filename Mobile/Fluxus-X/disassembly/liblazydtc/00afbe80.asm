; FUN_00afbe80 @ 00afbe80
00afbe80	stp x20,x19,[sp, #-0x20]!
00afbe84	mov w8,w3
00afbe88	mov x19,x1
00afbe8c	adrp x1,0x2bb000
00afbe90	adrp x3,0x2ab000
00afbe94	mov x20,x2
00afbe98	add x1,x1,#0x9d8
00afbe9c	add x3,x3,#0x32c
00afbea0	mov x0,x2
00afbea4	mov w2,w8
00afbea8	stp x29,x30,[sp, #0x10]
00afbeac	add x29,sp,#0x10
00afbeb0	bl 0x00c32250
00afbeb4	cmp w0,#0x1
00afbeb8	b.lt 0x00afbed4
00afbebc	mov x0,x20
00afbec0	mov x1,x19
00afbec4	bl 0x00c32da0
00afbec8	cmp w0,#0x0
00afbecc	cset w0,gt
00afbed0	b 0x00afbed8
00afbed4	mov w0,wzr
00afbed8	ldp x29,x30,[sp, #0x10]
00afbedc	ldp x20,x19,[sp], #0x20
00afbee0	ret

; FUN_00b4ec1c @ 00b4ec1c
00b4ec1c	stp x20,x19,[sp, #-0x20]!
00b4ec20	stp x29,x30,[sp, #0x10]
00b4ec24	add x29,sp,#0x10
00b4ec28	mov w20,w1
00b4ec2c	mov x19,x0
00b4ec30	bl 0x00c41000
00b4ec34	mov w8,w0
00b4ec38	mov w0,wzr
00b4ec3c	cbz x19,0x00b4ecac
00b4ec40	cbz w8,0x00b4ecac
00b4ec44	mov w8,#0x87
00b4ec48	tst w20,w8
00b4ec4c	b.eq 0x00b4ec78
00b4ec50	tbnz w20,#0x1,0x00b4ec80
00b4ec54	mov w0,#0x1
00b4ec58	tbz w20,#0x0,0x00b4ec94
00b4ec5c	cbz w0,0x00b4ec94
00b4ec60	mov x0,x19
00b4ec64	bl 0x00c3a7d0
00b4ec68	cmp x0,#0x0
00b4ec6c	cset w0,ne
00b4ec70	tbnz w20,#0x2,0x00b4ec98
00b4ec74	b 0x00b4ecac
00b4ec78	mov w0,#0x1
00b4ec7c	b 0x00b4ecac
00b4ec80	mov x0,x19
00b4ec84	bl 0x00c3a7e0
00b4ec88	cmp x0,#0x0
00b4ec8c	cset w0,ne
00b4ec90	tbnz w20,#0x0,0x00b4ec5c
00b4ec94	tbz w20,#0x2,0x00b4ecac
00b4ec98	cbz w0,0x00b4ecac
00b4ec9c	mov x0,x19
00b4eca0	bl 0x00c36880
00b4eca4	cmp x0,#0x0
00b4eca8	cset w0,ne
00b4ecac	ldp x29,x30,[sp, #0x10]
00b4ecb0	ldp x20,x19,[sp], #0x20
00b4ecb4	ret

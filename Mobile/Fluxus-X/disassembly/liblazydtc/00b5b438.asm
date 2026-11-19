; FUN_00b5b438 @ 00b5b438
00b5b438	stp x20,x19,[sp, #-0x20]!
00b5b43c	mov x19,x1
00b5b440	adrp x1,0x2ae000
00b5b444	mov x20,x0
00b5b448	add x1,x1,#0x5d4
00b5b44c	mov x0,x19
00b5b450	stp x29,x30,[sp, #0x10]
00b5b454	add x29,sp,#0x10
00b5b458	bl 0x00c3e8c0
00b5b45c	cbz x0,0x00b5b46c
00b5b460	ldr w1,[x20, #0x8]
00b5b464	bl 0x00c3da90
00b5b468	cbz w0,0x00b5b4b0
00b5b46c	adrp x1,0x29e000
00b5b470	add x1,x1,#0x95d
00b5b474	mov x0,x19
00b5b478	bl 0x00c3e8c0
00b5b47c	cbz x0,0x00b5b48c
00b5b480	mov w1,#0x400
00b5b484	bl 0x00c3da90
00b5b488	cbz w0,0x00b5b4b0
00b5b48c	adrp x1,0x2bc000
00b5b490	add x1,x1,#0x3b2
00b5b494	mov x0,x19
00b5b498	bl 0x00c3e8c0
00b5b49c	cbz x0,0x00b5b4ac
00b5b4a0	mov w1,#0x80
00b5b4a4	bl 0x00c3e950
00b5b4a8	cbz w0,0x00b5b4b0
00b5b4ac	mov w0,#0x1
00b5b4b0	ldp x29,x30,[sp, #0x10]
00b5b4b4	ldp x20,x19,[sp], #0x20
00b5b4b8	ret

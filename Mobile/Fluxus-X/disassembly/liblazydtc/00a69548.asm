; evp_get_digestbyname_ex @ 00a69548
00a69548	sub sp,sp,#0x30
00a6954c	stp x20,x19,[sp, #0x10]
00a69550	mov x19,x1
00a69554	mov x20,x0
00a69558	mov w0,#0x8
00a6955c	mov x1,xzr
00a69560	stp x29,x30,[sp, #0x20]
00a69564	add x29,sp,#0x20
00a69568	bl 0x00c35500
00a6956c	cbz w0,0x00a695c4
00a69570	mov w1,#0x1
00a69574	mov x0,x19
00a69578	bl 0x00c3c230
00a6957c	str x0,[sp, #0x8]
00a69580	cbnz x0,0x00a695c8
00a69584	mov x0,x20
00a69588	bl 0x00c3b650
00a6958c	mov x1,x19
00a69590	mov x20,x0
00a69594	bl 0x00c3b620
00a69598	cbz w0,0x00a695c4
00a6959c	adrp x2,0xa69000
00a695a0	mov w1,w0
00a695a4	add x2,x2,#0x5d8
00a695a8	add x3,sp,#0x8
00a695ac	mov x0,x20
00a695b0	bl 0x00c3b610
00a695b4	ldr x8,[sp, #0x8]
00a695b8	cmp w0,#0x0
00a695bc	csel x0,xzr,x8,eq
00a695c0	b 0x00a695c8
00a695c4	mov x0,xzr
00a695c8	ldp x29,x30,[sp, #0x20]
00a695cc	ldp x20,x19,[sp, #0x10]
00a695d0	add sp,sp,#0x30
00a695d4	ret

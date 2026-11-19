; ossl_ed448ph_verify @ 00a475ac
00a475ac	sub sp,sp,#0x20
00a475b0	mov x8,x4
00a475b4	mov x9,x1
00a475b8	mov x7,x5
00a475bc	mov w4,#0x40
00a475c0	mov w5,#0x1
00a475c4	str x6,[sp]
00a475c8	mov x1,x2
00a475cc	mov x2,x3
00a475d0	mov x3,x9
00a475d4	mov x6,x8
00a475d8	stp x29,x30,[sp, #0x10]
00a475dc	add x29,sp,#0x10
00a475e0	bl 0x00a472d4
00a475e4	ldp x29,x30,[sp, #0x10]
00a475e8	cmn w0,#0x1
00a475ec	cset w0,eq
00a475f0	add sp,sp,#0x20
00a475f4	ret

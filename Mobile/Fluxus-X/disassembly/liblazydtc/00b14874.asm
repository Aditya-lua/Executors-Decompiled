; X509_VERIFY_PARAM_lookup @ 00b14874
00b14874	sub sp,sp,#0x90
00b14878	str x19,[sp, #0x70]
00b1487c	adrp x19,0xd22000
00b14880	ldr x8,[x19, #0x7f0]
00b14884	stp x29,x30,[sp, #0x80]
00b14888	add x29,sp,#0x80
00b1488c	str x0,[sp]
00b14890	cbz x8,0x00b148b4
00b14894	mov x1,sp
00b14898	mov x0,x8
00b1489c	bl 0x00c34760
00b148a0	tbnz w0,#0x1f,0x00b148b4
00b148a4	mov w1,w0
00b148a8	ldr x0,[x19, #0x7f0]
00b148ac	bl 0x00c32610
00b148b0	b 0x00b148d4
00b148b4	adrp x1,0xc81000
00b148b8	adrp x4,0xb14000
00b148bc	add x1,x1,#0xc08
00b148c0	add x4,x4,#0x914
00b148c4	mov x0,sp
00b148c8	mov w2,#0x5
00b148cc	orr w3,wzr,#0x70
00b148d0	bl 0x00c35830
00b148d4	ldp x29,x30,[sp, #0x80]
00b148d8	ldr x19,[sp, #0x70]
00b148dc	add sp,sp,#0x90
00b148e0	ret

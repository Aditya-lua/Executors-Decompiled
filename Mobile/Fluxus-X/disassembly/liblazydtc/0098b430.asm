; ix::CaseInsensitiveLess::operator() @ 0098b430
0098b430	stp x24,x23,[sp, #-0x40]!
0098b434	stp x22,x21,[sp, #0x10]
0098b438	stp x20,x19,[sp, #0x20]
0098b43c	stp x29,x30,[sp, #0x30]
0098b440	add x29,sp,#0x30
0098b444	ldrb w8,[x1]
0098b448	ldp x10,x9,[x1, #0x8]
0098b44c	ldrb w11,[x2]
0098b450	tst w8,#0x1
0098b454	csinc x21,x9,x1,ne
0098b458	ldp x9,x12,[x2, #0x8]
0098b45c	lsr w8,w8,#0x1
0098b460	csel x22,x8,x10,eq
0098b464	lsr w8,w11,#0x1
0098b468	tst w11,#0x1
0098b46c	csel x23,x8,x9,eq
0098b470	csinc x24,x12,x2,ne
0098b474	cbz x23,0x0098b4b8
0098b478	cbz x22,0x0098b4c0
0098b47c	ldrb w0,[x21]
0098b480	ldrb w20,[x24]
0098b484	bl 0x00c30f10
0098b488	mov w19,w0
0098b48c	mov w0,w20
0098b490	bl 0x00c30f10
0098b494	cmp w19,w0
0098b498	b.lt 0x0098b4c0
0098b49c	cmp w0,w19
0098b4a0	b.lt 0x0098b4b8
0098b4a4	add x21,x21,#0x1
0098b4a8	add x24,x24,#0x1
0098b4ac	subs x23,x23,#0x1
0098b4b0	sub x22,x22,#0x1
0098b4b4	b.ne 0x0098b478
0098b4b8	mov w0,wzr
0098b4bc	b 0x0098b4c4
0098b4c0	mov w0,#0x1
0098b4c4	ldp x29,x30,[sp, #0x30]
0098b4c8	ldp x20,x19,[sp, #0x20]
0098b4cc	ldp x22,x21,[sp, #0x10]
0098b4d0	ldp x24,x23,[sp], #0x40
0098b4d4	ret

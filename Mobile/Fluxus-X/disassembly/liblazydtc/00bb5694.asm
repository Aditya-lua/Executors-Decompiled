; HUF_selectDecoder @ 00bb5694
00bb5694	cmp x1,x0
00bb5698	b.cs 0x00bb56ac
00bb569c	lsl x8,x1,#0x4
00bb56a0	udiv x8,x8,x0
00bb56a4	mov w8,w8
00bb56a8	b 0x00bb56b0
00bb56ac	mov w8,#0xf
00bb56b0	adrp x9,0x789000
00bb56b4	add x9,x9,#0x1ac
00bb56b8	add x8,x9,x8, LSL #0x4
00bb56bc	lsr x9,x0,#0x8
00bb56c0	ldp w11,w10,[x8, #0x8]
00bb56c4	ldp w8,w12,[x8]
00bb56c8	madd w10,w10,w9,w11
00bb56cc	madd w8,w12,w9,w8
00bb56d0	add w9,w10,w10, LSR #0x5
00bb56d4	cmp w9,w8
00bb56d8	cset w0,cc
00bb56dc	ret

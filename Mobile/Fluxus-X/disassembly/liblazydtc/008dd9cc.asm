; FUN_008dd9cc @ 008dd9cc
008dd9cc	add x8,x0,#0x7f8
008dd9d0	mov w9,#0x7f
008dd9d4	b 0x008dd9e8
008dd9d8	sub x9,x9,#0x1
008dd9dc	sub x8,x8,#0x10
008dd9e0	cmn x9,#0x1
008dd9e4	b.eq 0x008dda08
008dd9e8	cmp x9,#0x40
008dd9ec	csel x10,x1,x2,cc
008dd9f0	lsr x10,x10,x9
008dd9f4	tbz w10,#0x0,0x008dd9d8
008dd9f8	ldp x10,x11,[x8, #-0x8]
008dd9fc	eor x1,x10,x1
008dda00	eor x2,x11,x2
008dda04	b 0x008dd9d8
008dda08	mov x0,x1
008dda0c	mov x1,x2
008dda10	ret

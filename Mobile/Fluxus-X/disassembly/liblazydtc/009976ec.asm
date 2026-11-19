; ix::WebSocketTransport::setPingMessage @ 009976ec
009976ec	stp x20,x19,[sp, #-0x20]!
009976f0	stp x29,x30,[sp, #0x10]
009976f4	add x29,sp,#0x10
009976f8	mov x20,x0
009976fc	add x0,x0,#0x288
00997700	mov w19,w2
00997704	mov w8,#0x1
00997708	cmp x0,x1
0099770c	strb w8,[x20, #0x281]
00997710	b.eq 0x00997730
00997714	ldrb w8,[x1]
00997718	ldp x10,x9,[x1, #0x8]
0099771c	lsr w11,w8,#0x1
00997720	tst w8,#0x1
00997724	csinc x1,x9,x1,ne
00997728	csel x2,x11,x10,eq
0099772c	bl 0x00c31090
00997730	str w19,[x20, #0x2a0]
00997734	ldp x29,x30,[sp, #0x10]
00997738	ldp x20,x19,[sp], #0x20
0099773c	ret

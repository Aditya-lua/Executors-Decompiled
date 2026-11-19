; cpr::Session::SetOption @ 008f2ca0
008f2ca0	add x8,x0,#0x28
008f2ca4	cmp x8,x1
008f2ca8	b.eq 0x008f2cdc
008f2cac	stp x29,x30,[sp, #-0x10]!
008f2cb0	mov x29,sp
008f2cb4	ldrb w9,[x1, #0x8]
008f2cb8	ldp x10,x11,[x1, #0x10]
008f2cbc	add x8,x1,#0x8
008f2cc0	add x0,x0,#0x30
008f2cc4	lsr w12,w9,#0x1
008f2cc8	tst w9,#0x1
008f2ccc	csinc x1,x11,x8,ne
008f2cd0	csel x2,x12,x10,eq
008f2cd4	bl 0x00c31090
008f2cd8	ldp x29,x30,[sp], #0x10
008f2cdc	ret

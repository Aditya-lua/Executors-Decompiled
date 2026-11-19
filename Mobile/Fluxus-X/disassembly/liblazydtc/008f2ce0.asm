; cpr::Session::SetOption @ 008f2ce0
008f2ce0	ldrb w8,[x1]
008f2ce4	mov x9,x0
008f2ce8	strb w8,[x9, #0x48]!
008f2cec	cmp x9,x1
008f2cf0	b.eq 0x008f2d04
008f2cf4	ldp x8,x2,[x1, #0x8]
008f2cf8	add x0,x0,#0x50
008f2cfc	mov x1,x8
008f2d00	b 0x00c316f0
008f2d04	ret

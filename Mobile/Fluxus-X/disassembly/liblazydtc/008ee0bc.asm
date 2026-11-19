; cpr::Session::SetParameters @ 008ee0bc
008ee0bc	ldrb w8,[x1]
008ee0c0	mov x9,x0
008ee0c4	strb w8,[x9, #0x48]!
008ee0c8	cmp x9,x1
008ee0cc	b.eq 0x008ee0e0
008ee0d0	ldp x8,x2,[x1, #0x8]
008ee0d4	add x0,x0,#0x50
008ee0d8	mov x1,x8
008ee0dc	b 0x00c316f0
008ee0e0	ret

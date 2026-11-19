; blake3_hasher_init_keyed @ 008e02a0
008e02a0	movi v0.2D,#0x0
008e02a4	ldp q1,q2,[x1]
008e02a8	mov w8,#0x10
008e02ac	str xzr,[x0, #0x40]
008e02b0	strh wzr,[x0, #0x88]
008e02b4	stp q1,q2,[x0]
008e02b8	stp q1,q2,[x0, #0x20]
008e02bc	stur q0,[x0, #0x48]
008e02c0	stur q0,[x0, #0x58]
008e02c4	stur q0,[x0, #0x68]
008e02c8	stur q0,[x0, #0x78]
008e02cc	strb w8,[x0, #0x8a]
008e02d0	strb wzr,[x0, #0x90]
008e02d4	ret

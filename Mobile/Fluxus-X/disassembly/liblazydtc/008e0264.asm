; blake3_hasher_init @ 008e0264
008e0264	adrp x8,0x744000
008e0268	add x8,x8,#0xed4
008e026c	movi v2.2D,#0x0
008e0270	ldp q0,q1,[x8]
008e0274	str xzr,[x0, #0x40]
008e0278	strh wzr,[x0, #0x88]
008e027c	strb wzr,[x0, #0x8a]
008e0280	stp q0,q1,[x0]
008e0284	stp q0,q1,[x0, #0x20]
008e0288	stur q2,[x0, #0x48]
008e028c	stur q2,[x0, #0x58]
008e0290	stur q2,[x0, #0x68]
008e0294	stur q2,[x0, #0x78]
008e0298	strb wzr,[x0, #0x90]
008e029c	ret

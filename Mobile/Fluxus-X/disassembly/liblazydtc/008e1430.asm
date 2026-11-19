; blake3_hasher_reset @ 008e1430
008e1430	movi v0.2D,#0x0
008e1434	ldp q1,q2,[x0]
008e1438	str xzr,[x0, #0x40]
008e143c	strh wzr,[x0, #0x88]
008e1440	stp q1,q2,[x0, #0x20]
008e1444	stur q0,[x0, #0x48]
008e1448	stur q0,[x0, #0x58]
008e144c	stur q0,[x0, #0x68]
008e1450	stur q0,[x0, #0x78]
008e1454	strb wzr,[x0, #0x90]
008e1458	ret

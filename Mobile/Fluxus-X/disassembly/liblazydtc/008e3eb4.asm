; FUN_008e3eb4 @ 008e3eb4
008e3eb4	ldr w10,[x1, #0x10]
008e3eb8	lsl w8,w3,#0x11
008e3ebc	ldr w11,[x1, #0x8]
008e3ec0	cmp w3,#0x0
008e3ec4	ubfiz w9,w2,#0x5,#0x10
008e3ec8	and w8,w8,#0x600000
008e3ecc	orr w9,w9,w4
008e3ed0	csel w8,w8,wzr,gt
008e3ed4	orr w8,w9,w8
008e3ed8	cmp w10,#0x40
008e3edc	orr w8,w8,w11
008e3ee0	cset w9,eq
008e3ee4	orr w8,w8,w9, LSL #0x1f
008e3ee8	mov w9,#0x12800000
008e3eec	orr w1,w8,w9
008e3ef0	b 0x008e4874

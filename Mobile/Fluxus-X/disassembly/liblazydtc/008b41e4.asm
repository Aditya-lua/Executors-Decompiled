; FUN_008b41e4 @ 008b41e4
008b41e4	ldr w8,[x0, #0x40]
008b41e8	mov w2,wzr
008b41ec	lsl w9,w8,#0x1
008b41f0	add w10,w8,w1
008b41f4	cmp w1,w8
008b41f8	csel w1,w10,w9,gt
008b41fc	b 0x008b3fdc

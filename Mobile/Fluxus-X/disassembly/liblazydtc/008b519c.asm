; FUN_008b519c @ 008b519c
008b519c	ldrb w9,[x1, #0x6]
008b51a0	mov w8,#0x30
008b51a4	ldrb w10,[x1, #0x5]
008b51a8	ldrb w3,[x1, #0x1]
008b51ac	mov x4,x2
008b51b0	cmp w9,#0x0
008b51b4	mov w9,#0x20
008b51b8	csel x8,x9,x8,eq
008b51bc	add x8,x8,x10, LSL #0x4
008b51c0	mov x2,x8
008b51c4	b 0x008b7bd4

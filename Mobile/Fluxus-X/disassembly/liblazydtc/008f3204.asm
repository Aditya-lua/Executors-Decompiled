; cpr::Session::SetOption @ 008f3204
008f3204	mov x8,x1
008f3208	ldrb w9,[x8, #0x8]!
008f320c	ldr x10,[x0, #0x18]
008f3210	ldr x11,[x8, #0x8]
008f3214	ldr x0,[x10]
008f3218	lsr w12,w9,#0x1
008f321c	tst w9,#0x1
008f3220	csel x10,x12,x11,eq
008f3224	cbz x10,0x008f323c
008f3228	ldr x10,[x1, #0x18]
008f322c	tst w9,#0x1
008f3230	mov w1,#0x274e
008f3234	csinc x2,x10,x8,ne
008f3238	b 0x00c317c0
008f323c	mov w1,#0x274e
008f3240	mov x2,xzr
008f3244	b 0x00c317c0

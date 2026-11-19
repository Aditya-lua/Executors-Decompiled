; cpr::Session::SetOption @ 008f2f00
008f2f00	ldr x8,[x0, #0x18]
008f2f04	ldrb w9,[x1, #0x8]
008f2f08	ldr x10,[x1, #0x18]
008f2f0c	ldr x0,[x8]
008f2f10	add x8,x1,#0x9
008f2f14	tst w9,#0x1
008f2f18	csel x2,x8,x10,eq
008f2f1c	mov w1,#0x2722
008f2f20	b 0x00c317c0

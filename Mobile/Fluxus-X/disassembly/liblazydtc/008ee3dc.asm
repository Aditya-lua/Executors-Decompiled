; cpr::Session::SetUserAgent @ 008ee3dc
008ee3dc	ldr x8,[x0, #0x18]
008ee3e0	ldrb w9,[x1, #0x8]
008ee3e4	ldr x10,[x1, #0x18]
008ee3e8	ldr x0,[x8]
008ee3ec	add x8,x1,#0x9
008ee3f0	tst w9,#0x1
008ee3f4	csel x2,x8,x10,eq
008ee3f8	mov w1,#0x2722
008ee3fc	b 0x00c317c0

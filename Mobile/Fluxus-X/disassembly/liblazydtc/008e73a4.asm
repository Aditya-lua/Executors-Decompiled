; cpr::Authentication::GetAuthString @ 008e73a4
008e73a4	ldrb w8,[x0]
008e73a8	tbnz w8,#0x0,0x008e73b4
008e73ac	add x0,x0,#0x1
008e73b0	ret
008e73b4	ldr x0,[x0, #0x10]
008e73b8	ret

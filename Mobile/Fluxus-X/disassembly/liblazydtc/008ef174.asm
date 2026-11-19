; cpr::Session::SetInterface @ 008ef174
008ef174	mov x8,x1
008ef178	ldrb w9,[x8, #0x8]!
008ef17c	ldr x10,[x0, #0x18]
008ef180	ldr x11,[x8, #0x8]
008ef184	ldr x0,[x10]
008ef188	lsr w12,w9,#0x1
008ef18c	tst w9,#0x1
008ef190	csel x10,x12,x11,eq
008ef194	cbz x10,0x008ef1ac
008ef198	ldr x10,[x1, #0x18]
008ef19c	tst w9,#0x1
008ef1a0	mov w1,#0x274e
008ef1a4	csinc x2,x10,x8,ne
008ef1a8	b 0x00c317c0
008ef1ac	mov w1,#0x274e
008ef1b0	mov x2,xzr
008ef1b4	b 0x00c317c0

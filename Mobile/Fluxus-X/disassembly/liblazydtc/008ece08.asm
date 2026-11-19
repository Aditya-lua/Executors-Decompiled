; cpr::Session::makeRequest @ 008ece08
008ece08	stp x20,x19,[sp, #-0x20]!
008ece0c	stp x29,x30,[sp, #0x10]
008ece10	add x29,sp,#0x10
008ece14	ldr x9,[x0, #0x2a0]
008ece18	mov x19,x0
008ece1c	mov x20,x8
008ece20	cbz x9,0x008ece38
008ece24	ldp x29,x30,[sp, #0x10]
008ece28	mov x8,x20
008ece2c	mov x0,x19
008ece30	ldp x20,x19,[sp], #0x20
008ece34	b 0x00c313b0
008ece38	mov x0,x19
008ece3c	bl 0x00c31250
008ece40	ldp x29,x30,[sp, #0x10]
008ece44	mov w1,w0
008ece48	mov x8,x20
008ece4c	mov x0,x19
008ece50	ldp x20,x19,[sp], #0x20
008ece54	b 0x00c31380

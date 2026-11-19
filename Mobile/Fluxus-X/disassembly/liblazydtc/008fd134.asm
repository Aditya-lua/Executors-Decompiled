; cpr::Files::pop_back @ 008fd134
008fd134	str x21,[sp, #-0x30]!
008fd138	stp x20,x19,[sp, #0x10]
008fd13c	stp x29,x30,[sp, #0x20]
008fd140	add x29,sp,#0x20
008fd144	ldr x21,[x0, #0x8]
008fd148	mov x19,x0
008fd14c	ldurb w8,[x21, #-0x18]
008fd150	sub x20,x21,#0x30
008fd154	tbz w8,#0x0,0x008fd160
008fd158	ldur x0,[x21, #-0x8]
008fd15c	bl 0x00c301d0
008fd160	ldrb w8,[x20]
008fd164	tbz w8,#0x0,0x008fd170
008fd168	ldur x0,[x21, #-0x20]
008fd16c	bl 0x00c301d0
008fd170	str x20,[x19, #0x8]
008fd174	ldp x29,x30,[sp, #0x20]
008fd178	ldp x20,x19,[sp, #0x10]
008fd17c	ldr x21,[sp], #0x30
008fd180	ret

; cpr::Session::SetParameters @ 008ee0e4
008ee0e4	stp x26,x25,[sp, #-0x50]!
008ee0e8	stp x24,x23,[sp, #0x10]
008ee0ec	stp x22,x21,[sp, #0x20]
008ee0f0	stp x20,x19,[sp, #0x30]
008ee0f4	stp x29,x30,[sp, #0x40]
008ee0f8	add x29,sp,#0x40
008ee0fc	mov x21,x1
008ee100	mov x23,x0
008ee104	ldrb w8,[x21], #0x8
008ee108	ldr x24,[x23, #0x50]!
008ee10c	mov x20,x1
008ee110	mov x19,x0
008ee114	sturb w8,[x23, #-0x8]
008ee118	cbz x24,0x008ee164
008ee11c	mov x22,x19
008ee120	ldr x25,[x22, #0x58]!
008ee124	cmp x25,x24
008ee128	b.eq 0x008ee16c
008ee12c	ldurb w8,[x25, #-0x18]
008ee130	tbz w8,#0x0,0x008ee13c
008ee134	ldur x0,[x25, #-0x8]
008ee138	bl 0x00c301d0
008ee13c	ldurb w8,[x25, #-0x30]
008ee140	sub x26,x25,#0x30
008ee144	tbz w8,#0x0,0x008ee150
008ee148	ldur x0,[x25, #-0x20]
008ee14c	bl 0x00c301d0
008ee150	cmp x24,x26
008ee154	mov x25,x26
008ee158	b.ne 0x008ee12c
008ee15c	ldr x0,[x23]
008ee160	b 0x008ee170
008ee164	add x22,x19,#0x58
008ee168	b 0x008ee180
008ee16c	mov x0,x24
008ee170	str x24,[x22]
008ee174	bl 0x00c301d0
008ee178	stp xzr,xzr,[x23]
008ee17c	str xzr,[x23, #0x10]
008ee180	ldr x8,[x20, #0x8]
008ee184	str x8,[x19, #0x50]
008ee188	ldr x8,[x20, #0x10]
008ee18c	str x8,[x22]
008ee190	ldr x8,[x20, #0x18]
008ee194	str x8,[x19, #0x60]
008ee198	stp xzr,xzr,[x21]
008ee19c	str xzr,[x21, #0x10]
008ee1a0	ldp x29,x30,[sp, #0x40]
008ee1a4	ldp x20,x19,[sp, #0x30]
008ee1a8	ldp x22,x21,[sp, #0x20]
008ee1ac	ldp x24,x23,[sp, #0x10]
008ee1b0	ldp x26,x25,[sp], #0x50
008ee1b4	ret

; cpr::Session::SetBody @ 008eea64
008eea64	stp x20,x19,[sp, #-0x20]!
008eea68	stp x29,x30,[sp, #0x10]
008eea6c	add x29,sp,#0x10
008eea70	mov w8,#0x1
008eea74	ldr x9,[x0, #0x18]
008eea78	strb w8,[x0, #0x10]
008eea7c	ldrb w8,[x1, #0x8]
008eea80	ldr x10,[x1, #0x10]
008eea84	mov x20,x0
008eea88	ldr x0,[x9]
008eea8c	lsr w9,w8,#0x1
008eea90	tst w8,#0x1
008eea94	mov x19,x1
008eea98	csel x2,x9,x10,eq
008eea9c	mov w1,#0x75a8
008eeaa0	bl 0x00c317c0
008eeaa4	ldr x8,[x20, #0x18]
008eeaa8	ldrb w9,[x19, #0x8]
008eeaac	ldr x10,[x19, #0x18]
008eeab0	ldp x29,x30,[sp, #0x10]
008eeab4	ldr x0,[x8]
008eeab8	add x8,x19,#0x9
008eeabc	tst w9,#0x1
008eeac0	csel x2,x8,x10,eq
008eeac4	mov w1,#0x27b5
008eeac8	ldp x20,x19,[sp], #0x20
008eeacc	b 0x00c317c0

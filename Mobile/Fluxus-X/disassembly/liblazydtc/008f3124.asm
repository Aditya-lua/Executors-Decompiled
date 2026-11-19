; cpr::Session::SetOption @ 008f3124
008f3124	stp x20,x19,[sp, #-0x20]!
008f3128	stp x29,x30,[sp, #0x10]
008f312c	add x29,sp,#0x10
008f3130	ldr x8,[x0, #0x18]
008f3134	mov x20,x0
008f3138	ldr w2,[x1]
008f313c	mov x19,x1
008f3140	ldr x0,[x8]
008f3144	mov w1,#0x13
008f3148	bl 0x00c317c0
008f314c	ldr x8,[x20, #0x18]
008f3150	ldr w2,[x19, #0x4]
008f3154	ldp x29,x30,[sp, #0x10]
008f3158	mov w1,#0x14
008f315c	ldr x0,[x8]
008f3160	ldp x20,x19,[sp], #0x20
008f3164	b 0x00c317c0

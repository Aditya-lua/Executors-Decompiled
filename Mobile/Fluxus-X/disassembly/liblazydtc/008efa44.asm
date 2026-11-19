; cpr::Session::Delete @ 008efa44
008efa44	stp x20,x19,[sp, #-0x20]!
008efa48	stp x29,x30,[sp, #0x10]
008efa4c	add x29,sp,#0x10
008efa50	ldr x9,[x0, #0x18]
008efa54	mov x19,x0
008efa58	mov w1,#0x50
008efa5c	mov x2,xzr
008efa60	ldr x0,[x9]
008efa64	mov x20,x8
008efa68	bl 0x00c317c0
008efa6c	ldr x8,[x19, #0x18]
008efa70	mov w1,#0x2c
008efa74	mov x2,xzr
008efa78	ldr x0,[x8]
008efa7c	bl 0x00c317c0
008efa80	ldr x8,[x19, #0x18]
008efa84	adrp x2,0x2d8000
008efa88	add x2,x2,#0xfce
008efa8c	mov w1,#0x2734
008efa90	ldr x0,[x8]
008efa94	bl 0x00c317c0
008efa98	mov x0,x19
008efa9c	bl 0x00c31270
008efaa0	ldr x8,[x19, #0x2a0]
008efaa4	cbz x8,0x008efabc
008efaa8	ldp x29,x30,[sp, #0x10]
008efaac	mov x8,x20
008efab0	mov x0,x19
008efab4	ldp x20,x19,[sp], #0x20
008efab8	b 0x00c313b0
008efabc	mov x0,x19
008efac0	bl 0x00c31250
008efac4	ldp x29,x30,[sp, #0x10]
008efac8	mov w1,w0
008efacc	mov x8,x20
008efad0	mov x0,x19
008efad4	ldp x20,x19,[sp], #0x20
008efad8	b 0x00c31380

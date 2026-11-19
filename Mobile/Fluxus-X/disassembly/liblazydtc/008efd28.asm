; cpr::Session::PrepareDownload @ 008efd28
008efd28	stp x20,x19,[sp, #-0x20]!
008efd2c	stp x29,x30,[sp, #0x10]
008efd30	add x29,sp,#0x10
008efd34	ldr x8,[x0, #0x18]
008efd38	mov x19,x0
008efd3c	mov x20,x1
008efd40	mov w1,#0x2c
008efd44	ldr x0,[x8]
008efd48	mov x2,xzr
008efd4c	bl 0x00c317c0
008efd50	ldr x8,[x19, #0x18]
008efd54	mov w1,#0x50
008efd58	mov w2,#0x1
008efd5c	ldr x0,[x8]
008efd60	bl 0x00c317c0
008efd64	ldr x8,[x19, #0x18]
008efd68	adrp x2,0xcb4000
008efd6c	mov w1,#0x4e2b
008efd70	ldr x0,[x8]
008efd74	ldr x2,[x2, #0xce8]
008efd78	bl 0x00c317c0
008efd7c	ldr x8,[x19, #0x18]
008efd80	mov w1,#0x2711
008efd84	mov x2,x20
008efd88	ldr x0,[x8]
008efd8c	bl 0x00c317c0
008efd90	ldr x8,[x19, #0x18]
008efd94	mov w1,#0x2734
008efd98	mov x2,xzr
008efd9c	ldr x0,[x8]
008efda0	bl 0x00c317c0
008efda4	ldp x29,x30,[sp, #0x10]
008efda8	mov x0,x19
008efdac	ldp x20,x19,[sp], #0x20
008efdb0	b 0x00c31310

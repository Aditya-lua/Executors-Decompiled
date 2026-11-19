; cpr::Session::SetOption @ 008f2e64
008f2e64	stp x20,x19,[sp, #-0x20]!
008f2e68	stp x29,x30,[sp, #0x10]
008f2e6c	add x29,sp,#0x10
008f2e70	ldr x8,[x0, #0x18]
008f2e74	mov x20,x0
008f2e78	ldr x2,[x1]
008f2e7c	mov x19,x1
008f2e80	ldr x0,[x8]
008f2e84	mov w1,#0x75c2
008f2e88	bl 0x00c317c0
008f2e8c	ldr x8,[x20, #0x18]
008f2e90	ldr x2,[x19, #0x8]
008f2e94	ldp x29,x30,[sp, #0x10]
008f2e98	mov w1,#0x75c1
008f2e9c	ldr x0,[x8]
008f2ea0	ldp x20,x19,[sp], #0x20
008f2ea4	b 0x00c317c0

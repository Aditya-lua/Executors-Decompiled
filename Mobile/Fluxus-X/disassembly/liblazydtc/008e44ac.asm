; FUN_008e44ac @ 008e44ac
008e44ac	str x30,[sp, #-0x20]!
008e44b0	stp x20,x19,[sp, #0x10]
008e44b4	mov x20,x0
008e44b8	mov w0,#0x10
008e44bc	mov w19,w1
008e44c0	bl 0x00c2fed0
008e44c4	sxtw x8,w19
008e44c8	stp x20,x8,[x0]
008e44cc	ldp x20,x19,[sp, #0x10]
008e44d0	ldr x30,[sp], #0x20
008e44d4	ret

; cpr::Session::SetOption @ 008f31cc
008f31cc	str x19,[sp, #-0x20]!
008f31d0	stp x29,x30,[sp, #0x10]
008f31d4	add x29,sp,#0x10
008f31d8	ldr x8,[x0, #0x18]
008f31dc	mov x0,x1
008f31e0	ldr x19,[x8]
008f31e4	bl 0x00c313f0
008f31e8	ldp x29,x30,[sp, #0x10]
008f31ec	mov w1,#0x27f7
008f31f0	mov x2,x0
008f31f4	mov x0,x19
008f31f8	ldr x19,[sp], #0x20
008f31fc	b 0x00c317c0

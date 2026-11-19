; cpr::Session::SetOption @ 008f2df8
008f2df8	str x19,[sp, #-0x20]!
008f2dfc	stp x29,x30,[sp, #0x10]
008f2e00	add x29,sp,#0x10
008f2e04	ldr x8,[x0, #0x18]
008f2e08	mov x0,x1
008f2e0c	ldr x19,[x8]
008f2e10	bl 0x00c31410
008f2e14	ldp x29,x30,[sp, #0x10]
008f2e18	mov w1,#0x9b
008f2e1c	mov x2,x0
008f2e20	mov x0,x19
008f2e24	ldr x19,[sp], #0x20
008f2e28	b 0x00c317c0

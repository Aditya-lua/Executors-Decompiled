; cpr::Session::PreparePatch @ 008f0098
008f0098	str x19,[sp, #-0x20]!
008f009c	stp x29,x30,[sp, #0x10]
008f00a0	add x29,sp,#0x10
008f00a4	ldr x8,[x0, #0x18]
008f00a8	mov x19,x0
008f00ac	mov w1,#0x2c
008f00b0	mov x2,xzr
008f00b4	ldr x0,[x8]
008f00b8	bl 0x00c317c0
008f00bc	ldr x8,[x19, #0x18]
008f00c0	adrp x2,0x2a9000
008f00c4	add x2,x2,#0x4a0
008f00c8	mov w1,#0x2734
008f00cc	ldr x0,[x8]
008f00d0	bl 0x00c317c0
008f00d4	ldp x29,x30,[sp, #0x10]
008f00d8	mov x0,x19
008f00dc	ldr x19,[sp], #0x20
008f00e0	b 0x00c31270

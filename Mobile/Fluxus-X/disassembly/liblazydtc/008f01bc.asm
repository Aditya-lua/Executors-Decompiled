; cpr::Session::Put @ 008f01bc
008f01bc	stp x20,x19,[sp, #-0x20]!
008f01c0	stp x29,x30,[sp, #0x10]
008f01c4	add x29,sp,#0x10
008f01c8	mov x19,x0
008f01cc	mov x20,x8
008f01d0	bl 0x00c311c0
008f01d4	ldr x8,[x19, #0x2a0]
008f01d8	cbz x8,0x008f01f0
008f01dc	ldp x29,x30,[sp, #0x10]
008f01e0	mov x8,x20
008f01e4	mov x0,x19
008f01e8	ldp x20,x19,[sp], #0x20
008f01ec	b 0x00c313b0
008f01f0	mov x0,x19
008f01f4	bl 0x00c31250
008f01f8	ldp x29,x30,[sp, #0x10]
008f01fc	mov w1,w0
008f0200	mov x8,x20
008f0204	mov x0,x19
008f0208	ldp x20,x19,[sp], #0x20
008f020c	b 0x00c31380

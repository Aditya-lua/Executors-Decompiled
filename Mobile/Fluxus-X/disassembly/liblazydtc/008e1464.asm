; blake3_xof_many @ 008e1464
008e1464	cbz x6,0x008e14dc
008e1468	stp x29,x30,[sp, #-0x50]!
008e146c	str x25,[sp, #0x10]
008e1470	stp x24,x23,[sp, #0x20]
008e1474	stp x22,x21,[sp, #0x30]
008e1478	stp x20,x19,[sp, #0x40]
008e147c	mov x29,sp
008e1480	mov x19,x6
008e1484	mov x20,x5
008e1488	mov w21,w4
008e148c	mov x22,x3
008e1490	mov w23,w2
008e1494	mov x24,x1
008e1498	mov x25,x0
008e149c	mov x0,x25
008e14a0	mov x1,x24
008e14a4	mov w2,w23
008e14a8	mov x3,x22
008e14ac	mov w4,w21
008e14b0	mov x5,x20
008e14b4	bl 0x00c30b10
008e14b8	subs x19,x19,#0x1
008e14bc	add x22,x22,#0x1
008e14c0	add x20,x20,#0x40
008e14c4	b.ne 0x008e149c
008e14c8	ldp x20,x19,[sp, #0x40]
008e14cc	ldr x25,[sp, #0x10]
008e14d0	ldp x22,x21,[sp, #0x30]
008e14d4	ldp x24,x23,[sp, #0x20]
008e14d8	ldp x29,x30,[sp], #0x50
008e14dc	ret

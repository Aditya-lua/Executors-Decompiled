; FUN_008e35d0 @ 008e35d0
008e35d0	str x30,[sp, #-0x20]!
008e35d4	stp x20,x19,[sp, #0x10]
008e35d8	mov x19,x0
008e35dc	ldr x0,[x0, #0x28]
008e35e0	ldr x8,[x19, #0x10]
008e35e4	ldr x9,[x0]
008e35e8	ldr x20,[x8]
008e35ec	ldr x8,[x9, #0x38]
008e35f0	blr x8
008e35f4	ldr x8,[x19, #0x28]
008e35f8	mov x19,x0
008e35fc	ldr x9,[x8]
008e3600	mov x0,x8
008e3604	ldr x9,[x9, #0x20]
008e3608	blr x9
008e360c	mov w2,w0
008e3610	mov x0,x20
008e3614	mov x1,x19
008e3618	ldp x20,x19,[sp, #0x10]
008e361c	ldr x30,[sp], #0x20
008e3620	b 0x00c2ff30

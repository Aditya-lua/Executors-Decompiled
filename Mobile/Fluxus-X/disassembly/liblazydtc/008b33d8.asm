; FUN_008b33d8 @ 008b33d8
008b33d8	stp x29,x30,[sp, #-0x30]!
008b33dc	str x21,[sp, #0x10]
008b33e0	stp x20,x19,[sp, #0x20]
008b33e4	mov x29,sp
008b33e8	mov x20,x1
008b33ec	ldr x1,[x1, #0x28]
008b33f0	mov x19,x2
008b33f4	mov x21,x0
008b33f8	cbz x1,0x008b3414
008b33fc	ldp w9,w8,[x20, #0x58]
008b3400	ldrb w3,[x20, #0x1]
008b3404	mov x0,x21
008b3408	sub w8,w8,w9
008b340c	ubfiz x2,x8,#0x4,#0x20
008b3410	bl 0x008b7a9c
008b3414	ldr x1,[x20, #0x40]
008b3418	cbz x1,0x008b3438
008b341c	ldr w8,[x20, #0x5c]
008b3420	ldrb w9,[x20, #0x68]
008b3424	mov x0,x21
008b3428	ldrb w3,[x20, #0x1]
008b342c	sub w8,w8,w9
008b3430	ubfiz x2,x8,#0x3,#0x20
008b3434	bl 0x008b7a9c
008b3438	ldrb w3,[x20, #0x1]
008b343c	mov x0,x21
008b3440	mov x1,x20
008b3444	mov w2,#0x70
008b3448	mov x4,x19
008b344c	ldp x20,x19,[sp, #0x20]
008b3450	ldr x21,[sp, #0x10]
008b3454	ldp x29,x30,[sp], #0x30
008b3458	b 0x008b7bd4

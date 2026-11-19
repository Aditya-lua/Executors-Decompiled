; FUN_008b345c @ 008b345c
008b345c	stp x29,x30,[sp, #-0x30]!
008b3460	str x21,[sp, #0x10]
008b3464	stp x20,x19,[sp, #0x20]
008b3468	mov x29,sp
008b346c	ldr x8,[x1, #0x20]
008b3470	mov x19,x2
008b3474	cbz x8,0x008b349c
008b3478	ldr w9,[x1, #0x18]
008b347c	ldrb w3,[x1, #0x1]
008b3480	mov x21,x1
008b3484	mov x1,x8
008b3488	mov x20,x0
008b348c	lsl x2,x9,#0x4
008b3490	bl 0x008b7a9c
008b3494	mov x0,x20
008b3498	mov x1,x21
008b349c	ldrb w3,[x1, #0x1]
008b34a0	mov w2,#0x28
008b34a4	mov x4,x19
008b34a8	ldp x20,x19,[sp, #0x20]
008b34ac	ldr x21,[sp, #0x10]
008b34b0	ldp x29,x30,[sp], #0x30
008b34b4	b 0x008b7bd4

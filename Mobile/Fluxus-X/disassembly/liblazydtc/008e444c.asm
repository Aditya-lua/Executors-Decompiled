; FUN_008e444c @ 008e444c
008e444c	stp x30,x21,[sp, #-0x20]!
008e4450	stp x20,x19,[sp, #0x10]
008e4454	ldr x8,[x0]
008e4458	mov w19,w2
008e445c	mov x20,x0
008e4460	mov x21,x1
008e4464	bl 0x008e44a4
008e4468	ldr x8,[x20]
008e446c	add w1,w0,w19
008e4470	mov x0,x20
008e4474	ldr x8,[x8, #0x18]
008e4478	blr x8
008e447c	ldr x0,[x20, #0x10]
008e4480	mov x1,x21
008e4484	mov w2,w19
008e4488	bl 0x008e4fb8
008e448c	ldr x8,[x20, #0x10]
008e4490	add x8,x8,w19, SXTW 
008e4494	str x8,[x20, #0x10]
008e4498	ldp x20,x19,[sp, #0x10]
008e449c	ldp x30,x21,[sp], #0x20
008e44a0	ret

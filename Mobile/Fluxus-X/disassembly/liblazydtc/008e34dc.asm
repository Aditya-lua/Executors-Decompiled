; FUN_008e34dc @ 008e34dc
008e34dc	stp x30,x21,[sp, #-0x20]!
008e34e0	stp x20,x19,[sp, #0x10]
008e34e4	ldr x8,[x0, #0x8]
008e34e8	mov x19,x0
008e34ec	ldr x0,[x8, #0x8]
008e34f0	bl 0x008e44ac
008e34f4	mov x20,x0
008e34f8	str x0,[x19, #0x10]
008e34fc	mov x0,xzr
008e3500	mov w1,wzr
008e3504	bl 0x008e44ac
008e3508	ldr x8,[x19, #0x8]
008e350c	str x0,[x19, #0x18]
008e3510	mov x21,x0
008e3514	mov x1,x20
008e3518	ldr x0,[x8, #0x8]
008e351c	mov x2,x21
008e3520	bl 0x008e3630
008e3524	ldr x8,[x21]
008e3528	cbz x8,0x008e3558
008e352c	ldr x9,[x19, #0x8]
008e3530	str x8,[x9, #0x18]
008e3534	ldp x9,x8,[x19, #0x8]
008e3538	ldp x1,x2,[x8]
008e353c	add x0,x9,#0x30
008e3540	bl 0x00c2ffd0
008e3544	ldp x9,x8,[x19, #0x8]
008e3548	mov w0,#0x1
008e354c	ldr q0,[x8]
008e3550	str q0,[x9, #0x20]
008e3554	b 0x008e355c
008e3558	mov w0,wzr
008e355c	ldp x20,x19,[sp, #0x10]
008e3560	ldp x30,x21,[sp], #0x20
008e3564	ret

; FUN_008b98d0 @ 008b98d0
008b98d0	stp x29,x30,[sp, #-0x30]!
008b98d4	str x21,[sp, #0x10]
008b98d8	stp x20,x19,[sp, #0x20]
008b98dc	mov x29,sp
008b98e0	ldrb w2,[x0, #0x4]
008b98e4	mov w1,#0x88
008b98e8	mov w3,#0x9
008b98ec	mov w4,wzr
008b98f0	mov x19,x0
008b98f4	mov w21,#0x9
008b98f8	bl 0x008b78d0
008b98fc	movi v0.2D,#0x0
008b9900	str xzr,[x0, #0x80]
008b9904	mov x1,x19
008b9908	mov x20,x0
008b990c	stp q0,q0,[x0]
008b9910	stp q0,q0,[x0, #0x20]
008b9914	stp q0,q0,[x0, #0x40]
008b9918	stp q0,q0,[x0, #0x60]
008b991c	ldr x8,[x19, #0x60]
008b9920	ldrb w10,[x19, #0x4]
008b9924	strb w21,[x0]
008b9928	ldrb w9,[x8, #0x2]
008b992c	strb w10,[x0, #0x1]
008b9930	str x8,[x0, #0x60]
008b9934	and w9,w9,#0x3
008b9938	strb w10,[x0, #0x4]
008b993c	strb w9,[x0, #0x2]
008b9940	bl 0x008b9968
008b9944	ldr x8,[x19, #0x78]
008b9948	ldrb w9,[x19, #0x5]
008b994c	mov x0,x20
008b9950	str x8,[x20, #0x78]
008b9954	strb w9,[x20, #0x5]
008b9958	ldp x20,x19,[sp, #0x20]
008b995c	ldr x21,[sp, #0x10]
008b9960	ldp x29,x30,[sp], #0x30
008b9964	ret

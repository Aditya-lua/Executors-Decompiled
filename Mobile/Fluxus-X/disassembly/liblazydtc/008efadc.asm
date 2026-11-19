; cpr::Session::PrepareDelete @ 008efadc
008efadc	str x19,[sp, #-0x20]!
008efae0	stp x29,x30,[sp, #0x10]
008efae4	add x29,sp,#0x10
008efae8	ldr x8,[x0, #0x18]
008efaec	mov x19,x0
008efaf0	mov w1,#0x50
008efaf4	mov x2,xzr
008efaf8	ldr x0,[x8]
008efafc	bl 0x00c317c0
008efb00	ldr x8,[x19, #0x18]
008efb04	mov w1,#0x2c
008efb08	mov x2,xzr
008efb0c	ldr x0,[x8]
008efb10	bl 0x00c317c0
008efb14	ldr x8,[x19, #0x18]
008efb18	adrp x2,0x2d8000
008efb1c	add x2,x2,#0xfce
008efb20	mov w1,#0x2734
008efb24	ldr x0,[x8]
008efb28	bl 0x00c317c0
008efb2c	ldp x29,x30,[sp, #0x10]
008efb30	mov x0,x19
008efb34	ldr x19,[sp], #0x20
008efb38	b 0x00c31270

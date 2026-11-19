; cpr::CurlContainer<cpr::Pair>::Add @ 008fbbac
008fbbac	sub sp,sp,#0x80
008fbbb0	stp x24,x23,[sp, #0x40]
008fbbb4	stp x22,x21,[sp, #0x50]
008fbbb8	stp x20,x19,[sp, #0x60]
008fbbbc	stp x29,x30,[sp, #0x70]
008fbbc0	add x29,sp,#0x70
008fbbc4	mrs x22,tpidr_el0
008fbbc8	ldr x8,[x22, #0x28]
008fbbcc	mov x19,x0
008fbbd0	str x8,[sp, #0x38]
008fbbd4	ldr x8,[x1, #0x8]
008fbbd8	cbz x8,0x008fbc8c
008fbbdc	ldr x20,[x1]
008fbbe0	add x9,sp,#0x8
008fbbe4	add x8,x8,x8, LSL #0x1
008fbbe8	add x21,x19,#0x8
008fbbec	add x23,x9,#0x18
008fbbf0	lsl x24,x8,#0x4
008fbbf4	add x0,sp,#0x8
008fbbf8	mov x1,x20
008fbbfc	bl 0x00c30f20
008fbc00	ldp x8,x9,[x19, #0x10]
008fbc04	cmp x8,x9
008fbc08	b.cs 0x008fbc54
008fbc0c	ldr x9,[sp, #0x18]
008fbc10	str x9,[x8, #0x10]
008fbc14	ldur q0,[sp, #0x8]
008fbc18	str q0,[x8]
008fbc1c	stp xzr,xzr,[sp, #0x10]
008fbc20	str xzr,[sp, #0x8]
008fbc24	ldr x9,[x23, #0x10]
008fbc28	str x9,[x8, #0x28]
008fbc2c	ldr q0,[x23]
008fbc30	stur q0,[x8, #0x18]
008fbc34	stp xzr,xzr,[x23, #0x8]
008fbc38	str xzr,[x23]
008fbc3c	ldr x8,[x19, #0x10]
008fbc40	add x8,x8,#0x30
008fbc44	str x8,[x19, #0x10]
008fbc48	ldrb w8,[sp, #0x8]
008fbc4c	tbnz w8,#0x0,0x008fbc78
008fbc50	b 0x008fbc80
008fbc54	add x1,sp,#0x8
008fbc58	mov x0,x21
008fbc5c	bl 0x00c30f70
008fbc60	ldrb w8,[sp, #0x20]
008fbc64	tbz w8,#0x0,0x008fbc70
008fbc68	ldr x0,[sp, #0x30]
008fbc6c	bl 0x00c301d0
008fbc70	ldrb w8,[sp, #0x8]
008fbc74	tbz w8,#0x0,0x008fbc80
008fbc78	ldr x0,[sp, #0x18]
008fbc7c	bl 0x00c301d0
008fbc80	subs x24,x24,#0x30
008fbc84	add x20,x20,#0x30
008fbc88	b.ne 0x008fbbf4
008fbc8c	ldr x8,[x22, #0x28]
008fbc90	ldr x9,[sp, #0x38]
008fbc94	cmp x8,x9
008fbc98	b.ne 0x008fbcb4
008fbc9c	ldp x29,x30,[sp, #0x70]
008fbca0	ldp x20,x19,[sp, #0x60]
008fbca4	ldp x22,x21,[sp, #0x50]
008fbca8	ldp x24,x23,[sp, #0x40]
008fbcac	add sp,sp,#0x80
008fbcb0	ret
008fbcb4	bl 0x00c2fec0

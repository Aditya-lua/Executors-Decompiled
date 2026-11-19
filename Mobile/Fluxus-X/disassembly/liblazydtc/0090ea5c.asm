; FUN_0090ea5c @ 0090ea5c
0090ea5c	stp x24,x23,[sp, #-0x40]!
0090ea60	stp x22,x21,[sp, #0x10]
0090ea64	stp x20,x19,[sp, #0x20]
0090ea68	stp x29,x30,[sp, #0x30]
0090ea6c	add x29,sp,#0x30
0090ea70	ldr x23,[x0, #0x10]
0090ea74	mov x19,x0
0090ea78	cbz x23,0x0090eb48
0090ea7c	mov x22,x23
0090ea80	ldr x0,[x22, #0x18]!
0090ea84	ldr w20,[x23, #0x38]
0090ea88	ldr x21,[x23, #0x30]
0090ea8c	bl 0x00c31ca0
0090ea90	mov w8,#0x1
0090ea94	ldr w24,[x23, #0x20]
0090ea98	str w8,[x23, #0x20]
0090ea9c	ldr x0,[x22]
0090eaa0	bl 0x00c31cb0
0090eaa4	ldr x0,[x23]
0090eaa8	cbz w24,0x0090eb28
0090eaac	cbz x0,0x0090eab8
0090eab0	mov x0,x23
0090eab4	bl 0x0090fa8c
0090eab8	ldr x0,[x22]
0090eabc	cbz x0,0x0090ead8
0090eac0	bl 0x00c31c80
0090eac4	adrp x8,0xcc4000
0090eac8	add x8,x8,#0x678
0090eacc	ldr x0,[x22]
0090ead0	ldr x8,[x8]
0090ead4	blr x8
0090ead8	adrp x24,0xcc4000
0090eadc	add x24,x24,#0x678
0090eae0	ldr x0,[x23, #0x28]
0090eae4	ldr x8,[x24]
0090eae8	blr x8
0090eaec	ldr x0,[x23, #0x48]
0090eaf0	cbz x0,0x0090eaf8
0090eaf4	bl 0x0090f270
0090eaf8	ldr w0,[x23, #0x3c]
0090eafc	cmn w0,#0x1
0090eb00	b.eq 0x0090eb08
0090eb04	bl 0x00c31bf0
0090eb08	orr w2,wzr,#0x70
0090eb0c	mov x0,x22
0090eb10	mov w1,wzr
0090eb14	bl 0x00c301c0
0090eb18	ldr x8,[x24]
0090eb1c	ldr x0,[x19, #0x10]
0090eb20	blr x8
0090eb24	b 0x0090eb34
0090eb28	cbz x0,0x0090eb34
0090eb2c	bl 0x0090fa48
0090eb30	str xzr,[x23]
0090eb34	mov x0,x21
0090eb38	mov w1,w20
0090eb3c	bl 0x0092e498
0090eb40	mov w0,w20
0090eb44	bl 0x00c31bf0
0090eb48	str xzr,[x19, #0x10]
0090eb4c	adrp x8,0xcc4000
0090eb50	add x8,x8,#0x678
0090eb54	ldr x0,[x19]
0090eb58	ldr x8,[x8]
0090eb5c	blr x8
0090eb60	str xzr,[x19]
0090eb64	ldp x29,x30,[sp, #0x30]
0090eb68	ldp x20,x19,[sp, #0x20]
0090eb6c	ldp x22,x21,[sp, #0x10]
0090eb70	ldp x24,x23,[sp], #0x40
0090eb74	ret

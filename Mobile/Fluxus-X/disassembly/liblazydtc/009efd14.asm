; ASN1_TYPE_pack_sequence @ 009efd14
009efd14	str x21,[sp, #-0x30]!
009efd18	mov x8,x0
009efd1c	mov x21,x2
009efd20	mov x0,x1
009efd24	mov x1,x8
009efd28	mov x2,xzr
009efd2c	stp x20,x19,[sp, #0x10]
009efd30	stp x29,x30,[sp, #0x20]
009efd34	add x29,sp,#0x20
009efd38	bl 0x00c37a90
009efd3c	cbz x0,0x009efd9c
009efd40	mov x19,x0
009efd44	cbz x21,0x009efd50
009efd48	ldr x20,[x21]
009efd4c	cbnz x20,0x009efd64
009efd50	bl 0x00c37a40
009efd54	mov x20,x0
009efd58	cbz x0,0x009efda4
009efd5c	cbz x21,0x009efd64
009efd60	str x20,[x21]
009efd64	str x20,[sp, #0x8]
009efd68	ldr w8,[x20]
009efd6c	orr w8,w8,#0x4
009efd70	cmp w8,#0x5
009efd74	mov x8,x20
009efd78	b.eq 0x009efdb4
009efd7c	ldr x8,[x20, #0x8]
009efd80	cbz x8,0x009efdb0
009efd84	add x0,sp,#0x8
009efd88	mov x1,xzr
009efd8c	mov w2,wzr
009efd90	bl 0x00c37ac0
009efd94	ldr x8,[sp, #0x8]
009efd98	b 0x009efdb4
009efd9c	mov x20,xzr
009efda0	b 0x009efdc0
009efda4	mov x0,x19
009efda8	bl 0x00c35530
009efdac	b 0x009efdc0
009efdb0	mov x8,x20
009efdb4	mov w9,#0x10
009efdb8	str w9,[x8]
009efdbc	str x19,[x8, #0x8]
009efdc0	mov x0,x20
009efdc4	ldp x29,x30,[sp, #0x20]
009efdc8	ldp x20,x19,[sp, #0x10]
009efdcc	ldr x21,[sp], #0x30
009efdd0	ret

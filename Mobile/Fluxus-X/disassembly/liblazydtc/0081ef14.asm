; FUN_0081ef14 @ 0081ef14
0081ef14	stp x29,x30,[sp, #-0x60]!
0081ef18	str x27,[sp, #0x10]
0081ef1c	stp x26,x25,[sp, #0x20]
0081ef20	stp x24,x23,[sp, #0x30]
0081ef24	stp x22,x21,[sp, #0x40]
0081ef28	stp x20,x19,[sp, #0x50]
0081ef2c	mov x29,sp
0081ef30	ldrb w26,[x0]
0081ef34	ldrb w25,[x1]
0081ef38	ldr x9,[x0, #0x8]
0081ef3c	ldr x11,[x1, #0x8]
0081ef40	lsr x10,x26,#0x1
0081ef44	tst w26,#0x1
0081ef48	lsr x12,x25,#0x1
0081ef4c	csel x22,x10,x9,eq
0081ef50	tst w25,#0x1
0081ef54	csel x20,x12,x11,eq
0081ef58	add x27,x20,x22
0081ef5c	cmn x27,#0x8
0081ef60	b.cs 0x0081f01c
0081ef64	mov x19,x1
0081ef68	mov x21,x0
0081ef6c	mov x23,x8
0081ef70	cmp x27,#0x16
0081ef74	b.hi 0x0081ef90
0081ef78	lsl w8,w27,#0x1
0081ef7c	mov x0,xzr
0081ef80	stp xzr,xzr,[x23]
0081ef84	str xzr,[x23, #0x10]
0081ef88	strb w8,[x23]
0081ef8c	b 0x0081efb8
0081ef90	orr x8,x27,#0x7
0081ef94	mov w9,#0x1a
0081ef98	cmp x8,#0x17
0081ef9c	csinc x24,x9,x8,eq
0081efa0	mov x0,x24
0081efa4	bl 0x00c2fed0
0081efa8	orr x8,x24,#0x1
0081efac	stp x27,x0,[x23, #0x8]
0081efb0	str x8,[x23]
0081efb4	and w8,w8,#0xff
0081efb8	tst w8,#0x1
0081efbc	csinc x23,x0,x23,ne
0081efc0	cbz x22,0x0081efdc
0081efc4	ldr x8,[x21, #0x10]
0081efc8	tst w26,#0x1
0081efcc	mov x0,x23
0081efd0	mov x2,x22
0081efd4	csinc x1,x8,x21,ne
0081efd8	bl 0x00c2ff60
0081efdc	add x21,x23,x22
0081efe0	cbz x20,0x0081effc
0081efe4	ldr x8,[x19, #0x10]
0081efe8	tst w25,#0x1
0081efec	mov x0,x21
0081eff0	mov x2,x20
0081eff4	csinc x1,x8,x19,ne
0081eff8	bl 0x00c2ff60
0081effc	strb wzr,[x21, x20]
0081f000	ldp x20,x19,[sp, #0x50]
0081f004	ldr x27,[sp, #0x10]
0081f008	ldp x22,x21,[sp, #0x40]
0081f00c	ldp x24,x23,[sp, #0x30]
0081f010	ldp x26,x25,[sp, #0x20]
0081f014	ldp x29,x30,[sp], #0x60
0081f018	ret
0081f01c	bl 0x007fe124

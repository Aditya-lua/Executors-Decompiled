; FUN_0094da20 @ 0094da20
0094da20	stp x22,x21,[sp, #-0x30]!
0094da24	stp x20,x19,[sp, #0x10]
0094da28	stp x29,x30,[sp, #0x20]
0094da2c	add x29,sp,#0x20
0094da30	ldr x21,[x0, #0x20]
0094da34	mov x20,x0
0094da38	mov x19,x1
0094da3c	strb wzr,[x1]
0094da40	mov x0,x21
0094da44	mov w1,wzr
0094da48	bl 0x00908c4c
0094da4c	mov w8,#0xd4c0
0094da50	movk w8,#0x1, LSL #16
0094da54	ldr x10,[x21, #0x3a8]
0094da58	adrp x9,0x94e000
0094da5c	str x8,[x21, #0x460]
0094da60	adrp x8,0x950000
0094da64	add x9,x9,#0x3b8
0094da68	add x8,x8,#0xb80
0094da6c	str x9,[x21, #0x4b8]
0094da70	str x8,[x21, #0x4c0]
0094da74	ldrb w8,[x10, #0x94]
0094da78	tbz w8,#0x0,0x0094daa0
0094da7c	mov w2,#0x1
0094da80	mov x0,x20
0094da84	mov w1,wzr
0094da88	mov x3,x19
0094da8c	bl 0x00907508
0094da90	cbnz w0,0x0094db78
0094da94	ldr x8,[x21, #0x3a0]
0094da98	orr x8,x8,#0x80000
0094da9c	str x8,[x21, #0x3a0]
0094daa0	add x0,x21,#0x428
0094daa4	bl 0x00945250
0094daa8	ldr x21,[x20, #0x20]
0094daac	ldrb w8,[x21, #0x536]
0094dab0	mov x22,x21
0094dab4	cmp x8,#0x1
0094dab8	b.eq 0x0094db4c
0094dabc	ldrb w9,[x20, #0xa85]
0094dac0	mov x22,x21
0094dac4	tbz w9,#0x4,0x0094db4c
0094dac8	ldr x9,[x20, #0x12a0]
0094dacc	cbz x9,0x0094db0c
0094dad0	ldr w9,[x9, #0x8]
0094dad4	mov x22,x21
0094dad8	cmp w9,#0x1
0094dadc	b.lt 0x0094db4c
0094dae0	adrp x9,0xcc4000
0094dae4	add x9,x9,#0x6b8
0094dae8	mov x22,x21
0094daec	ldr w9,[x9, #0x8]
0094daf0	cmp w9,#0x0
0094daf4	b.le 0x0094db4c
0094daf8	cbz x21,0x0094db28
0094dafc	adrp x9,0xc50000
0094db00	add x9,x9,#0x8c0
0094db04	ldr x2,[x9, x8, LSL #0x3]
0094db08	b 0x0094db30
0094db0c	adrp x9,0xcc4000
0094db10	add x9,x9,#0x6b8
0094db14	mov x22,x21
0094db18	ldr w9,[x9, #0x8]
0094db1c	cmp w9,#0x1
0094db20	b.ge 0x0094daf8
0094db24	b 0x0094db4c
0094db28	adrp x2,0x2c1000
0094db2c	add x2,x2,#0x1b5
0094db30	adrp x1,0x2d9000
0094db34	adrp x3,0x2c5000
0094db38	add x1,x1,#0x1be
0094db3c	add x3,x3,#0x1d7
0094db40	mov x0,x20
0094db44	bl 0x00905258
0094db48	ldr x22,[x20, #0x20]
0094db4c	mov w8,#0x1
0094db50	add x1,x22,#0x428
0094db54	mov x0,x20
0094db58	mov w2,wzr
0094db5c	mov w3,wzr
0094db60	strb w8,[x21, #0x536]
0094db64	bl 0x009450b4
0094db68	ldrb w8,[x22, #0x536]
0094db6c	cmp w8,#0x0
0094db70	cset w8,eq
0094db74	strb w8,[x19]
0094db78	ldp x29,x30,[sp, #0x20]
0094db7c	ldp x20,x19,[sp, #0x10]
0094db80	ldp x22,x21,[sp], #0x30
0094db84	ret

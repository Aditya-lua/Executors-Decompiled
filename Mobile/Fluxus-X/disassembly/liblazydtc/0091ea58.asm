; FUN_0091ea58 @ 0091ea58
0091ea58	stp x22,x21,[sp, #-0x30]!
0091ea5c	stp x20,x19,[sp, #0x10]
0091ea60	stp x29,x30,[sp, #0x20]
0091ea64	add x29,sp,#0x20
0091ea68	adrp x21,0x2ca000
0091ea6c	add x21,x21,#0xe27
0091ea70	mov x20,x1
0091ea74	mov x19,x0
0091ea78	strb wzr,[x0]
0091ea7c	mov x0,x21
0091ea80	mov x1,x21
0091ea84	bl 0x00c31b40
0091ea88	cmp w0,#0x0
0091ea8c	adrp x0,0x2a1000
0091ea90	mov w8,#0xa
0091ea94	add x0,x0,#0x7fa
0091ea98	mov x1,x21
0091ea9c	csel x22,x8,xzr,eq
0091eaa0	bl 0x00c31b40
0091eaa4	cmp w0,#0x0
0091eaa8	adrp x0,0x2af000
0091eaac	add x8,x22,#0x9
0091eab0	add x0,x0,#0x2db
0091eab4	mov x1,x21
0091eab8	csel x22,x8,x22,eq
0091eabc	bl 0x00c31b40
0091eac0	cbz w0,0x0091eae0
0091eac4	cbnz x22,0x0091eae4
0091eac8	cmp x20,#0x9
0091eacc	b.cc 0x0091eba4
0091ead0	ldr x8,[x21]
0091ead4	strb wzr,[x19, #0x8]
0091ead8	str x8,[x19]
0091eadc	b 0x0091eba4
0091eae0	add x22,x22,#0x6
0091eae4	cmp x22,x20
0091eae8	b.cs 0x0091eba4
0091eaec	adrp x20,0x2ca000
0091eaf0	add x20,x20,#0xe27
0091eaf4	mov x0,x20
0091eaf8	mov x1,x20
0091eafc	bl 0x00c31b40
0091eb00	cbnz w0,0x0091eb24
0091eb04	ldr x8,[x20]
0091eb08	mov x0,x19
0091eb0c	strb wzr,[x19, #0x8]
0091eb10	str x8,[x19]
0091eb14	bl 0x00c2ff50
0091eb18	add x19,x19,x0
0091eb1c	mov w8,#0x202c
0091eb20	strh w8,[x19], #0x2
0091eb24	adrp x0,0x2a1000
0091eb28	adrp x1,0x2ca000
0091eb2c	add x0,x0,#0x7fa
0091eb30	add x1,x1,#0xe27
0091eb34	bl 0x00c31b40
0091eb38	cbnz w0,0x0091eb64
0091eb3c	mov x8,#0x6564
0091eb40	movk x8,#0x6c66, LSL #16
0091eb44	movk x8,#0x7461, LSL #32
0091eb48	movk x8,#0x65, LSL #48
0091eb4c	mov x0,x19
0091eb50	str x8,[x19]
0091eb54	bl 0x00c2ff50
0091eb58	add x19,x19,x0
0091eb5c	mov w8,#0x202c
0091eb60	strh w8,[x19], #0x2
0091eb64	adrp x0,0x2af000
0091eb68	adrp x1,0x2ca000
0091eb6c	add x0,x0,#0x2db
0091eb70	add x1,x1,#0xe27
0091eb74	bl 0x00c31b40
0091eb78	cbnz w0,0x0091eba0
0091eb7c	mov w8,#0x7a67
0091eb80	movk w8,#0x7069, LSL #16
0091eb84	mov x0,x19
0091eb88	strb wzr,[x19, #0x4]
0091eb8c	str w8,[x19]
0091eb90	bl 0x00c2ff50
0091eb94	add x19,x19,x0
0091eb98	mov w8,#0x202c
0091eb9c	strh w8,[x19], #0x2
0091eba0	sturb wzr,[x19, #-0x2]
0091eba4	ldp x29,x30,[sp, #0x20]
0091eba8	ldp x20,x19,[sp, #0x10]
0091ebac	ldp x22,x21,[sp], #0x30
0091ebb0	ret

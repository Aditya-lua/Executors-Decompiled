; FUN_00b7ea70 @ 00b7ea70
00b7ea70	stp x20,x19,[sp, #-0x20]!
00b7ea74	stp x29,x30,[sp, #0x10]
00b7ea78	add x29,sp,#0x10
00b7ea7c	mov x20,x1
00b7ea80	mov x19,x0
00b7ea84	cbz x1,0x00b7eab4
00b7ea88	ldrh w8,[x19, #0xa]
00b7ea8c	cmp x8,x20
00b7ea90	b.ne 0x00b7eae0
00b7ea94	ldr x0,[x19]
00b7ea98	lsl x2,x20,#0x3
00b7ea9c	mov w1,wzr
00b7eaa0	bl 0x00c301c0
00b7eaa4	mov w8,#0x1
00b7eaa8	mov w0,wzr
00b7eaac	strh w8,[x19, #0x8]
00b7eab0	b 0x00b7eb38
00b7eab4	cbz x19,0x00b7eb34
00b7eab8	ldr x0,[x19]
00b7eabc	cbz x0,0x00b7eacc
00b7eac0	ldrh w8,[x19, #0xa]
00b7eac4	lsl x1,x8,#0x3
00b7eac8	bl 0x00c42230
00b7eacc	mov w8,#0x1
00b7ead0	mov w0,wzr
00b7ead4	str w8,[x19, #0x8]
00b7ead8	str xzr,[x19]
00b7eadc	b 0x00b7eb38
00b7eae0	ldr x0,[x19]
00b7eae4	cbz x0,0x00b7eaf0
00b7eae8	lsl x1,x8,#0x3
00b7eaec	bl 0x00c42230
00b7eaf0	mov w9,#0x2710
00b7eaf4	mov w8,#0x1
00b7eaf8	cmp x20,x9
00b7eafc	str w8,[x19, #0x8]
00b7eb00	str xzr,[x19]
00b7eb04	b.hi 0x00b7eb2c
00b7eb08	mov w1,#0x8
00b7eb0c	mov x0,x20
00b7eb10	bl 0x00c30a30
00b7eb14	mov x8,x0
00b7eb18	cbz x0,0x00b7eb2c
00b7eb1c	mov w0,wzr
00b7eb20	strh w20,[x19, #0xa]
00b7eb24	str x8,[x19]
00b7eb28	b 0x00b7eb38
00b7eb2c	orr w0,wzr,#0xfffffff0
00b7eb30	b 0x00b7eb38
00b7eb34	mov w0,wzr
00b7eb38	ldp x29,x30,[sp, #0x10]
00b7eb3c	ldp x20,x19,[sp], #0x20
00b7eb40	ret

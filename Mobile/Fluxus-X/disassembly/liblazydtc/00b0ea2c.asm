; X509_cmp_time @ 00b0ea2c
00b0ea2c	sub sp,sp,#0x40
00b0ea30	stp x20,x19,[sp, #0x20]
00b0ea34	stp x29,x30,[sp, #0x30]
00b0ea38	ldr w8,[x0, #0x4]
00b0ea3c	mov x19,x0
00b0ea40	mov x20,x1
00b0ea44	str x21,[sp, #0x10]
00b0ea48	cmp w8,#0x18
00b0ea4c	add x29,sp,#0x30
00b0ea50	b.eq 0x00b0ea74
00b0ea54	cmp w8,#0x17
00b0ea58	mov w21,wzr
00b0ea5c	b.ne 0x00b0eb3c
00b0ea60	ldr w8,[x19]
00b0ea64	cmp w8,#0xd
00b0ea68	mov w21,wzr
00b0ea6c	b.eq 0x00b0ea84
00b0ea70	b 0x00b0eb3c
00b0ea74	ldr w8,[x19]
00b0ea78	cmp w8,#0xf
00b0ea7c	mov w21,wzr
00b0ea80	b.ne 0x00b0eb3c
00b0ea84	ldr x8,[x19, #0x8]
00b0ea88	mov x21,xzr
00b0ea8c	ldrb w0,[x8, x21]
00b0ea90	bl 0x00c379b0
00b0ea94	cbz w0,0x00b0ead0
00b0ea98	ldrsw x9,[x19]
00b0ea9c	ldr x8,[x19, #0x8]
00b0eaa0	add x21,x21,#0x1
00b0eaa4	sub x9,x9,#0x1
00b0eaa8	cmp x21,x9
00b0eaac	b.lt 0x00b0ea8c
00b0eab0	ldrb w8,[x8, x9]
00b0eab4	mov w21,wzr
00b0eab8	cmp w8,#0x5a
00b0eabc	b.ne 0x00b0eb3c
00b0eac0	cbz x20,0x00b0ead8
00b0eac4	ldr x1,[x20]
00b0eac8	str x1,[sp, #0x18]
00b0eacc	b 0x00b0eae4
00b0ead0	mov w21,wzr
00b0ead4	b 0x00b0eb3c
00b0ead8	add x0,sp,#0x18
00b0eadc	bl 0x00c30970
00b0eae0	ldr x1,[sp, #0x18]
00b0eae4	mov x0,xzr
00b0eae8	mov w2,wzr
00b0eaec	mov x3,xzr
00b0eaf0	bl 0x00c378f0
00b0eaf4	mov x20,x0
00b0eaf8	cbz x0,0x00b0eb30
00b0eafc	add x0,sp,#0x18
00b0eb00	add x1,sp,#0xc
00b0eb04	mov x2,x19
00b0eb08	mov x3,x20
00b0eb0c	bl 0x00c37920
00b0eb10	cbz w0,0x00b0eb30
00b0eb14	ldr w8,[sp, #0x18]
00b0eb18	ldr w9,[sp, #0xc]
00b0eb1c	orr w8,w9,w8
00b0eb20	lsr w8,w8,#0x1e
00b0eb24	and w8,w8,#0x2
00b0eb28	sub w21,w8,#0x1
00b0eb2c	b 0x00b0eb34
00b0eb30	mov w21,wzr
00b0eb34	mov x0,x20
00b0eb38	bl 0x00c37930
00b0eb3c	mov w0,w21
00b0eb40	ldp x29,x30,[sp, #0x30]
00b0eb44	ldp x20,x19,[sp, #0x20]
00b0eb48	ldr x21,[sp, #0x10]
00b0eb4c	add sp,sp,#0x40
00b0eb50	ret

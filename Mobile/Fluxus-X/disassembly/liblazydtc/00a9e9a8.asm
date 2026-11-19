; OSSL_PARAM_set_int64 @ 00a9e9a8
00a9e9a8	str x21,[sp, #-0x30]!
00a9e9ac	stp x20,x19,[sp, #0x10]
00a9e9b0	stp x29,x30,[sp, #0x20]
00a9e9b4	add x29,sp,#0x20
00a9e9b8	str x1,[sp, #0x8]
00a9e9bc	cbz x0,0x00a9eab8
00a9e9c0	ldr w8,[x0, #0x8]
00a9e9c4	mov x20,x1
00a9e9c8	mov x19,x0
00a9e9cc	str xzr,[x0, #0x20]
00a9e9d0	cmp w8,#0x1
00a9e9d4	b.ne 0x00a9ea14
00a9e9d8	ldr x21,[x19, #0x10]
00a9e9dc	mov w8,#0x8
00a9e9e0	str x8,[x19, #0x20]
00a9e9e4	cbz x21,0x00a9eab4
00a9e9e8	ldr x2,[x19, #0x18]
00a9e9ec	subs x8,x2,#0x8
00a9e9f0	b.eq 0x00a9eab0
00a9e9f4	cmp x2,#0x4
00a9e9f8	b.ne 0x00a9eac8
00a9e9fc	mov w8,#0x80000000
00a9ea00	add x8,x20,x8
00a9ea04	lsr x8,x8,#0x20
00a9ea08	mov w0,wzr
00a9ea0c	cbz x8,0x00a9ea54
00a9ea10	b 0x00a9eab8
00a9ea14	tbnz x20,#0x3f,0x00a9ea64
00a9ea18	cmp w8,#0x2
00a9ea1c	b.ne 0x00a9ea64
00a9ea20	ldr x21,[x19, #0x10]
00a9ea24	mov w8,#0x8
00a9ea28	str x8,[x19, #0x20]
00a9ea2c	cbz x21,0x00a9eab4
00a9ea30	ldr x2,[x19, #0x18]
00a9ea34	subs x8,x2,#0x8
00a9ea38	b.eq 0x00a9eab0
00a9ea3c	cmp x2,#0x4
00a9ea40	b.ne 0x00a9eaf0
00a9ea44	mov w8,#0xffffffff
00a9ea48	cmp x20,x8
00a9ea4c	mov w0,wzr
00a9ea50	b.gt 0x00a9eab8
00a9ea54	mov w8,#0x4
00a9ea58	str x8,[x19, #0x20]
00a9ea5c	str w20,[x21]
00a9ea60	b 0x00a9eab4
00a9ea64	cmp w8,#0x3
00a9ea68	mov w0,wzr
00a9ea6c	b.ne 0x00a9eab8
00a9ea70	ldr x8,[x19, #0x10]
00a9ea74	mov w9,#0x8
00a9ea78	str x9,[x19, #0x20]
00a9ea7c	cbz x8,0x00a9eab4
00a9ea80	ldr x9,[x19, #0x18]
00a9ea84	mov w0,wzr
00a9ea88	cmp x9,#0x8
00a9ea8c	b.ne 0x00a9eab8
00a9ea90	cmp x20,#0x0
00a9ea94	cneg x9,x20,mi
00a9ea98	lsr x9,x9,#0x35
00a9ea9c	mov w0,wzr
00a9eaa0	cbnz x9,0x00a9eab8
00a9eaa4	scvtf d0,x20
00a9eaa8	str d0,[x8]
00a9eaac	b 0x00a9eab4
00a9eab0	str x20,[x21]
00a9eab4	mov w0,#0x1
00a9eab8	ldp x29,x30,[sp, #0x20]
00a9eabc	ldp x20,x19,[sp, #0x10]
00a9eac0	ldr x21,[sp], #0x30
00a9eac4	ret
00a9eac8	mov w9,#0x8
00a9eacc	cmp x2,#0x9
00a9ead0	asr x1,x20,#0x3f
00a9ead4	str x9,[x19, #0x20]
00a9ead8	b.cc 0x00a9eb20
00a9eadc	add x0,x21,#0x8
00a9eae0	mov x2,x8
00a9eae4	bl 0x00c301c0
00a9eae8	str x20,[x21]
00a9eaec	b 0x00a9eb78
00a9eaf0	asr x10,x20,#0x38
00a9eaf4	mov w9,#0x8
00a9eaf8	str x9,[x19, #0x20]
00a9eafc	tbnz w10,#0x1f,0x00a9ebd4
00a9eb00	cmp x2,#0x9
00a9eb04	b.cc 0x00a9eb88
00a9eb08	add x0,x21,#0x8
00a9eb0c	mov w1,wzr
00a9eb10	mov x2,x8
00a9eb14	bl 0x00c301c0
00a9eb18	str x20,[x21]
00a9eb1c	b 0x00a9ebc4
00a9eb20	mov w8,#0x8
00a9eb24	subs x9,x8,x2
00a9eb28	b.eq 0x00a9eb54
00a9eb2c	add x8,sp,#0x8
00a9eb30	mov x10,xzr
00a9eb34	add x11,x8,x2
00a9eb38	mov w8,#0x8
00a9eb3c	ldrb w12,[x11, x10]
00a9eb40	cmp w12,w1, UXTB 
00a9eb44	b.ne 0x00a9ebe4
00a9eb48	add x10,x10,#0x1
00a9eb4c	cmp x10,x9
00a9eb50	b.cc 0x00a9eb3c
00a9eb54	add x8,sp,#0x8
00a9eb58	add x8,x8,x2
00a9eb5c	ldurb w8,[x8, #-0x1]
00a9eb60	eor w8,w8,w1
00a9eb64	sxtb w8,w8
00a9eb68	tbnz w8,#0x1f,0x00a9ebe0
00a9eb6c	add x1,sp,#0x8
00a9eb70	mov x0,x21
00a9eb74	bl 0x00c2ffd0
00a9eb78	ldr x8,[x19, #0x18]
00a9eb7c	mov w0,#0x1
00a9eb80	str x8,[x19, #0x20]
00a9eb84	b 0x00a9eab8
00a9eb88	mov w8,#0x8
00a9eb8c	subs x8,x8,x2
00a9eb90	b.eq 0x00a9ebb8
00a9eb94	add x9,sp,#0x8
00a9eb98	mov x10,xzr
00a9eb9c	add x11,x9,x2
00a9eba0	mov w9,#0x8
00a9eba4	ldrb w12,[x11, x10]
00a9eba8	cbnz w12,0x00a9ebd4
00a9ebac	add x10,x10,#0x1
00a9ebb0	cmp x10,x8
00a9ebb4	b.cc 0x00a9eba4
00a9ebb8	add x1,sp,#0x8
00a9ebbc	mov x0,x21
00a9ebc0	bl 0x00c2ffd0
00a9ebc4	ldr x9,[x19, #0x18]
00a9ebc8	mov w0,#0x1
00a9ebcc	str x9,[x19, #0x20]
00a9ebd0	b 0x00a9eab8
00a9ebd4	mov w0,wzr
00a9ebd8	str x9,[x19, #0x20]
00a9ebdc	b 0x00a9eab8
00a9ebe0	mov w8,#0x8
00a9ebe4	mov w0,wzr
00a9ebe8	str x8,[x19, #0x20]
00a9ebec	b 0x00a9eab8

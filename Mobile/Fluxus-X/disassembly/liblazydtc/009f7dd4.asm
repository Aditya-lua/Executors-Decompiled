; ossl_asn1_do_lock @ 009f7dd4
009f7dd4	str x21,[sp, #-0x30]!
009f7dd8	stp x20,x19,[sp, #0x10]
009f7ddc	stp x29,x30,[sp, #0x20]
009f7de0	ldrb w8,[x2]
009f7de4	add x29,sp,#0x20
009f7de8	cmp w8,#0x6
009f7dec	b.eq 0x009f7dfc
009f7df0	cmp w8,#0x1
009f7df4	mov w19,wzr
009f7df8	b.ne 0x009f7ec4
009f7dfc	ldr x9,[x2, #0x20]
009f7e00	cbz x9,0x009f7e74
009f7e04	ldrb w8,[x9, #0x8]
009f7e08	mov w19,wzr
009f7e0c	tbz w8,#0x0,0x009f7ec4
009f7e10	ldr x20,[x0]
009f7e14	ldrsw x8,[x9, #0xc]
009f7e18	cmp w1,#0x1
009f7e1c	add x8,x20,x8
009f7e20	b.eq 0x009f7e60
009f7e24	ldrsw x21,[x9, #0x10]
009f7e28	cbz w1,0x009f7e7c
009f7e2c	cmn w1,#0x1
009f7e30	b.ne 0x009f7ec0
009f7e34	ldxr w9,[x8]
009f7e38	subs w19,w9,#0x1
009f7e3c	stxr w9,w19,[x8]
009f7e40	cbnz w9,0x009f7e34
009f7e44	b.ne 0x009f7ec4
009f7e48	dmb ISHLD
009f7e4c	ldr x0,[x20, x21#0x0]
009f7e50	bl 0x00c34d40
009f7e54	mov w19,wzr
009f7e58	str xzr,[x20, x21#0x0]
009f7e5c	b 0x009f7ec4
009f7e60	ldxr w9,[x8]
009f7e64	add w19,w9,#0x1
009f7e68	stxr w9,w19,[x8]
009f7e6c	cbnz w9,0x009f7e60
009f7e70	b 0x009f7ec4
009f7e74	mov w19,wzr
009f7e78	b 0x009f7ec4
009f7e7c	mov w19,#0x1
009f7e80	stlr w19,[x8]
009f7e84	bl 0x00c34d50
009f7e88	str x0,[x20, x21#0x0]
009f7e8c	cbnz x0,0x009f7ec4
009f7e90	bl 0x00c342a0
009f7e94	adrp x0,0x2c3000
009f7e98	adrp x2,0x2cd000
009f7e9c	add x0,x0,#0x6e8
009f7ea0	add x2,x2,#0x854
009f7ea4	mov w1,#0x59
009f7ea8	bl 0x00c342b0
009f7eac	mov w1,#0x100
009f7eb0	mov w0,#0xd
009f7eb4	movk w1,#0xc, LSL #16
009f7eb8	mov x2,xzr
009f7ebc	bl 0x00c342c0
009f7ec0	mov w19,#0xffffffff
009f7ec4	mov w0,w19
009f7ec8	ldp x29,x30,[sp, #0x20]
009f7ecc	ldp x20,x19,[sp, #0x10]
009f7ed0	ldr x21,[sp], #0x30
009f7ed4	ret

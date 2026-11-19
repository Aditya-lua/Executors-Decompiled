; FUN_008cbf8c @ 008cbf8c
008cbf8c	cbz x1,0x008cbfec
008cbf90	ldrsb w8,[x1, #0x6]
008cbf94	tbnz w8,#0x1f,0x008cbfec
008cbf98	stp x29,x30,[sp, #-0x30]!
008cbf9c	str x21,[sp, #0x10]
008cbfa0	stp x20,x19,[sp, #0x20]
008cbfa4	mov x29,sp
008cbfa8	ldrb w8,[x1, #0x7]
008cbfac	tbnz w8,#0x1,0x008cbff4
008cbfb0	ldr x8,[x0, #0x60]
008cbfb4	mov x19,x0
008cbfb8	mov x0,x1
008cbfbc	mov x20,x1
008cbfc0	mov w1,#0x7
008cbfc4	mov x21,x2
008cbfc8	ldr x8,[x8, #0x370]
008cbfcc	mov x2,x8
008cbfd0	bl 0x008bdfe0
008cbfd4	mov x1,x20
008cbfd8	mov x2,x21
008cbfdc	cbz x0,0x008cc064
008cbfe0	cmp x1,x2
008cbfe4	b.ne 0x008cc008
008cbfe8	b 0x008cc064
008cbfec	mov x0,xzr
008cbff0	ret
008cbff4	ldr x8,[x1, #0x20]
008cbff8	mov x19,x0
008cbffc	sub x0,x8,#0x80
008cc000	cmp x1,x2
008cc004	b.eq 0x008cc064
008cc008	cbz x2,0x008cc044
008cc00c	ldrsb w8,[x2, #0x6]
008cc010	tbnz w8,#0x1f,0x008cc044
008cc014	ldrb w8,[x2, #0x7]
008cc018	tbnz w8,#0x1,0x008cc04c
008cc01c	ldr x8,[x19, #0x60]
008cc020	mov x19,x0
008cc024	mov x0,x2
008cc028	mov w1,#0x7
008cc02c	ldr x8,[x8, #0x370]
008cc030	mov x2,x8
008cc034	bl 0x008bdfe0
008cc038	mov x1,x0
008cc03c	mov x0,x19
008cc040	cbnz x1,0x008cc054
008cc044	mov x0,xzr
008cc048	b 0x008cc064
008cc04c	ldr x8,[x2, #0x20]
008cc050	sub x1,x8,#0x80
008cc054	mov x19,x0
008cc058	bl 0x008b9214
008cc05c	cmp w0,#0x0
008cc060	csel x0,xzr,x19,eq
008cc064	ldp x20,x19,[sp, #0x20]
008cc068	ldr x21,[sp, #0x10]
008cc06c	ldp x29,x30,[sp], #0x30
008cc070	ret

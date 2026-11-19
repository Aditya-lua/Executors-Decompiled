; FUN_00a89fdc @ 00a89fdc
00a89fdc	sub sp,sp,#0x80
00a89fe0	stp x24,x23,[sp, #0x40]
00a89fe4	stp x22,x21,[sp, #0x50]
00a89fe8	stp x20,x19,[sp, #0x60]
00a89fec	mov x19,x3
00a89ff0	mov x23,x2
00a89ff4	mov x20,x1
00a89ff8	lsr x8,x3,#0x1e
00a89ffc	mov x21,x0
00a8a000	stp x28,x27,[sp, #0x20]
00a8a004	stp x26,x25,[sp, #0x30]
00a8a008	stp x29,x30,[sp, #0x70]
00a8a00c	add x29,sp,#0x70
00a8a010	cbz x8,0x00a8a0c8
00a8a014	orr x28,xzr,#-0x40000000
00a8a018	add x8,x19,x28
00a8a01c	mov w22,#0x40000000
00a8a020	str x8,[sp, #0x8]
00a8a024	and x8,x8,#-0x40000000
00a8a028	str x8,[sp]
00a8a02c	add x8,x8,x22
00a8a030	str x8,[sp, #0x10]
00a8a034	add x8,x23,x8
00a8a038	str x8,[sp, #0x18]
00a8a03c	adrp x25,0xcb5000
00a8a040	ldr x25,[x25, #0x318]
00a8a044	add x24,x21,#0x28
00a8a048	mov x26,x20
00a8a04c	mov x0,x21
00a8a050	bl 0x00c3cea0
00a8a054	mov x27,x0
00a8a058	mov x0,x21
00a8a05c	bl 0x00c3cec0
00a8a060	mov w2,#0x40000000
00a8a064	cbz w0,0x00a8a084
00a8a068	mov x0,x23
00a8a06c	mov x1,x26
00a8a070	mov x3,x27
00a8a074	mov x4,x24
00a8a078	mov x5,x25
00a8a07c	bl 0x00c3e250
00a8a080	b 0x00a8a09c
00a8a084	mov x0,x23
00a8a088	mov x1,x26
00a8a08c	mov x3,x27
00a8a090	mov x4,x24
00a8a094	mov x5,x25
00a8a098	bl 0x00c3e240
00a8a09c	add x19,x19,x28
00a8a0a0	add x23,x23,x22
00a8a0a4	lsr x8,x19,#0x1e
00a8a0a8	add x26,x26,x22
00a8a0ac	cbnz x8,0x00a8a04c
00a8a0b0	ldp x9,x8,[sp]
00a8a0b4	sub x19,x8,x9
00a8a0b8	ldp x8,x22,[sp, #0x10]
00a8a0bc	add x20,x20,x8
00a8a0c0	cbnz x19,0x00a8a0d0
00a8a0c4	b 0x00a8a128
00a8a0c8	mov x22,x23
00a8a0cc	cbz x19,0x00a8a128
00a8a0d0	mov x0,x21
00a8a0d4	bl 0x00c3cea0
00a8a0d8	mov x23,x0
00a8a0dc	mov x0,x21
00a8a0e0	add x24,x21,#0x28
00a8a0e4	bl 0x00c3cec0
00a8a0e8	adrp x5,0xcb5000
00a8a0ec	ldr x5,[x5, #0x318]
00a8a0f0	cbz w0,0x00a8a110
00a8a0f4	mov x0,x22
00a8a0f8	mov x1,x20
00a8a0fc	mov x2,x19
00a8a100	mov x3,x23
00a8a104	mov x4,x24
00a8a108	bl 0x00c3e250
00a8a10c	b 0x00a8a128
00a8a110	mov x0,x22
00a8a114	mov x1,x20
00a8a118	mov x2,x19
00a8a11c	mov x3,x23
00a8a120	mov x4,x24
00a8a124	bl 0x00c3e240
00a8a128	ldp x29,x30,[sp, #0x70]
00a8a12c	ldp x20,x19,[sp, #0x60]
00a8a130	ldp x22,x21,[sp, #0x50]
00a8a134	ldp x24,x23,[sp, #0x40]
00a8a138	ldp x26,x25,[sp, #0x30]
00a8a13c	ldp x28,x27,[sp, #0x20]
00a8a140	mov w0,#0x1
00a8a144	add sp,sp,#0x80
00a8a148	ret

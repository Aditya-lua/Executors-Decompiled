; mbedtls_ecdsa_read_signature_restartable @ 00b9bfe0
00b9bfe0	sub sp,sp,#0x80
00b9bfe4	str x23,[sp, #0x40]
00b9bfe8	stp x22,x21,[sp, #0x50]
00b9bfec	stp x20,x19,[sp, #0x60]
00b9bff0	stp x29,x30,[sp, #0x70]
00b9bff4	add x29,sp,#0x70
00b9bff8	mrs x23,tpidr_el0
00b9bffc	ldr x8,[x23, #0x28]
00b9c000	mov x21,x0
00b9c004	add x0,sp,#0x18
00b9c008	mov x19,x2
00b9c00c	mov x20,x1
00b9c010	str x8,[sp, #0x38]
00b9c014	str x3,[sp, #0x30]
00b9c018	add x22,x3,x4
00b9c01c	bl 0x00c41c00
00b9c020	add x0,sp,#0x8
00b9c024	bl 0x00c41c00
00b9c028	add x0,sp,#0x30
00b9c02c	add x2,sp,#0x28
00b9c030	orr w3,wzr,#0x30
00b9c034	mov x1,x22
00b9c038	bl 0x00c41a70
00b9c03c	cbz w0,0x00b9c04c
00b9c040	mov w8,#0xffffb080
00b9c044	add w19,w0,w8
00b9c048	b 0x00b9c060
00b9c04c	ldp x9,x8,[sp, #0x28]
00b9c050	add x8,x8,x9
00b9c054	cmp x8,x22
00b9c058	b.eq 0x00b9c09c
00b9c05c	mov w19,#0xffffb01a
00b9c060	add x0,sp,#0x18
00b9c064	bl 0x00c41bb0
00b9c068	add x0,sp,#0x8
00b9c06c	bl 0x00c41bb0
00b9c070	ldr x8,[x23, #0x28]
00b9c074	ldr x9,[sp, #0x38]
00b9c078	cmp x8,x9
00b9c07c	b.ne 0x00b9c0f8
00b9c080	mov w0,w19
00b9c084	ldp x29,x30,[sp, #0x70]
00b9c088	ldp x20,x19,[sp, #0x60]
00b9c08c	ldp x22,x21,[sp, #0x50]
00b9c090	ldr x23,[sp, #0x40]
00b9c094	add sp,sp,#0x80
00b9c098	ret
00b9c09c	add x0,sp,#0x30
00b9c0a0	add x2,sp,#0x18
00b9c0a4	mov x1,x22
00b9c0a8	bl 0x00c41a60
00b9c0ac	cbnz w0,0x00b9c040
00b9c0b0	add x0,sp,#0x30
00b9c0b4	add x2,sp,#0x8
00b9c0b8	mov x1,x22
00b9c0bc	bl 0x00c41a60
00b9c0c0	cbnz w0,0x00b9c040
00b9c0c4	add x3,x21,#0xd0
00b9c0c8	add x4,sp,#0x18
00b9c0cc	add x5,sp,#0x8
00b9c0d0	mov x0,x21
00b9c0d4	mov x1,x20
00b9c0d8	mov x2,x19
00b9c0dc	bl 0x00c42560
00b9c0e0	ldr x8,[sp, #0x30]
00b9c0e4	cmp x8,x22
00b9c0e8	ccmp w0,#0x0,#0x0,ne
00b9c0ec	mov w8,#0xffffb400
00b9c0f0	csel w19,w0,w8,ne
00b9c0f4	b 0x00b9c060
00b9c0f8	bl 0x00c2fec0

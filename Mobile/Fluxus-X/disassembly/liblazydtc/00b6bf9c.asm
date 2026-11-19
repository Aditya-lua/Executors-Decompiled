; mbedtls_ccm_encrypt_and_tag @ 00b6bf9c
00b6bf9c	sub sp,sp,#0x80
00b6bfa0	stp x28,x27,[sp, #0x20]
00b6bfa4	stp x26,x25,[sp, #0x30]
00b6bfa8	stp x24,x23,[sp, #0x40]
00b6bfac	stp x22,x21,[sp, #0x50]
00b6bfb0	stp x20,x19,[sp, #0x60]
00b6bfb4	stp x29,x30,[sp, #0x70]
00b6bfb8	add x29,sp,#0x70
00b6bfbc	mrs x28,tpidr_el0
00b6bfc0	ldr x8,[x28, #0x28]
00b6bfc4	sub x9,x3,#0x7
00b6bfc8	mov x21,x6
00b6bfcc	mov x23,x5
00b6bfd0	mov x24,x4
00b6bfd4	mov x25,x3
00b6bfd8	mov x26,x2
00b6bfdc	mov x22,x1
00b6bfe0	mov x19,x0
00b6bfe4	cmp x9,#0x6
00b6bfe8	str x8,[sp, #0x18]
00b6bfec	b.ls 0x00b6bff8
00b6bff0	orr w0,wzr,#0xfffffff3
00b6bff4	b 0x00b6c070
00b6bff8	and w8,w25,#0xff
00b6bffc	orr w9,wzr,#0xf
00b6c000	orr w10,wzr,#0xe
00b6c004	add x27,x19,#0x11
00b6c008	mov w20,#0x1
00b6c00c	sub w9,w9,w8
00b6c010	sub w8,w10,w8
00b6c014	mov x0,x27
00b6c018	mov x1,x26
00b6c01c	mov x2,x25
00b6c020	str x7,[sp, #0x8]
00b6c024	stp xzr,xzr,[x19, #0x10]
00b6c028	stp w9,w20,[x19, #0x40]
00b6c02c	strb w8,[x19, #0x10]
00b6c030	bl 0x00c2ffd0
00b6c034	ldr w2,[x19, #0x40]
00b6c038	add x0,x27,x25
00b6c03c	mov w1,wzr
00b6c040	bl 0x00c301c0
00b6c044	add x0,x19,#0x1
00b6c048	mov x1,x26
00b6c04c	mov x2,x25
00b6c050	strb w20,[x19, #0x1f]
00b6c054	bl 0x00c2ffd0
00b6c058	ldr w8,[x19, #0xa8]
00b6c05c	mov x0,x19
00b6c060	orr w8,w8,#0x1
00b6c064	str w8,[x19, #0xa8]
00b6c068	bl 0x00b6b1c8
00b6c06c	cbz w0,0x00b6c0a0
00b6c070	ldr x8,[x28, #0x28]
00b6c074	ldr x9,[sp, #0x18]
00b6c078	cmp x8,x9
00b6c07c	b.ne 0x00b6c130
00b6c080	ldp x29,x30,[sp, #0x70]
00b6c084	ldp x20,x19,[sp, #0x60]
00b6c088	ldp x22,x21,[sp, #0x50]
00b6c08c	ldp x24,x23,[sp, #0x40]
00b6c090	ldp x26,x25,[sp, #0x30]
00b6c094	ldp x28,x27,[sp, #0x20]
00b6c098	add sp,sp,#0x80
00b6c09c	ret
00b6c0a0	lsr x8,x23,#0x8
00b6c0a4	cmp x8,#0xfe
00b6c0a8	orr w0,wzr,#0xfffffff3
00b6c0ac	b.hi 0x00b6c070
00b6c0b0	ldr x25,[x29, #0x18]
00b6c0b4	cmp x25,#0x2
00b6c0b8	b.eq 0x00b6c070
00b6c0bc	cmp x25,#0x10
00b6c0c0	b.hi 0x00b6c070
00b6c0c4	tbnz w25,#0x0,0x00b6c070
00b6c0c8	ldr w8,[x19, #0xa8]
00b6c0cc	mov x0,x19
00b6c0d0	stp x22,x23,[x19, #0x20]
00b6c0d4	stp x25,xzr,[x19, #0x30]
00b6c0d8	orr w8,w8,#0x2
00b6c0dc	str w8,[x19, #0xa8]
00b6c0e0	bl 0x00b6b1c8
00b6c0e4	cbnz w0,0x00b6c070
00b6c0e8	mov x0,x19
00b6c0ec	mov x1,x24
00b6c0f0	mov x2,x23
00b6c0f4	bl 0x00c42060
00b6c0f8	cbnz w0,0x00b6c070
00b6c0fc	ldr x3,[sp, #0x8]
00b6c100	add x5,sp,#0x10
00b6c104	mov x0,x19
00b6c108	mov x1,x21
00b6c10c	mov x2,x22
00b6c110	mov x4,x22
00b6c114	bl 0x00c42050
00b6c118	cbnz w0,0x00b6c070
00b6c11c	ldr x1,[x29, #0x10]
00b6c120	mov x0,x19
00b6c124	mov x2,x25
00b6c128	bl 0x00c41ff0
00b6c12c	b 0x00b6c070
00b6c130	bl 0x00c2fec0

; mbedtls_sha3_update @ 00baeccc
00baeccc	stp x24,x23,[sp, #-0x40]!
00baecd0	stp x22,x21,[sp, #0x10]
00baecd4	stp x20,x19,[sp, #0x20]
00baecd8	stp x29,x30,[sp, #0x30]
00baecdc	add x29,sp,#0x30
00baece0	mov x21,x2
00baece4	mov x20,x1
00baece8	cmp x2,#0x8
00baecec	mov x19,x0
00baecf0	b.cc 0x00baedfc
00baecf4	ldr w8,[x19, #0xc8]
00baecf8	and w13,w8,#0x7
00baecfc	cmp w13,#0x8
00baed00	b.eq 0x00baed8c
00baed04	eor w9,w13,#0x7
00baed08	mov w14,#0x9
00baed0c	sub x10,x21,#0x1
00baed10	lsl w12,w8,#0x3
00baed14	add x11,x9,#0x1
00baed18	sub w13,w14,w13
00baed1c	mov x14,x20
00baed20	ldrb w15,[x14], #0x1
00baed24	and w17,w8,#0xfffffff8
00baed28	ldr x18,[x19, x17#0x0]
00baed2c	and w16,w12,#0x38
00baed30	sub w13,w13,#0x1
00baed34	lsl x15,x15,x16
00baed38	add w8,w8,#0x1
00baed3c	cmp w13,#0x1
00baed40	eor x15,x15,x18
00baed44	add w12,w12,#0x8
00baed48	str x15,[x19, x17#0x0]
00baed4c	str w8,[x19, #0xc8]
00baed50	b.gt 0x00baed20
00baed54	ldrh w12,[x19, #0xce]
00baed58	sub x21,x10,x9
00baed5c	add x20,x20,x11
00baed60	udiv w9,w8,w12
00baed64	msub w8,w9,w12,w8
00baed68	str w8,[x19, #0xc8]
00baed6c	cbz w8,0x00baed7c
00baed70	cmp x21,#0x8
00baed74	b.cs 0x00baed8c
00baed78	b 0x00baedfc
00baed7c	mov x0,x19
00baed80	bl 0x00baee68
00baed84	cmp x21,#0x8
00baed88	b.cc 0x00baedfc
00baed8c	sub x23,x21,#0x8
00baed90	and x24,x23,#-0x8
00baed94	add x8,x20,x24
00baed98	mov x22,x20
00baed9c	add x20,x8,#0x8
00baeda0	ldr x8,[x22], #0x8
00baeda4	ldr w9,[x19, #0xc8]
00baeda8	sub x21,x21,#0x8
00baedac	and x10,x9,#0xfffffff8
00baedb0	ldr x11,[x19, x10#0x0]
00baedb4	ubfiz w12,w9,#0x3,#0x3
00baedb8	lsl x8,x8,x12
00baedbc	add w9,w9,#0x8
00baedc0	eor x8,x8,x11
00baedc4	str x8,[x19, x10#0x0]
00baedc8	ldrh w8,[x19, #0xce]
00baedcc	udiv w10,w9,w8
00baedd0	msub w8,w10,w8,w9
00baedd4	str w8,[x19, #0xc8]
00baedd8	cbz w8,0x00baede8
00baeddc	cmp x21,#0x7
00baede0	b.hi 0x00baeda0
00baede4	b 0x00baedf8
00baede8	mov x0,x19
00baedec	bl 0x00baee68
00baedf0	cmp x21,#0x7
00baedf4	b.hi 0x00baeda0
00baedf8	sub x21,x23,x24
00baedfc	cbz x21,0x00baee50
00baee00	ldrb w8,[x20], #0x1
00baee04	ldr w9,[x19, #0xc8]
00baee08	sub x21,x21,#0x1
00baee0c	and x10,x9,#0xfffffff8
00baee10	ldr x11,[x19, x10#0x0]
00baee14	ubfiz w12,w9,#0x3,#0x3
00baee18	lsl x8,x8,x12
00baee1c	add w9,w9,#0x1
00baee20	eor x8,x8,x11
00baee24	str x8,[x19, x10#0x0]
00baee28	ldrh w8,[x19, #0xce]
00baee2c	udiv w10,w9,w8
00baee30	msub w8,w10,w8,w9
00baee34	str w8,[x19, #0xc8]
00baee38	cbz w8,0x00baee44
00baee3c	cbnz x21,0x00baee00
00baee40	b 0x00baee50
00baee44	mov x0,x19
00baee48	bl 0x00baee68
00baee4c	cbnz x21,0x00baee00
00baee50	ldp x29,x30,[sp, #0x30]
00baee54	ldp x20,x19,[sp, #0x20]
00baee58	ldp x22,x21,[sp, #0x10]
00baee5c	mov w0,wzr
00baee60	ldp x24,x23,[sp], #0x40
00baee64	ret

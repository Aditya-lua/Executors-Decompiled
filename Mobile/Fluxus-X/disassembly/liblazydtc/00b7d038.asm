; mbedtls_asn1_get_alg_null @ 00b7d038
00b7d038	sub sp,sp,#0x40
00b7d03c	str x19,[sp, #0x20]
00b7d040	stp x29,x30,[sp, #0x30]
00b7d044	add x29,sp,#0x30
00b7d048	mrs x19,tpidr_el0
00b7d04c	ldr x8,[x19, #0x28]
00b7d050	mov x3,sp
00b7d054	str x8,[sp, #0x18]
00b7d058	stp xzr,xzr,[sp]
00b7d05c	str xzr,[sp, #0x10]
00b7d060	bl 0x00c41a40
00b7d064	cbnz w0,0x00b7d088
00b7d068	ldr w8,[sp]
00b7d06c	mov w0,#0xffffff98
00b7d070	cmp w8,#0x5
00b7d074	b.eq 0x00b7d07c
00b7d078	cbnz w8,0x00b7d088
00b7d07c	ldr x8,[sp, #0x8]
00b7d080	cmp x8,#0x0
00b7d084	csel w0,wzr,w0,eq
00b7d088	ldr x8,[x19, #0x28]
00b7d08c	ldr x9,[sp, #0x18]
00b7d090	cmp x8,x9
00b7d094	b.ne 0x00b7d0a8
00b7d098	ldp x29,x30,[sp, #0x30]
00b7d09c	ldr x19,[sp, #0x20]
00b7d0a0	add sp,sp,#0x40
00b7d0a4	ret
00b7d0a8	bl 0x00c2fec0

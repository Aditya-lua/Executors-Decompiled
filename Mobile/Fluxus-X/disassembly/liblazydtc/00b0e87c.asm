; ossl_x509_check_cert_time @ 00b0e87c
00b0e87c	stp x22,x21,[sp, #-0x30]!
00b0e880	stp x20,x19,[sp, #0x10]
00b0e884	stp x29,x30,[sp, #0x20]
00b0e888	ldr x9,[x0, #0x20]
00b0e88c	mov w21,w2
00b0e890	mov x19,x0
00b0e894	mov x20,x1
00b0e898	ldr x8,[x9, #0x18]
00b0e89c	add x29,sp,#0x20
00b0e8a0	tbnz w8,#0x1,0x00b0e8b4
00b0e8a4	mov x22,xzr
00b0e8a8	tbz w8,#0x15,0x00b0e8b8
00b0e8ac	mov w0,#0x1
00b0e8b0	b 0x00b0e970
00b0e8b4	add x22,x9,#0x8
00b0e8b8	mov x0,x20
00b0e8bc	bl 0x00c32ca0
00b0e8c0	mov x1,x22
00b0e8c4	bl 0x00b0ea2c
00b0e8c8	mov w8,w0
00b0e8cc	tbz w21,#0x1f,0x00b0e8d8
00b0e8d0	mov w0,wzr
00b0e8d4	tbz w8,#0x1f,0x00b0e970
00b0e8d8	cbz w8,0x00b0e910
00b0e8dc	cmp w8,#0x1
00b0e8e0	b.lt 0x00b0e94c
00b0e8e4	tbnz w21,#0x1f,0x00b0e998
00b0e8e8	mov w1,w21
00b0e8ec	str w21,[x19, #0xac]
00b0e8f0	mov x0,x20
00b0e8f4	cbnz x20,0x00b0e900
00b0e8f8	ldr x0,[x19, #0x98]
00b0e8fc	bl 0x00c32610
00b0e900	ldr x8,[x19, #0x38]
00b0e904	mov w9,#0x9
00b0e908	str x0,[x19, #0xb8]
00b0e90c	b 0x00b0e938
00b0e910	tbnz w21,#0x1f,0x00b0e9a8
00b0e914	mov w1,w21
00b0e918	str w21,[x19, #0xac]
00b0e91c	mov x0,x20
00b0e920	cbnz x20,0x00b0e92c
00b0e924	ldr x0,[x19, #0x98]
00b0e928	bl 0x00c32610
00b0e92c	ldr x8,[x19, #0x38]
00b0e930	str x0,[x19, #0xb8]
00b0e934	mov w9,#0xd
00b0e938	mov w0,wzr
00b0e93c	mov x1,x19
00b0e940	str w9,[x19, #0xb0]
00b0e944	blr x8
00b0e948	cbz w0,0x00b0e970
00b0e94c	mov x0,x20
00b0e950	bl 0x00c32c90
00b0e954	mov x1,x22
00b0e958	bl 0x00b0ea2c
00b0e95c	mov w8,w0
00b0e960	tbz w21,#0x1f,0x00b0e980
00b0e964	cmp w8,#0x1
00b0e968	mov w0,wzr
00b0e96c	b.ge 0x00b0e980
00b0e970	ldp x29,x30,[sp, #0x20]
00b0e974	ldp x20,x19,[sp, #0x10]
00b0e978	ldp x22,x21,[sp], #0x30
00b0e97c	ret
00b0e980	cbz w8,0x00b0e9b8
00b0e984	tbz w8,#0x1f,0x00b0e8ac
00b0e988	tbnz w21,#0x1f,0x00b0e9f0
00b0e98c	str w21,[x19, #0xac]
00b0e990	cbnz x20,0x00b0ea08
00b0e994	b 0x00b0e9f8
00b0e998	ldr w1,[x19, #0xac]
00b0e99c	mov x0,x20
00b0e9a0	cbnz x20,0x00b0e900
00b0e9a4	b 0x00b0e8f8
00b0e9a8	ldr w1,[x19, #0xac]
00b0e9ac	mov x0,x20
00b0e9b0	cbnz x20,0x00b0e92c
00b0e9b4	b 0x00b0e924
00b0e9b8	tbnz w21,#0x1f,0x00b0e9e4
00b0e9bc	str w21,[x19, #0xac]
00b0e9c0	cbnz x20,0x00b0e9d4
00b0e9c4	ldr x0,[x19, #0x98]
00b0e9c8	mov w1,w21
00b0e9cc	bl 0x00c32610
00b0e9d0	mov x20,x0
00b0e9d4	ldr x8,[x19, #0x38]
00b0e9d8	str x20,[x19, #0xb8]
00b0e9dc	orr w9,wzr,#0xe
00b0e9e0	b 0x00b0ea14
00b0e9e4	ldr w21,[x19, #0xac]
00b0e9e8	cbnz x20,0x00b0e9d4
00b0e9ec	b 0x00b0e9c4
00b0e9f0	ldr w21,[x19, #0xac]
00b0e9f4	cbnz x20,0x00b0ea08
00b0e9f8	ldr x0,[x19, #0x98]
00b0e9fc	mov w1,w21
00b0ea00	bl 0x00c32610
00b0ea04	mov x20,x0
00b0ea08	ldr x8,[x19, #0x38]
00b0ea0c	mov w9,#0xa
00b0ea10	str x20,[x19, #0xb8]
00b0ea14	mov w0,wzr
00b0ea18	mov x1,x19
00b0ea1c	str w9,[x19, #0xb0]
00b0ea20	blr x8
00b0ea24	cbnz w0,0x00b0e8ac
00b0ea28	b 0x00b0e970

; mbedtls_psa_ecp_export_key @ 00b9a584
00b9a584	stp x24,x23,[sp, #-0x40]!
00b9a588	stp x22,x21,[sp, #0x10]
00b9a58c	stp x20,x19,[sp, #0x20]
00b9a590	stp x29,x30,[sp, #0x30]
00b9a594	add x29,sp,#0x30
00b9a598	and w8,w0,#0x7000
00b9a59c	mov x21,x4
00b9a5a0	mov x19,x3
00b9a5a4	mov x20,x2
00b9a5a8	cmp w8,#0x4, LSL #12
00b9a5ac	mov x22,x1
00b9a5b0	b.ne 0x00b9a640
00b9a5b4	add x23,x22,#0xd0
00b9a5b8	mov x0,x23
00b9a5bc	bl 0x00c426d0
00b9a5c0	cbz w0,0x00b9a5f0
00b9a5c4	adrp x4,0xcb5000
00b9a5c8	ldr x4,[x4, #0xac0]
00b9a5cc	add x2,x22,#0xc0
00b9a5d0	add x3,x22,#0x38
00b9a5d4	mov x0,x22
00b9a5d8	mov x1,x23
00b9a5dc	mov x5,xzr
00b9a5e0	bl 0x00c42700
00b9a5e4	bl 0x00c42bf0
00b9a5e8	mov w24,w0
00b9a5ec	cbnz w0,0x00b9a628
00b9a5f0	mov x0,x22
00b9a5f4	mov x1,x23
00b9a5f8	mov w2,wzr
00b9a5fc	mov x3,x21
00b9a600	mov x4,x20
00b9a604	mov x5,x19
00b9a608	bl 0x00c42780
00b9a60c	bl 0x00c42bf0
00b9a610	mov w24,w0
00b9a614	cbz w0,0x00b9a628
00b9a618	mov x0,x20
00b9a61c	mov w1,wzr
00b9a620	mov x2,x19
00b9a624	bl 0x00c301c0
00b9a628	ldp x29,x30,[sp, #0x30]
00b9a62c	ldp x20,x19,[sp, #0x20]
00b9a630	ldp x22,x21,[sp, #0x10]
00b9a634	mov w0,w24
00b9a638	ldp x24,x23,[sp], #0x40
00b9a63c	ret
00b9a640	mov x0,x22
00b9a644	mov x1,x21
00b9a648	mov x2,x20
00b9a64c	mov x3,x19
00b9a650	bl 0x00c427f0
00b9a654	ldp x29,x30,[sp, #0x30]
00b9a658	ldp x20,x19,[sp, #0x20]
00b9a65c	ldp x22,x21,[sp, #0x10]
00b9a660	ldp x24,x23,[sp], #0x40
00b9a664	b 0x00c42bf0

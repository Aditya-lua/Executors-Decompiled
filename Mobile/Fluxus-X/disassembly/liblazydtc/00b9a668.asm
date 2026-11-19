; mbedtls_psa_ecp_export_public_key @ 00b9a668
00b9a668	sub sp,sp,#0x50
00b9a66c	stp x24,x23,[sp, #0x10]
00b9a670	stp x22,x21,[sp, #0x20]
00b9a674	stp x20,x19,[sp, #0x30]
00b9a678	stp x29,x30,[sp, #0x40]
00b9a67c	add x29,sp,#0x40
00b9a680	mrs x24,tpidr_el0
00b9a684	ldr x8,[x24, #0x28]
00b9a688	mov x22,x0
00b9a68c	mov x20,x4
00b9a690	mov x21,x3
00b9a694	str x8,[sp, #0x8]
00b9a698	str xzr,[sp]
00b9a69c	ldrh w8,[x0, #0x2]
00b9a6a0	ldrh w0,[x0]
00b9a6a4	mov x3,x2
00b9a6a8	mov x2,x1
00b9a6ac	mov x4,sp
00b9a6b0	mov x1,x8
00b9a6b4	mov x19,x5
00b9a6b8	bl 0x00c42f80
00b9a6bc	mov w23,w0
00b9a6c0	cbnz w0,0x00b9a710
00b9a6c4	ldrh w8,[x22]
00b9a6c8	ldr x22,[sp]
00b9a6cc	mov w9,#0xcf00
00b9a6d0	mov w10,#0x4100
00b9a6d4	mov w11,#0x4100
00b9a6d8	and w9,w8,w9
00b9a6dc	bfxil w11,w8,#0x0,#0x8
00b9a6e0	cmp w9,w10
00b9a6e4	csel w0,w11,w10,eq
00b9a6e8	mov x1,x22
00b9a6ec	mov x2,x21
00b9a6f0	mov x3,x20
00b9a6f4	mov x4,x19
00b9a6f8	bl 0x00c42f40
00b9a6fc	mov w23,w0
00b9a700	mov x0,x22
00b9a704	bl 0x00c426e0
00b9a708	mov x0,x22
00b9a70c	bl 0x00c30960
00b9a710	ldr x8,[x24, #0x28]
00b9a714	ldr x9,[sp, #0x8]
00b9a718	cmp x8,x9
00b9a71c	b.ne 0x00b9a73c
00b9a720	mov w0,w23
00b9a724	ldp x29,x30,[sp, #0x40]
00b9a728	ldp x20,x19,[sp, #0x30]
00b9a72c	ldp x22,x21,[sp, #0x20]
00b9a730	ldp x24,x23,[sp, #0x10]
00b9a734	add sp,sp,#0x50
00b9a738	ret
00b9a73c	bl 0x00c2fec0

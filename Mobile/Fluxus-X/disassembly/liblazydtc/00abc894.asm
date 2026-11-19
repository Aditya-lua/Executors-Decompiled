; PKCS12_SAFEBAG_get1_crl @ 00abc894
00abc894	str x19,[sp, #-0x20]!
00abc898	stp x29,x30,[sp, #0x10]
00abc89c	mov x19,x0
00abc8a0	ldr x0,[x0]
00abc8a4	add x29,sp,#0x10
00abc8a8	bl 0x00c37750
00abc8ac	cmp w0,#0x99
00abc8b0	mov x0,xzr
00abc8b4	b.ne 0x00abc8e8
00abc8b8	ldr x8,[x19, #0x8]
00abc8bc	ldr x0,[x8]
00abc8c0	bl 0x00c37750
00abc8c4	cmp w0,#0xa0
00abc8c8	mov x0,xzr
00abc8cc	b.ne 0x00abc8e8
00abc8d0	ldr x8,[x19, #0x8]
00abc8d4	ldr x19,[x8, #0x8]
00abc8d8	bl 0x00c3f5f0
00abc8dc	mov x1,x0
00abc8e0	mov x0,x19
00abc8e4	bl 0x00c37aa0
00abc8e8	ldp x29,x30,[sp, #0x10]
00abc8ec	ldr x19,[sp], #0x20
00abc8f0	ret

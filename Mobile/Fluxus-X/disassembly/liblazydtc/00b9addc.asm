; mbedtls_ecdh_gen_public @ 00b9addc
00b9addc	str x23,[sp, #-0x40]!
00b9ade0	stp x22,x21,[sp, #0x10]
00b9ade4	stp x20,x19,[sp, #0x20]
00b9ade8	stp x29,x30,[sp, #0x30]
00b9adec	add x29,sp,#0x30
00b9adf0	mov x20,x3
00b9adf4	mov x22,x2
00b9adf8	mov x2,x3
00b9adfc	mov x3,x4
00b9ae00	mov x19,x4
00b9ae04	mov x21,x1
00b9ae08	mov x23,x0
00b9ae0c	bl 0x00c42680
00b9ae10	cbz w0,0x00b9ae28
00b9ae14	ldp x29,x30,[sp, #0x30]
00b9ae18	ldp x20,x19,[sp, #0x20]
00b9ae1c	ldp x22,x21,[sp, #0x10]
00b9ae20	ldr x23,[sp], #0x40
00b9ae24	ret
00b9ae28	mov x1,x22
00b9ae2c	mov x2,x21
00b9ae30	mov x4,x20
00b9ae34	mov x5,x19
00b9ae38	ldp x29,x30,[sp, #0x30]
00b9ae3c	ldp x20,x19,[sp, #0x20]
00b9ae40	ldp x22,x21,[sp, #0x10]
00b9ae44	add x3,x23,#0x38
00b9ae48	mov x0,x23
00b9ae4c	mov x6,xzr
00b9ae50	ldr x23,[sp], #0x40
00b9ae54	b 0x00c42710

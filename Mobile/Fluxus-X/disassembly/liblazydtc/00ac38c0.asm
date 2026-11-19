; PKCS7_cert_from_signer_info @ 00ac38c0
00ac38c0	stp x20,x19,[sp, #-0x20]!
00ac38c4	stp x29,x30,[sp, #0x10]
00ac38c8	mov x20,x0
00ac38cc	ldr x0,[x0, #0x18]
00ac38d0	add x29,sp,#0x10
00ac38d4	mov x19,x1
00ac38d8	bl 0x00c37750
00ac38dc	cmp w0,#0x16
00ac38e0	b.ne 0x00ac3900
00ac38e4	ldr x8,[x20, #0x20]
00ac38e8	ldr x9,[x19, #0x8]
00ac38ec	ldp x29,x30,[sp, #0x10]
00ac38f0	ldr x0,[x8, #0x10]
00ac38f4	ldp x1,x2,[x9]
00ac38f8	ldp x20,x19,[sp], #0x20
00ac38fc	b 0x00c3f7c0
00ac3900	ldp x29,x30,[sp, #0x10]
00ac3904	mov x0,xzr
00ac3908	ldp x20,x19,[sp], #0x20
00ac390c	ret

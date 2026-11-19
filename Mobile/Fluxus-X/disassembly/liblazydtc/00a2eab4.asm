; ossl_ec_key_simple_generate_key @ 00a2eab4
00a2eab4	stp x24,x23,[sp, #-0x40]!
00a2eab8	stp x22,x21,[sp, #0x10]
00a2eabc	stp x20,x19,[sp, #0x20]
00a2eac0	stp x29,x30,[sp, #0x30]
00a2eac4	mov x21,x0
00a2eac8	ldr x22,[x0, #0x18]
00a2eacc	ldr x0,[x0, #0x58]
00a2ead0	add x29,sp,#0x30
00a2ead4	bl 0x00c38a80
00a2ead8	mov x19,x0
00a2eadc	cbz x0,0x00a2eb20
00a2eae0	ldr x20,[x21, #0x28]
00a2eae4	ldr w23,[x21, #0x3c]
00a2eae8	cbnz x20,0x00a2eaf8
00a2eaec	bl 0x00c38d90
00a2eaf0	mov x20,x0
00a2eaf4	cbz x0,0x00a2ebd8
00a2eaf8	mov x0,x22
00a2eafc	bl 0x00c3aa40
00a2eb00	mov x24,x0
00a2eb04	cbz x0,0x00a2eb30
00a2eb08	tbnz w23,#0x2,0x00a2eb38
00a2eb0c	mov x0,x24
00a2eb10	bl 0x00c369a0
00a2eb14	mov x23,x0
00a2eb18	cbnz x0,0x00a2eb5c
00a2eb1c	b 0x00a2ebdc
00a2eb20	mov x23,xzr
00a2eb24	mov x24,xzr
00a2eb28	mov x20,xzr
00a2eb2c	b 0x00a2ebe0
00a2eb30	mov x23,xzr
00a2eb34	b 0x00a2ebe0
00a2eb38	bl 0x00c37710
00a2eb3c	mov x23,x0
00a2eb40	cbz x0,0x00a2ebdc
00a2eb44	bl 0x00c38de0
00a2eb48	mov x2,x0
00a2eb4c	mov x0,x23
00a2eb50	mov x1,x24
00a2eb54	bl 0x00c38880
00a2eb58	cbz w0,0x00a2ebdc
00a2eb5c	mov x0,x20
00a2eb60	mov x1,x23
00a2eb64	mov w2,wzr
00a2eb68	mov x3,x19
00a2eb6c	bl 0x00c39160
00a2eb70	cbz w0,0x00a2ebdc
00a2eb74	mov x0,x20
00a2eb78	bl 0x00c369b0
00a2eb7c	cbnz w0,0x00a2eb5c
00a2eb80	ldr x24,[x21, #0x20]
00a2eb84	cbnz x24,0x00a2eb98
00a2eb88	mov x0,x22
00a2eb8c	bl 0x00c3ab70
00a2eb90	mov x24,x0
00a2eb94	cbz x0,0x00a2ebe0
00a2eb98	mov x0,x22
00a2eb9c	mov x1,x24
00a2eba0	mov x2,x20
00a2eba4	mov x3,xzr
00a2eba8	mov x4,xzr
00a2ebac	mov x5,x19
00a2ebb0	bl 0x00c3ae30
00a2ebb4	cbz w0,0x00a2ebe0
00a2ebb8	ldr x8,[x21, #0x68]
00a2ebbc	stp x24,x20,[x21, #0x20]
00a2ebc0	mov x20,xzr
00a2ebc4	mov x24,xzr
00a2ebc8	add x8,x8,#0x1
00a2ebcc	str x8,[x21, #0x68]
00a2ebd0	mov w21,#0x1
00a2ebd4	b 0x00a2ec08
00a2ebd8	mov x23,xzr
00a2ebdc	mov x24,xzr
00a2ebe0	adrp x0,0x2b9000
00a2ebe4	add x0,x0,#0xc55
00a2ebe8	bl 0x00c3b010
00a2ebec	ldr x0,[x21, #0x28]
00a2ebf0	bl 0x00c38ca0
00a2ebf4	ldr x1,[x21, #0x20]
00a2ebf8	cbz x1,0x00a2ec04
00a2ebfc	mov x0,x22
00a2ec00	bl 0x00c3af10
00a2ec04	mov w21,wzr
00a2ec08	mov x0,x24
00a2ec0c	bl 0x00c3ab60
00a2ec10	mov x0,x20
00a2ec14	bl 0x00c322e0
00a2ec18	mov x0,x19
00a2ec1c	bl 0x00c38a30
00a2ec20	mov x0,x23
00a2ec24	bl 0x00c36290
00a2ec28	mov w0,w21
00a2ec2c	ldp x29,x30,[sp, #0x30]
00a2ec30	ldp x20,x19,[sp, #0x20]
00a2ec34	ldp x22,x21,[sp, #0x10]
00a2ec38	ldp x24,x23,[sp], #0x40
00a2ec3c	ret

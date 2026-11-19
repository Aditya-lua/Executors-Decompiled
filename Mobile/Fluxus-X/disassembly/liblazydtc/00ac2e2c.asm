; PKCS7_SIGNER_INFO_set @ 00ac2e2c
00ac2e2c	str x23,[sp, #-0x40]!
00ac2e30	stp x22,x21,[sp, #0x10]
00ac2e34	stp x20,x19,[sp, #0x20]
00ac2e38	stp x29,x30,[sp, #0x30]
00ac2e3c	mov x19,x0
00ac2e40	ldr x0,[x0]
00ac2e44	mov x22,x1
00ac2e48	mov w1,#0x1
00ac2e4c	add x29,sp,#0x30
00ac2e50	mov x21,x3
00ac2e54	mov x20,x2
00ac2e58	bl 0x00c375b0
00ac2e5c	cbz w0,0x00ac2ff8
00ac2e60	ldr x23,[x19, #0x8]
00ac2e64	mov x0,x22
00ac2e68	bl 0x00c32cf0
00ac2e6c	mov x1,x0
00ac2e70	mov x0,x23
00ac2e74	bl 0x00c3ef30
00ac2e78	cbz w0,0x00ac2ff8
00ac2e7c	ldr x8,[x19, #0x8]
00ac2e80	ldr x0,[x8, #0x8]
00ac2e84	bl 0x00c37c30
00ac2e88	mov x0,x22
00ac2e8c	bl 0x00c3f060
00ac2e90	bl 0x00c37570
00ac2e94	ldr x8,[x19, #0x8]
00ac2e98	str x0,[x8, #0x8]
00ac2e9c	cbz x0,0x00ac2ff8
00ac2ea0	mov x0,x20
00ac2ea4	bl 0x00c34730
00ac2ea8	ldr x22,[x19, #0x10]
00ac2eac	mov x0,x21
00ac2eb0	str x20,[x19, #0x38]
00ac2eb4	bl 0x00c34c30
00ac2eb8	bl 0x00c37740
00ac2ebc	mov x1,x0
00ac2ec0	mov w2,#0x5
00ac2ec4	mov x0,x22
00ac2ec8	mov x3,xzr
00ac2ecc	bl 0x00c37ee0
00ac2ed0	adrp x1,0x2cf000
00ac2ed4	add x1,x1,#0x33a
00ac2ed8	mov x0,x20
00ac2edc	bl 0x00c346e0
00ac2ee0	cbnz w0,0x00ac2ef8
00ac2ee4	adrp x1,0x2c7000
00ac2ee8	add x1,x1,#0x4e5
00ac2eec	mov x0,x20
00ac2ef0	bl 0x00c346e0
00ac2ef4	cbz w0,0x00ac2f54
00ac2ef8	ldr x8,[x19, #0x10]
00ac2efc	cbz x8,0x00ac2f4c
00ac2f00	ldr x0,[x8]
00ac2f04	cbz x0,0x00ac2f4c
00ac2f08	ldr x20,[x19, #0x38]
00ac2f0c	ldr x19,[x19, #0x20]
00ac2f10	bl 0x00c37750
00ac2f14	cbz w0,0x00ac2f4c
00ac2f18	mov w21,w0
00ac2f1c	mov x0,x20
00ac2f20	bl 0x00c324b0
00ac2f24	mov w2,w0
00ac2f28	add x0,sp,#0xc
00ac2f2c	mov w1,w21
00ac2f30	bl 0x00c3ee10
00ac2f34	cbz w0,0x00ac2f4c
00ac2f38	ldr w0,[sp, #0xc]
00ac2f3c	bl 0x00c37740
00ac2f40	mov x1,x0
00ac2f44	mov w2,#0xffffffff
00ac2f48	b 0x00ac2f80
00ac2f4c	mov w21,#0xffffffff
00ac2f50	b 0x00ac2ffc
00ac2f54	adrp x1,0x2db000
00ac2f58	add x1,x1,#0x996
00ac2f5c	mov x0,x20
00ac2f60	bl 0x00c346e0
00ac2f64	cbz w0,0x00ac2f94
00ac2f68	ldr x19,[x19, #0x20]
00ac2f6c	cbz x19,0x00ac3014
00ac2f70	orr w0,wzr,#0x6
00ac2f74	bl 0x00c37740
00ac2f78	mov x1,x0
00ac2f7c	mov w2,#0x5
00ac2f80	mov x0,x19
00ac2f84	mov x3,xzr
00ac2f88	bl 0x00c37ee0
00ac2f8c	mov w21,#0x1
00ac2f90	b 0x00ac2ffc
00ac2f94	ldr x8,[x20, #0x8]
00ac2f98	cbz x8,0x00ac2fcc
00ac2f9c	ldr x8,[x8, #0xb0]
00ac2fa0	cbz x8,0x00ac2fcc
00ac2fa4	mov w1,#0x1
00ac2fa8	mov x0,x20
00ac2fac	mov x2,xzr
00ac2fb0	mov x3,x19
00ac2fb4	mov w21,#0x1
00ac2fb8	blr x8
00ac2fbc	cmp w0,#0x0
00ac2fc0	b.gt 0x00ac2ffc
00ac2fc4	cmn w0,#0x2
00ac2fc8	b.ne 0x00ac301c
00ac2fcc	bl 0x00c342a0
00ac2fd0	adrp x0,0x2ce000
00ac2fd4	adrp x2,0x2dc000
00ac2fd8	add x0,x0,#0x1ca
00ac2fdc	add x2,x2,#0x889
00ac2fe0	mov w1,#0x17e
00ac2fe4	bl 0x00c342b0
00ac2fe8	mov w0,#0x21
00ac2fec	mov w1,#0x94
00ac2ff0	mov x2,xzr
00ac2ff4	bl 0x00c342c0
00ac2ff8	mov w21,wzr
00ac2ffc	mov w0,w21
00ac3000	ldp x29,x30,[sp, #0x30]
00ac3004	ldp x20,x19,[sp, #0x20]
00ac3008	ldp x22,x21,[sp, #0x10]
00ac300c	ldr x23,[sp], #0x40
00ac3010	ret
00ac3014	mov w21,#0x1
00ac3018	b 0x00ac2ffc
00ac301c	bl 0x00c342a0
00ac3020	adrp x0,0x2ce000
00ac3024	adrp x2,0x2dc000
00ac3028	add x0,x0,#0x1ca
00ac302c	add x2,x2,#0x889
00ac3030	mov w1,#0x17a
00ac3034	bl 0x00c342b0
00ac3038	mov w0,#0x21
00ac303c	mov w1,#0x93
00ac3040	b 0x00ac2ff0

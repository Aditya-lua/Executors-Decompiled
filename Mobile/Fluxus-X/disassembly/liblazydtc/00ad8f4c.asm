; RSA_sign_ASN1_OCTET_STRING @ 00ad8f4c
00ad8f4c	sub sp,sp,#0x60
00ad8f50	mov w8,#0x4
00ad8f54	str x1,[sp, #0x10]
00ad8f58	add x0,sp,#0x8
00ad8f5c	mov x1,xzr
00ad8f60	stp x24,x23,[sp, #0x20]
00ad8f64	stp x22,x21,[sp, #0x30]
00ad8f68	stp x20,x19,[sp, #0x40]
00ad8f6c	stp x29,x30,[sp, #0x50]
00ad8f70	add x29,sp,#0x50
00ad8f74	mov x20,x5
00ad8f78	mov x19,x4
00ad8f7c	mov x21,x3
00ad8f80	stp w2,w8,[sp, #0x8]
00ad8f84	bl 0x00c381d0
00ad8f88	mov w24,w0
00ad8f8c	mov x0,x20
00ad8f90	bl 0x00c3fab0
00ad8f94	sub w8,w0,#0xb
00ad8f98	cmp w24,w8
00ad8f9c	b.le 0x00ad8fc8
00ad8fa0	bl 0x00c342a0
00ad8fa4	adrp x0,0x29e000
00ad8fa8	adrp x2,0x2da000
00ad8fac	add x0,x0,#0x9ef
00ad8fb0	add x2,x2,#0x5e8
00ad8fb4	mov w1,#0x27
00ad8fb8	bl 0x00c342b0
00ad8fbc	mov w0,#0x4
00ad8fc0	orr w1,wzr,#0x70
00ad8fc4	b 0x00ad904c
00ad8fc8	add w22,w0,#0x1
00ad8fcc	adrp x1,0x29e000
00ad8fd0	add x1,x1,#0x9ef
00ad8fd4	mov w2,#0x2a
00ad8fd8	mov x0,x22
00ad8fdc	bl 0x00c32320
00ad8fe0	cbz x0,0x00ad9024
00ad8fe4	mov x23,x0
00ad8fe8	str x0,[sp]
00ad8fec	add x0,sp,#0x8
00ad8ff0	mov x1,sp
00ad8ff4	bl 0x00c381d0
00ad8ff8	mov w4,#0x1
00ad8ffc	mov w0,w24
00ad9000	mov x1,x23
00ad9004	mov x2,x21
00ad9008	mov x3,x20
00ad900c	bl 0x00c3fde0
00ad9010	cmp w0,#0x1
00ad9014	b.lt 0x00ad905c
00ad9018	str w0,[x19]
00ad901c	mov w19,#0x1
00ad9020	b 0x00ad9060
00ad9024	bl 0x00c342a0
00ad9028	adrp x0,0x29e000
00ad902c	adrp x2,0x2da000
00ad9030	add x0,x0,#0x9ef
00ad9034	add x2,x2,#0x5e8
00ad9038	mov w1,#0x2c
00ad903c	bl 0x00c342b0
00ad9040	mov w1,#0x100
00ad9044	mov w0,#0x4
00ad9048	movk w1,#0xc, LSL #16
00ad904c	mov x2,xzr
00ad9050	bl 0x00c342c0
00ad9054	mov w19,wzr
00ad9058	b 0x00ad9078
00ad905c	mov w19,wzr
00ad9060	adrp x2,0x29e000
00ad9064	add x2,x2,#0x9ef
00ad9068	mov w3,#0x37
00ad906c	mov x0,x23
00ad9070	mov x1,x22
00ad9074	bl 0x00c345e0
00ad9078	mov w0,w19
00ad907c	ldp x29,x30,[sp, #0x50]
00ad9080	ldp x20,x19,[sp, #0x40]
00ad9084	ldp x22,x21,[sp, #0x30]
00ad9088	ldp x24,x23,[sp, #0x20]
00ad908c	add sp,sp,#0x60
00ad9090	ret

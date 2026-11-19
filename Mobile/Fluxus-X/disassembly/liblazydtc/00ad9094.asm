; RSA_verify_ASN1_OCTET_STRING @ 00ad9094
00ad9094	str x25,[sp, #-0x50]!
00ad9098	mov x0,x5
00ad909c	stp x24,x23,[sp, #0x10]
00ad90a0	stp x22,x21,[sp, #0x20]
00ad90a4	stp x20,x19,[sp, #0x30]
00ad90a8	stp x29,x30,[sp, #0x40]
00ad90ac	add x29,sp,#0x40
00ad90b0	mov x22,x5
00ad90b4	mov w24,w4
00ad90b8	mov x25,x3
00ad90bc	mov w23,w2
00ad90c0	mov x21,x1
00ad90c4	bl 0x00c3fab0
00ad90c8	cmp w0,w24
00ad90cc	b.ne 0x00ad9180
00ad90d0	mov w19,w24
00ad90d4	adrp x1,0x29e000
00ad90d8	add x1,x1,#0x9ef
00ad90dc	mov w2,#0x4a
00ad90e0	mov x0,x19
00ad90e4	bl 0x00c32320
00ad90e8	mov x20,x0
00ad90ec	cbz x0,0x00ad91b4
00ad90f0	mov w4,#0x1
00ad90f4	mov w0,w24
00ad90f8	mov x1,x25
00ad90fc	mov x2,x20
00ad9100	mov x3,x22
00ad9104	bl 0x00c3fdf0
00ad9108	cmp w0,#0x1
00ad910c	b.lt 0x00ad91e4
00ad9110	sxtw x2,w0
00ad9114	add x1,sp,#0x8
00ad9118	mov x0,xzr
00ad911c	str x20,[sp, #0x8]
00ad9120	bl 0x00c37c80
00ad9124	mov x22,x0
00ad9128	cbz x0,0x00ad9178
00ad912c	ldr w8,[x22]
00ad9130	cmp w8,w23
00ad9134	b.ne 0x00ad914c
00ad9138	ldr x1,[x22, #0x8]
00ad913c	mov w2,w23
00ad9140	mov x0,x21
00ad9144	bl 0x00c300b0
00ad9148	cbz w0,0x00ad9228
00ad914c	bl 0x00c342a0
00ad9150	adrp x0,0x29e000
00ad9154	adrp x2,0x2b2000
00ad9158	add x0,x0,#0x9ef
00ad915c	add x2,x2,#0xb47
00ad9160	mov w1,#0x5b
00ad9164	bl 0x00c342b0
00ad9168	mov w0,#0x4
00ad916c	mov w1,#0x68
00ad9170	mov x2,xzr
00ad9174	bl 0x00c342c0
00ad9178	mov w21,wzr
00ad917c	b 0x00ad91ec
00ad9180	bl 0x00c342a0
00ad9184	adrp x0,0x29e000
00ad9188	adrp x2,0x2b2000
00ad918c	add x0,x0,#0x9ef
00ad9190	add x2,x2,#0xb47
00ad9194	mov w1,#0x46
00ad9198	bl 0x00c342b0
00ad919c	mov w0,#0x4
00ad91a0	mov w1,#0x77
00ad91a4	mov x2,xzr
00ad91a8	bl 0x00c342c0
00ad91ac	mov w21,wzr
00ad91b0	b 0x00ad920c
00ad91b4	bl 0x00c342a0
00ad91b8	adrp x0,0x29e000
00ad91bc	adrp x2,0x2b2000
00ad91c0	add x0,x0,#0x9ef
00ad91c4	add x2,x2,#0xb47
00ad91c8	mov w1,#0x4c
00ad91cc	bl 0x00c342b0
00ad91d0	mov w1,#0x100
00ad91d4	mov w0,#0x4
00ad91d8	movk w1,#0xc, LSL #16
00ad91dc	mov x2,xzr
00ad91e0	bl 0x00c342c0
00ad91e4	mov w21,wzr
00ad91e8	mov x22,xzr
00ad91ec	mov x0,x22
00ad91f0	bl 0x00c35530
00ad91f4	adrp x2,0x29e000
00ad91f8	add x2,x2,#0x9ef
00ad91fc	mov w3,#0x61
00ad9200	mov x0,x20
00ad9204	mov x1,x19
00ad9208	bl 0x00c345e0
00ad920c	mov w0,w21
00ad9210	ldp x29,x30,[sp, #0x40]
00ad9214	ldp x20,x19,[sp, #0x30]
00ad9218	ldp x22,x21,[sp, #0x20]
00ad921c	ldp x24,x23,[sp, #0x10]
00ad9220	ldr x25,[sp], #0x50
00ad9224	ret
00ad9228	mov w21,#0x1
00ad922c	b 0x00ad91ec

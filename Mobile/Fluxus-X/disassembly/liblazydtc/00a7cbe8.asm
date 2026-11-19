; ossl_ffc_generate_private_key @ 00a7cbe8
00a7cbe8	stp x24,x23,[sp, #-0x40]!
00a7cbec	stp x22,x21,[sp, #0x10]
00a7cbf0	stp x20,x19,[sp, #0x20]
00a7cbf4	stp x29,x30,[sp, #0x30]
00a7cbf8	ldr x8,[x1, #0x8]
00a7cbfc	mov x20,x0
00a7cc00	add x29,sp,#0x30
00a7cc04	mov x19,x4
00a7cc08	mov x0,x8
00a7cc0c	mov w21,w3
00a7cc10	mov w23,w2
00a7cc14	mov x22,x1
00a7cc18	bl 0x00c322f0
00a7cc1c	cbz w21,0x00a7ccbc
00a7cc20	cbz w23,0x00a7ccec
00a7cc24	lsl w8,w21,#0x1
00a7cc28	cmp w23,w8
00a7cc2c	b.lt 0x00a7cd04
00a7cc30	cmp w23,w0
00a7cc34	mov w24,wzr
00a7cc38	b.gt 0x00a7ccd4
00a7cc3c	bl 0x00c37710
00a7cc40	mov x21,x0
00a7cc44	cbz x0,0x00a7ccc8
00a7cc48	bl 0x00c38de0
00a7cc4c	mov x1,x0
00a7cc50	mov x0,x21
00a7cc54	mov w2,w23
00a7cc58	bl 0x00c38fc0
00a7cc5c	cbz w0,0x00a7ccc8
00a7cc60	ldr x1,[x22, #0x8]
00a7cc64	mov x0,x21
00a7cc68	bl 0x00c38cc0
00a7cc6c	cmp w0,#0x1
00a7cc70	mov x23,x21
00a7cc74	b.lt 0x00a7cc7c
00a7cc78	ldr x23,[x22, #0x8]
00a7cc7c	mov x0,x19
00a7cc80	mov x1,x21
00a7cc84	mov w2,wzr
00a7cc88	mov x3,x20
00a7cc8c	bl 0x00c39160
00a7cc90	cbz w0,0x00a7ccc8
00a7cc94	mov w1,#0x1
00a7cc98	mov x0,x19
00a7cc9c	bl 0x00c376e0
00a7cca0	cbz w0,0x00a7ccc8
00a7cca4	mov x0,x19
00a7cca8	mov x1,x23
00a7ccac	bl 0x00c38cc0
00a7ccb0	tbz w0,#0x1f,0x00a7cc7c
00a7ccb4	mov w24,#0x1
00a7ccb8	b 0x00a7cccc
00a7ccbc	mov w24,wzr
00a7ccc0	mov x21,xzr
00a7ccc4	b 0x00a7cccc
00a7ccc8	mov w24,wzr
00a7cccc	mov x0,x21
00a7ccd0	bl 0x00c36290
00a7ccd4	ldp x29,x30,[sp, #0x30]
00a7ccd8	ldp x20,x19,[sp, #0x20]
00a7ccdc	ldp x22,x21,[sp, #0x10]
00a7cce0	mov w0,w24
00a7cce4	ldp x24,x23,[sp], #0x40
00a7cce8	ret
00a7ccec	ldr w9,[x22, #0x58]
00a7ccf0	lsl w8,w21,#0x1
00a7ccf4	cmp w9,#0x0
00a7ccf8	csel w23,w8,w9,eq
00a7ccfc	cmp w23,w8
00a7cd00	b.ge 0x00a7cc30
00a7cd04	mov w24,wzr
00a7cd08	b 0x00a7ccd4

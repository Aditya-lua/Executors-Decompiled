; DIST_POINT_set_dpname @ 00afcad4
00afcad4	str x21,[sp, #-0x30]!
00afcad8	stp x20,x19,[sp, #0x10]
00afcadc	stp x29,x30,[sp, #0x20]
00afcae0	add x29,sp,#0x20
00afcae4	cbz x0,0x00afcb74
00afcae8	ldr w8,[x0]
00afcaec	mov x19,x0
00afcaf0	cmp w8,#0x1
00afcaf4	b.ne 0x00afcb74
00afcaf8	ldp x20,x0,[x19, #0x8]
00afcafc	mov x21,x1
00afcb00	bl 0x00c34810
00afcb04	mov x0,x21
00afcb08	bl 0x00c34f50
00afcb0c	str x0,[x19, #0x10]
00afcb10	cbz x0,0x00afcb78
00afcb14	mov x0,x20
00afcb18	bl 0x00c325e0
00afcb1c	cmp w0,#0x1
00afcb20	b.lt 0x00afcb64
00afcb24	mov w21,wzr
00afcb28	mov x0,x20
00afcb2c	mov w1,w21
00afcb30	bl 0x00c32610
00afcb34	mov x1,x0
00afcb38	ldr x0,[x19, #0x10]
00afcb3c	cmp w21,#0x0
00afcb40	cset w3,eq
00afcb44	mov w2,#0xffffffff
00afcb48	bl 0x00c40950
00afcb4c	cbz w0,0x00afcb88
00afcb50	mov x0,x20
00afcb54	add w21,w21,#0x1
00afcb58	bl 0x00c325e0
00afcb5c	cmp w21,w0
00afcb60	b.lt 0x00afcb28
00afcb64	ldr x0,[x19, #0x10]
00afcb68	mov x1,xzr
00afcb6c	bl 0x00c350f0
00afcb70	tbnz w0,#0x1f,0x00afcb88
00afcb74	mov w0,#0x1
00afcb78	ldp x29,x30,[sp, #0x20]
00afcb7c	ldp x20,x19,[sp, #0x10]
00afcb80	ldr x21,[sp], #0x30
00afcb84	ret
00afcb88	ldr x0,[x19, #0x10]
00afcb8c	bl 0x00c34810
00afcb90	mov w0,wzr
00afcb94	str xzr,[x19, #0x10]
00afcb98	b 0x00afcb78

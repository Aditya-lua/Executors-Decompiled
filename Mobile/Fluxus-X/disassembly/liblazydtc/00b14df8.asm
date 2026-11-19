; X509_NAME_delete_entry @ 00b14df8
00b14df8	str x23,[sp, #-0x40]!
00b14dfc	stp x22,x21,[sp, #0x10]
00b14e00	stp x20,x19,[sp, #0x20]
00b14e04	stp x29,x30,[sp, #0x30]
00b14e08	add x29,sp,#0x30
00b14e0c	cbz x0,0x00b14e78
00b14e10	mov x23,x0
00b14e14	ldr x0,[x0]
00b14e18	mov w19,w1
00b14e1c	bl 0x00c325e0
00b14e20	tbnz w19,#0x1f,0x00b14e78
00b14e24	cmp w0,w19
00b14e28	mov x20,xzr
00b14e2c	b.le 0x00b14e7c
00b14e30	ldr x21,[x23]
00b14e34	mov w1,w19
00b14e38	mov x0,x21
00b14e3c	bl 0x00c35320
00b14e40	mov x20,x0
00b14e44	mov x0,x21
00b14e48	bl 0x00c325e0
00b14e4c	mov w8,#0x1
00b14e50	cmp w0,w19
00b14e54	str w8,[x23, #0x8]
00b14e58	b.eq 0x00b14e7c
00b14e5c	mov w22,w0
00b14e60	cbz w19,0x00b14e94
00b14e64	sub w1,w19,#0x1
00b14e68	mov x0,x21
00b14e6c	bl 0x00c32610
00b14e70	ldr w23,[x0, #0x10]
00b14e74	b 0x00b14e9c
00b14e78	mov x20,xzr
00b14e7c	mov x0,x20
00b14e80	ldp x29,x30,[sp, #0x30]
00b14e84	ldp x20,x19,[sp, #0x20]
00b14e88	ldp x22,x21,[sp, #0x10]
00b14e8c	ldr x23,[sp], #0x40
00b14e90	ret
00b14e94	ldr w8,[x20, #0x10]
00b14e98	sub w23,w8,#0x1
00b14e9c	mov x0,x21
00b14ea0	mov w1,w19
00b14ea4	bl 0x00c32610
00b14ea8	ldr w8,[x0, #0x10]
00b14eac	add w9,w23,#0x1
00b14eb0	cmp w9,w8
00b14eb4	b.ge 0x00b14e7c
00b14eb8	cmp w22,w19
00b14ebc	b.le 0x00b14e7c
00b14ec0	mov x0,x21
00b14ec4	mov w1,w19
00b14ec8	bl 0x00c32610
00b14ecc	ldr w8,[x0, #0x10]
00b14ed0	add w19,w19,#0x1
00b14ed4	cmp w22,w19
00b14ed8	sub w8,w8,#0x1
00b14edc	str w8,[x0, #0x10]
00b14ee0	b.ne 0x00b14ec0
00b14ee4	b 0x00b14e7c

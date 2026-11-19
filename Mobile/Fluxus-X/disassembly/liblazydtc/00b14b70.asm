; X509_NAME_get_text_by_OBJ @ 00b14b70
00b14b70	str x25,[sp, #-0x50]!
00b14b74	stp x24,x23,[sp, #0x10]
00b14b78	stp x22,x21,[sp, #0x20]
00b14b7c	stp x20,x19,[sp, #0x30]
00b14b80	stp x29,x30,[sp, #0x40]
00b14b84	add x29,sp,#0x40
00b14b88	cbz x0,0x00b14be0
00b14b8c	ldr x23,[x0]
00b14b90	mov x21,x0
00b14b94	mov w20,w3
00b14b98	mov x19,x2
00b14b9c	mov x0,x23
00b14ba0	mov x22,x1
00b14ba4	bl 0x00c325e0
00b14ba8	mov w24,w0
00b14bac	orr w25,wzr,#0xfffffffe
00b14bb0	add w1,w25,#0x2
00b14bb4	cmp w1,w24
00b14bb8	b.ge 0x00b14be0
00b14bbc	mov x0,x23
00b14bc0	bl 0x00c32610
00b14bc4	ldr x0,[x0]
00b14bc8	mov x1,x22
00b14bcc	bl 0x00c37ab0
00b14bd0	add w25,w25,#0x1
00b14bd4	cbnz w0,0x00b14bb0
00b14bd8	cmn w25,#0x1
00b14bdc	b.ge 0x00b14c00
00b14be0	mov w20,#0xffffffff
00b14be4	mov w0,w20
00b14be8	ldp x29,x30,[sp, #0x40]
00b14bec	ldp x20,x19,[sp, #0x30]
00b14bf0	ldp x22,x21,[sp, #0x20]
00b14bf4	ldp x24,x23,[sp, #0x10]
00b14bf8	ldr x25,[sp], #0x50
00b14bfc	ret
00b14c00	ldr x0,[x21]
00b14c04	add w22,w25,#0x1
00b14c08	bl 0x00c325e0
00b14c0c	cmp w0,w22
00b14c10	mov x8,xzr
00b14c14	b.le 0x00b14c2c
00b14c18	ldr x0,[x21]
00b14c1c	mov w1,w22
00b14c20	bl 0x00c32610
00b14c24	cbz x0,0x00b14c68
00b14c28	ldr x8,[x0, #0x8]
00b14c2c	cbz x19,0x00b14c70
00b14c30	subs w9,w20,#0x1
00b14c34	b.lt 0x00b14c60
00b14c38	ldr w10,[x8]
00b14c3c	ldr x1,[x8, #0x8]
00b14c40	mov x0,x19
00b14c44	cmp w10,w20
00b14c48	csel w20,w10,w9,lt
00b14c4c	sxtw x21,w20
00b14c50	mov x2,x21
00b14c54	bl 0x00c2ffd0
00b14c58	strb wzr,[x19, x21]
00b14c5c	b 0x00b14be4
00b14c60	mov w20,wzr
00b14c64	b 0x00b14be4
00b14c68	mov x8,xzr
00b14c6c	cbnz x19,0x00b14c30
00b14c70	ldr w20,[x8]
00b14c74	b 0x00b14be4

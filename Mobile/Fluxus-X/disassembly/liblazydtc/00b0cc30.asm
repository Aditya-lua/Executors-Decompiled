; FUN_00b0cc30 @ 00b0cc30
00b0cc30	str x23,[sp, #-0x40]!
00b0cc34	stp x22,x21,[sp, #0x10]
00b0cc38	stp x20,x19,[sp, #0x20]
00b0cc3c	stp x29,x30,[sp, #0x30]
00b0cc40	ldr x23,[x1, #0x150]
00b0cc44	mov w19,w2
00b0cc48	mov x21,x1
00b0cc4c	add x29,sp,#0x30
00b0cc50	cbz x23,0x00b0cd00
00b0cc54	mov w20,w0
00b0cc58	ldr x0,[x23, #0x8]
00b0cc5c	cbz x0,0x00b0cca8
00b0cc60	bl 0x00c325e0
00b0cc64	cmp w0,#0x1
00b0cc68	b.lt 0x00b0cca8
00b0cc6c	mov w22,wzr
00b0cc70	ldr x0,[x23, #0x8]
00b0cc74	mov w1,w22
00b0cc78	bl 0x00c32610
00b0cc7c	bl 0x00c37750
00b0cc80	cmp w0,w20
00b0cc84	b.eq 0x00b0ccf8
00b0cc88	tbz w19,#0x4,0x00b0cc94
00b0cc8c	cmp w0,#0x38e
00b0cc90	b.eq 0x00b0ccf8
00b0cc94	ldr x0,[x23, #0x8]
00b0cc98	add w22,w22,#0x1
00b0cc9c	bl 0x00c325e0
00b0cca0	cmp w22,w0
00b0cca4	b.lt 0x00b0cc70
00b0cca8	ldr x0,[x23]
00b0ccac	cbz x0,0x00b0cd00
00b0ccb0	bl 0x00c325e0
00b0ccb4	cmp w0,#0x1
00b0ccb8	b.lt 0x00b0ccf8
00b0ccbc	mov w21,wzr
00b0ccc0	ldr x0,[x23]
00b0ccc4	mov w1,w21
00b0ccc8	bl 0x00c32610
00b0cccc	bl 0x00c37750
00b0ccd0	cmp w0,w20
00b0ccd4	b.eq 0x00b0cd30
00b0ccd8	tbz w19,#0x4,0x00b0cce4
00b0ccdc	cmp w0,#0x38e
00b0cce0	b.eq 0x00b0cd30
00b0cce4	ldr x0,[x23]
00b0cce8	add w21,w21,#0x1
00b0ccec	bl 0x00c325e0
00b0ccf0	cmp w21,w0
00b0ccf4	b.lt 0x00b0ccc0
00b0ccf8	mov w0,#0x2
00b0ccfc	b 0x00b0cd34
00b0cd00	tbz w19,#0x3,0x00b0cd28
00b0cd04	mov w1,#0xffffffff
00b0cd08	mov x0,x21
00b0cd0c	mov w2,wzr
00b0cd10	bl 0x00c40a60
00b0cd14	cmp w0,#0x1
00b0cd18	b.ne 0x00b0cd28
00b0cd1c	tbnz w19,#0x2,0x00b0cd28
00b0cd20	ldrb w8,[x21, #0xe9]
00b0cd24	tbnz w8,#0x5,0x00b0cd30
00b0cd28	orr w0,wzr,#0x3
00b0cd2c	b 0x00b0cd34
00b0cd30	mov w0,#0x1
00b0cd34	ldp x29,x30,[sp, #0x30]
00b0cd38	ldp x20,x19,[sp, #0x20]
00b0cd3c	ldp x22,x21,[sp, #0x10]
00b0cd40	ldr x23,[sp], #0x40
00b0cd44	ret

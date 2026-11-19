; X509_check_akid @ 00b02c8c
00b02c8c	str x21,[sp, #-0x30]!
00b02c90	stp x20,x19,[sp, #0x10]
00b02c94	stp x29,x30,[sp, #0x20]
00b02c98	add x29,sp,#0x20
00b02c9c	cbz x1,0x00b02d58
00b02ca0	mov x19,x0
00b02ca4	ldr x0,[x1]
00b02ca8	mov x20,x1
00b02cac	cbz x0,0x00b02cc8
00b02cb0	ldr x1,[x19, #0xf8]
00b02cb4	cbz x1,0x00b02cc8
00b02cb8	bl 0x00c37780
00b02cbc	cbz w0,0x00b02cc8
00b02cc0	orr w0,wzr,#0x1e
00b02cc4	b 0x00b02d5c
00b02cc8	ldr x8,[x20, #0x10]
00b02ccc	cbz x8,0x00b02cec
00b02cd0	mov x0,x19
00b02cd4	bl 0x00c3f060
00b02cd8	ldr x1,[x20, #0x10]
00b02cdc	bl 0x00c37560
00b02ce0	cbz w0,0x00b02cec
00b02ce4	orr w0,wzr,#0x1f
00b02ce8	b 0x00b02d5c
00b02cec	ldr x20,[x20, #0x8]
00b02cf0	cbz x20,0x00b02d58
00b02cf4	mov x0,x20
00b02cf8	bl 0x00c325e0
00b02cfc	cmp w0,#0x1
00b02d00	b.lt 0x00b02d58
00b02d04	mov w21,wzr
00b02d08	mov x0,x20
00b02d0c	mov w1,w21
00b02d10	bl 0x00c32610
00b02d14	ldr w8,[x0]
00b02d18	cmp w8,#0x4
00b02d1c	b.eq 0x00b02d38
00b02d20	mov x0,x20
00b02d24	add w21,w21,#0x1
00b02d28	bl 0x00c325e0
00b02d2c	cmp w21,w0
00b02d30	b.lt 0x00b02d08
00b02d34	b 0x00b02d58
00b02d38	ldr x20,[x0, #0x8]
00b02d3c	cbz x20,0x00b02d58
00b02d40	mov x0,x19
00b02d44	bl 0x00c32cf0
00b02d48	mov x1,x0
00b02d4c	mov x0,x20
00b02d50	bl 0x00c36560
00b02d54	cbnz w0,0x00b02ce4
00b02d58	mov w0,wzr
00b02d5c	ldp x29,x30,[sp, #0x20]
00b02d60	ldp x20,x19,[sp, #0x10]
00b02d64	ldr x21,[sp], #0x30
00b02d68	ret

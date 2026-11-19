; psa_hash_update @ 00b87db4
00b87db4	str x23,[sp, #-0x40]!
00b87db8	stp x22,x21,[sp, #0x10]
00b87dbc	stp x20,x19,[sp, #0x20]
00b87dc0	stp x29,x30,[sp, #0x30]
00b87dc4	add x29,sp,#0x30
00b87dc8	ldr w23,[x0]
00b87dcc	mov x21,x2
00b87dd0	mov x20,x0
00b87dd4	mov x22,x1
00b87dd8	cbz w23,0x00b87e30
00b87ddc	cbz x21,0x00b87e60
00b87de0	mov w1,#0x1
00b87de4	mov x0,x21
00b87de8	bl 0x00c30a30
00b87dec	mov x19,x0
00b87df0	cbz x0,0x00b87e3c
00b87df4	mov x0,x19
00b87df8	mov x1,x22
00b87dfc	mov x2,x21
00b87e00	bl 0x00c2ffd0
00b87e04	cmp w23,#0x1
00b87e08	b.ne 0x00b87e78
00b87e0c	add x0,x20,#0x8
00b87e10	mov x1,x19
00b87e14	mov x2,x21
00b87e18	bl 0x00c43030
00b87e1c	mov w21,w0
00b87e20	cbz w0,0x00b87e58
00b87e24	ldr w23,[x20]
00b87e28	cbnz w23,0x00b87e44
00b87e2c	b 0x00b87e58
00b87e30	mov x19,xzr
00b87e34	mov w21,#0xffffff77
00b87e38	b 0x00b87e58
00b87e3c	mov w21,#0xffffff73
00b87e40	cbz w23,0x00b87e58
00b87e44	cmp w23,#0x1
00b87e48	b.ne 0x00b87e54
00b87e4c	add x0,x20,#0x8
00b87e50	bl 0x00c42fe0
00b87e54	str wzr,[x20]
00b87e58	mov x0,x19
00b87e5c	bl 0x00c30960
00b87e60	mov w0,w21
00b87e64	ldp x29,x30,[sp, #0x30]
00b87e68	ldp x20,x19,[sp, #0x20]
00b87e6c	ldp x22,x21,[sp, #0x10]
00b87e70	ldr x23,[sp], #0x40
00b87e74	ret
00b87e78	mov w21,#0xffffff77
00b87e7c	cbnz w23,0x00b87e44
00b87e80	b 0x00b87e58

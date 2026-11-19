; psa_pake_setup @ 00b8faec
00b8faec	str x21,[sp, #-0x30]!
00b8faf0	stp x20,x19,[sp, #0x10]
00b8faf4	stp x29,x30,[sp, #0x20]
00b8faf8	add x29,sp,#0x20
00b8fafc	ldrb w8,[x0, #0xc]
00b8fb00	mov x19,x0
00b8fb04	mov x20,x1
00b8fb08	cmp w8,#0x2
00b8fb0c	b.eq 0x00b8fba4
00b8fb10	cbnz w8,0x00b8fbbc
00b8fb14	ldr w8,[x20]
00b8fb18	mov w21,#0xa000000
00b8fb1c	and w8,w8,#0x7f000000
00b8fb20	cmp w8,w21
00b8fb24	b.ne 0x00b8fbf4
00b8fb28	ldr w8,[x20, #0x8]
00b8fb2c	mov w9,#0x2000000
00b8fb30	and w8,w8,#0x7f000000
00b8fb34	cmp w8,w9
00b8fb38	b.ne 0x00b8fbf4
00b8fb3c	add x0,x19,#0x20
00b8fb40	mov w2,#0x58
00b8fb44	mov w1,wzr
00b8fb48	bl 0x00c301c0
00b8fb4c	ldr w8,[x20]
00b8fb50	str w8,[x19, #0x4]
00b8fb54	ldrh w9,[x20, #0x6]
00b8fb58	ldrb w10,[x20, #0x4]
00b8fb5c	ldrb w11,[x20, #0x5]
00b8fb60	bfm w9,w10,#0x8,#0x7
00b8fb64	bfm w9,w11,#0x10,#0x7
00b8fb68	str w9,[x19, #0x8]
00b8fb6c	ldr w9,[x20, #0x8]
00b8fb70	add w10,w21,#0x100
00b8fb74	cmp w8,w10
00b8fb78	str w9,[x19, #0x70]
00b8fb7c	ldr x9,[x20]
00b8fb80	str x9,[x19, #0x68]
00b8fb84	b.ne 0x00b8fc1c
00b8fb88	mov w8,#0x1
00b8fb8c	mov w20,wzr
00b8fb90	str wzr,[x19, #0x18]
00b8fb94	str xzr,[x19, #0x10]
00b8fb98	strb w8,[x19, #0x1a]
00b8fb9c	strb w8,[x19, #0xc]
00b8fba0	b 0x00b8fc08
00b8fba4	ldr w8,[x19]
00b8fba8	cmp w8,#0x1
00b8fbac	b.ne 0x00b8fbec
00b8fbb0	add x0,x19,#0x20
00b8fbb4	bl 0x00c430b0
00b8fbb8	ldrb w8,[x19, #0xc]
00b8fbbc	cmp w8,#0x1
00b8fbc0	b.ne 0x00b8fbec
00b8fbc4	ldr x0,[x19, #0x20]
00b8fbc8	cbz x0,0x00b8fbd4
00b8fbcc	ldr x1,[x19, #0x28]
00b8fbd0	bl 0x00c42230
00b8fbd4	ldr x0,[x19, #0x30]
00b8fbd8	cbz x0,0x00b8fbe0
00b8fbdc	bl 0x00c30960
00b8fbe0	ldr x0,[x19, #0x40]
00b8fbe4	cbz x0,0x00b8fbec
00b8fbe8	bl 0x00c30960
00b8fbec	mov w20,#0xffffff77
00b8fbf0	b 0x00b8fbf8
00b8fbf4	mov w20,#0xffffff79
00b8fbf8	mov w2,#0x390
00b8fbfc	mov x0,x19
00b8fc00	mov w1,wzr
00b8fc04	bl 0x00c301c0
00b8fc08	mov w0,w20
00b8fc0c	ldp x29,x30,[sp, #0x20]
00b8fc10	ldp x20,x19,[sp, #0x10]
00b8fc14	ldr x21,[sp], #0x30
00b8fc18	ret
00b8fc1c	mov w20,#0xffffff7a
00b8fc20	b 0x00b8fbf8

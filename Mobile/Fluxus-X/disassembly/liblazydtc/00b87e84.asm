; psa_hash_finish @ 00b87e84
00b87e84	str x25,[sp, #-0x50]!
00b87e88	stp x24,x23,[sp, #0x10]
00b87e8c	stp x22,x21,[sp, #0x20]
00b87e90	stp x20,x19,[sp, #0x30]
00b87e94	stp x29,x30,[sp, #0x40]
00b87e98	add x29,sp,#0x40
00b87e9c	mov x24,x3
00b87ea0	mov x25,x2
00b87ea4	mov x19,x1
00b87ea8	mov x23,x0
00b87eac	cbz x2,0x00b87ed0
00b87eb0	mov w1,#0x1
00b87eb4	mov x0,x25
00b87eb8	bl 0x00c30a30
00b87ebc	mov x20,x0
00b87ec0	mov x21,x25
00b87ec4	cbnz x0,0x00b87edc
00b87ec8	mov w22,#0xffffff73
00b87ecc	b 0x00b87f54
00b87ed0	mov x21,xzr
00b87ed4	mov x20,xzr
00b87ed8	mov x19,xzr
00b87edc	str xzr,[x24]
00b87ee0	ldr w8,[x23]
00b87ee4	mov w22,#0xffffff77
00b87ee8	cbz w8,0x00b87f28
00b87eec	cmp w8,#0x1
00b87ef0	b.ne 0x00b87f10
00b87ef4	add x0,x23,#0x8
00b87ef8	mov x1,x20
00b87efc	mov x2,x25
00b87f00	mov x3,x24
00b87f04	bl 0x00c43010
00b87f08	ldr w8,[x23]
00b87f0c	mov w22,w0
00b87f10	cbz w8,0x00b87f28
00b87f14	cmp w8,#0x1
00b87f18	b.ne 0x00b87f24
00b87f1c	add x0,x23,#0x8
00b87f20	bl 0x00c42fe0
00b87f24	str wzr,[x23]
00b87f28	cbz x20,0x00b87f54
00b87f2c	cbz x19,0x00b87f50
00b87f30	cbz x21,0x00b87f44
00b87f34	mov x0,x19
00b87f38	mov x1,x20
00b87f3c	mov x2,x21
00b87f40	bl 0x00c2ffd0
00b87f44	mov x0,x20
00b87f48	bl 0x00c30960
00b87f4c	b 0x00b87f54
00b87f50	mov w22,#0xffffff69
00b87f54	mov w0,w22
00b87f58	ldp x29,x30,[sp, #0x40]
00b87f5c	ldp x20,x19,[sp, #0x30]
00b87f60	ldp x22,x21,[sp, #0x20]
00b87f64	ldp x24,x23,[sp, #0x10]
00b87f68	ldr x25,[sp], #0x50
00b87f6c	ret

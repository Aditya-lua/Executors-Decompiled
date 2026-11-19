; OCSP_resp_get1_id @ 00aafe20
00aafe20	stp x20,x19,[sp, #-0x20]!
00aafe24	stp x29,x30,[sp, #0x10]
00aafe28	ldr w9,[x0, #0x8]
00aafe2c	mov x19,x2
00aafe30	mov x20,x1
00aafe34	add x29,sp,#0x10
00aafe38	cmp w9,#0x1
00aafe3c	b.eq 0x00aafe64
00aafe40	mov w8,wzr
00aafe44	cbnz w9,0x00aafe80
00aafe48	ldr x0,[x0, #0x10]
00aafe4c	bl 0x00c34f50
00aafe50	str x0,[x19]
00aafe54	str xzr,[x20]
00aafe58	ldr x8,[x19]
00aafe5c	cbnz x8,0x00aafe7c
00aafe60	b 0x00aafe80
00aafe64	ldr x0,[x0, #0x10]
00aafe68	bl 0x00c37790
00aafe6c	str x0,[x20]
00aafe70	str xzr,[x19]
00aafe74	ldr x8,[x20]
00aafe78	cbz x8,0x00aafe80
00aafe7c	mov w8,#0x1
00aafe80	ldp x29,x30,[sp, #0x10]
00aafe84	mov w0,w8
00aafe88	ldp x20,x19,[sp], #0x20
00aafe8c	ret

; ossl_ffc_params_validate_unverifiable_g @ 00a7eeec
00a7eeec	str x25,[sp, #-0x50]!
00a7eef0	stp x24,x23,[sp, #0x10]
00a7eef4	stp x22,x21,[sp, #0x20]
00a7eef8	stp x20,x19,[sp, #0x30]
00a7eefc	stp x29,x30,[sp, #0x40]
00a7ef00	add x29,sp,#0x40
00a7ef04	mov x19,x6
00a7ef08	mov x20,x5
00a7ef0c	mov x24,x4
00a7ef10	mov x23,x3
00a7ef14	mov x22,x2
00a7ef18	mov x21,x1
00a7ef1c	mov x25,x0
00a7ef20	bl 0x00c38de0
00a7ef24	mov x1,x0
00a7ef28	mov x0,x24
00a7ef2c	bl 0x00c38cc0
00a7ef30	cmp w0,#0x1
00a7ef34	b.lt 0x00a7ef48
00a7ef38	mov x0,x24
00a7ef3c	mov x1,x22
00a7ef40	bl 0x00c38cc0
00a7ef44	tbnz w0,#0x1f,0x00a7ef70
00a7ef48	ldr w8,[x19]
00a7ef4c	mov w0,wzr
00a7ef50	orr w8,w8,#0x8
00a7ef54	str w8,[x19]
00a7ef58	ldp x29,x30,[sp, #0x40]
00a7ef5c	ldp x20,x19,[sp, #0x30]
00a7ef60	ldp x22,x21,[sp, #0x20]
00a7ef64	ldp x24,x23,[sp, #0x10]
00a7ef68	ldr x25,[sp], #0x50
00a7ef6c	ret
00a7ef70	mov x0,x20
00a7ef74	mov x1,x24
00a7ef78	mov x2,x23
00a7ef7c	mov x3,x22
00a7ef80	mov x4,x25
00a7ef84	mov x5,x21
00a7ef88	bl 0x00c38ae0
00a7ef8c	cbz w0,0x00a7ef58
00a7ef90	bl 0x00c38de0
00a7ef94	mov x1,x0
00a7ef98	mov x0,x20
00a7ef9c	bl 0x00c38cc0
00a7efa0	cbnz w0,0x00a7ef48
00a7efa4	mov w0,#0x1
00a7efa8	b 0x00a7ef58

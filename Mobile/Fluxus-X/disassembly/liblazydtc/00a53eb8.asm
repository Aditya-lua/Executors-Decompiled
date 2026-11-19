; ossl_err_load_ERR_strings @ 00a53eb8
00a53eb8	str x21,[sp, #-0x30]!
00a53ebc	adrp x0,0xd21000
00a53ec0	adrp x1,0xa53000
00a53ec4	add x0,x0,#0xa30
00a53ec8	add x1,x1,#0xf8c
00a53ecc	stp x20,x19,[sp, #0x10]
00a53ed0	stp x29,x30,[sp, #0x20]
00a53ed4	add x29,sp,#0x20
00a53ed8	bl 0x00c34d60
00a53edc	mov w8,w0
00a53ee0	mov w0,wzr
00a53ee4	cbz w8,0x00a53f7c
00a53ee8	adrp x8,0xd21000
00a53eec	ldr w8,[x8, #0xa34]
00a53ef0	cbz w8,0x00a53f7c
00a53ef4	adrp x20,0xd21000
00a53ef8	ldr x0,[x20, #0xa20]
00a53efc	bl 0x00c356a0
00a53f00	cbz w0,0x00a53f38
00a53f04	adrp x8,0xcc8000
00a53f08	ldr x8,[x8, #0x990]
00a53f0c	cbz x8,0x00a53f30
00a53f10	adrp x19,0xcc8000
00a53f14	add x19,x19,#0x990
00a53f18	adrp x21,0xd21000
00a53f1c	ldr x0,[x21, #0xa28]
00a53f20	mov x1,x19
00a53f24	bl 0x00c34dc0
00a53f28	ldr x8,[x19, #0x10]!
00a53f2c	cbnz x8,0x00a53f1c
00a53f30	ldr x0,[x20, #0xa20]
00a53f34	bl 0x00c35690
00a53f38	ldr x0,[x20, #0xa20]
00a53f3c	bl 0x00c356a0
00a53f40	cbz w0,0x00a53f78
00a53f44	adrp x8,0xcc8000
00a53f48	ldr x8,[x8, #0xc50]
00a53f4c	cbz x8,0x00a53f70
00a53f50	adrp x19,0xcc8000
00a53f54	add x19,x19,#0xc50
00a53f58	adrp x21,0xd21000
00a53f5c	ldr x0,[x21, #0xa28]
00a53f60	mov x1,x19
00a53f64	bl 0x00c34dc0
00a53f68	ldr x8,[x19, #0x10]!
00a53f6c	cbnz x8,0x00a53f5c
00a53f70	ldr x0,[x20, #0xa20]
00a53f74	bl 0x00c35690
00a53f78	mov w0,#0x1
00a53f7c	ldp x29,x30,[sp, #0x20]
00a53f80	ldp x20,x19,[sp, #0x10]
00a53f84	ldr x21,[sp], #0x30
00a53f88	ret

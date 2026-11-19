; engine_load_openssl_int @ 00a85dc0
00a85dc0	str x19,[sp, #-0x20]!
00a85dc4	stp x29,x30,[sp, #0x10]
00a85dc8	add x29,sp,#0x10
00a85dcc	bl 0x00c3bb60
00a85dd0	cbz x0,0x00a85ee0
00a85dd4	adrp x1,0x2b1000
00a85dd8	add x1,x1,#0x8fd
00a85ddc	mov x19,x0
00a85de0	bl 0x00c3bbd0
00a85de4	cbz w0,0x00a85ed0
00a85de8	adrp x1,0x2bd000
00a85dec	add x1,x1,#0xc23
00a85df0	mov x0,x19
00a85df4	bl 0x00c3bbf0
00a85df8	cbz w0,0x00a85ed0
00a85dfc	adrp x1,0xa85000
00a85e00	add x1,x1,#0xeec
00a85e04	mov x0,x19
00a85e08	bl 0x00c3bb90
00a85e0c	cbz w0,0x00a85ed0
00a85e10	bl 0x00c3e1f0
00a85e14	mov x1,x0
00a85e18	mov x0,x19
00a85e1c	bl 0x00c3bde0
00a85e20	cbz w0,0x00a85ed0
00a85e24	bl 0x00c3a2d0
00a85e28	mov x1,x0
00a85e2c	mov x0,x19
00a85e30	bl 0x00c3bd40
00a85e34	cbz w0,0x00a85ed0
00a85e38	bl 0x00c3ac60
00a85e3c	mov x1,x0
00a85e40	mov x0,x19
00a85e44	bl 0x00c3bd50
00a85e48	cbz w0,0x00a85ed0
00a85e4c	bl 0x00c39fb0
00a85e50	mov x1,x0
00a85e54	mov x0,x19
00a85e58	bl 0x00c3bd20
00a85e5c	cbz w0,0x00a85ed0
00a85e60	bl 0x00c3e1c0
00a85e64	mov x1,x0
00a85e68	mov x0,x19
00a85e6c	bl 0x00c3bdb0
00a85e70	cbz w0,0x00a85ed0
00a85e74	adrp x1,0xa85000
00a85e78	add x1,x1,#0xf38
00a85e7c	mov x0,x19
00a85e80	bl 0x00c3bd10
00a85e84	cbz w0,0x00a85ed0
00a85e88	adrp x1,0xa86000
00a85e8c	add x1,x1,#0x2c
00a85e90	mov x0,x19
00a85e94	bl 0x00c3bd30
00a85e98	cbz w0,0x00a85ed0
00a85e9c	adrp x1,0xa86000
00a85ea0	add x1,x1,#0xe8
00a85ea4	mov x0,x19
00a85ea8	bl 0x00c3bca0
00a85eac	cbz w0,0x00a85ed0
00a85eb0	bl 0x00c35250
00a85eb4	mov x0,x19
00a85eb8	bl 0x00c3bc70
00a85ebc	mov x0,x19
00a85ec0	bl 0x00c32370
00a85ec4	ldp x29,x30,[sp, #0x10]
00a85ec8	ldr x19,[sp], #0x20
00a85ecc	b 0x00c35240
00a85ed0	ldp x29,x30,[sp, #0x10]
00a85ed4	mov x0,x19
00a85ed8	ldr x19,[sp], #0x20
00a85edc	b 0x00c32370
00a85ee0	ldp x29,x30,[sp, #0x10]
00a85ee4	ldr x19,[sp], #0x20
00a85ee8	ret

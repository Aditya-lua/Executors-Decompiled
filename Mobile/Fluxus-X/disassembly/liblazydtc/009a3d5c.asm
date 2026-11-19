; ix::SocketOpenSSL::openSSLCreateContext @ 009a3d5c
009a3d5c	stp x20,x19,[sp, #-0x20]!
009a3d60	stp x29,x30,[sp, #0x10]
009a3d64	add x29,sp,#0x10
009a3d68	mov x19,x1
009a3d6c	mov x20,x0
009a3d70	bl 0x00c32a30
009a3d74	cbz x0,0x009a3dac
009a3d78	str x0,[x20, #0x50]
009a3d7c	bl 0x00c32730
009a3d80	mov x19,x0
009a3d84	cbz x0,0x009a3dc4
009a3d88	mov w1,#0x21
009a3d8c	orr w2,wzr,#0x3
009a3d90	mov x0,x19
009a3d94	mov x3,xzr
009a3d98	bl 0x00c32710
009a3d9c	mov w1,#0x22400000
009a3da0	mov x0,x19
009a3da4	bl 0x00c327d0
009a3da8	b 0x009a3dc4
009a3dac	adrp x1,0x2af000
009a3db0	add x1,x1,#0x7d2
009a3db4	orr w2,wzr,#0x1c
009a3db8	mov x0,x19
009a3dbc	bl 0x00c31090
009a3dc0	mov x19,xzr
009a3dc4	ldp x29,x30,[sp, #0x10]
009a3dc8	mov x0,x19
009a3dcc	ldp x20,x19,[sp], #0x20
009a3dd0	ret

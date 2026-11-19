; X509_REQ_get1_email @ 00b069cc
00b069cc	str x21,[sp, #-0x30]!
00b069d0	stp x20,x19,[sp, #0x10]
00b069d4	stp x29,x30,[sp, #0x20]
00b069d8	add x29,sp,#0x20
00b069dc	mov x19,x0
00b069e0	bl 0x00c40b30
00b069e4	mov w1,#0x55
00b069e8	mov x2,xzr
00b069ec	mov x3,xzr
00b069f0	mov x20,x0
00b069f4	bl 0x00c3efb0
00b069f8	mov x21,x0
00b069fc	mov x0,x19
00b06a00	bl 0x00c40af0
00b06a04	mov x1,x21
00b06a08	bl 0x00b06724
00b06a0c	adrp x1,0xcb5000
00b06a10	ldr x1,[x1, #0x6b8]
00b06a14	mov x19,x0
00b06a18	mov x0,x21
00b06a1c	bl 0x00c32600
00b06a20	adrp x1,0xcb5000
00b06a24	ldr x1,[x1, #0x1a0]
00b06a28	mov x0,x20
00b06a2c	bl 0x00c32600
00b06a30	mov x0,x19
00b06a34	ldp x29,x30,[sp, #0x20]
00b06a38	ldp x20,x19,[sp, #0x10]
00b06a3c	ldr x21,[sp], #0x30
00b06a40	ret

; ossl_ecdsa_sign @ 00a35c90
00a35c90	str x21,[sp, #-0x30]!
00a35c94	stp x20,x19,[sp, #0x10]
00a35c98	mov x19,x4
00a35c9c	mov x20,x3
00a35ca0	stp x29,x30,[sp, #0x20]
00a35ca4	add x29,sp,#0x20
00a35ca8	str x3,[sp, #0x8]
00a35cac	cbnz x3,0x00a35cb8
00a35cb0	cbz x5,0x00a35d00
00a35cb4	cbz x6,0x00a35d00
00a35cb8	mov x0,x1
00a35cbc	mov w1,w2
00a35cc0	mov x2,x5
00a35cc4	mov x3,x6
00a35cc8	mov x4,x7
00a35ccc	bl 0x00c3b180
00a35cd0	cbz x0,0x00a35cf8
00a35cd4	cmp x20,#0x0
00a35cd8	add x8,sp,#0x8
00a35cdc	csel x1,xzr,x8,eq
00a35ce0	mov x21,x0
00a35ce4	bl 0x00c3abc0
00a35ce8	str w0,[x19]
00a35cec	mov x0,x21
00a35cf0	bl 0x00c3a9e0
00a35cf4	b 0x00a35d0c
00a35cf8	str wzr,[x19]
00a35cfc	b 0x00a35d10
00a35d00	mov x0,x7
00a35d04	bl 0x00c3a720
00a35d08	str w0,[x19]
00a35d0c	mov w0,#0x1
00a35d10	ldp x29,x30,[sp, #0x20]
00a35d14	ldp x20,x19,[sp, #0x10]
00a35d18	ldr x21,[sp], #0x30
00a35d1c	ret

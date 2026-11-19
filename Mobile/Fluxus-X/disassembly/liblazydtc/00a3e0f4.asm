; ossl_ecx_key_from_pkcs8 @ 00a3e0f4
00a3e0f4	sub sp,sp,#0x40
00a3e0f8	stp x20,x19,[sp, #0x20]
00a3e0fc	mov x19,x2
00a3e100	mov x20,x1
00a3e104	mov x4,x0
00a3e108	add x1,sp,#0x18
00a3e10c	add x2,sp,#0xc
00a3e110	mov x3,sp
00a3e114	mov x0,xzr
00a3e118	str x21,[sp, #0x10]
00a3e11c	stp x29,x30,[sp, #0x30]
00a3e120	add x29,sp,#0x30
00a3e124	bl 0x00c37eb0
00a3e128	cbz w0,0x00a3e164
00a3e12c	ldrsw x2,[sp, #0xc]
00a3e130	add x1,sp,#0x18
00a3e134	mov x0,xzr
00a3e138	bl 0x00c37c80
00a3e13c	mov x21,x0
00a3e140	cbz x0,0x00a3e16c
00a3e144	mov x0,x21
00a3e148	bl 0x00c32130
00a3e14c	str x0,[sp, #0x18]
00a3e150	mov x0,x21
00a3e154	bl 0x00c32140
00a3e158	ldr x1,[sp, #0x18]
00a3e15c	mov w2,w0
00a3e160	b 0x00a3e178
00a3e164	mov x19,xzr
00a3e168	b 0x00a3e1a0
00a3e16c	mov x1,xzr
00a3e170	mov w2,wzr
00a3e174	str xzr,[sp, #0x18]
00a3e178	ldr x0,[sp]
00a3e17c	mov w4,#0x1
00a3e180	mov w3,wzr
00a3e184	mov x5,x20
00a3e188	mov x6,x19
00a3e18c	str w2,[sp, #0xc]
00a3e190	bl 0x00a3ddfc
00a3e194	mov x19,x0
00a3e198	mov x0,x21
00a3e19c	bl 0x00c35530
00a3e1a0	mov x0,x19
00a3e1a4	ldp x29,x30,[sp, #0x30]
00a3e1a8	ldp x20,x19,[sp, #0x20]
00a3e1ac	ldr x21,[sp, #0x10]
00a3e1b0	add sp,sp,#0x40
00a3e1b4	ret

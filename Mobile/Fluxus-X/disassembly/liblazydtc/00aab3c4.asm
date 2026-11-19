; CRYPTO_gcm128_tag @ 00aab3c4
00aab3c4	str x21,[sp, #-0x30]!
00aab3c8	stp x20,x19,[sp, #0x10]
00aab3cc	mov x19,x2
00aab3d0	mov x20,x1
00aab3d4	mov x1,xzr
00aab3d8	mov x2,xzr
00aab3dc	stp x29,x30,[sp, #0x20]
00aab3e0	add x29,sp,#0x20
00aab3e4	mov x21,x0
00aab3e8	bl 0x00aab240
00aab3ec	cmp x19,#0x10
00aab3f0	mov w8,#0x10
00aab3f4	csel x2,x19,x8,cc
00aab3f8	mov x0,x20
00aab3fc	ldp x29,x30,[sp, #0x20]
00aab400	ldp x20,x19,[sp, #0x10]
00aab404	add x1,x21,#0x40
00aab408	ldr x21,[sp], #0x30
00aab40c	b 0x00c2ffd0

; PKCS8_decrypt @ 00abc3c4
00abc3c4	sub sp,sp,#0x40
00abc3c8	stp x20,x19,[sp, #0x20]
00abc3cc	mov w19,w2
00abc3d0	mov x20,x1
00abc3d4	add x1,sp,#0x18
00abc3d8	add x2,sp,#0x8
00abc3dc	str x21,[sp, #0x10]
00abc3e0	stp x29,x30,[sp, #0x30]
00abc3e4	add x29,sp,#0x30
00abc3e8	bl 0x00c38300
00abc3ec	ldr x21,[sp, #0x18]
00abc3f0	bl 0x00c37e80
00abc3f4	ldr x4,[sp, #0x8]
00abc3f8	mov x1,x0
00abc3fc	mov w5,#0x1
00abc400	mov x0,x21
00abc404	mov x2,x20
00abc408	mov w3,w19
00abc40c	mov x6,xzr
00abc410	mov x7,xzr
00abc414	bl 0x00c3f480
00abc418	ldp x29,x30,[sp, #0x30]
00abc41c	ldp x20,x19,[sp, #0x20]
00abc420	ldr x21,[sp, #0x10]
00abc424	add sp,sp,#0x40
00abc428	ret

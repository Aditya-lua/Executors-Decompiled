; OSSL_STORE_LOADER_fetch @ 00aeb0e0
00aeb0e0	sub sp,sp,#0x50
00aeb0e4	mov x3,x2
00aeb0e8	mov x2,x1
00aeb0ec	str x0,[sp]
00aeb0f0	mov x0,sp
00aeb0f4	mov w1,wzr
00aeb0f8	str x19,[sp, #0x30]
00aeb0fc	stp x29,x30,[sp, #0x40]
00aeb100	add x29,sp,#0x40
00aeb104	str xzr,[sp, #0x20]
00aeb108	bl 0x00aeb134
00aeb10c	ldr x8,[sp, #0x20]
00aeb110	mov x19,x0
00aeb114	cbz x8,0x00aeb120
00aeb118	mov x0,x8
00aeb11c	bl 0x00c3b5c0
00aeb120	mov x0,x19
00aeb124	ldp x29,x30,[sp, #0x40]
00aeb128	ldr x19,[sp, #0x30]
00aeb12c	add sp,sp,#0x50
00aeb130	ret

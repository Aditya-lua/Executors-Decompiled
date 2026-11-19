; FUN_00bd9c3c @ 00bd9c3c
00bd9c3c	paciasp
00bd9c40	sub sp,sp,#0x40
00bd9c44	stp x29,x30,[sp, #0x10]
00bd9c48	stp x22,x21,[sp, #0x20]
00bd9c4c	stp x20,x19,[sp, #0x30]
00bd9c50	add x29,sp,#0x10
00bd9c54	adrp x8,0xcb5000
00bd9c58	mov x20,x2
00bd9c5c	mov x21,x1
00bd9c60	ldr x8,[x8, #0xb88]
00bd9c64	mov x19,x0
00bd9c68	add x22,x8,#0x10
00bd9c6c	str x22,[x0], #0x8
00bd9c70	bl 0x00c30480
00bd9c74	movi v0.2D,#0x0
00bd9c78	adrp x8,0xcad000
00bd9c7c	add x8,x8,#0x498
00bd9c80	add x0,sp,#0x8
00bd9c84	add x1,x19,#0x8
00bd9c88	str x8,[x19]
00bd9c8c	str x21,[x19, #0x40]
00bd9c90	stp q0,q0,[x19, #0x20]
00bd9c94	str q0,[x19, #0x10]
00bd9c98	bl 0x00c30660
00bd9c9c	adrp x1,0xcb5000
00bd9ca0	add x0,sp,#0x8
00bd9ca4	ldr x1,[x1, #0xbf0]
00bd9ca8	bl 0x00c30080
00bd9cac	mov x21,x0
00bd9cb0	add x0,sp,#0x8
00bd9cb4	bl 0x00c30090
00bd9cb8	ldr x8,[x21]
00bd9cbc	stp x21,x20,[x19, #0x48]
00bd9cc0	mov x0,x21
00bd9cc4	ldr x8,[x8, #0x38]
00bd9cc8	blr x8
00bd9ccc	and w8,w0,#0x1
00bd9cd0	strb w8,[x19, #0x58]
00bd9cd4	ldp x20,x19,[sp, #0x30]
00bd9cd8	ldp x22,x21,[sp, #0x20]
00bd9cdc	ldp x29,x30,[sp, #0x10]
00bd9ce0	add sp,sp,#0x40
00bd9ce4	autiasp
00bd9ce8	ret

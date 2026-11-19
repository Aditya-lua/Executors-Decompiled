; SCT_free @ 00a13c18
00a13c18	cbz x0,0x00a13c8c
00a13c1c	stp x20,x19,[sp, #-0x20]!
00a13c20	stp x29,x30,[sp, #0x10]
00a13c24	mov x19,x0
00a13c28	ldr x0,[x0, #0x18]
00a13c2c	adrp x20,0x2a7000
00a13c30	add x20,x20,#0xdc3
00a13c34	mov w2,#0x29
00a13c38	mov x1,x20
00a13c3c	add x29,sp,#0x10
00a13c40	bl 0x00c32310
00a13c44	ldr x0,[x19, #0x30]
00a13c48	mov w2,#0x2a
00a13c4c	mov x1,x20
00a13c50	bl 0x00c32310
00a13c54	ldr x0,[x19, #0x48]
00a13c58	mov w2,#0x2b
00a13c5c	mov x1,x20
00a13c60	bl 0x00c32310
00a13c64	ldr x0,[x19, #0x8]
00a13c68	mov w2,#0x2c
00a13c6c	mov x1,x20
00a13c70	bl 0x00c32310
00a13c74	ldp x29,x30,[sp, #0x10]
00a13c78	mov w2,#0x2d
00a13c7c	mov x0,x19
00a13c80	mov x1,x20
00a13c84	ldp x20,x19,[sp], #0x20
00a13c88	b 0x00c32310
00a13c8c	ret

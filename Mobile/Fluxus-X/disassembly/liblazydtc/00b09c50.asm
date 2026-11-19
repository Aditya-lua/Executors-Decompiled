; X509_STORE_set_default_paths_ex @ 00b09c50
00b09c50	str x21,[sp, #-0x30]!
00b09c54	stp x20,x19,[sp, #0x10]
00b09c58	stp x29,x30,[sp, #0x20]
00b09c5c	add x29,sp,#0x20
00b09c60	mov x19,x2
00b09c64	mov x20,x1
00b09c68	mov x21,x0
00b09c6c	bl 0x00c32b90
00b09c70	mov x1,x0
00b09c74	mov x0,x21
00b09c78	bl 0x00c32c00
00b09c7c	cbz x0,0x00b09cfc
00b09c80	mov w1,#0x1
00b09c84	orr w3,wzr,#0x3
00b09c88	mov x2,xzr
00b09c8c	mov x4,xzr
00b09c90	mov x5,x20
00b09c94	mov x6,x19
00b09c98	bl 0x00c35b20
00b09c9c	bl 0x00c35b30
00b09ca0	mov x1,x0
00b09ca4	mov x0,x21
00b09ca8	bl 0x00c32c00
00b09cac	cbz x0,0x00b09cfc
00b09cb0	mov w1,#0x2
00b09cb4	orr w3,wzr,#0x3
00b09cb8	mov x2,xzr
00b09cbc	mov x4,xzr
00b09cc0	bl 0x00c35b10
00b09cc4	bl 0x00c35b40
00b09cc8	mov x1,x0
00b09ccc	mov x0,x21
00b09cd0	bl 0x00c32c00
00b09cd4	cbz x0,0x00b09cfc
00b09cd8	orr w1,wzr,#0x3
00b09cdc	mov x2,xzr
00b09ce0	mov x3,xzr
00b09ce4	mov x4,xzr
00b09ce8	mov x5,x20
00b09cec	mov x6,x19
00b09cf0	bl 0x00c35b20
00b09cf4	bl 0x00c323e0
00b09cf8	mov w0,#0x1
00b09cfc	ldp x29,x30,[sp, #0x20]
00b09d00	ldp x20,x19,[sp, #0x10]
00b09d04	ldr x21,[sp], #0x30
00b09d08	ret

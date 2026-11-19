; FUN_00b47c38 @ 00b47c38
00b47c38	stp x20,x19,[sp, #-0x20]!
00b47c3c	stp x29,x30,[sp, #0x10]
00b47c40	mov x19,x0
00b47c44	ldr x0,[x0, #0x20]
00b47c48	adrp x20,0x2b6000
00b47c4c	add x20,x20,#0x95f
00b47c50	mov w2,#0x5a
00b47c54	mov x1,x20
00b47c58	add x29,sp,#0x10
00b47c5c	bl 0x00c32310
00b47c60	ldp x0,x1,[x19, #0x10]
00b47c64	mov w3,#0x5b
00b47c68	mov x2,x20
00b47c6c	bl 0x00c345e0
00b47c70	adrp x8,0x29c000
00b47c74	adrp x9,0x29c000
00b47c78	ldr q0,[x8, #0x3a0]
00b47c7c	ldr q1,[x9, #0xfe0]
00b47c80	stp q0,q1,[x19, #0x30]
00b47c84	ldp x29,x30,[sp, #0x10]
00b47c88	ldp x20,x19,[sp], #0x20
00b47c8c	ret

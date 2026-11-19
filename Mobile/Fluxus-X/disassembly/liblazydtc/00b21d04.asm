; FUN_00b21d04 @ 00b21d04
00b21d04	stp x24,x23,[sp, #-0x40]!
00b21d08	add x24,x0,#0x10
00b21d0c	mov x23,x0
00b21d10	mov x0,x24
00b21d14	stp x22,x21,[sp, #0x10]
00b21d18	stp x20,x19,[sp, #0x20]
00b21d1c	stp x29,x30,[sp, #0x30]
00b21d20	add x29,sp,#0x30
00b21d24	mov x20,x5
00b21d28	mov x21,x4
00b21d2c	mov x19,x2
00b21d30	mov x22,x1
00b21d34	bl 0x00c41160
00b21d38	mov x1,x0
00b21d3c	cbnz x0,0x00b21d60
00b21d40	ldr x1,[x23]
00b21d44	adrp x2,0x2ac000
00b21d48	add x2,x2,#0x629
00b21d4c	mov x0,x24
00b21d50	mov x3,xzr
00b21d54	bl 0x00c41140
00b21d58	mov x1,x0
00b21d5c	cbz x0,0x00b21da4
00b21d60	cbz x22,0x00b21d8c
00b21d64	ldr x0,[x23, #0x8]
00b21d68	mov x2,x21
00b21d6c	mov x3,x20
00b21d70	mov x4,x22
00b21d74	mov x5,x19
00b21d78	ldp x29,x30,[sp, #0x30]
00b21d7c	ldp x20,x19,[sp, #0x20]
00b21d80	ldp x22,x21,[sp, #0x10]
00b21d84	ldp x24,x23,[sp], #0x40
00b21d88	b 0x00c40160
00b21d8c	mov x0,x21
00b21d90	mov x1,x20
00b21d94	mov x2,x19
00b21d98	bl 0x00c40180
00b21d9c	cmp w0,#0x0
00b21da0	cset w0,ne
00b21da4	ldp x29,x30,[sp, #0x30]
00b21da8	ldp x20,x19,[sp, #0x20]
00b21dac	ldp x22,x21,[sp, #0x10]
00b21db0	ldp x24,x23,[sp], #0x40
00b21db4	ret

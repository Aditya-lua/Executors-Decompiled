; FUN_00b5b9a0 @ 00b5b9a0
00b5b9a0	stp x20,x19,[sp, #-0x20]!
00b5b9a4	mov x20,x1
00b5b9a8	adrp x1,0x2ae000
00b5b9ac	mov x19,x0
00b5b9b0	add x1,x1,#0x5d4
00b5b9b4	mov x0,x20
00b5b9b8	stp x29,x30,[sp, #0x10]
00b5b9bc	add x29,sp,#0x10
00b5b9c0	bl 0x00c3e8c0
00b5b9c4	cbz x0,0x00b5b9d4
00b5b9c8	ldr w1,[x19, #0x8]
00b5b9cc	bl 0x00c3da90
00b5b9d0	cbz w0,0x00b5ba18
00b5b9d4	adrp x1,0x29e000
00b5b9d8	add x1,x1,#0x95d
00b5b9dc	mov x0,x20
00b5b9e0	bl 0x00c3e8c0
00b5b9e4	cbz x0,0x00b5b9f4
00b5b9e8	ldr w1,[x19, #0xc]
00b5b9ec	bl 0x00c3da90
00b5b9f0	cbz w0,0x00b5ba18
00b5b9f4	adrp x1,0x2bc000
00b5b9f8	add x1,x1,#0x3b2
00b5b9fc	mov x0,x20
00b5ba00	bl 0x00c3e8c0
00b5ba04	cbz x0,0x00b5ba14
00b5ba08	ldr x1,[x19, #0x10]
00b5ba0c	bl 0x00c3e950
00b5ba10	cbz w0,0x00b5ba18
00b5ba14	mov w0,#0x1
00b5ba18	ldp x29,x30,[sp, #0x10]
00b5ba1c	ldp x20,x19,[sp], #0x20
00b5ba20	ret

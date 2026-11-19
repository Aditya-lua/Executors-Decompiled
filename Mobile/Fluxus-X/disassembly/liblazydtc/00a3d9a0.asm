; FUN_00a3d9a0 @ 00a3d9a0
00a3d9a0	stp x22,x21,[sp, #-0x30]!
00a3d9a4	stp x20,x19,[sp, #0x10]
00a3d9a8	stp x29,x30,[sp, #0x20]
00a3d9ac	add x29,sp,#0x20
00a3d9b0	mov x19,x4
00a3d9b4	mov x21,x3
00a3d9b8	mov x22,x2
00a3d9bc	mov x20,x1
00a3d9c0	bl 0x00c36dc0
00a3d9c4	ldr x0,[x0, #0x88]
00a3d9c8	bl 0x00c3b2e0
00a3d9cc	cbz x0,0x00a3da08
00a3d9d0	cmp x22,#0x72
00a3d9d4	b.ne 0x00a3da34
00a3d9d8	ldp x8,x7,[x0]
00a3d9dc	mov x2,x19
00a3d9e0	mov x3,x20
00a3d9e4	ldp x29,x30,[sp, #0x20]
00a3d9e8	ldp x20,x19,[sp, #0x10]
00a3d9ec	add x4,x0,#0x11
00a3d9f0	mov x0,x8
00a3d9f4	mov x1,x21
00a3d9f8	mov x5,xzr
00a3d9fc	mov x6,xzr
00a3da00	ldp x22,x21,[sp], #0x30
00a3da04	b 0x00c3a580
00a3da08	bl 0x00c342a0
00a3da0c	adrp x0,0x2aa000
00a3da10	adrp x2,0x2c9000
00a3da14	add x0,x0,#0x129
00a3da18	add x2,x2,#0x7bf
00a3da1c	mov w1,#0x374
00a3da20	bl 0x00c342b0
00a3da24	mov w0,#0x10
00a3da28	mov w1,#0x74
00a3da2c	mov x2,xzr
00a3da30	bl 0x00c342c0
00a3da34	ldp x29,x30,[sp, #0x20]
00a3da38	ldp x20,x19,[sp, #0x10]
00a3da3c	mov w0,wzr
00a3da40	ldp x22,x21,[sp], #0x30
00a3da44	ret

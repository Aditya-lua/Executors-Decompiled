; _CONF_add_string @ 00a0f954
00a0f954	str x21,[sp, #-0x30]!
00a0f958	stp x20,x19,[sp, #0x10]
00a0f95c	stp x29,x30,[sp, #0x20]
00a0f960	ldr x20,[x1, #0x10]
00a0f964	ldr x8,[x1]
00a0f968	mov x21,x0
00a0f96c	mov x1,x2
00a0f970	mov x0,x20
00a0f974	add x29,sp,#0x20
00a0f978	mov x19,x2
00a0f97c	str x8,[x2]
00a0f980	bl 0x00c347a0
00a0f984	cbz w0,0x00a0f9e4
00a0f988	ldr x0,[x21, #0x10]
00a0f98c	mov x1,x19
00a0f990	bl 0x00c34dc0
00a0f994	cbz x0,0x00a0f9e0
00a0f998	mov x19,x0
00a0f99c	mov x0,x20
00a0f9a0	mov x1,x19
00a0f9a4	bl 0x00c39610
00a0f9a8	ldr x0,[x19, #0x8]
00a0f9ac	adrp x20,0x2c1000
00a0f9b0	add x20,x20,#0xa51
00a0f9b4	mov w2,#0x3b
00a0f9b8	mov x1,x20
00a0f9bc	bl 0x00c32310
00a0f9c0	ldr x0,[x19, #0x10]
00a0f9c4	orr w2,wzr,#0x3c
00a0f9c8	mov x1,x20
00a0f9cc	bl 0x00c32310
00a0f9d0	mov w2,#0x3d
00a0f9d4	mov x0,x19
00a0f9d8	mov x1,x20
00a0f9dc	bl 0x00c32310
00a0f9e0	mov w0,#0x1
00a0f9e4	ldp x29,x30,[sp, #0x20]
00a0f9e8	ldp x20,x19,[sp, #0x10]
00a0f9ec	ldr x21,[sp], #0x30
00a0f9f0	ret

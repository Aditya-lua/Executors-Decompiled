; _CONF_get_number @ 00a0d9ec
00a0d9ec	str x21,[sp, #-0x30]!
00a0d9f0	stp x20,x19,[sp, #0x10]
00a0d9f4	stp x29,x30,[sp, #0x20]
00a0d9f8	add x29,sp,#0x20
00a0d9fc	mov x19,x2
00a0da00	mov x20,x1
00a0da04	mov x21,x0
00a0da08	str xzr,[sp, #0x8]
00a0da0c	bl 0x00c35250
00a0da10	add x3,sp,#0x8
00a0da14	mov x0,x21
00a0da18	mov x1,x20
00a0da1c	mov x2,x19
00a0da20	bl 0x00a0d414
00a0da24	mov w19,w0
00a0da28	bl 0x00c35240
00a0da2c	ldr x8,[sp, #0x8]
00a0da30	cmp w19,#0x0
00a0da34	ldp x29,x30,[sp, #0x20]
00a0da38	ldp x20,x19,[sp, #0x10]
00a0da3c	csel x0,xzr,x8,eq
00a0da40	ldr x21,[sp], #0x30
00a0da44	ret

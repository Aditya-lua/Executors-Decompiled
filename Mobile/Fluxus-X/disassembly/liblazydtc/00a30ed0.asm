; EC_GROUP_set_seed @ 00a30ed0
00a30ed0	stp x22,x21,[sp, #-0x30]!
00a30ed4	stp x20,x19,[sp, #0x10]
00a30ed8	stp x29,x30,[sp, #0x20]
00a30edc	mov x22,x0
00a30ee0	mov x20,x0
00a30ee4	ldr x0,[x22, #0x30]!
00a30ee8	mov x21,x1
00a30eec	adrp x1,0x29e000
00a30ef0	mov x19,x2
00a30ef4	add x1,x1,#0xa7
00a30ef8	mov w2,#0x210
00a30efc	add x29,sp,#0x20
00a30f00	bl 0x00c32310
00a30f04	mov w0,#0x1
00a30f08	stp xzr,xzr,[x22]
00a30f0c	cbz x21,0x00a30f7c
00a30f10	cbz x19,0x00a30f7c
00a30f14	adrp x1,0x29e000
00a30f18	add x1,x1,#0xa7
00a30f1c	mov w2,#0x217
00a30f20	mov x0,x19
00a30f24	bl 0x00c32320
00a30f28	str x0,[x22]
00a30f2c	cbz x0,0x00a30f48
00a30f30	mov x1,x21
00a30f34	mov x2,x19
00a30f38	bl 0x00c2ffd0
00a30f3c	mov x0,x19
00a30f40	str x19,[x20, #0x38]
00a30f44	b 0x00a30f7c
00a30f48	bl 0x00c342a0
00a30f4c	adrp x0,0x29e000
00a30f50	adrp x2,0x2a5000
00a30f54	add x0,x0,#0xa7
00a30f58	add x2,x2,#0xe5c
00a30f5c	mov w1,#0x218
00a30f60	bl 0x00c342b0
00a30f64	mov w1,#0x100
00a30f68	mov w0,#0x10
00a30f6c	movk w1,#0xc, LSL #16
00a30f70	mov x2,xzr
00a30f74	bl 0x00c342c0
00a30f78	mov x0,xzr
00a30f7c	ldp x29,x30,[sp, #0x20]
00a30f80	ldp x20,x19,[sp, #0x10]
00a30f84	ldp x22,x21,[sp], #0x30
00a30f88	ret

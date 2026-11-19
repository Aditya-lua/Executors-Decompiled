; FUN_00b34ee4 @ 00b34ee4
00b34ee4	str x21,[sp, #-0x30]!
00b34ee8	stp x20,x19,[sp, #0x10]
00b34eec	stp x29,x30,[sp, #0x20]
00b34ef0	add x29,sp,#0x20
00b34ef4	cbz x0,0x00b34f4c
00b34ef8	mov w21,w1
00b34efc	mov x19,x0
00b34f00	cmp w1,#0x6
00b34f04	b.eq 0x00b34f10
00b34f08	cmp w21,#0x74
00b34f0c	b.ne 0x00b34f74
00b34f10	bl 0x00c36450
00b34f14	mov x20,x0
00b34f18	cbz x0,0x00b34f54
00b34f1c	cmp w21,#0x74
00b34f20	b.eq 0x00b34fb0
00b34f24	cmp w21,#0x6
00b34f28	b.ne 0x00b34f54
00b34f2c	mov x0,x20
00b34f30	mov x1,x19
00b34f34	bl 0x00c3d8f0
00b34f38	cbnz w0,0x00b34f64
00b34f3c	mov x0,x20
00b34f40	bl 0x00c32450
00b34f44	mov x20,xzr
00b34f48	b 0x00b34f64
00b34f4c	mov x20,xzr
00b34f50	b 0x00b35008
00b34f54	cmp w21,#0x74
00b34f58	b.eq 0x00b34fcc
00b34f5c	cmp w21,#0x6
00b34f60	b.ne 0x00b34f6c
00b34f64	mov x0,x19
00b34f68	bl 0x00c326d0
00b34f6c	cbnz x20,0x00b35008
00b34f70	b 0x00b34fd8
00b34f74	bl 0x00c342a0
00b34f78	adrp x0,0x29e000
00b34f7c	adrp x2,0x2ac000
00b34f80	add x0,x0,#0xe1c
00b34f84	add x2,x2,#0xa68
00b34f88	mov w1,#0x52
00b34f8c	bl 0x00c342b0
00b34f90	mov w8,#0x100
00b34f94	movk w8,#0xc, LSL #16
00b34f98	add w1,w8,#0x3
00b34f9c	mov w0,#0x9
00b34fa0	mov x2,xzr
00b34fa4	bl 0x00c342c0
00b34fa8	mov x20,xzr
00b34fac	b 0x00b35008
00b34fb0	mov x0,x20
00b34fb4	mov x1,x19
00b34fb8	bl 0x00c3d970
00b34fbc	cbnz w0,0x00b34fcc
00b34fc0	mov x0,x20
00b34fc4	bl 0x00c32450
00b34fc8	mov x20,xzr
00b34fcc	mov x0,x19
00b34fd0	bl 0x00c3a0a0
00b34fd4	cbnz x20,0x00b35008
00b34fd8	bl 0x00c342a0
00b34fdc	adrp x0,0x29e000
00b34fe0	adrp x2,0x2ac000
00b34fe4	add x0,x0,#0xe1c
00b34fe8	add x2,x2,#0xa68
00b34fec	mov w1,#0x75
00b34ff0	bl 0x00c342b0
00b34ff4	mov w1,#0x100
00b34ff8	mov w0,#0x9
00b34ffc	movk w1,#0xc, LSL #16
00b35000	mov x2,xzr
00b35004	bl 0x00c342c0
00b35008	mov x0,x20
00b3500c	ldp x29,x30,[sp, #0x20]
00b35010	ldp x20,x19,[sp, #0x10]
00b35014	ldr x21,[sp], #0x30
00b35018	ret

; i2d_DSA_SIG @ 00a21f44
00a21f44	sub sp,sp,#0x70
00a21f48	str x21,[sp, #0x40]
00a21f4c	stp x20,x19,[sp, #0x50]
00a21f50	mov x19,x1
00a21f54	mov x21,x0
00a21f58	stp x29,x30,[sp, #0x60]
00a21f5c	add x29,sp,#0x60
00a21f60	cbz x1,0x00a21f88
00a21f64	ldr x1,[x19]
00a21f68	cbz x1,0x00a21fa0
00a21f6c	add x0,sp,#0x8
00a21f70	mov x2,#-0x1
00a21f74	mov x3,xzr
00a21f78	bl 0x00c34380
00a21f7c	mov x20,xzr
00a21f80	cbnz w0,0x00a21fc0
00a21f84	b 0x00a21f98
00a21f88	add x0,sp,#0x8
00a21f8c	bl 0x00c3a3b0
00a21f90	mov x20,xzr
00a21f94	cbnz w0,0x00a21fc0
00a21f98	mov w0,#0xffffffff
00a21f9c	b 0x00a22048
00a21fa0	bl 0x00c37020
00a21fa4	mov x20,x0
00a21fa8	cbz x0,0x00a22020
00a21fac	add x0,sp,#0x8
00a21fb0	mov x1,x20
00a21fb4	mov x2,xzr
00a21fb8	bl 0x00c3a3a0
00a21fbc	cbz w0,0x00a22020
00a21fc0	ldp x1,x2,[x21]
00a21fc4	add x0,sp,#0x8
00a21fc8	bl 0x00c3a3e0
00a21fcc	cbz w0,0x00a22008
00a21fd0	add x0,sp,#0x8
00a21fd4	sub x1,x29,#0x18
00a21fd8	bl 0x00c34370
00a21fdc	cbz w0,0x00a22008
00a21fe0	add x0,sp,#0x8
00a21fe4	bl 0x00c34360
00a21fe8	cbz w0,0x00a22008
00a21fec	cbz x19,0x00a22044
00a21ff0	ldr x8,[x19]
00a21ff4	cbz x8,0x00a22030
00a21ff8	ldur x9,[x29, #-0x18]
00a21ffc	add x8,x8,x9
00a22000	str x8,[x19]
00a22004	b 0x00a22044
00a22008	mov x0,x20
00a2200c	bl 0x00c35660
00a22010	add x0,sp,#0x8
00a22014	bl 0x00c34340
00a22018	mov w0,#0xffffffff
00a2201c	b 0x00a22048
00a22020	mov x0,x20
00a22024	bl 0x00c35660
00a22028	mov w0,#0xffffffff
00a2202c	b 0x00a22048
00a22030	ldr x8,[x20, #0x8]
00a22034	mov x0,x20
00a22038	str x8,[x19]
00a2203c	str xzr,[x20, #0x8]
00a22040	bl 0x00c35660
00a22044	ldur w0,[x29, #-0x18]
00a22048	ldp x29,x30,[sp, #0x60]
00a2204c	ldp x20,x19,[sp, #0x50]
00a22050	ldr x21,[sp, #0x40]
00a22054	add sp,sp,#0x70
00a22058	ret

; FUN_00b5e2f0 @ 00b5e2f0
00b5e2f0	stp x22,x21,[sp, #-0x30]!
00b5e2f4	stp x20,x19,[sp, #0x10]
00b5e2f8	stp x29,x30,[sp, #0x20]
00b5e2fc	add x29,sp,#0x20
00b5e300	mov x21,x2
00b5e304	mov x20,x1
00b5e308	mov x22,x0
00b5e30c	bl 0x00c41000
00b5e310	cbz w0,0x00b5e3f4
00b5e314	adrp x1,0x2da000
00b5e318	add x1,x1,#0xc7f
00b5e31c	mov w0,#0x20
00b5e320	mov w2,#0x3a
00b5e324	bl 0x00c34250
00b5e328	mov x19,x0
00b5e32c	cbz x0,0x00b5e3f8
00b5e330	mov x0,x22
00b5e334	bl 0x00c41210
00b5e338	str x0,[x19]
00b5e33c	cbz x20,0x00b5e360
00b5e340	adrp x1,0x2da000
00b5e344	add x1,x1,#0xc7f
00b5e348	orr w2,wzr,#0x3f
00b5e34c	mov x0,x20
00b5e350	bl 0x00c34600
00b5e354	str x0,[x19, #0x8]
00b5e358	cbz x0,0x00b5e390
00b5e35c	ldr x0,[x19]
00b5e360	mov x1,x21
00b5e364	mov x2,x20
00b5e368	bl 0x00c363a0
00b5e36c	mov x20,x0
00b5e370	cbz x0,0x00b5e3c4
00b5e374	mov x0,x20
00b5e378	bl 0x00c36390
00b5e37c	str x0,[x19, #0x18]
00b5e380	cbz x0,0x00b5e3c4
00b5e384	mov x0,x20
00b5e388	bl 0x00c363c0
00b5e38c	b 0x00b5e3f8
00b5e390	bl 0x00c342a0
00b5e394	adrp x0,0x2da000
00b5e398	adrp x2,0x2a4000
00b5e39c	add x0,x0,#0xc7f
00b5e3a0	add x2,x2,#0xfac
00b5e3a4	mov w1,#0x40
00b5e3a8	bl 0x00c342b0
00b5e3ac	mov w1,#0x100
00b5e3b0	mov w0,#0x39
00b5e3b4	movk w1,#0xc, LSL #16
00b5e3b8	mov x2,xzr
00b5e3bc	bl 0x00c342c0
00b5e3c0	mov x20,xzr
00b5e3c4	ldr x0,[x19, #0x8]
00b5e3c8	adrp x21,0x2da000
00b5e3cc	add x21,x21,#0xc7f
00b5e3d0	mov w2,#0x51
00b5e3d4	mov x1,x21
00b5e3d8	bl 0x00c32310
00b5e3dc	mov w2,#0x52
00b5e3e0	mov x0,x19
00b5e3e4	mov x1,x21
00b5e3e8	bl 0x00c32310
00b5e3ec	mov x0,x20
00b5e3f0	bl 0x00c363c0
00b5e3f4	mov x19,xzr
00b5e3f8	mov x0,x19
00b5e3fc	ldp x29,x30,[sp, #0x20]
00b5e400	ldp x20,x19,[sp, #0x10]
00b5e404	ldp x22,x21,[sp], #0x30
00b5e408	ret

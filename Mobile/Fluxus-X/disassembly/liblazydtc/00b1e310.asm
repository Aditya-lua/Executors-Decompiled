; FUN_00b1e310 @ 00b1e310
00b1e310	stp x22,x21,[sp, #-0x30]!
00b1e314	adrp x1,0x2bc000
00b1e318	stp x20,x19,[sp, #0x10]
00b1e31c	mov x22,x2
00b1e320	mov x20,x0
00b1e324	add x1,x1,#0x79f
00b1e328	orr w0,wzr,#0x30
00b1e32c	mov w2,#0x73
00b1e330	stp x29,x30,[sp, #0x20]
00b1e334	add x29,sp,#0x20
00b1e338	mov x21,x3
00b1e33c	bl 0x00c34250
00b1e340	cbz x0,0x00b1e3f8
00b1e344	ldr x8,[x0]
00b1e348	mov x19,x0
00b1e34c	cbnz x8,0x00b1e35c
00b1e350	bl 0x00c38250
00b1e354	str x0,[x19]
00b1e358	cbz x0,0x00b1e3b8
00b1e35c	ldr x8,[x19, #0x8]
00b1e360	cbnz x8,0x00b1e370
00b1e364	bl 0x00c38040
00b1e368	str x0,[x19, #0x8]
00b1e36c	cbz x0,0x00b1e3b8
00b1e370	ldr x0,[x19, #0x20]
00b1e374	adrp x1,0x2bc000
00b1e378	add x1,x1,#0x79f
00b1e37c	mov w2,#0x34
00b1e380	str x22,[x19, #0x18]
00b1e384	bl 0x00c32310
00b1e388	str xzr,[x19, #0x20]
00b1e38c	cbz x21,0x00b1e3ac
00b1e390	adrp x1,0x2bc000
00b1e394	add x1,x1,#0x79f
00b1e398	mov w2,#0x37
00b1e39c	mov x0,x21
00b1e3a0	bl 0x00c34600
00b1e3a4	str x0,[x19, #0x20]
00b1e3a8	cbz x0,0x00b1e3b8
00b1e3ac	mov w0,#0x1
00b1e3b0	str x19,[x20]
00b1e3b4	b 0x00b1e42c
00b1e3b8	ldr x0,[x19]
00b1e3bc	bl 0x00c38240
00b1e3c0	ldr x0,[x19, #0x8]
00b1e3c4	bl 0x00c38030
00b1e3c8	ldr x0,[x19, #0x10]
00b1e3cc	bl 0x00c32450
00b1e3d0	ldr x0,[x19, #0x20]
00b1e3d4	adrp x20,0x2bc000
00b1e3d8	add x20,x20,#0x79f
00b1e3dc	mov w2,#0x5d
00b1e3e0	mov x1,x20
00b1e3e4	bl 0x00c32310
00b1e3e8	mov w2,#0x5e
00b1e3ec	mov x0,x19
00b1e3f0	mov x1,x20
00b1e3f4	bl 0x00c32310
00b1e3f8	bl 0x00c342a0
00b1e3fc	adrp x0,0x2bc000
00b1e400	adrp x2,0x2c4000
00b1e404	add x0,x0,#0x79f
00b1e408	add x2,x2,#0x400
00b1e40c	orr w1,wzr,#0x78
00b1e410	bl 0x00c342b0
00b1e414	mov w1,#0x100
00b1e418	mov w0,#0xd
00b1e41c	movk w1,#0xc, LSL #16
00b1e420	mov x2,xzr
00b1e424	bl 0x00c342c0
00b1e428	mov w0,wzr
00b1e42c	ldp x29,x30,[sp, #0x20]
00b1e430	ldp x20,x19,[sp, #0x10]
00b1e434	ldp x22,x21,[sp], #0x30
00b1e438	ret

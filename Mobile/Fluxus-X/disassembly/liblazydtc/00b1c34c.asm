; FUN_00b1c34c @ 00b1c34c
00b1c34c	sub sp,sp,#0x60
00b1c350	stp x24,x23,[sp, #0x20]
00b1c354	stp x22,x21,[sp, #0x30]
00b1c358	stp x20,x19,[sp, #0x40]
00b1c35c	stp x29,x30,[sp, #0x50]
00b1c360	ldr x20,[x0]
00b1c364	mov x19,x1
00b1c368	str x25,[sp, #0x10]
00b1c36c	add x29,sp,#0x50
00b1c370	ldr w8,[x20, #0x8]
00b1c374	cbz w8,0x00b1c48c
00b1c378	bl 0x00c34780
00b1c37c	mov x21,x0
00b1c380	str x0,[sp, #0x18]
00b1c384	cbz x0,0x00b1c4d0
00b1c388	ldr x0,[x20]
00b1c38c	bl 0x00c325e0
00b1c390	cmp w0,#0x1
00b1c394	b.lt 0x00b1c404
00b1c398	mov w22,wzr
00b1c39c	mov x23,xzr
00b1c3a0	mov w25,#0xffffffff
00b1c3a4	ldr x0,[x20]
00b1c3a8	mov w1,w22
00b1c3ac	bl 0x00c32610
00b1c3b0	ldr w8,[x0, #0x10]
00b1c3b4	mov x24,x0
00b1c3b8	cmp w8,w25
00b1c3bc	b.eq 0x00b1c3e0
00b1c3c0	bl 0x00c34780
00b1c3c4	cbz x0,0x00b1c4d0
00b1c3c8	mov x23,x0
00b1c3cc	mov x0,x21
00b1c3d0	mov x1,x23
00b1c3d4	bl 0x00c347a0
00b1c3d8	cbz w0,0x00b1c4c8
00b1c3dc	ldr w25,[x24, #0x10]
00b1c3e0	mov x0,x23
00b1c3e4	mov x1,x24
00b1c3e8	bl 0x00c347a0
00b1c3ec	cbz w0,0x00b1c4d0
00b1c3f0	ldr x0,[x20]
00b1c3f4	add w22,w22,#0x1
00b1c3f8	bl 0x00c325e0
00b1c3fc	cmp w22,w0
00b1c400	b.lt 0x00b1c3a4
00b1c404	adrp x2,0xc82000
00b1c408	add x2,x2,#0x580
00b1c40c	add x0,sp,#0x18
00b1c410	mov w3,#0xffffffff
00b1c414	mov w4,#0xffffffff
00b1c418	mov x1,xzr
00b1c41c	bl 0x00c38060
00b1c420	mov x22,x20
00b1c424	ldr x8,[x22, #0x10]!
00b1c428	mov w21,w0
00b1c42c	sxtw x1,w21
00b1c430	mov x0,x8
00b1c434	bl 0x00c37000
00b1c438	cbz x0,0x00b1c4c0
00b1c43c	ldr x8,[x20, #0x10]
00b1c440	adrp x2,0xc82000
00b1c444	add x2,x2,#0x580
00b1c448	add x0,sp,#0x18
00b1c44c	ldr x8,[x8, #0x8]
00b1c450	add x1,sp,#0x8
00b1c454	mov w3,#0xffffffff
00b1c458	mov w4,#0xffffffff
00b1c45c	str x8,[sp, #0x8]
00b1c460	bl 0x00c38060
00b1c464	ldr x0,[sp, #0x18]
00b1c468	adrp x1,0xb1c000
00b1c46c	add x1,x1,#0x9e0
00b1c470	bl 0x00c32600
00b1c474	str wzr,[x20, #0x8]
00b1c478	tbnz w21,#0x1f,0x00b1c514
00b1c47c	mov x0,x20
00b1c480	bl 0x00b1c55c
00b1c484	cbnz w0,0x00b1c490
00b1c488	b 0x00b1c510
00b1c48c	add x22,x20,#0x10
00b1c490	ldr x8,[x22]
00b1c494	ldr x21,[x8]
00b1c498	cbz x19,0x00b1c514
00b1c49c	ldr x0,[x19]
00b1c4a0	ldr x1,[x8, #0x8]
00b1c4a4	sxtw x20,w21
00b1c4a8	mov x2,x20
00b1c4ac	bl 0x00c2ffd0
00b1c4b0	ldr x8,[x19]
00b1c4b4	add x8,x8,x20
00b1c4b8	str x8,[x19]
00b1c4bc	b 0x00b1c514
00b1c4c0	ldr x21,[sp, #0x18]
00b1c4c4	b 0x00b1c4d0
00b1c4c8	mov x0,x23
00b1c4cc	bl 0x00c34770
00b1c4d0	adrp x1,0xb1c000
00b1c4d4	add x1,x1,#0x9e0
00b1c4d8	mov x0,x21
00b1c4dc	bl 0x00c32600
00b1c4e0	bl 0x00c342a0
00b1c4e4	adrp x0,0x2c6000
00b1c4e8	adrp x2,0x2ca000
00b1c4ec	add x0,x0,#0x46b
00b1c4f0	add x2,x2,#0x6d8
00b1c4f4	mov w1,#0x117
00b1c4f8	bl 0x00c342b0
00b1c4fc	mov w1,#0x100
00b1c500	mov w0,#0xd
00b1c504	movk w1,#0xc, LSL #16
00b1c508	mov x2,xzr
00b1c50c	bl 0x00c342c0
00b1c510	mov w21,#0xffffffff
00b1c514	mov w0,w21
00b1c518	ldp x29,x30,[sp, #0x50]
00b1c51c	ldp x20,x19,[sp, #0x40]
00b1c520	ldp x22,x21,[sp, #0x30]
00b1c524	ldp x24,x23,[sp, #0x20]
00b1c528	ldr x25,[sp, #0x10]
00b1c52c	add sp,sp,#0x60
00b1c530	ret

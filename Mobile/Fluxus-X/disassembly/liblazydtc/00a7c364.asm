; EVP_PKEY_verify_recover @ 00a7c364
00a7c364	str x23,[sp, #-0x40]!
00a7c368	stp x22,x21,[sp, #0x10]
00a7c36c	stp x20,x19,[sp, #0x20]
00a7c370	stp x29,x30,[sp, #0x30]
00a7c374	add x29,sp,#0x30
00a7c378	cbz x0,0x00a7c3bc
00a7c37c	ldr w8,[x0]
00a7c380	mov x23,x0
00a7c384	cmp w8,#0x40
00a7c388	b.ne 0x00a7c3e8
00a7c38c	ldr x0,[x23, #0x30]
00a7c390	mov x19,x4
00a7c394	mov x20,x3
00a7c398	mov x21,x2
00a7c39c	mov x22,x1
00a7c3a0	cbz x0,0x00a7c42c
00a7c3a4	ldr x8,[x23, #0x28]
00a7c3a8	ldr x6,[x8, #0x60]
00a7c3ac	cbz x6,0x00a7c46c
00a7c3b0	cbz x22,0x00a7c4bc
00a7c3b4	ldr x3,[x21]
00a7c3b8	b 0x00a7c4c0
00a7c3bc	bl 0x00c342a0
00a7c3c0	adrp x0,0x2d1000
00a7c3c4	adrp x2,0x2a0000
00a7c3c8	add x0,x0,#0xaf6
00a7c3cc	add x2,x2,#0x3ae
00a7c3d0	mov w1,#0x2de
00a7c3d4	bl 0x00c342b0
00a7c3d8	mov w1,#0x102
00a7c3dc	orr w0,wzr,#0x6
00a7c3e0	movk w1,#0xc, LSL #16
00a7c3e4	b 0x00a7c40c
00a7c3e8	bl 0x00c342a0
00a7c3ec	adrp x0,0x2d1000
00a7c3f0	adrp x2,0x2a0000
00a7c3f4	add x0,x0,#0xaf6
00a7c3f8	add x2,x2,#0x3ae
00a7c3fc	mov w1,#0x2e3
00a7c400	bl 0x00c342b0
00a7c404	orr w0,wzr,#0x6
00a7c408	mov w1,#0x97
00a7c40c	mov x2,xzr
00a7c410	bl 0x00c342c0
00a7c414	mov w0,#0xffffffff
00a7c418	ldp x29,x30,[sp, #0x30]
00a7c41c	ldp x20,x19,[sp, #0x20]
00a7c420	ldp x22,x21,[sp, #0x10]
00a7c424	ldr x23,[sp], #0x40
00a7c428	ret
00a7c42c	ldr x8,[x23, #0x78]
00a7c430	cbz x8,0x00a7c488
00a7c434	ldr x5,[x8, #0x68]
00a7c438	cbz x5,0x00a7c488
00a7c43c	ldrb w8,[x8, #0x4]
00a7c440	tbnz w8,#0x1,0x00a7c4e4
00a7c444	mov x1,x22
00a7c448	mov x2,x21
00a7c44c	mov x3,x20
00a7c450	mov x4,x19
00a7c454	ldp x29,x30,[sp, #0x30]
00a7c458	ldp x20,x19,[sp, #0x20]
00a7c45c	ldp x22,x21,[sp, #0x10]
00a7c460	mov x0,x23
00a7c464	ldr x23,[sp], #0x40
00a7c468	br x5
00a7c46c	bl 0x00c342a0
00a7c470	adrp x0,0x2d1000
00a7c474	adrp x2,0x2a0000
00a7c478	add x0,x0,#0xaf6
00a7c47c	add x2,x2,#0x3ae
00a7c480	mov w1,#0x2eb
00a7c484	b 0x00a7c4a0
00a7c488	bl 0x00c342a0
00a7c48c	adrp x0,0x2d1000
00a7c490	adrp x2,0x2a0000
00a7c494	add x0,x0,#0xaf6
00a7c498	add x2,x2,#0x3ae
00a7c49c	mov w1,#0x2f6
00a7c4a0	bl 0x00c342b0
00a7c4a4	orr w0,wzr,#0x6
00a7c4a8	mov w1,#0x96
00a7c4ac	mov x2,xzr
00a7c4b0	bl 0x00c342c0
00a7c4b4	orr w0,wzr,#0xfffffffe
00a7c4b8	b 0x00a7c418
00a7c4bc	mov x3,xzr
00a7c4c0	mov x1,x22
00a7c4c4	mov x2,x21
00a7c4c8	mov x4,x20
00a7c4cc	mov x5,x19
00a7c4d0	ldp x29,x30,[sp, #0x30]
00a7c4d4	ldp x20,x19,[sp, #0x20]
00a7c4d8	ldp x22,x21,[sp, #0x10]
00a7c4dc	ldr x23,[sp], #0x40
00a7c4e0	br x6
00a7c4e4	ldr x0,[x23, #0x88]
00a7c4e8	bl 0x00c36440
00a7c4ec	cbz w0,0x00a7c52c
00a7c4f0	sxtw x8,w0
00a7c4f4	cbz x22,0x00a7c560
00a7c4f8	ldr x9,[x21]
00a7c4fc	cmp x9,x8
00a7c500	b.cs 0x00a7c56c
00a7c504	bl 0x00c342a0
00a7c508	adrp x0,0x2d1000
00a7c50c	adrp x2,0x2a0000
00a7c510	add x0,x0,#0xaf6
00a7c514	add x2,x2,#0x3ae
00a7c518	mov w1,#0x2f9
00a7c51c	bl 0x00c342b0
00a7c520	orr w0,wzr,#0x6
00a7c524	mov w1,#0x9b
00a7c528	b 0x00a7c550
00a7c52c	bl 0x00c342a0
00a7c530	adrp x0,0x2d1000
00a7c534	adrp x2,0x2a0000
00a7c538	add x0,x0,#0xaf6
00a7c53c	add x2,x2,#0x3ae
00a7c540	mov w1,#0x2f9
00a7c544	bl 0x00c342b0
00a7c548	orr w0,wzr,#0x6
00a7c54c	mov w1,#0xa3
00a7c550	mov x2,xzr
00a7c554	bl 0x00c342c0
00a7c558	mov w0,wzr
00a7c55c	b 0x00a7c418
00a7c560	mov w0,#0x1
00a7c564	str x8,[x21]
00a7c568	b 0x00a7c418
00a7c56c	ldr x8,[x23, #0x78]
00a7c570	ldr x5,[x8, #0x68]
00a7c574	b 0x00a7c444

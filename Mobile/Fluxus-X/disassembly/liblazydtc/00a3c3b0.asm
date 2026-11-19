; ossl_ec_GFp_simple_set_Jprojective_coordinates_GFp @ 00a3c3b0
00a3c3b0	str x25,[sp, #-0x50]!
00a3c3b4	stp x24,x23,[sp, #0x10]
00a3c3b8	stp x22,x21,[sp, #0x20]
00a3c3bc	stp x20,x19,[sp, #0x30]
00a3c3c0	mov x21,x5
00a3c3c4	mov x23,x4
00a3c3c8	mov x24,x3
00a3c3cc	mov x25,x2
00a3c3d0	mov x20,x1
00a3c3d4	mov x22,x0
00a3c3d8	mov x19,xzr
00a3c3dc	stp x29,x30,[sp, #0x40]
00a3c3e0	add x29,sp,#0x40
00a3c3e4	cbnz x5,0x00a3c3fc
00a3c3e8	ldr x0,[x22, #0xa8]
00a3c3ec	bl 0x00c38a60
00a3c3f0	mov x21,x0
00a3c3f4	mov x19,x0
00a3c3f8	cbz x0,0x00a3c4d8
00a3c3fc	cbz x25,0x00a3c43c
00a3c400	ldr x0,[x20, #0x10]
00a3c404	ldr x2,[x22, #0x40]
00a3c408	mov x1,x25
00a3c40c	mov x3,x21
00a3c410	bl 0x00c38f30
00a3c414	cbz w0,0x00a3c4d0
00a3c418	ldr x8,[x22]
00a3c41c	ldr x8,[x8, #0x118]
00a3c420	cbz x8,0x00a3c43c
00a3c424	ldr x1,[x20, #0x10]
00a3c428	mov x0,x22
00a3c42c	mov x3,x21
00a3c430	mov x2,x1
00a3c434	blr x8
00a3c438	cbz w0,0x00a3c4d0
00a3c43c	cbz x24,0x00a3c47c
00a3c440	ldr x0,[x20, #0x18]
00a3c444	ldr x2,[x22, #0x40]
00a3c448	mov x1,x24
00a3c44c	mov x3,x21
00a3c450	bl 0x00c38f30
00a3c454	cbz w0,0x00a3c4d0
00a3c458	ldr x8,[x22]
00a3c45c	ldr x8,[x8, #0x118]
00a3c460	cbz x8,0x00a3c47c
00a3c464	ldr x1,[x20, #0x18]
00a3c468	mov x0,x22
00a3c46c	mov x3,x21
00a3c470	mov x2,x1
00a3c474	blr x8
00a3c478	cbz w0,0x00a3c4d0
00a3c47c	cbz x23,0x00a3c4fc
00a3c480	ldr x0,[x20, #0x20]
00a3c484	ldr x2,[x22, #0x40]
00a3c488	mov x1,x23
00a3c48c	mov x3,x21
00a3c490	bl 0x00c38f30
00a3c494	cbz w0,0x00a3c4d0
00a3c498	ldr x0,[x20, #0x20]
00a3c49c	bl 0x00c38d20
00a3c4a0	ldr x9,[x22]
00a3c4a4	mov w23,w0
00a3c4a8	ldr x8,[x9, #0x118]
00a3c4ac	cbz x8,0x00a3c4f8
00a3c4b0	cbz w23,0x00a3c4e0
00a3c4b4	ldr x9,[x9, #0x128]
00a3c4b8	cbz x9,0x00a3c4e0
00a3c4bc	ldr x1,[x20, #0x20]
00a3c4c0	mov x0,x22
00a3c4c4	mov x2,x21
00a3c4c8	blr x9
00a3c4cc	cbnz w0,0x00a3c4f8
00a3c4d0	mov w20,wzr
00a3c4d4	b 0x00a3c500
00a3c4d8	mov w20,wzr
00a3c4dc	b 0x00a3c508
00a3c4e0	ldr x1,[x20, #0x20]
00a3c4e4	mov x0,x22
00a3c4e8	mov x3,x21
00a3c4ec	mov x2,x1
00a3c4f0	blr x8
00a3c4f4	cbz w0,0x00a3c4d0
00a3c4f8	str w23,[x20, #0x28]
00a3c4fc	mov w20,#0x1
00a3c500	mov x0,x19
00a3c504	bl 0x00c38a30
00a3c508	mov w0,w20
00a3c50c	ldp x29,x30,[sp, #0x40]
00a3c510	ldp x20,x19,[sp, #0x30]
00a3c514	ldp x22,x21,[sp, #0x20]
00a3c518	ldp x24,x23,[sp, #0x10]
00a3c51c	ldr x25,[sp], #0x50
00a3c520	ret

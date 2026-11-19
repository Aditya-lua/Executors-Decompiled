; EVP_PKEY_set_type_by_keymgmt @ 00a6c3fc
00a6c3fc	sub sp,sp,#0x40
00a6c400	stp x20,x19,[sp, #0x20]
00a6c404	mov x19,x1
00a6c408	adrp x1,0xa6e000
00a6c40c	mov x20,x0
00a6c410	add x1,x1,#0xed0
00a6c414	mov x2,sp
00a6c418	mov x0,x19
00a6c41c	stp xzr,x21,[sp, #0x8]
00a6c420	stp x29,x30,[sp, #0x30]
00a6c424	add x29,sp,#0x30
00a6c428	str xzr,[sp]
00a6c42c	bl 0x00c3b6e0
00a6c430	cbz w0,0x00a6c43c
00a6c434	ldr x8,[sp, #0x8]
00a6c438	cbz x8,0x00a6c474
00a6c43c	bl 0x00c342a0
00a6c440	adrp x0,0x2c1000
00a6c444	adrp x2,0x2b0000
00a6c448	add x0,x0,#0xcf9
00a6c44c	add x2,x2,#0x4b
00a6c450	mov w1,#0x66c
00a6c454	bl 0x00c342b0
00a6c458	mov w1,#0x103
00a6c45c	orr w0,wzr,#0x6
00a6c460	movk w1,#0xc, LSL #16
00a6c464	mov x2,xzr
00a6c468	bl 0x00c342c0
00a6c46c	mov w0,wzr
00a6c470	b 0x00a6c4a8
00a6c474	ldr x21,[sp]
00a6c478	cbz x21,0x00a6c48c
00a6c47c	mov x0,x21
00a6c480	bl 0x00c2ff50
00a6c484	mov x4,x0
00a6c488	b 0x00a6c490
00a6c48c	mov w4,#0xffffffff
00a6c490	mov x0,x20
00a6c494	mov x1,xzr
00a6c498	mov w2,wzr
00a6c49c	mov x3,x21
00a6c4a0	mov x5,x19
00a6c4a4	bl 0x00a6d2f4
00a6c4a8	ldp x29,x30,[sp, #0x30]
00a6c4ac	ldp x20,x19,[sp, #0x20]
00a6c4b0	ldr x21,[sp, #0x10]
00a6c4b4	add sp,sp,#0x40
00a6c4b8	ret

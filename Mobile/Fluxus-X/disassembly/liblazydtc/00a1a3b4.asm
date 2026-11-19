; ossl_dh_check_pairwise @ 00a1a3b4
00a1a3b4	str x21,[sp, #-0x30]!
00a1a3b8	stp x20,x19,[sp, #0x10]
00a1a3bc	stp x29,x30,[sp, #0x20]
00a1a3c0	ldr x8,[x0, #0x8]
00a1a3c4	add x29,sp,#0x20
00a1a3c8	cbz x8,0x00a1a434
00a1a3cc	ldr x8,[x0, #0x18]
00a1a3d0	mov x20,x0
00a1a3d4	cbz x8,0x00a1a434
00a1a3d8	ldr x8,[x20, #0x78]
00a1a3dc	cbz x8,0x00a1a434
00a1a3e0	ldr x8,[x20, #0x70]
00a1a3e4	cbz x8,0x00a1a434
00a1a3e8	ldr x0,[x20, #0xb0]
00a1a3ec	bl 0x00c38a60
00a1a3f0	mov x19,x0
00a1a3f4	cbz x0,0x00a1a44c
00a1a3f8	bl 0x00c37710
00a1a3fc	mov x21,x0
00a1a400	cbz x0,0x00a1a458
00a1a404	ldr x2,[x20, #0x78]
00a1a408	mov x0,x19
00a1a40c	mov x1,x20
00a1a410	mov x3,x21
00a1a414	bl 0x00c39e50
00a1a418	cbz w0,0x00a1a458
00a1a41c	ldr x1,[x20, #0x70]
00a1a420	mov x0,x21
00a1a424	bl 0x00c38cc0
00a1a428	cmp w0,#0x0
00a1a42c	cset w20,eq
00a1a430	b 0x00a1a45c
00a1a434	mov w20,wzr
00a1a438	mov w0,w20
00a1a43c	ldp x29,x30,[sp, #0x20]
00a1a440	ldp x20,x19,[sp, #0x10]
00a1a444	ldr x21,[sp], #0x30
00a1a448	ret
00a1a44c	mov w20,wzr
00a1a450	mov x21,xzr
00a1a454	b 0x00a1a45c
00a1a458	mov w20,wzr
00a1a45c	mov x0,x21
00a1a460	bl 0x00c36290
00a1a464	mov x0,x19
00a1a468	bl 0x00c38a30
00a1a46c	b 0x00a1a438

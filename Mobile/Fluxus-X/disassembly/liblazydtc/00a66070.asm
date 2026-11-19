; evp_keymgmt_util_gen @ 00a66070
00a66070	str x21,[sp, #-0x30]!
00a66074	stp x20,x19,[sp, #0x10]
00a66078	mov x20,x1
00a6607c	mov x21,x0
00a66080	mov x0,x1
00a66084	mov x1,x2
00a66088	mov x2,x3
00a6608c	mov x3,x4
00a66090	stp x29,x30,[sp, #0x20]
00a66094	add x29,sp,#0x20
00a66098	bl 0x00c3d370
00a6609c	mov x19,x0
00a660a0	cbz x0,0x00a660fc
00a660a4	cbz x21,0x00a660cc
00a660a8	cbz x20,0x00a660cc
00a660ac	mov x0,x21
00a660b0	mov x1,x20
00a660b4	bl 0x00c3d200
00a660b8	cbz w0,0x00a660cc
00a660bc	mov x0,x21
00a660c0	str x19,[x21, #0x68]
00a660c4	bl 0x00a65640
00a660c8	b 0x00a6610c
00a660cc	bl 0x00c342a0
00a660d0	adrp x0,0x2cd000
00a660d4	adrp x2,0x2bd000
00a660d8	add x0,x0,#0xabe
00a660dc	add x2,x2,#0xaf1
00a660e0	mov w1,#0x41
00a660e4	bl 0x00c342b0
00a660e8	mov w1,#0x103
00a660ec	orr w0,wzr,#0x6
00a660f0	movk w1,#0xc, LSL #16
00a660f4	mov x2,xzr
00a660f8	bl 0x00c342c0
00a660fc	mov x0,x20
00a66100	mov x1,x19
00a66104	bl 0x00c3b730
00a66108	mov x19,xzr
00a6610c	mov x0,x19
00a66110	ldp x29,x30,[sp, #0x20]
00a66114	ldp x20,x19,[sp, #0x10]
00a66118	ldr x21,[sp], #0x30
00a6611c	ret

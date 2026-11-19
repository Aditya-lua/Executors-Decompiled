; ossl_x509_print_ex_brief @ 00af3948
00af3948	str x21,[sp, #-0x30]!
00af394c	stp x20,x19,[sp, #0x10]
00af3950	mov x19,x0
00af3954	stp x29,x30,[sp, #0x20]
00af3958	add x29,sp,#0x20
00af395c	cbz x1,0x00af39e4
00af3960	mov x20,x1
00af3964	adrp x1,0x2c0000
00af3968	add x1,x1,#0x5cb
00af396c	mov x0,x19
00af3970	mov x21,x2
00af3974	bl 0x00c32250
00af3978	cmp w0,#0x1
00af397c	b.lt 0x00af3ab0
00af3980	mov w2,#0x31f
00af3984	movk w2,#0x2, LSL #16
00af3988	orr x3,xzr,#-0x41
00af398c	mov x0,x19
00af3990	mov x1,x20
00af3994	bl 0x00af2bb0
00af3998	cbz w0,0x00af3ab4
00af399c	mov x0,x20
00af39a0	mov x1,x20
00af39a4	bl 0x00c32c70
00af39a8	cbz w0,0x00af3a00
00af39ac	adrp x1,0x2a1000
00af39b0	add x1,x1,#0x9a2
00af39b4	mov x0,x19
00af39b8	bl 0x00c32250
00af39bc	cmp w0,#0x1
00af39c0	b.lt 0x00af3ab0
00af39c4	mov w2,#0x31f
00af39c8	movk w2,#0x2, LSL #16
00af39cc	orr x3,xzr,#-0x11
00af39d0	mov x0,x19
00af39d4	mov x1,x20
00af39d8	bl 0x00af2bb0
00af39dc	cbnz w0,0x00af3a18
00af39e0	b 0x00af3ab4
00af39e4	adrp x1,0x2b8000
00af39e8	add x1,x1,#0x6d6
00af39ec	mov x0,x19
00af39f0	bl 0x00c32250
00af39f4	cmp w0,#0x0
00af39f8	cset w0,gt
00af39fc	b 0x00af3ab4
00af3a00	adrp x1,0x2dc000
00af3a04	add x1,x1,#0xa1b
00af3a08	mov x0,x19
00af3a0c	bl 0x00c32250
00af3a10	cmp w0,#0x1
00af3a14	b.lt 0x00af3ab0
00af3a18	mov w2,#0x31f
00af3a1c	movk w2,#0x2, LSL #16
00af3a20	mov x3,#-0x25
00af3a24	mov x0,x19
00af3a28	mov x1,x20
00af3a2c	bl 0x00af2bb0
00af3a30	cbz w0,0x00af3ab4
00af3a34	mov x0,x20
00af3a38	bl 0x00c32ca0
00af3a3c	bl 0x00c406c0
00af3a40	cmp w0,#0x1
00af3a44	b.lt 0x00af3a60
00af3a48	adrp x1,0x2d8000
00af3a4c	add x1,x1,#0x83d
00af3a50	mov x0,x19
00af3a54	bl 0x00c32250
00af3a58	cmp w0,#0x1
00af3a5c	b.lt 0x00af3ab0
00af3a60	mov x0,x20
00af3a64	bl 0x00c32c90
00af3a68	bl 0x00c406c0
00af3a6c	tbz w0,#0x1f,0x00af3a88
00af3a70	adrp x1,0x2c2000
00af3a74	add x1,x1,#0x4b3
00af3a78	mov x0,x19
00af3a7c	bl 0x00c32250
00af3a80	cmp w0,#0x1
00af3a84	b.lt 0x00af3ab0
00af3a88	mov x0,x19
00af3a8c	mov x1,x20
00af3a90	ldp x29,x30,[sp, #0x20]
00af3a94	ldp x20,x19,[sp, #0x10]
00af3a98	mvn x8,x21
00af3a9c	mov w2,#0x31f
00af3aa0	and x3,x8,#-0x2001
00af3aa4	movk w2,#0x2, LSL #16
00af3aa8	ldr x21,[sp], #0x30
00af3aac	b 0x00af2bb0
00af3ab0	mov w0,wzr
00af3ab4	ldp x29,x30,[sp, #0x20]
00af3ab8	ldp x20,x19,[sp, #0x10]
00af3abc	ldr x21,[sp], #0x30
00af3ac0	ret

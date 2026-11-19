; PKCS12_SAFEBAG_create_secret @ 00abc954
00abc954	str x23,[sp, #-0x40]!
00abc958	stp x22,x21,[sp, #0x10]
00abc95c	stp x20,x19,[sp, #0x20]
00abc960	stp x29,x30,[sp, #0x30]
00abc964	add x29,sp,#0x30
00abc968	mov w20,w3
00abc96c	mov x22,x2
00abc970	mov w21,w1
00abc974	mov w23,w0
00abc978	bl 0x00c3f3e0
00abc97c	cbz x0,0x00abc9ec
00abc980	mov x19,x0
00abc984	mov w0,w23
00abc988	bl 0x00c37740
00abc98c	cmp w21,#0x4
00abc990	str x0,[x19]
00abc994	b.ne 0x00abca20
00abc998	bl 0x00c38170
00abc99c	cbz x0,0x00abca48
00abc9a0	mov x1,x22
00abc9a4	mov w2,w20
00abc9a8	mov x21,x0
00abc9ac	bl 0x00c377a0
00abc9b0	cbz w0,0x00abca64
00abc9b4	bl 0x00c37a40
00abc9b8	str x0,[x19, #0x8]
00abc9bc	cbz x0,0x00abca94
00abc9c0	mov w1,#0x4
00abc9c4	mov x2,x21
00abc9c8	bl 0x00c37a60
00abc9cc	bl 0x00c3f420
00abc9d0	cbz x0,0x00abcab8
00abc9d4	mov x20,x0
00abc9d8	str x19,[x0, #0x8]
00abc9dc	mov w0,#0x9a
00abc9e0	bl 0x00c37740
00abc9e4	str x0,[x20]
00abc9e8	b 0x00abcaf4
00abc9ec	bl 0x00c342a0
00abc9f0	adrp x0,0x2a8000
00abc9f4	adrp x2,0x2d8000
00abc9f8	add x0,x0,#0x6fe
00abc9fc	add x2,x2,#0x5ed
00abca00	mov w1,#0x7a
00abca04	bl 0x00c342b0
00abca08	mov w1,#0x100
00abca0c	mov w0,#0x23
00abca10	movk w1,#0xc, LSL #16
00abca14	mov x2,xzr
00abca18	bl 0x00c342c0
00abca1c	b 0x00abcaf0
00abca20	bl 0x00c342a0
00abca24	adrp x0,0x2a8000
00abca28	adrp x2,0x2d8000
00abca2c	add x0,x0,#0x6fe
00abca30	add x2,x2,#0x5ed
00abca34	mov w1,#0x99
00abca38	bl 0x00c342b0
00abca3c	mov w0,#0x23
00abca40	orr w1,wzr,#0x70
00abca44	b 0x00abcae0
00abca48	bl 0x00c342a0
00abca4c	adrp x0,0x2a8000
00abca50	adrp x2,0x2d8000
00abca54	add x0,x0,#0x6fe
00abca58	add x2,x2,#0x5ed
00abca5c	mov w1,#0x85
00abca60	b 0x00abcad0
00abca64	mov x0,x21
00abca68	bl 0x00c35530
00abca6c	bl 0x00c342a0
00abca70	adrp x0,0x2a8000
00abca74	adrp x2,0x2d8000
00abca78	add x0,x0,#0x6fe
00abca7c	add x2,x2,#0x5ed
00abca80	mov w1,#0x8b
00abca84	bl 0x00c342b0
00abca88	mov w0,#0x23
00abca8c	mov w1,#0x66
00abca90	b 0x00abcae0
00abca94	mov x0,x21
00abca98	bl 0x00c35530
00abca9c	bl 0x00c342a0
00abcaa0	adrp x0,0x2a8000
00abcaa4	adrp x2,0x2d8000
00abcaa8	add x0,x0,#0x6fe
00abcaac	add x2,x2,#0x5ed
00abcab0	mov w1,#0x91
00abcab4	b 0x00abcad0
00abcab8	bl 0x00c342a0
00abcabc	adrp x0,0x2a8000
00abcac0	adrp x2,0x2d8000
00abcac4	add x0,x0,#0x6fe
00abcac8	add x2,x2,#0x5ed
00abcacc	mov w1,#0x9e
00abcad0	bl 0x00c342b0
00abcad4	mov w1,#0x100
00abcad8	mov w0,#0x23
00abcadc	movk w1,#0xc, LSL #16
00abcae0	mov x2,xzr
00abcae4	bl 0x00c342c0
00abcae8	mov x0,x19
00abcaec	bl 0x00c3f3d0
00abcaf0	mov x20,xzr
00abcaf4	mov x0,x20
00abcaf8	ldp x29,x30,[sp, #0x30]
00abcafc	ldp x20,x19,[sp, #0x20]
00abcb00	ldp x22,x21,[sp, #0x10]
00abcb04	ldr x23,[sp], #0x40
00abcb08	ret

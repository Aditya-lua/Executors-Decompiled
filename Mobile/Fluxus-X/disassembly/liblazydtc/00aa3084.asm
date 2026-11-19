; ossl_provider_set_module_path @ 00aa3084
00aa3084	stp x20,x19,[sp, #-0x20]!
00aa3088	stp x29,x30,[sp, #0x10]
00aa308c	mov x19,x0
00aa3090	ldr x0,[x0, #0x30]
00aa3094	mov x20,x1
00aa3098	adrp x1,0x2aa000
00aa309c	add x1,x1,#0x4b5
00aa30a0	mov w2,#0x2ed
00aa30a4	add x29,sp,#0x10
00aa30a8	bl 0x00c32310
00aa30ac	str xzr,[x19, #0x30]
00aa30b0	cbz x20,0x00aa30d0
00aa30b4	adrp x1,0x2aa000
00aa30b8	add x1,x1,#0x4b5
00aa30bc	mov w2,#0x2f1
00aa30c0	mov x0,x20
00aa30c4	bl 0x00c34600
00aa30c8	str x0,[x19, #0x30]
00aa30cc	cbz x0,0x00aa30d8
00aa30d0	mov w0,#0x1
00aa30d4	b 0x00aa310c
00aa30d8	bl 0x00c342a0
00aa30dc	adrp x0,0x2aa000
00aa30e0	adrp x2,0x2d6000
00aa30e4	add x0,x0,#0x4b5
00aa30e8	add x2,x2,#0x33
00aa30ec	mov w1,#0x2f3
00aa30f0	bl 0x00c342b0
00aa30f4	mov w1,#0x100
00aa30f8	orr w0,wzr,#0xf
00aa30fc	movk w1,#0xc, LSL #16
00aa3100	mov x2,xzr
00aa3104	bl 0x00c342c0
00aa3108	mov w0,wzr
00aa310c	ldp x29,x30,[sp, #0x10]
00aa3110	ldp x20,x19,[sp], #0x20
00aa3114	ret

; OCSP_archive_cutoff_new @ 00ab1388
00ab1388	stp x20,x19,[sp, #-0x20]!
00ab138c	stp x29,x30,[sp, #0x10]
00ab1390	add x29,sp,#0x10
00ab1394	mov x20,x0
00ab1398	bl 0x00c38130
00ab139c	mov x19,x0
00ab13a0	cbz x0,0x00ab13cc
00ab13a4	mov x0,x19
00ab13a8	mov x1,x20
00ab13ac	bl 0x00c374e0
00ab13b0	cbz w0,0x00ab13cc
00ab13b4	mov w0,#0x172
00ab13b8	mov w1,wzr
00ab13bc	mov x2,x19
00ab13c0	bl 0x00c3ef90
00ab13c4	mov x20,x0
00ab13c8	b 0x00ab13d0
00ab13cc	mov x20,xzr
00ab13d0	mov x0,x19
00ab13d4	bl 0x00c38120
00ab13d8	ldp x29,x30,[sp, #0x10]
00ab13dc	mov x0,x20
00ab13e0	ldp x20,x19,[sp], #0x20
00ab13e4	ret

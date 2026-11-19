; ossl_core_bio_new_file @ 00a4e448
00a4e448	stp x20,x19,[sp, #-0x20]!
00a4e44c	stp x29,x30,[sp, #0x10]
00a4e450	add x29,sp,#0x10
00a4e454	bl 0x00c387e0
00a4e458	cbz x0,0x00a4e4b4
00a4e45c	adrp x1,0x2b2000
00a4e460	mov x19,x0
00a4e464	add x1,x1,#0x1d3
00a4e468	orr w0,wzr,#0x18
00a4e46c	mov w2,#0x1a
00a4e470	bl 0x00c32320
00a4e474	mov x20,x0
00a4e478	cbz x0,0x00a4e498
00a4e47c	bl 0x00c34d50
00a4e480	str x0,[x20, #0x8]
00a4e484	cbz x0,0x00a4e498
00a4e488	mov w8,#0x1
00a4e48c	stlr w8,[x20]
00a4e490	str x19,[x20, #0x10]
00a4e494	b 0x00a4e4b8
00a4e498	adrp x1,0x2b2000
00a4e49c	add x1,x1,#0x1d3
00a4e4a0	mov w2,#0x1d
00a4e4a4	mov x0,x20
00a4e4a8	bl 0x00c32310
00a4e4ac	mov x0,x19
00a4e4b0	bl 0x00c31a40
00a4e4b4	mov x20,xzr
00a4e4b8	ldp x29,x30,[sp, #0x10]
00a4e4bc	mov x0,x20
00a4e4c0	ldp x20,x19,[sp], #0x20
00a4e4c4	ret

; X509_REQ_add1_attr_by_OBJ @ 00b0c510
00b0c510	str x19,[sp, #-0x20]!
00b0c514	stp x29,x30,[sp, #0x10]
00b0c518	add x29,sp,#0x10
00b0c51c	cbz x0,0x00b0c53c
00b0c520	mov x19,x0
00b0c524	add x0,x0,#0x30
00b0c528	bl 0x00c37f10
00b0c52c	cbz x0,0x00b0c570
00b0c530	mov w0,#0x1
00b0c534	str w0,[x19, #0x10]
00b0c538	b 0x00b0c570
00b0c53c	bl 0x00c342a0
00b0c540	adrp x0,0x2a4000
00b0c544	adrp x2,0x2a4000
00b0c548	add x0,x0,#0xaf5
00b0c54c	add x2,x2,#0xb1f
00b0c550	mov w1,#0xf7
00b0c554	bl 0x00c342b0
00b0c558	mov w1,#0x102
00b0c55c	mov w0,#0xb
00b0c560	movk w1,#0xc, LSL #16
00b0c564	mov x2,xzr
00b0c568	bl 0x00c342c0
00b0c56c	mov w0,wzr
00b0c570	ldp x29,x30,[sp, #0x10]
00b0c574	ldr x19,[sp], #0x20
00b0c578	ret

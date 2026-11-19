; PKCS12_unpack_authsafes @ 00abb48c
00abb48c	str x21,[sp, #-0x30]!
00abb490	stp x20,x19,[sp, #0x10]
00abb494	stp x29,x30,[sp, #0x20]
00abb498	ldr x8,[x0, #0x10]
00abb49c	mov x19,x0
00abb4a0	add x29,sp,#0x20
00abb4a4	ldr x0,[x8, #0x18]
00abb4a8	bl 0x00c37750
00abb4ac	cmp w0,#0x15
00abb4b0	b.ne 0x00abb524
00abb4b4	ldr x8,[x19, #0x10]
00abb4b8	ldr x20,[x8, #0x20]
00abb4bc	cbz x20,0x00abb558
00abb4c0	bl 0x00c3f3c0
00abb4c4	mov x1,x0
00abb4c8	mov x0,x20
00abb4cc	bl 0x00c37aa0
00abb4d0	mov x20,x0
00abb4d4	cbz x0,0x00abb584
00abb4d8	mov x0,x20
00abb4dc	bl 0x00c325e0
00abb4e0	cmp w0,#0x1
00abb4e4	b.lt 0x00abb584
00abb4e8	mov w21,wzr
00abb4ec	mov x0,x20
00abb4f0	mov w1,w21
00abb4f4	bl 0x00c32610
00abb4f8	ldr x8,[x19, #0x10]
00abb4fc	mov x1,x0
00abb500	mov x0,x8
00abb504	bl 0x00c3f5d0
00abb508	cbz w0,0x00abb598
00abb50c	mov x0,x20
00abb510	add w21,w21,#0x1
00abb514	bl 0x00c325e0
00abb518	cmp w21,w0
00abb51c	b.lt 0x00abb4ec
00abb520	b 0x00abb584
00abb524	bl 0x00c342a0
00abb528	adrp x0,0x2c6000
00abb52c	adrp x2,0x2b8000
00abb530	add x0,x0,#0x176
00abb534	add x2,x2,#0x4f2
00abb538	mov w1,#0xc8
00abb53c	bl 0x00c342b0
00abb540	mov w0,#0x23
00abb544	mov w1,#0x79
00abb548	mov x2,xzr
00abb54c	bl 0x00c342c0
00abb550	mov x20,xzr
00abb554	b 0x00abb584
00abb558	bl 0x00c342a0
00abb55c	adrp x0,0x2c6000
00abb560	adrp x2,0x2b8000
00abb564	add x0,x0,#0x176
00abb568	add x2,x2,#0x4f2
00abb56c	mov w1,#0xcd
00abb570	bl 0x00c342b0
00abb574	mov w0,#0x23
00abb578	mov w1,#0x65
00abb57c	mov x2,xzr
00abb580	bl 0x00c342c0
00abb584	mov x0,x20
00abb588	ldp x29,x30,[sp, #0x20]
00abb58c	ldp x20,x19,[sp, #0x10]
00abb590	ldr x21,[sp], #0x30
00abb594	ret
00abb598	mov x0,x20
00abb59c	bl 0x00c34770
00abb5a0	b 0x00abb550

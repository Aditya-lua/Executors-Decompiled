; PKCS12_key_gen_asc_ex @ 00aba468
00aba468	sub sp,sp,#0x70
00aba46c	stp x24,x23,[sp, #0x30]
00aba470	stp x22,x21,[sp, #0x40]
00aba474	stp x20,x19,[sp, #0x50]
00aba478	mov x19,x7
00aba47c	mov w20,w6
00aba480	mov w21,w5
00aba484	mov w22,w4
00aba488	mov w23,w3
00aba48c	mov x24,x2
00aba490	stp x29,x30,[sp, #0x60]
00aba494	add x29,sp,#0x60
00aba498	cbz x0,0x00aba4b8
00aba49c	add x2,sp,#0x28
00aba4a0	add x3,sp,#0x24
00aba4a4	bl 0x00c3f4c0
00aba4a8	cbz x0,0x00aba51c
00aba4ac	ldr x0,[sp, #0x28]
00aba4b0	ldr w1,[sp, #0x24]
00aba4b4	b 0x00aba4c4
00aba4b8	mov w1,wzr
00aba4bc	str xzr,[sp, #0x28]
00aba4c0	str wzr,[sp, #0x24]
00aba4c4	ldp x9,x8,[x29, #0x18]
00aba4c8	ldr x10,[x29, #0x10]
00aba4cc	mov x2,x24
00aba4d0	mov w3,w23
00aba4d4	mov w4,w22
00aba4d8	mov w5,w21
00aba4dc	mov w6,w20
00aba4e0	mov x7,x19
00aba4e4	stp x9,x8,[sp, #0x8]
00aba4e8	str x10,[sp]
00aba4ec	bl 0x00aba568
00aba4f0	ldr x8,[sp, #0x28]
00aba4f4	ldrsw x1,[sp, #0x24]
00aba4f8	adrp x2,0x2d2000
00aba4fc	mov w19,w0
00aba500	add x2,x2,#0x22c
00aba504	mov w3,#0x25
00aba508	mov x0,x8
00aba50c	bl 0x00c345e0
00aba510	cmp w19,#0x0
00aba514	cset w0,gt
00aba518	b 0x00aba550
00aba51c	bl 0x00c342a0
00aba520	adrp x0,0x2d2000
00aba524	adrp x2,0x2c6000
00aba528	add x0,x0,#0x22c
00aba52c	add x2,x2,#0x160
00aba530	mov w1,#0x20
00aba534	bl 0x00c342b0
00aba538	mov w1,#0x100
00aba53c	mov w0,#0x23
00aba540	movk w1,#0xc, LSL #16
00aba544	mov x2,xzr
00aba548	bl 0x00c342c0
00aba54c	mov w0,wzr
00aba550	ldp x29,x30,[sp, #0x60]
00aba554	ldp x20,x19,[sp, #0x50]
00aba558	ldp x22,x21,[sp, #0x40]
00aba55c	ldp x24,x23,[sp, #0x30]
00aba560	add sp,sp,#0x70
00aba564	ret

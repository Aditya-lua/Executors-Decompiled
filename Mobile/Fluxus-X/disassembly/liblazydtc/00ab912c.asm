; d2i_PKCS8PrivateKey_bio @ 00ab912c
00ab912c	str x28,[sp, #-0x40]!
00ab9130	stp x22,x21,[sp, #0x10]
00ab9134	stp x20,x19,[sp, #0x20]
00ab9138	stp x29,x30,[sp, #0x30]
00ab913c	add x29,sp,#0x30
00ab9140	sub sp,sp,#0x400
00ab9144	mov x19,x1
00ab9148	mov x1,xzr
00ab914c	mov x21,x3
00ab9150	mov x22,x2
00ab9154	bl 0x00c3f2e0
00ab9158	mov x20,x0
00ab915c	cbz x0,0x00ab922c
00ab9160	cbz x22,0x00ab91d8
00ab9164	mov x0,sp
00ab9168	mov w1,#0x400
00ab916c	mov w2,wzr
00ab9170	mov x3,x21
00ab9174	blr x22
00ab9178	mov w21,w0
00ab917c	tbnz w0,#0x1f,0x00ab91f4
00ab9180	mov x1,sp
00ab9184	mov x0,x20
00ab9188	mov w2,w21
00ab918c	bl 0x00c3f2b0
00ab9190	mov x22,x0
00ab9194	mov x0,x20
00ab9198	bl 0x00c382f0
00ab919c	sxtw x1,w21
00ab91a0	mov x0,sp
00ab91a4	bl 0x00c34750
00ab91a8	cbz x22,0x00ab9228
00ab91ac	mov x0,x22
00ab91b0	bl 0x00c3d0a0
00ab91b4	mov x20,x0
00ab91b8	mov x0,x22
00ab91bc	bl 0x00c37d00
00ab91c0	cbz x20,0x00ab922c
00ab91c4	cbz x19,0x00ab922c
00ab91c8	ldr x0,[x19]
00ab91cc	bl 0x00c32450
00ab91d0	str x20,[x19]
00ab91d4	b 0x00ab922c
00ab91d8	mov x0,sp
00ab91dc	mov w1,#0x400
00ab91e0	mov w2,wzr
00ab91e4	mov x3,x21
00ab91e8	bl 0x00c3f260
00ab91ec	mov w21,w0
00ab91f0	tbz w0,#0x1f,0x00ab9180
00ab91f4	bl 0x00c342a0
00ab91f8	adrp x0,0x2d6000
00ab91fc	adrp x2,0x2a0000
00ab9200	add x0,x0,#0x469
00ab9204	add x2,x2,#0xace
00ab9208	mov w1,#0xba
00ab920c	bl 0x00c342b0
00ab9210	mov w0,#0x9
00ab9214	mov w1,#0x68
00ab9218	mov x2,xzr
00ab921c	bl 0x00c342c0
00ab9220	mov x0,x20
00ab9224	bl 0x00c382f0
00ab9228	mov x20,xzr
00ab922c	mov x0,x20
00ab9230	add sp,sp,#0x400
00ab9234	ldp x29,x30,[sp, #0x30]
00ab9238	ldp x20,x19,[sp, #0x20]
00ab923c	ldp x22,x21,[sp, #0x10]
00ab9240	ldr x28,[sp], #0x40
00ab9244	ret

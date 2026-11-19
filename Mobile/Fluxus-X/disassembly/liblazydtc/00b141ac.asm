; X509_VERIFY_PARAM_set1_email @ 00b141ac
00b141ac	stp x22,x21,[sp, #-0x30]!
00b141b0	stp x20,x19,[sp, #0x10]
00b141b4	mov x19,x0
00b141b8	stp x29,x30,[sp, #0x20]
00b141bc	add x29,sp,#0x20
00b141c0	cbz x1,0x00b1420c
00b141c4	mov x20,x2
00b141c8	mov x21,x1
00b141cc	cbnz x2,0x00b141dc
00b141d0	mov x0,x21
00b141d4	bl 0x00c2ff50
00b141d8	mov x20,x0
00b141dc	adrp x1,0x2d8000
00b141e0	add x0,x20,#0x1
00b141e4	add x1,x1,#0xa44
00b141e8	mov w2,#0xf7
00b141ec	bl 0x00c32320
00b141f0	cbz x0,0x00b14230
00b141f4	mov x1,x21
00b141f8	mov x2,x20
00b141fc	mov x22,x0
00b14200	bl 0x00c2ffd0
00b14204	strb wzr,[x22, x20]
00b14208	b 0x00b14214
00b1420c	mov x20,xzr
00b14210	mov x22,xzr
00b14214	ldr x0,[x19, #0x50]
00b14218	adrp x1,0x2d8000
00b1421c	add x1,x1,#0xa44
00b14220	mov w2,#0x100
00b14224	bl 0x00c32310
00b14228	mov w0,#0x1
00b1422c	stp x22,x20,[x19, #0x50]
00b14230	ldp x29,x30,[sp, #0x20]
00b14234	ldp x20,x19,[sp, #0x10]
00b14238	ldp x22,x21,[sp], #0x30
00b1423c	ret

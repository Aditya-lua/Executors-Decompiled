; X509_keyid_set1 @ 00b1f1fc
00b1f1fc	stp x22,x21,[sp, #-0x30]!
00b1f200	mov x21,x0
00b1f204	stp x20,x19,[sp, #0x10]
00b1f208	stp x29,x30,[sp, #0x20]
00b1f20c	add x29,sp,#0x20
00b1f210	cbz x1,0x00b1f26c
00b1f214	cbz x21,0x00b1f294
00b1f218	ldr x22,[x21, #0x150]
00b1f21c	mov w19,w2
00b1f220	mov x20,x1
00b1f224	cbnz x22,0x00b1f240
00b1f228	adrp x0,0xc82000
00b1f22c	add x0,x0,#0xc60
00b1f230	bl 0x00c372e0
00b1f234	mov x22,x0
00b1f238	str x0,[x21, #0x150]
00b1f23c	cbz x0,0x00b1f298
00b1f240	ldr x0,[x22, #0x18]
00b1f244	cbnz x0,0x00b1f254
00b1f248	bl 0x00c38170
00b1f24c	str x0,[x22, #0x18]
00b1f250	cbz x0,0x00b1f298
00b1f254	mov x1,x20
00b1f258	mov w2,w19
00b1f25c	ldp x29,x30,[sp, #0x20]
00b1f260	ldp x20,x19,[sp, #0x10]
00b1f264	ldp x22,x21,[sp], #0x30
00b1f268	b 0x00c378a0
00b1f26c	cbz x21,0x00b1f28c
00b1f270	ldr x8,[x21, #0x150]
00b1f274	cbz x8,0x00b1f28c
00b1f278	ldr x0,[x8, #0x18]
00b1f27c	cbz x0,0x00b1f28c
00b1f280	bl 0x00c35530
00b1f284	ldr x8,[x21, #0x150]
00b1f288	str xzr,[x8, #0x18]
00b1f28c	mov w0,#0x1
00b1f290	b 0x00b1f298
00b1f294	mov w0,wzr
00b1f298	ldp x29,x30,[sp, #0x20]
00b1f29c	ldp x20,x19,[sp, #0x10]
00b1f2a0	ldp x22,x21,[sp], #0x30
00b1f2a4	ret

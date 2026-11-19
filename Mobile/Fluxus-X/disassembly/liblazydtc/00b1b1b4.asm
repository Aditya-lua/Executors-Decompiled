; X509_CRL_new_ex @ 00b1b1b4
00b1b1b4	str x21,[sp, #-0x30]!
00b1b1b8	mov x21,x0
00b1b1bc	adrp x0,0xc82000
00b1b1c0	add x0,x0,#0xf8
00b1b1c4	stp x20,x19,[sp, #0x10]
00b1b1c8	stp x29,x30,[sp, #0x20]
00b1b1cc	add x29,sp,#0x20
00b1b1d0	mov x20,x1
00b1b1d4	bl 0x00c372e0
00b1b1d8	mov x19,x0
00b1b1dc	cbz x0,0x00b1b230
00b1b1e0	ldr x0,[x19, #0xf0]
00b1b1e4	adrp x1,0x2d6000
00b1b1e8	add x1,x1,#0x879
00b1b1ec	mov w2,#0x20d
00b1b1f0	str x21,[x19, #0xe8]
00b1b1f4	bl 0x00c32310
00b1b1f8	str xzr,[x19, #0xf0]
00b1b1fc	cbz x20,0x00b1b230
00b1b200	adrp x1,0x2d6000
00b1b204	add x1,x1,#0x879
00b1b208	mov w2,#0x210
00b1b20c	mov x0,x20
00b1b210	bl 0x00c34600
00b1b214	str x0,[x19, #0xf0]
00b1b218	cbnz x0,0x00b1b230
00b1b21c	adrp x1,0xc82000
00b1b220	add x1,x1,#0xf8
00b1b224	mov x0,x19
00b1b228	bl 0x00c36160
00b1b22c	mov x19,xzr
00b1b230	mov x0,x19
00b1b234	ldp x29,x30,[sp, #0x20]
00b1b238	ldp x20,x19,[sp, #0x10]
00b1b23c	ldr x21,[sp], #0x30
00b1b240	ret

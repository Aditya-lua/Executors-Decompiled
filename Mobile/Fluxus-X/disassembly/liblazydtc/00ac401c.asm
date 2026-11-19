; ossl_method_store_new @ 00ac401c
00ac401c	stp x20,x19,[sp, #-0x20]!
00ac4020	adrp x1,0x2ca000
00ac4024	mov x20,x0
00ac4028	add x1,x1,#0x2a4
00ac402c	orr w0,wzr,#0x30
00ac4030	orr w2,wzr,#0xfc
00ac4034	stp x29,x30,[sp, #0x10]
00ac4038	add x29,sp,#0x10
00ac403c	bl 0x00c34250
00ac4040	mov x19,x0
00ac4044	cbz x0,0x00ac40b8
00ac4048	str x20,[x19]
00ac404c	bl 0x00c3ec80
00ac4050	str x0,[x19, #0x8]
00ac4054	cbz x0,0x00ac4070
00ac4058	bl 0x00c34d50
00ac405c	str x0,[x19, #0x10]
00ac4060	cbz x0,0x00ac4070
00ac4064	bl 0x00c34d50
00ac4068	str x0,[x19, #0x18]
00ac406c	cbnz x0,0x00ac40b8
00ac4070	ldr x0,[x19, #0x8]
00ac4074	cbz x0,0x00ac408c
00ac4078	adrp x1,0xac4000
00ac407c	add x1,x1,#0x12c
00ac4080	mov x2,x19
00ac4084	bl 0x00c3ec50
00ac4088	ldr x0,[x19, #0x8]
00ac408c	bl 0x00c3ec60
00ac4090	ldr x0,[x19, #0x10]
00ac4094	bl 0x00c34d40
00ac4098	ldr x0,[x19, #0x18]
00ac409c	bl 0x00c34d40
00ac40a0	adrp x1,0x2ca000
00ac40a4	add x1,x1,#0x2a4
00ac40a8	mov w2,#0x111
00ac40ac	mov x0,x19
00ac40b0	bl 0x00c32310
00ac40b4	mov x19,xzr
00ac40b8	ldp x29,x30,[sp, #0x10]
00ac40bc	mov x0,x19
00ac40c0	ldp x20,x19,[sp], #0x20
00ac40c4	ret

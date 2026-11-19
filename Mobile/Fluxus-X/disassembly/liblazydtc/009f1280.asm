; ASN1_STRING_type_new @ 009f1280
009f1280	str x19,[sp, #-0x20]!
009f1284	adrp x1,0x2c7000
009f1288	mov w19,w0
009f128c	add x1,x1,#0x722
009f1290	orr w0,wzr,#0x18
009f1294	mov w2,#0x15e
009f1298	stp x29,x30,[sp, #0x10]
009f129c	add x29,sp,#0x10
009f12a0	bl 0x00c34250
009f12a4	cbz x0,0x009f12b0
009f12a8	str w19,[x0, #0x4]
009f12ac	b 0x009f12e4
009f12b0	bl 0x00c342a0
009f12b4	adrp x0,0x2c7000
009f12b8	adrp x2,0x2a5000
009f12bc	add x0,x0,#0x722
009f12c0	add x2,x2,#0xc2a
009f12c4	mov w1,#0x160
009f12c8	bl 0x00c342b0
009f12cc	mov w1,#0x100
009f12d0	mov w0,#0xd
009f12d4	movk w1,#0xc, LSL #16
009f12d8	mov x2,xzr
009f12dc	bl 0x00c342c0
009f12e0	mov x0,xzr
009f12e4	ldp x29,x30,[sp, #0x10]
009f12e8	ldr x19,[sp], #0x20
009f12ec	ret

; ASN1_STRING_new @ 009f1170
009f1170	stp x29,x30,[sp, #-0x10]!
009f1174	adrp x1,0x2c7000
009f1178	add x1,x1,#0x722
009f117c	orr w0,wzr,#0x18
009f1180	mov w2,#0x15e
009f1184	mov x29,sp
009f1188	bl 0x00c34250
009f118c	cbz x0,0x009f11a0
009f1190	mov w8,#0x4
009f1194	str w8,[x0, #0x4]
009f1198	ldp x29,x30,[sp], #0x10
009f119c	ret
009f11a0	bl 0x00c342a0
009f11a4	adrp x0,0x2c7000
009f11a8	adrp x2,0x2a5000
009f11ac	add x0,x0,#0x722
009f11b0	add x2,x2,#0xc2a
009f11b4	mov w1,#0x160
009f11b8	bl 0x00c342b0
009f11bc	mov w1,#0x100
009f11c0	mov w0,#0xd
009f11c4	movk w1,#0xc, LSL #16
009f11c8	mov x2,xzr
009f11cc	bl 0x00c342c0
009f11d0	mov x0,xzr
009f11d4	ldp x29,x30,[sp], #0x10
009f11d8	ret

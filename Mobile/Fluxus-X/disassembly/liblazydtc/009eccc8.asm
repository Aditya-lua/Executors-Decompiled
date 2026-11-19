; ASN1_OBJECT_new @ 009eccc8
009eccc8	stp x29,x30,[sp, #-0x10]!
009ecccc	adrp x1,0x2b7000
009eccd0	add x1,x1,#0x892
009eccd4	mov w0,#0x28
009eccd8	mov w2,#0x15b
009eccdc	mov x29,sp
009ecce0	bl 0x00c34250
009ecce4	cbz x0,0x009eccf8
009ecce8	mov w8,#0x1
009eccec	str w8,[x0, #0x20]
009eccf0	ldp x29,x30,[sp], #0x10
009eccf4	ret
009eccf8	bl 0x00c342a0
009eccfc	adrp x0,0x2b7000
009ecd00	adrp x2,0x2c3000
009ecd04	add x0,x0,#0x892
009ecd08	add x2,x2,#0x693
009ecd0c	mov w1,#0x15d
009ecd10	bl 0x00c342b0
009ecd14	mov w1,#0x100
009ecd18	mov w0,#0xd
009ecd1c	movk w1,#0xc, LSL #16
009ecd20	mov x2,xzr
009ecd24	bl 0x00c342c0
009ecd28	mov x0,xzr
009ecd2c	ldp x29,x30,[sp], #0x10
009ecd30	ret

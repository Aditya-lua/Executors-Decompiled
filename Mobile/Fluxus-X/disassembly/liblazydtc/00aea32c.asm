; OSSL_STORE_INFO_new_PARAMS @ 00aea32c
00aea32c	str x19,[sp, #-0x20]!
00aea330	adrp x1,0x2c2000
00aea334	mov x19,x0
00aea338	add x1,x1,#0x3bd
00aea33c	orr w0,wzr,#0x18
00aea340	mov w2,#0x220
00aea344	stp x29,x30,[sp, #0x10]
00aea348	add x29,sp,#0x10
00aea34c	bl 0x00c34250
00aea350	cbz x0,0x00aea364
00aea354	mov w8,#0x2
00aea358	str w8,[x0]
00aea35c	str x19,[x0, #0x8]
00aea360	b 0x00aea398
00aea364	bl 0x00c342a0
00aea368	adrp x0,0x2c2000
00aea36c	adrp x2,0x2c4000
00aea370	add x0,x0,#0x3bd
00aea374	add x2,x2,#0x26d
00aea378	mov w1,#0x249
00aea37c	bl 0x00c342b0
00aea380	mov w1,#0x100
00aea384	mov w0,#0x2c
00aea388	movk w1,#0xc, LSL #16
00aea38c	mov x2,xzr
00aea390	bl 0x00c342c0
00aea394	mov x0,xzr
00aea398	ldp x29,x30,[sp, #0x10]
00aea39c	ldr x19,[sp], #0x20
00aea3a0	ret

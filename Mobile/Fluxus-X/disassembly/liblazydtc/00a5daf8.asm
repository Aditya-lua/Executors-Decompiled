; EVP_default_properties_is_fips_enabled @ 00a5daf8
00a5daf8	str x19,[sp, #-0x20]!
00a5dafc	mov w1,#0x1
00a5db00	stp x29,x30,[sp, #0x10]
00a5db04	add x29,sp,#0x10
00a5db08	mov x19,x0
00a5db0c	bl 0x00c3cde0
00a5db10	cbz x0,0x00a5db30
00a5db14	ldr x2,[x0]
00a5db18	adrp x1,0x2dc000
00a5db1c	add x1,x1,#0x37
00a5db20	mov x0,x19
00a5db24	bl 0x00c3ce20
00a5db28	cmp w0,#0x0
00a5db2c	cset w0,ne
00a5db30	ldp x29,x30,[sp, #0x10]
00a5db34	ldr x19,[sp], #0x20
00a5db38	ret

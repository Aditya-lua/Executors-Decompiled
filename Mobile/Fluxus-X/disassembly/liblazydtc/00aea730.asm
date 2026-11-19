; OSSL_STORE_INFO_get1_PARAMS @ 00aea730
00aea730	str x19,[sp, #-0x20]!
00aea734	stp x29,x30,[sp, #0x10]
00aea738	ldr w8,[x0]
00aea73c	add x29,sp,#0x10
00aea740	cmp w8,#0x2
00aea744	b.ne 0x00aea75c
00aea748	mov x19,x0
00aea74c	ldr x0,[x0, #0x8]
00aea750	bl 0x00c34730
00aea754	ldr x0,[x19, #0x8]
00aea758	b 0x00aea78c
00aea75c	bl 0x00c342a0
00aea760	adrp x0,0x2c2000
00aea764	adrp x2,0x2c8000
00aea768	add x0,x0,#0x3bd
00aea76c	add x2,x2,#0x2c0
00aea770	mov w1,#0x2b6
00aea774	bl 0x00c342b0
00aea778	mov w0,#0x2c
00aea77c	mov w1,#0x68
00aea780	mov x2,xzr
00aea784	bl 0x00c342c0
00aea788	mov x0,xzr
00aea78c	ldp x29,x30,[sp, #0x10]
00aea790	ldr x19,[sp], #0x20
00aea794	ret

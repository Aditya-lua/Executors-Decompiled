; OSSL_PROVIDER_add_builtin @ 00aa190c
00aa190c	sub sp,sp,#0x50
00aa1910	stp x20,x19,[sp, #0x30]
00aa1914	stp x29,x30,[sp, #0x40]
00aa1918	add x29,sp,#0x40
00aa191c	cbz x1,0x00aa1970
00aa1920	mov x20,x2
00aa1924	cbz x2,0x00aa1970
00aa1928	adrp x8,0x2d8000
00aa192c	add x8,x8,#0x265
00aa1930	mov x19,x0
00aa1934	movi v0.2D,#0x0
00aa1938	mov w2,#0x7d
00aa193c	mov x0,x1
00aa1940	mov x1,x8
00aa1944	stp q0,q0,[sp, #0x10]
00aa1948	bl 0x00c34600
00aa194c	str x0,[sp, #0x8]
00aa1950	cbz x0,0x00aa19a0
00aa1954	add x1,sp,#0x8
00aa1958	mov x0,x19
00aa195c	str x20,[sp, #0x18]
00aa1960	bl 0x00c3eaf0
00aa1964	cbz w0,0x00aa19e4
00aa1968	mov w0,#0x1
00aa196c	b 0x00aa19d4
00aa1970	bl 0x00c342a0
00aa1974	adrp x0,0x2d8000
00aa1978	adrp x2,0x2ae000
00aa197c	add x0,x0,#0x265
00aa1980	add x2,x2,#0x93
00aa1984	mov w1,#0x79
00aa1988	bl 0x00c342b0
00aa198c	mov w8,#0x100
00aa1990	movk w8,#0xc, LSL #16
00aa1994	add w1,w8,#0x2
00aa1998	orr w0,wzr,#0xf
00aa199c	b 0x00aa19c8
00aa19a0	bl 0x00c342a0
00aa19a4	adrp x0,0x2d8000
00aa19a8	adrp x2,0x2ae000
00aa19ac	add x0,x0,#0x265
00aa19b0	add x2,x2,#0x93
00aa19b4	orr w1,wzr,#0x7f
00aa19b8	bl 0x00c342b0
00aa19bc	mov w1,#0x100
00aa19c0	orr w0,wzr,#0xf
00aa19c4	movk w1,#0xc, LSL #16
00aa19c8	mov x2,xzr
00aa19cc	bl 0x00c342c0
00aa19d0	mov w0,wzr
00aa19d4	ldp x29,x30,[sp, #0x40]
00aa19d8	ldp x20,x19,[sp, #0x30]
00aa19dc	add sp,sp,#0x50
00aa19e0	ret
00aa19e4	add x0,sp,#0x8
00aa19e8	bl 0x00c3eb00
00aa19ec	b 0x00aa19d0

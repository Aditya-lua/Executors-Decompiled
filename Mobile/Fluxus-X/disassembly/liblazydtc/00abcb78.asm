; PKCS12_SAFEBAG_create0_pkcs8 @ 00abcb78
00abcb78	stp x20,x19,[sp, #-0x20]!
00abcb7c	stp x29,x30,[sp, #0x10]
00abcb80	add x29,sp,#0x10
00abcb84	mov x20,x0
00abcb88	bl 0x00c3f420
00abcb8c	mov x19,x0
00abcb90	cbz x0,0x00abcba4
00abcb94	mov w0,#0x97
00abcb98	bl 0x00c37740
00abcb9c	stp x0,x20,[x19]
00abcba0	b 0x00abcbd4
00abcba4	bl 0x00c342a0
00abcba8	adrp x0,0x2a8000
00abcbac	adrp x2,0x2c0000
00abcbb0	add x0,x0,#0x6fe
00abcbb4	add x2,x2,#0x440
00abcbb8	mov w1,#0xc1
00abcbbc	bl 0x00c342b0
00abcbc0	mov w1,#0x100
00abcbc4	mov w0,#0x23
00abcbc8	movk w1,#0xc, LSL #16
00abcbcc	mov x2,xzr
00abcbd0	bl 0x00c342c0
00abcbd4	ldp x29,x30,[sp, #0x10]
00abcbd8	mov x0,x19
00abcbdc	ldp x20,x19,[sp], #0x20
00abcbe0	ret

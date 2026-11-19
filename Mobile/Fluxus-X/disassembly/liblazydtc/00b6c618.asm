; mbedtls_chacha20_init @ 00b6c618
00b6c618	stp x20,x19,[sp, #-0x20]!
00b6c61c	stp x29,x30,[sp, #0x10]
00b6c620	add x29,sp,#0x10
00b6c624	mov w1,#0x40
00b6c628	mov x19,x0
00b6c62c	mov w20,#0x40
00b6c630	bl 0x00c42220
00b6c634	add x0,x19,#0x40
00b6c638	mov w1,#0x40
00b6c63c	bl 0x00c42220
00b6c640	str x20,[x19, #0x80]
00b6c644	ldp x29,x30,[sp, #0x10]
00b6c648	ldp x20,x19,[sp], #0x20
00b6c64c	ret

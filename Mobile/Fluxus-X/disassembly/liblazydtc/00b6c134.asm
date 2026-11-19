; mbedtls_ccm_star_auth_decrypt @ 00b6c134
00b6c134	sub sp,sp,#0x30
00b6c138	stp x29,x30,[sp, #0x20]
00b6c13c	add x29,sp,#0x20
00b6c140	ldp x9,x10,[x29, #0x10]
00b6c144	mov x8,x6
00b6c148	mov x6,x5
00b6c14c	mov x5,x4
00b6c150	mov x4,x3
00b6c154	mov x3,x2
00b6c158	mov x2,x1
00b6c15c	mov w1,#0x2
00b6c160	str x7,[sp]
00b6c164	mov x7,x8
00b6c168	stp x9,x10,[sp, #0x8]
00b6c16c	bl 0x00b6c17c
00b6c170	ldp x29,x30,[sp, #0x20]
00b6c174	add sp,sp,#0x30
00b6c178	ret

; PKCS12_SAFEBAG_create_crl @ 00abc924
00abc924	str x19,[sp, #-0x20]!
00abc928	stp x29,x30,[sp, #0x10]
00abc92c	add x29,sp,#0x10
00abc930	mov x19,x0
00abc934	bl 0x00c3f5f0
00abc938	ldp x29,x30,[sp, #0x10]
00abc93c	mov w2,#0xa0
00abc940	mov w3,#0x99
00abc944	mov x1,x0
00abc948	mov x0,x19
00abc94c	ldr x19,[sp], #0x20
00abc950	b 0x00c3f380

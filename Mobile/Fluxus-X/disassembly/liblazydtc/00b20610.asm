; ossl_prov_digest_fetch @ 00b20610
00b20610	stp x22,x21,[sp, #-0x30]!
00b20614	stp x20,x19,[sp, #0x10]
00b20618	stp x29,x30,[sp, #0x20]
00b2061c	mov x21,x0
00b20620	ldr x0,[x0, #0x8]
00b20624	add x29,sp,#0x20
00b20628	mov x19,x3
00b2062c	mov x20,x2
00b20630	mov x22,x1
00b20634	bl 0x00c35800
00b20638	mov x0,x22
00b2063c	mov x1,x20
00b20640	mov x2,x19
00b20644	bl 0x00c357f0
00b20648	stp x0,x0,[x21]
00b2064c	ldp x29,x30,[sp, #0x20]
00b20650	ldp x20,x19,[sp, #0x10]
00b20654	ldp x22,x21,[sp], #0x30
00b20658	ret

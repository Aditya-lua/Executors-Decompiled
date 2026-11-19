; ossl_ec_GFp_mont_field_sqr @ 00a37a98
00a37a98	mov x4,x3
00a37a9c	ldr x3,[x0, #0x78]
00a37aa0	cbz x3,0x00a37ab0
00a37aa4	mov x0,x1
00a37aa8	mov x1,x2
00a37aac	b 0x00c38d60
00a37ab0	stp x29,x30,[sp, #-0x10]!
00a37ab4	mov x29,sp
00a37ab8	bl 0x00c342a0
00a37abc	adrp x0,0x2bf000
00a37ac0	adrp x2,0x2a3000
00a37ac4	add x0,x0,#0xbb4
00a37ac8	add x2,x2,#0xf8b
00a37acc	mov w1,#0xd3
00a37ad0	bl 0x00c342b0
00a37ad4	mov w0,#0x10
00a37ad8	mov w1,#0x6f
00a37adc	mov x2,xzr
00a37ae0	bl 0x00c342c0
00a37ae4	mov w0,wzr
00a37ae8	ldp x29,x30,[sp], #0x10
00a37aec	ret

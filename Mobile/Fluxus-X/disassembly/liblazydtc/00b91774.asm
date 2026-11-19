; mbedtls_ecp_curve_info_from_grp_id @ 00b91774
00b91774	sub w8,w0,#0x1
00b91778	cmp w8,#0xc
00b9177c	b.hi 0x00b91790
00b91780	adrp x9,0xca8000
00b91784	add x9,x9,#0x660
00b91788	ldr x0,[x9, w8, SXTW #0x3]
00b9178c	ret
00b91790	mov x0,xzr
00b91794	ret

; ossl_policy_cache_find_data @ 00b13604
00b13604	sub sp,sp,#0x40
00b13608	stp x29,x30,[sp, #0x30]
00b1360c	str x1,[sp, #0x8]
00b13610	str x19,[sp, #0x20]
00b13614	mov x19,x0
00b13618	ldr x0,[x0, #0x8]
00b1361c	mov x1,sp
00b13620	add x29,sp,#0x30
00b13624	bl 0x00c34760
00b13628	ldr x8,[x19, #0x8]
00b1362c	mov w1,w0
00b13630	mov x0,x8
00b13634	bl 0x00c32610
00b13638	ldp x29,x30,[sp, #0x30]
00b1363c	ldr x19,[sp, #0x20]
00b13640	add sp,sp,#0x40
00b13644	ret

; X509_policy_level_get0_node @ 00b13178
00b13178	cbz x0,0x00b131ac
00b1317c	ldr x8,[x0, #0x10]
00b13180	cbz x8,0x00b1318c
00b13184	cbz w1,0x00b131a4
00b13188	sub w1,w1,#0x1
00b1318c	stp x29,x30,[sp, #-0x10]!
00b13190	ldr x0,[x0, #0x8]
00b13194	mov x29,sp
00b13198	bl 0x00c32610
00b1319c	mov x8,x0
00b131a0	ldp x29,x30,[sp], #0x10
00b131a4	mov x0,x8
00b131a8	ret
00b131ac	mov x0,xzr
00b131b0	ret

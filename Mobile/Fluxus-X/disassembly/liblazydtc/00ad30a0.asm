; ossl_rsa_multip_info_free @ 00ad30a0
00ad30a0	str x19,[sp, #-0x20]!
00ad30a4	stp x29,x30,[sp, #0x10]
00ad30a8	mov x19,x0
00ad30ac	ldr x0,[x0]
00ad30b0	add x29,sp,#0x10
00ad30b4	bl 0x00c322e0
00ad30b8	ldr x0,[x19, #0x8]
00ad30bc	bl 0x00c322e0
00ad30c0	ldr x0,[x19, #0x10]
00ad30c4	bl 0x00c322e0
00ad30c8	ldr x0,[x19, #0x18]
00ad30cc	bl 0x00c322e0
00ad30d0	ldp x29,x30,[sp, #0x10]
00ad30d4	adrp x1,0x2a2000
00ad30d8	add x1,x1,#0xc80
00ad30dc	mov w2,#0x13
00ad30e0	mov x0,x19
00ad30e4	ldr x19,[sp], #0x20
00ad30e8	b 0x00c32310

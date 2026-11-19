; err_shelve_state @ 00a54e90
00a54e90	stp x22,x21,[sp, #-0x30]!
00a54e94	stp x20,x19,[sp, #0x10]
00a54e98	stp x29,x30,[sp, #0x20]
00a54e9c	add x29,sp,#0x20
00a54ea0	mov x20,x0
00a54ea4	bl 0x00c30710
00a54ea8	ldr w22,[x0]
00a54eac	mov x19,x0
00a54eb0	mov w0,#0x40000
00a54eb4	mov x1,xzr
00a54eb8	bl 0x00c35500
00a54ebc	cbz w0,0x00a54f14
00a54ec0	adrp x0,0xd21000
00a54ec4	adrp x1,0xa54000
00a54ec8	add x0,x0,#0xb38
00a54ecc	add x1,x1,#0xcdc
00a54ed0	bl 0x00c34d60
00a54ed4	cbz w0,0x00a54f14
00a54ed8	adrp x8,0xd21000
00a54edc	ldr w8,[x8, #0xb3c]
00a54ee0	mov w0,wzr
00a54ee4	cbz w8,0x00a54f14
00a54ee8	adrp x21,0xd21000
00a54eec	add x21,x21,#0xa1c
00a54ef0	mov x0,x21
00a54ef4	bl 0x00c38360
00a54ef8	str x0,[x20]
00a54efc	mov x1,#-0x1
00a54f00	mov x0,x21
00a54f04	bl 0x00c38380
00a54f08	cbz w0,0x00a54f14
00a54f0c	mov w0,#0x1
00a54f10	str w22,[x19]
00a54f14	ldp x29,x30,[sp, #0x20]
00a54f18	ldp x20,x19,[sp, #0x10]
00a54f1c	ldp x22,x21,[sp], #0x30
00a54f20	ret

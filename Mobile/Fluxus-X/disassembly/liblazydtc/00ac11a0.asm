; PKCS7_get_issuer_and_serial @ 00ac11a0
00ac11a0	stp x20,x19,[sp, #-0x20]!
00ac11a4	stp x29,x30,[sp, #0x10]
00ac11a8	mov x20,x0
00ac11ac	ldr x0,[x0, #0x18]
00ac11b0	add x29,sp,#0x10
00ac11b4	mov w19,w1
00ac11b8	bl 0x00c37750
00ac11bc	cmp w0,#0x18
00ac11c0	mov x0,xzr
00ac11c4	b.ne 0x00ac1204
00ac11c8	ldr x8,[x20, #0x20]
00ac11cc	cbz x8,0x00ac1200
00ac11d0	ldr x20,[x8, #0x30]
00ac11d4	cbz x20,0x00ac1200
00ac11d8	mov x0,x20
00ac11dc	bl 0x00c325e0
00ac11e0	cmp w0,w19
00ac11e4	mov x0,xzr
00ac11e8	b.le 0x00ac1204
00ac11ec	mov x0,x20
00ac11f0	mov w1,w19
00ac11f4	bl 0x00c32610
00ac11f8	ldr x0,[x0, #0x8]
00ac11fc	b 0x00ac1204
00ac1200	mov x0,xzr
00ac1204	ldp x29,x30,[sp, #0x10]
00ac1208	ldp x20,x19,[sp], #0x20
00ac120c	ret

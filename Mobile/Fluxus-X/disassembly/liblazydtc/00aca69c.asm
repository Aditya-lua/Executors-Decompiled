; ossl_rand_pool_free @ 00aca69c
00aca69c	cbz x0,0x00aca6dc
00aca6a0	str x19,[sp, #-0x20]!
00aca6a4	stp x29,x30,[sp, #0x10]
00aca6a8	ldr w8,[x0, #0x10]
00aca6ac	mov x19,x0
00aca6b0	add x29,sp,#0x10
00aca6b4	cbnz w8,0x00aca6e8
00aca6b8	ldr w8,[x19, #0x14]
00aca6bc	ldr x0,[x19]
00aca6c0	ldr x1,[x19, #0x28]
00aca6c4	adrp x2,0x29e000
00aca6c8	add x2,x2,#0x966
00aca6cc	cbz w8,0x00aca6e0
00aca6d0	mov w3,#0x6b
00aca6d4	bl 0x00c38e10
00aca6d8	b 0x00aca6e8
00aca6dc	ret
00aca6e0	mov w3,#0x6d
00aca6e4	bl 0x00c345e0
00aca6e8	ldp x29,x30,[sp, #0x10]
00aca6ec	adrp x1,0x29e000
00aca6f0	add x1,x1,#0x966
00aca6f4	orr w2,wzr,#0x70
00aca6f8	mov x0,x19
00aca6fc	ldr x19,[sp], #0x20
00aca700	b 0x00c32310

; ossl_prov_digest_copy @ 00b205a8
00b205a8	stp x20,x19,[sp, #-0x20]!
00b205ac	stp x29,x30,[sp, #0x10]
00b205b0	ldr x8,[x1, #0x8]
00b205b4	mov x19,x1
00b205b8	mov x20,x0
00b205bc	add x29,sp,#0x10
00b205c0	cbz x8,0x00b205d0
00b205c4	mov x0,x8
00b205c8	bl 0x00c35820
00b205cc	cbz w0,0x00b20604
00b205d0	ldr x0,[x19, #0x10]
00b205d4	cbz x0,0x00b205e4
00b205d8	bl 0x00c323b0
00b205dc	cbz w0,0x00b205f8
00b205e0	ldr x0,[x19, #0x10]
00b205e4	str x0,[x20, #0x10]
00b205e8	ldr q0,[x19]
00b205ec	mov w0,#0x1
00b205f0	str q0,[x20]
00b205f4	b 0x00b20604
00b205f8	ldr x0,[x19, #0x8]
00b205fc	bl 0x00c35800
00b20600	mov w0,wzr
00b20604	ldp x29,x30,[sp, #0x10]
00b20608	ldp x20,x19,[sp], #0x20
00b2060c	ret

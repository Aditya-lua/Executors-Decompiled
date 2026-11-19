; OSSL_ENCODER_names_do_all @ 00a61000
00a61000	str x21,[sp, #-0x30]!
00a61004	stp x20,x19,[sp, #0x10]
00a61008	stp x29,x30,[sp, #0x20]
00a6100c	add x29,sp,#0x20
00a61010	cbz x0,0x00a61050
00a61014	mov x21,x0
00a61018	ldr x0,[x0]
00a6101c	cbz x0,0x00a6104c
00a61020	mov x19,x2
00a61024	mov x20,x1
00a61028	bl 0x00c3b2f0
00a6102c	bl 0x00c3b650
00a61030	ldr w1,[x21, #0x8]
00a61034	mov x2,x20
00a61038	mov x3,x19
00a6103c	ldp x29,x30,[sp, #0x20]
00a61040	ldp x20,x19,[sp, #0x10]
00a61044	ldr x21,[sp], #0x30
00a61048	b 0x00c3b610
00a6104c	mov w0,#0x1
00a61050	ldp x29,x30,[sp, #0x20]
00a61054	ldp x20,x19,[sp, #0x10]
00a61058	ldr x21,[sp], #0x30
00a6105c	ret

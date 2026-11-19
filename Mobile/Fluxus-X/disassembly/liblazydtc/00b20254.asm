; ossl_prov_get_nonce @ 00b20254
00b20254	str x23,[sp, #-0x40]!
00b20258	stp x22,x21,[sp, #0x10]
00b2025c	stp x20,x19,[sp, #0x20]
00b20260	stp x29,x30,[sp, #0x30]
00b20264	adrp x8,0xd23000
00b20268	mov x23,x1
00b2026c	ldr x1,[x8, #0x818]
00b20270	add x29,sp,#0x30
00b20274	cbz x1,0x00b202bc
00b20278	mov x19,x5
00b2027c	mov x20,x4
00b20280	mov x21,x3
00b20284	mov x22,x2
00b20288	str x1,[sp, #0x8]
00b2028c	bl 0x00c410c0
00b20290	mov x2,x22
00b20294	mov x3,x21
00b20298	mov x4,x20
00b2029c	mov x5,x19
00b202a0	ldr x6,[sp, #0x8]
00b202a4	ldp x29,x30,[sp, #0x30]
00b202a8	ldp x20,x19,[sp, #0x20]
00b202ac	ldp x22,x21,[sp, #0x10]
00b202b0	mov x1,x23
00b202b4	ldr x23,[sp], #0x40
00b202b8	br x6
00b202bc	ldp x29,x30,[sp, #0x30]
00b202c0	ldp x20,x19,[sp, #0x20]
00b202c4	ldp x22,x21,[sp, #0x10]
00b202c8	mov x0,xzr
00b202cc	ldr x23,[sp], #0x40
00b202d0	ret

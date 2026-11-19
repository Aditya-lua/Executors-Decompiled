; ossl_policy_cache_free @ 00b131e0
00b131e0	cbz x0,0x00b13228
00b131e4	str x19,[sp, #-0x20]!
00b131e8	stp x29,x30,[sp, #0x10]
00b131ec	mov x19,x0
00b131f0	ldr x0,[x0]
00b131f4	add x29,sp,#0x10
00b131f8	bl 0x00c40560
00b131fc	adrp x1,0xcb5000
00b13200	ldr x0,[x19, #0x8]
00b13204	ldr x1,[x1, #0x800]
00b13208	bl 0x00c32600
00b1320c	ldp x29,x30,[sp, #0x10]
00b13210	adrp x1,0x2a4000
00b13214	add x1,x1,#0xb60
00b13218	mov w2,#0xb8
00b1321c	mov x0,x19
00b13220	ldr x19,[sp], #0x20
00b13224	b 0x00c32310
00b13228	ret

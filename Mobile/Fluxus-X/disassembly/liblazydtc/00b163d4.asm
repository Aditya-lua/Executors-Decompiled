; X509_pubkey_digest @ 00b163d4
00b163d4	str x21,[sp, #-0x30]!
00b163d8	stp x20,x19,[sp, #0x10]
00b163dc	stp x29,x30,[sp, #0x20]
00b163e0	add x29,sp,#0x20
00b163e4	mov x19,x3
00b163e8	mov x21,x2
00b163ec	mov x20,x1
00b163f0	bl 0x00c3f050
00b163f4	cbz x0,0x00b16424
00b163f8	ldr x8,[x0, #0x8]
00b163fc	ldrsw x1,[x0]
00b16400	mov x3,x19
00b16404	mov x4,x20
00b16408	ldp x29,x30,[sp, #0x20]
00b1640c	ldp x20,x19,[sp, #0x10]
00b16410	mov x0,x8
00b16414	mov x2,x21
00b16418	mov x5,xzr
00b1641c	ldr x21,[sp], #0x30
00b16420	b 0x00c370c0
00b16424	ldp x29,x30,[sp, #0x20]
00b16428	ldp x20,x19,[sp, #0x10]
00b1642c	ldr x21,[sp], #0x30
00b16430	ret

; ossl_namemap_free @ 00a82dd8
00a82dd8	str x19,[sp, #-0x20]!
00a82ddc	stp x29,x30,[sp, #0x10]
00a82de0	add x29,sp,#0x10
00a82de4	cbz x0,0x00a82e30
00a82de8	ldrb w8,[x0]
00a82dec	mov x19,x0
00a82df0	tbnz w8,#0x0,0x00a82e30
00a82df4	ldr x0,[x19, #0x10]
00a82df8	adrp x1,0xa82000
00a82dfc	add x1,x1,#0xe3c
00a82e00	bl 0x00c395e0
00a82e04	ldr x0,[x19, #0x10]
00a82e08	bl 0x00c34db0
00a82e0c	ldr x0,[x19, #0x8]
00a82e10	bl 0x00c34d40
00a82e14	ldp x29,x30,[sp, #0x10]
00a82e18	adrp x1,0x2bd000
00a82e1c	add x1,x1,#0xc0d
00a82e20	mov w2,#0x215
00a82e24	mov x0,x19
00a82e28	ldr x19,[sp], #0x20
00a82e2c	b 0x00c32310
00a82e30	ldp x29,x30,[sp, #0x10]
00a82e34	ldr x19,[sp], #0x20
00a82e38	ret

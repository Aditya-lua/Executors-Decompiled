; FUN_00956fac @ 00956fac
00956fac	stp x20,x19,[sp, #-0x20]!
00956fb0	stp x29,x30,[sp, #0x10]
00956fb4	add x29,sp,#0x10
00956fb8	ldr x8,[x0, #0x20]
00956fbc	mov x19,x0
00956fc0	mov x0,x2
00956fc4	add x20,x8,#0x428
00956fc8	bl 0x009252a8
00956fcc	ldp x29,x30,[sp, #0x10]
00956fd0	adrp x2,0x2b6000
00956fd4	add x2,x2,#0xc62
00956fd8	mov x3,x0
00956fdc	mov x0,x19
00956fe0	mov x1,x20
00956fe4	ldp x20,x19,[sp], #0x20
00956fe8	b 0x009453ec

; FUN_00b2c55c @ 00b2c55c
00b2c55c	stp x20,x19,[sp, #-0x20]!
00b2c560	add x20,x0,#0xc0
00b2c564	mov x19,x0
00b2c568	mov x0,x1
00b2c56c	mov x1,x20
00b2c570	stp x29,x30,[sp, #0x10]
00b2c574	add x29,sp,#0x10
00b2c578	bl 0x00c3e590
00b2c57c	str x20,[x19, #0xb0]
00b2c580	adrp x8,0xcb5000
00b2c584	ldrb w9,[x19, #0x6c]
00b2c588	ldr x8,[x8, #0x690]
00b2c58c	tbnz w9,#0x1,0x00b2c5a8
00b2c590	ldr w9,[x19, #0x40]
00b2c594	adrp x10,0xcb5000
00b2c598	ldr x10,[x10, #0x688]
00b2c59c	sub w9,w9,#0x1
00b2c5a0	cmp w9,#0x2
00b2c5a4	csel x8,x10,x8,cc
00b2c5a8	str x8,[x19, #0x30]
00b2c5ac	ldp x29,x30,[sp, #0x10]
00b2c5b0	mov w0,#0x1
00b2c5b4	ldp x20,x19,[sp], #0x20
00b2c5b8	ret

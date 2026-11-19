; FUN_00907d84 @ 00907d84
00907d84	stp x22,x21,[sp, #-0x30]!
00907d88	stp x20,x19,[sp, #0x10]
00907d8c	stp x29,x30,[sp, #0x20]
00907d90	add x29,sp,#0x20
00907d94	ldr x21,[x0, #0x248]
00907d98	mov x20,x0
00907d9c	mov x19,x1
00907da0	cbz x21,0x00907ddc
00907da4	nop
00907da8	adr x22,0x907bd4
00907dac	ldr x8,[x21]
00907db0	ldr x8,[x8, #0x58]
00907db4	cmp x8,x22
00907db8	b.eq 0x00907dd4
00907dbc	mov w2,#0x1
00907dc0	mov x0,x21
00907dc4	mov x1,x19
00907dc8	mov w3,wzr
00907dcc	mov x4,xzr
00907dd0	blr x8
00907dd4	ldr x21,[x21, #0x8]
00907dd8	cbnz x21,0x00907dac
00907ddc	ldr x20,[x20, #0x250]
00907de0	cbz x20,0x00907e1c
00907de4	nop
00907de8	adr x21,0x907bd4
00907dec	ldr x8,[x20]
00907df0	ldr x8,[x8, #0x58]
00907df4	cmp x8,x21
00907df8	b.eq 0x00907e14
00907dfc	mov w2,#0x1
00907e00	mov x0,x20
00907e04	mov x1,x19
00907e08	mov w3,wzr
00907e0c	mov x4,xzr
00907e10	blr x8
00907e14	ldr x20,[x20, #0x8]
00907e18	cbnz x20,0x00907dec
00907e1c	ldp x29,x30,[sp, #0x20]
00907e20	ldp x20,x19,[sp, #0x10]
00907e24	ldp x22,x21,[sp], #0x30
00907e28	ret

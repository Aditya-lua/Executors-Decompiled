; FUN_00c18c48 @ 00c18c48
00c18c48	paciasp
00c18c4c	stp x29,x30,[sp, #-0x30]!
00c18c50	stp x22,x21,[sp, #0x10]
00c18c54	stp x20,x19,[sp, #0x20]
00c18c58	mov x29,sp
00c18c5c	ldr x22,[x0, #0x1330]
00c18c60	mov x20,x2
00c18c64	mov x19,x1
00c18c68	ldr x8,[x22, #0x8]
00c18c6c	sub x9,x8,#0xfb0
00c18c70	cmn x9,#0xff1
00c18c74	b.hi 0x00c18c98
00c18c78	mov x21,x0
00c18c7c	mov w0,#0x1000
00c18c80	bl 0x00c308d0
00c18c84	cbz x0,0x00c18d04
00c18c88	mov x8,xzr
00c18c8c	stp x22,xzr,[x0]
00c18c90	mov x22,x0
00c18c94	str x0,[x21, #0x1330]
00c18c98	add x9,x8,#0x40
00c18c9c	add x0,x22,x8
00c18ca0	adrp x8,0xcb1000
00c18ca4	add x8,x8,#0xf40
00c18ca8	str x9,[x22, #0x8]
00c18cac	mov w9,#0x3c
00c18cb0	str x8,[x0, #0x10]!
00c18cb4	ldurh w8,[x0, #0x9]
00c18cb8	ldrh w10,[x20]
00c18cbc	strb w9,[x0, #0x8]
00c18cc0	adrp x9,0x2ca000
00c18cc4	add x9,x9,#0x9c8
00c18cc8	and w8,w8,#0xf000
00c18ccc	bfxil w8,w10,#0x0,#0x6
00c18cd0	mov w10,#0x9
00c18cd4	stp x9,x10,[x0, #0x10]
00c18cd8	mov w9,#0x540
00c18cdc	ldr x10,[x19]
00c18ce0	orr w8,w8,w9
00c18ce4	stp xzr,xzr,[x0, #0x28]
00c18ce8	sturh w8,[x0, #0x9]
00c18cec	str x10,[x0, #0x20]
00c18cf0	ldp x20,x19,[sp, #0x20]
00c18cf4	ldp x22,x21,[sp, #0x10]
00c18cf8	ldp x29,x30,[sp], #0x30
00c18cfc	autiasp
00c18d00	ret
00c18d04	bl 0x00c2fff0

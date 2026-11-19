; FUN_00c13c94 @ 00c13c94
00c13c94	paciasp
00c13c98	stp x29,x30,[sp, #-0x30]!
00c13c9c	str x21,[sp, #0x10]
00c13ca0	stp x20,x19,[sp, #0x20]
00c13ca4	mov x29,sp
00c13ca8	ldr x21,[x0, #0x1330]
00c13cac	mov x19,x1
00c13cb0	ldr x8,[x21, #0x8]
00c13cb4	sub x9,x8,#0xfc0
00c13cb8	cmn x9,#0xff1
00c13cbc	b.hi 0x00c13ce0
00c13cc0	mov x20,x0
00c13cc4	mov w0,#0x1000
00c13cc8	bl 0x00c308d0
00c13ccc	cbz x0,0x00c13d3c
00c13cd0	mov x8,xzr
00c13cd4	stp x21,xzr,[x0]
00c13cd8	mov x21,x0
00c13cdc	str x0,[x20, #0x1330]
00c13ce0	add x9,x8,#0x30
00c13ce4	adrp x10,0xcb1000
00c13ce8	add x10,x10,#0x3c0
00c13cec	add x0,x21,x8
00c13cf0	str x9,[x21, #0x8]
00c13cf4	mov w8,#0x15
00c13cf8	str x10,[x0, #0x10]!
00c13cfc	ldurh w9,[x0, #0x9]
00c13d00	adrp x10,0x2ae000
00c13d04	add x10,x10,#0xe80
00c13d08	mov w11,#0x540
00c13d0c	str x10,[x0, #0x10]
00c13d10	ldr x10,[x19]
00c13d14	and w9,w9,#0xf000
00c13d18	strb w8,[x0, #0x8]
00c13d1c	stp x8,x10,[x0, #0x18]
00c13d20	orr w8,w9,w11
00c13d24	sturh w8,[x0, #0x9]
00c13d28	ldp x20,x19,[sp, #0x20]
00c13d2c	ldr x21,[sp, #0x10]
00c13d30	ldp x29,x30,[sp], #0x30
00c13d34	autiasp
00c13d38	ret
00c13d3c	bl 0x00c2fff0

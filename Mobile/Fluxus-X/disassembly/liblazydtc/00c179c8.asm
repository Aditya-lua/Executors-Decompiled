; FUN_00c179c8 @ 00c179c8
00c179c8	paciasp
00c179cc	stp x29,x30,[sp, #-0x40]!
00c179d0	stp x24,x23,[sp, #0x10]
00c179d4	stp x22,x21,[sp, #0x20]
00c179d8	stp x20,x19,[sp, #0x30]
00c179dc	mov x29,sp
00c179e0	ldr x24,[x0, #0x1330]
00c179e4	mov x21,x4
00c179e8	mov x19,x3
00c179ec	mov x20,x2
00c179f0	mov x22,x1
00c179f4	ldr x8,[x24, #0x8]
00c179f8	sub x9,x8,#0xfc0
00c179fc	cmn x9,#0xff1
00c17a00	b.hi 0x00c17a24
00c17a04	mov x23,x0
00c17a08	mov w0,#0x1000
00c17a0c	bl 0x00c308d0
00c17a10	cbz x0,0x00c17a8c
00c17a14	mov x8,xzr
00c17a18	stp x24,xzr,[x0]
00c17a1c	mov x24,x0
00c17a20	str x0,[x23, #0x1330]
00c17a24	add x9,x8,#0x30
00c17a28	add x0,x24,x8
00c17a2c	adrp x8,0xcb1000
00c17a30	add x8,x8,#0xec8
00c17a34	str x9,[x24, #0x8]
00c17a38	mov w9,#0x3d
00c17a3c	str x8,[x0, #0x10]!
00c17a40	ldurh w8,[x0, #0x9]
00c17a44	ldrh w10,[x21]
00c17a48	strb w9,[x0, #0x8]
00c17a4c	ldr x9,[x20]
00c17a50	and w8,w8,#0xf000
00c17a54	ldr q0,[x22]
00c17a58	ldr x11,[x19]
00c17a5c	bfxil w8,w10,#0x0,#0x6
00c17a60	mov w10,#0x540
00c17a64	str q0,[x0, #0x10]
00c17a68	orr w8,w8,w10
00c17a6c	sturh w8,[x0, #0x9]
00c17a70	stp x9,x11,[x0, #0x20]
00c17a74	ldp x20,x19,[sp, #0x30]
00c17a78	ldp x22,x21,[sp, #0x20]
00c17a7c	ldp x24,x23,[sp, #0x10]
00c17a80	ldp x29,x30,[sp], #0x40
00c17a84	autiasp
00c17a88	ret
00c17a8c	bl 0x00c2fff0

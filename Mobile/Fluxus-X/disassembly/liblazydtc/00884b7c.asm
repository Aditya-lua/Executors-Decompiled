; FUN_00884b7c @ 00884b7c
00884b7c	sub sp,sp,#0x50
00884b80	stp x29,x30,[sp, #0x10]
00884b84	str x23,[sp, #0x20]
00884b88	stp x22,x21,[sp, #0x30]
00884b8c	stp x20,x19,[sp, #0x40]
00884b90	add x29,sp,#0x10
00884b94	mrs x23,tpidr_el0
00884b98	adrp x22,0xd1f000
00884b9c	mov w21,w3
00884ba0	ldr x8,[x23, #0x28]
00884ba4	mov w20,w2
00884ba8	mov x19,x0
00884bac	str x8,[sp, #0x8]
00884bb0	ldrb w8,[x22, #0x88]
00884bb4	str x1,[sp]
00884bb8	cmp w8,#0x1
00884bbc	b.ne 0x00884bc8
00884bc0	ldr x8,[x19, #0x798]
00884bc4	b 0x00884bd8
00884bc8	ldr x8,[x19, #0x688]
00884bcc	ldr x9,[x19, #0x680]
00884bd0	sub x8,x8,x9
00884bd4	asr x8,x8,#0x3
00884bd8	cmp x8,#0xc8
00884bdc	b.cs 0x00884c8c
00884be0	add x0,x19,#0x680
00884be4	mov x1,sp
00884be8	bl 0x0086e2d0
00884bec	ldrb w8,[x22, #0x88]
00884bf0	cmp w8,#0x1
00884bf4	b.ne 0x00884c04
00884bf8	ldr x8,[x19, #0x798]
00884bfc	add x8,x8,#0x1
00884c00	str x8,[x19, #0x798]
00884c04	add x0,x19,#0xa0
00884c08	mov x1,sp
00884c0c	bl 0x00886aac
00884c10	mov x22,x0
00884c14	ldr x0,[x19]
00884c18	mov w8,#0x1
00884c1c	strb w20,[x22]
00884c20	strb w8,[x22, #0x1]
00884c24	bl 0x008769d0
00884c28	adrp x8,0xd1f000
00884c2c	cmn w21,#0x1
00884c30	ldrb w11,[x22, #0x2]
00884c34	ldrb w10,[x8, #0xe8]
00884c38	csel w9,w0,w21,eq
00884c3c	and x8,x20,#0xff
00884c40	stp w0,w9,[x22, #0x4]
00884c44	add x9,x19,x8
00884c48	cmp w10,#0x1
00884c4c	strb w11,[x9, #0x698]
00884c50	b.ne 0x00884c64
00884c54	add x8,x19,x8, LSL #0x2
00884c58	ldr w9,[x8, #0x818]
00884c5c	add w9,w9,#0x1
00884c60	str w9,[x8, #0x818]
00884c64	ldr x8,[x23, #0x28]
00884c68	ldr x9,[sp, #0x8]
00884c6c	cmp x8,x9
00884c70	b.ne 0x00884cb8
00884c74	ldp x20,x19,[sp, #0x40]
00884c78	ldr x23,[sp, #0x20]
00884c7c	ldp x22,x21,[sp, #0x30]
00884c80	ldp x29,x30,[sp, #0x10]
00884c84	add sp,sp,#0x50
00884c88	ret
00884c8c	ldr x2,[x1], #0x8
00884c90	ldr x8,[x23, #0x28]
00884c94	ldr x9,[sp, #0x8]
00884c98	cmp x8,x9
00884c9c	b.ne 0x00884cb8
00884ca0	adrp x8,0x2d0000
00884ca4	add x8,x8,#0xc49
00884ca8	mov x0,x1
00884cac	mov x1,x8
00884cb0	mov w3,#0xc8
00884cb4	bl 0x0087fcd8
00884cb8	bl 0x00c2fec0

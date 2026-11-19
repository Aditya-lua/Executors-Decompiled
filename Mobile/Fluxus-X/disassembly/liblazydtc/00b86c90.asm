; psa_wipe_key_slot @ 00b86c90
00b86c90	stp x20,x19,[sp, #-0x20]!
00b86c94	stp x29,x30,[sp, #0x10]
00b86c98	add x29,sp,#0x10
00b86c9c	mov x20,x0
00b86ca0	mov x19,x0
00b86ca4	ldr x0,[x20, #0x28]!
00b86ca8	cbz x0,0x00b86cb4
00b86cac	ldr x1,[x19, #0x30]
00b86cb0	bl 0x00c42230
00b86cb4	stp xzr,xzr,[x20]
00b86cb8	ldr w8,[x19, #0x18]
00b86cbc	sub w9,w8,#0x2
00b86cc0	cmp w9,#0x2
00b86cc4	b.cs 0x00b86cd8
00b86cc8	ldr x8,[x19, #0x20]
00b86ccc	cmp x8,#0x1
00b86cd0	b.ne 0x00b86ce8
00b86cd4	b 0x00b86d08
00b86cd8	cmp w8,#0x1
00b86cdc	b.ne 0x00b86ce8
00b86ce0	ldr x8,[x19, #0x20]
00b86ce4	cbz x8,0x00b86d08
00b86ce8	movi v0.2D,#0x0
00b86cec	str xzr,[x19, #0x30]
00b86cf0	stp q0,q0,[x19, #0x10]
00b86cf4	str q0,[x19]
00b86cf8	ldp x29,x30,[sp, #0x10]
00b86cfc	mov w0,#0xffffff69
00b86d00	ldp x20,x19,[sp], #0x20
00b86d04	ret
00b86d08	movi v0.2D,#0x0
00b86d0c	ldrb w0,[x19, #0x1c]
00b86d10	stp q0,q0,[x19]
00b86d14	stp xzr,xzr,[x19, #0x28]
00b86d18	str xzr,[x19, #0x20]
00b86d1c	ldp x29,x30,[sp, #0x10]
00b86d20	mov x1,x19
00b86d24	ldp x20,x19,[sp], #0x20
00b86d28	b 0x00c43180

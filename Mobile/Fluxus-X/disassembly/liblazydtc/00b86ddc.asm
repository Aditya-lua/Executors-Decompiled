; psa_get_key_attributes @ 00b86ddc
00b86ddc	sub sp,sp,#0x40
00b86de0	str x21,[sp, #0x10]
00b86de4	stp x20,x19,[sp, #0x20]
00b86de8	stp x29,x30,[sp, #0x30]
00b86dec	add x29,sp,#0x30
00b86df0	mrs x21,tpidr_el0
00b86df4	ldr x8,[x21, #0x28]
00b86df8	mov w20,w0
00b86dfc	mov x0,x1
00b86e00	mov x19,x1
00b86e04	str x8,[sp, #0x8]
00b86e08	bl 0x00c42ef0
00b86e0c	mov x1,sp
00b86e10	mov w0,w20
00b86e14	bl 0x00c43190
00b86e18	cbnz w0,0x00b86e34
00b86e1c	ldr x0,[sp]
00b86e20	ldr x8,[x0, #0x10]
00b86e24	str x8,[x19, #0x10]
00b86e28	ldr q0,[x0]
00b86e2c	str q0,[x19]
00b86e30	bl 0x00c431e0
00b86e34	ldr x8,[x21, #0x28]
00b86e38	ldr x9,[sp, #0x8]
00b86e3c	cmp x8,x9
00b86e40	b.ne 0x00b86e58
00b86e44	ldp x29,x30,[sp, #0x30]
00b86e48	ldp x20,x19,[sp, #0x20]
00b86e4c	ldr x21,[sp, #0x10]
00b86e50	add sp,sp,#0x40
00b86e54	ret
00b86e58	bl 0x00c2fec0

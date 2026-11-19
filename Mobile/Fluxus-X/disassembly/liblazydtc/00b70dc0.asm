; mbedtls_aria_crypt_cbc @ 00b70dc0
00b70dc0	sub sp,sp,#0x70
00b70dc4	str x25,[sp, #0x20]
00b70dc8	stp x24,x23,[sp, #0x30]
00b70dcc	stp x22,x21,[sp, #0x40]
00b70dd0	stp x20,x19,[sp, #0x50]
00b70dd4	stp x29,x30,[sp, #0x60]
00b70dd8	add x29,sp,#0x60
00b70ddc	mrs x24,tpidr_el0
00b70de0	ldr x8,[x24, #0x28]
00b70de4	mov x23,x5
00b70de8	mov x19,x4
00b70dec	mov x20,x3
00b70df0	mov x21,x2
00b70df4	mov x22,x0
00b70df8	cmp w1,#0x1
00b70dfc	str x8,[sp, #0x18]
00b70e00	b.ls 0x00b70e0c
00b70e04	mov w0,#0xffffffa4
00b70e08	b 0x00b70ea4
00b70e0c	tst x21,#0xf
00b70e10	b.eq 0x00b70e1c
00b70e14	mov w0,#0xffffffa2
00b70e18	b 0x00b70ea4
00b70e1c	cbz w1,0x00b70e60
00b70e20	cbz x21,0x00b70ea0
00b70e24	mov x25,x23
00b70e28	ldr q0,[x19], #0x10
00b70e2c	ldr q1,[x20]
00b70e30	mov x0,x22
00b70e34	mov x1,x23
00b70e38	mov x2,x23
00b70e3c	eor v0.16B,v1.16B,v0.16B
00b70e40	str q0,[x25], #0x10
00b70e44	bl 0x00c419e0
00b70e48	ldr q0,[x23]
00b70e4c	subs x21,x21,#0x10
00b70e50	mov x23,x25
00b70e54	str q0,[x20]
00b70e58	b.ne 0x00b70e28
00b70e5c	b 0x00b70ea0
00b70e60	cbz x21,0x00b70ea0
00b70e64	ldr q0,[x19]
00b70e68	mov x0,x22
00b70e6c	mov x1,x19
00b70e70	mov x2,x23
00b70e74	str q0,[sp]
00b70e78	bl 0x00c419e0
00b70e7c	ldr q0,[x23]
00b70e80	ldr q1,[x20]
00b70e84	subs x21,x21,#0x10
00b70e88	add x19,x19,#0x10
00b70e8c	eor v0.16B,v1.16B,v0.16B
00b70e90	str q0,[x23], #0x10
00b70e94	ldr q0,[sp]
00b70e98	str q0,[x20]
00b70e9c	b.ne 0x00b70e64
00b70ea0	mov w0,wzr
00b70ea4	ldr x8,[x24, #0x28]
00b70ea8	ldr x9,[sp, #0x18]
00b70eac	cmp x8,x9
00b70eb0	b.ne 0x00b70ed0
00b70eb4	ldp x29,x30,[sp, #0x60]
00b70eb8	ldp x20,x19,[sp, #0x50]
00b70ebc	ldp x22,x21,[sp, #0x40]
00b70ec0	ldp x24,x23,[sp, #0x30]
00b70ec4	ldr x25,[sp, #0x20]
00b70ec8	add sp,sp,#0x70
00b70ecc	ret
00b70ed0	bl 0x00c2fec0

; mbedtls_aes_crypt_cbc @ 00b6ede4
00b6ede4	sub sp,sp,#0x70
00b6ede8	str x25,[sp, #0x20]
00b6edec	stp x24,x23,[sp, #0x30]
00b6edf0	stp x22,x21,[sp, #0x40]
00b6edf4	stp x20,x19,[sp, #0x50]
00b6edf8	stp x29,x30,[sp, #0x60]
00b6edfc	add x29,sp,#0x60
00b6ee00	mrs x25,tpidr_el0
00b6ee04	ldr x8,[x25, #0x28]
00b6ee08	mov x23,x5
00b6ee0c	mov x20,x4
00b6ee10	mov x19,x3
00b6ee14	mov x21,x2
00b6ee18	mov x22,x0
00b6ee1c	cmp w1,#0x1
00b6ee20	str x8,[sp, #0x18]
00b6ee24	b.ls 0x00b6ee30
00b6ee28	orr w0,wzr,#0xffffffdf
00b6ee2c	b 0x00b6eef4
00b6ee30	cbz x21,0x00b6eef0
00b6ee34	tst x21,#0xf
00b6ee38	b.eq 0x00b6ee44
00b6ee3c	mov w0,#0xffffffde
00b6ee40	b 0x00b6eef4
00b6ee44	cbz w1,0x00b6eea4
00b6ee48	mov x8,x19
00b6ee4c	ldr x9,[x20]
00b6ee50	ldr x10,[x8]
00b6ee54	mov x0,x22
00b6ee58	mov x1,x23
00b6ee5c	mov x2,x23
00b6ee60	eor x9,x10,x9
00b6ee64	str x9,[x23]
00b6ee68	ldr x9,[x20, #0x8]
00b6ee6c	ldr x8,[x8, #0x8]
00b6ee70	mov x24,x23
00b6ee74	eor x8,x8,x9
00b6ee78	str x8,[x23, #0x8]
00b6ee7c	bl 0x00c419a0
00b6ee80	add x23,x23,#0x10
00b6ee84	subs x21,x21,#0x10
00b6ee88	add x20,x20,#0x10
00b6ee8c	mov x8,x24
00b6ee90	b.ne 0x00b6ee4c
00b6ee94	ldur q0,[x23, #-0x10]
00b6ee98	mov w0,wzr
00b6ee9c	str q0,[x19]
00b6eea0	b 0x00b6eef4
00b6eea4	ldr q0,[x20]
00b6eea8	mov x0,x22
00b6eeac	mov x1,x20
00b6eeb0	mov x2,x23
00b6eeb4	str q0,[sp]
00b6eeb8	bl 0x00c41990
00b6eebc	ldr x8,[x19]
00b6eec0	ldp x9,x10,[x23]
00b6eec4	add x20,x20,#0x10
00b6eec8	subs x21,x21,#0x10
00b6eecc	eor x8,x8,x9
00b6eed0	str x8,[x23]
00b6eed4	ldr x8,[x19, #0x8]
00b6eed8	eor x8,x8,x10
00b6eedc	str x8,[x23, #0x8]
00b6eee0	ldr q0,[sp]
00b6eee4	add x23,x23,#0x10
00b6eee8	str q0,[x19]
00b6eeec	b.ne 0x00b6eea4
00b6eef0	mov w0,wzr
00b6eef4	ldr x8,[x25, #0x28]
00b6eef8	ldr x9,[sp, #0x18]
00b6eefc	cmp x8,x9
00b6ef00	b.ne 0x00b6ef20
00b6ef04	ldp x29,x30,[sp, #0x60]
00b6ef08	ldp x20,x19,[sp, #0x50]
00b6ef0c	ldp x22,x21,[sp, #0x40]
00b6ef10	ldp x24,x23,[sp, #0x30]
00b6ef14	ldr x25,[sp, #0x20]
00b6ef18	add sp,sp,#0x70
00b6ef1c	ret
00b6ef20	bl 0x00c2fec0

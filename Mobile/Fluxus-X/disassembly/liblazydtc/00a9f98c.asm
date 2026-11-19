; OSSL_PARAM_dup @ 00a9f98c
00a9f98c	sub sp,sp,#0xa0
00a9f990	str x27,[sp, #0x40]
00a9f994	stp x26,x25,[sp, #0x50]
00a9f998	stp x24,x23,[sp, #0x60]
00a9f99c	stp x22,x21,[sp, #0x70]
00a9f9a0	stp x20,x19,[sp, #0x80]
00a9f9a4	stp x29,x30,[sp, #0x90]
00a9f9a8	add x29,sp,#0x90
00a9f9ac	cbz x0,0x00a9fbfc
00a9f9b0	movi v0.2D,#0x0
00a9f9b4	stp q0,q0,[sp, #0x20]
00a9f9b8	stp q0,q0,[sp]
00a9f9bc	ldr x8,[x0]
00a9f9c0	mov x19,x0
00a9f9c4	cbz x8,0x00a9fa38
00a9f9c8	mov x20,xzr
00a9f9cc	orr w21,wzr,#0x7
00a9f9d0	mov x22,sp
00a9f9d4	add x23,x19,x20
00a9f9d8	ldr x0,[x23, #0x10]
00a9f9dc	bl 0x00c3e800
00a9f9e0	ldr w8,[x23, #0x8]
00a9f9e4	and w9,w8,#0xfffffffe
00a9f9e8	cmp w9,#0x6
00a9f9ec	b.ne 0x00a9f9f8
00a9f9f0	mov w9,#0x8
00a9f9f4	b 0x00a9f9fc
00a9f9f8	ldr x9,[x23, #0x18]
00a9f9fc	sxtw x10,w0
00a9fa00	add x10,x22,x10, LSL #0x5
00a9fa04	ldr x11,[x10, #0x10]
00a9fa08	cmp w8,#0x4
00a9fa0c	cinc x8,x21,eq
00a9fa10	add x8,x8,x9
00a9fa14	add x8,x11,x8, LSR #0x3
00a9fa18	str x8,[x10, #0x10]
00a9fa1c	ldr x8,[x23, #0x28]
00a9fa20	add x20,x20,#0x28
00a9fa24	cbnz x8,0x00a9f9d4
00a9fa28	ldr x8,[sp, #0x10]
00a9fa2c	add x9,x20,#0x28
00a9fa30	lsr x22,x9,#0x3
00a9fa34	b 0x00a9fa3c
00a9fa38	mov w22,#0x5
00a9fa3c	add x8,x22,x8
00a9fa40	lsl x21,x8,#0x3
00a9fa44	adrp x1,0x2b2000
00a9fa48	add x1,x1,#0x53b
00a9fa4c	mov w2,#0x27
00a9fa50	mov x0,x21
00a9fa54	bl 0x00c34250
00a9fa58	mov x20,x0
00a9fa5c	str x0,[sp]
00a9fa60	cbz x0,0x00a9fb60
00a9fa64	add x8,x20,x22, LSL #0x3
00a9fa68	str x8,[sp, #0x8]
00a9fa6c	ldr x8,[sp, #0x30]
00a9fa70	str x21,[sp, #0x18]
00a9fa74	cbz x8,0x00a9fb94
00a9fa78	lsl x21,x8,#0x3
00a9fa7c	adrp x1,0x2b2000
00a9fa80	add x1,x1,#0x53b
00a9fa84	mov w2,#0x27
00a9fa88	mov x0,x21
00a9fa8c	bl 0x00c35710
00a9fa90	str x0,[sp, #0x20]
00a9fa94	cbz x0,0x00a9fbbc
00a9fa98	mov x22,x0
00a9fa9c	str x21,[sp, #0x38]
00a9faa0	str x0,[sp, #0x28]
00a9faa4	ldr x8,[x19]
00a9faa8	cbz x8,0x00a9fba4
00a9faac	mov x24,xzr
00a9fab0	mov x25,sp
00a9fab4	add x27,x19,x24
00a9fab8	ldr x0,[x27, #0x10]
00a9fabc	bl 0x00c3e800
00a9fac0	ldr x9,[x27, #0x20]
00a9fac4	add x8,x20,x24
00a9fac8	sxtw x26,w0
00a9facc	str x9,[x8, #0x20]
00a9fad0	ldr q0,[x27, #0x10]
00a9fad4	add x9,x25,x26, LSL #0x5
00a9fad8	str q0,[x8, #0x10]
00a9fadc	ldr q0,[x27]
00a9fae0	str q0,[x8]
00a9fae4	ldr x9,[x9, #0x8]
00a9fae8	str x9,[x8, #0x10]
00a9faec	ldr w9,[x27, #0x8]
00a9faf0	and w10,w9,#0xfffffffe
00a9faf4	cmp w10,#0x6
00a9faf8	b.ne 0x00a9fb14
00a9fafc	ldr x10,[x27, #0x10]
00a9fb00	ldr x8,[x8, #0x10]
00a9fb04	mov w23,#0x8
00a9fb08	ldr x10,[x10]
00a9fb0c	str x10,[x8]
00a9fb10	b 0x00a9fb28
00a9fb14	ldp x1,x23,[x27, #0x10]
00a9fb18	ldr x0,[x8, #0x10]
00a9fb1c	mov x2,x23
00a9fb20	bl 0x00c2ffd0
00a9fb24	ldr w9,[x27, #0x8]
00a9fb28	add x8,x25,x26, LSL #0x5
00a9fb2c	cmp w9,#0x4
00a9fb30	ldr x9,[x8, #0x8]
00a9fb34	cinc x10,x23,eq
00a9fb38	add x10,x10,#0x7
00a9fb3c	and x10,x10,#-0x8
00a9fb40	add x9,x9,x10
00a9fb44	str x9,[x8, #0x8]
00a9fb48	add x8,x19,x24
00a9fb4c	ldr x8,[x8, #0x28]
00a9fb50	add x24,x24,#0x28
00a9fb54	cbnz x8,0x00a9fab4
00a9fb58	add x8,x20,x24
00a9fb5c	b 0x00a9fba8
00a9fb60	bl 0x00c342a0
00a9fb64	adrp x0,0x2b2000
00a9fb68	adrp x2,0x2b0000
00a9fb6c	add x0,x0,#0x53b
00a9fb70	add x2,x2,#0x372
00a9fb74	mov w1,#0x2a
00a9fb78	bl 0x00c342b0
00a9fb7c	mov w1,#0x100
00a9fb80	orr w0,wzr,#0xf
00a9fb84	movk w1,#0xc, LSL #16
00a9fb88	mov x2,xzr
00a9fb8c	bl 0x00c342c0
00a9fb90	b 0x00a9fc00
00a9fb94	mov x21,xzr
00a9fb98	mov x22,xzr
00a9fb9c	ldr x8,[x19]
00a9fba0	cbnz x8,0x00a9faac
00a9fba4	mov x8,x20
00a9fba8	orr w9,wzr,#0x7f
00a9fbac	str xzr,[x8]
00a9fbb0	stp x22,x21,[x8, #0x10]
00a9fbb4	str w9,[x8, #0x8]
00a9fbb8	b 0x00a9fc00
00a9fbbc	bl 0x00c342a0
00a9fbc0	adrp x19,0x2b2000
00a9fbc4	add x19,x19,#0x53b
00a9fbc8	adrp x2,0x2b0000
00a9fbcc	add x2,x2,#0x372
00a9fbd0	mov w1,#0x2a
00a9fbd4	mov x0,x19
00a9fbd8	bl 0x00c342b0
00a9fbdc	orr w0,wzr,#0xf
00a9fbe0	mov w1,#0x6f
00a9fbe4	mov x2,xzr
00a9fbe8	bl 0x00c342c0
00a9fbec	orr w2,wzr,#0x7f
00a9fbf0	mov x0,x20
00a9fbf4	mov x1,x19
00a9fbf8	bl 0x00c32310
00a9fbfc	mov x20,xzr
00a9fc00	mov x0,x20
00a9fc04	ldp x29,x30,[sp, #0x90]
00a9fc08	ldp x20,x19,[sp, #0x80]
00a9fc0c	ldp x22,x21,[sp, #0x70]
00a9fc10	ldp x24,x23,[sp, #0x60]
00a9fc14	ldp x26,x25,[sp, #0x50]
00a9fc18	ldr x27,[sp, #0x40]
00a9fc1c	add sp,sp,#0xa0
00a9fc20	ret

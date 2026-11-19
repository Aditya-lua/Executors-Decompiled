; psa_key_derivation_output_key_custom @ 00b8d94c
00b8d94c	sub sp,sp,#0x180
00b8d950	stp x28,x27,[sp, #0x120]
00b8d954	stp x26,x25,[sp, #0x130]
00b8d958	stp x24,x23,[sp, #0x140]
00b8d95c	stp x22,x21,[sp, #0x150]
00b8d960	stp x20,x19,[sp, #0x160]
00b8d964	stp x29,x30,[sp, #0x170]
00b8d968	add x29,sp,#0x170
00b8d96c	mrs x26,tpidr_el0
00b8d970	ldr x8,[x26, #0x28]
00b8d974	mov x19,x5
00b8d978	mov x20,x0
00b8d97c	mov x24,x1
00b8d980	stur x8,[x29, #-0x60]
00b8d984	stp xzr,xzr,[sp, #0x8]
00b8d988	str wzr,[x5]
00b8d98c	ldrh w8,[x0, #0x2]
00b8d990	mov w23,#0xffffff79
00b8d994	cbz w8,0x00b8da90
00b8d998	cbnz x4,0x00b8da90
00b8d99c	ldr w8,[x2]
00b8d9a0	cbnz w8,0x00b8da90
00b8d9a4	ldr w8,[x24]
00b8d9a8	cbz w8,0x00b8d9bc
00b8d9ac	ldrb w8,[x24, #0x4]
00b8d9b0	tbnz w8,#0x0,0x00b8d9c4
00b8d9b4	mov w23,#0xffffff7b
00b8d9b8	b 0x00b8da90
00b8d9bc	mov w23,#0xffffff77
00b8d9c0	b 0x00b8da90
00b8d9c4	add x1,sp,#0x10
00b8d9c8	add x2,sp,#0x8
00b8d9cc	mov x0,x20
00b8d9d0	bl 0x00b8785c
00b8d9d4	mov w23,w0
00b8d9d8	cbz w0,0x00b8da1c
00b8d9dc	ldr x19,[sp, #0x10]
00b8d9e0	cbz x19,0x00b8da90
00b8d9e4	mov x20,x19
00b8d9e8	ldr x0,[x20, #0x28]!
00b8d9ec	cbz x0,0x00b8d9f8
00b8d9f0	ldr x1,[x19, #0x30]
00b8d9f4	bl 0x00c42230
00b8d9f8	stp xzr,xzr,[x20]
00b8d9fc	ldr w8,[x19, #0x18]
00b8da00	sub w9,w8,#0x2
00b8da04	cmp w9,#0x2
00b8da08	b.cs 0x00b8da50
00b8da0c	ldr x8,[x19, #0x20]
00b8da10	cmp x8,#0x1
00b8da14	b.ne 0x00b8da60
00b8da18	b 0x00b8da74
00b8da1c	ldrh w25,[x20, #0x2]
00b8da20	ldr x20,[sp, #0x10]
00b8da24	add x27,x25,#0x7
00b8da28	lsr x21,x27,#0x3
00b8da2c	stp x21,x25,[sp, #0x18]
00b8da30	ldrh w8,[x20]
00b8da34	and w9,w8,#0x7000
00b8da38	cmp w9,#0x4, LSL #12
00b8da3c	b.ne 0x00b8dac4
00b8da40	mov w23,#0xffffff79
00b8da44	ldr x19,[sp, #0x10]
00b8da48	cbnz x19,0x00b8d9e4
00b8da4c	b 0x00b8da90
00b8da50	cmp w8,#0x1
00b8da54	b.ne 0x00b8da60
00b8da58	ldr x8,[x19, #0x20]
00b8da5c	cbz x8,0x00b8da74
00b8da60	movi v0.2D,#0x0
00b8da64	str xzr,[x19, #0x30]
00b8da68	stp q0,q0,[x19, #0x10]
00b8da6c	str q0,[x19]
00b8da70	b 0x00b8da90
00b8da74	ldrb w0,[x19, #0x1c]
00b8da78	movi v0.2D,#0x0
00b8da7c	mov x1,x19
00b8da80	stp xzr,xzr,[x19, #0x28]
00b8da84	stp q0,q0,[x19]
00b8da88	str xzr,[x19, #0x20]
00b8da8c	bl 0x00c43180
00b8da90	ldr x8,[x26, #0x28]
00b8da94	ldur x9,[x29, #-0x60]
00b8da98	cmp x8,x9
00b8da9c	b.ne 0x00b8deac
00b8daa0	mov w0,w23
00b8daa4	ldp x29,x30,[sp, #0x170]
00b8daa8	ldp x20,x19,[sp, #0x160]
00b8daac	ldp x22,x21,[sp, #0x150]
00b8dab0	ldp x24,x23,[sp, #0x140]
00b8dab4	ldp x26,x25,[sp, #0x130]
00b8dab8	ldp x28,x27,[sp, #0x120]
00b8dabc	add sp,sp,#0x180
00b8dac0	ret
00b8dac4	mov w9,#0xcf00
00b8dac8	and w9,w8,w9
00b8dacc	mov w10,#0x4100
00b8dad0	cmp w9,w10
00b8dad4	b.ne 0x00b8daf8
00b8dad8	tst w8,#0xc0
00b8dadc	b.eq 0x00b8db84
00b8dae0	cmp w25,#0xff
00b8dae4	b.eq 0x00b8dc10
00b8dae8	cmp w25,#0x1c0
00b8daec	b.ne 0x00b8dc74
00b8daf0	orr w23,wzr,#0x38
00b8daf4	b 0x00b8dc14
00b8daf8	and w8,w8,#0x7000
00b8dafc	cmp w8,#0x2, LSL #12
00b8db00	b.eq 0x00b8db0c
00b8db04	cmp w8,#0x1, LSL #12
00b8db08	b.ne 0x00b8dc00
00b8db0c	tst x25,#0x7
00b8db10	b.ne 0x00b8da40
00b8db14	mov w0,#0x1
00b8db18	mov x1,x21
00b8db1c	bl 0x00c30a30
00b8db20	mov x22,x0
00b8db24	cbz x0,0x00b8dcec
00b8db28	mov x0,x24
00b8db2c	mov x1,x22
00b8db30	mov x2,x21
00b8db34	bl 0x00c42d30
00b8db38	mov w23,w0
00b8db3c	cbnz w0,0x00b8dd64
00b8db40	cmp x27,#0x40
00b8db44	b.cc 0x00b8dcb8
00b8db48	ldrh w8,[x20]
00b8db4c	mov w9,#0x2301
00b8db50	cmp w8,w9
00b8db54	b.ne 0x00b8dcb8
00b8db58	mov x0,x22
00b8db5c	bl 0x00c424a0
00b8db60	cmp x27,#0x80
00b8db64	b.cc 0x00b8dcb8
00b8db68	add x0,x22,#0x8
00b8db6c	bl 0x00c424a0
00b8db70	cmp x27,#0xc0
00b8db74	b.cc 0x00b8dcb8
00b8db78	add x0,x22,#0x10
00b8db7c	bl 0x00c424a0
00b8db80	b 0x00b8dcb8
00b8db84	mov w8,#0x1
00b8db88	sub x0,x29,#0x78
00b8db8c	stur w8,[x29, #-0x64]
00b8db90	bl 0x00c41c00
00b8db94	sub x0,x29,#0x88
00b8db98	bl 0x00c41c00
00b8db9c	ldrh w8,[x20]
00b8dba0	mov w9,#0xcf00
00b8dba4	mov w10,#0x4100
00b8dba8	mov x1,x25
00b8dbac	and w9,w8,w9
00b8dbb0	cmp w9,w10
00b8dbb4	csel w0,w8,wzr,eq
00b8dbb8	bl 0x00c432a0
00b8dbbc	mov w22,w0
00b8dbc0	cbz w0,0x00b8dc80
00b8dbc4	add x0,sp,#0x28
00b8dbc8	add x25,sp,#0x28
00b8dbcc	bl 0x00c426c0
00b8dbd0	add x0,sp,#0x28
00b8dbd4	mov w1,w22
00b8dbd8	bl 0x00c42800
00b8dbdc	cbnz w0,0x00b8dbf8
00b8dbe0	ldr x23,[sp, #0xa8]
00b8dbe4	add x1,x25,#0x68
00b8dbe8	sub x0,x29,#0x88
00b8dbec	mov w2,#0x2
00b8dbf0	bl 0x00c41d50
00b8dbf4	cbz w0,0x00b8ddc8
00b8dbf8	mov x22,xzr
00b8dbfc	b 0x00b8dc88
00b8dc00	mov w23,#0xffffff7a
00b8dc04	ldr x19,[sp, #0x10]
00b8dc08	cbnz x19,0x00b8d9e4
00b8dc0c	b 0x00b8da90
00b8dc10	mov w23,#0x20
00b8dc14	mov w0,#0x1
00b8dc18	mov x1,x23
00b8dc1c	bl 0x00c30a30
00b8dc20	mov x22,x0
00b8dc24	cbz x0,0x00b8dd60
00b8dc28	mov x0,x24
00b8dc2c	mov x1,x22
00b8dc30	mov x2,x23
00b8dc34	bl 0x00c42d30
00b8dc38	mov w23,w0
00b8dc3c	cbnz w0,0x00b8dd64
00b8dc40	cmp w25,#0x1c0
00b8dc44	b.eq 0x00b8de7c
00b8dc48	cmp w25,#0xff
00b8dc4c	b.ne 0x00b8de9c
00b8dc50	ldrb w8,[x22]
00b8dc54	ldrb w9,[x22, #0x1f]
00b8dc58	mov w10,#0x40
00b8dc5c	orr w25,wzr,#0xff
00b8dc60	and w8,w8,#0xf8
00b8dc64	bfxil w10,w9,#0x0,#0x6
00b8dc68	strb w8,[x22]
00b8dc6c	strb w10,[x22, #0x1f]
00b8dc70	b 0x00b8dcb8
00b8dc74	mov x22,xzr
00b8dc78	mov w23,#0xffffff79
00b8dc7c	b 0x00b8dd64
00b8dc80	mov x22,xzr
00b8dc84	mov w0,#0xffffff98
00b8dc88	bl 0x00c42bf0
00b8dc8c	mov w23,w0
00b8dc90	cbz w0,0x00b8dca0
00b8dc94	mov x0,x22
00b8dc98	bl 0x00c30960
00b8dc9c	mov x22,xzr
00b8dca0	sub x0,x29,#0x78
00b8dca4	bl 0x00c41bb0
00b8dca8	sub x0,x29,#0x88
00b8dcac	bl 0x00c41bb0
00b8dcb0	cbnz w23,0x00b8dd64
00b8dcb4	ldr x25,[sp, #0x20]
00b8dcb8	ldr w8,[x20, #0x4]
00b8dcbc	strh w25,[x20, #0x2]
00b8dcc0	cmp w8,#0x100
00b8dcc4	b.cc 0x00b8dcdc
00b8dcc8	add x1,sp,#0x18
00b8dccc	mov x0,x20
00b8dcd0	bl 0x00c42f10
00b8dcd4	mov w23,w0
00b8dcd8	cbnz w0,0x00b8dd64
00b8dcdc	ldr x8,[x20, #0x28]
00b8dce0	cbz x8,0x00b8dcfc
00b8dce4	mov w23,#0xffffff75
00b8dce8	b 0x00b8dd64
00b8dcec	mov w23,#0xffffff73
00b8dcf0	ldr x19,[sp, #0x10]
00b8dcf4	cbnz x19,0x00b8d9e4
00b8dcf8	b 0x00b8da90
00b8dcfc	ldr x23,[sp, #0x18]
00b8dd00	mov w0,#0x1
00b8dd04	mov x1,x23
00b8dd08	bl 0x00c30a30
00b8dd0c	mov x3,x0
00b8dd10	str x0,[x20, #0x28]
00b8dd14	cbz x0,0x00b8dd60
00b8dd18	mov x5,x20
00b8dd1c	str x23,[x5, #0x30]!
00b8dd20	ldur w8,[x5, #-0x2c]
00b8dd24	mov w24,#0xffffff79
00b8dd28	mov w0,#0xffffff79
00b8dd2c	cmp w8,#0xff
00b8dd30	b.hi 0x00b8dd4c
00b8dd34	add x6,sp,#0x20
00b8dd38	mov x0,x20
00b8dd3c	mov x1,x22
00b8dd40	mov x2,x21
00b8dd44	mov x4,x23
00b8dd48	bl 0x00c42d10
00b8dd4c	ldr x8,[sp, #0x20]
00b8dd50	ldrh w9,[x20, #0x2]
00b8dd54	cmp x8,x9
00b8dd58	csel w23,w0,w24,eq
00b8dd5c	b 0x00b8dd64
00b8dd60	mov w23,#0xffffff73
00b8dd64	mov x0,x22
00b8dd68	bl 0x00c30960
00b8dd6c	cbnz w23,0x00b8d9dc
00b8dd70	ldr x20,[sp, #0x10]
00b8dd74	ldrb w8,[x20, #0x4]
00b8dd78	cbz w8,0x00b8dd90
00b8dd7c	ldp x1,x2,[x20, #0x28]
00b8dd80	mov x0,x20
00b8dd84	bl 0x00c43250
00b8dd88	mov w23,w0
00b8dd8c	cbnz w0,0x00b8d9dc
00b8dd90	ldr w8,[x20, #0x14]
00b8dd94	str w8,[x19]
00b8dd98	ldr w8,[x20, #0x18]
00b8dd9c	cmp w8,#0x1
00b8dda0	b.ne 0x00b8ddb4
00b8dda4	mov w8,#0x2
00b8dda8	mov w23,wzr
00b8ddac	str w8,[x20, #0x18]
00b8ddb0	b 0x00b8da90
00b8ddb4	mov w23,#0xffffff69
00b8ddb8	str wzr,[x19]
00b8ddbc	ldr x19,[sp, #0x10]
00b8ddc0	cbnz x19,0x00b8d9e4
00b8ddc4	b 0x00b8da90
00b8ddc8	add x8,x23,#0x7
00b8ddcc	lsr x25,x8,#0x3
00b8ddd0	mov w0,#0x1
00b8ddd4	mov x1,x25
00b8ddd8	mov w28,#0x1
00b8dddc	bl 0x00c30a30
00b8dde0	mov x22,x0
00b8dde4	cbz x0,0x00b8dea4
00b8dde8	and x27,x23,#0x7
00b8ddec	lsl w8,w28,w27
00b8ddf0	sub w28,w8,#0x1
00b8ddf4	mov x0,x24
00b8ddf8	mov x1,x22
00b8ddfc	mov x2,x25
00b8de00	bl 0x00c42d30
00b8de04	mov w23,w0
00b8de08	cbnz w0,0x00b8dc94
00b8de0c	cbz x27,0x00b8de1c
00b8de10	ldrb w8,[x22]
00b8de14	and w8,w8,w28
00b8de18	strb w8,[x22]
00b8de1c	sub x0,x29,#0x78
00b8de20	mov x1,x22
00b8de24	mov x2,x25
00b8de28	bl 0x00c41ca0
00b8de2c	cbnz w0,0x00b8dc88
00b8de30	sub x0,x29,#0x88
00b8de34	sub x1,x29,#0x78
00b8de38	sub x2,x29,#0x64
00b8de3c	bl 0x00c41c50
00b8de40	cbnz w0,0x00b8dc88
00b8de44	ldur w8,[x29, #-0x64]
00b8de48	cbnz w8,0x00b8ddf4
00b8de4c	sub x0,x29,#0x78
00b8de50	sub x1,x29,#0x78
00b8de54	mov w2,#0x1
00b8de58	bl 0x00c41b10
00b8de5c	cbnz w0,0x00b8dc88
00b8de60	sub x0,x29,#0x78
00b8de64	mov x1,x22
00b8de68	mov x2,x25
00b8de6c	bl 0x00c41d80
00b8de70	cbnz w0,0x00b8dc88
00b8de74	mov w23,wzr
00b8de78	b 0x00b8dca0
00b8de7c	ldrb w8,[x22]
00b8de80	ldrb w9,[x22, #0x37]
00b8de84	orr w25,wzr,#0x1c0
00b8de88	and w8,w8,#0xfc
00b8de8c	orr w9,w9,#0x80
00b8de90	strb w8,[x22]
00b8de94	strb w9,[x22, #0x37]
00b8de98	b 0x00b8dcb8
00b8de9c	mov w23,#0xffffff69
00b8dea0	b 0x00b8dd64
00b8dea4	mov w0,#0xffffff96
00b8dea8	b 0x00b8dc88
00b8deac	bl 0x00c2fec0

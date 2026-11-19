; mbedtls_mpi_read_string @ 00b7dba4
00b7dba4	sub sp,sp,#0xa0
00b7dba8	stp x28,x27,[sp, #0x40]
00b7dbac	stp x26,x25,[sp, #0x50]
00b7dbb0	stp x24,x23,[sp, #0x60]
00b7dbb4	stp x22,x21,[sp, #0x70]
00b7dbb8	stp x20,x19,[sp, #0x80]
00b7dbbc	stp x29,x30,[sp, #0x90]
00b7dbc0	add x29,sp,#0x90
00b7dbc4	mrs x26,tpidr_el0
00b7dbc8	ldr x8,[x26, #0x28]
00b7dbcc	sub w9,w1,#0x2
00b7dbd0	mov x21,x2
00b7dbd4	mov w22,w1
00b7dbd8	mov x19,x0
00b7dbdc	cmp w9,#0xe
00b7dbe0	str x8,[sp, #0x38]
00b7dbe4	b.ls 0x00b7dbf0
00b7dbe8	orr w22,wzr,#0xfffffffc
00b7dbec	b 0x00b7df1c
00b7dbf0	mov w24,#0x1
00b7dbf4	str w24,[sp, #0x18]
00b7dbf8	str xzr,[sp, #0x10]
00b7dbfc	ldrb w8,[x21]
00b7dc00	cmp w8,#0x2d
00b7dc04	b.eq 0x00b7dc38
00b7dc08	cbnz w8,0x00b7dc40
00b7dc0c	cbz x19,0x00b7dce8
00b7dc10	ldr x0,[x19]
00b7dc14	cbz x0,0x00b7dc24
00b7dc18	ldrh w8,[x19, #0xa]
00b7dc1c	lsl x1,x8,#0x3
00b7dc20	bl 0x00c42230
00b7dc24	mov w8,#0x1
00b7dc28	mov w22,wzr
00b7dc2c	str w8,[x19, #0x8]
00b7dc30	str xzr,[x19]
00b7dc34	b 0x00b7df1c
00b7dc38	add x21,x21,#0x1
00b7dc3c	mov w24,#0xffffffff
00b7dc40	mov x0,x21
00b7dc44	bl 0x00c2ff50
00b7dc48	cmp w22,#0x10
00b7dc4c	mov x20,x0
00b7dc50	b.ne 0x00b7dcd0
00b7dc54	lsr x8,x20,#0x3e
00b7dc58	cbnz x8,0x00b7dbe8
00b7dc5c	ubfx x8,x20,#0x4,#0x3a
00b7dc60	tst x20,#0xf
00b7dc64	cinc x22,x8,ne
00b7dc68	mov w8,#0x2710
00b7dc6c	cmp x22,x8
00b7dc70	b.hi 0x00b7dfdc
00b7dc74	ldrh w25,[x19, #0xa]
00b7dc78	cmp x22,x25
00b7dc7c	b.ls 0x00b7de38
00b7dc80	mov w1,#0x8
00b7dc84	mov x0,x22
00b7dc88	bl 0x00c30a30
00b7dc8c	mov x23,x0
00b7dc90	cbz x0,0x00b7dfdc
00b7dc94	str w24,[sp, #0xc]
00b7dc98	ldr x24,[x19]
00b7dc9c	cbz x24,0x00b7dcc0
00b7dca0	lsl x25,x25,#0x3
00b7dca4	mov x0,x23
00b7dca8	mov x1,x24
00b7dcac	mov x2,x25
00b7dcb0	bl 0x00c2ffd0
00b7dcb4	mov x0,x24
00b7dcb8	mov x1,x25
00b7dcbc	bl 0x00c42230
00b7dcc0	strh w22,[x19, #0xa]
00b7dcc4	str x23,[x19]
00b7dcc8	and x25,x22,#0xffff
00b7dccc	b 0x00b7de40
00b7dcd0	ldrh w25,[x19, #0xa]
00b7dcd4	cbz x25,0x00b7dcf0
00b7dcd8	ldr x23,[x19]
00b7dcdc	str w24,[sp, #0xc]
00b7dce0	lsl x2,x25,#0x3
00b7dce4	b 0x00b7dd40
00b7dce8	mov w22,wzr
00b7dcec	b 0x00b7df1c
00b7dcf0	mov w0,#0x1
00b7dcf4	mov w1,#0x8
00b7dcf8	bl 0x00c30a30
00b7dcfc	mov x23,x0
00b7dd00	cbz x0,0x00b7dfdc
00b7dd04	str w24,[sp, #0xc]
00b7dd08	ldr x24,[x19]
00b7dd0c	cbz x24,0x00b7dd30
00b7dd10	lsl x25,x25,#0x3
00b7dd14	mov x0,x23
00b7dd18	mov x1,x24
00b7dd1c	mov x2,x25
00b7dd20	bl 0x00c2ffd0
00b7dd24	mov x0,x24
00b7dd28	mov x1,x25
00b7dd2c	bl 0x00c42230
00b7dd30	mov w8,#0x1
00b7dd34	mov w2,#0x8
00b7dd38	str x23,[x19]
00b7dd3c	strh w8,[x19, #0xa]
00b7dd40	mov x0,x23
00b7dd44	mov w1,wzr
00b7dd48	bl 0x00c301c0
00b7dd4c	ldr x8,[x19]
00b7dd50	mov w24,#0x1
00b7dd54	str xzr,[x8]
00b7dd58	strh w24,[x19, #0x8]
00b7dd5c	cbz x20,0x00b7def0
00b7dd60	mov x25,xzr
00b7dd64	sxtw x23,w22
00b7dd68	add x28,sp,#0x30
00b7dd6c	ldrb w8,[x21, x25]
00b7dd70	sub w9,w8,#0x30
00b7dd74	cmp w9,#0x9
00b7dd78	b.hi 0x00b7dd8c
00b7dd7c	sub x27,x8,#0x30
00b7dd80	cmp x27,x23
00b7dd84	b.cc 0x00b7ddd4
00b7dd88	b 0x00b7df78
00b7dd8c	sub w9,w8,#0x41
00b7dd90	and w9,w9,#0xff
00b7dd94	cmp w9,#0x5
00b7dd98	b.hi 0x00b7ddac
00b7dd9c	sub x27,x8,#0x37
00b7dda0	cmp x27,x23
00b7dda4	b.cc 0x00b7ddd4
00b7dda8	b 0x00b7df78
00b7ddac	sub w9,w8,#0x61
00b7ddb0	cmp w9,#0x5
00b7ddb4	b.hi 0x00b7ddc8
00b7ddb8	sub x27,x8,#0x57
00b7ddbc	cmp x27,x23
00b7ddc0	b.cc 0x00b7ddd4
00b7ddc4	b 0x00b7df78
00b7ddc8	orr w27,wzr,#0xff
00b7ddcc	cmp x27,x23
00b7ddd0	b.cs 0x00b7df78
00b7ddd4	add x0,sp,#0x10
00b7ddd8	mov x1,x19
00b7dddc	mov x2,x23
00b7dde0	bl 0x00c41c70
00b7dde4	mov w22,w0
00b7dde8	cbnz w0,0x00b7defc
00b7ddec	cmp x27,#0x0
00b7ddf0	asr x8,x27,#0x3f
00b7ddf4	cneg x9,x27,mi
00b7ddf8	orr w8,w8,#0x1
00b7ddfc	add x1,sp,#0x10
00b7de00	add x2,sp,#0x20
00b7de04	mov w3,#0x1
00b7de08	mov x0,x19
00b7de0c	str x9,[sp, #0x30]
00b7de10	strh w8,[sp, #0x28]
00b7de14	strh w24,[sp, #0x2a]
00b7de18	str x28,[sp, #0x20]
00b7de1c	bl 0x00b7f304
00b7de20	mov w22,w0
00b7de24	cbnz w0,0x00b7defc
00b7de28	add x25,x25,#0x1
00b7de2c	cmp x25,x20
00b7de30	b.cc 0x00b7dd6c
00b7de34	b 0x00b7def0
00b7de38	cbz w25,0x00b7df88
00b7de3c	str w24,[sp, #0xc]
00b7de40	ldr x22,[x19]
00b7de44	lsl x2,x25,#0x3
00b7de48	mov x0,x22
00b7de4c	mov w1,wzr
00b7de50	bl 0x00c301c0
00b7de54	ldr x8,[x19]
00b7de58	mov w9,#0x1
00b7de5c	str xzr,[x8]
00b7de60	strh w9,[x19, #0x8]
00b7de64	cbz x20,0x00b7def0
00b7de68	mov x9,xzr
00b7de6c	mov x10,xzr
00b7de70	sub x11,x21,#0x1
00b7de74	ldrb w12,[x11, x20]
00b7de78	sub w13,w12,#0x30
00b7de7c	cmp w13,#0xa
00b7de80	b.cs 0x00b7de8c
00b7de84	mov w13,#0xffffffd0
00b7de88	b 0x00b7deb0
00b7de8c	sub w13,w12,#0x41
00b7de90	cmp w13,#0x6
00b7de94	b.cs 0x00b7dea0
00b7de98	mov w13,#0xffffffc9
00b7de9c	b 0x00b7deb0
00b7dea0	sub w13,w12,#0x61
00b7dea4	cmp w13,#0x5
00b7dea8	b.hi 0x00b7dfec
00b7deac	mov w13,#0xffffffa9
00b7deb0	add w12,w13,w12
00b7deb4	cmp w12,#0xf
00b7deb8	b.hi 0x00b7df78
00b7debc	lsr x14,x10,#0x1
00b7dec0	and x14,x14,#0x7ffffffffffffff8
00b7dec4	ldr x15,[x8, x14#0x0]
00b7dec8	sxtw x12,w12
00b7decc	and x13,x9,#0x3c
00b7ded0	add x10,x10,#0x1
00b7ded4	lsl x12,x12,x13
00b7ded8	add x9,x9,#0x4
00b7dedc	cmp x20,x10
00b7dee0	orr x12,x15,x12
00b7dee4	sub x11,x11,#0x1
00b7dee8	str x12,[x8, x14#0x0]
00b7deec	b.ne 0x00b7de74
00b7def0	ldr w8,[sp, #0xc]
00b7def4	mov w22,wzr
00b7def8	tbnz w8,#0x1f,0x00b7df50
00b7defc	ldr x0,[sp, #0x10]
00b7df00	cbz x0,0x00b7df10
00b7df04	ldrh w8,[sp, #0x1a]
00b7df08	lsl x1,x8,#0x3
00b7df0c	bl 0x00c42230
00b7df10	mov w8,#0x1
00b7df14	str w8,[sp, #0x18]
00b7df18	str xzr,[sp, #0x10]
00b7df1c	ldr x8,[x26, #0x28]
00b7df20	ldr x9,[sp, #0x38]
00b7df24	cmp x8,x9
00b7df28	b.ne 0x00b7dffc
00b7df2c	mov w0,w22
00b7df30	ldp x29,x30,[sp, #0x90]
00b7df34	ldp x20,x19,[sp, #0x80]
00b7df38	ldp x22,x21,[sp, #0x70]
00b7df3c	ldp x24,x23,[sp, #0x60]
00b7df40	ldp x26,x25,[sp, #0x50]
00b7df44	ldp x28,x27,[sp, #0x40]
00b7df48	add sp,sp,#0xa0
00b7df4c	ret
00b7df50	ldr x0,[x19]
00b7df54	ldrh w1,[x19, #0xa]
00b7df58	bl 0x00c41dc0
00b7df5c	mov w22,wzr
00b7df60	cbz x0,0x00b7defc
00b7df64	orr w8,wzr,#0xffff
00b7df68	strh w8,[x19, #0x8]
00b7df6c	ldr x0,[sp, #0x10]
00b7df70	cbnz x0,0x00b7df04
00b7df74	b 0x00b7df10
00b7df78	mov w22,#0xfffffffa
00b7df7c	ldr x0,[sp, #0x10]
00b7df80	cbnz x0,0x00b7df04
00b7df84	b 0x00b7df10
00b7df88	mov w0,#0x1
00b7df8c	mov w1,#0x8
00b7df90	bl 0x00c30a30
00b7df94	mov x22,x0
00b7df98	cbz x0,0x00b7dfdc
00b7df9c	ldr x23,[x19]
00b7dfa0	str w24,[sp, #0xc]
00b7dfa4	cbz x23,0x00b7dfc8
00b7dfa8	lsl x24,x25,#0x3
00b7dfac	mov x0,x22
00b7dfb0	mov x1,x23
00b7dfb4	mov x2,x24
00b7dfb8	bl 0x00c2ffd0
00b7dfbc	mov x0,x23
00b7dfc0	mov x1,x24
00b7dfc4	bl 0x00c42230
00b7dfc8	mov w8,#0x1
00b7dfcc	mov w2,#0x8
00b7dfd0	str x22,[x19]
00b7dfd4	strh w8,[x19, #0xa]
00b7dfd8	b 0x00b7de48
00b7dfdc	orr w22,wzr,#0xfffffff0
00b7dfe0	ldr x0,[sp, #0x10]
00b7dfe4	cbnz x0,0x00b7df04
00b7dfe8	b 0x00b7df10
00b7dfec	mov w22,#0xfffffffa
00b7dff0	ldr x0,[sp, #0x10]
00b7dff4	cbnz x0,0x00b7df04
00b7dff8	b 0x00b7df10
00b7dffc	bl 0x00c2fec0

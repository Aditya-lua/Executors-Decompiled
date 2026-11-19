; BN_GF2m_mod_solve_quad_arr @ 00a2d814
00a2d814	sub sp,sp,#0x80
00a2d818	stp x28,x27,[sp, #0x20]
00a2d81c	stp x26,x25,[sp, #0x30]
00a2d820	stp x24,x23,[sp, #0x40]
00a2d824	stp x22,x21,[sp, #0x50]
00a2d828	stp x20,x19,[sp, #0x60]
00a2d82c	stp x29,x30,[sp, #0x70]
00a2d830	ldr w8,[x2]
00a2d834	mov x20,x0
00a2d838	add x29,sp,#0x70
00a2d83c	cbz w8,0x00a2d8ac
00a2d840	mov x0,x3
00a2d844	mov x19,x3
00a2d848	mov x24,x2
00a2d84c	mov x25,x1
00a2d850	bl 0x00c38a90
00a2d854	mov x0,x19
00a2d858	bl 0x00c38a40
00a2d85c	mov x22,x0
00a2d860	mov x0,x19
00a2d864	bl 0x00c38a40
00a2d868	mov x21,x0
00a2d86c	mov x0,x19
00a2d870	bl 0x00c38a40
00a2d874	cbz x0,0x00a2e218
00a2d878	mov x23,x0
00a2d87c	mov x0,x22
00a2d880	mov x1,x25
00a2d884	mov x2,x24
00a2d888	bl 0x00a2b7b0
00a2d88c	cbz w0,0x00a2e218
00a2d890	mov x0,x22
00a2d894	bl 0x00c369b0
00a2d898	cbz w0,0x00a2d8bc
00a2d89c	mov x0,x20
00a2d8a0	bl 0x00c38e00
00a2d8a4	mov w20,#0x1
00a2d8a8	b 0x00a2e21c
00a2d8ac	mov x0,x20
00a2d8b0	bl 0x00c38e00
00a2d8b4	mov w20,#0x1
00a2d8b8	b 0x00a2e224
00a2d8bc	ldrb w8,[x24]
00a2d8c0	tbnz w8,#0x0,0x00a2ddb4
00a2d8c4	mov x0,x19
00a2d8c8	bl 0x00c38a40
00a2d8cc	mov x25,x0
00a2d8d0	mov x0,x19
00a2d8d4	bl 0x00c38a40
00a2d8d8	mov x26,x0
00a2d8dc	mov x0,x19
00a2d8e0	bl 0x00c38a40
00a2d8e4	str x0,[sp, #0x18]
00a2d8e8	cbz x0,0x00a2e218
00a2d8ec	mov w27,wzr
00a2d8f0	str x25,[sp, #0x10]
00a2d8f4	ldr w1,[x24]
00a2d8f8	mov x0,x25
00a2d8fc	mov w2,wzr
00a2d900	mov w3,wzr
00a2d904	mov w4,wzr
00a2d908	mov x5,x19
00a2d90c	bl 0x00c39150
00a2d910	cbz w0,0x00a2e218
00a2d914	mov x0,x25
00a2d918	mov x1,x25
00a2d91c	mov x2,x24
00a2d920	bl 0x00a2b7b0
00a2d924	cbz w0,0x00a2e218
00a2d928	mov x0,x21
00a2d92c	bl 0x00c38e00
00a2d930	mov x0,x23
00a2d934	mov x1,x25
00a2d938	bl 0x00c36990
00a2d93c	cbz x0,0x00a2e218
00a2d940	ldr w8,[x24]
00a2d944	ldr x25,[sp, #0x18]
00a2d948	str w27,[sp, #0xc]
00a2d94c	cmp w8,#0x2
00a2d950	b.lt 0x00a2dd60
00a2d954	mov w28,#0x1
00a2d958	mov x0,x21
00a2d95c	mov x1,x21
00a2d960	mov x2,x24
00a2d964	mov x3,x19
00a2d968	bl 0x00a2bec0
00a2d96c	cbz w0,0x00a2e218
00a2d970	mov x0,x26
00a2d974	mov x1,x23
00a2d978	mov x2,x24
00a2d97c	mov x3,x19
00a2d980	bl 0x00a2bec0
00a2d984	cbz w0,0x00a2e218
00a2d988	mov x0,x25
00a2d98c	mov x1,x26
00a2d990	mov x2,x22
00a2d994	mov x3,x24
00a2d998	mov x4,x19
00a2d99c	bl 0x00a2bc58
00a2d9a0	cbz w0,0x00a2e218
00a2d9a4	ldr w8,[x21, #0x8]
00a2d9a8	ldr w9,[x25, #0x8]
00a2d9ac	mov x0,x21
00a2d9b0	cmp w8,w9
00a2d9b4	csel x27,x25,x21,lt
00a2d9b8	ldr w1,[x27, #0x8]
00a2d9bc	csel x25,x21,x25,lt
00a2d9c0	bl 0x00c38e80
00a2d9c4	cbz x0,0x00a2e218
00a2d9c8	ldr w8,[x25, #0x8]
00a2d9cc	cmp w8,#0x1
00a2d9d0	b.lt 0x00a2da7c
00a2d9d4	ldr x9,[x27]
00a2d9d8	ldr x10,[x25]
00a2d9dc	ldr x11,[x21]
00a2d9e0	mov x13,xzr
00a2d9e4	cmp w8,#0x3
00a2d9e8	sxtw x12,w8
00a2d9ec	b.ls 0x00a2da88
00a2d9f0	lsl x13,x12,#0x3
00a2d9f4	add x15,x9,x13
00a2d9f8	add x14,x11,x13
00a2d9fc	cmp x11,x15
00a2da00	add x13,x10,x13
00a2da04	cset w15,cc
00a2da08	cmp x9,x14
00a2da0c	cset w16,cc
00a2da10	cmp x11,x13
00a2da14	cset w13,cc
00a2da18	cmp x10,x14
00a2da1c	and w15,w15,w16
00a2da20	cset w14,cc
00a2da24	tbnz w15,#0x0,0x00a2da84
00a2da28	and w14,w13,w14
00a2da2c	mov x13,xzr
00a2da30	tbnz w14,#0x0,0x00a2da88
00a2da34	and x13,x12,#-0x4
00a2da38	add x14,x9,#0x10
00a2da3c	add x15,x10,#0x10
00a2da40	add x16,x11,#0x10
00a2da44	mov x17,x13
00a2da48	ldp q0,q1,[x14, #-0x10]
00a2da4c	ldp q2,q3,[x15, #-0x10]
00a2da50	add x14,x14,#0x20
00a2da54	add x15,x15,#0x20
00a2da58	subs x17,x17,#0x4
00a2da5c	eor v0.16B,v2.16B,v0.16B
00a2da60	eor v1.16B,v3.16B,v1.16B
00a2da64	stp q0,q1,[x16, #-0x10]
00a2da68	add x16,x16,#0x20
00a2da6c	b.ne 0x00a2da48
00a2da70	cmp x13,x12
00a2da74	b.ne 0x00a2da88
00a2da78	b 0x00a2dab4
00a2da7c	mov w8,wzr
00a2da80	b 0x00a2dab4
00a2da84	mov x13,xzr
00a2da88	sub x12,x12,x13
00a2da8c	lsl x13,x13,#0x3
00a2da90	add x11,x11,x13
00a2da94	add x10,x10,x13
00a2da98	add x9,x9,x13
00a2da9c	ldr x13,[x9], #0x8
00a2daa0	ldr x14,[x10], #0x8
00a2daa4	subs x12,x12,#0x1
00a2daa8	eor x13,x14,x13
00a2daac	str x13,[x11], #0x8
00a2dab0	b.ne 0x00a2da9c
00a2dab4	ldr w9,[x27, #0x8]
00a2dab8	cmp w8,w9
00a2dabc	b.ge 0x00a2db68
00a2dac0	ldr x10,[x27]
00a2dac4	ldr x11,[x21]
00a2dac8	sub w12,w9,#0x1
00a2dacc	sub w12,w12,w8
00a2dad0	add x13,x12,#0x1
00a2dad4	cmp x13,#0x3
00a2dad8	mov w8,w8
00a2dadc	b.ls 0x00a2db50
00a2dae0	add x16,x8,x12
00a2dae4	lsl x16,x16,#0x3
00a2dae8	lsl x15,x8,#0x3
00a2daec	add x17,x10,x16
00a2daf0	add x14,x11,x15
00a2daf4	add x17,x17,#0x8
00a2daf8	cmp x14,x17
00a2dafc	add x15,x10,x15
00a2db00	b.cs 0x00a2db14
00a2db04	add x16,x11,x16
00a2db08	add x16,x16,#0x8
00a2db0c	cmp x15,x16
00a2db10	b.cc 0x00a2db50
00a2db14	add w16,w12,#0x1
00a2db18	add x17,x12,#0x1
00a2db1c	and w12,w16,#0x3
00a2db20	sub x13,x13,x12
00a2db24	add x14,x14,#0x10
00a2db28	add x15,x15,#0x10
00a2db2c	add x8,x13,x8
00a2db30	sub x13,x17,x12
00a2db34	ldp q0,q1,[x15, #-0x10]
00a2db38	subs x13,x13,#0x4
00a2db3c	add x15,x15,#0x20
00a2db40	stp q0,q1,[x14, #-0x10]
00a2db44	add x14,x14,#0x20
00a2db48	b.ne 0x00a2db34
00a2db4c	cbz w12,0x00a2db68
00a2db50	lsl x12,x8,#0x3
00a2db54	ldr x13,[x10, x12#0x0]
00a2db58	add x8,x8,#0x1
00a2db5c	cmp w9,w8
00a2db60	str x13,[x11, x12#0x0]
00a2db64	b.gt 0x00a2db50
00a2db68	mov x0,x21
00a2db6c	str w9,[x21, #0x8]
00a2db70	bl 0x00c38e40
00a2db74	ldr x10,[sp, #0x10]
00a2db78	ldr w8,[x26, #0x8]
00a2db7c	mov x0,x23
00a2db80	ldr w9,[x10, #0x8]
00a2db84	cmp w8,w9
00a2db88	csel x27,x10,x26,lt
00a2db8c	ldr w1,[x27, #0x8]
00a2db90	csel x25,x26,x10,lt
00a2db94	bl 0x00c38e80
00a2db98	cbz x0,0x00a2e218
00a2db9c	ldr w8,[x25, #0x8]
00a2dba0	cmp w8,#0x1
00a2dba4	b.lt 0x00a2dc54
00a2dba8	ldr x9,[x27]
00a2dbac	ldr x10,[x25]
00a2dbb0	ldr x11,[x23]
00a2dbb4	ldr x25,[sp, #0x18]
00a2dbb8	mov x13,xzr
00a2dbbc	cmp w8,#0x3
00a2dbc0	sxtw x12,w8
00a2dbc4	b.ls 0x00a2dc64
00a2dbc8	lsl x13,x12,#0x3
00a2dbcc	add x15,x9,x13
00a2dbd0	add x14,x11,x13
00a2dbd4	cmp x11,x15
00a2dbd8	add x13,x10,x13
00a2dbdc	cset w15,cc
00a2dbe0	cmp x9,x14
00a2dbe4	cset w16,cc
00a2dbe8	cmp x11,x13
00a2dbec	cset w13,cc
00a2dbf0	cmp x10,x14
00a2dbf4	and w15,w15,w16
00a2dbf8	cset w14,cc
00a2dbfc	tbnz w15,#0x0,0x00a2dc60
00a2dc00	and w14,w13,w14
00a2dc04	mov x13,xzr
00a2dc08	tbnz w14,#0x0,0x00a2dc64
00a2dc0c	and x13,x12,#-0x4
00a2dc10	add x14,x9,#0x10
00a2dc14	add x15,x10,#0x10
00a2dc18	add x16,x11,#0x10
00a2dc1c	mov x17,x13
00a2dc20	ldp q0,q1,[x14, #-0x10]
00a2dc24	ldp q2,q3,[x15, #-0x10]
00a2dc28	add x14,x14,#0x20
00a2dc2c	add x15,x15,#0x20
00a2dc30	subs x17,x17,#0x4
00a2dc34	eor v0.16B,v2.16B,v0.16B
00a2dc38	eor v1.16B,v3.16B,v1.16B
00a2dc3c	stp q0,q1,[x16, #-0x10]
00a2dc40	add x16,x16,#0x20
00a2dc44	b.ne 0x00a2dc20
00a2dc48	cmp x13,x12
00a2dc4c	b.ne 0x00a2dc64
00a2dc50	b 0x00a2dc90
00a2dc54	ldr x25,[sp, #0x18]
00a2dc58	mov w8,wzr
00a2dc5c	b 0x00a2dc90
00a2dc60	mov x13,xzr
00a2dc64	sub x12,x12,x13
00a2dc68	lsl x13,x13,#0x3
00a2dc6c	add x11,x11,x13
00a2dc70	add x10,x10,x13
00a2dc74	add x9,x9,x13
00a2dc78	ldr x13,[x9], #0x8
00a2dc7c	ldr x14,[x10], #0x8
00a2dc80	subs x12,x12,#0x1
00a2dc84	eor x13,x14,x13
00a2dc88	str x13,[x11], #0x8
00a2dc8c	b.ne 0x00a2dc78
00a2dc90	ldr w9,[x27, #0x8]
00a2dc94	cmp w8,w9
00a2dc98	b.ge 0x00a2dd44
00a2dc9c	ldr x10,[x27]
00a2dca0	ldr x11,[x23]
00a2dca4	sub w12,w9,#0x1
00a2dca8	sub w12,w12,w8
00a2dcac	add x13,x12,#0x1
00a2dcb0	cmp x13,#0x3
00a2dcb4	mov w8,w8
00a2dcb8	b.ls 0x00a2dd2c
00a2dcbc	add x16,x8,x12
00a2dcc0	lsl x16,x16,#0x3
00a2dcc4	lsl x15,x8,#0x3
00a2dcc8	add x17,x10,x16
00a2dccc	add x14,x11,x15
00a2dcd0	add x17,x17,#0x8
00a2dcd4	cmp x14,x17
00a2dcd8	add x15,x10,x15
00a2dcdc	b.cs 0x00a2dcf0
00a2dce0	add x16,x11,x16
00a2dce4	add x16,x16,#0x8
00a2dce8	cmp x15,x16
00a2dcec	b.cc 0x00a2dd2c
00a2dcf0	add w16,w12,#0x1
00a2dcf4	add x17,x12,#0x1
00a2dcf8	and w12,w16,#0x3
00a2dcfc	sub x13,x13,x12
00a2dd00	add x14,x14,#0x10
00a2dd04	add x15,x15,#0x10
00a2dd08	add x8,x13,x8
00a2dd0c	sub x13,x17,x12
00a2dd10	ldp q0,q1,[x15, #-0x10]
00a2dd14	subs x13,x13,#0x4
00a2dd18	add x15,x15,#0x20
00a2dd1c	stp q0,q1,[x14, #-0x10]
00a2dd20	add x14,x14,#0x20
00a2dd24	b.ne 0x00a2dd10
00a2dd28	cbz w12,0x00a2dd44
00a2dd2c	lsl x12,x8,#0x3
00a2dd30	ldr x13,[x10, x12#0x0]
00a2dd34	add x8,x8,#0x1
00a2dd38	cmp w9,w8
00a2dd3c	str x13,[x11, x12#0x0]
00a2dd40	b.gt 0x00a2dd2c
00a2dd44	mov x0,x23
00a2dd48	str w9,[x23, #0x8]
00a2dd4c	bl 0x00c38e40
00a2dd50	ldr w8,[x24]
00a2dd54	add w28,w28,#0x1
00a2dd58	cmp w28,w8
00a2dd5c	b.lt 0x00a2d958
00a2dd60	ldr w27,[sp, #0xc]
00a2dd64	mov x0,x23
00a2dd68	add w27,w27,#0x1
00a2dd6c	bl 0x00c369b0
00a2dd70	ldr x25,[sp, #0x10]
00a2dd74	cmp w27,#0x31
00a2dd78	b.hi 0x00a2dd80
00a2dd7c	cbnz w0,0x00a2d8f4
00a2dd80	mov x0,x23
00a2dd84	bl 0x00c369b0
00a2dd88	cbz w0,0x00a2ddd0
00a2dd8c	bl 0x00c342a0
00a2dd90	adrp x0,0x2d9000
00a2dd94	adrp x2,0x2b9000
00a2dd98	add x0,x0,#0xb49
00a2dd9c	add x2,x2,#0xc3a
00a2dda0	mov w1,#0x43a
00a2dda4	bl 0x00c342b0
00a2dda8	orr w0,wzr,#0x3
00a2ddac	mov w1,#0x71
00a2ddb0	b 0x00a2e210
00a2ddb4	mov x0,x21
00a2ddb8	mov x1,x22
00a2ddbc	bl 0x00c36990
00a2ddc0	cbz x0,0x00a2e218
00a2ddc4	ldr w8,[x24]
00a2ddc8	cmp w8,#0x3
00a2ddcc	b.ge 0x00a2dec0
00a2ddd0	mov x0,x23
00a2ddd4	mov x1,x21
00a2ddd8	mov x2,x24
00a2dddc	mov x3,x19
00a2dde0	bl 0x00a2bec0
00a2dde4	cbz w0,0x00a2e218
00a2dde8	ldr w8,[x21, #0x8]
00a2ddec	ldr w9,[x23, #0x8]
00a2ddf0	mov x0,x23
00a2ddf4	cmp w8,w9
00a2ddf8	csel x24,x23,x21,lt
00a2ddfc	ldr w1,[x24, #0x8]
00a2de00	csel x25,x21,x23,lt
00a2de04	bl 0x00c38e80
00a2de08	cbz x0,0x00a2e218
00a2de0c	ldr w8,[x25, #0x8]
00a2de10	cmp w8,#0x1
00a2de14	b.lt 0x00a2e0e4
00a2de18	ldr x9,[x24]
00a2de1c	ldr x10,[x25]
00a2de20	ldr x11,[x23]
00a2de24	mov x13,xzr
00a2de28	cmp w8,#0x3
00a2de2c	sxtw x12,w8
00a2de30	b.ls 0x00a2e0f0
00a2de34	lsl x13,x12,#0x3
00a2de38	add x15,x9,x13
00a2de3c	add x14,x11,x13
00a2de40	cmp x11,x15
00a2de44	add x13,x10,x13
00a2de48	cset w15,cc
00a2de4c	cmp x9,x14
00a2de50	cset w16,cc
00a2de54	cmp x11,x13
00a2de58	cset w13,cc
00a2de5c	cmp x10,x14
00a2de60	and w15,w15,w16
00a2de64	cset w14,cc
00a2de68	tbnz w15,#0x0,0x00a2e0ec
00a2de6c	and w14,w13,w14
00a2de70	mov x13,xzr
00a2de74	tbnz w14,#0x0,0x00a2e0f0
00a2de78	and x13,x12,#-0x4
00a2de7c	add x14,x9,#0x10
00a2de80	add x15,x10,#0x10
00a2de84	add x16,x11,#0x10
00a2de88	mov x17,x13
00a2de8c	ldp q0,q1,[x14, #-0x10]
00a2de90	ldp q2,q3,[x15, #-0x10]
00a2de94	add x14,x14,#0x20
00a2de98	add x15,x15,#0x20
00a2de9c	subs x17,x17,#0x4
00a2dea0	eor v0.16B,v2.16B,v0.16B
00a2dea4	eor v1.16B,v3.16B,v1.16B
00a2dea8	stp q0,q1,[x16, #-0x10]
00a2deac	add x16,x16,#0x20
00a2deb0	b.ne 0x00a2de8c
00a2deb4	cmp x13,x12
00a2deb8	b.ne 0x00a2e0f0
00a2debc	b 0x00a2e11c
00a2dec0	mov w25,#0x1
00a2dec4	mov x0,x21
00a2dec8	mov x1,x21
00a2decc	mov x2,x24
00a2ded0	mov x3,x19
00a2ded4	bl 0x00a2bec0
00a2ded8	cbz w0,0x00a2e218
00a2dedc	mov x0,x21
00a2dee0	mov x1,x21
00a2dee4	mov x2,x24
00a2dee8	mov x3,x19
00a2deec	bl 0x00a2bec0
00a2def0	cbz w0,0x00a2e218
00a2def4	ldr w8,[x21, #0x8]
00a2def8	ldr w9,[x22, #0x8]
00a2defc	mov x0,x21
00a2df00	cmp w8,w9
00a2df04	csel x26,x22,x21,lt
00a2df08	ldr w1,[x26, #0x8]
00a2df0c	csel x27,x21,x22,lt
00a2df10	bl 0x00c38e80
00a2df14	cbz x0,0x00a2e218
00a2df18	ldr w8,[x27, #0x8]
00a2df1c	cmp w8,#0x1
00a2df20	b.lt 0x00a2dfcc
00a2df24	ldr x9,[x26]
00a2df28	ldr x10,[x27]
00a2df2c	ldr x11,[x21]
00a2df30	mov x13,xzr
00a2df34	cmp w8,#0x3
00a2df38	sxtw x12,w8
00a2df3c	b.ls 0x00a2dfd8
00a2df40	lsl x13,x12,#0x3
00a2df44	add x15,x9,x13
00a2df48	add x14,x11,x13
00a2df4c	cmp x11,x15
00a2df50	add x13,x10,x13
00a2df54	cset w15,cc
00a2df58	cmp x9,x14
00a2df5c	cset w16,cc
00a2df60	cmp x11,x13
00a2df64	cset w13,cc
00a2df68	cmp x10,x14
00a2df6c	and w15,w15,w16
00a2df70	cset w14,cc
00a2df74	tbnz w15,#0x0,0x00a2dfd4
00a2df78	and w14,w13,w14
00a2df7c	mov x13,xzr
00a2df80	tbnz w14,#0x0,0x00a2dfd8
00a2df84	and x13,x12,#-0x4
00a2df88	add x14,x9,#0x10
00a2df8c	add x15,x10,#0x10
00a2df90	add x16,x11,#0x10
00a2df94	mov x17,x13
00a2df98	ldp q0,q1,[x14, #-0x10]
00a2df9c	ldp q2,q3,[x15, #-0x10]
00a2dfa0	add x14,x14,#0x20
00a2dfa4	add x15,x15,#0x20
00a2dfa8	subs x17,x17,#0x4
00a2dfac	eor v0.16B,v2.16B,v0.16B
00a2dfb0	eor v1.16B,v3.16B,v1.16B
00a2dfb4	stp q0,q1,[x16, #-0x10]
00a2dfb8	add x16,x16,#0x20
00a2dfbc	b.ne 0x00a2df98
00a2dfc0	cmp x13,x12
00a2dfc4	b.ne 0x00a2dfd8
00a2dfc8	b 0x00a2e004
00a2dfcc	mov w8,wzr
00a2dfd0	b 0x00a2e004
00a2dfd4	mov x13,xzr
00a2dfd8	sub x12,x12,x13
00a2dfdc	lsl x13,x13,#0x3
00a2dfe0	add x11,x11,x13
00a2dfe4	add x10,x10,x13
00a2dfe8	add x9,x9,x13
00a2dfec	ldr x13,[x9], #0x8
00a2dff0	ldr x14,[x10], #0x8
00a2dff4	subs x12,x12,#0x1
00a2dff8	eor x13,x14,x13
00a2dffc	str x13,[x11], #0x8
00a2e000	b.ne 0x00a2dfec
00a2e004	ldr w9,[x26, #0x8]
00a2e008	cmp w8,w9
00a2e00c	b.ge 0x00a2e0b8
00a2e010	ldr x10,[x26]
00a2e014	ldr x11,[x21]
00a2e018	sub w12,w9,#0x1
00a2e01c	sub w12,w12,w8
00a2e020	add x13,x12,#0x1
00a2e024	cmp x13,#0x3
00a2e028	mov w8,w8
00a2e02c	b.ls 0x00a2e0a0
00a2e030	add x16,x8,x12
00a2e034	lsl x16,x16,#0x3
00a2e038	lsl x15,x8,#0x3
00a2e03c	add x17,x10,x16
00a2e040	add x14,x11,x15
00a2e044	add x17,x17,#0x8
00a2e048	cmp x14,x17
00a2e04c	add x15,x10,x15
00a2e050	b.cs 0x00a2e064
00a2e054	add x16,x11,x16
00a2e058	add x16,x16,#0x8
00a2e05c	cmp x15,x16
00a2e060	b.cc 0x00a2e0a0
00a2e064	add w16,w12,#0x1
00a2e068	add x17,x12,#0x1
00a2e06c	and w12,w16,#0x3
00a2e070	sub x13,x13,x12
00a2e074	add x14,x14,#0x10
00a2e078	add x15,x15,#0x10
00a2e07c	add x8,x13,x8
00a2e080	sub x13,x17,x12
00a2e084	ldp q0,q1,[x15, #-0x10]
00a2e088	subs x13,x13,#0x4
00a2e08c	add x15,x15,#0x20
00a2e090	stp q0,q1,[x14, #-0x10]
00a2e094	add x14,x14,#0x20
00a2e098	b.ne 0x00a2e084
00a2e09c	cbz w12,0x00a2e0b8
00a2e0a0	lsl x12,x8,#0x3
00a2e0a4	ldr x13,[x10, x12#0x0]
00a2e0a8	add x8,x8,#0x1
00a2e0ac	cmp w9,w8
00a2e0b0	str x13,[x11, x12#0x0]
00a2e0b4	b.gt 0x00a2e0a0
00a2e0b8	mov x0,x21
00a2e0bc	str w9,[x21, #0x8]
00a2e0c0	bl 0x00c38e40
00a2e0c4	ldr w8,[x24]
00a2e0c8	sub w9,w8,#0x1
00a2e0cc	cmp w9,#0x0
00a2e0d0	csel w8,w8,w9,lt
00a2e0d4	cmp w25,w8, ASR #0x1
00a2e0d8	add w25,w25,#0x1
00a2e0dc	b.lt 0x00a2dec4
00a2e0e0	b 0x00a2ddd0
00a2e0e4	mov w8,wzr
00a2e0e8	b 0x00a2e11c
00a2e0ec	mov x13,xzr
00a2e0f0	sub x12,x12,x13
00a2e0f4	lsl x13,x13,#0x3
00a2e0f8	add x11,x11,x13
00a2e0fc	add x10,x10,x13
00a2e100	add x9,x9,x13
00a2e104	ldr x13,[x9], #0x8
00a2e108	ldr x14,[x10], #0x8
00a2e10c	subs x12,x12,#0x1
00a2e110	eor x13,x14,x13
00a2e114	str x13,[x11], #0x8
00a2e118	b.ne 0x00a2e104
00a2e11c	ldr w9,[x24, #0x8]
00a2e120	cmp w8,w9
00a2e124	b.ge 0x00a2e1d0
00a2e128	ldr x10,[x24]
00a2e12c	ldr x11,[x23]
00a2e130	sub w12,w9,#0x1
00a2e134	sub w13,w12,w8
00a2e138	add x12,x13,#0x1
00a2e13c	cmp x12,#0x3
00a2e140	mov w8,w8
00a2e144	b.ls 0x00a2e1b8
00a2e148	add x15,x8,x13
00a2e14c	lsl x15,x15,#0x3
00a2e150	lsl x14,x8,#0x3
00a2e154	add x15,x15,#0x8
00a2e158	add x16,x11,x14
00a2e15c	add x17,x10,x15
00a2e160	cmp x16,x17
00a2e164	b.cs 0x00a2e178
00a2e168	add x15,x11,x15
00a2e16c	add x16,x10,x14
00a2e170	cmp x16,x15
00a2e174	b.cc 0x00a2e1b8
00a2e178	add w15,w13,#0x1
00a2e17c	add x17,x13,#0x1
00a2e180	and w13,w15,#0x3
00a2e184	add x16,x14,#0x10
00a2e188	sub x12,x12,x13
00a2e18c	add x14,x11,x16
00a2e190	add x15,x10,x16
00a2e194	add x8,x12,x8
00a2e198	sub x12,x17,x13
00a2e19c	ldp q0,q1,[x15, #-0x10]
00a2e1a0	subs x12,x12,#0x4
00a2e1a4	add x15,x15,#0x20
00a2e1a8	stp q0,q1,[x14, #-0x10]
00a2e1ac	add x14,x14,#0x20
00a2e1b0	b.ne 0x00a2e19c
00a2e1b4	cbz w13,0x00a2e1d0
00a2e1b8	lsl x12,x8,#0x3
00a2e1bc	ldr x13,[x10, x12#0x0]
00a2e1c0	add x8,x8,#0x1
00a2e1c4	cmp w9,w8
00a2e1c8	str x13,[x11, x12#0x0]
00a2e1cc	b.gt 0x00a2e1b8
00a2e1d0	mov x0,x23
00a2e1d4	str w9,[x23, #0x8]
00a2e1d8	bl 0x00c38e40
00a2e1dc	mov x0,x23
00a2e1e0	mov x1,x22
00a2e1e4	bl 0x00c369c0
00a2e1e8	cbz w0,0x00a2e248
00a2e1ec	bl 0x00c342a0
00a2e1f0	adrp x0,0x2d9000
00a2e1f4	adrp x2,0x2b9000
00a2e1f8	add x0,x0,#0xb49
00a2e1fc	add x2,x2,#0xc3a
00a2e200	mov w1,#0x444
00a2e204	bl 0x00c342b0
00a2e208	orr w0,wzr,#0x3
00a2e20c	mov w1,#0x74
00a2e210	mov x2,xzr
00a2e214	bl 0x00c342c0
00a2e218	mov w20,wzr
00a2e21c	mov x0,x19
00a2e220	bl 0x00c38a20
00a2e224	mov w0,w20
00a2e228	ldp x29,x30,[sp, #0x70]
00a2e22c	ldp x20,x19,[sp, #0x60]
00a2e230	ldp x22,x21,[sp, #0x50]
00a2e234	ldp x24,x23,[sp, #0x40]
00a2e238	ldp x26,x25,[sp, #0x30]
00a2e23c	ldp x28,x27,[sp, #0x20]
00a2e240	add sp,sp,#0x80
00a2e244	ret
00a2e248	mov x0,x20
00a2e24c	mov x1,x21
00a2e250	bl 0x00c36990
00a2e254	cmp x0,#0x0
00a2e258	cset w20,ne
00a2e25c	b 0x00a2e21c

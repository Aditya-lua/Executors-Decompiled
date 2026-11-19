; FUN_0086dc74 @ 0086dc74
0086dc74	sub sp,sp,#0x120
0086dc78	stp x29,x30,[sp, #0xc0]
0086dc7c	stp x28,x27,[sp, #0xd0]
0086dc80	stp x26,x25,[sp, #0xe0]
0086dc84	stp x24,x23,[sp, #0xf0]
0086dc88	stp x22,x21,[sp, #0x100]
0086dc8c	stp x20,x19,[sp, #0x110]
0086dc90	add x29,sp,#0xc0
0086dc94	mrs x8,tpidr_el0
0086dc98	mov x19,x0
0086dc9c	mov x21,x1
0086dca0	str x8,[sp, #0x28]
0086dca4	ldr x8,[x8, #0x28]
0086dca8	stur x8,[x29, #-0x10]
0086dcac	ldr w8,[x0, #0x90]
0086dcb0	cmp w8,#0x119
0086dcb4	b.ne 0x0086dcd8
0086dcb8	ldr x0,[x19, #0xa8]
0086dcbc	cbz x0,0x0086dcd8
0086dcc0	adrp x1,0x2d2000
0086dcc4	add x1,x1,#0xbdf
0086dcc8	bl 0x00c301f0
0086dccc	cmp w0,#0x0
0086dcd0	cset w20,eq
0086dcd4	b 0x0086dcdc
0086dcd8	mov w20,wzr
0086dcdc	ldur q0,[x19, #0x94]
0086dce0	mov w8,#0x1
0086dce4	mov x0,x19
0086dce8	sturb w8,[x29, #-0x20]
0086dcec	stur q0,[x29, #-0x30]
0086dcf0	bl 0x00858f2c
0086dcf4	add x8,sp,#0x60
0086dcf8	mov x0,x19
0086dcfc	mov w1,w20
0086dd00	bl 0x00860d94
0086dd04	ldr w8,[x19, #0x90]
0086dd08	cmp w8,#0x2c
0086dd0c	b.ne 0x0086dd28
0086dd10	adrp x2,0x2be000
0086dd14	add x2,x2,#0xe33
0086dd18	add x1,x19,#0x94
0086dd1c	mov x0,x19
0086dd20	bl 0x00860ecc
0086dd24	ldr w8,[x19, #0x90]
0086dd28	cmp w8,#0x3d
0086dd2c	strb wzr,[sp, #0x40]
0086dd30	strb wzr,[sp, #0x50]
0086dd34	b.ne 0x0086dd54
0086dd38	mov x0,x19
0086dd3c	bl 0x00858f2c
0086dd40	ldr q0,[x19, #0xb0]
0086dd44	mov w8,#0x1
0086dd48	strb w8,[sp, #0x50]
0086dd4c	str q0,[sp, #0x40]
0086dd50	b 0x0086dd68
0086dd54	adrp x2,0x2d6000
0086dd58	add x2,x2,#0xf96
0086dd5c	mov x0,x19
0086dd60	mov w1,#0x3d
0086dd64	bl 0x0086e3b4
0086dd68	mov x0,x19
0086dd6c	mov w1,wzr
0086dd70	bl 0x0086060c
0086dd74	ldr w22,[x19, #0x90]
0086dd78	str x0,[sp, #0x20]
0086dd7c	cmp w22,#0x134
0086dd80	b.ne 0x0086dd94
0086dd84	mov x0,x19
0086dd88	bl 0x00858f2c
0086dd8c	ldr x8,[x19, #0xb0]
0086dd90	b 0x0086ddac
0086dd94	adrp x2,0x2ae000
0086dd98	add x2,x2,#0xfcf
0086dd9c	mov x0,x19
0086dda0	mov w1,#0x134
0086dda4	bl 0x0086e3b4
0086dda8	mov x8,#-0x1
0086ddac	str x8,[sp, #0x18]
0086ddb0	ldp x9,x8,[x19, #0x1b8]
0086ddb4	add x0,x19,#0x180
0086ddb8	add x1,sp,#0x60
0086ddbc	sub x23,x8,x9
0086ddc0	bl 0x0086e18c
0086ddc4	ldp x8,x25,[x19, #0x158]
0086ddc8	mov x24,x0
0086ddcc	ldr x0,[x19, #0xe8]
0086ddd0	mov w1,#0x40
0086ddd4	sub x8,x25,x8
0086ddd8	asr x8,x8,#0x3
0086dddc	sub x26,x8,#0x1
0086dde0	bl 0x0084e938
0086dde4	ldr x8,[sp, #0x60]
0086dde8	ldr x9,[sp, #0x78]
0086ddec	mov x1,x24
0086ddf0	ldr x10,[x24]
0086ddf4	ldur w11,[x25, #-0x4]
0086ddf8	ldrb w12,[sp, #0x88]
0086ddfc	str x8,[x0]
0086de00	ldur q0,[sp, #0x68]
0086de04	stp x10,x26,[x0, #0x18]
0086de08	str x11,[x0, #0x28]
0086de0c	strb w12,[x0, #0x30]
0086de10	stur q0,[x0, #0x8]
0086de14	strb wzr,[x0, #0x31]
0086de18	str x9,[x0, #0x38]
0086de1c	str x0,[x24]
0086de20	add x0,x19,#0x1b8
0086de24	bl 0x0086e2d0
0086de28	ldr x24,[x24]
0086de2c	mov x0,x19
0086de30	mov w1,wzr
0086de34	bl 0x0086060c
0086de38	ldp x9,x8,[x19, #0x1b8]
0086de3c	ubfx x23,x23,#0x3,#0x20
0086de40	mov x25,x0
0086de44	sub x8,x8,x9
0086de48	asr x8,x8,#0x3
0086de4c	cmp x8,x23
0086de50	b.ls 0x0086de8c
0086de54	ldr x9,[x19, #0x1b8]
0086de58	add x0,x19,#0x180
0086de5c	sub x27,x8,#0x1
0086de60	add x9,x9,x8, LSL #0x3
0086de64	ldur x1,[x9, #-0x8]
0086de68	ldr x26,[x1, #0x18]
0086de6c	bl 0x0086e18c
0086de70	cmp x27,x23
0086de74	mov x8,x27
0086de78	str x26,[x0]
0086de7c	b.hi 0x0086de54
0086de80	ldp x9,x8,[x19, #0x1b8]
0086de84	sub x8,x8,x9
0086de88	asr x8,x8,#0x3
0086de8c	subs x1,x23,x8
0086de90	b.ls 0x0086dea0
0086de94	add x0,x19,#0x1b8
0086de98	bl 0x00870174
0086de9c	b 0x0086deac
0086dea0	b.cs 0x0086deac
0086dea4	add x8,x9,x23, LSL #0x3
0086dea8	str x8,[x19, #0x1c0]
0086deac	ldr w23,[x19, #0x90]
0086deb0	ldur x26,[x19, #0x94]
0086deb4	cmp w23,#0x127
0086deb8	b.ne 0x0086def0
0086debc	ldr w27,[x19, #0x124]
0086dec0	adrp x8,0xd1e000
0086dec4	ldr w8,[x8, #0xba0]
0086dec8	add w9,w27,#0x1
0086decc	cmp w9,w8
0086ded0	str w9,[x19, #0x124]
0086ded4	b.hi 0x0086e010
0086ded8	mov x0,x19
0086dedc	bl 0x0086d8c0
0086dee0	mov x28,x0
0086dee4	str w27,[x19, #0x124]
0086dee8	mov w27,#0x1
0086deec	b 0x0086df2c
0086def0	cmp w23,#0x126
0086def4	cset w27,eq
0086def8	b.ne 0x0086df08
0086defc	mov x0,x19
0086df00	bl 0x00858f2c
0086df04	b 0x0086df1c
0086df08	adrp x2,0x2ae000
0086df0c	add x2,x2,#0xfcf
0086df10	mov x0,x19
0086df14	mov w1,#0x126
0086df18	bl 0x0086e3b4
0086df1c	mov x0,x19
0086df20	mov w1,wzr
0086df24	bl 0x0086060c
0086df28	mov x28,x0
0086df2c	ldr x8,[x21]
0086df30	ldur x9,[x28, #0x14]
0086df34	cmp w22,#0x134
0086df38	ldr x0,[x19, #0xe8]
0086df3c	mov w1,#0x80
0086df40	cset w22,eq
0086df44	stp x8,x9,[sp, #0x30]
0086df48	bl 0x0084e938
0086df4c	ldr x2,[sp, #0x20]
0086df50	add x8,sp,#0x40
0086df54	sub x9,x29,#0x30
0086df58	add x1,sp,#0x30
0086df5c	mov w3,w22
0086df60	mov x4,x25
0086df64	mov w5,w27
0086df68	mov x6,x28
0086df6c	mov x7,x24
0086df70	mov x21,x0
0086df74	stp x9,x8,[sp, #0x8]
0086df78	strb w20,[sp]
0086df7c	bl 0x0084f4b8
0086df80	ldrb w8,[x19, #0x68]
0086df84	cmp w8,#0x1
0086df88	b.ne 0x0086dfd8
0086df8c	ldp x8,x9,[sp, #0x78]
0086df90	cmp w23,#0x127
0086df94	ldr x0,[x19, #0xe8]
0086df98	cset w20,eq
0086df9c	mov w1,#0x20
0086dfa0	cmp x8,#0x0
0086dfa4	csinv x22,x9,xzr,ne
0086dfa8	bl 0x0084e938
0086dfac	ldr x1,[sp, #0x18]
0086dfb0	mov x2,x26
0086dfb4	mov w3,w20
0086dfb8	mov x4,x22
0086dfbc	mov x23,x0
0086dfc0	bl 0x00851e98
0086dfc4	add x0,x19,#0x4b0
0086dfc8	add x1,sp,#0x30
0086dfcc	str x21,[sp, #0x30]
0086dfd0	bl 0x00860fa0
0086dfd4	str x23,[x0]
0086dfd8	ldr x8,[sp, #0x28]
0086dfdc	ldr x8,[x8, #0x28]
0086dfe0	ldur x9,[x29, #-0x10]
0086dfe4	cmp x8,x9
0086dfe8	b.ne 0x0086e03c
0086dfec	mov x0,x21
0086dff0	ldp x20,x19,[sp, #0x110]
0086dff4	ldp x22,x21,[sp, #0x100]
0086dff8	ldp x24,x23,[sp, #0xf0]
0086dffc	ldp x26,x25,[sp, #0xe0]
0086e000	ldp x28,x27,[sp, #0xd0]
0086e004	ldp x29,x30,[sp, #0xc0]
0086e008	add sp,sp,#0x120
0086e00c	ret
0086e010	ldr x8,[sp, #0x28]
0086e014	ldr x8,[x8, #0x28]
0086e018	ldur x9,[x29, #-0x10]
0086e01c	cmp x8,x9
0086e020	b.ne 0x0086e03c
0086e024	adrp x1,0x2a1000
0086e028	add x1,x1,#0x5df
0086e02c	adrp x2,0x2d4000
0086e030	add x2,x2,#0xdc3
0086e034	add x0,x19,#0x94
0086e038	bl 0x008578f8
0086e03c	bl 0x00c2fec0

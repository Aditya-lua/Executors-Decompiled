; BF_cbc_encrypt @ 00a8dc94
00a8dc94	sub sp,sp,#0x90
00a8dc98	stp x28,x27,[sp, #0x30]
00a8dc9c	stp x26,x25,[sp, #0x40]
00a8dca0	stp x24,x23,[sp, #0x50]
00a8dca4	stp x22,x21,[sp, #0x60]
00a8dca8	stp x20,x19,[sp, #0x70]
00a8dcac	stp x29,x30,[sp, #0x80]
00a8dcb0	ldp w8,w9,[x4]
00a8dcb4	mov x19,x4
00a8dcb8	mov x21,x3
00a8dcbc	mov x23,x2
00a8dcc0	mov x28,x1
00a8dcc4	mov x22,x0
00a8dcc8	rev w26,w8
00a8dccc	rev w24,w9
00a8dcd0	subs x8,x2,#0x8
00a8dcd4	add x29,sp,#0x80
00a8dcd8	cbz w5,0x00a8de50
00a8dcdc	b.lt 0x00a8dd90
00a8dce0	str x8,[sp, #0x18]
00a8dce4	mvn x8,x23
00a8dce8	orr x9,xzr,#-0x10
00a8dcec	cmn x8,#0x10
00a8dcf0	csinv x8,x9,x23,le
00a8dcf4	add x8,x8,x23
00a8dcf8	add x8,x8,#0x8
00a8dcfc	and x27,x8,#-0x8
00a8dd00	add x25,x27,#0x8
00a8dd04	add x8,x22,x25
00a8dd08	add x23,x23,#0x8
00a8dd0c	mov x20,x28
00a8dd10	str x8,[sp, #0x20]
00a8dd14	ldp w8,w9,[x22], #0x8
00a8dd18	add x0,sp,#0x28
00a8dd1c	mov x1,x21
00a8dd20	rev w8,w8
00a8dd24	rev w9,w9
00a8dd28	eor w8,w8,w26
00a8dd2c	eor w9,w9,w24
00a8dd30	stp w8,w9,[sp, #0x28]
00a8dd34	bl 0x00a8d41c
00a8dd38	ldp w26,w24,[sp, #0x28]
00a8dd3c	sub x23,x23,#0x8
00a8dd40	cmp x23,#0xf
00a8dd44	lsr w8,w26,#0x18
00a8dd48	strb w8,[x20]
00a8dd4c	lsr w8,w26,#0x10
00a8dd50	strb w8,[x20, #0x1]
00a8dd54	lsr w8,w26,#0x8
00a8dd58	strb w8,[x20, #0x2]
00a8dd5c	lsr w8,w24,#0x18
00a8dd60	strb w8,[x20, #0x4]
00a8dd64	lsr w8,w24,#0x10
00a8dd68	strb w8,[x20, #0x5]
00a8dd6c	lsr w8,w24,#0x8
00a8dd70	strb w26,[x20, #0x3]
00a8dd74	strb w24,[x20, #0x7]
00a8dd78	strb w8,[x20, #0x6]
00a8dd7c	add x20,x20,#0x8
00a8dd80	b.gt 0x00a8dd14
00a8dd84	ldp x8,x22,[sp, #0x18]
00a8dd88	add x28,x28,x25
00a8dd8c	sub x23,x8,x27
00a8dd90	cbz x23,0x00a8dfa4
00a8dd94	sub x9,x23,#0x1
00a8dd98	cmp x9,#0x6
00a8dd9c	mov w8,wzr
00a8dda0	b.hi 0x00a8e004
00a8dda4	adrp x10,0x76a000
00a8dda8	add x10,x10,#0x520
00a8ddac	ldrsw x9,[x10, x9, LSL #0x2]
00a8ddb0	add x11,x9,x10
00a8ddb4	add x9,x22,x23
00a8ddb8	mov w10,w8
00a8ddbc	br x11
00a8ddc0	ldrb w8,[x9, #-0x1]!
00a8ddc4	lsl w8,w8,#0x8
00a8ddc8	ldrb w10,[x9, #-0x1]!
00a8ddcc	bfm w8,w10,#0x10,#0x7
00a8ddd0	ldrb w10,[x9, #-0x1]!
00a8ddd4	orr w8,w8,w10, LSL #0x18
00a8ddd8	mov w10,w8
00a8dddc	ldrb w8,[x9, #-0x1]!
00a8dde0	ldrb w11,[x9, #-0x1]!
00a8dde4	bfm w8,w11,#0x18,#0x7
00a8dde8	ldrb w11,[x9, #-0x1]!
00a8ddec	bfm w8,w11,#0x10,#0x7
00a8ddf0	ldurb w9,[x9, #-0x1]
00a8ddf4	orr w8,w8,w9, LSL #0x18
00a8ddf8	eor w8,w8,w26
00a8ddfc	eor w9,w10,w24
00a8de00	add x0,sp,#0x28
00a8de04	mov x1,x21
00a8de08	stp w8,w9,[sp, #0x28]
00a8de0c	bl 0x00a8d41c
00a8de10	ldp w20,w22,[sp, #0x28]
00a8de14	lsr w8,w20,#0x18
00a8de18	strb w8,[x28]
00a8de1c	lsr w8,w20,#0x10
00a8de20	strb w8,[x28, #0x1]
00a8de24	lsr w8,w20,#0x8
00a8de28	strb w8,[x28, #0x2]
00a8de2c	lsr w8,w22,#0x18
00a8de30	strb w8,[x28, #0x4]
00a8de34	lsr w8,w22,#0x10
00a8de38	strb w8,[x28, #0x5]
00a8de3c	lsr w8,w22,#0x8
00a8de40	strb w20,[x28, #0x3]
00a8de44	strb w8,[x28, #0x6]
00a8de48	strb w22,[x28, #0x7]
00a8de4c	b 0x00a8dfac
00a8de50	b.lt 0x00a8df1c
00a8de54	str x8,[sp, #0x18]
00a8de58	mvn x8,x23
00a8de5c	orr x9,xzr,#-0x10
00a8de60	cmn x8,#0x10
00a8de64	csinv x8,x9,x23,le
00a8de68	add x8,x8,x23
00a8de6c	add x8,x8,#0x8
00a8de70	and x8,x8,#-0x8
00a8de74	str x8,[sp, #0x10]
00a8de78	add x8,x8,#0x8
00a8de7c	str x8,[sp, #0x8]
00a8de80	add x8,x22,x8
00a8de84	add x23,x23,#0x8
00a8de88	mov x27,x28
00a8de8c	str x8,[sp, #0x20]
00a8de90	ldp w8,w9,[x22], #0x8
00a8de94	mov w25,w26
00a8de98	mov w20,w24
00a8de9c	add x0,sp,#0x28
00a8dea0	rev w26,w8
00a8dea4	rev w24,w9
00a8dea8	mov x1,x21
00a8deac	stp w26,w24,[sp, #0x28]
00a8deb0	bl 0x00a8d858
00a8deb4	ldp w8,w9,[sp, #0x28]
00a8deb8	sub x23,x23,#0x8
00a8debc	cmp x23,#0xf
00a8dec0	eor w8,w8,w25
00a8dec4	lsr w10,w8,#0x18
00a8dec8	eor w9,w9,w20
00a8decc	strb w10,[x27]
00a8ded0	lsr w10,w8,#0x10
00a8ded4	strb w8,[x27, #0x3]
00a8ded8	lsr w8,w8,#0x8
00a8dedc	strb w10,[x27, #0x1]
00a8dee0	lsr w10,w9,#0x18
00a8dee4	strb w8,[x27, #0x2]
00a8dee8	lsr w8,w9,#0x10
00a8deec	strb w9,[x27, #0x7]
00a8def0	lsr w9,w9,#0x8
00a8def4	strb w10,[x27, #0x4]
00a8def8	strb w8,[x27, #0x5]
00a8defc	strb w9,[x27, #0x6]
00a8df00	add x27,x27,#0x8
00a8df04	b.gt 0x00a8de90
00a8df08	ldp x9,x8,[sp, #0x10]
00a8df0c	ldr x22,[sp, #0x20]
00a8df10	sub x23,x8,x9
00a8df14	ldr x8,[sp, #0x8]
00a8df18	add x28,x28,x8
00a8df1c	cbz x23,0x00a8dfa4
00a8df20	ldp w8,w9,[x22]
00a8df24	add x0,sp,#0x28
00a8df28	mov x1,x21
00a8df2c	rev w20,w8
00a8df30	rev w22,w9
00a8df34	stp w20,w22,[sp, #0x28]
00a8df38	bl 0x00a8d858
00a8df3c	sub x8,x23,#0x1
00a8df40	cmp x8,#0x6
00a8df44	b.hi 0x00a8dfac
00a8df48	adrp x11,0x76a000
00a8df4c	add x11,x11,#0x53c
00a8df50	ldrsw x12,[x11, x8, LSL #0x2]
00a8df54	ldp w9,w10,[sp, #0x28]
00a8df58	add x11,x12,x11
00a8df5c	eor w8,w9,w26
00a8df60	eor w10,w10,w24
00a8df64	add x9,x28,x23
00a8df68	br x11
00a8df6c	lsr w11,w10,#0x8
00a8df70	strb w11,[x9, #-0x1]!
00a8df74	lsr w11,w10,#0x10
00a8df78	strb w11,[x9, #-0x1]!
00a8df7c	lsr w10,w10,#0x18
00a8df80	strb w10,[x9, #-0x1]!
00a8df84	strb w8,[x9, #-0x1]!
00a8df88	lsr w10,w8,#0x8
00a8df8c	strb w10,[x9, #-0x1]!
00a8df90	lsr w10,w8,#0x10
00a8df94	strb w10,[x9, #-0x1]!
00a8df98	lsr w8,w8,#0x18
00a8df9c	sturb w8,[x9, #-0x1]
00a8dfa0	b 0x00a8dfac
00a8dfa4	mov w20,w26
00a8dfa8	mov w22,w24
00a8dfac	lsr w8,w20,#0x18
00a8dfb0	lsr w9,w20,#0x10
00a8dfb4	lsr w10,w20,#0x8
00a8dfb8	lsr w11,w22,#0x18
00a8dfbc	lsr w12,w22,#0x10
00a8dfc0	lsr w13,w22,#0x8
00a8dfc4	strb w20,[x19, #0x3]
00a8dfc8	strb w8,[x19]
00a8dfcc	strb w9,[x19, #0x1]
00a8dfd0	strb w10,[x19, #0x2]
00a8dfd4	strb w11,[x19, #0x4]
00a8dfd8	strb w12,[x19, #0x5]
00a8dfdc	strb w13,[x19, #0x6]
00a8dfe0	strb w22,[x19, #0x7]
00a8dfe4	ldp x29,x30,[sp, #0x80]
00a8dfe8	ldp x20,x19,[sp, #0x70]
00a8dfec	ldp x22,x21,[sp, #0x60]
00a8dff0	ldp x24,x23,[sp, #0x50]
00a8dff4	ldp x26,x25,[sp, #0x40]
00a8dff8	ldp x28,x27,[sp, #0x30]
00a8dffc	add sp,sp,#0x90
00a8e000	ret
00a8e004	mov w10,w8
00a8e008	b 0x00a8ddf8

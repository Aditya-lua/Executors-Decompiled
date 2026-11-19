; FUN_0092c7cc @ 0092c7cc
0092c7cc	sub sp,sp,#0x110
0092c7d0	stp x28,x27,[sp, #0xb0]
0092c7d4	stp x26,x25,[sp, #0xc0]
0092c7d8	stp x24,x23,[sp, #0xd0]
0092c7dc	stp x22,x21,[sp, #0xe0]
0092c7e0	stp x20,x19,[sp, #0xf0]
0092c7e4	stp x29,x30,[sp, #0x100]
0092c7e8	add x29,sp,#0x100
0092c7ec	mrs x28,tpidr_el0
0092c7f0	ldr x8,[x28, #0x28]
0092c7f4	mov x20,x2
0092c7f8	mov x21,x1
0092c7fc	mov x19,x0
0092c800	stur x8,[x29, #-0x60]
0092c804	strb wzr,[sp, #0x74]
0092c808	strb wzr,[sp, #0x70]
0092c80c	str wzr,[sp, #0x6c]
0092c810	cbz x2,0x0092c838
0092c814	ldr w8,[x20]
0092c818	mov w9,#0xdbad
0092c81c	movk w9,#0xc0de, LSL #16
0092c820	cmp w8,w9
0092c824	b.ne 0x0092c838
0092c828	ldrb w8,[x19, #0x231]
0092c82c	tbnz w8,#0x4,0x0092c86c
0092c830	add x24,x20,#0x58
0092c834	b 0x0092c920
0092c838	mov w0,#0x2
0092c83c	ldr x8,[x28, #0x28]
0092c840	ldur x9,[x29, #-0x60]
0092c844	cmp x8,x9
0092c848	b.ne 0x0092ddf4
0092c84c	ldp x29,x30,[sp, #0x100]
0092c850	ldp x20,x19,[sp, #0xf0]
0092c854	ldp x22,x21,[sp, #0xe0]
0092c858	ldp x24,x23,[sp, #0xd0]
0092c85c	ldp x26,x25,[sp, #0xc0]
0092c860	ldp x28,x27,[sp, #0xb0]
0092c864	add sp,sp,#0x110
0092c868	ret
0092c86c	mov w8,#0x2a
0092c870	mov w1,#0x2a
0092c874	mov x0,x20
0092c878	mov w2,wzr
0092c87c	str w8,[sp, #0x6c]
0092c880	bl 0x0092b674
0092c884	mov x24,x20
0092c888	ldr w8,[x24, #0x58]!
0092c88c	cmp w8,#0x10
0092c890	b.eq 0x0092c920
0092c894	ldr x22,[x20, #0xc0]
0092c898	mov w8,#0x10
0092c89c	str w8,[x20, #0x58]
0092c8a0	ldr w8,[x22, #0x1c]
0092c8a4	subs w8,w8,#0x1
0092c8a8	str w8,[x22, #0x1c]
0092c8ac	b.ne 0x0092c8f0
0092c8b0	adrp x23,0xcc4000
0092c8b4	add x23,x23,#0x678
0092c8b8	ldr x0,[x22, #0xd8]
0092c8bc	ldr x8,[x23]
0092c8c0	blr x8
0092c8c4	ldrb w8,[x22, #0x231]
0092c8c8	stp xzr,xzr,[x22, #0xd8]
0092c8cc	ldr x0,[x22, #0xe8]
0092c8d0	and w8,w8,#0xffffffdf
0092c8d4	strb w8,[x22, #0x231]
0092c8d8	ldr x8,[x23]
0092c8dc	blr x8
0092c8e0	ldrb w8,[x22, #0x231]
0092c8e4	stp xzr,xzr,[x22, #0xe8]
0092c8e8	and w8,w8,#0xffffffbf
0092c8ec	strb w8,[x22, #0x231]
0092c8f0	ldr x22,[x20, #0x20]
0092c8f4	cbz x22,0x0092c914
0092c8f8	mov x0,x22
0092c8fc	mov x1,x20
0092c900	bl 0x00907e2c
0092c904	add x0,x22,#0x3d0
0092c908	add x1,x20,#0x40
0092c90c	mov x2,xzr
0092c910	bl 0x00925d80
0092c914	mov x0,x20
0092c918	str xzr,[x20, #0x20]
0092c91c	bl 0x0092ba18
0092c920	add x8,x19,#0x40
0092c924	str x8,[sp, #0x50]
0092c928	add x8,x20,#0x28
0092c92c	str x8,[sp, #0x30]
0092c930	add x8,x20,#0x10
0092c934	str x8,[sp, #0x38]
0092c938	add x8,x20,#0xa82
0092c93c	add x23,x20,#0x90
0092c940	str x8,[sp, #0x28]
0092c944	mov w8,#0x137c
0092c948	add x10,x20,#0x40
0092c94c	mov w9,#0x13aa
0092c950	stp x23,x10,[sp, #0x40]
0092c954	add x10,x20,#0x1b1
0092c958	add x8,x20,x8
0092c95c	str x10,[sp, #0x10]
0092c960	mov w10,#0x131b
0092c964	adrp x27,0x746000
0092c968	str x8,[sp, #0x20]
0092c96c	add x8,x20,x9
0092c970	add x25,x20,#0x20
0092c974	add x22,x19,#0x10
0092c978	add x27,x27,#0xfc0
0092c97c	str x8,[sp, #0x18]
0092c980	add x8,x20,x10
0092c984	str x8,[sp, #0x8]
0092c988	b 0x0092cd4c
0092c98c	ldr x8,[sp, #0x80]
0092c990	cbz x8,0x0092cb84
0092c994	ldr x9,[sp, #0x10]
0092c998	str wzr,[sp, #0x6c]
0092c99c	mov w26,#0x1
0092c9a0	ldr w8,[x9]
0092c9a4	orr w8,w8,#0x2
0092c9a8	str w8,[x9]
0092c9ac	mov x8,x9
0092c9b0	ldrb w8,[x8]
0092c9b4	tbz w8,#0x1,0x0092c9c4
0092c9b8	mov x0,x20
0092c9bc	bl 0x00935664
0092c9c0	tbz w0,#0x0,0x0092cb64
0092c9c4	ldr x8,[sp, #0x8]
0092c9c8	ldrb w8,[x8]
0092c9cc	cbz w8,0x0092d6f8
0092c9d0	mov x0,x20
0092c9d4	bl 0x00943630
0092c9d8	mov w26,wzr
0092c9dc	tbnz w0,#0x0,0x0092d6fc
0092c9e0	mov w2,#0x8
0092c9e4	mov x0,x20
0092c9e8	mov x1,xzr
0092c9ec	bl 0x0092aff8
0092c9f0	b 0x0092d6f8
0092c9f4	mov w8,#0x131c
0092c9f8	ldrb w8,[x20, x8]
0092c9fc	tbz w8,#0x6,0x0092cb3c
0092ca00	ldr x8,[x20, #0x1320]
0092ca04	ldrb w8,[x8, #0x40]
0092ca08	orr w8,w8,#0x2
0092ca0c	cmp w8,#0x7
0092ca10	b.ne 0x0092cb3c
0092ca14	mov x0,x20
0092ca18	mov w1,wzr
0092ca1c	mov w2,wzr
0092ca20	bl 0x0092b674
0092ca24	ldr x8,[x20, #0x20]
0092ca28	ldr w9,[x20, #0x58]
0092ca2c	orr w10,wzr,#0xf
0092ca30	cmp x8,#0x0
0092ca34	cinc w26,w10,eq
0092ca38	cmp w9,w26
0092ca3c	b.eq 0x0092db3c
0092ca40	str w26,[x24]
0092ca44	cbnz x8,0x0092caa0
0092ca48	ldr x27,[x20, #0xc0]
0092ca4c	ldr w8,[x27, #0x1c]
0092ca50	subs w8,w8,#0x1
0092ca54	str w8,[x27, #0x1c]
0092ca58	b.ne 0x0092caa0
0092ca5c	adrp x8,0xcc4000
0092ca60	add x8,x8,#0x678
0092ca64	ldr x0,[x27, #0xd8]
0092ca68	mov x23,x8
0092ca6c	ldr x8,[x8]
0092ca70	blr x8
0092ca74	ldrb w8,[x27, #0x231]
0092ca78	stp xzr,xzr,[x27, #0xd8]
0092ca7c	ldr x0,[x27, #0xe8]
0092ca80	and w8,w8,#0xffffffdf
0092ca84	strb w8,[x27, #0x231]
0092ca88	ldr x8,[x23]
0092ca8c	blr x8
0092ca90	ldrb w8,[x27, #0x231]
0092ca94	stp xzr,xzr,[x27, #0xe8]
0092ca98	and w8,w8,#0xffffffbf
0092ca9c	strb w8,[x27, #0x231]
0092caa0	mov w9,#0x1008
0092caa4	mov w8,w26
0092caa8	movk w9,#0x1, LSL #16
0092caac	lsr x9,x9,x8
0092cab0	tbz w9,#0x0,0x0092cac8
0092cab4	adrp x9,0xc4f000
0092cab8	add x9,x9,#0x8a0
0092cabc	ldr x8,[x9, x8, LSL #0x3]
0092cac0	mov x0,x20
0092cac4	blr x8
0092cac8	mov w26,#0xffffffff
0092cacc	b 0x0092d450
0092cad0	ldr x8,[x25]
0092cad4	cbnz x8,0x0092d258
0092cad8	b 0x0092d644
0092cadc	cmp w8,#0x5
0092cae0	b.eq 0x0092d814
0092cae4	mov w8,#0x5
0092cae8	b 0x0092d810
0092caec	cmp w8,#0xb
0092caf0	b.eq 0x0092d814
0092caf4	mov w8,#0xb
0092caf8	b 0x0092d810
0092cafc	mov x26,xzr
0092cb00	ldr x2,[x20, #0x330]
0092cb04	cbnz x2,0x0092d758
0092cb08	mov x1,xzr
0092cb0c	orr x8,x1,x26
0092cb10	cbnz x8,0x0092d77c
0092cb14	ldr w8,[x24]
0092cb18	cmp w8,#0xd
0092cb1c	b.eq 0x0092cb28
0092cb20	mov w8,#0xd
0092cb24	str w8,[x24]
0092cb28	ldp x1,x2,[x21]
0092cb2c	mov x0,x20
0092cb30	bl 0x00931ec4
0092cb34	mov w26,wzr
0092cb38	b 0x0092db40
0092cb3c	ldr w8,[x24]
0092cb40	cmp w8,#0xa
0092cb44	b.eq 0x0092d814
0092cb48	mov w8,#0xa
0092cb4c	b 0x0092d810
0092cb50	mov w1,w0
0092cb54	str w0,[sp, #0x6c]
0092cb58	cmp w1,#0x5c
0092cb5c	b.ne 0x0092d6d0
0092cb60	b 0x0092d6ec
0092cb64	ldr x8,[x20, #0x198]
0092cb68	cmp x8,#0x0
0092cb6c	cset w8,eq
0092cb70	bic w8,w8,w26
0092cb74	tbnz w8,#0x0,0x0092cb9c
0092cb78	tbz w26,#0x0,0x0092cc98
0092cb7c	mov w26,#0x2
0092cb80	b 0x0092ccbc
0092cb84	ldr w1,[sp, #0x6c]
0092cb88	cbnz w1,0x0092d6c8
0092cb8c	b 0x0092d3fc
0092cb90	mov w9,#0x1
0092cb94	strb w9,[sp, #0x74]
0092cb98	b 0x0092cc54
0092cb9c	ldr x8,[x20, #0x190]
0092cba0	cbz x8,0x0092ccfc
0092cba4	adrp x8,0xcc4000
0092cba8	add x8,x8,#0x678
0092cbac	ldr x0,[sp, #0x80]
0092cbb0	ldr x8,[x8]
0092cbb4	blr x8
0092cbb8	ldr x1,[x20, #0x190]
0092cbbc	mov w2,#0x1
0092cbc0	mov x0,x20
0092cbc4	str x1,[sp, #0x80]
0092cbc8	str xzr,[x20, #0x190]
0092cbcc	bl 0x0094299c
0092cbd0	mov w1,w0
0092cbd4	str w0,[sp, #0x6c]
0092cbd8	cbz w0,0x0092cd08
0092cbdc	mov w8,#0x1
0092cbe0	mov w2,#0x1
0092cbe4	mov x0,x20
0092cbe8	strb w8,[sp, #0x64]
0092cbec	bl 0x0092b674
0092cbf0	str w0,[sp, #0x6c]
0092cbf4	mov w26,wzr
0092cbf8	cbnz w0,0x0092d6fc
0092cbfc	b 0x0092cd08
0092cc00	ldr w1,[sp, #0x6c]
0092cc04	mov x0,x20
0092cc08	mov w2,wzr
0092cc0c	bl 0x0092b674
0092cc10	ldr x1,[sp, #0x80]
0092cc14	cbz x1,0x0092cc40
0092cc18	cmp w0,#0x37
0092cc1c	b.eq 0x0092cc24
0092cc20	cbnz w0,0x0092cc34
0092cc24	mov w2,#0x2
0092cc28	mov x0,x20
0092cc2c	bl 0x0094299c
0092cc30	cbz w0,0x0092cd1c
0092cc34	mov w26,wzr
0092cc38	str w0,[sp, #0x6c]
0092cc3c	b 0x0092d6fc
0092cc40	mov w26,wzr
0092cc44	mov w8,#0x1
0092cc48	strb w8,[sp, #0x64]
0092cc4c	b 0x0092d6fc
0092cc50	ldr x8,[x26, #0x3a0]
0092cc54	orr x8,x8,#0x4000
0092cc58	str x8,[x26, #0x3a0]
0092cc5c	str wzr,[sp, #0x6c]
0092cc60	ldrb w9,[sp, #0x74]
0092cc64	ldr w8,[x24]
0092cc68	cbz w9,0x0092cc78
0092cc6c	cmp w8,#0x9
0092cc70	b.eq 0x0092d814
0092cc74	b 0x0092d224
0092cc78	cmp w8,#0x8
0092cc7c	b.ne 0x0092cc90
0092cc80	mov w26,#0xffffffff
0092cc84	ldr x8,[x25]
0092cc88	cbnz x8,0x0092d828
0092cc8c	b 0x0092dd34
0092cc90	mov w8,#0x8
0092cc94	b 0x0092d810
0092cc98	adrp x8,0xcc4000
0092cc9c	add x8,x8,#0x678
0092cca0	ldr x0,[sp, #0x80]
0092cca4	ldr x8,[x8]
0092cca8	blr x8
0092ccac	ldr x8,[x20, #0x198]
0092ccb0	orr w26,wzr,#0x3
0092ccb4	str x8,[sp, #0x80]
0092ccb8	str xzr,[x20, #0x198]
0092ccbc	mov x0,x20
0092ccc0	mov w1,wzr
0092ccc4	mov w2,wzr
0092ccc8	bl 0x0092b674
0092cccc	ldr x1,[sp, #0x80]
0092ccd0	mov x0,x20
0092ccd4	mov w2,w26
0092ccd8	bl 0x0094299c
0092ccdc	mov w26,wzr
0092cce0	str w0,[sp, #0x6c]
0092cce4	cbnz w0,0x0092d6fc
0092cce8	ldr w8,[x24]
0092ccec	cmp w8,#0x2
0092ccf0	b.eq 0x0092cd14
0092ccf4	mov w8,#0x2
0092ccf8	b 0x0092cd40
0092ccfc	ldr w0,[sp, #0x6c]
0092cd00	mov w26,wzr
0092cd04	cbnz w0,0x0092d6fc
0092cd08	ldr w8,[x24]
0092cd0c	cmp w8,#0xf
0092cd10	b.ne 0x0092cd3c
0092cd14	mov w26,#0xffffffff
0092cd18	b 0x0092d6fc
0092cd1c	ldr w8,[x24]
0092cd20	cmp w8,#0x2
0092cd24	b.eq 0x0092cd30
0092cd28	mov w8,#0x2
0092cd2c	str w8,[x24]
0092cd30	str wzr,[sp, #0x6c]
0092cd34	mov w26,#0xffffffff
0092cd38	b 0x0092d6fc
0092cd3c	orr w8,wzr,#0xf
0092cd40	str w8,[x24]
0092cd44	mov w26,#0xffffffff
0092cd48	b 0x0092d6fc
0092cd4c	strb wzr,[sp, #0x64]
0092cd50	ldrb w8,[x19, #0x231]
0092cd54	and w9,w8,#0xfffffffd
0092cd58	strb w9,[x19, #0x231]
0092cd5c	tbz w8,#0x1,0x0092cdd0
0092cd60	ldr x8,[x19, #0x40]
0092cd64	cbz x8,0x0092cdd0
0092cd68	ldr x26,[x8]
0092cd6c	str xzr,[x26, #0x10]
0092cd70	ldr x8,[x19, #0x8]
0092cd74	cbz x8,0x0092cd88
0092cd78	ldr x8,[x22]
0092cd7c	str x26,[x8, #0x10]
0092cd80	str x8,[x26, #0x18]
0092cd84	b 0x0092cd90
0092cd88	str xzr,[x26, #0x18]
0092cd8c	str x26,[x19, #0x8]
0092cd90	str x26,[x22]
0092cd94	ldr w8,[x26, #0x58]
0092cd98	cmp w8,#0x3
0092cd9c	b.eq 0x0092cdb0
0092cda0	orr w8,wzr,#0x3
0092cda4	mov x0,x26
0092cda8	str w8,[x26, #0x58]
0092cdac	bl 0x009425cc
0092cdb0	ldr x0,[sp, #0x50]
0092cdb4	add x1,x26,#0x28
0092cdb8	mov x2,xzr
0092cdbc	bl 0x00925d80
0092cdc0	mov w2,#0x8
0092cdc4	mov x0,x26
0092cdc8	mov x1,xzr
0092cdcc	bl 0x0092aff8
0092cdd0	ldr w8,[x24]
0092cdd4	sub w9,w8,#0x4
0092cdd8	cmp w9,#0xb
0092cddc	b.hi 0x0092cdec
0092cde0	ldr x8,[x25]
0092cde4	cbnz x8,0x0092cdf8
0092cde8	b 0x0092dd58
0092cdec	sub w9,w8,#0x3
0092cdf0	cmp w9,#0xc
0092cdf4	b.hi 0x0092ce18
0092cdf8	add x2,sp,#0x64
0092cdfc	add x3,sp,#0x6c
0092ce00	mov x0,x20
0092ce04	mov x1,x21
0092ce08	bl 0x0092ddf8
0092ce0c	mov w26,wzr
0092ce10	tbnz w0,#0x0,0x0092db80
0092ce14	ldr w8,[x24]
0092ce18	cmp w8,#0x11
0092ce1c	b.hi 0x0092dd58
0092ce20	mov w9,w8
0092ce24	ldrsw x9,[x27, x9, LSL #0x2]
0092ce28	mov w26,wzr
0092ce2c	add x9,x9,x27
0092ce30	br x9
0092ce34	cmp w8,#0x3
0092ce38	b.cs 0x0092db4c
0092ce3c	b 0x0092db80
0092ce40	mov x0,x20
0092ce44	bl 0x009314dc
0092ce48	cbz w0,0x0092d360
0092ce4c	mov w1,#0x2a
0092ce50	str w1,[sp, #0x6c]
0092ce54	cmp w1,#0x5c
0092ce58	b.ne 0x0092d380
0092ce5c	b 0x0092d39c
0092ce60	ldr x8,[x25]
0092ce64	ldrb w9,[x8, #0x3a2]
0092ce68	tbz w9,#0x6,0x0092d7e8
0092ce6c	ldr x9,[x19, #0x40]
0092ce70	cbz x9,0x0092d7e8
0092ce74	ldr x26,[x9]
0092ce78	str xzr,[x26, #0x10]
0092ce7c	ldr x8,[x19, #0x8]
0092ce80	cbz x8,0x0092d79c
0092ce84	ldr x8,[x22]
0092ce88	str x26,[x8, #0x10]
0092ce8c	str x8,[x26, #0x18]
0092ce90	b 0x0092d7a4
0092ce94	ldr x8,[x20, #0x298]
0092ce98	cbz x8,0x0092d268
0092ce9c	ldr x9,[x20, #0xc0]
0092cea0	cbz x9,0x0092ceb4
0092cea4	ldrb w8,[x9, #0x231]
0092cea8	orr w8,w8,#0x4
0092ceac	strb w8,[x9, #0x231]
0092ceb0	ldr x8,[x20, #0x298]
0092ceb4	ldr x0,[x20, #0x2a0]
0092ceb8	ldr w3,[x20, #0x13d8]
0092cebc	ldr w4,[x20, #0x13dc]
0092cec0	ldp x2,x1,[sp, #0x18]
0092cec4	blr x8
0092cec8	ldr x8,[x20, #0xc0]
0092cecc	cbz x8,0x0092cedc
0092ced0	ldrb w9,[x8, #0x231]
0092ced4	and w9,w9,#0xfffffffb
0092ced8	strb w9,[x8, #0x231]
0092cedc	cbz w0,0x0092d268
0092cee0	adrp x1,0x2cf000
0092cee4	mov x0,x20
0092cee8	add x1,x1,#0xb4
0092ceec	bl 0x00904b80
0092cef0	mov w8,#0x2a
0092cef4	mov w1,#0x2a
0092cef8	str w8,[sp, #0x6c]
0092cefc	b 0x0092d258
0092cf00	ldr w1,[sp, #0x6c]
0092cf04	cbnz w1,0x0092d2ec
0092cf08	ldr x26,[x25]
0092cf0c	ldrb w8,[x26, #0x3a0]
0092cf10	tbnz w8,#0x7,0x0092d224
0092cf14	mov x0,x26
0092cf18	mov w1,wzr
0092cf1c	strb wzr,[sp, #0x74]
0092cf20	bl 0x009077cc
0092cf24	ldr x8,[x26, #0x3a0]
0092cf28	tbz w8,#0xe,0x0092d9a0
0092cf2c	tbz w0,#0x0,0x0092d9a0
0092cf30	ldr x8,[x26, #0x3a8]
0092cf34	ldr x8,[x8, #0x30]
0092cf38	cbnz x8,0x0092cc5c
0092cf3c	mov w8,#0x1
0092cf40	strb w8,[sp, #0x74]
0092cf44	str wzr,[sp, #0x6c]
0092cf48	b 0x0092d218
0092cf4c	ldr x9,[x25]
0092cf50	cbz x9,0x0092d29c
0092cf54	ldr x8,[x9, #0x3a8]
0092cf58	ldr x8,[x8, #0x38]
0092cf5c	cbz x8,0x0092d29c
0092cf60	add x1,sp,#0x70
0092cf64	mov x0,x20
0092cf68	strb wzr,[sp, #0x70]
0092cf6c	blr x8
0092cf70	mov w1,w0
0092cf74	str w0,[sp, #0x6c]
0092cf78	cbnz w0,0x0092d258
0092cf7c	ldrb w8,[sp, #0x70]
0092cf80	cbz w8,0x0092d688
0092cf84	ldr x9,[x25]
0092cf88	ldr w8,[x24]
0092cf8c	b 0x0092d2ac
0092cf90	str xzr,[sp, #0x80]
0092cf94	ldr x2,[x20, #0x328]
0092cf98	cbz x2,0x0092d3b0
0092cf9c	ldr x0,[x20, #0xac8]
0092cfa0	ldr x1,[x20, #0xb80]
0092cfa4	ldr x3,[x20, #0xb70]
0092cfa8	ldr x4,[x20, #0xb78]
0092cfac	ldp x5,x6,[x21]
0092cfb0	bl 0x00931f58
0092cfb4	mov x26,x0
0092cfb8	ldr x2,[x20, #0x330]
0092cfbc	cbz x2,0x0092d3bc
0092cfc0	ldr x0,[x20, #0xac0]
0092cfc4	ldr x1,[x20, #0xb98]
0092cfc8	ldr x3,[x20, #0xb88]
0092cfcc	ldr x4,[x20, #0xb90]
0092cfd0	ldp x5,x6,[x21]
0092cfd4	bl 0x00931f58
0092cfd8	mov x27,x0
0092cfdc	orr x8,x27,x26
0092cfe0	cbz x8,0x0092d3c8
0092cfe4	ldp x1,x2,[x21]
0092cfe8	mov x0,x20
0092cfec	bl 0x00931ec4
0092cff0	ldr w8,[x20, #0x58]
0092cff4	cmp w8,#0xe
0092cff8	b.eq 0x0092d004
0092cffc	orr w8,wzr,#0xe
0092d000	str w8,[x24]
0092d004	mov w2,#0xb
0092d008	mov x0,x20
0092d00c	cmp x26,x27
0092d010	b.ge 0x0092d444
0092d014	mov x1,x27
0092d018	b 0x0092d448
0092d01c	add x3,sp,#0x7c
0092d020	mov x0,x20
0092d024	mov w1,wzr
0092d028	mov w2,wzr
0092d02c	bl 0x00907508
0092d030	mov w1,w0
0092d034	str w0,[sp, #0x6c]
0092d038	cbnz w0,0x0092d2e8
0092d03c	ldrb w8,[sp, #0x7c]
0092d040	cbnz w8,0x0092d1cc
0092d044	b 0x0092d2e8
0092d048	ldr x8,[x25]
0092d04c	cbz x8,0x0092da44
0092d050	ldrb w8,[x8, #0x3a2]
0092d054	tbz w8,#0x6,0x0092da28
0092d058	ldr x8,[x19, #0x40]
0092d05c	cbz x8,0x0092da28
0092d060	ldr x26,[x8]
0092d064	str xzr,[x26, #0x10]
0092d068	ldr x8,[x19, #0x8]
0092d06c	cbz x8,0x0092d9e0
0092d070	ldr x8,[x22]
0092d074	str x26,[x8, #0x10]
0092d078	str x8,[x26, #0x18]
0092d07c	b 0x0092d9e8
0092d080	mov x0,x20
0092d084	bl 0x009425fc
0092d088	mov w26,wzr
0092d08c	str w0,[sp, #0x6c]
0092d090	cbnz w0,0x0092db40
0092d094	ldr w8,[x24]
0092d098	cmp w8,#0x2
0092d09c	b.eq 0x0092d0a8
0092d0a0	mov w8,#0x2
0092d0a4	str w8,[x24]
0092d0a8	mov w1,#0x1
0092d0ac	mov x0,x20
0092d0b0	bl 0x00931d94
0092d0b4	mov w1,#0x2
0092d0b8	mov x0,x20
0092d0bc	bl 0x00931d94
0092d0c0	stp x0,x1,[x21]
0092d0c4	ldr w1,[x20, #0x2e0]
0092d0c8	cbz w1,0x0092d0d8
0092d0cc	mov w2,#0xa
0092d0d0	mov x0,x20
0092d0d4	bl 0x0092aff8
0092d0d8	ldr w1,[x20, #0x2e4]
0092d0dc	cbz w1,0x0092d0ec
0092d0e0	mov w2,#0x2
0092d0e4	mov x0,x20
0092d0e8	bl 0x0092aff8
0092d0ec	ldr w8,[x24]
0092d0f0	cmp w8,#0x3
0092d0f4	b.eq 0x0092d108
0092d0f8	orr w8,wzr,#0x3
0092d0fc	mov x0,x20
0092d100	str w8,[x20, #0x58]
0092d104	bl 0x009425cc
0092d108	add x1,sp,#0x78
0092d10c	add x2,sp,#0x7c
0092d110	mov x0,x20
0092d114	bl 0x009471c0
0092d118	cmp w0,#0x59
0092d11c	str w0,[sp, #0x6c]
0092d120	b.ne 0x0092d160
0092d124	ldr w8,[x24]
0092d128	cmp w8,#0x1
0092d12c	b.eq 0x0092d138
0092d130	mov w8,#0x1
0092d134	str w8,[x24]
0092d138	ldr x0,[sp, #0x50]
0092d13c	ldr x2,[sp, #0x30]
0092d140	mov x1,x20
0092d144	bl 0x00925d10
0092d148	ldp x9,x8,[x20, #0x10]
0092d14c	cbz x8,0x0092d338
0092d150	ldr x11,[sp, #0x38]
0092d154	str x9,[x8, #0x10]
0092d158	ldr x9,[x11]
0092d15c	b 0x0092d340
0092d160	ldr x27,[x20, #0xc0]
0092d164	ldr x8,[x27, #0x40]
0092d168	cbz x8,0x0092d510
0092d16c	ldr x26,[x8]
0092d170	str xzr,[x26, #0x10]
0092d174	ldr x8,[x27, #0x8]
0092d178	cbz x8,0x0092d4c0
0092d17c	mov x8,x27
0092d180	ldr x9,[x8, #0x10]!
0092d184	str x26,[x9, #0x10]
0092d188	str x9,[x26, #0x18]
0092d18c	b 0x0092d4cc
0092d190	str xzr,[sp, #0x58]
0092d194	ldr x8,[x25]
0092d198	ldr x9,[x8, #0x3a0]
0092d19c	tbnz w9,#0x0,0x0092d2fc
0092d1a0	tbnz w9,#0x9,0x0092d560
0092d1a4	add x9,x8,#0x50
0092d1a8	b 0x0092d564
0092d1ac	add x1,sp,#0x74
0092d1b0	mov x0,x20
0092d1b4	bl 0x009197ec
0092d1b8	str w0,[sp, #0x6c]
0092d1bc	ldr x8,[x20, #0x20]
0092d1c0	ldrb w8,[x8, #0x3a0]
0092d1c4	tbnz w8,#0x4,0x0092d304
0092d1c8	cbnz w0,0x0092d644
0092d1cc	ldr w8,[x24]
0092d1d0	cmp w8,#0x7
0092d1d4	b.eq 0x0092d814
0092d1d8	orr w8,wzr,#0x7
0092d1dc	b 0x0092d810
0092d1e0	ldr x8,[x25]
0092d1e4	cbz x8,0x0092d2d4
0092d1e8	ldr x8,[x8, #0x3a8]
0092d1ec	ldr x8,[x8, #0x30]
0092d1f0	cbz x8,0x0092d2d4
0092d1f4	add x1,sp,#0x74
0092d1f8	mov x0,x20
0092d1fc	strb wzr,[sp, #0x74]
0092d200	blr x8
0092d204	ldrb w8,[sp, #0x74]
0092d208	mov w1,w0
0092d20c	str w1,[sp, #0x6c]
0092d210	cbnz w1,0x0092d2e8
0092d214	cbz w8,0x0092d2e8
0092d218	ldr w8,[x24]
0092d21c	cmp w8,#0x9
0092d220	b.eq 0x0092d814
0092d224	mov w8,#0x9
0092d228	b 0x0092d810
0092d22c	ldr x8,[x25]
0092d230	str wzr,[sp, #0x68]
0092d234	ldr x8,[x8, #0x3a8]
0092d238	ldr x8,[x8, #0x20]
0092d23c	cbz x8,0x0092d410
0092d240	add x1,sp,#0x68
0092d244	mov x0,x20
0092d248	blr x8
0092d24c	mov w1,w0
0092d250	str w0,[sp, #0x6c]
0092d254	cbz w0,0x0092d654
0092d258	mov x0,x20
0092d25c	mov w2,wzr
0092d260	bl 0x0092b674
0092d264	b 0x0092d644
0092d268	ldrb w8,[x20, #0xa81]
0092d26c	ldr x0,[x20, #0x20]
0092d270	cmp w8,#0x1
0092d274	b.ne 0x0092d460
0092d278	mov w1,wzr
0092d27c	bl 0x00908c4c
0092d280	ldr w8,[x24]
0092d284	cmp w8,#0xf
0092d288	b.eq 0x0092d294
0092d28c	orr w8,wzr,#0xf
0092d290	str w8,[x24]
0092d294	str wzr,[sp, #0x6c]
0092d298	b 0x0092db3c
0092d29c	mov w8,#0x1
0092d2a0	strb w8,[sp, #0x70]
0092d2a4	str wzr,[sp, #0x6c]
0092d2a8	mov w8,#0xa
0092d2ac	ldr w9,[x9, #0x3a0]
0092d2b0	orr w10,wzr,#0xc
0092d2b4	ubfx w9,w9,#0xd,#0x1
0092d2b8	sub w9,w10,w9
0092d2bc	cmp w8,w9
0092d2c0	b.ne 0x0092d41c
0092d2c4	mov w26,#0xffffffff
0092d2c8	cmp w8,#0x3
0092d2cc	b.cs 0x0092db4c
0092d2d0	b 0x0092db80
0092d2d4	mov w1,wzr
0092d2d8	mov w8,#0x1
0092d2dc	strb w8,[sp, #0x74]
0092d2e0	str w1,[sp, #0x6c]
0092d2e4	cbz w1,0x0092d214
0092d2e8	cbz w1,0x0092d688
0092d2ec	mov w2,#0x1
0092d2f0	mov x0,x20
0092d2f4	bl 0x0092b674
0092d2f8	b 0x0092d644
0092d2fc	add x9,x8,#0xd8
0092d300	b 0x0092d564
0092d304	mov x0,x20
0092d308	mov w1,wzr
0092d30c	mov w2,wzr
0092d310	str wzr,[sp, #0x6c]
0092d314	bl 0x0092b674
0092d318	ldr w8,[x20, #0x58]
0092d31c	cmp w8,#0x3
0092d320	b.eq 0x0092d814
0092d324	orr w8,wzr,#0x3
0092d328	mov x0,x20
0092d32c	str w8,[x20, #0x58]
0092d330	bl 0x009425cc
0092d334	b 0x0092db3c
0092d338	ldr x11,[sp, #0x38]
0092d33c	str x9,[x19, #0x8]
0092d340	add x10,x9,#0x18
0092d344	cmp x9,#0x0
0092d348	csel x9,x22,x10,eq
0092d34c	mov w26,wzr
0092d350	str x8,[x9]
0092d354	stp xzr,xzr,[x11]
0092d358	str wzr,[sp, #0x6c]
0092d35c	b 0x0092db40
0092d360	ldp x1,x2,[x21]
0092d364	mov x0,x20
0092d368	bl 0x00941244
0092d36c	mov w1,w0
0092d370	str w0,[sp, #0x6c]
0092d374	cbz w0,0x0092d72c
0092d378	cmp w1,#0x5c
0092d37c	b.eq 0x0092d39c
0092d380	ldr x0,[x25]
0092d384	ldr x8,[x0, #0x3a8]
0092d388	ldr w8,[x8, #0x94]
0092d38c	tbnz w8,#0x1,0x0092d39c
0092d390	mov w1,#0x2
0092d394	bl 0x00908c4c
0092d398	ldr w1,[sp, #0x6c]
0092d39c	mov w2,#0x1
0092d3a0	mov x0,x20
0092d3a4	bl 0x0092b674
0092d3a8	mov w26,wzr
0092d3ac	b 0x0092db40
0092d3b0	mov x26,xzr
0092d3b4	ldr x2,[x20, #0x330]
0092d3b8	cbnz x2,0x0092cfc0
0092d3bc	mov x27,xzr
0092d3c0	orr x8,x27,x26
0092d3c4	cbnz x8,0x0092cfe4
0092d3c8	mov x0,x20
0092d3cc	bl 0x00941fa4
0092d3d0	ldr x23,[sp, #0x40]
0092d3d4	adrp x27,0x746000
0092d3d8	mov w1,w0
0092d3dc	cmp w0,#0x38
0092d3e0	add x27,x27,#0xfc0
0092d3e4	str w0,[sp, #0x6c]
0092d3e8	b.eq 0x0092d6b0
0092d3ec	ldr x8,[sp, #0x10]
0092d3f0	ldr w8,[x8]
0092d3f4	tbnz w8,#0x1,0x0092d6b0
0092d3f8	cbnz w1,0x0092d6c8
0092d3fc	ldr x8,[sp, #0x10]
0092d400	mov w26,wzr
0092d404	ldrb w8,[x8]
0092d408	tbnz w8,#0x1,0x0092c9b8
0092d40c	b 0x0092c9c4
0092d410	mov w26,wzr
0092d414	str wzr,[sp, #0x6c]
0092d418	b 0x0092db40
0092d41c	mov w8,#0x1008
0092d420	movk w8,#0x1, LSL #16
0092d424	lsr x8,x8,x9
0092d428	str w9,[x24]
0092d42c	tbnz w8,#0x0,0x0092db28
0092d430	mov w26,#0xffffffff
0092d434	mov w8,w9
0092d438	cmp w8,#0x3
0092d43c	b.cs 0x0092db4c
0092d440	b 0x0092db80
0092d444	mov x1,x26
0092d448	bl 0x0092aff8
0092d44c	mov w26,wzr
0092d450	ldr x23,[sp, #0x40]
0092d454	adrp x27,0x746000
0092d458	add x27,x27,#0xfc0
0092d45c	b 0x0092db40
0092d460	ldr x8,[x0, #0x3a8]
0092d464	ldr x8,[x8, #0x10]
0092d468	cbz x8,0x0092d954
0092d46c	add x1,sp,#0x70
0092d470	mov x0,x20
0092d474	blr x8
0092d478	mov w1,w0
0092d47c	str w0,[sp, #0x6c]
0092d480	cbz w0,0x0092d958
0092d484	cmp w1,#0x37
0092d488	b.ne 0x0092cad0
0092d48c	ldr x8,[x25]
0092d490	ldrb w9,[x8, #0x3a0]
0092d494	tbz w9,#0x7,0x0092cad4
0092d498	add x1,sp,#0x80
0092d49c	mov x0,x20
0092d4a0	str xzr,[sp, #0x80]
0092d4a4	bl 0x0094300c
0092d4a8	mov w1,w0
0092d4ac	cbz w0,0x0092cc00
0092d4b0	mov w8,#0x1
0092d4b4	str w1,[sp, #0x6c]
0092d4b8	strb w8,[sp, #0x64]
0092d4bc	b 0x0092cc04
0092d4c0	add x8,x27,#0x10
0092d4c4	str xzr,[x26, #0x18]
0092d4c8	str x26,[x27, #0x8]
0092d4cc	str x26,[x8]
0092d4d0	ldr w8,[x26, #0x58]
0092d4d4	cmp w8,#0x3
0092d4d8	b.eq 0x0092d4ec
0092d4dc	orr w8,wzr,#0x3
0092d4e0	mov x0,x26
0092d4e4	str w8,[x26, #0x58]
0092d4e8	bl 0x009425cc
0092d4ec	add x0,x27,#0x40
0092d4f0	add x1,x26,#0x28
0092d4f4	mov x2,xzr
0092d4f8	bl 0x00925d80
0092d4fc	mov w2,#0x8
0092d500	mov x0,x26
0092d504	mov x1,xzr
0092d508	bl 0x0092aff8
0092d50c	ldr w0,[sp, #0x6c]
0092d510	ldr x23,[sp, #0x40]
0092d514	adrp x27,0x746000
0092d518	mov w26,wzr
0092d51c	add x27,x27,#0xfc0
0092d520	cbnz w0,0x0092db40
0092d524	orr w1,wzr,#0x3
0092d528	mov x0,x20
0092d52c	bl 0x00931d94
0092d530	stp x0,x1,[x21]
0092d534	ldrb w8,[sp, #0x78]
0092d538	cbz w8,0x0092d714
0092d53c	ldr w8,[x24]
0092d540	mov w26,wzr
0092d544	cmp w8,#0x4
0092d548	mov w8,#0x4
0092d54c	b.eq 0x0092db4c
0092d550	str w8,[x24]
0092d554	cmn w26,#0x1
0092d558	b.ne 0x0092db54
0092d55c	b 0x0092db80
0092d560	add x9,x8,#0x80
0092d564	ldr x26,[x9]
0092d568	ldr w2,[x8, #0x15c]
0092d56c	mov x0,x20
0092d570	mov x1,x26
0092d574	bl 0x00916ce4
0092d578	str x0,[sp, #0x58]
0092d57c	cbz x0,0x0092d5d0
0092d580	ldrb w8,[x20, #0xdb8]
0092d584	str x0,[x20, #0xd98]
0092d588	orr w8,w8,#0x1
0092d58c	strb w8,[x20, #0xdb8]
0092d590	ldr x8,[sp, #0x28]
0092d594	str wzr,[sp, #0x6c]
0092d598	ldrb w8,[x8, #0x3]
0092d59c	tbz w8,#0x4,0x0092d5e0
0092d5a0	ldr x8,[x20, #0x12a0]
0092d5a4	cbz x8,0x0092d5b4
0092d5a8	ldr w8,[x8, #0x8]
0092d5ac	cmp w8,#0x1
0092d5b0	b.lt 0x0092d5e0
0092d5b4	adrp x1,0x2db000
0092d5b8	mov x0,x20
0092d5bc	add x1,x1,#0x2c5
0092d5c0	mov x2,x26
0092d5c4	bl 0x00904c98
0092d5c8	ldr x8,[sp, #0x58]
0092d5cc	cbnz x8,0x0092d5e0
0092d5d0	add x1,sp,#0x58
0092d5d4	mov x0,x20
0092d5d8	bl 0x00917850
0092d5dc	str w0,[sp, #0x6c]
0092d5e0	add x1,sp,#0x80
0092d5e4	mov x0,x20
0092d5e8	bl 0x0092bcf8
0092d5ec	add x2,sp,#0x80
0092d5f0	mov x0,x19
0092d5f4	mov x1,x20
0092d5f8	mov x3,x23
0092d5fc	mov x26,x23
0092d600	bl 0x0092dfc0
0092d604	cbnz w0,0x0092c83c
0092d608	ldr q0,[sp, #0x90]
0092d60c	str q0,[x26, #0x10]
0092d610	ldr q0,[sp, #0x80]
0092d614	str q0,[x26]
0092d618	ldr x8,[sp, #0x58]
0092d61c	cbz x8,0x0092d63c
0092d620	add x1,sp,#0x7c
0092d624	mov x0,x20
0092d628	bl 0x00918228
0092d62c	str w0,[sp, #0x6c]
0092d630	cbz w0,0x0092d690
0092d634	str xzr,[x25]
0092d638	b 0x0092d644
0092d63c	ldr w8,[sp, #0x6c]
0092d640	cbz w8,0x0092d688
0092d644	mov w8,#0x1
0092d648	mov w26,wzr
0092d64c	strb w8,[sp, #0x64]
0092d650	b 0x0092db40
0092d654	ldr w9,[sp, #0x68]
0092d658	cbz w9,0x0092d688
0092d65c	ldr w8,[x24]
0092d660	cmp w9,#0x1
0092d664	mov w9,#0xa
0092d668	orr w10,wzr,#0xc
0092d66c	csel w9,w10,w9,eq
0092d670	cmp w8,w9
0092d674	b.ne 0x0092db14
0092d678	mov w26,#0xffffffff
0092d67c	cmp w8,#0xf
0092d680	b.ls 0x0092db8c
0092d684	b 0x0092dd38
0092d688	mov w26,wzr
0092d68c	b 0x0092db40
0092d690	ldrb w9,[sp, #0x7c]
0092d694	ldr w8,[x24]
0092d698	cbz w9,0x0092d9cc
0092d69c	cmp w8,#0x7
0092d6a0	b.eq 0x0092db3c
0092d6a4	orr w8,wzr,#0x7
0092d6a8	str w8,[x24]
0092d6ac	b 0x0092db3c
0092d6b0	add x1,sp,#0x80
0092d6b4	mov x0,x20
0092d6b8	bl 0x0094300c
0092d6bc	cbz w0,0x0092c98c
0092d6c0	ldr w1,[sp, #0x6c]
0092d6c4	cbz w1,0x0092cb50
0092d6c8	cmp w1,#0x5c
0092d6cc	b.eq 0x0092d6ec
0092d6d0	ldr x0,[x25]
0092d6d4	ldr x8,[x0, #0x3a8]
0092d6d8	ldr w8,[x8, #0x94]
0092d6dc	tbnz w8,#0x1,0x0092d6ec
0092d6e0	mov w1,#0x2
0092d6e4	bl 0x00908c4c
0092d6e8	ldr w1,[sp, #0x6c]
0092d6ec	mov w2,#0x1
0092d6f0	mov x0,x20
0092d6f4	bl 0x0092b674
0092d6f8	mov w26,wzr
0092d6fc	adrp x8,0xcc4000
0092d700	add x8,x8,#0x678
0092d704	ldr x0,[sp, #0x80]
0092d708	ldr x8,[x8]
0092d70c	blr x8
0092d710	b 0x0092db40
0092d714	ldrb w9,[sp, #0x7c]
0092d718	ldr w8,[x24]
0092d71c	cbz w9,0x0092cadc
0092d720	cmp w8,#0x7
0092d724	b.ne 0x0092d1d8
0092d728	b 0x0092d814
0092d72c	ldr x2,[x20, #0x328]
0092d730	cbz x2,0x0092cafc
0092d734	ldr x0,[x20, #0xac8]
0092d738	ldr x1,[x20, #0xb80]
0092d73c	ldr x3,[x20, #0xb70]
0092d740	ldr x4,[x20, #0xb78]
0092d744	ldp x5,x6,[x21]
0092d748	bl 0x00931f58
0092d74c	mov x26,x0
0092d750	ldr x2,[x20, #0x330]
0092d754	cbz x2,0x0092cb08
0092d758	ldr x0,[x20, #0xac0]
0092d75c	ldr x1,[x20, #0xb98]
0092d760	ldr x3,[x20, #0xb88]
0092d764	ldr x4,[x20, #0xb90]
0092d768	ldp x5,x6,[x21]
0092d76c	bl 0x00931f58
0092d770	mov x1,x0
0092d774	orr x8,x1,x26
0092d778	cbz x8,0x0092cb14
0092d77c	mov w2,#0xb
0092d780	mov x0,x20
0092d784	cmp x26,x1
0092d788	b.lt 0x0092d790
0092d78c	mov x1,x26
0092d790	bl 0x0092aff8
0092d794	mov w26,wzr
0092d798	b 0x0092db40
0092d79c	str xzr,[x26, #0x18]
0092d7a0	str x26,[x19, #0x8]
0092d7a4	str x26,[x22]
0092d7a8	ldr w8,[x26, #0x58]
0092d7ac	cmp w8,#0x3
0092d7b0	b.eq 0x0092d7c4
0092d7b4	orr w8,wzr,#0x3
0092d7b8	mov x0,x26
0092d7bc	str w8,[x26, #0x58]
0092d7c0	bl 0x009425cc
0092d7c4	ldr x0,[sp, #0x50]
0092d7c8	add x1,x26,#0x28
0092d7cc	mov x2,xzr
0092d7d0	bl 0x00925d80
0092d7d4	mov w2,#0x8
0092d7d8	mov x0,x26
0092d7dc	mov x1,xzr
0092d7e0	bl 0x0092aff8
0092d7e4	ldr x8,[x25]
0092d7e8	ldr w9,[x8, #0x3c8]
0092d7ec	cmn w9,#0x1
0092d7f0	b.ne 0x0092d800
0092d7f4	ldr w9,[x8, #0x3cc]
0092d7f8	cmn w9,#0x1
0092d7fc	b.eq 0x0092d91c
0092d800	ldr w8,[x24]
0092d804	cmp w8,#0xd
0092d808	b.eq 0x0092d814
0092d80c	mov w8,#0xd
0092d810	str w8,[x24]
0092d814	mov w26,#0xffffffff
0092d818	ldr w8,[sp, #0x6c]
0092d81c	cbnz w8,0x0092db94
0092d820	ldr x8,[x25]
0092d824	cbz x8,0x0092dd34
0092d828	mov x0,x20
0092d82c	bl 0x009314dc
0092d830	cbz w0,0x0092dd34
0092d834	mov w8,#0x2a
0092d838	str w8,[sp, #0x6c]
0092d83c	ldr x0,[x25]
0092d840	mov w1,#0x2
0092d844	bl 0x00908c4c
0092d848	ldr w8,[x24]
0092d84c	orr w9,wzr,#0xf
0092d850	cmp w8,#0xf
0092d854	cinc w26,w9,cs
0092d858	cmp w8,w26
0092d85c	b.ne 0x0092d880
0092d860	mov w26,#0xffffffff
0092d864	cmp w8,#0x10
0092d868	b.eq 0x0092dd40
0092d86c	cmn w26,#0x1
0092d870	b.eq 0x0092cd4c
0092d874	ldrb w8,[x19, #0x231]
0092d878	tbnz w8,#0x1,0x0092cd4c
0092d87c	b 0x0092dd60
0092d880	cmp w8,#0xf
0092d884	str w26,[x24]
0092d888	b.cc 0x0092d8e0
0092d88c	ldr x27,[x20, #0xc0]
0092d890	ldr w8,[x27, #0x1c]
0092d894	subs w8,w8,#0x1
0092d898	str w8,[x27, #0x1c]
0092d89c	b.ne 0x0092d8e0
0092d8a0	adrp x23,0xcc4000
0092d8a4	add x23,x23,#0x678
0092d8a8	ldr x0,[x27, #0xd8]
0092d8ac	ldr x8,[x23]
0092d8b0	blr x8
0092d8b4	ldrb w8,[x27, #0x231]
0092d8b8	stp xzr,xzr,[x27, #0xd8]
0092d8bc	ldr x0,[x27, #0xe8]
0092d8c0	and w8,w8,#0xffffffdf
0092d8c4	strb w8,[x27, #0x231]
0092d8c8	ldr x8,[x23]
0092d8cc	blr x8
0092d8d0	ldrb w8,[x27, #0x231]
0092d8d4	stp xzr,xzr,[x27, #0xe8]
0092d8d8	and w8,w8,#0xffffffbf
0092d8dc	strb w8,[x27, #0x231]
0092d8e0	mov w9,#0x1008
0092d8e4	mov w8,w26
0092d8e8	movk w9,#0x1, LSL #16
0092d8ec	lsr x9,x9,x8
0092d8f0	tbz w9,#0x0,0x0092d908
0092d8f4	adrp x9,0xc4f000
0092d8f8	add x9,x9,#0x8a0
0092d8fc	ldr x8,[x9, x8, LSL #0x3]
0092d900	mov x0,x20
0092d904	blr x8
0092d908	ldr x23,[sp, #0x40]
0092d90c	adrp x27,0x746000
0092d910	mov w26,#0xffffffff
0092d914	add x27,x27,#0xfc0
0092d918	b 0x0092dd34
0092d91c	mov w9,#0x131c
0092d920	ldrb w9,[x20, x9]
0092d924	tbz w9,#0x6,0x0092d940
0092d928	ldr x8,[x8, #0x3a8]
0092d92c	ldrb w8,[x8, #0x95]
0092d930	tbnz w8,#0x4,0x0092d940
0092d934	ldr x8,[x20, #0x1320]
0092d938	orr w9,wzr,#0x7
0092d93c	strb w9,[x8, #0x40]
0092d940	ldr w8,[x24]
0092d944	cmp w8,#0xf
0092d948	b.eq 0x0092d814
0092d94c	orr w8,wzr,#0xf
0092d950	b 0x0092d810
0092d954	str wzr,[sp, #0x6c]
0092d958	ldrb w8,[sp, #0x70]
0092d95c	cbz w8,0x0092c9f4
0092d960	ldr x8,[x25]
0092d964	ldrb w9,[x8, #0x3a1]
0092d968	ldr w8,[x24]
0092d96c	tbnz w9,#0x5,0x0092caec
0092d970	cmp w8,#0xc
0092d974	b.eq 0x0092d814
0092d978	ldr x9,[sp, #0x10]
0092d97c	orr w8,wzr,#0xc
0092d980	str w8,[x20, #0x58]
0092d984	orr w1,wzr,#0x7
0092d988	ldr w8,[x9]
0092d98c	mov x0,x20
0092d990	and w8,w8,#0xfffff7ff
0092d994	str w8,[x9]
0092d998	bl 0x00931d94
0092d99c	b 0x0092db3c
0092d9a0	tbnz w8,#0xe,0x0092cc5c
0092d9a4	ldr x9,[x26, #0x3a8]
0092d9a8	ldr x9,[x9, #0x28]
0092d9ac	cbz x9,0x0092cb90
0092d9b0	add x1,sp,#0x74
0092d9b4	mov x0,x20
0092d9b8	blr x9
0092d9bc	mov w1,w0
0092d9c0	cbz w0,0x0092cc50
0092d9c4	str w1,[sp, #0x6c]
0092d9c8	b 0x0092d2ec
0092d9cc	cmp w8,#0x5
0092d9d0	b.eq 0x0092db3c
0092d9d4	mov w8,#0x5
0092d9d8	str w8,[x24]
0092d9dc	b 0x0092db3c
0092d9e0	str xzr,[x26, #0x18]
0092d9e4	str x26,[x19, #0x8]
0092d9e8	str x26,[x22]
0092d9ec	ldr w8,[x26, #0x58]
0092d9f0	cmp w8,#0x3
0092d9f4	b.eq 0x0092da08
0092d9f8	orr w8,wzr,#0x3
0092d9fc	mov x0,x26
0092da00	str w8,[x26, #0x58]
0092da04	bl 0x009425cc
0092da08	ldr x0,[sp, #0x50]
0092da0c	add x1,x26,#0x28
0092da10	mov x2,xzr
0092da14	bl 0x00925d80
0092da18	mov w2,#0x8
0092da1c	mov x0,x26
0092da20	mov x1,xzr
0092da24	bl 0x0092aff8
0092da28	ldr w1,[sp, #0x6c]
0092da2c	mov x0,x20
0092da30	mov w2,wzr
0092da34	bl 0x0092b674
0092da38	ldr w8,[sp, #0x6c]
0092da3c	cbnz w8,0x0092da44
0092da40	str w0,[sp, #0x6c]
0092da44	mov w8,#0x131c
0092da48	ldrb w8,[x20, x8]
0092da4c	tbz w8,#0x6,0x0092da60
0092da50	ldr x8,[x20, #0x1320]
0092da54	ldrb w8,[x8, #0x40]
0092da58	cmp w8,#0x7
0092da5c	b.ne 0x0092db04
0092da60	ldr w8,[x24]
0092da64	cmp w8,#0x10
0092da68	b.eq 0x0092dd40
0092da6c	ldr x26,[x20, #0xc0]
0092da70	mov w8,#0x10
0092da74	str w8,[x20, #0x58]
0092da78	ldr w8,[x26, #0x1c]
0092da7c	subs w8,w8,#0x1
0092da80	str w8,[x26, #0x1c]
0092da84	b.ne 0x0092dad0
0092da88	adrp x27,0xcc4000
0092da8c	add x27,x27,#0x678
0092da90	ldr x0,[x26, #0xd8]
0092da94	ldr x8,[x27]
0092da98	blr x8
0092da9c	ldrb w8,[x26, #0x231]
0092daa0	stp xzr,xzr,[x26, #0xd8]
0092daa4	ldr x0,[x26, #0xe8]
0092daa8	and w8,w8,#0xffffffdf
0092daac	strb w8,[x26, #0x231]
0092dab0	ldr x8,[x27]
0092dab4	adrp x27,0x746000
0092dab8	add x27,x27,#0xfc0
0092dabc	blr x8
0092dac0	ldrb w8,[x26, #0x231]
0092dac4	stp xzr,xzr,[x26, #0xe8]
0092dac8	and w8,w8,#0xffffffbf
0092dacc	strb w8,[x26, #0x231]
0092dad0	ldr x26,[x25]
0092dad4	cbz x26,0x0092daf4
0092dad8	mov x0,x26
0092dadc	mov x1,x20
0092dae0	bl 0x00907e2c
0092dae4	ldr x1,[sp, #0x48]
0092dae8	add x0,x26,#0x3d0
0092daec	mov x2,xzr
0092daf0	bl 0x00925d80
0092daf4	mov x0,x20
0092daf8	str xzr,[x20, #0x20]
0092dafc	bl 0x0092ba18
0092db00	b 0x0092db3c
0092db04	ldr w8,[x24]
0092db08	cbz w8,0x0092d814
0092db0c	str wzr,[x24]
0092db10	b 0x0092d814
0092db14	mov w8,#0x1008
0092db18	movk w8,#0x1, LSL #16
0092db1c	lsr x8,x8,x9
0092db20	str w9,[x24]
0092db24	tbz w8,#0x0,0x0092d814
0092db28	adrp x8,0xc4f000
0092db2c	add x8,x8,#0x8a0
0092db30	ldr x8,[x8, x9, LSL #0x3]
0092db34	mov x0,x20
0092db38	blr x8
0092db3c	mov w26,#0xffffffff
0092db40	ldr w8,[x24]
0092db44	cmp w8,#0x3
0092db48	b.cc 0x0092db80
0092db4c	cmn w26,#0x1
0092db50	b.eq 0x0092db80
0092db54	cmp w8,#0x8
0092db58	b.hi 0x0092db80
0092db5c	ldrb w8,[x19, #0x231]
0092db60	mov w26,wzr
0092db64	tbnz w8,#0x1,0x0092db80
0092db68	add x2,sp,#0x64
0092db6c	add x3,sp,#0x6c
0092db70	mov x0,x20
0092db74	mov x1,x21
0092db78	bl 0x0092ddf8
0092db7c	mov w26,wzr
0092db80	ldr w8,[x24]
0092db84	cmp w8,#0xf
0092db88	b.hi 0x0092dd38
0092db8c	ldr w8,[sp, #0x6c]
0092db90	cbz w8,0x0092d820
0092db94	ldr x8,[x19, #0x40]
0092db98	cbz x8,0x0092dc04
0092db9c	ldr x26,[x8]
0092dba0	str xzr,[x26, #0x10]
0092dba4	ldr x8,[x19, #0x8]
0092dba8	cbz x8,0x0092dbbc
0092dbac	ldr x8,[x22]
0092dbb0	str x26,[x8, #0x10]
0092dbb4	str x8,[x26, #0x18]
0092dbb8	b 0x0092dbc4
0092dbbc	str xzr,[x26, #0x18]
0092dbc0	str x26,[x19, #0x8]
0092dbc4	str x26,[x22]
0092dbc8	ldr w8,[x26, #0x58]
0092dbcc	cmp w8,#0x3
0092dbd0	b.eq 0x0092dbe4
0092dbd4	orr w8,wzr,#0x3
0092dbd8	mov x0,x26
0092dbdc	str w8,[x26, #0x58]
0092dbe0	bl 0x009425cc
0092dbe4	ldr x0,[sp, #0x50]
0092dbe8	add x1,x26,#0x28
0092dbec	mov x2,xzr
0092dbf0	bl 0x00925d80
0092dbf4	mov w2,#0x8
0092dbf8	mov x0,x26
0092dbfc	mov x1,xzr
0092dc00	bl 0x0092aff8
0092dc04	ldr x26,[x25]
0092dc08	cbz x26,0x0092dc70
0092dc0c	ldrb w8,[sp, #0x64]
0092dc10	cbz w8,0x0092dc84
0092dc14	ldr w8,[sp, #0x6c]
0092dc18	mov x0,x26
0092dc1c	mov x1,x20
0092dc20	cmp w8,#0x1c
0092dc24	cset w27,eq
0092dc28	bl 0x00907e2c
0092dc2c	ldr x1,[sp, #0x48]
0092dc30	add x0,x26,#0x3d0
0092dc34	mov x2,xzr
0092dc38	bl 0x00925d80
0092dc3c	mov w2,#0x1
0092dc40	mov x0,x20
0092dc44	mov x1,x26
0092dc48	str xzr,[x20, #0x20]
0092dc4c	bl 0x0090fe90
0092dc50	ldr x23,[sp, #0x40]
0092dc54	mov x0,x20
0092dc58	mov x1,x26
0092dc5c	mov w2,w27
0092dc60	adrp x27,0x746000
0092dc64	add x27,x27,#0xfc0
0092dc68	bl 0x00946cfc
0092dc6c	b 0x0092dc84
0092dc70	ldr w8,[x24]
0092dc74	cmp w8,#0x3
0092dc78	b.ne 0x0092dc88
0092dc7c	mov x0,x20
0092dc80	bl 0x009321e8
0092dc84	ldr w8,[x24]
0092dc88	cmp w8,#0x10
0092dc8c	b.ne 0x0092dc98
0092dc90	mov w26,#0xffffffff
0092dc94	b 0x0092dd34
0092dc98	ldr x26,[x20, #0xc0]
0092dc9c	mov w8,#0x10
0092dca0	str w8,[x20, #0x58]
0092dca4	ldr w8,[x26, #0x1c]
0092dca8	subs w8,w8,#0x1
0092dcac	str w8,[x26, #0x1c]
0092dcb0	b.ne 0x0092dd00
0092dcb4	adrp x8,0xcc4000
0092dcb8	add x8,x8,#0x678
0092dcbc	ldr x0,[x26, #0xd8]
0092dcc0	mov x27,x8
0092dcc4	ldr x8,[x8]
0092dcc8	blr x8
0092dccc	ldrb w8,[x26, #0x231]
0092dcd0	stp xzr,xzr,[x26, #0xd8]
0092dcd4	ldr x0,[x26, #0xe8]
0092dcd8	and w8,w8,#0xffffffdf
0092dcdc	strb w8,[x26, #0x231]
0092dce0	ldr x8,[x27]
0092dce4	adrp x27,0x746000
0092dce8	add x27,x27,#0xfc0
0092dcec	blr x8
0092dcf0	ldrb w8,[x26, #0x231]
0092dcf4	stp xzr,xzr,[x26, #0xe8]
0092dcf8	and w8,w8,#0xffffffbf
0092dcfc	strb w8,[x26, #0x231]
0092dd00	ldr x26,[x25]
0092dd04	cbz x26,0x0092dd24
0092dd08	mov x0,x26
0092dd0c	mov x1,x20
0092dd10	bl 0x00907e2c
0092dd14	ldr x1,[sp, #0x48]
0092dd18	add x0,x26,#0x3d0
0092dd1c	mov x2,xzr
0092dd20	bl 0x00925d80
0092dd24	mov x0,x20
0092dd28	str xzr,[x20, #0x20]
0092dd2c	bl 0x0092ba18
0092dd30	mov w26,#0xffffffff
0092dd34	ldr w8,[x24]
0092dd38	cmp w8,#0x10
0092dd3c	b.ne 0x0092d86c
0092dd40	ldr x8,[x20, #0xa40]
0092dd44	cbz x8,0x0092dd70
0092dd48	ldr w1,[sp, #0x6c]
0092dd4c	mov x0,x20
0092dd50	blr x8
0092dd54	b 0x0092dd94
0092dd58	mov w0,#0x4
0092dd5c	b 0x0092c83c
0092dd60	ldr w8,[sp, #0x6c]
0092dd64	mov w0,wzr
0092dd68	str w8,[x20, #0x5c]
0092dd6c	b 0x0092c83c
0092dd70	mov w8,#0x1
0092dd74	str x20,[x20, #0x80]
0092dd78	str w8,[x20, #0x78]
0092dd7c	ldr w8,[sp, #0x6c]
0092dd80	add x1,x20,#0x60
0092dd84	add x0,x19,#0x20
0092dd88	mov x2,x1
0092dd8c	str w8,[x20, #0x88]
0092dd90	bl 0x00925d10
0092dd94	ldr w8,[x24]
0092dd98	cmp w8,#0x11
0092dd9c	b.eq 0x0092dda8
0092dda0	mov w8,#0x11
0092dda4	str w8,[x24]
0092dda8	ldr x2,[sp, #0x30]
0092ddac	add x0,x19,#0x60
0092ddb0	mov x1,x20
0092ddb4	bl 0x00925d10
0092ddb8	ldp x9,x8,[x20, #0x10]
0092ddbc	cbz x8,0x0092ddd0
0092ddc0	ldr x11,[sp, #0x38]
0092ddc4	str x9,[x8, #0x10]
0092ddc8	ldr x9,[x11]
0092ddcc	b 0x0092ddd8
0092ddd0	ldr x11,[sp, #0x38]
0092ddd4	str x9,[x19, #0x8]
0092ddd8	add x10,x9,#0x18
0092dddc	cmp x9,#0x0
0092dde0	csel x9,x22,x10,eq
0092dde4	mov w0,wzr
0092dde8	str x8,[x9]
0092ddec	stp xzr,xzr,[x11]
0092ddf0	b 0x0092c83c
0092ddf4	bl 0x00c2fec0

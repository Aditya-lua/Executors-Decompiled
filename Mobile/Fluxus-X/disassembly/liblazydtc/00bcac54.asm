; FUN_00bcac54 @ 00bcac54
00bcac54	bti c
00bcac58	mov w8,#0x4240
00bcac5c	movk w8,#0xf, LSL #16
00bcac60	cmp w1,w8
00bcac64	b.cs 0x00bcac98
00bcac68	lsr w8,w1,#0x4
00bcac6c	cmp w8,#0x270
00bcac70	b.hi 0x00bcad34
00bcac74	cmp w1,#0x63
00bcac78	b.hi 0x00bcae44
00bcac7c	cmp w1,#0x9
00bcac80	b.hi 0x00bcafc8
00bcac84	orr w8,w1,#0x30
00bcac88	strb w8,[x0]
00bcac8c	mov w8,#0x1
00bcac90	add x0,x0,x8
00bcac94	ret
00bcac98	mov w10,#0xe100
00bcac9c	movk w10,#0x5f5, LSL #16
00bcaca0	cmp w1,w10
00bcaca4	b.cs 0x00bcad9c
00bcaca8	mov w9,#0xde83
00bcacac	mov w10,#0x967f
00bcacb0	movk w9,#0x431b, LSL #16
00bcacb4	movk w10,#0x98, LSL #16
00bcacb8	umull x9,w1,w9
00bcacbc	cmp w1,w10
00bcacc0	lsr x9,x9,#0x32
00bcacc4	msub w8,w9,w8,w1
00bcacc8	b.hi 0x00bcae8c
00bcaccc	mov w10,#0x8db9
00bcacd0	mov w11,#0x2710
00bcacd4	mov w12,#0x147b
00bcacd8	movk w10,#0x6, LSL #16
00bcacdc	add w9,w9,#0x30
00bcace0	umull x10,w8,w10
00bcace4	strb w9,[x0]
00bcace8	adrp x9,0x78a000
00bcacec	add x9,x9,#0x180
00bcacf0	lsr x10,x10,#0x20
00bcacf4	msub w8,w10,w11,w8
00bcacf8	ldrh w10,[x9, x10, LSL #0x1]
00bcacfc	sturh w10,[x0, #0x1]
00bcad00	ubfx w11,w8,#0x2,#0xe
00bcad04	mul w11,w11,w12
00bcad08	mov w12,#0x64
00bcad0c	lsr w11,w11,#0x11
00bcad10	msub w8,w11,w12,w8
00bcad14	ldrh w10,[x9, w11, UXTW #0x1]
00bcad18	sturh w10,[x0, #0x3]
00bcad1c	and x8,x8,#0xffff
00bcad20	ldrh w8,[x9, x8, LSL #0x1]
00bcad24	sturh w8,[x0, #0x5]
00bcad28	mov w8,#0x7
00bcad2c	add x0,x0,x8
00bcad30	ret
00bcad34	mov w8,#0x1759
00bcad38	lsr w9,w1,#0x5
00bcad3c	movk w8,#0xd1b7, LSL #16
00bcad40	umull x8,w1,w8
00bcad44	cmp w9,#0xc34
00bcad48	lsr x8,x8,#0x2d
00bcad4c	b.hi 0x00bcaef4
00bcad50	mov w9,#0x2710
00bcad54	mov w10,#0x147b
00bcad58	mov w11,#0x64
00bcad5c	msub w9,w8,w9,w1
00bcad60	orr w8,w8,#0x30
00bcad64	strb w8,[x0]
00bcad68	mul w10,w9,w10
00bcad6c	lsr w10,w10,#0x13
00bcad70	msub w8,w10,w11,w9
00bcad74	adrp x9,0x78a000
00bcad78	add x9,x9,#0x180
00bcad7c	ldrh w10,[x9, w10, UXTW #0x1]
00bcad80	sturh w10,[x0, #0x1]
00bcad84	and x8,x8,#0xffff
00bcad88	ldrh w8,[x9, x8, LSL #0x1]
00bcad8c	sturh w8,[x0, #0x3]
00bcad90	mov w8,#0x5
00bcad94	add x0,x0,x8
00bcad98	ret
00bcad9c	mov w9,#0x3b89
00bcada0	mov w11,#0xc9ff
00bcada4	movk w9,#0x55e6, LSL #16
00bcada8	movk w11,#0x3b9a, LSL #16
00bcadac	umull x9,w1,w9
00bcadb0	cmp w1,w11
00bcadb4	lsr x9,x9,#0x39
00bcadb8	msub w10,w9,w10,w1
00bcadbc	b.hi 0x00bcaf44
00bcadc0	mov w11,#0x7bd1
00bcadc4	mov w12,#0x2710
00bcadc8	orr w9,w9,#0x30
00bcadcc	movk w11,#0x863, LSL #16
00bcadd0	mov w13,#0x147b
00bcadd4	strb w9,[x0]
00bcadd8	umull x11,w10,w11
00bcaddc	lsr x11,x11,#0x2f
00bcade0	msub w8,w11,w8,w10
00bcade4	mov w10,#0x1759
00bcade8	movk w10,#0xd1b7, LSL #16
00bcadec	umull x10,w8,w10
00bcadf0	lsr x10,x10,#0x2d
00bcadf4	msub w8,w10,w12,w8
00bcadf8	ubfx w12,w8,#0x2,#0xe
00bcadfc	mul w9,w12,w13
00bcae00	adrp x12,0x78a000
00bcae04	add x12,x12,#0x180
00bcae08	ldrh w11,[x12, x11, LSL #0x1]
00bcae0c	sturh w11,[x0, #0x1]
00bcae10	lsr w9,w9,#0x11
00bcae14	mov w11,#0x64
00bcae18	ldrh w10,[x12, x10, LSL #0x1]
00bcae1c	msub w8,w9,w11,w8
00bcae20	sturh w10,[x0, #0x3]
00bcae24	ldrh w9,[x12, w9, UXTW #0x1]
00bcae28	and x8,x8,#0xffff
00bcae2c	sturh w9,[x0, #0x5]
00bcae30	ldrh w8,[x12, x8, LSL #0x1]
00bcae34	sturh w8,[x0, #0x7]
00bcae38	mov w8,#0x9
00bcae3c	add x0,x0,x8
00bcae40	ret
00bcae44	ubfx w8,w1,#0x2,#0xe
00bcae48	mov w9,#0x147b
00bcae4c	cmp w1,#0x3e7
00bcae50	mul w8,w8,w9
00bcae54	mov w9,#0x64
00bcae58	lsr w8,w8,#0x11
00bcae5c	msub w9,w8,w9,w1
00bcae60	b.hi 0x00bcafe4
00bcae64	orr w8,w8,#0x30
00bcae68	strb w8,[x0]
00bcae6c	and x8,x9,#0xffff
00bcae70	adrp x9,0x78a000
00bcae74	add x9,x9,#0x180
00bcae78	ldrh w8,[x9, x8, LSL #0x1]
00bcae7c	sturh w8,[x0, #0x1]
00bcae80	mov w8,#0x3
00bcae84	add x0,x0,x8
00bcae88	ret
00bcae8c	mov w10,#0x1759
00bcae90	mov w11,#0x2710
00bcae94	mov w12,#0x147b
00bcae98	movk w10,#0xd1b7, LSL #16
00bcae9c	umull x10,w8,w10
00bcaea0	lsr x10,x10,#0x2d
00bcaea4	msub w8,w10,w11,w8
00bcaea8	ubfx w11,w8,#0x2,#0xe
00bcaeac	mul w11,w11,w12
00bcaeb0	adrp x12,0x78a000
00bcaeb4	add x12,x12,#0x180
00bcaeb8	ldrh w9,[x12, w9, UXTW #0x1]
00bcaebc	strh w9,[x0]
00bcaec0	ldrh w9,[x12, x10, LSL #0x1]
00bcaec4	lsr w10,w11,#0x11
00bcaec8	mov w11,#0x64
00bcaecc	strh w9,[x0, #0x2]
00bcaed0	msub w8,w10,w11,w8
00bcaed4	ldrh w9,[x12, w10, UXTW #0x1]
00bcaed8	strh w9,[x0, #0x4]
00bcaedc	and x8,x8,#0xffff
00bcaee0	ldrh w8,[x12, x8, LSL #0x1]
00bcaee4	strh w8,[x0, #0x6]
00bcaee8	mov w8,#0x8
00bcaeec	add x0,x0,x8
00bcaef0	ret
00bcaef4	mov w9,#0x2710
00bcaef8	mov w11,#0x147b
00bcaefc	mov w12,#0x64
00bcaf00	msub w9,w8,w9,w1
00bcaf04	ubfx w10,w9,#0x2,#0xe
00bcaf08	mul w10,w10,w11
00bcaf0c	adrp x11,0x78a000
00bcaf10	add x11,x11,#0x180
00bcaf14	ldrh w8,[x11, w8, UXTW #0x1]
00bcaf18	lsr w10,w10,#0x11
00bcaf1c	strh w8,[x0]
00bcaf20	msub w8,w10,w12,w9
00bcaf24	ldrh w9,[x11, w10, UXTW #0x1]
00bcaf28	strh w9,[x0, #0x2]
00bcaf2c	and x8,x8,#0xffff
00bcaf30	ldrh w8,[x11, x8, LSL #0x1]
00bcaf34	strh w8,[x0, #0x4]
00bcaf38	mov w8,#0x6
00bcaf3c	add x0,x0,x8
00bcaf40	ret
00bcaf44	mov w11,#0xde83
00bcaf48	mov w12,#0x2710
00bcaf4c	movk w11,#0x431b, LSL #16
00bcaf50	umull x11,w10,w11
00bcaf54	lsr x11,x11,#0x32
00bcaf58	msub w8,w11,w8,w10
00bcaf5c	mov w10,#0x1759
00bcaf60	movk w10,#0xd1b7, LSL #16
00bcaf64	umull x10,w8,w10
00bcaf68	lsr x10,x10,#0x2d
00bcaf6c	msub w8,w10,w12,w8
00bcaf70	adrp x12,0x78a000
00bcaf74	add x12,x12,#0x180
00bcaf78	ldrh w9,[x12, w9, UXTW #0x1]
00bcaf7c	ubfx w13,w8,#0x2,#0xe
00bcaf80	strh w9,[x0]
00bcaf84	mov w9,#0x147b
00bcaf88	ldrh w11,[x12, x11, LSL #0x1]
00bcaf8c	mul w9,w13,w9
00bcaf90	strh w11,[x0, #0x2]
00bcaf94	mov w11,#0x64
00bcaf98	ldrh w10,[x12, x10, LSL #0x1]
00bcaf9c	lsr w9,w9,#0x11
00bcafa0	strh w10,[x0, #0x4]
00bcafa4	msub w8,w9,w11,w8
00bcafa8	ldrh w9,[x12, w9, UXTW #0x1]
00bcafac	strh w9,[x0, #0x6]
00bcafb0	and x8,x8,#0xffff
00bcafb4	ldrh w8,[x12, x8, LSL #0x1]
00bcafb8	strh w8,[x0, #0x8]
00bcafbc	mov w8,#0xa
00bcafc0	add x0,x0,x8
00bcafc4	ret
00bcafc8	adrp x8,0x78a000
00bcafcc	add x8,x8,#0x180
00bcafd0	ldrh w8,[x8, w1, UXTW #0x1]
00bcafd4	strh w8,[x0]
00bcafd8	mov w8,#0x2
00bcafdc	add x0,x0,x8
00bcafe0	ret
00bcafe4	adrp x10,0x78a000
00bcafe8	add x10,x10,#0x180
00bcafec	ldrh w8,[x10, w8, UXTW #0x1]
00bcaff0	strh w8,[x0]
00bcaff4	and x8,x9,#0xffff
00bcaff8	ldrh w8,[x10, x8, LSL #0x1]
00bcaffc	strh w8,[x0, #0x2]
00bcb000	mov w8,#0x4
00bcb004	add x0,x0,x8
00bcb008	ret

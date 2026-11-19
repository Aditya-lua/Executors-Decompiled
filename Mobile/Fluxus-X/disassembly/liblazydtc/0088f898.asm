; FUN_0088f898 @ 0088f898
0088f898	sub sp,sp,#0xa0
0088f89c	stp x29,x30,[sp, #0x40]
0088f8a0	stp x28,x27,[sp, #0x50]
0088f8a4	stp x26,x25,[sp, #0x60]
0088f8a8	stp x24,x23,[sp, #0x70]
0088f8ac	stp x22,x21,[sp, #0x80]
0088f8b0	stp x20,x19,[sp, #0x90]
0088f8b4	add x29,sp,#0x40
0088f8b8	mrs x25,tpidr_el0
0088f8bc	mov w21,w2
0088f8c0	mov x20,x1
0088f8c4	ldr x8,[x25, #0x28]
0088f8c8	mov x19,x0
0088f8cc	stur x8,[x29, #-0x8]
0088f8d0	ldr w8,[x1, #0x1c]
0088f8d4	ldr w27,[x0, #0x64c]
0088f8d8	stur x0,[x29, #-0x18]
0088f8dc	cmp w8,#0x7
0088f8e0	stur w27,[x29, #-0x10]
0088f8e4	b.gt 0x0088f974
0088f8e8	b.cs 0x0088fb88
0088f8ec	ldr x1,[x20, #0x28]
0088f8f0	mov x0,x19
0088f8f4	bl 0x008932d0
0088f8f8	mov w23,w0
0088f8fc	cmp w0,#0xff
0088f900	b.hi 0x0088fa04
0088f904	ldr x24,[x20, #0x20]
0088f908	mov x0,x19
0088f90c	mov x1,x24
0088f910	bl 0x0088df20
0088f914	mov w22,w0
0088f918	tbz w0,#0x1f,0x0088f954
0088f91c	ldr w2,[x19, #0x64c]
0088f920	add w8,w2,#0x1
0088f924	cmp w8,#0x100
0088f928	b.cs 0x00890124
0088f92c	ldr w9,[x19, #0x650]
0088f930	str w8,[x19, #0x64c]
0088f934	cmp w9,w8
0088f938	csel w8,w9,w8,hi
0088f93c	str w8,[x19, #0x650]
0088f940	mov x0,x19
0088f944	mov x1,x24
0088f948	mov w3,#0xff
0088f94c	bl 0x00891438
0088f950	mov w22,w0
0088f954	ldr w8,[x20, #0x1c]
0088f958	ldr x0,[x19]
0088f95c	cmp w8,#0x6
0088f960	b.hi 0x0088fb1c
0088f964	adrp x9,0x364000
0088f968	add x9,x9,#0x4fc
0088f96c	ldr w1,[x9, x8, LSL #0x2]
0088f970	b 0x0088fb20
0088f974	sub w9,w8,#0x8
0088f978	cmp w9,#0x6
0088f97c	b.cs 0x0088faf8
0088f980	mov x0,x19
0088f984	mov x1,x20
0088f988	mov w2,wzr
0088f98c	bl 0x00893480
0088f990	mov x22,x0
0088f994	ldr x0,[x19]
0088f998	mov w1,#0x3
0088f99c	mov w2,w21
0088f9a0	mov w3,wzr
0088f9a4	mov w4,#0x1
0088f9a8	bl 0x00875b54
0088f9ac	ldr x0,[x19]
0088f9b0	bl 0x00875ec8
0088f9b4	mov x23,x0
0088f9b8	ldr x0,[x19]
0088f9bc	mov w1,#0x3
0088f9c0	mov w2,w21
0088f9c4	mov w3,#0x1
0088f9c8	mov w4,wzr
0088f9cc	bl 0x00875b54
0088f9d0	ldr x0,[x19]
0088f9d4	mov x1,x22
0088f9d8	mov x2,x23
0088f9dc	bl 0x00875ed8
0088f9e0	tbnz w0,#0x0,0x00890058
0088f9e4	ldr x8,[x25, #0x28]
0088f9e8	ldur x9,[x29, #-0x8]
0088f9ec	cmp x8,x9
0088f9f0	b.ne 0x00890294
0088f9f4	adrp x1,0x2ab000
0088f9f8	add x1,x1,#0x47b
0088f9fc	add x0,x20,#0xc
0088fa00	bl 0x0087fcd8
0088fa04	ldr w8,[x20, #0x1c]
0088fa08	orr w9,w8,#0x2
0088fa0c	cmp w9,#0x3
0088fa10	b.ne 0x0088fcbc
0088fa14	ldr x1,[x20, #0x20]
0088fa18	mov x0,x19
0088fa1c	bl 0x008932d0
0088fa20	mov w23,w0
0088fa24	cmp w0,#0xff
0088fa28	b.hi 0x0088feb0
0088fa2c	ldr x24,[x20, #0x28]
0088fa30	mov x0,x19
0088fa34	mov x1,x24
0088fa38	bl 0x0088df20
0088fa3c	mov w22,w0
0088fa40	tbz w0,#0x1f,0x0088fa7c
0088fa44	ldr w2,[x19, #0x64c]
0088fa48	add w8,w2,#0x1
0088fa4c	cmp w8,#0x100
0088fa50	b.cs 0x008901c4
0088fa54	ldr w9,[x19, #0x650]
0088fa58	str w8,[x19, #0x64c]
0088fa5c	cmp w9,w8
0088fa60	csel w8,w9,w8,hi
0088fa64	str w8,[x19, #0x650]
0088fa68	mov x0,x19
0088fa6c	mov x1,x24
0088fa70	mov w3,#0xff
0088fa74	bl 0x00891438
0088fa78	mov w22,w0
0088fa7c	ldr w8,[x20, #0x1c]
0088fa80	ldr x0,[x19]
0088fa84	cmp w8,#0x1
0088fa88	mov w8,#0x47
0088fa8c	cinc w1,w8,ne
0088fa90	mov w2,w21
0088fa94	mov w3,w23
0088fa98	mov w4,w22
0088fa9c	bl 0x00875b54
0088faa0	ldr x1,[x20, #0x28]
0088faa4	adrp x8,0xd1b000
0088faa8	ldr w8,[x8, #0x10]
0088faac	ldr w9,[x1, #0x8]
0088fab0	cbz x1,0x0088fabc
0088fab4	cmp w9,w8
0088fab8	b.eq 0x00890058
0088fabc	adrp x10,0xd1a000
0088fac0	adrp x11,0xd1b000
0088fac4	mov x12,x1
0088fac8	ldr w10,[x10, #0xfc0]
0088facc	ldr w11,[x11, #0xb0]
0088fad0	cmp w9,w10
0088fad4	b.eq 0x0088fae0
0088fad8	cmp w9,w11
0088fadc	b.ne 0x0088fe60
0088fae0	ldr x12,[x12, #0x20]
0088fae4	ldr w9,[x12, #0x8]
0088fae8	cbz x12,0x0088fad0
0088faec	cmp w9,w8
0088faf0	b.ne 0x0088fad0
0088faf4	b 0x00890058
0088faf8	sub w8,w8,#0xe
0088fafc	cmp w8,#0x2
0088fb00	b.cs 0x00890058
0088fb04	and w3,w3,#0x1
0088fb08	mov x0,x19
0088fb0c	mov x1,x20
0088fb10	mov w2,w21
0088fb14	bl 0x00893a04
0088fb18	b 0x00890058
0088fb1c	mov w1,wzr
0088fb20	mov w2,w21
0088fb24	mov w3,w22
0088fb28	mov w4,w23
0088fb2c	bl 0x00875b54
0088fb30	ldr x1,[x20, #0x20]
0088fb34	adrp x8,0xd1b000
0088fb38	ldr w8,[x8, #0x10]
0088fb3c	ldr w9,[x1, #0x8]
0088fb40	cbz x1,0x0088fb4c
0088fb44	cmp w9,w8
0088fb48	b.eq 0x00890058
0088fb4c	adrp x10,0xd1a000
0088fb50	adrp x11,0xd1b000
0088fb54	mov x12,x1
0088fb58	ldr w10,[x10, #0xfc0]
0088fb5c	ldr w11,[x11, #0xb0]
0088fb60	cmp w9,w10
0088fb64	b.eq 0x0088fb70
0088fb68	cmp w9,w11
0088fb6c	b.ne 0x0088fd78
0088fb70	ldr x12,[x12, #0x20]
0088fb74	ldr w9,[x12, #0x8]
0088fb78	cbz x12,0x0088fb60
0088fb7c	cmp w9,w8
0088fb80	b.ne 0x0088fb60
0088fb84	b 0x00890058
0088fb88	cmp w8,#0x7
0088fb8c	b.ne 0x00890058
0088fb90	ldr x26,[x20, #0x28]
0088fb94	ldr q0,[x20, #0x20]
0088fb98	str w21,[sp, #0xc]
0088fb9c	str q0,[sp, #0x10]
0088fba0	mov w0,#0x10
0088fba4	str x25,[sp, #0x20]
0088fba8	bl 0x00c2fed0
0088fbac	ldr q0,[sp, #0x10]
0088fbb0	mov x22,x0
0088fbb4	mov x8,x0
0088fbb8	str q0,[x8], #0x10
0088fbbc	cbz x26,0x0088fd90
0088fbc0	adrp x10,0xd1b000
0088fbc4	ldr w9,[x26, #0x8]
0088fbc8	ldr w10,[x10, #0xa0]
0088fbcc	cmp w9,w10
0088fbd0	b.ne 0x0088fd90
0088fbd4	add x28,x22,#0x8
0088fbd8	mov x25,x8
0088fbdc	str w27,[sp, #0x8]
0088fbe0	ldr w10,[x26, #0x1c]
0088fbe4	cmp w10,#0x7
0088fbe8	b.ne 0x0088fcac
0088fbec	ldr x10,[x26, #0x20]
0088fbf0	cmp x8,x25
0088fbf4	str x10,[x28]
0088fbf8	b.cs 0x0088fc0c
0088fbfc	ldr x10,[x26, #0x28]
0088fc00	mov x28,x8
0088fc04	str x10,[x8]
0088fc08	b 0x0088fc98
0088fc0c	sub x23,x8,x22
0088fc10	asr x21,x23,#0x3
0088fc14	add x8,x21,#0x1
0088fc18	lsr x9,x8,#0x3d
0088fc1c	cbnz x9,0x00890108
0088fc20	sub x24,x25,x22
0088fc24	mov x28,x25
0088fc28	asr x9,x24,#0x2
0088fc2c	cmp x9,x8
0088fc30	csel x8,x9,x8,hi
0088fc34	orr x9,xzr,#0x7ffffffffffffff8
0088fc38	cmp x24,x9
0088fc3c	mov x9,#0x1fffffffffffffff
0088fc40	csel x27,x8,x9,cc
0088fc44	lsr x8,x27,#0x3d
0088fc48	cbnz x8,0x008900f0
0088fc4c	lsl x0,x27,#0x3
0088fc50	bl 0x00c2fed0
0088fc54	add x28,x0,x23
0088fc58	ldr x8,[x26, #0x28]
0088fc5c	mov x25,x0
0088fc60	sub x26,x28,x21, LSL #0x3
0088fc64	mov x1,x22
0088fc68	mov x2,x23
0088fc6c	str x8,[x28]
0088fc70	mov x0,x26
0088fc74	bl 0x00c2ffd0
0088fc78	mov x0,x22
0088fc7c	mov x1,x24
0088fc80	add x25,x25,x27, LSL #0x3
0088fc84	bl 0x00c2fe80
0088fc88	adrp x8,0xd1b000
0088fc8c	mov x22,x26
0088fc90	ldr w9,[x8, #0xa0]
0088fc94	mov x8,x28
0088fc98	ldr x26,[x8], #0x8
0088fc9c	cbz x26,0x0088fcac
0088fca0	ldr w10,[x26, #0x8]
0088fca4	cmp w10,w9
0088fca8	b.eq 0x0088fbe0
0088fcac	ldr w23,[x19, #0x64c]
0088fcb0	ldr w27,[sp, #0x8]
0088fcb4	mov x28,x25
0088fcb8	b 0x0088fd98
0088fcbc	ldr w9,[x19, #0x8]
0088fcc0	cmp w9,#0x2
0088fcc4	b.lt 0x0088feb0
0088fcc8	orr w9,w8,#0x2
0088fccc	cmp w9,#0x2
0088fcd0	b.ne 0x0088feb0
0088fcd4	ldr x9,[x19, #0x330]
0088fcd8	cbz x9,0x0088feb0
0088fcdc	lsl w9,w20,#0x3
0088fce0	mov x11,#0x2d69
0088fce4	lsr x10,x20,#0x20
0088fce8	movk x11,#0xeb38, LSL #16
0088fcec	add x9,x9,#0x8
0088fcf0	movk x11,#0xea08, LSL #32
0088fcf4	eor x9,x9,x10
0088fcf8	movk x11,#0x9ddf, LSL #48
0088fcfc	mul x9,x9,x11
0088fd00	eor x10,x10,x9, LSR #0x2f
0088fd04	eor x9,x10,x9
0088fd08	mov x10,#0x959d
0088fd0c	mul x9,x9,x11
0088fd10	movk x10,#0xb8f4, LSL #16
0088fd14	movk x10,#0xd34f, LSL #32
0088fd18	movk x10,#0x949d, LSL #48
0088fd1c	eor x9,x9,x9, LSR #0x2f
0088fd20	mul x9,x9,x10
0088fd24	ldrb w10,[x19, #0x338]
0088fd28	lsr x9,x9,x10
0088fd2c	ldr x10,[x19, #0x320]
0088fd30	lsr x11,x9,#0x6
0088fd34	ldr x11,[x10, x11, LSL #0x3]
0088fd38	lsr x11,x11,x9
0088fd3c	tbz w11,#0x0,0x0088feb0
0088fd40	ldr x12,[x19, #0x328]
0088fd44	ldr x11,[x19, #0x308]
0088fd48	sub x12,x12,#0x1
0088fd4c	lsl x13,x9,#0x4
0088fd50	ldr x13,[x11, x13#0x0]
0088fd54	cmp x13,x20
0088fd58	b.eq 0x0088fe78
0088fd5c	add x9,x9,#0x1
0088fd60	and x9,x9,x12
0088fd64	lsr x13,x9,#0x6
0088fd68	ldr x13,[x10, x13, LSL #0x3]
0088fd6c	lsr x13,x13,x9
0088fd70	tbnz w13,#0x0,0x0088fd4c
0088fd74	b 0x0088feb0
0088fd78	and w2,w22,#0xff
0088fd7c	mov x0,x19
0088fd80	mov w3,#0x2
0088fd84	mov w4,#0x1
0088fd88	bl 0x008917fc
0088fd8c	b 0x00890058
0088fd90	mov w23,w27
0088fd94	mov x28,x8
0088fd98	sub x24,x8,x22
0088fd9c	asr x2,x24,#0x3
0088fda0	add w9,w23,w2
0088fda4	cmp w9,#0x100
0088fda8	b.cs 0x0089014c
0088fdac	ldr w10,[x19, #0x650]
0088fdb0	str w9,[x19, #0x64c]
0088fdb4	cmp w10,w9
0088fdb8	csel w9,w10,w9,hi
0088fdbc	cmp x8,x22
0088fdc0	str w9,[x19, #0x650]
0088fdc4	b.eq 0x0088fe2c
0088fdc8	cmp x2,#0x1
0088fdcc	mov x20,xzr
0088fdd0	adrp x26,0xd1f000
0088fdd4	csinc x25,x2,xzr,hi
0088fdd8	b 0x0088fdf4
0088fddc	mov x0,x19
0088fde0	mov w3,#0x1
0088fde4	bl 0x0088d1d0
0088fde8	add x20,x20,#0x1
0088fdec	cmp x25,x20
0088fdf0	b.eq 0x0088fe2c
0088fdf4	ldrb w8,[x26, #0x68]
0088fdf8	ldr x1,[x22, x20, LSL #0x3]
0088fdfc	add w2,w20,w23
0088fe00	cmp w8,#0x1
0088fe04	b.ne 0x0088fddc
0088fe08	and w8,w2,#0xff
0088fe0c	ldr w21,[x19, #0x64c]
0088fe10	add w8,w8,#0x1
0088fe14	str w8,[x19, #0x64c]
0088fe18	mov x0,x19
0088fe1c	mov w3,#0x1
0088fe20	bl 0x0088d1d0
0088fe24	str w21,[x19, #0x64c]
0088fe28	b 0x0088fde8
0088fe2c	lsr x8,x24,#0x3
0088fe30	ldr x0,[x19]
0088fe34	add w8,w23,w8
0088fe38	sub w4,w8,#0x1
0088fe3c	ldr w2,[sp, #0xc]
0088fe40	mov w1,#0x31
0088fe44	mov w3,w23
0088fe48	bl 0x00875b54
0088fe4c	sub x1,x28,x22
0088fe50	mov x0,x22
0088fe54	bl 0x00c2fe80
0088fe58	ldr x25,[sp, #0x20]
0088fe5c	b 0x00890058
0088fe60	and w2,w22,#0xff
0088fe64	mov x0,x19
0088fe68	mov w3,#0x2
0088fe6c	mov w4,#0x1
0088fe70	bl 0x008917fc
0088fe74	b 0x00890058
0088fe78	add x9,x11,x9, LSL #0x4
0088fe7c	ldr w9,[x9, #0x8]
0088fe80	cmp w9,#0x2
0088fe84	b.eq 0x0088fe98
0088fe88	cmp w9,#0x8
0088fe8c	b.ne 0x0088feb0
0088fe90	cmp w8,#0x2
0088fe94	b.ne 0x0088feb0
0088fe98	ldr x1,[x20, #0x20]
0088fe9c	mov x0,x19
0088fea0	bl 0x008932d0
0088fea4	mov w22,w0
0088fea8	cmp w0,#0xff
0088feac	b.ls 0x0089008c
0088feb0	ldr x22,[x20, #0x20]
0088feb4	mov x0,x19
0088feb8	mov x1,x22
0088febc	bl 0x0088df20
0088fec0	mov w23,w0
0088fec4	tbz w0,#0x1f,0x0088ff00
0088fec8	ldr w2,[x19, #0x64c]
0088fecc	add w8,w2,#0x1
0088fed0	cmp w8,#0x100
0088fed4	b.cs 0x00890174
0088fed8	ldr w9,[x19, #0x650]
0088fedc	str w8,[x19, #0x64c]
0088fee0	cmp w9,w8
0088fee4	csel w8,w9,w8,hi
0088fee8	str w8,[x19, #0x650]
0088feec	mov x0,x19
0088fef0	mov x1,x22
0088fef4	mov w3,#0xff
0088fef8	bl 0x00891438
0088fefc	mov w23,w0
0088ff00	ldr x24,[x20, #0x28]
0088ff04	mov x0,x19
0088ff08	mov x1,x24
0088ff0c	bl 0x0088df20
0088ff10	mov w22,w0
0088ff14	tbz w0,#0x1f,0x0088ff50
0088ff18	ldr w2,[x19, #0x64c]
0088ff1c	add w8,w2,#0x1
0088ff20	cmp w8,#0x100
0088ff24	b.cs 0x0089019c
0088ff28	ldr w9,[x19, #0x650]
0088ff2c	str w8,[x19, #0x64c]
0088ff30	cmp w9,w8
0088ff34	csel w8,w9,w8,hi
0088ff38	str w8,[x19, #0x650]
0088ff3c	mov x0,x19
0088ff40	mov x1,x24
0088ff44	mov w3,#0xff
0088ff48	bl 0x00891438
0088ff4c	mov w22,w0
0088ff50	ldr w8,[x20, #0x1c]
0088ff54	ldr x0,[x19]
0088ff58	cmp w8,#0x6
0088ff5c	b.hi 0x0088ff70
0088ff60	adrp x9,0x364000
0088ff64	add x9,x9,#0x518
0088ff68	ldr w1,[x9, x8, LSL #0x2]
0088ff6c	b 0x0088ff74
0088ff70	mov w1,wzr
0088ff74	mov w2,w21
0088ff78	mov w3,w23
0088ff7c	mov w4,w22
0088ff80	bl 0x00875b54
0088ff84	ldr x1,[x20, #0x20]
0088ff88	adrp x21,0xd1b000
0088ff8c	ldr w8,[x21, #0x10]
0088ff90	ldr w9,[x1, #0x8]
0088ff94	cbz x1,0x0088ffa0
0088ff98	cmp w9,w8
0088ff9c	b.eq 0x0088fff4
0088ffa0	adrp x10,0xd1a000
0088ffa4	adrp x11,0xd1b000
0088ffa8	mov x12,x1
0088ffac	ldr w10,[x10, #0xfc0]
0088ffb0	ldr w11,[x11, #0xb0]
0088ffb4	cmp w9,w10
0088ffb8	b.eq 0x0088ffc4
0088ffbc	cmp w9,w11
0088ffc0	b.ne 0x0088ffdc
0088ffc4	ldr x12,[x12, #0x20]
0088ffc8	ldr w9,[x12, #0x8]
0088ffcc	cbz x12,0x0088ffb4
0088ffd0	cmp w9,w8
0088ffd4	b.ne 0x0088ffb4
0088ffd8	b 0x0088fff4
0088ffdc	and w2,w23,#0xff
0088ffe0	mov x0,x19
0088ffe4	mov w3,#0x2
0088ffe8	mov w4,#0x1
0088ffec	bl 0x008917fc
0088fff0	ldr w8,[x21, #0x10]
0088fff4	ldr x1,[x20, #0x28]
0088fff8	ldr w9,[x1, #0x8]
0088fffc	cbz x1,0x00890008
00890000	cmp w9,w8
00890004	b.eq 0x00890058
00890008	adrp x10,0xd1a000
0089000c	adrp x11,0xd1b000
00890010	mov x12,x1
00890014	ldr w10,[x10, #0xfc0]
00890018	ldr w11,[x11, #0xb0]
0089001c	cmp w9,w10
00890020	b.eq 0x0089002c
00890024	cmp w9,w11
00890028	b.ne 0x00890044
0089002c	ldr x12,[x12, #0x20]
00890030	ldr w9,[x12, #0x8]
00890034	cbz x12,0x0089001c
00890038	cmp w9,w8
0089003c	b.ne 0x0089001c
00890040	b 0x00890058
00890044	and w2,w22,#0xff
00890048	mov x0,x19
0089004c	mov w3,#0x2
00890050	mov w4,#0x1
00890054	bl 0x008917fc
00890058	str w27,[x19, #0x64c]
0089005c	ldr x8,[x25, #0x28]
00890060	ldur x9,[x29, #-0x8]
00890064	cmp x8,x9
00890068	b.ne 0x00890294
0089006c	ldp x20,x19,[sp, #0x90]
00890070	ldp x22,x21,[sp, #0x80]
00890074	ldp x24,x23,[sp, #0x70]
00890078	ldp x26,x25,[sp, #0x60]
0089007c	ldp x28,x27,[sp, #0x50]
00890080	ldp x29,x30,[sp, #0x40]
00890084	add sp,sp,#0xa0
00890088	ret
0089008c	ldr x1,[x20, #0x28]
00890090	sub x2,x29,#0x18
00890094	mov x0,x19
00890098	bl 0x00891514
0089009c	ldr w1,[x20, #0x1c]
008900a0	mov w23,w0
008900a4	ldr x24,[x19]
008900a8	mov x0,x19
008900ac	mov w2,#0x1
008900b0	bl 0x008933c4
008900b4	mov w1,w0
008900b8	mov x0,x24
008900bc	mov w2,w21
008900c0	mov w3,w23
008900c4	mov w4,w22
008900c8	bl 0x00875b54
008900cc	ldr x1,[x20, #0x28]
008900d0	and w2,w23,#0xff
008900d4	mov x0,x19
008900d8	mov w3,#0x2
008900dc	mov w4,#0x1
008900e0	bl 0x00891590
008900e4	ldur w27,[x29, #-0x10]
008900e8	ldur x19,[x29, #-0x18]
008900ec	b 0x00890058
008900f0	ldr x8,[sp, #0x20]
008900f4	ldr x8,[x8, #0x28]
008900f8	ldur x9,[x29, #-0x8]
008900fc	cmp x8,x9
00890100	b.ne 0x00890294
00890104	bl 0x007fe1b8
00890108	ldr x8,[sp, #0x20]
0089010c	ldr x8,[x8, #0x28]
00890110	ldur x9,[x29, #-0x8]
00890114	cmp x8,x9
00890118	b.ne 0x00890294
0089011c	mov x28,x25
00890120	bl 0x0086f7dc
00890124	ldr x8,[x25, #0x28]
00890128	ldur x9,[x29, #-0x8]
0089012c	cmp x8,x9
00890130	b.ne 0x00890294
00890134	adrp x1,0x2d0000
00890138	add x1,x1,#0xc00
0089013c	add x0,x24,#0xc
00890140	mov w2,#0x1
00890144	mov w3,#0xff
00890148	bl 0x0087fcd8
0089014c	ldr x8,[sp, #0x20]
00890150	ldr x8,[x8, #0x28]
00890154	ldur x9,[x29, #-0x8]
00890158	cmp x8,x9
0089015c	b.ne 0x00890294
00890160	adrp x1,0x2d0000
00890164	add x1,x1,#0xc00
00890168	add x0,x20,#0xc
0089016c	mov w3,#0xff
00890170	bl 0x0087fcd8
00890174	ldr x8,[x25, #0x28]
00890178	ldur x9,[x29, #-0x8]
0089017c	cmp x8,x9
00890180	b.ne 0x00890294
00890184	adrp x1,0x2d0000
00890188	add x1,x1,#0xc00
0089018c	add x0,x22,#0xc
00890190	mov w2,#0x1
00890194	mov w3,#0xff
00890198	bl 0x0087fcd8
0089019c	ldr x8,[x25, #0x28]
008901a0	ldur x9,[x29, #-0x8]
008901a4	cmp x8,x9
008901a8	b.ne 0x00890294
008901ac	adrp x1,0x2d0000
008901b0	add x1,x1,#0xc00
008901b4	add x0,x24,#0xc
008901b8	mov w2,#0x1
008901bc	mov w3,#0xff
008901c0	bl 0x0087fcd8
008901c4	ldr x8,[x25, #0x28]
008901c8	ldur x9,[x29, #-0x8]
008901cc	cmp x8,x9
008901d0	b.ne 0x00890294
008901d4	adrp x1,0x2d0000
008901d8	add x1,x1,#0xc00
008901dc	add x0,x24,#0xc
008901e0	mov w2,#0x1
008901e4	mov w3,#0xff
008901e8	bl 0x0087fcd8
00890294	bl 0x00c2fec0

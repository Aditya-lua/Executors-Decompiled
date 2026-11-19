; mbedtls_aes_self_test @ 00b6f738
00b6f738	stp x28,x27,[sp, #-0x60]!
00b6f73c	stp x26,x25,[sp, #0x10]
00b6f740	stp x24,x23,[sp, #0x20]
00b6f744	stp x22,x21,[sp, #0x30]
00b6f748	stp x20,x19,[sp, #0x40]
00b6f74c	stp x29,x30,[sp, #0x50]
00b6f750	add x29,sp,#0x50
00b6f754	sub sp,sp,#0x430
00b6f758	mrs x8,tpidr_el0
00b6f75c	str x8,[sp, #0x8]
00b6f760	ldr x8,[x8, #0x28]
00b6f764	mov w19,w0
00b6f768	movi v0.2D,#0x0
00b6f76c	add x0,sp,#0x270
00b6f770	mov w2,#0x120
00b6f774	mov w1,wzr
00b6f778	stur x8,[x29, #-0x60]
00b6f77c	stp q0,q0,[x29, #-0x80]
00b6f780	bl 0x00c301c0
00b6f784	cbz w19,0x00b6f794
00b6f788	adrp x0,0x746000
00b6f78c	add x0,x0,#0x370
00b6f790	bl 0x00c30760
00b6f794	adrp x20,0x29f000
00b6f798	adrp x26,0x77d000
00b6f79c	adrp x21,0x77c000
00b6f7a0	adrp x22,0x77c000
00b6f7a4	adrp x27,0x77d000
00b6f7a8	mov w25,wzr
00b6f7ac	add x20,x20,#0x1a
00b6f7b0	add x26,x26,#0xf0
00b6f7b4	add x21,x21,#0x884
00b6f7b8	add x22,x22,#0x87c
00b6f7bc	add x27,x27,#0x120
00b6f7c0	lsr w28,w25,#0x1
00b6f7c4	lsl w8,w28,#0x6
00b6f7c8	add w24,w8,#0x80
00b6f7cc	cbz w19,0x00b6f7f4
00b6f7d0	adrp x8,0x2be000
00b6f7d4	adrp x9,0x2ca000
00b6f7d8	tst w25,#0x1
00b6f7dc	add x8,x8,#0xbd0
00b6f7e0	add x9,x9,#0x8db
00b6f7e4	csel x2,x9,x8,eq
00b6f7e8	mov x0,x20
00b6f7ec	mov w1,w24
00b6f7f0	bl 0x00c41af0
00b6f7f4	add x0,sp,#0x270
00b6f7f8	sub x1,x29,#0x80
00b6f7fc	mov w2,w24
00b6f800	stp xzr,xzr,[x29, #-0xc0]
00b6f804	tbnz w25,#0x0,0x00b6f82c
00b6f808	bl 0x00c41930
00b6f80c	mov w23,w0
00b6f810	mov x8,x26
00b6f814	cmp w24,#0xc0
00b6f818	b.ne 0x00b6f840
00b6f81c	cmn w23,#0x72
00b6f820	b.ne 0x00b6f840
00b6f824	mov x0,x21
00b6f828	b 0x00b6f8a0
00b6f82c	bl 0x00c41940
00b6f830	mov w23,w0
00b6f834	mov x8,x27
00b6f838	cmp w24,#0xc0
00b6f83c	b.eq 0x00b6f81c
00b6f840	cbnz w23,0x00b700d8
00b6f844	add x23,x8,w28, UXTW  #0x4
00b6f848	mov w24,#0x2710
00b6f84c	tbnz w25,#0x0,0x00b6f86c
00b6f850	add x0,sp,#0x270
00b6f854	sub x1,x29,#0xc0
00b6f858	sub x2,x29,#0xc0
00b6f85c	bl 0x00c41990
00b6f860	subs w24,w24,#0x1
00b6f864	b.ne 0x00b6f84c
00b6f868	b 0x00b6f884
00b6f86c	add x0,sp,#0x270
00b6f870	sub x1,x29,#0xc0
00b6f874	sub x2,x29,#0xc0
00b6f878	bl 0x00c419a0
00b6f87c	subs w24,w24,#0x1
00b6f880	b.ne 0x00b6f84c
00b6f884	sub x0,x29,#0xc0
00b6f888	mov w2,#0x10
00b6f88c	mov x1,x23
00b6f890	bl 0x00c300b0
00b6f894	cbnz w0,0x00b700d4
00b6f898	cbz w19,0x00b6f8a4
00b6f89c	mov x0,x22
00b6f8a0	bl 0x00c30760
00b6f8a4	add w25,w25,#0x1
00b6f8a8	cmp w25,#0x6
00b6f8ac	b.cc 0x00b6f7c0
00b6f8b0	cbz w19,0x00b6f8bc
00b6f8b4	mov w0,#0xa
00b6f8b8	bl 0x00c42240
00b6f8bc	adrp x20,0x2a1000
00b6f8c0	adrp x26,0x77d000
00b6f8c4	adrp x21,0x77c000
00b6f8c8	adrp x28,0x77c000
00b6f8cc	adrp x27,0x77d000
00b6f8d0	mov w25,wzr
00b6f8d4	add x20,x20,#0x1c2
00b6f8d8	add x26,x26,#0x150
00b6f8dc	add x21,x21,#0x884
00b6f8e0	add x28,x28,#0x87c
00b6f8e4	add x27,x27,#0x180
00b6f8e8	lsr w22,w25,#0x1
00b6f8ec	lsl w8,w22,#0x6
00b6f8f0	add w24,w8,#0x80
00b6f8f4	cbz w19,0x00b6f91c
00b6f8f8	adrp x8,0x2be000
00b6f8fc	adrp x9,0x2ca000
00b6f900	tst w25,#0x1
00b6f904	add x8,x8,#0xbd0
00b6f908	add x9,x9,#0x8db
00b6f90c	csel x2,x9,x8,eq
00b6f910	mov x0,x20
00b6f914	mov w1,w24
00b6f918	bl 0x00c41af0
00b6f91c	add x0,sp,#0x270
00b6f920	sub x1,x29,#0x80
00b6f924	mov w2,w24
00b6f928	stp xzr,xzr,[x29, #-0xd0]
00b6f92c	stp xzr,xzr,[x29, #-0xe0]
00b6f930	stp xzr,xzr,[x29, #-0xc0]
00b6f934	tbnz w25,#0x0,0x00b6f95c
00b6f938	bl 0x00c41930
00b6f93c	mov w23,w0
00b6f940	mov x8,x26
00b6f944	cmp w24,#0xc0
00b6f948	b.ne 0x00b6f970
00b6f94c	cmn w23,#0x72
00b6f950	b.ne 0x00b6f970
00b6f954	mov x0,x21
00b6f958	b 0x00b6fa24
00b6f95c	bl 0x00c41940
00b6f960	mov w23,w0
00b6f964	mov x8,x27
00b6f968	cmp w24,#0xc0
00b6f96c	b.eq 0x00b6f94c
00b6f970	cbnz w23,0x00b700d8
00b6f974	add x23,x8,w22, UXTW  #0x4
00b6f978	mov w22,#0x2710
00b6f97c	tbnz w25,#0x0,0x00b6f9b4
00b6f980	ldur q0,[x29, #-0xc0]
00b6f984	add x0,sp,#0x270
00b6f988	sub x1,x29,#0xc0
00b6f98c	sub x2,x29,#0xc0
00b6f990	str q0,[sp, #0x30]
00b6f994	bl 0x00c41990
00b6f998	ldp x8,x10,[x29, #-0xc0]
00b6f99c	ldp x9,x11,[x29, #-0xd0]
00b6f9a0	ldr q0,[sp, #0x30]
00b6f9a4	eor x8,x9,x8
00b6f9a8	eor x9,x11,x10
00b6f9ac	stp x8,x9,[x29, #-0xc0]
00b6f9b0	b 0x00b6f9fc
00b6f9b4	ldur q0,[x29, #-0xe0]
00b6f9b8	ldur q1,[x29, #-0xc0]
00b6f9bc	ldur x8,[x29, #-0xd0]
00b6f9c0	add x0,sp,#0x270
00b6f9c4	stur q0,[x29, #-0xc0]
00b6f9c8	ldur x9,[x29, #-0xc0]
00b6f9cc	sub x1,x29,#0xc0
00b6f9d0	sub x2,x29,#0xc0
00b6f9d4	str q0,[sp, #0x30]
00b6f9d8	eor x8,x8,x9
00b6f9dc	stur x8,[x29, #-0xc0]
00b6f9e0	ldur x8,[x29, #-0xb8]
00b6f9e4	ldur x9,[x29, #-0xc8]
00b6f9e8	stur q1,[x29, #-0xe0]
00b6f9ec	eor x8,x9,x8
00b6f9f0	stur x8,[x29, #-0xb8]
00b6f9f4	bl 0x00c419a0
00b6f9f8	ldur q0,[x29, #-0xc0]
00b6f9fc	subs w22,w22,#0x1
00b6fa00	stur q0,[x29, #-0xd0]
00b6fa04	b.ne 0x00b6f97c
00b6fa08	sub x0,x29,#0xc0
00b6fa0c	mov w2,#0x10
00b6fa10	mov x1,x23
00b6fa14	bl 0x00c300b0
00b6fa18	cbnz w0,0x00b700d4
00b6fa1c	cbz w19,0x00b6fa28
00b6fa20	mov x0,x28
00b6fa24	bl 0x00c30760
00b6fa28	add w25,w25,#0x1
00b6fa2c	cmp w25,#0x6
00b6fa30	b.cc 0x00b6f8e8
00b6fa34	cbz w19,0x00b6fa40
00b6fa38	mov w0,#0xa
00b6fa3c	bl 0x00c42240
00b6fa40	adrp x8,0x29d000
00b6fa44	add x8,x8,#0x1e0
00b6fa48	ldr q0,[x8]
00b6fa4c	adrp x20,0x2d6000
00b6fa50	adrp x24,0x77d000
00b6fa54	adrp x21,0x77d000
00b6fa58	mov w25,wzr
00b6fa5c	add x20,x20,#0xd1d
00b6fa60	add x24,x24,#0x2b0
00b6fa64	sub x22,x29,#0xd0
00b6fa68	sub x26,x29,#0xc0
00b6fa6c	add x21,x21,#0x270
00b6fa70	str q0,[sp, #0x10]
00b6fa74	lsr w27,w25,#0x1
00b6fa78	lsl w8,w27,#0x6
00b6fa7c	add w23,w8,#0x80
00b6fa80	cbz w19,0x00b6faa8
00b6fa84	adrp x8,0x2be000
00b6fa88	adrp x9,0x2ca000
00b6fa8c	tst w25,#0x1
00b6fa90	add x8,x8,#0xbd0
00b6fa94	add x9,x9,#0x8db
00b6fa98	csel x2,x9,x8,eq
00b6fa9c	mov x0,x20
00b6faa0	mov w1,w23
00b6faa4	bl 0x00c41af0
00b6faa8	ldr q0,[sp, #0x10]
00b6faac	mov w27,w27
00b6fab0	add x1,x24,x27, LSL #0x5
00b6fab4	lsr w2,w23,#0x3
00b6fab8	sub x0,x29,#0x80
00b6fabc	stur q0,[x29, #-0xd0]
00b6fac0	bl 0x00c2ffd0
00b6fac4	add x0,sp,#0x270
00b6fac8	sub x1,x29,#0x80
00b6facc	mov w2,w23
00b6fad0	bl 0x00c41940
00b6fad4	cmp w23,#0xc0
00b6fad8	mov w23,w0
00b6fadc	b.ne 0x00b6faf4
00b6fae0	cmn w23,#0x72
00b6fae4	b.ne 0x00b6faf4
00b6fae8	adrp x0,0x77c000
00b6faec	add x0,x0,#0x884
00b6faf0	b 0x00b6fbe0
00b6faf4	cbnz w23,0x00b700d8
00b6faf8	tbnz w25,#0x0,0x00b6fb64
00b6fafc	adrp x8,0x77d000
00b6fb00	add x8,x8,#0x1b0
00b6fb04	add x8,x8,x27, LSL #0x6
00b6fb08	ldp q1,q0,[x8, #0x20]
00b6fb0c	ldp q3,q2,[x8]
00b6fb10	mov x23,xzr
00b6fb14	mov x28,xzr
00b6fb18	stp q1,q0,[x29, #-0xa0]
00b6fb1c	stp q3,q2,[x29, #-0xc0]
00b6fb20	cbnz x28,0x00b6fb34
00b6fb24	add x0,sp,#0x270
00b6fb28	sub x1,x29,#0xd0
00b6fb2c	sub x2,x29,#0xd0
00b6fb30	bl 0x00c419a0
00b6fb34	ldrb w8,[x26, x23]
00b6fb38	ldrb w9,[x22, x28]
00b6fb3c	add w10,w28,#0x1
00b6fb40	strb w8,[x22, x28]
00b6fb44	eor w9,w9,w8
00b6fb48	strb w9,[x26, x23]
00b6fb4c	add x23,x23,#0x1
00b6fb50	cmp x23,#0x40
00b6fb54	and x28,x10,#0xf
00b6fb58	b.ne 0x00b6fb20
00b6fb5c	mov x1,x21
00b6fb60	b 0x00b6fbc4
00b6fb64	ldp q1,q0,[x21, #0x20]
00b6fb68	ldp q3,q2,[x21]
00b6fb6c	mov x23,xzr
00b6fb70	mov x28,xzr
00b6fb74	stp q1,q0,[x29, #-0xa0]
00b6fb78	stp q3,q2,[x29, #-0xc0]
00b6fb7c	cbnz x28,0x00b6fb90
00b6fb80	add x0,sp,#0x270
00b6fb84	sub x1,x29,#0xd0
00b6fb88	sub x2,x29,#0xd0
00b6fb8c	bl 0x00c419a0
00b6fb90	ldrb w8,[x22, x28]
00b6fb94	ldrb w9,[x26, x23]
00b6fb98	add w10,w28,#0x1
00b6fb9c	eor w8,w9,w8
00b6fba0	strb w8,[x26, x23]
00b6fba4	add x23,x23,#0x1
00b6fba8	strb w8,[x22, x28]
00b6fbac	cmp x23,#0x40
00b6fbb0	and x28,x10,#0xf
00b6fbb4	b.ne 0x00b6fb7c
00b6fbb8	adrp x8,0x77d000
00b6fbbc	add x8,x8,#0x1b0
00b6fbc0	add x1,x8,x27, LSL #0x6
00b6fbc4	sub x0,x29,#0xc0
00b6fbc8	mov w2,#0x40
00b6fbcc	bl 0x00c300b0
00b6fbd0	cbnz w0,0x00b700d4
00b6fbd4	cbz w19,0x00b6fbe4
00b6fbd8	adrp x0,0x77c000
00b6fbdc	add x0,x0,#0x87c
00b6fbe0	bl 0x00c30760
00b6fbe4	add w25,w25,#0x1
00b6fbe8	cmp w25,#0x6
00b6fbec	b.cc 0x00b6fa74
00b6fbf0	cbz w19,0x00b6fbfc
00b6fbf4	mov w0,#0xa
00b6fbf8	bl 0x00c42240
00b6fbfc	adrp x20,0x2d2000
00b6fc00	adrp x27,0x77d000
00b6fc04	mov w25,wzr
00b6fc08	add x20,x20,#0x927
00b6fc0c	add x27,x27,#0x3d0
00b6fc10	sub x22,x29,#0xd0
00b6fc14	sub x26,x29,#0xc0
00b6fc18	lsr w21,w25,#0x1
00b6fc1c	lsl w8,w21,#0x6
00b6fc20	add w23,w8,#0x80
00b6fc24	cbz w19,0x00b6fc4c
00b6fc28	adrp x8,0x2be000
00b6fc2c	adrp x9,0x2ca000
00b6fc30	tst w25,#0x1
00b6fc34	add x8,x8,#0xbd0
00b6fc38	add x9,x9,#0x8db
00b6fc3c	csel x2,x9,x8,eq
00b6fc40	mov x0,x20
00b6fc44	mov w1,w23
00b6fc48	bl 0x00c41af0
00b6fc4c	ldr q0,[sp, #0x10]
00b6fc50	mov w28,w21
00b6fc54	add x1,x24,x28, LSL #0x5
00b6fc58	lsr w2,w23,#0x3
00b6fc5c	sub x0,x29,#0x80
00b6fc60	stur q0,[x29, #-0xd0]
00b6fc64	bl 0x00c2ffd0
00b6fc68	add x0,sp,#0x270
00b6fc6c	sub x1,x29,#0x80
00b6fc70	mov w2,w23
00b6fc74	bl 0x00c41940
00b6fc78	cmp w23,#0xc0
00b6fc7c	mov w23,w0
00b6fc80	b.ne 0x00b6fc98
00b6fc84	cmn w23,#0x72
00b6fc88	b.ne 0x00b6fc98
00b6fc8c	adrp x0,0x77c000
00b6fc90	add x0,x0,#0x884
00b6fc94	b 0x00b6fd38
00b6fc98	cbnz w23,0x00b700d8
00b6fc9c	tbnz w25,#0x0,0x00b6fcbc
00b6fca0	adrp x8,0x77d000
00b6fca4	add x8,x8,#0x310
00b6fca8	add x8,x8,x28, LSL #0x6
00b6fcac	ldp q1,q0,[x8, #0x20]
00b6fcb0	ldp q3,q2,[x8]
00b6fcb4	mov x23,x27
00b6fcb8	b 0x00b6fcd0
00b6fcbc	ldp q1,q0,[x27, #0x20]
00b6fcc0	ldp q3,q2,[x27]
00b6fcc4	adrp x8,0x77d000
00b6fcc8	add x8,x8,#0x310
00b6fccc	add x23,x8,x28, LSL #0x6
00b6fcd0	stp q1,q0,[x29, #-0xa0]
00b6fcd4	stp q3,q2,[x29, #-0xc0]
00b6fcd8	mov x28,xzr
00b6fcdc	mov x21,xzr
00b6fce0	cbnz x21,0x00b6fcf4
00b6fce4	add x0,sp,#0x270
00b6fce8	sub x1,x29,#0xd0
00b6fcec	sub x2,x29,#0xd0
00b6fcf0	bl 0x00c419a0
00b6fcf4	ldrb w8,[x26, x28]
00b6fcf8	ldrb w9,[x22, x21]
00b6fcfc	add w10,w21,#0x1
00b6fd00	and x21,x10,#0xf
00b6fd04	eor w8,w9,w8
00b6fd08	strb w8,[x26, x28]
00b6fd0c	add x28,x28,#0x1
00b6fd10	cmp x28,#0x40
00b6fd14	b.ne 0x00b6fce0
00b6fd18	sub x0,x29,#0xc0
00b6fd1c	mov w2,#0x40
00b6fd20	mov x1,x23
00b6fd24	bl 0x00c300b0
00b6fd28	cbnz w0,0x00b700d4
00b6fd2c	cbz w19,0x00b6fd3c
00b6fd30	adrp x0,0x77c000
00b6fd34	add x0,x0,#0x87c
00b6fd38	bl 0x00c30760
00b6fd3c	add w25,w25,#0x1
00b6fd40	cmp w25,#0x6
00b6fd44	b.cc 0x00b6fc18
00b6fd48	cbz w19,0x00b6fd54
00b6fd4c	mov w0,#0xa
00b6fd50	bl 0x00c42240
00b6fd54	adrp x28,0x2ca000
00b6fd58	mov w24,wzr
00b6fd5c	add x28,x28,#0x8df
00b6fd60	sub x20,x29,#0xc0
00b6fd64	sub x25,x29,#0xf0
00b6fd68	add x26,sp,#0x20
00b6fd6c	mov w21,#0x10
00b6fd70	lsr w22,w24,#0x1
00b6fd74	cbz w19,0x00b6fd98
00b6fd78	adrp x8,0x2be000
00b6fd7c	adrp x9,0x2ca000
00b6fd80	tst w24,#0x1
00b6fd84	add x8,x8,#0xbd0
00b6fd88	add x9,x9,#0x8db
00b6fd8c	csel x1,x9,x8,eq
00b6fd90	mov x0,x28
00b6fd94	bl 0x00c41af0
00b6fd98	mov w27,w22
00b6fd9c	adrp x9,0x77d000
00b6fda0	lsl x8,x27,#0x4
00b6fda4	add x9,x9,#0x410
00b6fda8	ldr q0,[x9,x8]
00b6fdac	adrp x9,0x77d000
00b6fdb0	add x9,x9,#0x440
00b6fdb4	ldr q1,[x9,x8]
00b6fdb8	add x0,sp,#0x270
00b6fdbc	sub x1,x29,#0x80
00b6fdc0	mov w2,#0x80
00b6fdc4	stur q0,[x29, #-0xf0]
00b6fdc8	stur q1,[x29, #-0x80]
00b6fdcc	bl 0x00c41940
00b6fdd0	mov w23,w0
00b6fdd4	cbnz w0,0x00b700d8
00b6fdd8	adrp x8,0x77d000
00b6fddc	add x8,x8,#0x470
00b6fde0	ldrsw x22,[x8, x27, LSL #0x2]
00b6fde4	orr w8,wzr,#0x30
00b6fde8	tbnz w24,#0x0,0x00b6fe10
00b6fdec	adrp x9,0x77d000
00b6fdf0	add x9,x9,#0x47c
00b6fdf4	madd x1,x27,x8,x9
00b6fdf8	sub x0,x29,#0xc0
00b6fdfc	mov x2,x22
00b6fe00	bl 0x00c2ffd0
00b6fe04	adrp x8,0x77d000
00b6fe08	add x8,x8,#0x50c
00b6fe0c	b 0x00b6fe30
00b6fe10	adrp x9,0x77d000
00b6fe14	add x9,x9,#0x50c
00b6fe18	madd x1,x27,x8,x9
00b6fe1c	sub x0,x29,#0xc0
00b6fe20	mov x2,x22
00b6fe24	bl 0x00c2ffd0
00b6fe28	adrp x8,0x77d000
00b6fe2c	add x8,x8,#0x47c
00b6fe30	mov x23,xzr
00b6fe34	str x8,[sp, #0x10]
00b6fe38	add x0,sp,#0x270
00b6fe3c	sub x1,x29,#0xf0
00b6fe40	add x2,sp,#0x20
00b6fe44	bl 0x00c419a0
00b6fe48	orr w8,wzr,#0xc
00b6fe4c	ldr w9,[x25, x8#0x0]
00b6fe50	rev w9,w9
00b6fe54	add w9,w9,#0x1
00b6fe58	rev w10,w9
00b6fe5c	str w10,[x25, x8#0x0]
00b6fe60	cbz x8,0x00b6fe6c
00b6fe64	sub x8,x8,#0x4
00b6fe68	cbz w9,0x00b6fe4c
00b6fe6c	sub x8,x22,x23
00b6fe70	cmp x8,#0x10
00b6fe74	csel x8,x8,x21,cc
00b6fe78	b.cs 0x00b6fee0
00b6fe7c	cbz x8,0x00b6fef0
00b6fe80	cmp x8,#0x20
00b6fe84	b.cc 0x00b6feb8
00b6fe88	mov x9,xzr
00b6fe8c	add x10,x20,x23
00b6fe90	add x11,x10,x9
00b6fe94	add x12,x26,x9
00b6fe98	ldp q0,q1,[x11]
00b6fe9c	ldp q2,q3,[x12]
00b6fea0	adds x9,x9,#0x20
00b6fea4	eor v0.16B,v2.16B,v0.16B
00b6fea8	eor v1.16B,v3.16B,v1.16B
00b6feac	stp q0,q1,[x11]
00b6feb0	b.ne 0x00b6fe90
00b6feb4	cbz x8,0x00b6fef0
00b6feb8	add x9,x20,x23
00b6febc	add x10,sp,#0x20
00b6fec0	mov x11,x8
00b6fec4	ldrb w12,[x9]
00b6fec8	ldrb w13,[x10], #0x1
00b6fecc	subs x11,x11,#0x1
00b6fed0	eor w12,w13,w12
00b6fed4	strb w12,[x9], #0x1
00b6fed8	b.ne 0x00b6fec4
00b6fedc	b 0x00b6fef0
00b6fee0	ldr q0,[x20,x23]
00b6fee4	ldr q1,[sp, #0x20]
00b6fee8	eor v0.16B,v1.16B,v0.16B
00b6feec	str q0,[x20,x23]
00b6fef0	add x23,x8,x23
00b6fef4	cmp x23,x22
00b6fef8	b.cc 0x00b6fe38
00b6fefc	ldr x9,[sp, #0x10]
00b6ff00	orr w8,wzr,#0x30
00b6ff04	sub x0,x29,#0xc0
00b6ff08	mov x2,x22
00b6ff0c	madd x1,x27,x8,x9
00b6ff10	bl 0x00c300b0
00b6ff14	cbnz w0,0x00b700d4
00b6ff18	cbz w19,0x00b6ff28
00b6ff1c	adrp x0,0x77c000
00b6ff20	add x0,x0,#0x87c
00b6ff24	bl 0x00c30760
00b6ff28	add w24,w24,#0x1
00b6ff2c	cmp w24,#0x6
00b6ff30	b.cc 0x00b6fd70
00b6ff34	cbz w19,0x00b6ff40
00b6ff38	mov w0,#0xa
00b6ff3c	bl 0x00c42240
00b6ff40	cmp w19,#0x0
00b6ff44	add x0,sp,#0x30
00b6ff48	mov w2,#0x240
00b6ff4c	mov w1,wzr
00b6ff50	cset w26,eq
00b6ff54	add x20,sp,#0x30
00b6ff58	bl 0x00c301c0
00b6ff5c	sub x8,x29,#0x80
00b6ff60	mov w27,wzr
00b6ff64	add x20,x20,#0x120
00b6ff68	add x22,x8,#0x10
00b6ff6c	lsr w24,w27,#0x1
00b6ff70	and w25,w27,#0x1
00b6ff74	cbz w19,0x00b6ff9c
00b6ff78	adrp x8,0x2be000
00b6ff7c	adrp x9,0x2ca000
00b6ff80	cmp w25,#0x0
00b6ff84	add x8,x8,#0xbd0
00b6ff88	add x9,x9,#0x8db
00b6ff8c	adrp x0,0x2d0000
00b6ff90	csel x1,x9,x8,eq
00b6ff94	add x0,x0,#0x989
00b6ff98	bl 0x00c41af0
00b6ff9c	adrp x8,0x77d000
00b6ffa0	mov w21,w24
00b6ffa4	add x8,x8,#0x59c
00b6ffa8	add x8,x8,x21, LSL #0x5
00b6ffac	ldp q1,q0,[x8]
00b6ffb0	mov w2,#0x80
00b6ffb4	mov x0,x20
00b6ffb8	mov x1,x22
00b6ffbc	stp q1,q0,[x29, #-0x80]
00b6ffc0	bl 0x00c41940
00b6ffc4	mov w23,w0
00b6ffc8	cbnz w25,0x00b70004
00b6ffcc	cbnz w23,0x00b700d8
00b6ffd0	add x0,sp,#0x30
00b6ffd4	sub x1,x29,#0x80
00b6ffd8	mov w2,#0x80
00b6ffdc	bl 0x00c41930
00b6ffe0	mov w23,w0
00b6ffe4	cbnz w0,0x00b700d8
00b6ffe8	adrp x8,0x77d000
00b6ffec	add x8,x8,#0x62c
00b6fff0	add x8,x8,x21, LSL #0x5
00b6fff4	ldp q1,q0,[x8]
00b6fff8	adrp x28,0x77d000
00b6fffc	add x28,x28,#0x68c
00b70000	b 0x00b70038
00b70004	cbnz w23,0x00b700d8
00b70008	add x0,sp,#0x30
00b7000c	sub x1,x29,#0x80
00b70010	mov w2,#0x80
00b70014	bl 0x00c41940
00b70018	mov w23,w0
00b7001c	cbnz w0,0x00b700d8
00b70020	adrp x8,0x77d000
00b70024	add x8,x8,#0x68c
00b70028	add x8,x8,x21, LSL #0x5
00b7002c	ldp q1,q0,[x8]
00b70030	adrp x28,0x77d000
00b70034	add x28,x28,#0x62c
00b70038	stp q1,q0,[x29, #-0xc0]
00b7003c	adrp x8,0x77d000
00b70040	add x8,x8,#0x5fc
00b70044	add x3,x8,w24, UXTW  #0x4
00b70048	add x0,sp,#0x30
00b7004c	mov w2,#0x20
00b70050	sub x4,x29,#0xc0
00b70054	sub x5,x29,#0xc0
00b70058	mov w1,w25
00b7005c	bl 0x00c41900
00b70060	mov w23,w0
00b70064	cbnz w0,0x00b700d8
00b70068	add x1,x28,x21, LSL #0x5
00b7006c	sub x0,x29,#0xc0
00b70070	mov w2,#0x20
00b70074	bl 0x00c300b0
00b70078	cmp w0,#0x0
00b7007c	cset w8,ne
00b70080	orr w8,w8,w26
00b70084	tbz w8,#0x0,0x00b70090
00b70088	cbz w0,0x00b7009c
00b7008c	b 0x00b700d4
00b70090	adrp x0,0x77c000
00b70094	add x0,x0,#0x87c
00b70098	bl 0x00c30760
00b7009c	add w27,w27,#0x1
00b700a0	cmp w27,#0x6
00b700a4	b.cc 0x00b6ff6c
00b700a8	cbz w19,0x00b700b4
00b700ac	mov w0,#0xa
00b700b0	bl 0x00c42240
00b700b4	add x0,sp,#0x30
00b700b8	mov w1,#0x120
00b700bc	bl 0x00c42220
00b700c0	mov w1,#0x120
00b700c4	mov x0,x20
00b700c8	bl 0x00c42220
00b700cc	mov w23,wzr
00b700d0	b 0x00b700ec
00b700d4	mov w23,#0x1
00b700d8	cbz w19,0x00b700ec
00b700dc	cbz w23,0x00b700ec
00b700e0	adrp x0,0x77c000
00b700e4	add x0,x0,#0x854
00b700e8	bl 0x00c30760
00b700ec	ldr x19,[sp, #0x8]
00b700f0	add x0,sp,#0x270
00b700f4	mov w1,#0x120
00b700f8	bl 0x00c42220
00b700fc	ldr x8,[x19, #0x28]
00b70100	ldur x9,[x29, #-0x60]
00b70104	cmp x8,x9
00b70108	b.ne 0x00b70130
00b7010c	mov w0,w23
00b70110	add sp,sp,#0x430
00b70114	ldp x29,x30,[sp, #0x50]
00b70118	ldp x20,x19,[sp, #0x40]
00b7011c	ldp x22,x21,[sp, #0x30]
00b70120	ldp x24,x23,[sp, #0x20]
00b70124	ldp x26,x25,[sp, #0x10]
00b70128	ldp x28,x27,[sp], #0x60
00b7012c	ret
00b70130	bl 0x00c2fec0

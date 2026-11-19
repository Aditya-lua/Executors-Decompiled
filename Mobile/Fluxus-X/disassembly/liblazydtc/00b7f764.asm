; mbedtls_mpi_div_mpi @ 00b7f764
00b7f764	sub sp,sp,#0x100
00b7f768	stp x28,x27,[sp, #0xa0]
00b7f76c	stp x26,x25,[sp, #0xb0]
00b7f770	stp x24,x23,[sp, #0xc0]
00b7f774	stp x22,x21,[sp, #0xd0]
00b7f778	stp x20,x19,[sp, #0xe0]
00b7f77c	stp x29,x30,[sp, #0xf0]
00b7f780	add x29,sp,#0xf0
00b7f784	mrs x28,tpidr_el0
00b7f788	ldr x8,[x28, #0x28]
00b7f78c	mov x22,x3
00b7f790	mov x20,x2
00b7f794	mov x19,x1
00b7f798	stur x8,[x29, #-0x60]
00b7f79c	ldrh w8,[x3, #0xa]
00b7f7a0	mov x21,x0
00b7f7a4	sub x8,x8,#0x1
00b7f7a8	mov x9,x8
00b7f7ac	cmn x9,#0x1
00b7f7b0	b.eq 0x00b7f820
00b7f7b4	ldr x10,[x22]
00b7f7b8	ldr x10,[x10, x9, LSL #0x3]
00b7f7bc	sub x9,x9,#0x1
00b7f7c0	cbz x10,0x00b7f7ac
00b7f7c4	ldrh w9,[x22, #0x8]
00b7f7c8	cbz w9,0x00b7f820
00b7f7cc	mov w9,#0x1
00b7f7d0	str w9,[sp, #0x70]
00b7f7d4	str xzr,[sp, #0x68]
00b7f7d8	str w9,[sp, #0x60]
00b7f7dc	str xzr,[sp, #0x58]
00b7f7e0	str w9,[sp, #0x50]
00b7f7e4	str xzr,[sp, #0x48]
00b7f7e8	str w9,[sp, #0x40]
00b7f7ec	str xzr,[sp, #0x38]
00b7f7f0	ldrh w9,[x20, #0xa]
00b7f7f4	sub x9,x9,#0x1
00b7f7f8	cmn x9,#0x1
00b7f7fc	b.eq 0x00b7f828
00b7f800	ldr x10,[x20]
00b7f804	ldr x10,[x10, x9, LSL #0x3]
00b7f808	sub x9,x9,#0x1
00b7f80c	cbz x10,0x00b7f7f8
00b7f810	add x9,x9,#0x2
00b7f814	cmn x8,#0x1
00b7f818	b.ne 0x00b7f834
00b7f81c	b 0x00b7f8a4
00b7f820	mov w26,#0xfffffff4
00b7f824	b 0x00b7fdd0
00b7f828	mov x9,xzr
00b7f82c	cmn x8,#0x1
00b7f830	b.eq 0x00b7f8a4
00b7f834	ldr x10,[x22]
00b7f838	ldr x10,[x10, x8, LSL #0x3]
00b7f83c	sub x8,x8,#0x1
00b7f840	cbz x10,0x00b7f82c
00b7f844	add x8,x8,#0x2
00b7f848	cmp x9,x8
00b7f84c	b.hi 0x00b7f8b0
00b7f850	cmp x8,x9
00b7f854	b.hi 0x00b7f88c
00b7f858	sub x8,x9,#0x1
00b7f85c	cmn x8,#0x1
00b7f860	b.eq 0x00b7f8b0
00b7f864	ldr x9,[x20]
00b7f868	ldr x10,[x22]
00b7f86c	lsl x11,x8,#0x3
00b7f870	ldr x9,[x9, x11#0x0]
00b7f874	ldr x10,[x10, x11#0x0]
00b7f878	cmp x9,x10
00b7f87c	b.hi 0x00b7f8b0
00b7f880	cmp x9,x10
00b7f884	sub x8,x8,#0x1
00b7f888	b.cs 0x00b7f85c
00b7f88c	cbz x21,0x00b7fd34
00b7f890	ldrh w24,[x21, #0xa]
00b7f894	cbz x24,0x00b7fccc
00b7f898	ldr x22,[x21]
00b7f89c	lsl x2,x24,#0x3
00b7f8a0	b 0x00b7fd18
00b7f8a4	mov x8,xzr
00b7f8a8	cmp x9,x8
00b7f8ac	b.ls 0x00b7f850
00b7f8b0	add x0,sp,#0x68
00b7f8b4	mov x1,x20
00b7f8b8	bl 0x00c41b60
00b7f8bc	mov w26,w0
00b7f8c0	cbnz w0,0x00b7fd4c
00b7f8c4	add x0,sp,#0x58
00b7f8c8	mov x1,x22
00b7f8cc	bl 0x00c41b60
00b7f8d0	mov w26,w0
00b7f8d4	cbnz w0,0x00b7fd4c
00b7f8d8	mov w8,#0x1
00b7f8dc	strh w8,[sp, #0x60]
00b7f8e0	strh w8,[sp, #0x70]
00b7f8e4	ldrh w25,[x20, #0xa]
00b7f8e8	mov w8,#0x2710
00b7f8ec	add x23,x25,#0x2
00b7f8f0	cmp x23,x8
00b7f8f4	b.hi 0x00b80304
00b7f8f8	mov w1,#0x8
00b7f8fc	mov x0,x23
00b7f900	bl 0x00c30a30
00b7f904	mov x24,x0
00b7f908	cbz x0,0x00b80304
00b7f90c	add w8,w25,#0x2
00b7f910	and x8,x8,#0xffff
00b7f914	lsl x2,x8,#0x3
00b7f918	mov x0,x24
00b7f91c	mov w1,wzr
00b7f920	strh w23,[sp, #0x52]
00b7f924	str x24,[sp, #0x48]
00b7f928	bl 0x00c301c0
00b7f92c	mov w8,#0x1
00b7f930	str xzr,[x24]
00b7f934	strh w8,[sp, #0x50]
00b7f938	ldrh w8,[x20, #0xa]
00b7f93c	add x23,x8,#0x2
00b7f940	mov w8,#0x2710
00b7f944	cmp x23,x8
00b7f948	b.hi 0x00b80304
00b7f94c	ldrh w26,[sp, #0x42]
00b7f950	cmp x23,x26
00b7f954	b.ls 0x00b7f99c
00b7f958	mov w1,#0x8
00b7f95c	mov x0,x23
00b7f960	bl 0x00c30a30
00b7f964	mov x24,x0
00b7f968	cbz x0,0x00b80304
00b7f96c	ldr x25,[sp, #0x38]
00b7f970	cbz x25,0x00b7f994
00b7f974	lsl x26,x26,#0x3
00b7f978	mov x0,x24
00b7f97c	mov x1,x25
00b7f980	mov x2,x26
00b7f984	bl 0x00c2ffd0
00b7f988	mov x0,x25
00b7f98c	mov x1,x26
00b7f990	bl 0x00c42230
00b7f994	strh w23,[sp, #0x42]
00b7f998	str x24,[sp, #0x38]
00b7f99c	ldr x0,[sp, #0x58]
00b7f9a0	ldrh w1,[sp, #0x62]
00b7f9a4	bl 0x00c41dc0
00b7f9a8	and x8,x0,#0x3f
00b7f9ac	cmp x8,#0x3f
00b7f9b0	mov x23,xzr
00b7f9b4	b.eq 0x00b7faec
00b7f9b8	ldr x0,[sp, #0x68]
00b7f9bc	ldrh w1,[sp, #0x72]
00b7f9c0	eor x23,x8,#0x3f
00b7f9c4	bl 0x00c41dc0
00b7f9c8	ldrh w24,[sp, #0x72]
00b7f9cc	add x8,x0,x23
00b7f9d0	lsl x9,x24,#0x6
00b7f9d4	cmp x9,x8
00b7f9d8	b.cs 0x00b7fa44
00b7f9dc	lsr x9,x8,#0x6
00b7f9e0	tst x8,#0x3f
00b7f9e4	cinc x25,x9,ne
00b7f9e8	mov w8,#0x2710
00b7f9ec	cmp x25,x8
00b7f9f0	b.hi 0x00b80304
00b7f9f4	cmp x25,x24
00b7f9f8	b.ls 0x00b7fa44
00b7f9fc	mov w1,#0x8
00b7fa00	mov x0,x25
00b7fa04	bl 0x00c30a30
00b7fa08	mov x26,x0
00b7fa0c	cbz x0,0x00b80304
00b7fa10	ldr x27,[sp, #0x68]
00b7fa14	cbz x27,0x00b7fa38
00b7fa18	lsl x24,x24,#0x3
00b7fa1c	mov x0,x26
00b7fa20	mov x1,x27
00b7fa24	mov x2,x24
00b7fa28	bl 0x00c2ffd0
00b7fa2c	mov x0,x27
00b7fa30	mov x1,x24
00b7fa34	bl 0x00c42230
00b7fa38	and x24,x25,#0xffff
00b7fa3c	strh w25,[sp, #0x72]
00b7fa40	str x26,[sp, #0x68]
00b7fa44	ldr x0,[sp, #0x68]
00b7fa48	mov x1,x24
00b7fa4c	mov x2,x23
00b7fa50	bl 0x00c41ee0
00b7fa54	ldr x0,[sp, #0x58]
00b7fa58	ldrh w1,[sp, #0x62]
00b7fa5c	bl 0x00c41dc0
00b7fa60	ldrh w24,[sp, #0x62]
00b7fa64	add x8,x0,x23
00b7fa68	lsl x9,x24,#0x6
00b7fa6c	cmp x9,x8
00b7fa70	b.cs 0x00b7fadc
00b7fa74	lsr x9,x8,#0x6
00b7fa78	tst x8,#0x3f
00b7fa7c	cinc x25,x9,ne
00b7fa80	mov w8,#0x2710
00b7fa84	cmp x25,x8
00b7fa88	b.hi 0x00b80304
00b7fa8c	cmp x25,x24
00b7fa90	b.ls 0x00b7fadc
00b7fa94	mov w1,#0x8
00b7fa98	mov x0,x25
00b7fa9c	bl 0x00c30a30
00b7faa0	mov x26,x0
00b7faa4	cbz x0,0x00b80304
00b7faa8	ldr x27,[sp, #0x58]
00b7faac	cbz x27,0x00b7fad0
00b7fab0	lsl x24,x24,#0x3
00b7fab4	mov x0,x26
00b7fab8	mov x1,x27
00b7fabc	mov x2,x24
00b7fac0	bl 0x00c2ffd0
00b7fac4	mov x0,x27
00b7fac8	mov x1,x24
00b7facc	bl 0x00c42230
00b7fad0	and x24,x25,#0xffff
00b7fad4	strh w25,[sp, #0x62]
00b7fad8	str x26,[sp, #0x58]
00b7fadc	ldr x0,[sp, #0x58]
00b7fae0	mov x1,x24
00b7fae4	mov x2,x23
00b7fae8	bl 0x00c41ee0
00b7faec	ldrh w8,[sp, #0x72]
00b7faf0	ldrh w24,[sp, #0x62]
00b7faf4	ldr x0,[sp, #0x58]
00b7faf8	str x23,[sp, #0x10]
00b7fafc	sub x9,x8,#0x1
00b7fb00	sub x8,x24,#0x1
00b7fb04	sub x23,x9,x8
00b7fb08	mov x1,x24
00b7fb0c	stp x9,x8,[sp, #0x28]
00b7fb10	lsl x25,x23,#0x6
00b7fb14	bl 0x00c41dc0
00b7fb18	ldrh w26,[sp, #0x62]
00b7fb1c	add x8,x25,x0
00b7fb20	lsl x9,x26,#0x6
00b7fb24	cmp x9,x8
00b7fb28	b.cs 0x00b7fb94
00b7fb2c	lsr x9,x8,#0x6
00b7fb30	tst x8,#0x3f
00b7fb34	cinc x27,x9,ne
00b7fb38	mov w8,#0x2710
00b7fb3c	cmp x27,x8
00b7fb40	b.hi 0x00b80304
00b7fb44	cmp x27,x26
00b7fb48	b.ls 0x00b7fb94
00b7fb4c	mov w1,#0x8
00b7fb50	mov x0,x27
00b7fb54	bl 0x00c30a30
00b7fb58	cbz x0,0x00b80304
00b7fb5c	ldr x8,[sp, #0x58]
00b7fb60	cbz x8,0x00b7fb88
00b7fb64	lsl x2,x26,#0x3
00b7fb68	mov x1,x8
00b7fb6c	stp x2,x0,[sp, #0x18]
00b7fb70	mov x26,x8
00b7fb74	bl 0x00c2ffd0
00b7fb78	ldr x1,[sp, #0x18]
00b7fb7c	mov x0,x26
00b7fb80	bl 0x00c42230
00b7fb84	ldr x0,[sp, #0x20]
00b7fb88	and x26,x27,#0xffff
00b7fb8c	strh w27,[sp, #0x62]
00b7fb90	str x0,[sp, #0x58]
00b7fb94	ldr x0,[sp, #0x58]
00b7fb98	mov w8,#0x1
00b7fb9c	sub x8,x8,x24
00b7fba0	mov x1,x26
00b7fba4	mov x2,x25
00b7fba8	str x8,[sp, #0x18]
00b7fbac	bl 0x00c41ee0
00b7fbb0	lsl x23,x23,#0x3
00b7fbb4	ldrh w9,[sp, #0x72]
00b7fbb8	ldr x8,[sp, #0x68]
00b7fbbc	sub x9,x9,#0x1
00b7fbc0	cmn x9,#0x1
00b7fbc4	b.eq 0x00b7fbdc
00b7fbc8	ldr x10,[x8, x9, LSL #0x3]
00b7fbcc	sub x9,x9,#0x1
00b7fbd0	cbz x10,0x00b7fbc0
00b7fbd4	add x9,x9,#0x2
00b7fbd8	b 0x00b7fbe0
00b7fbdc	mov x9,xzr
00b7fbe0	ldrh w1,[sp, #0x62]
00b7fbe4	ldr x0,[sp, #0x58]
00b7fbe8	sub x10,x1,#0x1
00b7fbec	cmn x10,#0x1
00b7fbf0	b.eq 0x00b7fc10
00b7fbf4	ldr x11,[x0, x10, LSL #0x3]
00b7fbf8	sub x10,x10,#0x1
00b7fbfc	cbz x11,0x00b7fbec
00b7fc00	add x10,x10,#0x2
00b7fc04	orr x11,x10,x9
00b7fc08	cbnz x11,0x00b7fc1c
00b7fc0c	b 0x00b7fc9c
00b7fc10	mov x10,xzr
00b7fc14	orr x11,x10,x9
00b7fc18	cbz x11,0x00b7fc9c
00b7fc1c	cmp x9,x10
00b7fc20	b.ls 0x00b7fc30
00b7fc24	ldrsh w10,[sp, #0x70]
00b7fc28	tbz w10,#0x1f,0x00b7fc9c
00b7fc2c	b 0x00b7fe0c
00b7fc30	cmp x10,x9
00b7fc34	b.ls 0x00b7fc48
00b7fc38	ldrsh w8,[sp, #0x60]
00b7fc3c	neg w10,w8
00b7fc40	tbz w10,#0x1f,0x00b7fc9c
00b7fc44	b 0x00b7fe0c
00b7fc48	ldrsh w10,[sp, #0x70]
00b7fc4c	ldrsh w11,[sp, #0x60]
00b7fc50	cmp w10,#0x1
00b7fc54	b.lt 0x00b7fc60
00b7fc58	tbz w11,#0x1f,0x00b7fc6c
00b7fc5c	b 0x00b7fc9c
00b7fc60	cbz w10,0x00b7fc6c
00b7fc64	cmp w11,#0x0
00b7fc68	b.gt 0x00b7fe0c
00b7fc6c	cbz x9,0x00b7fc9c
00b7fc70	lsl x11,x9,#0x3
00b7fc74	add x12,x8,x11
00b7fc78	add x11,x0,x11
00b7fc7c	ldur x12,[x12, #-0x8]
00b7fc80	ldur x11,[x11, #-0x8]
00b7fc84	sub x9,x9,#0x1
00b7fc88	cmp x12,x11
00b7fc8c	b.hi 0x00b7fc98
00b7fc90	b.cs 0x00b7fc6c
00b7fc94	neg w10,w10
00b7fc98	tbnz w10,#0x1f,0x00b7fe0c
00b7fc9c	ldr x8,[sp, #0x48]
00b7fca0	add x0,sp,#0x68
00b7fca4	add x1,sp,#0x68
00b7fca8	add x2,sp,#0x58
00b7fcac	ldr x9,[x8, x23#0x0]
00b7fcb0	mov w3,#0xffffffff
00b7fcb4	add x9,x9,#0x1
00b7fcb8	str x9,[x8, x23#0x0]
00b7fcbc	bl 0x00b7f304
00b7fcc0	mov w26,w0
00b7fcc4	cbz w0,0x00b7fbb4
00b7fcc8	b 0x00b7fd4c
00b7fccc	mov w0,#0x1
00b7fcd0	mov w1,#0x8
00b7fcd4	bl 0x00c30a30
00b7fcd8	mov x22,x0
00b7fcdc	cbz x0,0x00b80304
00b7fce0	ldr x23,[x21]
00b7fce4	cbz x23,0x00b7fd08
00b7fce8	lsl x24,x24,#0x3
00b7fcec	mov x0,x22
00b7fcf0	mov x1,x23
00b7fcf4	mov x2,x24
00b7fcf8	bl 0x00c2ffd0
00b7fcfc	mov x0,x23
00b7fd00	mov x1,x24
00b7fd04	bl 0x00c42230
00b7fd08	mov w8,#0x1
00b7fd0c	mov w2,#0x8
00b7fd10	str x22,[x21]
00b7fd14	strh w8,[x21, #0xa]
00b7fd18	mov x0,x22
00b7fd1c	mov w1,wzr
00b7fd20	bl 0x00c301c0
00b7fd24	ldr x8,[x21]
00b7fd28	mov w9,#0x1
00b7fd2c	str xzr,[x8]
00b7fd30	strh w9,[x21, #0x8]
00b7fd34	cbz x19,0x00b7fe04
00b7fd38	mov x0,x19
00b7fd3c	mov x1,x20
00b7fd40	bl 0x00c41b60
00b7fd44	mov w26,w0
00b7fd48	cbz w0,0x00b7fdd0
00b7fd4c	ldr x0,[sp, #0x68]
00b7fd50	cbz x0,0x00b7fd60
00b7fd54	ldrh w8,[sp, #0x72]
00b7fd58	lsl x1,x8,#0x3
00b7fd5c	bl 0x00c42230
00b7fd60	ldr x0,[sp, #0x58]
00b7fd64	mov w19,#0x1
00b7fd68	str w19,[sp, #0x70]
00b7fd6c	str xzr,[sp, #0x68]
00b7fd70	cbz x0,0x00b7fd80
00b7fd74	ldrh w8,[sp, #0x62]
00b7fd78	lsl x1,x8,#0x3
00b7fd7c	bl 0x00c42230
00b7fd80	ldr x0,[sp, #0x48]
00b7fd84	str w19,[sp, #0x60]
00b7fd88	str xzr,[sp, #0x58]
00b7fd8c	cbz x0,0x00b7fd9c
00b7fd90	ldrh w8,[sp, #0x52]
00b7fd94	lsl x1,x8,#0x3
00b7fd98	bl 0x00c42230
00b7fd9c	ldr x0,[sp, #0x38]
00b7fda0	mov w19,#0x1
00b7fda4	str w19,[sp, #0x50]
00b7fda8	str xzr,[sp, #0x48]
00b7fdac	cbz x0,0x00b7fdbc
00b7fdb0	ldrh w8,[sp, #0x42]
00b7fdb4	lsl x1,x8,#0x3
00b7fdb8	bl 0x00c42230
00b7fdbc	add x0,sp,#0x78
00b7fdc0	orr w1,wzr,#0x18
00b7fdc4	str w19,[sp, #0x40]
00b7fdc8	str xzr,[sp, #0x38]
00b7fdcc	bl 0x00c42220
00b7fdd0	ldr x8,[x28, #0x28]
00b7fdd4	ldur x9,[x29, #-0x60]
00b7fdd8	cmp x8,x9
00b7fddc	b.ne 0x00b80340
00b7fde0	mov w0,w26
00b7fde4	ldp x29,x30,[sp, #0xf0]
00b7fde8	ldp x20,x19,[sp, #0xe0]
00b7fdec	ldp x22,x21,[sp, #0xd0]
00b7fdf0	ldp x24,x23,[sp, #0xc0]
00b7fdf4	ldp x26,x25,[sp, #0xb0]
00b7fdf8	ldp x28,x27,[sp, #0xa0]
00b7fdfc	add sp,sp,#0x100
00b7fe00	ret
00b7fe04	mov w26,wzr
00b7fe08	b 0x00b7fdd0
00b7fe0c	cbz w1,0x00b7fe18
00b7fe10	mov x2,x25
00b7fe14	bl 0x00c41ef0
00b7fe18	ldp x9,x11,[sp, #0x28]
00b7fe1c	cmp x9,x11
00b7fe20	b.ls 0x00b80278
00b7fe24	sub x8,x24,#0x2
00b7fe28	add x27,sp,#0x78
00b7fe2c	str x8,[sp, #0x20]
00b7fe30	ldr x23,[sp, #0x68]
00b7fe34	ldr x8,[sp, #0x58]
00b7fe38	mov x24,x9
00b7fe3c	ldr x1,[x23, x9, LSL #0x3]
00b7fe40	ldr x2,[x8, x11, LSL #0x3]
00b7fe44	cmp x1,x2
00b7fe48	b.cs 0x00b7fe7c
00b7fe4c	sub x25,x24,#0x1
00b7fe50	ldr x0,[x23, x25, LSL #0x3]
00b7fe54	mov x3,xzr
00b7fe58	bl 0x00c2b374
00b7fe5c	cmn x0,#0x1
00b7fe60	cset w8,ne
00b7fe64	cmp x1,#0x0
00b7fe68	ldr x9,[sp, #0x48]
00b7fe6c	csel w8,w8,wzr,eq
00b7fe70	cmp w8,#0x0
00b7fe74	csinv x8,x0,xzr,ne
00b7fe78	b 0x00b7fe88
00b7fe7c	ldr x9,[sp, #0x48]
00b7fe80	sub x25,x24,#0x1
00b7fe84	mov x8,#-0x1
00b7fe88	ldr x11,[sp, #0x18]
00b7fe8c	mov x10,xzr
00b7fe90	cmp x24,#0x2
00b7fe94	add x11,x25,x11
00b7fe98	str x8,[x9, x11, LSL #0x3]
00b7fe9c	b.cc 0x00b7fea8
00b7fea0	add x8,x23,x24, LSL #0x3
00b7fea4	ldur x10,[x8, #-0x10]
00b7fea8	str x10,[sp, #0x78]
00b7feac	sub x8,x24,#0x1
00b7feb0	str x8,[sp, #0x28]
00b7feb4	ldr x8,[x23, x8, LSL #0x3]
00b7feb8	ldr x25,[sp, #0x30]
00b7febc	str x8,[sp, #0x80]
00b7fec0	ldr x8,[x23, x24, LSL #0x3]
00b7fec4	sub x10,x24,x25
00b7fec8	sub x23,x10,#0x1
00b7fecc	lsl x11,x23,#0x3
00b7fed0	str x8,[sp, #0x88]
00b7fed4	ldr x8,[x9, x11#0x0]
00b7fed8	str x11,[sp, #0x8]
00b7fedc	add x10,x8,#0x1
00b7fee0	str x10,[x9, x11#0x0]
00b7fee4	ldrh w8,[sp, #0x42]
00b7fee8	b 0x00b7fef4
00b7feec	ldr x9,[sp, #0x48]
00b7fef0	ldr x10,[x9, x23, LSL #0x3]
00b7fef4	sub x10,x10,#0x1
00b7fef8	tst w8,#0xffff
00b7fefc	mov x26,x23
00b7ff00	str x10,[x9, x23, LSL #0x3]
00b7ff04	and x23,x8,#0xffff
00b7ff08	b.eq 0x00b7ff1c
00b7ff0c	ldr x24,[sp, #0x38]
00b7ff10	lsl x2,x23,#0x3
00b7ff14	mov w23,#0x1
00b7ff18	b 0x00b7ff6c
00b7ff1c	mov w0,#0x1
00b7ff20	mov w1,#0x8
00b7ff24	bl 0x00c30a30
00b7ff28	mov x24,x0
00b7ff2c	cbz x0,0x00b80304
00b7ff30	ldr x25,[sp, #0x38]
00b7ff34	cbz x25,0x00b7ff58
00b7ff38	lsl x23,x23,#0x3
00b7ff3c	mov x0,x24
00b7ff40	mov x1,x25
00b7ff44	mov x2,x23
00b7ff48	bl 0x00c2ffd0
00b7ff4c	mov x0,x25
00b7ff50	mov x1,x23
00b7ff54	bl 0x00c42230
00b7ff58	ldr x25,[sp, #0x30]
00b7ff5c	mov w23,#0x1
00b7ff60	mov w2,#0x8
00b7ff64	strh w23,[sp, #0x42]
00b7ff68	str x24,[sp, #0x38]
00b7ff6c	mov x0,x24
00b7ff70	mov w1,wzr
00b7ff74	bl 0x00c301c0
00b7ff78	ldr x8,[sp, #0x38]
00b7ff7c	str xzr,[x8]
00b7ff80	ldr x9,[sp, #0x58]
00b7ff84	strh w23,[sp, #0x40]
00b7ff88	cbz x25,0x00b7ff98
00b7ff8c	ldr x10,[sp, #0x20]
00b7ff90	ldr x10,[x9, x10, LSL #0x3]
00b7ff94	b 0x00b7ff9c
00b7ff98	mov x10,xzr
00b7ff9c	str x10,[x8]
00b7ffa0	ldr x9,[x9, x25, LSL #0x3]
00b7ffa4	add x0,sp,#0x38
00b7ffa8	add x1,sp,#0x38
00b7ffac	mov x23,x26
00b7ffb0	str x9,[x8, #0x8]
00b7ffb4	ldr x8,[sp, #0x48]
00b7ffb8	ldr x2,[x8, x26, LSL #0x3]
00b7ffbc	bl 0x00c41c70
00b7ffc0	mov w26,w0
00b7ffc4	cbnz w0,0x00b7fd4c
00b7ffc8	ldrh w8,[sp, #0x42]
00b7ffcc	ldr x9,[sp, #0x38]
00b7ffd0	sub x10,x8,#0x1
00b7ffd4	cmn x10,#0x1
00b7ffd8	b.eq 0x00b7fff0
00b7ffdc	ldr x11,[x9, x10, LSL #0x3]
00b7ffe0	sub x10,x10,#0x1
00b7ffe4	cbz x11,0x00b7ffd4
00b7ffe8	add x10,x10,#0x2
00b7ffec	b 0x00b7fff4
00b7fff0	mov x10,xzr
00b7fff4	mov w11,#0x2
00b7fff8	cmn x11,#0x1
00b7fffc	b.eq 0x00b8001c
00b80000	ldr x12,[x27, x11, LSL #0x3]
00b80004	sub x11,x11,#0x1
00b80008	cbz x12,0x00b7fff8
00b8000c	add x11,x11,#0x2
00b80010	orr x12,x11,x10
00b80014	cbnz x12,0x00b80028
00b80018	b 0x00b80084
00b8001c	mov x11,xzr
00b80020	orr x12,x11,x10
00b80024	cbz x12,0x00b80084
00b80028	cmp x10,x11
00b8002c	b.ls 0x00b80040
00b80030	ldrsh w11,[sp, #0x40]
00b80034	cmp w11,#0x1
00b80038	b.ge 0x00b7feec
00b8003c	b 0x00b80084
00b80040	cmp x11,x10
00b80044	b.hi 0x00b80084
00b80048	ldrsh w11,[sp, #0x40]
00b8004c	tbnz w11,#0x1f,0x00b80084
00b80050	cbz x10,0x00b80084
00b80054	lsl x12,x10,#0x3
00b80058	add x13,x9,x12
00b8005c	add x12,x27,x12
00b80060	ldur x13,[x13, #-0x8]
00b80064	ldur x12,[x12, #-0x8]
00b80068	sub x10,x10,#0x1
00b8006c	cmp x13,x12
00b80070	b.hi 0x00b8007c
00b80074	b.cs 0x00b80050
00b80078	neg w11,w11
00b8007c	cmp w11,#0x1
00b80080	b.ge 0x00b7feec
00b80084	ldr x8,[sp, #0x48]
00b80088	add x0,sp,#0x38
00b8008c	add x1,sp,#0x58
00b80090	ldr x2,[x8, x23, LSL #0x3]
00b80094	bl 0x00c41c70
00b80098	mov w26,w0
00b8009c	cbnz w0,0x00b7fd4c
00b800a0	ldr x0,[sp, #0x38]
00b800a4	ldrh w1,[sp, #0x42]
00b800a8	lsl x24,x23,#0x6
00b800ac	bl 0x00c41dc0
00b800b0	ldrh w25,[sp, #0x42]
00b800b4	add x8,x0,x24
00b800b8	lsl x9,x25,#0x6
00b800bc	cmp x9,x8
00b800c0	b.cs 0x00b80130
00b800c4	lsr x9,x8,#0x6
00b800c8	tst x8,#0x3f
00b800cc	cinc x26,x9,ne
00b800d0	mov w8,#0x2710
00b800d4	cmp x26,x8
00b800d8	b.hi 0x00b80304
00b800dc	cmp x26,x25
00b800e0	b.ls 0x00b80130
00b800e4	mov w1,#0x8
00b800e8	mov x0,x26
00b800ec	bl 0x00c30a30
00b800f0	mov x23,x0
00b800f4	cbz x0,0x00b80304
00b800f8	ldr x8,[sp, #0x38]
00b800fc	cbz x8,0x00b80124
00b80100	lsl x2,x25,#0x3
00b80104	mov x0,x23
00b80108	mov x1,x8
00b8010c	str x2,[sp]
00b80110	mov x25,x8
00b80114	bl 0x00c2ffd0
00b80118	ldr x1,[sp]
00b8011c	mov x0,x25
00b80120	bl 0x00c42230
00b80124	and x25,x26,#0xffff
00b80128	strh w26,[sp, #0x42]
00b8012c	str x23,[sp, #0x38]
00b80130	ldr x0,[sp, #0x38]
00b80134	mov x1,x25
00b80138	mov x2,x24
00b8013c	bl 0x00c41ee0
00b80140	add x0,sp,#0x68
00b80144	add x1,sp,#0x68
00b80148	add x2,sp,#0x38
00b8014c	mov w3,#0xffffffff
00b80150	bl 0x00b7f304
00b80154	mov w26,w0
00b80158	cbnz w0,0x00b7fd4c
00b8015c	ldrh w8,[sp, #0x72]
00b80160	ldr x9,[sp, #0x68]
00b80164	ldr x11,[sp, #0x30]
00b80168	cbz x8,0x00b8026c
00b8016c	add x10,x9,x8, LSL #0x3
00b80170	ldur x10,[x10, #-0x8]
00b80174	sub x8,x8,#0x1
00b80178	cbz x10,0x00b80168
00b8017c	ldrsh w8,[sp, #0x70]
00b80180	tbz w8,#0x1f,0x00b8026c
00b80184	add x0,sp,#0x38
00b80188	add x1,sp,#0x58
00b8018c	bl 0x00c41b60
00b80190	mov w26,w0
00b80194	cbnz w0,0x00b7fd4c
00b80198	ldr x0,[sp, #0x38]
00b8019c	ldrh w1,[sp, #0x42]
00b801a0	bl 0x00c41dc0
00b801a4	ldrh w25,[sp, #0x42]
00b801a8	add x8,x0,x24
00b801ac	lsl x9,x25,#0x6
00b801b0	cmp x9,x8
00b801b4	b.cs 0x00b80228
00b801b8	lsr x9,x8,#0x6
00b801bc	tst x8,#0x3f
00b801c0	cinc x26,x9,ne
00b801c4	mov w8,#0x2710
00b801c8	cmp x26,x8
00b801cc	b.hi 0x00b80304
00b801d0	cmp x26,x25
00b801d4	b.ls 0x00b80228
00b801d8	mov w1,#0x8
00b801dc	mov x0,x26
00b801e0	bl 0x00c30a30
00b801e4	mov x23,x0
00b801e8	cbz x0,0x00b80304
00b801ec	ldr x9,[sp, #0x38]
00b801f0	cbz x9,0x00b8021c
00b801f4	mov x8,x9
00b801f8	lsl x2,x25,#0x3
00b801fc	mov x0,x23
00b80200	mov x1,x8
00b80204	str x2,[sp]
00b80208	mov x25,x9
00b8020c	bl 0x00c2ffd0
00b80210	ldr x1,[sp]
00b80214	mov x0,x25
00b80218	bl 0x00c42230
00b8021c	and x25,x26,#0xffff
00b80220	strh w26,[sp, #0x42]
00b80224	str x23,[sp, #0x38]
00b80228	ldr x0,[sp, #0x38]
00b8022c	mov x1,x25
00b80230	mov x2,x24
00b80234	bl 0x00c41ee0
00b80238	add x0,sp,#0x68
00b8023c	add x1,sp,#0x68
00b80240	add x2,sp,#0x38
00b80244	mov w3,#0x1
00b80248	bl 0x00b7f304
00b8024c	mov w26,w0
00b80250	cbnz w0,0x00b7fd4c
00b80254	ldr x8,[sp, #0x48]
00b80258	ldr x10,[sp, #0x8]
00b8025c	ldr x11,[sp, #0x30]
00b80260	ldr x9,[x8, x10#0x0]
00b80264	sub x9,x9,#0x1
00b80268	str x9,[x8, x10#0x0]
00b8026c	ldr x9,[sp, #0x28]
00b80270	cmp x9,x11
00b80274	b.hi 0x00b7fe30
00b80278	cbz x21,0x00b802a0
00b8027c	add x1,sp,#0x48
00b80280	mov x0,x21
00b80284	bl 0x00c41b60
00b80288	mov w26,w0
00b8028c	cbnz w0,0x00b7fd4c
00b80290	ldrh w8,[x20, #0x8]
00b80294	ldrh w9,[x22, #0x8]
00b80298	mul w8,w9,w8
00b8029c	strh w8,[x21, #0x8]
00b802a0	cbz x19,0x00b80314
00b802a4	ldrh w1,[sp, #0x72]
00b802a8	cbz x1,0x00b802b8
00b802ac	ldr x0,[sp, #0x68]
00b802b0	ldr x2,[sp, #0x10]
00b802b4	bl 0x00c41ef0
00b802b8	ldrh w8,[x20, #0x8]
00b802bc	add x1,sp,#0x68
00b802c0	mov x0,x19
00b802c4	strh w8,[sp, #0x70]
00b802c8	bl 0x00c41b60
00b802cc	mov w26,w0
00b802d0	cbnz w0,0x00b7fd4c
00b802d4	ldrh w8,[x19, #0xa]
00b802d8	sub x8,x8,#0x1
00b802dc	cmn x8,#0x1
00b802e0	b.eq 0x00b80324
00b802e4	ldr x9,[x19]
00b802e8	ldr x9,[x9, x8, LSL #0x3]
00b802ec	sub x8,x8,#0x1
00b802f0	cbz x9,0x00b802dc
00b802f4	ldrh w8,[x19, #0x8]!
00b802f8	mov w26,wzr
00b802fc	cbnz w8,0x00b7fd4c
00b80300	b 0x00b80328
00b80304	orr w26,wzr,#0xfffffff0
00b80308	ldr x0,[sp, #0x68]
00b8030c	cbnz x0,0x00b7fd54
00b80310	b 0x00b7fd60
00b80314	mov w26,wzr
00b80318	ldr x0,[sp, #0x68]
00b8031c	cbnz x0,0x00b7fd54
00b80320	b 0x00b7fd60
00b80324	add x19,x19,#0x8
00b80328	mov w26,wzr
00b8032c	mov w8,#0x1
00b80330	strh w8,[x19]
00b80334	ldr x0,[sp, #0x68]
00b80338	cbnz x0,0x00b7fd54
00b8033c	b 0x00b7fd60
00b80340	bl 0x00c2fec0

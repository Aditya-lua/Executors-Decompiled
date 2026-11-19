; X509_STORE_CTX_init @ 00b0f78c
00b0f78c	str x23,[sp, #-0x40]!
00b0f790	stp x22,x21,[sp, #0x10]
00b0f794	stp x20,x19,[sp, #0x20]
00b0f798	stp x29,x30,[sp, #0x30]
00b0f79c	add x29,sp,#0x30
00b0f7a0	cbz x0,0x00b0f938
00b0f7a4	ldr x8,[x0, #0x88]
00b0f7a8	mov x22,x3
00b0f7ac	mov x23,x2
00b0f7b0	mov x21,x1
00b0f7b4	mov x19,x0
00b0f7b8	cbz x8,0x00b0f7c8
00b0f7bc	mov x0,x19
00b0f7c0	blr x8
00b0f7c4	str xzr,[x19, #0x88]
00b0f7c8	ldr x0,[x19, #0x20]
00b0f7cc	cbz x0,0x00b0f7e0
00b0f7d0	ldr x8,[x19, #0xd8]
00b0f7d4	cbnz x8,0x00b0f7dc
00b0f7d8	bl 0x00c35b90
00b0f7dc	str xzr,[x19, #0x20]
00b0f7e0	ldr x0,[x19, #0xa0]
00b0f7e4	bl 0x00c40610
00b0f7e8	str xzr,[x19, #0xa0]
00b0f7ec	adrp x1,0xcb4000
00b0f7f0	ldr x0,[x19, #0x98]
00b0f7f4	ldr x1,[x1, #0xd88]
00b0f7f8	bl 0x00c32600
00b0f7fc	add x20,x19,#0xe0
00b0f800	mov w0,#0x5
00b0f804	mov x1,x19
00b0f808	mov x2,x20
00b0f80c	str xzr,[x19, #0x98]
00b0f810	bl 0x00c356c0
00b0f814	stp x21,x23,[x19]
00b0f818	stp x22,xzr,[x19, #0x10]
00b0f81c	str xzr,[x19, #0x28]
00b0f820	stp xzr,xzr,[x19, #0xa0]
00b0f824	stp xzr,xzr,[x19, #0x90]
00b0f828	str wzr,[x19, #0xb0]
00b0f82c	stp xzr,xzr,[x19, #0xc8]
00b0f830	stp xzr,xzr,[x19, #0xb8]
00b0f834	stp xzr,xzr,[x19, #0xd8]
00b0f838	stp xzr,xzr,[x19, #0xe8]
00b0f83c	str wzr,[x19, #0xf8]
00b0f840	cbz x21,0x00b0f974
00b0f844	ldr x8,[x21, #0x78]
00b0f848	adrp x9,0xb0f000
00b0f84c	add x9,x9,#0xb7c
00b0f850	str x8,[x19, #0x88]
00b0f854	ldr x8,[x21, #0x38]
00b0f858	cmp x8,#0x0
00b0f85c	csel x8,x9,x8,eq
00b0f860	str x8,[x19, #0x48]
00b0f864	ldr x8,[x21, #0x30]
00b0f868	adrp x9,0xcb5000
00b0f86c	ldr x9,[x9, #0x878]
00b0f870	cmp x8,#0x0
00b0f874	csel x8,x9,x8,eq
00b0f878	str x8,[x19, #0x40]
00b0f87c	ldr x8,[x21, #0x28]
00b0f880	adrp x9,0xb0f000
00b0f884	add x9,x9,#0xb9c
00b0f888	cmp x8,#0x0
00b0f88c	csel x8,x9,x8,eq
00b0f890	str x8,[x19, #0x38]
00b0f894	ldr x8,[x21, #0x20]
00b0f898	adrp x9,0xb0f000
00b0f89c	add x9,x9,#0xba0
00b0f8a0	cmp x8,#0x0
00b0f8a4	csel x8,x9,x8,eq
00b0f8a8	str x8,[x19, #0x30]
00b0f8ac	ldr x8,[x21, #0x40]
00b0f8b0	adrp x9,0xb0f000
00b0f8b4	add x9,x9,#0xddc
00b0f8b8	cmp x8,#0x0
00b0f8bc	csel x8,x9,x8,eq
00b0f8c0	str x8,[x19, #0x50]
00b0f8c4	ldr x8,[x21, #0x48]
00b0f8c8	adrp x9,0xb10000
00b0f8cc	add x9,x9,#0x98
00b0f8d0	str x8,[x19, #0x58]
00b0f8d4	ldr x8,[x21, #0x50]
00b0f8d8	cmp x8,#0x0
00b0f8dc	csel x8,x9,x8,eq
00b0f8e0	str x8,[x19, #0x60]
00b0f8e4	ldr x8,[x21, #0x58]
00b0f8e8	adrp x9,0xb10000
00b0f8ec	add x9,x9,#0x3d4
00b0f8f0	cmp x8,#0x0
00b0f8f4	csel x8,x9,x8,eq
00b0f8f8	str x8,[x19, #0x68]
00b0f8fc	ldr x8,[x21, #0x60]
00b0f900	adrp x9,0xb10000
00b0f904	add x9,x9,#0x47c
00b0f908	cmp x8,#0x0
00b0f90c	csel x8,x9,x8,eq
00b0f910	str x8,[x19, #0x70]
00b0f914	ldr x8,[x21, #0x68]
00b0f918	adrp x9,0xcb5000
00b0f91c	ldr x9,[x9, #0x868]
00b0f920	cmp x8,#0x0
00b0f924	csel x8,x9,x8,eq
00b0f928	str x8,[x19, #0x78]
00b0f92c	ldr x8,[x21, #0x70]
00b0f930	cbnz x8,0x00b0f9dc
00b0f934	b 0x00b0f9d4
00b0f938	bl 0x00c342a0
00b0f93c	adrp x0,0x2a0000
00b0f940	adrp x2,0x2d0000
00b0f944	add x0,x0,#0xe02
00b0f948	add x2,x2,#0x5d0
00b0f94c	mov w1,#0x915
00b0f950	bl 0x00c342b0
00b0f954	mov w8,#0x100
00b0f958	movk w8,#0xc, LSL #16
00b0f95c	add w1,w8,#0x2
00b0f960	mov w0,#0xb
00b0f964	mov x2,xzr
00b0f968	bl 0x00c342c0
00b0f96c	mov w0,wzr
00b0f970	b 0x00b0fb4c
00b0f974	str xzr,[x19, #0x88]
00b0f978	adrp x9,0xcb5000
00b0f97c	ldr x9,[x9, #0x878]
00b0f980	adrp x8,0xb0f000
00b0f984	add x8,x8,#0xb7c
00b0f988	adrp x10,0xb0f000
00b0f98c	adrp x11,0xb0f000
00b0f990	adrp x13,0xb10000
00b0f994	stp x9,x8,[x19, #0x40]
00b0f998	adrp x8,0xb10000
00b0f99c	add x10,x10,#0xb9c
00b0f9a0	add x11,x11,#0xba0
00b0f9a4	add x13,x13,#0x98
00b0f9a8	add x8,x8,#0x3d4
00b0f9ac	stp x11,x10,[x19, #0x30]
00b0f9b0	stp x13,x8,[x19, #0x60]
00b0f9b4	adrp x8,0xcb5000
00b0f9b8	ldr x8,[x8, #0x868]
00b0f9bc	adrp x12,0xb0f000
00b0f9c0	adrp x9,0xb10000
00b0f9c4	add x12,x12,#0xddc
00b0f9c8	add x9,x9,#0x47c
00b0f9cc	stp x12,xzr,[x19, #0x50]
00b0f9d0	stp x9,x8,[x19, #0x70]
00b0f9d4	adrp x8,0xcb5000
00b0f9d8	ldr x8,[x8, #0x870]
00b0f9dc	str x8,[x19, #0x80]
00b0f9e0	bl 0x00c35be0
00b0f9e4	str x0,[x19, #0x20]
00b0f9e8	cbz x0,0x00b0fa00
00b0f9ec	cbz x21,0x00b0fa3c
00b0f9f0	ldr x1,[x21, #0x18]
00b0f9f4	bl 0x00c35bd0
00b0f9f8	cbnz w0,0x00b0fa4c
00b0f9fc	b 0x00b0fae8
00b0fa00	bl 0x00c342a0
00b0fa04	adrp x0,0x2a0000
00b0fa08	adrp x2,0x2d0000
00b0fa0c	add x0,x0,#0xe02
00b0fa10	add x2,x2,#0x5d0
00b0fa14	mov w1,#0x970
00b0fa18	bl 0x00c342b0
00b0fa1c	mov w1,#0x100
00b0fa20	mov w0,#0xb
00b0fa24	movk w1,#0xc, LSL #16
00b0fa28	mov x2,xzr
00b0fa2c	bl 0x00c342c0
00b0fa30	ldr x8,[x19, #0x88]
00b0fa34	cbnz x8,0x00b0faf0
00b0fa38	b 0x00b0fafc
00b0fa3c	ldr w8,[x0, #0x10]
00b0fa40	mov w9,#0x11
00b0fa44	orr w8,w8,w9
00b0fa48	str w8,[x0, #0x10]
00b0fa4c	adrp x0,0x2c1000
00b0fa50	add x0,x0,#0x1ad
00b0fa54	bl 0x00c40e50
00b0fa58	cbz x0,0x00b0fab0
00b0fa5c	mov x1,x0
00b0fa60	ldr x0,[x19, #0x20]
00b0fa64	bl 0x00c35bd0
00b0fa68	cbz w0,0x00b0fae8
00b0fa6c	ldr x8,[x19, #0x20]
00b0fa70	ldr w9,[x8, #0x24]
00b0fa74	cbnz w9,0x00b0fa94
00b0fa78	ldr w0,[x8, #0x20]
00b0fa7c	bl 0x00c40a10
00b0fa80	bl 0x00c40a00
00b0fa84	cbz x0,0x00b0fa94
00b0fa88	bl 0x00c40a20
00b0fa8c	ldr x8,[x19, #0x20]
00b0fa90	str w0,[x8, #0x24]
00b0fa94	mov w0,#0x5
00b0fa98	mov x1,x19
00b0fa9c	mov x2,x20
00b0faa0	bl 0x00c356e0
00b0faa4	cbz w0,0x00b0fb60
00b0faa8	mov w0,#0x1
00b0faac	b 0x00b0fb4c
00b0fab0	bl 0x00c342a0
00b0fab4	adrp x0,0x2a0000
00b0fab8	adrp x2,0x2cc000
00b0fabc	add x0,x0,#0xe02
00b0fac0	add x2,x2,#0x2b4
00b0fac4	mov w1,#0xa46
00b0fac8	bl 0x00c342b0
00b0facc	adrp x2,0x2ad000
00b0fad0	adrp x3,0x2c1000
00b0fad4	add x2,x2,#0x7ba
00b0fad8	add x3,x3,#0x1ad
00b0fadc	mov w0,#0xb
00b0fae0	mov w1,#0x79
00b0fae4	bl 0x00c342c0
00b0fae8	ldr x8,[x19, #0x88]
00b0faec	cbz x8,0x00b0fafc
00b0faf0	mov x0,x19
00b0faf4	blr x8
00b0faf8	str xzr,[x19, #0x88]
00b0fafc	ldr x0,[x19, #0x20]
00b0fb00	cbz x0,0x00b0fb14
00b0fb04	ldr x8,[x19, #0xd8]
00b0fb08	cbnz x8,0x00b0fb10
00b0fb0c	bl 0x00c35b90
00b0fb10	str xzr,[x19, #0x20]
00b0fb14	ldr x0,[x19, #0xa0]
00b0fb18	bl 0x00c40610
00b0fb1c	str xzr,[x19, #0xa0]
00b0fb20	adrp x1,0xcb4000
00b0fb24	ldr x0,[x19, #0x98]
00b0fb28	ldr x1,[x1, #0xd88]
00b0fb2c	bl 0x00c32600
00b0fb30	mov w0,#0x5
00b0fb34	mov x1,x19
00b0fb38	mov x2,x20
00b0fb3c	str xzr,[x19, #0x98]
00b0fb40	bl 0x00c356c0
00b0fb44	mov w0,wzr
00b0fb48	stp xzr,xzr,[x20]
00b0fb4c	ldp x29,x30,[sp, #0x30]
00b0fb50	ldp x20,x19,[sp, #0x20]
00b0fb54	ldp x22,x21,[sp, #0x10]
00b0fb58	ldr x23,[sp], #0x40
00b0fb5c	ret
00b0fb60	bl 0x00c342a0
00b0fb64	adrp x0,0x2a0000
00b0fb68	adrp x2,0x2d0000
00b0fb6c	add x0,x0,#0xe02
00b0fb70	add x2,x2,#0x5d0
00b0fb74	mov w1,#0x98c
00b0fb78	b 0x00b0fa18

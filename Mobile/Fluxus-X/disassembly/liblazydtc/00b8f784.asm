; psa_crypto_init @ 00b8f784
00b8f784	sub sp,sp,#0x40
00b8f788	stp x22,x21,[sp, #0x10]
00b8f78c	stp x20,x19,[sp, #0x20]
00b8f790	stp x29,x30,[sp, #0x30]
00b8f794	add x29,sp,#0x30
00b8f798	mrs x21,tpidr_el0
00b8f79c	ldr x8,[x21, #0x28]
00b8f7a0	adrp x22,0xd25000
00b8f7a4	add x22,x22,#0xb10
00b8f7a8	str x8,[sp, #0x8]
00b8f7ac	ldrb w9,[x22, #0x1]
00b8f7b0	ldrb w8,[x22]
00b8f7b4	cmp w9,#0x2
00b8f7b8	b.ne 0x00b8f7c8
00b8f7bc	cmp w8,#0x7
00b8f7c0	mov w19,wzr
00b8f7c4	b.eq 0x00b8f920
00b8f7c8	tbnz w8,#0x0,0x00b8f7d8
00b8f7cc	orr w8,w8,#0x1
00b8f7d0	adrp x10,0xd25000
00b8f7d4	strb w8,[x10, #0xb10]
00b8f7d8	tbnz w8,#0x1,0x00b8f7fc
00b8f7dc	bl 0x00c431a0
00b8f7e0	adrp x9,0xd25000
00b8f7e4	ldrb w8,[x9, #0xb10]
00b8f7e8	mov w19,w0
00b8f7ec	orr w8,w8,#0x2
00b8f7f0	strb w8,[x9, #0xb10]
00b8f7f4	cbnz w0,0x00b8f888
00b8f7f8	ldrb w9,[x22, #0x1]
00b8f7fc	cbnz w9,0x00b8f908
00b8f800	tbz w8,#0x0,0x00b8f908
00b8f804	ldr x8,[x22, #0x8]
00b8f808	cbnz x8,0x00b8f818
00b8f80c	adrp x8,0xcb4000
00b8f810	ldr x8,[x8, #0x9e8]
00b8f814	str x8,[x22, #0x8]
00b8f818	ldr x9,[x22, #0x10]
00b8f81c	cbnz x9,0x00b8f82c
00b8f820	adrp x9,0xcb5000
00b8f824	ldr x9,[x9, #0xa98]
00b8f828	str x9,[x22, #0x10]
00b8f82c	add x19,x22,#0x18
00b8f830	mov x0,x19
00b8f834	blr x8
00b8f838	add x20,x22,#0x358
00b8f83c	mov x0,x20
00b8f840	bl 0x00c30360
00b8f844	mov w9,#0x5350
00b8f848	mov w8,#0x1
00b8f84c	movk w9,#0x41, LSL #16
00b8f850	strb w8,[x22, #0x1]
00b8f854	str w9,[sp, #0x4]
00b8f858	adrp x1,0xcb4000
00b8f85c	ldr x1,[x1, #0x9f0]
00b8f860	add x3,sp,#0x4
00b8f864	orr w4,wzr,#0x3
00b8f868	mov x0,x20
00b8f86c	mov x2,x19
00b8f870	bl 0x00c30390
00b8f874	bl 0x00c42bf0
00b8f878	mov w19,w0
00b8f87c	cbz w0,0x00b8f8fc
00b8f880	adrp x8,0xd25000
00b8f884	ldrb w8,[x8, #0xb10]
00b8f888	tbnz w8,#0x2,0x00b8f8cc
00b8f88c	tbnz w8,#0x1,0x00b8f8dc
00b8f890	ldrb w8,[x22, #0x1]
00b8f894	cbz w8,0x00b8f8ac
00b8f898	add x0,x22,#0x358
00b8f89c	bl 0x00c42460
00b8f8a0	ldr x8,[x22, #0x10]
00b8f8a4	add x0,x22,#0x18
00b8f8a8	blr x8
00b8f8ac	add x0,x22,#0x8
00b8f8b0	mov w1,#0x4a8
00b8f8b4	strb wzr,[x22, #0x1]
00b8f8b8	bl 0x00c42220
00b8f8bc	ldrb w8,[x22]
00b8f8c0	tbz w8,#0x0,0x00b8f920
00b8f8c4	and w8,w8,#0xfe
00b8f8c8	b 0x00b8f918
00b8f8cc	and w8,w8,#0xfffffffb
00b8f8d0	adrp x9,0xd25000
00b8f8d4	strb w8,[x9, #0xb10]
00b8f8d8	tbz w8,#0x1,0x00b8f890
00b8f8dc	bl 0x00c43210
00b8f8e0	adrp x8,0xd25000
00b8f8e4	ldrb w9,[x8, #0xb10]
00b8f8e8	and w9,w9,#0xfffffffd
00b8f8ec	strb w9,[x8, #0xb10]
00b8f8f0	ldrb w8,[x22, #0x1]
00b8f8f4	cbnz w8,0x00b8f898
00b8f8f8	b 0x00b8f8ac
00b8f8fc	ldrb w8,[x22]
00b8f900	mov w9,#0x2
00b8f904	strb w9,[x22, #0x1]
00b8f908	mov w19,wzr
00b8f90c	tbnz w8,#0x2,0x00b8f920
00b8f910	mov w19,wzr
00b8f914	orr w8,w8,#0x4
00b8f918	adrp x9,0xd25000
00b8f91c	strb w8,[x9, #0xb10]
00b8f920	ldr x8,[x21, #0x28]
00b8f924	ldr x9,[sp, #0x8]
00b8f928	cmp x8,x9
00b8f92c	b.ne 0x00b8f948
00b8f930	mov w0,w19
00b8f934	ldp x29,x30,[sp, #0x30]
00b8f938	ldp x20,x19,[sp, #0x20]
00b8f93c	ldp x22,x21,[sp, #0x10]
00b8f940	add sp,sp,#0x40
00b8f944	ret
00b8f948	bl 0x00c2fec0

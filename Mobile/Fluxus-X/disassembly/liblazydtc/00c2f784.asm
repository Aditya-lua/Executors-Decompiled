; FUN_00c2f784 @ 00c2f784
00c2f784	paciasp
00c2f788	sub sp,sp,#0x70
00c2f78c	stp x29,x30,[sp, #0x10]
00c2f790	stp x28,x27,[sp, #0x20]
00c2f794	stp x26,x25,[sp, #0x30]
00c2f798	stp x24,x23,[sp, #0x40]
00c2f79c	stp x22,x21,[sp, #0x50]
00c2f7a0	stp x20,x19,[sp, #0x60]
00c2f7a4	add x29,sp,#0x10
00c2f7a8	cmp x4,#0x0
00c2f7ac	add x8,x3,x2
00c2f7b0	csel x22,x2,x4,eq
00c2f7b4	cmn x3,#0x1
00c2f7b8	csinv x27,x8,xzr,ne
00c2f7bc	str x22,[sp, #0x8]
00c2f7c0	cmp x22,x27
00c2f7c4	b.cs 0x00c2f908
00c2f7c8	mov x21,x6
00c2f7cc	mov x19,x5
00c2f7d0	mov x23,x2
00c2f7d4	mov x24,x1
00c2f7d8	mov x20,x0
00c2f7dc	b 0x00c2f7ec
00c2f7e0	cmp x22,x27
00c2f7e4	str x22,[sp, #0x8]
00c2f7e8	b.cs 0x00c2f908
00c2f7ec	mov x8,x22
00c2f7f0	mov x26,x22
00c2f7f4	ldr w9,[x8], #0x4
00c2f7f8	str x8,[sp, #0x8]
00c2f7fc	cmn w9,#0x1
00c2f800	b.ne 0x00c2f810
00c2f804	ldur x9,[x26, #0x4]
00c2f808	add x8,x26,#0xc
00c2f80c	str x8,[sp, #0x8]
00c2f810	cbz x9,0x00c2f908
00c2f814	ldr w10,[x8]
00c2f818	add x22,x8,x9
00c2f81c	cbz w10,0x00c2f7e0
00c2f820	sub x1,x8,x10
00c2f824	cmp x23,x1
00c2f828	b.hi 0x00c2f7e0
00c2f82c	cmp x1,x27
00c2f830	b.cs 0x00c2f7e0
00c2f834	mov x0,x20
00c2f838	mov x2,x21
00c2f83c	bl 0x00c2c764
00c2f840	cbnz x0,0x00c2f7e0
00c2f844	ldr x8,[sp, #0x8]
00c2f848	ldrb w3,[x21, #0x18]
00c2f84c	add x1,sp,#0x8
00c2f850	mov x0,x20
00c2f854	mov x2,x22
00c2f858	mov x4,xzr
00c2f85c	add x8,x8,#0x4
00c2f860	str x8,[sp, #0x8]
00c2f864	bl 0x00c2e33c
00c2f868	ldrb w8,[x21, #0x18]
00c2f86c	mov x25,x0
00c2f870	add x1,sp,#0x8
00c2f874	mov x0,x20
00c2f878	mov x2,x22
00c2f87c	mov x4,xzr
00c2f880	and w3,w8,#0xf
00c2f884	bl 0x00c2e33c
00c2f888	cmp x25,x24
00c2f88c	b.cs 0x00c2f7e0
00c2f890	add x28,x0,x25
00c2f894	cmp x24,x28
00c2f898	b.hi 0x00c2f7e0
00c2f89c	ldrb w8,[x21, #0x31]
00c2f8a0	str xzr,[x19, #0x28]
00c2f8a4	tbz w8,#0x0,0x00c2f930
00c2f8a8	add x0,sp,#0x8
00c2f8ac	mov x1,x22
00c2f8b0	bl 0x00c2e6c8
00c2f8b4	ldrb w8,[x21, #0x19]
00c2f8b8	ldr x24,[sp, #0x8]
00c2f8bc	cmp w8,#0xff
00c2f8c0	add x23,x24,x0
00c2f8c4	b.eq 0x00c2f934
00c2f8c8	add x1,sp,#0x8
00c2f8cc	and w3,w8,#0xf
00c2f8d0	mov x0,x20
00c2f8d4	mov x2,x22
00c2f8d8	mov x4,xzr
00c2f8dc	bl 0x00c2e33c
00c2f8e0	cbz x0,0x00c2f934
00c2f8e4	ldrb w3,[x21, #0x19]
00c2f8e8	add x1,sp,#0x8
00c2f8ec	mov x0,x20
00c2f8f0	mov x2,x22
00c2f8f4	mov x4,xzr
00c2f8f8	str x24,[sp, #0x8]
00c2f8fc	bl 0x00c2e33c
00c2f900	str x0,[x19, #0x28]
00c2f904	b 0x00c2f934
00c2f908	mov w0,wzr
00c2f90c	ldp x20,x19,[sp, #0x60]
00c2f910	ldp x22,x21,[sp, #0x50]
00c2f914	ldp x24,x23,[sp, #0x40]
00c2f918	ldp x26,x25,[sp, #0x30]
00c2f91c	ldp x28,x27,[sp, #0x20]
00c2f920	ldp x29,x30,[sp, #0x10]
00c2f924	add sp,sp,#0x70
00c2f928	autiasp
00c2f92c	ret
00c2f930	ldr x23,[sp, #0x8]
00c2f934	sub x8,x22,x26
00c2f938	stp x23,x25,[x19, #0x10]
00c2f93c	mov w0,#0x1
00c2f940	stp x26,x8,[x19]
00c2f944	str x28,[x19, #0x20]
00c2f948	b 0x00c2f90c

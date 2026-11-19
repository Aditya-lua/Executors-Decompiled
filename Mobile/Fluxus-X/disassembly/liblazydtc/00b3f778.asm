; FUN_00b3f778 @ 00b3f778
00b3f778	sub sp,sp,#0x60
00b3f77c	mov w3,#0xffffffff
00b3f780	stp x22,x21,[sp, #0x30]
00b3f784	stp x20,x19,[sp, #0x40]
00b3f788	stp x29,x30,[sp, #0x50]
00b3f78c	str xzr,[sp, #0x10]
00b3f790	str w3,[sp, #0xc]
00b3f794	ldr w9,[x6, #0xc]
00b3f798	str x23,[sp, #0x20]
00b3f79c	mov x23,x6
00b3f7a0	mov x20,x5
00b3f7a4	mov x8,x4
00b3f7a8	mov w21,w2
00b3f7ac	mov x22,x1
00b3f7b0	mov x19,x0
00b3f7b4	add x29,sp,#0x50
00b3f7b8	cbz w9,0x00b3f7f0
00b3f7bc	str xzr,[sp, #0x28]
00b3f7c0	str w3,[sp, #0x1c]
00b3f7c4	cbz x8,0x00b3f81c
00b3f7c8	ldr w2,[x23, #0x8]
00b3f7cc	add x3,sp,#0x28
00b3f7d0	add x4,sp,#0x1c
00b3f7d4	mov x0,x22
00b3f7d8	mov w1,w21
00b3f7dc	blr x8
00b3f7e0	cbz w0,0x00b3f850
00b3f7e4	ldr x2,[sp, #0x28]
00b3f7e8	ldr w3,[sp, #0x1c]
00b3f7ec	b 0x00b3f820
00b3f7f0	cbz x8,0x00b3f868
00b3f7f4	ldr w2,[x23, #0x8]
00b3f7f8	add x3,sp,#0x10
00b3f7fc	add x4,sp,#0xc
00b3f800	mov x0,x22
00b3f804	mov w1,w21
00b3f808	blr x8
00b3f80c	cbz w0,0x00b3f850
00b3f810	ldr x2,[sp, #0x10]
00b3f814	ldr w3,[sp, #0xc]
00b3f818	b 0x00b3f870
00b3f81c	mov x2,xzr
00b3f820	mov x0,x22
00b3f824	mov w1,w21
00b3f828	mov x4,x20
00b3f82c	mov x5,x23
00b3f830	bl 0x00b3f48c
00b3f834	mov x20,x0
00b3f838	cbz x0,0x00b3f858
00b3f83c	mov x0,x19
00b3f840	mov x1,x20
00b3f844	bl 0x00c3f300
00b3f848	mov w19,w0
00b3f84c	b 0x00b3f85c
00b3f850	mov w19,wzr
00b3f854	b 0x00b3f8d0
00b3f858	mov w19,wzr
00b3f85c	mov x0,x20
00b3f860	bl 0x00c382f0
00b3f864	b 0x00b3f8d0
00b3f868	mov x2,xzr
00b3f86c	mov w3,#0xffffffff
00b3f870	mov x0,x22
00b3f874	mov w1,w21
00b3f878	mov x4,x20
00b3f87c	bl 0x00b3f5b8
00b3f880	mov x20,x0
00b3f884	cbz x0,0x00b3f89c
00b3f888	mov x0,x19
00b3f88c	mov x1,x20
00b3f890	bl 0x00c3f2f0
00b3f894	mov w19,w0
00b3f898	b 0x00b3f8c8
00b3f89c	ldr w8,[sp, #0xc]
00b3f8a0	ldr x0,[sp, #0x10]
00b3f8a4	cmp w8,#0x10
00b3f8a8	b.eq 0x00b3f8c0
00b3f8ac	cmp w8,#0x6
00b3f8b0	mov w19,wzr
00b3f8b4	b.ne 0x00b3f8c8
00b3f8b8	bl 0x00c37660
00b3f8bc	b 0x00b3f8c4
00b3f8c0	bl 0x00c37890
00b3f8c4	mov w19,wzr
00b3f8c8	mov x0,x20
00b3f8cc	bl 0x00c37d00
00b3f8d0	mov w0,w19
00b3f8d4	ldp x29,x30,[sp, #0x50]
00b3f8d8	ldp x20,x19,[sp, #0x40]
00b3f8dc	ldp x22,x21,[sp, #0x30]
00b3f8e0	ldr x23,[sp, #0x20]
00b3f8e4	add sp,sp,#0x60
00b3f8e8	ret

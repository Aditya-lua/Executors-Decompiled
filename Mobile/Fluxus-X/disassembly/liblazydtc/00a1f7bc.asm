; FUN_00a1f7bc @ 00a1f7bc
00a1f7bc	sub sp,sp,#0x40
00a1f7c0	stp x22,x21,[sp, #0x10]
00a1f7c4	stp x20,x19,[sp, #0x20]
00a1f7c8	stp x29,x30,[sp, #0x30]
00a1f7cc	str xzr,[sp, #0x8]
00a1f7d0	ldr x8,[x1, #0x20]
00a1f7d4	add x29,sp,#0x30
00a1f7d8	cbz x8,0x00a1f880
00a1f7dc	ldr x8,[x8, #0x70]
00a1f7e0	cbz x8,0x00a1f880
00a1f7e4	mov x21,x1
00a1f7e8	mov x20,x0
00a1f7ec	bl 0x00c37950
00a1f7f0	mov x19,x0
00a1f7f4	cbz x0,0x00a1f8b4
00a1f7f8	ldr x0,[x21, #0x20]
00a1f7fc	add x1,x19,#0x8
00a1f800	bl 0x00c3a180
00a1f804	cmp w0,#0x0
00a1f808	str w0,[x19]
00a1f80c	b.le 0x00a1f8d0
00a1f810	mov w8,#0x10
00a1f814	str w8,[x19, #0x4]
00a1f818	ldr x8,[x21, #0x20]
00a1f81c	mov x1,xzr
00a1f820	ldr x0,[x8, #0x70]
00a1f824	bl 0x00c375f0
00a1f828	cbz x0,0x00a1f8fc
00a1f82c	add x1,sp,#0x8
00a1f830	mov x22,x0
00a1f834	bl 0x00c381c0
00a1f838	mov w21,w0
00a1f83c	mov x0,x22
00a1f840	bl 0x00c37bd0
00a1f844	cmp w21,#0x0
00a1f848	b.le 0x00a1f918
00a1f84c	mov w0,#0x74
00a1f850	bl 0x00c37740
00a1f854	ldr x5,[sp, #0x8]
00a1f858	mov x1,x0
00a1f85c	mov w3,#0x10
00a1f860	mov x0,x20
00a1f864	mov w2,wzr
00a1f868	mov x4,x19
00a1f86c	mov w6,w21
00a1f870	bl 0x00c37ed0
00a1f874	cbz w0,0x00a1f964
00a1f878	mov w0,#0x1
00a1f87c	b 0x00a1f950
00a1f880	bl 0x00c342a0
00a1f884	adrp x0,0x2db000
00a1f888	adrp x2,0x2bf000
00a1f88c	add x0,x0,#0xe7d
00a1f890	add x2,x2,#0xb2a
00a1f894	mov w1,#0xab
00a1f898	bl 0x00c342b0
00a1f89c	mov w0,#0xa
00a1f8a0	mov w1,#0x65
00a1f8a4	mov x2,xzr
00a1f8a8	bl 0x00c342c0
00a1f8ac	mov x19,xzr
00a1f8b0	b 0x00a1f944
00a1f8b4	bl 0x00c342a0
00a1f8b8	adrp x0,0x2db000
00a1f8bc	adrp x2,0x2bf000
00a1f8c0	add x0,x0,#0xe7d
00a1f8c4	add x2,x2,#0xb2a
00a1f8c8	mov w1,#0xb2
00a1f8cc	b 0x00a1f8e8
00a1f8d0	bl 0x00c342a0
00a1f8d4	adrp x0,0x2db000
00a1f8d8	adrp x2,0x2bf000
00a1f8dc	add x0,x0,#0xe7d
00a1f8e0	add x2,x2,#0xb2a
00a1f8e4	mov w1,#0xb8
00a1f8e8	bl 0x00c342b0
00a1f8ec	mov w1,#0x100
00a1f8f0	mov w0,#0xa
00a1f8f4	movk w1,#0xc, LSL #16
00a1f8f8	b 0x00a1f93c
00a1f8fc	bl 0x00c342a0
00a1f900	adrp x0,0x2db000
00a1f904	adrp x2,0x2bf000
00a1f908	add x0,x0,#0xe7d
00a1f90c	add x2,x2,#0xb2a
00a1f910	mov w1,#0xc1
00a1f914	b 0x00a1f930
00a1f918	bl 0x00c342a0
00a1f91c	adrp x0,0x2db000
00a1f920	adrp x2,0x2bf000
00a1f924	add x0,x0,#0xe7d
00a1f928	add x2,x2,#0xb2a
00a1f92c	mov w1,#0xca
00a1f930	bl 0x00c342b0
00a1f934	mov w0,#0xa
00a1f938	mov w1,#0x6d
00a1f93c	mov x2,xzr
00a1f940	bl 0x00c342c0
00a1f944	mov x0,x19
00a1f948	bl 0x00c37890
00a1f94c	mov w0,wzr
00a1f950	ldp x29,x30,[sp, #0x30]
00a1f954	ldp x20,x19,[sp, #0x20]
00a1f958	ldp x22,x21,[sp, #0x10]
00a1f95c	add sp,sp,#0x40
00a1f960	ret
00a1f964	ldr x0,[sp, #0x8]
00a1f968	adrp x2,0x2db000
00a1f96c	sxtw x1,w21
00a1f970	add x2,x2,#0xe7d
00a1f974	mov w3,#0xd0
00a1f978	bl 0x00c345e0
00a1f97c	b 0x00a1f944

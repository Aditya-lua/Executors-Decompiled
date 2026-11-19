; ossl_decoder_ctx_setup_for_pkey @ 00a4f6d4
00a4f6d4	sub sp,sp,#0x80
00a4f6d8	stp x24,x23,[sp, #0x40]
00a4f6dc	stp x22,x21,[sp, #0x50]
00a4f6e0	stp x20,x19,[sp, #0x60]
00a4f6e4	mov x20,x4
00a4f6e8	mov x22,x3
00a4f6ec	mov x23,x2
00a4f6f0	mov x24,x1
00a4f6f4	mov x21,x0
00a4f6f8	stp x28,x27,[sp, #0x20]
00a4f6fc	stp x26,x25,[sp, #0x30]
00a4f700	stp x29,x30,[sp, #0x70]
00a4f704	add x29,sp,#0x70
00a4f708	cbz x2,0x00a4f740
00a4f70c	adrp x1,0x2cd000
00a4f710	add x1,x1,#0x9d2
00a4f714	mov x0,x23
00a4f718	bl 0x00c301f0
00a4f71c	cbz w0,0x00a4f738
00a4f720	adrp x1,0x2bd000
00a4f724	add x1,x1,#0xa15
00a4f728	mov x0,x23
00a4f72c	bl 0x00c301f0
00a4f730	mov w27,wzr
00a4f734	cbnz w0,0x00a4f744
00a4f738	mov w27,#0x1
00a4f73c	b 0x00a4f744
00a4f740	mov w27,wzr
00a4f744	adrp x1,0x2c5000
00a4f748	add x1,x1,#0x9ce
00a4f74c	orr w0,wzr,#0x30
00a4f750	mov w2,#0x150
00a4f754	bl 0x00c34250
00a4f758	mov x19,x0
00a4f75c	cbz x0,0x00a4f7e0
00a4f760	cbz x20,0x00a4f780
00a4f764	adrp x1,0x2c5000
00a4f768	add x1,x1,#0x9ce
00a4f76c	mov w2,#0x152
00a4f770	mov x0,x20
00a4f774	bl 0x00c34600
00a4f778	str x0,[x19, #0x8]
00a4f77c	cbz x0,0x00a4f7e0
00a4f780	bl 0x00c34780
00a4f784	str x0,[x19, #0x18]
00a4f788	cbz x0,0x00a4f7e0
00a4f78c	bl 0x00c34780
00a4f790	mov x20,x0
00a4f794	cbz x0,0x00a4f7e4
00a4f798	str x24,[x19, #0x28]
00a4f79c	str x22,[x19]
00a4f7a0	ldr w8,[x21, #0x10]
00a4f7a4	ldr x2,[x19, #0x18]
00a4f7a8	adrp x1,0xa4f000
00a4f7ac	add x1,x1,#0x9c4
00a4f7b0	mov x0,x22
00a4f7b4	str w8,[x19, #0x10]
00a4f7b8	bl 0x00c3b6c0
00a4f7bc	ldr x0,[x19, #0x18]
00a4f7c0	bl 0x00c325e0
00a4f7c4	cmp w0,#0x1
00a4f7c8	b.lt 0x00a4f884
00a4f7cc	adrp x26,0xa4f000
00a4f7d0	mov w24,w0
00a4f7d4	mov w25,wzr
00a4f7d8	add x26,x26,#0xa10
00a4f7dc	b 0x00a4f840
00a4f7e0	mov x20,xzr
00a4f7e4	bl 0x00c342a0
00a4f7e8	adrp x0,0x2c5000
00a4f7ec	adrp x2,0x2b9000
00a4f7f0	add x0,x0,#0x9ce
00a4f7f4	add x2,x2,#0xcf2
00a4f7f8	mov w1,#0x155
00a4f7fc	bl 0x00c342b0
00a4f800	mov w1,#0x100
00a4f804	orr w0,wzr,#0x3c
00a4f808	movk w1,#0xc, LSL #16
00a4f80c	mov x2,xzr
00a4f810	bl 0x00c342c0
00a4f814	mov w22,wzr
00a4f818	mov w21,wzr
00a4f81c	cbnz x19,0x00a4f940
00a4f820	b 0x00a4f98c
00a4f824	cbz w27,0x00a4f878
00a4f828	adrp x1,0x2ad000
00a4f82c	mov x0,x28
00a4f830	add x1,x1,#0xb94
00a4f834	bl 0x00c3b6d0
00a4f838	cbnz w0,0x00a4f864
00a4f83c	b 0x00a4f878
00a4f840	ldr x0,[x19, #0x18]
00a4f844	mov w1,w25
00a4f848	bl 0x00c32610
00a4f84c	mov x28,x0
00a4f850	cbz x23,0x00a4f864
00a4f854	mov x0,x28
00a4f858	mov x1,x23
00a4f85c	bl 0x00c3b6d0
00a4f860	cbz w0,0x00a4f824
00a4f864	mov x0,x28
00a4f868	mov x1,x26
00a4f86c	mov x2,x20
00a4f870	bl 0x00c3b6e0
00a4f874	cbz w0,0x00a4f908
00a4f878	add w25,w25,#0x1
00a4f87c	cmp w25,w24
00a4f880	b.lt 0x00a4f840
00a4f884	adrp x1,0xa4f000
00a4f888	add x1,x1,#0xa20
00a4f88c	add x2,sp,#0x8
00a4f890	mov x0,x22
00a4f894	stp x21,xzr,[sp, #0x10]
00a4f898	str x20,[sp, #0x8]
00a4f89c	bl 0x00c3b3b0
00a4f8a0	mov x0,x20
00a4f8a4	bl 0x00c34770
00a4f8a8	ldrb w8,[sp, #0x1c]
00a4f8ac	tbnz w8,#0x0,0x00a4f900
00a4f8b0	mov x0,x21
00a4f8b4	bl 0x00c3b320
00a4f8b8	cbz w0,0x00a4f9b8
00a4f8bc	adrp x1,0xa4f000
00a4f8c0	add x1,x1,#0xb3c
00a4f8c4	mov x0,x21
00a4f8c8	bl 0x00c3b340
00a4f8cc	cbz w0,0x00a4f900
00a4f8d0	mov x0,x21
00a4f8d4	mov x1,x19
00a4f8d8	bl 0x00c3b350
00a4f8dc	cbz w0,0x00a4f900
00a4f8e0	adrp x1,0xa4f000
00a4f8e4	add x1,x1,#0xd40
00a4f8e8	mov x0,x21
00a4f8ec	bl 0x00c3b330
00a4f8f0	cbz w0,0x00a4f900
00a4f8f4	mov x20,xzr
00a4f8f8	mov w21,#0x1
00a4f8fc	b 0x00a4f98c
00a4f900	mov x20,xzr
00a4f904	b 0x00a4f93c
00a4f908	bl 0x00c342a0
00a4f90c	adrp x0,0x2c5000
00a4f910	adrp x2,0x2b9000
00a4f914	add x0,x0,#0x9ce
00a4f918	add x2,x2,#0xcf2
00a4f91c	mov w1,#0x171
00a4f920	bl 0x00c342b0
00a4f924	mov w8,#0x100
00a4f928	movk w8,#0xc, LSL #16
00a4f92c	add w1,w8,#0x3
00a4f930	orr w0,wzr,#0x3c
00a4f934	mov x2,xzr
00a4f938	bl 0x00c342c0
00a4f93c	mov w22,wzr
00a4f940	adrp x1,0xcb5000
00a4f944	ldr x0,[x19, #0x18]
00a4f948	ldr x1,[x1, #0x1d0]
00a4f94c	bl 0x00c32600
00a4f950	ldr x0,[x19, #0x8]
00a4f954	adrp x21,0x2c5000
00a4f958	add x21,x21,#0x9ce
00a4f95c	mov w2,#0xc4
00a4f960	mov x1,x21
00a4f964	bl 0x00c32310
00a4f968	ldr x0,[x19, #0x20]
00a4f96c	mov w2,#0xc5
00a4f970	mov x1,x21
00a4f974	bl 0x00c32310
00a4f978	mov w2,#0xc6
00a4f97c	mov x0,x19
00a4f980	mov x1,x21
00a4f984	bl 0x00c32310
00a4f988	mov w21,w22
00a4f98c	mov x0,x20
00a4f990	bl 0x00c34770
00a4f994	mov w0,w21
00a4f998	ldp x29,x30,[sp, #0x70]
00a4f99c	ldp x20,x19,[sp, #0x60]
00a4f9a0	ldp x22,x21,[sp, #0x50]
00a4f9a4	ldp x24,x23,[sp, #0x40]
00a4f9a8	ldp x26,x25,[sp, #0x30]
00a4f9ac	ldp x28,x27,[sp, #0x20]
00a4f9b0	add sp,sp,#0x80
00a4f9b4	ret
00a4f9b8	mov x20,xzr
00a4f9bc	mov w22,#0x1
00a4f9c0	b 0x00a4f940

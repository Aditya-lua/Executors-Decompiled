; mbedtls_des_key_check_weak @ 00b7483c
00b7483c	ldr x8,[x0]
00b74840	orr x9,xzr,#0x101010101010101
00b74844	cmp x8,x9
00b74848	b.eq 0x00b749b0
00b7484c	ldr x8,[x0]
00b74850	orr x9,xzr,#-0x101010101010102
00b74854	cmp x8,x9
00b74858	b.eq 0x00b749b0
00b7485c	ldr x8,[x0]
00b74860	orr x9,xzr,#0xe0e0e0e0e0e0e0e
00b74864	movk x9,#0x1f1f
00b74868	movk x9,#0x1f1f, LSL #16
00b7486c	cmp x8,x9
00b74870	b.eq 0x00b749b0
00b74874	ldr x8,[x0]
00b74878	orr x9,xzr,#-0xe0e0e0e0e0e0e0f
00b7487c	movk x9,#0xe0e0
00b74880	movk x9,#0xe0e0, LSL #16
00b74884	cmp x8,x9
00b74888	b.eq 0x00b749b0
00b7488c	ldr x8,[x0]
00b74890	mov x9,#0x1f01
00b74894	movk x9,#0x1f01, LSL #16
00b74898	movk x9,#0xe01, LSL #32
00b7489c	movk x9,#0xe01, LSL #48
00b748a0	cmp x8,x9
00b748a4	b.eq 0x00b749b0
00b748a8	ldr x8,[x0]
00b748ac	mov x9,#0x11f
00b748b0	movk x9,#0x11f, LSL #16
00b748b4	movk x9,#0x10e, LSL #32
00b748b8	movk x9,#0x10e, LSL #48
00b748bc	cmp x8,x9
00b748c0	b.eq 0x00b749b0
00b748c4	ldr x8,[x0]
00b748c8	orr x9,xzr,#-0x1ffe1ffe1ffe1fff
00b748cc	movk x9,#0xf101, LSL #32
00b748d0	movk x9,#0xf101, LSL #48
00b748d4	cmp x8,x9
00b748d8	b.eq 0x00b749b0
00b748dc	ldr x8,[x0]
00b748e0	orr x9,xzr,#0x1e001e001e001e0
00b748e4	movk x9,#0x1f1, LSL #32
00b748e8	movk x9,#0x1f1, LSL #48
00b748ec	cmp x8,x9
00b748f0	b.eq 0x00b749b0
00b748f4	ldr x8,[x0]
00b748f8	orr x9,xzr,#-0x1fe01fe01fe01ff
00b748fc	cmp x8,x9
00b74900	b.eq 0x00b749b0
00b74904	ldr x8,[x0]
00b74908	orr x9,xzr,#0x1fe01fe01fe01fe
00b7490c	cmp x8,x9
00b74910	b.eq 0x00b749b0
00b74914	ldr x8,[x0]
00b74918	orr x9,xzr,#-0x1fe01fe01fe01fe1
00b7491c	movk x9,#0xf10e, LSL #32
00b74920	movk x9,#0xf10e, LSL #48
00b74924	cmp x8,x9
00b74928	b.eq 0x00b749b0
00b7492c	ldr x8,[x0]
00b74930	orr x9,xzr,#0x1fe01fe01fe01fe0
00b74934	movk x9,#0xef1, LSL #32
00b74938	movk x9,#0xef1, LSL #48
00b7493c	cmp x8,x9
00b74940	b.eq 0x00b749b0
00b74944	ldr x8,[x0]
00b74948	orr x9,xzr,#-0x1e001e001e001e1
00b7494c	movk x9,#0xfe0e, LSL #32
00b74950	movk x9,#0xfe0e, LSL #48
00b74954	cmp x8,x9
00b74958	b.eq 0x00b749b0
00b7495c	ldr x8,[x0]
00b74960	orr x9,xzr,#0x1ffe1ffe1ffe1ffe
00b74964	movk x9,#0xefe, LSL #32
00b74968	movk x9,#0xefe, LSL #48
00b7496c	cmp x8,x9
00b74970	b.eq 0x00b749b0
00b74974	ldr x8,[x0]
00b74978	mov x9,#0xfee0
00b7497c	movk x9,#0xfee0, LSL #16
00b74980	movk x9,#0xfef1, LSL #32
00b74984	movk x9,#0xfef1, LSL #48
00b74988	cmp x8,x9
00b7498c	b.eq 0x00b749b0
00b74990	ldr x8,[x0]
00b74994	mov x9,#0xe0fe
00b74998	movk x9,#0xe0fe, LSL #16
00b7499c	movk x9,#0xf1fe, LSL #32
00b749a0	movk x9,#0xf1fe, LSL #48
00b749a4	cmp x8,x9
00b749a8	cset w0,eq
00b749ac	ret
00b749b0	mov w0,#0x1
00b749b4	ret

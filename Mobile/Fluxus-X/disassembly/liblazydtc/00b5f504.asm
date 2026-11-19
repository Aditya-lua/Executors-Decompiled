; FUN_00b5f504 @ 00b5f504
00b5f504	sub sp,sp,#0x110
00b5f508	str x28,[sp, #0xd0]
00b5f50c	stp x22,x21,[sp, #0xe0]
00b5f510	stp x20,x19,[sp, #0xf0]
00b5f514	stp x29,x30,[sp, #0x100]
00b5f518	add x29,sp,#0x100
00b5f51c	cbz x0,0x00b5f958
00b5f520	mov x20,x1
00b5f524	adrp x1,0x2ca000
00b5f528	mov x19,x0
00b5f52c	add x1,x1,#0x1b4
00b5f530	mov x0,x20
00b5f534	bl 0x00c3e8c0
00b5f538	cbz x0,0x00b5f7d0
00b5f53c	mov x21,x0
00b5f540	sub x0,x29,#0x68
00b5f544	mov x1,sp
00b5f548	mov w2,#0x80
00b5f54c	bl 0x00c3e870
00b5f550	cbz w0,0x00b5f5a8
00b5f554	ldr w8,[x19, #0x68]
00b5f558	cmp w8,#0x6
00b5f55c	b.eq 0x00b5f5e4
00b5f560	cmp w8,#0x1
00b5f564	b.ne 0x00b5f658
00b5f568	ldr w2,[x19, #0x30]
00b5f56c	sub x0,x29,#0x68
00b5f570	mov w1,#0xffffffff
00b5f574	bl 0x00c41030
00b5f578	cmp w0,#0x0
00b5f57c	b.le 0x00b5f694
00b5f580	sub x0,x29,#0x68
00b5f584	bl 0x00c34360
00b5f588	cbz w0,0x00b5f7ac
00b5f58c	sub x0,x29,#0x68
00b5f590	sub x1,x29,#0x28
00b5f594	bl 0x00c34370
00b5f598	sub x0,x29,#0x68
00b5f59c	bl 0x00c36c50
00b5f5a0	mov x22,x0
00b5f5a4	b 0x00b5f7b0
00b5f5a8	bl 0x00c342a0
00b5f5ac	adrp x0,0x2a3000
00b5f5b0	adrp x2,0x2bc000
00b5f5b4	add x0,x0,#0x265
00b5f5b8	add x2,x2,#0xa45
00b5f5bc	mov w1,#0xe9
00b5f5c0	bl 0x00c342b0
00b5f5c4	mov w8,#0x103
00b5f5c8	movk w8,#0xc, LSL #16
00b5f5cc	sub w1,w8,#0x3
00b5f5d0	mov w0,#0x39
00b5f5d4	mov x2,xzr
00b5f5d8	bl 0x00c342c0
00b5f5dc	mov w8,wzr
00b5f5e0	b 0x00b5f95c
00b5f5e4	ldr w22,[x19, #0xb0]
00b5f5e8	cmn w22,#0x1
00b5f5ec	b.eq 0x00b5f6c8
00b5f5f0	add w8,w22,#0x3
00b5f5f4	cmp w8,#0x1
00b5f5f8	b.hi 0x00b5f6d4
00b5f5fc	ldr x0,[x19, #0x10]
00b5f600	bl 0x00c3fab0
00b5f604	ldr x8,[x19, #0x20]
00b5f608	mov w22,w0
00b5f60c	mov x0,x8
00b5f610	bl 0x00c34c20
00b5f614	ldr x8,[x19, #0x10]
00b5f618	sub w22,w22,w0
00b5f61c	mov x0,x8
00b5f620	bl 0x00c3fdc0
00b5f624	and w8,w0,#0x7
00b5f628	cmp w8,#0x1
00b5f62c	orr w8,wzr,#0xfffffffd
00b5f630	cinc w8,w8,ne
00b5f634	add w22,w22,w8
00b5f638	tbz w22,#0x1f,0x00b5f6d8
00b5f63c	bl 0x00c342a0
00b5f640	adrp x0,0x2a3000
00b5f644	adrp x2,0x2c4000
00b5f648	add x0,x0,#0x265
00b5f64c	add x2,x2,#0x762
00b5f650	mov w1,#0xd2
00b5f654	b 0x00b5f794
00b5f658	bl 0x00c342a0
00b5f65c	adrp x0,0x2a3000
00b5f660	adrp x2,0x2bc000
00b5f664	add x0,x0,#0x265
00b5f668	add x2,x2,#0xa45
00b5f66c	mov w1,#0x10d
00b5f670	bl 0x00c342b0
00b5f674	ldr w3,[x19, #0x68]
00b5f678	adrp x2,0x2b8000
00b5f67c	add x2,x2,#0xb78
00b5f680	mov w1,#0x10c
00b5f684	mov w0,#0x39
00b5f688	movk w1,#0x8, LSL #16
00b5f68c	bl 0x00c342c0
00b5f690	b 0x00b5f7ac
00b5f694	mov w22,w0
00b5f698	bl 0x00c342a0
00b5f69c	adrp x0,0x2a3000
00b5f6a0	adrp x2,0x2bc000
00b5f6a4	add x0,x0,#0x265
00b5f6a8	add x2,x2,#0xa45
00b5f6ac	cbz w22,0x00b5f790
00b5f6b0	orr w1,wzr,#0xf8
00b5f6b4	bl 0x00c342b0
00b5f6b8	ldr w3,[x19, #0x30]
00b5f6bc	adrp x2,0x2b8000
00b5f6c0	add x2,x2,#0xb53
00b5f6c4	b 0x00b5f680
00b5f6c8	ldr x0,[x19, #0x20]
00b5f6cc	bl 0x00c34c20
00b5f6d0	mov w22,w0
00b5f6d4	tbnz w22,#0x1f,0x00b5f63c
00b5f6d8	ldr w8,[x19, #0xb4]
00b5f6dc	cmp w22,w8
00b5f6e0	b.ge 0x00b5f720
00b5f6e4	bl 0x00c342a0
00b5f6e8	adrp x0,0x2a3000
00b5f6ec	adrp x2,0x2c4000
00b5f6f0	add x0,x0,#0x265
00b5f6f4	add x2,x2,#0x762
00b5f6f8	mov w1,#0xd5
00b5f6fc	bl 0x00c342b0
00b5f700	ldr w3,[x19, #0xb4]
00b5f704	adrp x2,0x2a3000
00b5f708	add x2,x2,#0x293
00b5f70c	mov w0,#0x39
00b5f710	mov w1,#0xac
00b5f714	mov w4,w22
00b5f718	bl 0x00c342c0
00b5f71c	b 0x00b5f7ac
00b5f720	add x0,sp,#0x80
00b5f724	bl 0x00c3fbb0
00b5f728	cbz w0,0x00b5f774
00b5f72c	ldr w1,[x19, #0x30]
00b5f730	add x0,sp,#0x80
00b5f734	bl 0x00c3fbc0
00b5f738	cbz w0,0x00b5f774
00b5f73c	ldr w1,[x19, #0x78]
00b5f740	add x0,sp,#0x80
00b5f744	bl 0x00c3fbd0
00b5f748	cbz w0,0x00b5f774
00b5f74c	add x0,sp,#0x80
00b5f750	mov w1,w22
00b5f754	bl 0x00c3fbe0
00b5f758	cbz w0,0x00b5f774
00b5f75c	sub x0,x29,#0x68
00b5f760	mov w1,#0xffffffff
00b5f764	mov w2,#0x1000
00b5f768	add x3,sp,#0x80
00b5f76c	bl 0x00c41870
00b5f770	cbnz w0,0x00b5f580
00b5f774	bl 0x00c342a0
00b5f778	adrp x0,0x2a3000
00b5f77c	adrp x2,0x2bc000
00b5f780	add x0,x0,#0x265
00b5f784	add x2,x2,#0xa45
00b5f788	mov w1,#0x108
00b5f78c	b 0x00b5f794
00b5f790	mov w1,#0xf5
00b5f794	bl 0x00c342b0
00b5f798	mov w1,#0x103
00b5f79c	mov w0,#0x39
00b5f7a0	movk w1,#0xc, LSL #16
00b5f7a4	mov x2,xzr
00b5f7a8	bl 0x00c342c0
00b5f7ac	mov x22,xzr
00b5f7b0	sub x0,x29,#0x68
00b5f7b4	bl 0x00c34340
00b5f7b8	cbz x22,0x00b5f958
00b5f7bc	ldur x2,[x29, #-0x28]
00b5f7c0	mov x0,x21
00b5f7c4	mov x1,x22
00b5f7c8	bl 0x00c3dab0
00b5f7cc	cbz w0,0x00b5f958
00b5f7d0	adrp x1,0x2d1000
00b5f7d4	add x1,x1,#0xaa2
00b5f7d8	mov x0,x20
00b5f7dc	bl 0x00c3e8c0
00b5f7e0	cbz x0,0x00b5f85c
00b5f7e4	ldr w8,[x0, #0x8]
00b5f7e8	cmp w8,#0x1
00b5f7ec	b.eq 0x00b5f850
00b5f7f0	cmp w8,#0x4
00b5f7f4	mov w8,wzr
00b5f7f8	b.ne 0x00b5f95c
00b5f7fc	ldr w8,[x19, #0x68]
00b5f800	sub w8,w8,#0x1
00b5f804	cmp w8,#0x6
00b5f808	b.cs 0x00b5f81c
00b5f80c	and x9,x8,#0xff
00b5f810	mov w10,#0x35
00b5f814	lsr w9,w10,w9
00b5f818	tbnz w9,#0x0,0x00b5f908
00b5f81c	bl 0x00c342a0
00b5f820	adrp x0,0x2a3000
00b5f824	adrp x2,0x2b2000
00b5f828	add x0,x0,#0x265
00b5f82c	add x2,x2,#0xee8
00b5f830	mov w1,#0x438
00b5f834	bl 0x00c342b0
00b5f838	mov w1,#0x103
00b5f83c	mov w0,#0x39
00b5f840	movk w1,#0xc, LSL #16
00b5f844	mov x2,xzr
00b5f848	bl 0x00c342c0
00b5f84c	b 0x00b5f85c
00b5f850	ldr w1,[x19, #0x68]
00b5f854	bl 0x00c3da90
00b5f858	cbz w0,0x00b5f958
00b5f85c	adrp x1,0x29d000
00b5f860	add x1,x1,#0xe2e
00b5f864	mov x0,x20
00b5f868	bl 0x00c3e8c0
00b5f86c	cbz x0,0x00b5f87c
00b5f870	add x1,x19,#0x34
00b5f874	bl 0x00c3dad0
00b5f878	cbz w0,0x00b5f958
00b5f87c	adrp x1,0x29e000
00b5f880	add x1,x1,#0x202
00b5f884	mov x0,x20
00b5f888	bl 0x00c3e8c0
00b5f88c	cbz x0,0x00b5f89c
00b5f890	add x1,x19,#0x7c
00b5f894	bl 0x00c3dad0
00b5f898	cbz w0,0x00b5f958
00b5f89c	adrp x1,0x2a2000
00b5f8a0	add x1,x1,#0x40c
00b5f8a4	mov x0,x20
00b5f8a8	bl 0x00c3e8c0
00b5f8ac	cbz x0,0x00b5f950
00b5f8b0	ldr w8,[x0, #0x8]
00b5f8b4	mov x20,x0
00b5f8b8	cmp w8,#0x4
00b5f8bc	b.eq 0x00b5f8dc
00b5f8c0	cmp w8,#0x1
00b5f8c4	b.ne 0x00b5f950
00b5f8c8	ldr w1,[x19, #0xb0]
00b5f8cc	mov x0,x20
00b5f8d0	bl 0x00c3da90
00b5f8d4	cbnz w0,0x00b5f950
00b5f8d8	b 0x00b5f958
00b5f8dc	ldr w3,[x19, #0xb0]
00b5f8e0	cmn w3,#0x4
00b5f8e4	b.ls 0x00b5f930
00b5f8e8	adrp x9,0xca5000
00b5f8ec	add w8,w3,#0x3
00b5f8f0	add x9,x9,#0xd50
00b5f8f4	ldr x1,[x9, w8, SXTW #0x3]
00b5f8f8	mov x0,x20
00b5f8fc	bl 0x00c3dad0
00b5f900	cbnz w0,0x00b5f950
00b5f904	b 0x00b5f958
00b5f908	adrp x9,0x77c000
00b5f90c	add x9,x9,#0x2d0
00b5f910	ldr x8,[x9, w8, SXTW #0x3]
00b5f914	adrp x9,0xca5000
00b5f918	add x9,x9,#0xa30
00b5f91c	add x8,x9,x8, LSL #0x4
00b5f920	ldr x1,[x8, #0x8]
00b5f924	bl 0x00c3dad0
00b5f928	cbnz w0,0x00b5f85c
00b5f92c	b 0x00b5f958
00b5f930	ldp x0,x1,[x20, #0x10]
00b5f934	adrp x2,0x2c6000
00b5f938	add x2,x2,#0xd41
00b5f93c	bl 0x00c34d30
00b5f940	cmp w0,#0x1
00b5f944	b.lt 0x00b5f958
00b5f948	sxtw x8,w0
00b5f94c	str x8,[x20, #0x20]
00b5f950	mov w8,#0x1
00b5f954	b 0x00b5f95c
00b5f958	mov w8,wzr
00b5f95c	ldp x29,x30,[sp, #0x100]
00b5f960	ldp x20,x19,[sp, #0xf0]
00b5f964	ldp x22,x21,[sp, #0xe0]
00b5f968	ldr x28,[sp, #0xd0]
00b5f96c	mov w0,w8
00b5f970	add sp,sp,#0x110
00b5f974	ret

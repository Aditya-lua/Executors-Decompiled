; ossl_rsa_ctx_to_pss_string @ 00acd790
00acd790	sub sp,sp,#0x40
00acd794	stp x20,x19,[sp, #0x20]
00acd798	stp x29,x30,[sp, #0x30]
00acd79c	add x29,sp,#0x30
00acd7a0	mov x20,x0
00acd7a4	bl 0x00c39b60
00acd7a8	mov x19,x0
00acd7ac	add x1,sp,#0x18
00acd7b0	mov x0,x20
00acd7b4	bl 0x00c3dc30
00acd7b8	cmp w0,#0x1
00acd7bc	b.lt 0x00acd848
00acd7c0	add x1,sp,#0x10
00acd7c4	mov x0,x20
00acd7c8	bl 0x00c3fa00
00acd7cc	cmp w0,#0x1
00acd7d0	b.lt 0x00acd848
00acd7d4	add x1,sp,#0xc
00acd7d8	mov x0,x20
00acd7dc	bl 0x00c3fa20
00acd7e0	cmp w0,#0x1
00acd7e4	b.lt 0x00acd848
00acd7e8	ldr w2,[sp, #0xc]
00acd7ec	cmn w2,#0x1
00acd7f0	b.eq 0x00acd874
00acd7f4	add w8,w2,#0x3
00acd7f8	cmp w8,#0x1
00acd7fc	b.hi 0x00acd884
00acd800	mov x0,x19
00acd804	bl 0x00c36440
00acd808	ldr x8,[sp, #0x18]
00acd80c	mov w20,w0
00acd810	mov x0,x8
00acd814	bl 0x00c34c20
00acd818	sub w8,w20,#0x2
00acd81c	sub w8,w8,w0
00acd820	mov x0,x19
00acd824	str w8,[sp, #0xc]
00acd828	bl 0x00c32480
00acd82c	ldr w2,[sp, #0xc]
00acd830	and w8,w0,#0x7
00acd834	cmp w8,#0x1
00acd838	b.ne 0x00acd844
00acd83c	sub w2,w2,#0x1
00acd840	str w2,[sp, #0xc]
00acd844	tbz w2,#0x1f,0x00acd884
00acd848	mov x19,xzr
00acd84c	cbz x19,0x00acd894
00acd850	bl 0x00c3fa50
00acd854	mov x1,x0
00acd858	mov x0,x19
00acd85c	mov x2,xzr
00acd860	bl 0x00c37a90
00acd864	mov x20,x0
00acd868	mov x0,x19
00acd86c	bl 0x00c3fa40
00acd870	b 0x00acd898
00acd874	ldr x0,[sp, #0x18]
00acd878	bl 0x00c34c20
00acd87c	mov w2,w0
00acd880	str w0,[sp, #0xc]
00acd884	ldp x1,x0,[sp, #0x10]
00acd888	bl 0x00acd6f0
00acd88c	mov x19,x0
00acd890	cbnz x19,0x00acd850
00acd894	mov x20,xzr
00acd898	mov x0,x20
00acd89c	ldp x29,x30,[sp, #0x30]
00acd8a0	ldp x20,x19,[sp, #0x20]
00acd8a4	add sp,sp,#0x40
00acd8a8	ret

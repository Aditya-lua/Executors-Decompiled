; OBJ_obj2txt @ 00aae610
00aae610	sub sp,sp,#0x90
00aae614	stp x24,x23,[sp, #0x50]
00aae618	stp x20,x19,[sp, #0x70]
00aae61c	mov x23,x2
00aae620	mov w20,w1
00aae624	mov x19,x0
00aae628	stp x28,x27,[sp, #0x30]
00aae62c	stp x26,x25,[sp, #0x40]
00aae630	stp x22,x21,[sp, #0x60]
00aae634	stp x29,x30,[sp, #0x80]
00aae638	add x29,sp,#0x80
00aae63c	cbz x0,0x00aae64c
00aae640	cmp w20,#0x1
00aae644	b.lt 0x00aae64c
00aae648	strb wzr,[x19]
00aae64c	cbz x23,0x00aae67c
00aae650	ldr x8,[x23, #0x18]
00aae654	cbz x8,0x00aae67c
00aae658	cbz w3,0x00aae8e4
00aae65c	ldr w28,[x23, #0x14]
00aae660	mov x21,xzr
00aae664	cmp w28,#0x24a
00aae668	b.le 0x00aae6a4
00aae66c	mov x0,x21
00aae670	bl 0x00c36290
00aae674	mov w22,#0xffffffff
00aae678	b 0x00aae680
00aae67c	mov w22,wzr
00aae680	mov w0,w22
00aae684	ldp x29,x30,[sp, #0x80]
00aae688	ldp x20,x19,[sp, #0x70]
00aae68c	ldp x22,x21,[sp, #0x60]
00aae690	ldp x24,x23,[sp, #0x50]
00aae694	ldp x26,x25,[sp, #0x40]
00aae698	ldp x28,x27,[sp, #0x30]
00aae69c	add sp,sp,#0x90
00aae6a0	ret
00aae6a4	cmp w28,#0x1
00aae6a8	b.lt 0x00aae934
00aae6ac	ldr x23,[x23, #0x18]
00aae6b0	mov x21,xzr
00aae6b4	mov w22,wzr
00aae6b8	mov w27,#0x1
00aae6bc	ldrsb w8,[x23]
00aae6c0	subs w28,w28,#0x1
00aae6c4	b.ne 0x00aae6cc
00aae6c8	tbnz w8,#0x1f,0x00aae66c
00aae6cc	mov x25,xzr
00aae6d0	mov w26,wzr
00aae6d4	lsr w24,w8,#0x1f
00aae6d8	add x23,x23,#0x1
00aae6dc	and x1,x8,#0x7f
00aae6e0	cbz w26,0x00aae758
00aae6e4	mov x0,x21
00aae6e8	bl 0x00c376e0
00aae6ec	cbz w0,0x00aae66c
00aae6f0	tbz w24,#0x0,0x00aae76c
00aae6f4	cbnz w26,0x00aae728
00aae6f8	lsr x8,x25,#0x39
00aae6fc	cbz x8,0x00aae728
00aae700	cbnz x21,0x00aae710
00aae704	bl 0x00c37710
00aae708	mov x21,x0
00aae70c	cbz x0,0x00aae66c
00aae710	mov x0,x21
00aae714	mov x1,x25
00aae718	bl 0x00c37720
00aae71c	cbz w0,0x00aae66c
00aae720	mov w26,#0x1
00aae724	b 0x00aae72c
00aae728	cbz w26,0x00aae764
00aae72c	orr w2,wzr,#0x7
00aae730	mov x0,x21
00aae734	mov x1,x21
00aae738	bl 0x00c38fc0
00aae73c	cbz w0,0x00aae66c
00aae740	ldrsb w8,[x23], #0x1
00aae744	subs w28,w28,#0x1
00aae748	lsr w24,w8,#0x1f
00aae74c	b.ne 0x00aae6dc
00aae750	tbz w8,#0x1f,0x00aae6dc
00aae754	b 0x00aae66c
00aae758	orr x25,x25,x1
00aae75c	tbnz w24,#0x0,0x00aae6f4
00aae760	b 0x00aae76c
00aae764	lsl x25,x25,#0x7
00aae768	b 0x00aae740
00aae76c	cbz w27,0x00aae7f0
00aae770	subs x9,x25,#0x50
00aae774	b.cc 0x00aae79c
00aae778	cbz w26,0x00aae7c8
00aae77c	mov w1,#0x50
00aae780	mov x0,x21
00aae784	bl 0x00c38fd0
00aae788	cbz w0,0x00aae66c
00aae78c	mov w8,#0x2
00aae790	cmp w20,#0x2
00aae794	b.ge 0x00aae7d8
00aae798	b 0x00aae7ec
00aae79c	mov w9,#0xcccd
00aae7a0	and w8,w25,#0xff
00aae7a4	movk w9,#0xcccc, LSL #16
00aae7a8	umull x8,w8,w9
00aae7ac	lsr x8,x8,#0x25
00aae7b0	add w9,w8,w8, LSL #0x2
00aae7b4	lsl x9,x9,#0x23
00aae7b8	sub x25,x25,x9, LSR #0x20
00aae7bc	cmp w20,#0x2
00aae7c0	b.ge 0x00aae7d8
00aae7c4	b 0x00aae7ec
00aae7c8	mov w8,#0x2
00aae7cc	mov x25,x9
00aae7d0	cmp w20,#0x2
00aae7d4	b.lt 0x00aae7ec
00aae7d8	cbz x19,0x00aae7ec
00aae7dc	orr w8,w8,#0x30
00aae7e0	strb w8,[x19], #0x1
00aae7e4	sub w20,w20,#0x1
00aae7e8	strb wzr,[x19]
00aae7ec	add w22,w22,#0x1
00aae7f0	cbz w26,0x00aae84c
00aae7f4	mov x0,x21
00aae7f8	bl 0x00c389e0
00aae7fc	cbz x0,0x00aae66c
00aae800	mov x25,x0
00aae804	bl 0x00c2ff50
00aae808	mov x26,x0
00aae80c	cbz x19,0x00aae8ac
00aae810	cmp w20,#0x2
00aae814	b.lt 0x00aae824
00aae818	mov w8,#0x2e
00aae81c	strh w8,[x19], #0x1
00aae820	sub w20,w20,#0x1
00aae824	sxtw x27,w20
00aae828	mov x0,x19
00aae82c	mov x1,x25
00aae830	mov x2,x27
00aae834	bl 0x00c387f0
00aae838	cmp w20,w26
00aae83c	b.ge 0x00aae8a4
00aae840	mov w20,wzr
00aae844	add x19,x19,x27
00aae848	b 0x00aae8ac
00aae84c	adrp x2,0x2a8000
00aae850	mov x0,sp
00aae854	mov w1,#0x25
00aae858	add x2,x2,#0x3cc
00aae85c	mov x3,x25
00aae860	bl 0x00c34d30
00aae864	mov x0,sp
00aae868	bl 0x00c2ff50
00aae86c	cmp w20,#0x1
00aae870	mov x25,x0
00aae874	b.lt 0x00aae8d0
00aae878	cbz x19,0x00aae8d0
00aae87c	sxtw x26,w20
00aae880	mov x1,sp
00aae884	mov x0,x19
00aae888	mov x2,x26
00aae88c	bl 0x00c387f0
00aae890	subs w20,w20,w25
00aae894	b.ge 0x00aae8cc
00aae898	mov w20,wzr
00aae89c	add x19,x19,x26
00aae8a0	b 0x00aae8d0
00aae8a4	add x19,x19,w26, SXTW 
00aae8a8	sub w20,w27,w26
00aae8ac	adrp x1,0x2d8000
00aae8b0	add w8,w22,w26
00aae8b4	mov w2,#0x21a
00aae8b8	mov x0,x25
00aae8bc	add x1,x1,#0x291
00aae8c0	add w22,w8,#0x1
00aae8c4	bl 0x00c32310
00aae8c8	b 0x00aae8d4
00aae8cc	add x19,x19,w25, SXTW 
00aae8d0	add w22,w22,w25
00aae8d4	cmp w28,#0x0
00aae8d8	mov w27,wzr
00aae8dc	b.gt 0x00aae6bc
00aae8e0	b 0x00aae93c
00aae8e4	str x23,[sp, #0x28]
00aae8e8	ldr w21,[x23, #0x10]
00aae8ec	cbz w21,0x00aae948
00aae8f0	mov w0,w21
00aae8f4	bl 0x00aae09c
00aae8f8	mov x22,x0
00aae8fc	cbnz x0,0x00aae910
00aae900	mov w0,w21
00aae904	bl 0x00aadfa0
00aae908	mov x22,x0
00aae90c	cbz x0,0x00aae65c
00aae910	cbz x19,0x00aae924
00aae914	sxtw x2,w20
00aae918	mov x0,x19
00aae91c	mov x1,x22
00aae920	bl 0x00c387f0
00aae924	mov x0,x22
00aae928	bl 0x00c2ff50
00aae92c	mov x22,x0
00aae930	b 0x00aae680
00aae934	mov w22,wzr
00aae938	mov x21,xzr
00aae93c	mov x0,x21
00aae940	bl 0x00c36290
00aae944	b 0x00aae680
00aae948	ldr w8,[x23, #0x14]
00aae94c	cbz w8,0x00aae65c
00aae950	mov w0,#0x40
00aae954	mov x1,xzr
00aae958	bl 0x00c35500
00aae95c	adrp x8,0xd22000
00aae960	ldr x0,[x8, #0x188]
00aae964	cbz x0,0x00aae98c
00aae968	mov x1,sp
00aae96c	str wzr,[sp]
00aae970	str x23,[sp, #0x8]
00aae974	bl 0x00c34de0
00aae978	cbz x0,0x00aae98c
00aae97c	ldr x8,[x0, #0x8]
00aae980	ldr w21,[x8, #0x10]!
00aae984	cbnz w21,0x00aae8f0
00aae988	b 0x00aae65c
00aae98c	adrp x1,0x76e000
00aae990	adrp x4,0xaaf000
00aae994	add x1,x1,#0xa44
00aae998	add x4,x4,#0x34
00aae99c	add x0,sp,#0x28
00aae9a0	mov w2,#0x456
00aae9a4	mov w3,#0x4
00aae9a8	mov w5,wzr
00aae9ac	bl 0x00c3de50
00aae9b0	cbz x0,0x00aae65c
00aae9b4	ldr w8,[x0]
00aae9b8	adrp x10,0xc6d000
00aae9bc	mov w9,#0x28
00aae9c0	add x10,x10,#0xa58
00aae9c4	madd x8,x8,x9,x10
00aae9c8	ldr w21,[x8, #0x10]!
00aae9cc	cbnz w21,0x00aae8f0
00aae9d0	b 0x00aae65c

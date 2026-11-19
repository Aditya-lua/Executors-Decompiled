; FUN_00b923c4 @ 00b923c4
00b923c4	stp x28,x27,[sp, #-0x60]!
00b923c8	stp x26,x25,[sp, #0x10]
00b923cc	stp x24,x23,[sp, #0x20]
00b923d0	stp x22,x21,[sp, #0x30]
00b923d4	stp x20,x19,[sp, #0x40]
00b923d8	stp x29,x30,[sp, #0x50]
00b923dc	add x29,sp,#0x50
00b923e0	sub sp,sp,#0x210
00b923e4	mrs x21,tpidr_el0
00b923e8	ldr x8,[x21, #0x28]
00b923ec	mov x19,x1
00b923f0	mov x1,x2
00b923f4	mov x22,x5
00b923f8	mov x24,x4
00b923fc	mov x25,x3
00b92400	mov x23,x2
00b92404	mov x20,x0
00b92408	stur x8,[x29, #-0x60]
00b9240c	bl 0x00c42610
00b92410	mov w28,w0
00b92414	cbnz w0,0x00b9242c
00b92418	mov x0,x20
00b9241c	mov x1,x25
00b92420	bl 0x00c42620
00b92424	mov w28,w0
00b92428	cbz w0,0x00b92460
00b9242c	ldr x8,[x21, #0x28]
00b92430	ldur x9,[x29, #-0x60]
00b92434	cmp x8,x9
00b92438	b.ne 0x00b935e0
00b9243c	mov w0,w28
00b92440	add sp,sp,#0x210
00b92444	ldp x29,x30,[sp, #0x50]
00b92448	ldp x20,x19,[sp, #0x40]
00b9244c	ldp x22,x21,[sp, #0x30]
00b92450	ldp x24,x23,[sp, #0x20]
00b92454	ldp x26,x25,[sp, #0x10]
00b92458	ldp x28,x27,[sp], #0x60
00b9245c	ret
00b92460	ldr x8,[x20, #0x38]
00b92464	cbz x8,0x00b924dc
00b92468	ldr x8,[x20, #0x48]
00b9246c	str x19,[sp, #0x70]
00b92470	cbz x8,0x00b924e4
00b92474	add x26,x25,#0x10
00b92478	add x1,x20,#0x48
00b9247c	mov x0,x26
00b92480	bl 0x00c41b50
00b92484	mov w28,wzr
00b92488	cbnz w0,0x00b924a0
00b9248c	add x1,x20,#0x38
00b92490	mov x0,x25
00b92494	bl 0x00c41b50
00b92498	cmp w0,#0x0
00b9249c	cset w28,eq
00b924a0	ldr x8,[x20, #0x80]
00b924a4	mov w9,#0x4
00b924a8	str x22,[sp, #0x48]
00b924ac	cmp x8,#0x17f
00b924b0	cinc w9,w9,hi
00b924b4	cmp w28,#0x0
00b924b8	cinc w10,w9,ne
00b924bc	cbz w28,0x00b92610
00b924c0	ldr x11,[x20, #0xb0]
00b924c4	add w9,w9,#0x1
00b924c8	cbz x11,0x00b9261c
00b924cc	ldr x11,[x20, #0xb8]
00b924d0	cmp x11,#0x0
00b924d4	cset w11,ne
00b924d8	b 0x00b92620
00b924dc	mov w28,#0xffffb080
00b924e0	b 0x00b9242c
00b924e4	add x0,sp,#0xf8
00b924e8	add x19,sp,#0xf8
00b924ec	bl 0x00c41c00
00b924f0	add x27,x19,#0x10
00b924f4	mov x0,x27
00b924f8	bl 0x00c41c00
00b924fc	mov x28,x24
00b92500	add x24,x19,#0x20
00b92504	mov x0,x24
00b92508	bl 0x00c41c00
00b9250c	add x0,sp,#0xa8
00b92510	bl 0x00c41c00
00b92514	add x19,sp,#0xb8
00b92518	add x0,sp,#0xb8
00b9251c	add x26,x19,#0x10
00b92520	bl 0x00c41c00
00b92524	add x8,x19,#0x20
00b92528	mov x0,x26
00b9252c	str x26,[sp, #0x60]
00b92530	mov x26,x8
00b92534	bl 0x00c41c00
00b92538	mov x0,x26
00b9253c	add x19,x19,#0x30
00b92540	bl 0x00c41c00
00b92544	mov x0,x19
00b92548	bl 0x00c41c00
00b9254c	str x28,[sp, #0x68]
00b92550	cbz x28,0x00b92a00
00b92554	add x0,sp,#0xa8
00b92558	mov x1,x25
00b9255c	str x19,[sp, #0x58]
00b92560	bl 0x00c41b60
00b92564	ldr x19,[sp, #0x70]
00b92568	mov w28,w0
00b9256c	cbnz w0,0x00b934bc
00b92570	add x0,sp,#0xf8
00b92574	mov x1,x25
00b92578	bl 0x00c41b60
00b9257c	mov w28,w0
00b92580	cbnz w0,0x00b934bc
00b92584	add x1,x25,#0x10
00b92588	mov x0,x27
00b9258c	bl 0x00c41b60
00b92590	mov w28,w0
00b92594	cbnz w0,0x00b934bc
00b92598	add x1,x25,#0x20
00b9259c	mov x0,x24
00b925a0	bl 0x00c41b60
00b925a4	mov w28,w0
00b925a8	cbnz w0,0x00b934bc
00b925ac	mov w1,#0x1
00b925b0	mov x0,x19
00b925b4	bl 0x00c41c40
00b925b8	mov w28,w0
00b925bc	cbnz w0,0x00b934bc
00b925c0	add x0,x19,#0x20
00b925c4	mov x1,xzr
00b925c8	str x0,[sp, #0x40]
00b925cc	bl 0x00c41c40
00b925d0	mov w28,w0
00b925d4	cbnz w0,0x00b934bc
00b925d8	add x0,x19,#0x10
00b925dc	bl 0x00c41bb0
00b925e0	add x19,x20,#0x8
00b925e4	add x0,sp,#0xf8
00b925e8	mov x1,x19
00b925ec	bl 0x00c41b50
00b925f0	tbnz w0,#0x1f,0x00b92f28
00b925f4	add x0,sp,#0xf8
00b925f8	add x1,sp,#0xf8
00b925fc	mov x2,x19
00b92600	bl 0x00c41d40
00b92604	mov w28,w0
00b92608	cbz w0,0x00b925e4
00b9260c	b 0x00b934bc
00b92610	and w9,w10,#0xff
00b92614	cmp w9,#0x4
00b92618	b 0x00b92630
00b9261c	mov w11,#0x1
00b92620	and w10,w10,#0xff
00b92624	cmp w10,#0x4
00b92628	b.eq 0x00b92634
00b9262c	tbz w11,#0x0,0x00b92634
00b92630	mov w9,#0x4
00b92634	cmp x8,w9, UXTB 
00b92638	mov w10,#0x2
00b9263c	csel w9,w9,w10,hi
00b92640	and x22,x9,#0xff
00b92644	and w10,w9,#0xff
00b92648	add x8,x8,x22
00b9264c	mov w11,#0x1
00b92650	sub w9,w10,#0x1
00b92654	sub x19,x8,#0x1
00b92658	str x9,[sp, #0x60]
00b9265c	lsl w9,w11,w9
00b92660	udiv x8,x19,x22
00b92664	str x8,[sp, #0x58]
00b92668	str w9,[sp, #0x50]
00b9266c	cbz w28,0x00b92678
00b92670	ldr x27,[x20, #0xb0]
00b92674	cbnz x27,0x00b927a0
00b92678	str x26,[sp, #0x20]
00b9267c	and w26,w9,#0xff
00b92680	orr w1,wzr,#0x30
00b92684	mov x0,x26
00b92688	bl 0x00c30a30
00b9268c	mov x27,x0
00b92690	cbz x0,0x00b929f4
00b92694	str x19,[sp, #0x40]
00b92698	str x24,[sp, #0x68]
00b9269c	mov w19,wzr
00b926a0	orr w24,wzr,#0x30
00b926a4	str w28,[sp, #0x18]
00b926a8	and x8,x19,#0xff
00b926ac	madd x28,x8,x24,x27
00b926b0	mov x0,x28
00b926b4	bl 0x00c41c00
00b926b8	add x0,x28,#0x10
00b926bc	bl 0x00c41c00
00b926c0	add x0,x28,#0x20
00b926c4	bl 0x00c41c00
00b926c8	add w19,w19,#0x1
00b926cc	cmp w26,w19, UXTB 
00b926d0	b.hi 0x00b926a8
00b926d4	movi v0.2D,#0x0
00b926d8	add x8,sp,#0x19
00b926dc	add x19,sp,#0xb8
00b926e0	stur q0,[x8, #0xff]
00b926e4	add x8,sp,#0x9
00b926e8	add x0,sp,#0xb8
00b926ec	str xzr,[sp, #0x128]
00b926f0	stur q0,[x8, #0xff]
00b926f4	stur q0,[sp, #0xf8]
00b926f8	add x24,x19,#0x10
00b926fc	bl 0x00c41c00
00b92700	mov x0,x24
00b92704	add x28,x19,#0x20
00b92708	str x24,[sp, #0x38]
00b9270c	bl 0x00c41c00
00b92710	mov x0,x28
00b92714	add x19,x19,#0x30
00b92718	str x28,[sp, #0x30]
00b9271c	bl 0x00c41c00
00b92720	mov x0,x19
00b92724	str x19,[sp, #0x28]
00b92728	bl 0x00c41c00
00b9272c	mov x0,x27
00b92730	mov x1,x25
00b92734	bl 0x00c41b60
00b92738	mov w28,w0
00b9273c	cbnz w0,0x00b92768
00b92740	ldr x1,[sp, #0x20]
00b92744	add x0,x27,#0x10
00b92748	bl 0x00c41b60
00b9274c	mov w28,w0
00b92750	cbnz w0,0x00b92768
00b92754	add x0,x27,#0x20
00b92758	add x1,x25,#0x20
00b9275c	bl 0x00c41b60
00b92760	mov w28,w0
00b92764	cbz w0,0x00b92ac0
00b92768	add x0,sp,#0xb8
00b9276c	bl 0x00c41bb0
00b92770	ldr x0,[sp, #0x38]
00b92774	bl 0x00c41bb0
00b92778	ldr x0,[sp, #0x30]
00b9277c	bl 0x00c41bb0
00b92780	ldr x0,[sp, #0x28]
00b92784	bl 0x00c41bb0
00b92788	cbnz w28,0x00b92ea0
00b9278c	ldr w8,[sp, #0x18]
00b92790	cbz w8,0x00b92798
00b92794	stp x27,x26,[x20, #0xb0]
00b92798	ldr x24,[sp, #0x68]
00b9279c	ldr x19,[sp, #0x40]
00b927a0	add x0,sp,#0xb8
00b927a4	bl 0x00c41c00
00b927a8	add x0,sp,#0x78
00b927ac	bl 0x00c41c00
00b927b0	add x26,x20,#0x68
00b927b4	mov x0,x26
00b927b8	mov x1,xzr
00b927bc	bl 0x00c41be0
00b927c0	cmp w0,#0x1
00b927c4	b.ne 0x00b929e8
00b927c8	mov x0,x23
00b927cc	mov x1,xzr
00b927d0	str x24,[sp, #0x68]
00b927d4	bl 0x00c41be0
00b927d8	str w0,[sp, #0x30]
00b927dc	cmp w0,#0x0
00b927e0	add x0,sp,#0xb8
00b927e4	mov x1,x23
00b927e8	cset w24,eq
00b927ec	bl 0x00c41b60
00b927f0	ldr x25,[sp, #0x58]
00b927f4	mov w28,w0
00b927f8	cbnz w0,0x00b928ec
00b927fc	add x0,sp,#0x78
00b92800	mov x1,x26
00b92804	mov x2,x23
00b92808	bl 0x00c41d60
00b9280c	mov w28,w0
00b92810	cbnz w0,0x00b928ec
00b92814	add x0,sp,#0xb8
00b92818	add x1,sp,#0x78
00b9281c	mov w2,w24
00b92820	bl 0x00c41cd0
00b92824	mov w28,w0
00b92828	cbnz w0,0x00b928ec
00b9282c	add x2,x25,#0x1
00b92830	add x0,sp,#0xf8
00b92834	mov w1,wzr
00b92838	add x23,sp,#0xf8
00b9283c	bl 0x00c301c0
00b92840	cmp x19,x22
00b92844	b.cc 0x00b928ec
00b92848	mov x26,x19
00b9284c	mov x24,xzr
00b92850	mov x19,xzr
00b92854	madd x1,x19,x25,x24
00b92858	add x0,sp,#0xb8
00b9285c	bl 0x00c41be0
00b92860	ldrb w8,[x23, x24]
00b92864	and x9,x19,#0xffffffff
00b92868	add x19,x19,#0x1
00b9286c	lsl w9,w0,w9
00b92870	orr w8,w8,w9
00b92874	cmp x22,x19
00b92878	strb w8,[x23, x24]
00b9287c	b.ne 0x00b92854
00b92880	add x24,x24,#0x1
00b92884	cmp x24,x25
00b92888	b.ne 0x00b92850
00b9288c	ldrb w9,[sp, #0xf8]
00b92890	mov x11,xzr
00b92894	mov w8,wzr
00b92898	add x10,sp,#0xf8
00b9289c	mov x19,x26
00b928a0	add x12,x10,x11
00b928a4	ldrb w13,[x12, #0x1]
00b928a8	add x14,x11,#0x2
00b928ac	cmp x14,x25
00b928b0	mov w28,wzr
00b928b4	and w14,w13,w8
00b928b8	eor w15,w13,w8
00b928bc	eon w8,w13,w8
00b928c0	and w8,w8,#0x1
00b928c4	mul w13,w8,w9
00b928c8	orr w9,w9,w8, LSL #0x7
00b928cc	and w8,w13,w15
00b928d0	eor w13,w13,w15
00b928d4	add x11,x11,#0x1
00b928d8	orr w8,w8,w14
00b928dc	strb w9,[x12]
00b928e0	mov w9,w13
00b928e4	strb w13,[x12, #0x1]
00b928e8	b.ls 0x00b928a0
00b928ec	add x0,sp,#0x78
00b928f0	str x19,[sp, #0x40]
00b928f4	add x19,sp,#0x78
00b928f8	bl 0x00c41bb0
00b928fc	add x0,sp,#0xb8
00b92900	add x23,sp,#0xb8
00b92904	bl 0x00c41bb0
00b92908	cbnz w28,0x00b92ea0
00b9290c	ldr w8,[sp, #0x50]
00b92910	add x0,sp,#0x78
00b92914	and w24,w8,#0xff
00b92918	bl 0x00c41c00
00b9291c	add x0,x19,#0x10
00b92920	str x0,[sp, #0x28]
00b92924	bl 0x00c41c00
00b92928	add x0,x19,#0x20
00b9292c	str x0,[sp, #0x20]
00b92930	bl 0x00c41c00
00b92934	add x0,sp,#0xb8
00b92938	add x26,x23,#0x10
00b9293c	bl 0x00c41c00
00b92940	mov x0,x26
00b92944	add x19,x23,#0x20
00b92948	bl 0x00c41c00
00b9294c	mov x0,x19
00b92950	add x23,x23,#0x30
00b92954	str x19,[sp, #0x18]
00b92958	bl 0x00c41c00
00b9295c	mov x0,x23
00b92960	bl 0x00c41c00
00b92964	add x8,sp,#0xf8
00b92968	ldrb w8,[x8, x25]
00b9296c	str x24,[sp, #0x38]
00b92970	str w8,[sp, #0x4]
00b92974	cbz w24,0x00b92a10
00b92978	stp x23,x26,[sp, #0x8]
00b9297c	ubfx w23,w8,#0x1,#0x6
00b92980	ldr x8,[sp, #0x70]
00b92984	mov x26,xzr
00b92988	mov x24,x27
00b9298c	add x19,x8,#0x10
00b92990	ldr x0,[sp, #0x70]
00b92994	cmp x23,x26
00b92998	cset w25,eq
00b9299c	mov x1,x24
00b929a0	mov w2,w25
00b929a4	bl 0x00c41cd0
00b929a8	mov w28,w0
00b929ac	cbnz w0,0x00b92dc4
00b929b0	add x1,x24,#0x10
00b929b4	mov x0,x19
00b929b8	mov w2,w25
00b929bc	bl 0x00c41cd0
00b929c0	mov w28,w0
00b929c4	cbnz w0,0x00b92dc4
00b929c8	ldr x8,[sp, #0x38]
00b929cc	add x26,x26,#0x1
00b929d0	add x24,x24,#0x30
00b929d4	cmp x26,x8
00b929d8	b.cc 0x00b92990
00b929dc	ldr x25,[sp, #0x58]
00b929e0	ldp x23,x26,[sp, #0x8]
00b929e4	b 0x00b92a18
00b929e8	mov w28,#0xffffb080
00b929ec	cbnz x27,0x00b92ea4
00b929f0	b 0x00b92f00
00b929f4	mov w28,#0xffffb280
00b929f8	cbnz x27,0x00b92ea4
00b929fc	b 0x00b92f00
00b92a00	mov w28,#0xffffb080
00b92a04	ldr x24,[sp, #0x68]
00b92a08	cbnz w28,0x00b9242c
00b92a0c	b 0x00b93504
00b92a10	ldr x8,[sp, #0x70]
00b92a14	add x19,x8,#0x10
00b92a18	add x0,sp,#0xa8
00b92a1c	bl 0x00c41c00
00b92a20	mov x0,x19
00b92a24	mov x1,xzr
00b92a28	bl 0x00c41b40
00b92a2c	mov w24,w0
00b92a30	add x1,x20,#0x8
00b92a34	add x0,sp,#0xa8
00b92a38	mov x2,x19
00b92a3c	str x1,[sp, #0x38]
00b92a40	bl 0x00c41d60
00b92a44	mov w28,w0
00b92a48	cbnz w0,0x00b92a6c
00b92a4c	ldr w9,[sp, #0x4]
00b92a50	cmp w24,#0x0
00b92a54	cset w8,ne
00b92a58	add x1,sp,#0xa8
00b92a5c	and w2,w8,w9, LSR #0x7
00b92a60	mov x0,x19
00b92a64	bl 0x00c41cd0
00b92a68	mov w28,w0
00b92a6c	add x0,sp,#0xa8
00b92a70	bl 0x00c41bb0
00b92a74	cbnz w28,0x00b92dc8
00b92a78	ldr x8,[sp, #0x70]
00b92a7c	mov w1,#0x1
00b92a80	add x0,x8,#0x20
00b92a84	bl 0x00c41c40
00b92a88	mov w28,w0
00b92a8c	cbnz w0,0x00b92dc8
00b92a90	ldr x2,[sp, #0x68]
00b92a94	cbz x2,0x00b92c7c
00b92a98	ldr x1,[sp, #0x70]
00b92a9c	ldr x3,[sp, #0x48]
00b92aa0	mov x0,x20
00b92aa4	bl 0x00b95cc4
00b92aa8	ldr x8,[sp, #0x40]
00b92aac	mov w28,w0
00b92ab0	cmp x8,x22
00b92ab4	b.cc 0x00b92dc8
00b92ab8	cbz w28,0x00b92c8c
00b92abc	b 0x00b92dc8
00b92ac0	ldp x10,x8,[sp, #0x58]
00b92ac4	sxtw x8,w8
00b92ac8	mul x19,x10,x8
00b92acc	cbz x19,0x00b92b8c
00b92ad0	mov x24,xzr
00b92ad4	orr w12,wzr,#0x30
00b92ad8	str x19,[sp, #0x10]
00b92adc	udiv x8,x24,x10
00b92ae0	and x9,x8,#0xffffffff
00b92ae4	mov w11,#0x1
00b92ae8	lsl w9,w11,w9
00b92aec	and w25,w9,#0xff
00b92af0	msub x8,x8,x10,x24
00b92af4	umaddl x2,w25,w12,x27
00b92af8	cbnz x8,0x00b92b60
00b92afc	ubfx x19,x25,#0x1,#0x1f
00b92b00	umaddl x1,w19,w12,x27
00b92b04	mov x0,x2
00b92b08	str x2,[sp, #0x20]
00b92b0c	bl 0x00c41b60
00b92b10	mov w28,w0
00b92b14	cbnz w0,0x00b92768
00b92b18	orr w9,wzr,#0x30
00b92b1c	madd x8,x25,x9,x27
00b92b20	madd x9,x19,x9,x27
00b92b24	add x0,x8,#0x10
00b92b28	add x1,x9,#0x10
00b92b2c	bl 0x00c41b60
00b92b30	mov w28,w0
00b92b34	cbnz w0,0x00b92768
00b92b38	orr w9,wzr,#0x30
00b92b3c	madd x8,x25,x9,x27
00b92b40	madd x9,x19,x9,x27
00b92b44	add x0,x8,#0x20
00b92b48	add x1,x9,#0x20
00b92b4c	bl 0x00c41b60
00b92b50	ldr x19,[sp, #0x10]
00b92b54	ldr x2,[sp, #0x20]
00b92b58	mov w28,w0
00b92b5c	cbnz w0,0x00b92768
00b92b60	add x3,sp,#0xb8
00b92b64	mov x0,x20
00b92b68	mov x1,x2
00b92b6c	bl 0x00b954dc
00b92b70	mov w28,w0
00b92b74	cbnz w0,0x00b92768
00b92b78	ldr x10,[sp, #0x58]
00b92b7c	add x24,x24,#0x1
00b92b80	cmp x24,x19
00b92b84	orr w12,wzr,#0x30
00b92b88	b.cc 0x00b92adc
00b92b8c	cmp w26,#0x2
00b92b90	mov x2,xzr
00b92b94	b.cc 0x00b92bc4
00b92b98	mov x9,xzr
00b92b9c	mov w8,#0x1
00b92ba0	orr w10,wzr,#0x30
00b92ba4	add x11,sp,#0xf8
00b92ba8	umaddl x12,w8,w10,x27
00b92bac	add x2,x9,#0x1
00b92bb0	ubfiz w8,w8,#0x1,#0x7
00b92bb4	cmp w8,w26
00b92bb8	str x12,[x11, x9, LSL #0x3]
00b92bbc	mov x9,x2
00b92bc0	b.cc 0x00b92ba8
00b92bc4	add x1,sp,#0xf8
00b92bc8	mov x0,x20
00b92bcc	bl 0x00b95a00
00b92bd0	mov w28,w0
00b92bd4	cbnz w0,0x00b92768
00b92bd8	cmp w26,#0x2
00b92bdc	mov x2,xzr
00b92be0	b.cc 0x00b93478
00b92be4	sub x10,x27,#0x30
00b92be8	mov w9,#0x1
00b92bec	str x10,[sp, #0x8]
00b92bf0	and x8,x9,#0xff
00b92bf4	str x9,[sp, #0x10]
00b92bf8	add x9,x8,w9, UXTB  #0x1
00b92bfc	orr w11,wzr,#0x60
00b92c00	mvn x25,x8
00b92c04	madd x1,x8,x11,x10
00b92c08	lsl x8,x9,#0x4
00b92c0c	add x9,x27,x8
00b92c10	add x2,x10,x8
00b92c14	str x9,[sp, #0x20]
00b92c18	add x25,x25,#0x1
00b92c1c	cbz x25,0x00b92c4c
00b92c20	ldr x3,[sp, #0x20]
00b92c24	add x4,sp,#0xb8
00b92c28	mov x0,x20
00b92c2c	sub x19,x1,#0x30
00b92c30	sub x24,x2,#0x30
00b92c34	bl 0x00b93970
00b92c38	mov w28,w0
00b92c3c	mov x2,x24
00b92c40	mov x1,x19
00b92c44	cbz w0,0x00b92c18
00b92c48	b 0x00b92768
00b92c4c	ldp x10,x9,[sp, #0x8]
00b92c50	lsl w9,w9,#0x1
00b92c54	and w8,w9,#0xfe
00b92c58	cmp w26,w8
00b92c5c	b.hi 0x00b92bf0
00b92c60	sub x2,x26,#0x1
00b92c64	cmp x2,#0x3
00b92c68	add x8,x27,#0x30
00b92c6c	b.hi 0x00b933d8
00b92c70	mov x9,xzr
00b92c74	mov w10,#0x1
00b92c78	b 0x00b93454
00b92c7c	ldr x8,[sp, #0x40]
00b92c80	mov w28,wzr
00b92c84	cmp x8,x22
00b92c88	b.cc 0x00b92dc8
00b92c8c	ldr w8,[sp, #0x50]
00b92c90	stp x23,x26,[sp, #0x8]
00b92c94	and w22,w8,#0xff
00b92c98	ldr x1,[sp, #0x70]
00b92c9c	add x3,sp,#0xb8
00b92ca0	mov x0,x20
00b92ca4	mov x2,x1
00b92ca8	bl 0x00b954dc
00b92cac	mov w28,w0
00b92cb0	cbnz w0,0x00b92dc4
00b92cb4	sub x25,x25,#0x1
00b92cb8	add x8,sp,#0xf8
00b92cbc	ldrb w19,[x8, x25]
00b92cc0	ldr w8,[sp, #0x50]
00b92cc4	str x25,[sp, #0x58]
00b92cc8	tst w8,#0xff
00b92ccc	b.eq 0x00b92d24
00b92cd0	mov x25,xzr
00b92cd4	ubfx w26,w19,#0x1,#0x6
00b92cd8	mov x23,x27
00b92cdc	cmp x26,x25
00b92ce0	cset w24,eq
00b92ce4	add x0,sp,#0x78
00b92ce8	mov x1,x23
00b92cec	mov w2,w24
00b92cf0	bl 0x00c41cd0
00b92cf4	mov w28,w0
00b92cf8	cbnz w0,0x00b92dc4
00b92cfc	ldr x0,[sp, #0x28]
00b92d00	add x1,x23,#0x10
00b92d04	mov w2,w24
00b92d08	bl 0x00c41cd0
00b92d0c	mov w28,w0
00b92d10	cbnz w0,0x00b92dc4
00b92d14	add x25,x25,#0x1
00b92d18	cmp x25,x22
00b92d1c	add x23,x23,#0x30
00b92d20	b.cc 0x00b92cdc
00b92d24	add x0,sp,#0xa8
00b92d28	bl 0x00c41c00
00b92d2c	ldr x24,[sp, #0x28]
00b92d30	mov x1,xzr
00b92d34	mov x0,x24
00b92d38	bl 0x00c41b40
00b92d3c	ldr x1,[sp, #0x38]
00b92d40	mov w23,w0
00b92d44	add x0,sp,#0xa8
00b92d48	mov x2,x24
00b92d4c	bl 0x00c41d60
00b92d50	mov w28,w0
00b92d54	cbnz w0,0x00b92d74
00b92d58	ldr x0,[sp, #0x28]
00b92d5c	cmp w23,#0x0
00b92d60	cset w8,ne
00b92d64	and w2,w8,w19, LSR #0x7
00b92d68	add x1,sp,#0xa8
00b92d6c	bl 0x00c41cd0
00b92d70	mov w28,w0
00b92d74	add x0,sp,#0xa8
00b92d78	bl 0x00c41bb0
00b92d7c	ldr x25,[sp, #0x58]
00b92d80	ldp x23,x26,[sp, #0x8]
00b92d84	cbnz w28,0x00b92dc8
00b92d88	ldr x0,[sp, #0x20]
00b92d8c	mov w1,#0x1
00b92d90	bl 0x00c41c40
00b92d94	mov w28,w0
00b92d98	cbnz w0,0x00b92dc8
00b92d9c	ldr x1,[sp, #0x70]
00b92da0	add x3,sp,#0x78
00b92da4	add x4,sp,#0xb8
00b92da8	mov x0,x20
00b92dac	mov x2,x1
00b92db0	bl 0x00b93970
00b92db4	mov w28,w0
00b92db8	cbz x25,0x00b92dc8
00b92dbc	cbz w28,0x00b92c98
00b92dc0	b 0x00b92dc8
00b92dc4	ldp x23,x26,[sp, #0x8]
00b92dc8	add x0,sp,#0x78
00b92dcc	bl 0x00c41bb0
00b92dd0	ldr x0,[sp, #0x28]
00b92dd4	bl 0x00c41bb0
00b92dd8	ldr x0,[sp, #0x20]
00b92ddc	bl 0x00c41bb0
00b92de0	add x0,sp,#0xb8
00b92de4	bl 0x00c41bb0
00b92de8	mov x0,x26
00b92dec	bl 0x00c41bb0
00b92df0	ldr x0,[sp, #0x18]
00b92df4	bl 0x00c41bb0
00b92df8	mov x0,x23
00b92dfc	bl 0x00c41bb0
00b92e00	cbnz w28,0x00b92ea0
00b92e04	add x0,sp,#0xb8
00b92e08	bl 0x00c41c00
00b92e0c	ldr x8,[sp, #0x70]
00b92e10	mov x1,xzr
00b92e14	add x23,x8,#0x10
00b92e18	mov x0,x23
00b92e1c	bl 0x00c41b40
00b92e20	mov w24,w0
00b92e24	add x1,x20,#0x8
00b92e28	add x0,sp,#0xb8
00b92e2c	mov x2,x23
00b92e30	bl 0x00c41d60
00b92e34	mov w28,w0
00b92e38	cbnz w0,0x00b92e64
00b92e3c	ldr w8,[sp, #0x30]
00b92e40	add x1,sp,#0xb8
00b92e44	mov x0,x23
00b92e48	cmp w8,#0x0
00b92e4c	cset w8,eq
00b92e50	cmp w24,#0x0
00b92e54	cset w9,ne
00b92e58	and w2,w8,w9
00b92e5c	bl 0x00c41cd0
00b92e60	mov w28,w0
00b92e64	add x0,sp,#0xb8
00b92e68	bl 0x00c41bb0
00b92e6c	cbnz w28,0x00b92ea0
00b92e70	ldr x8,[sp, #0x68]
00b92e74	cbz x8,0x00b92e90
00b92e78	ldp x2,x1,[sp, #0x68]
00b92e7c	ldr x3,[sp, #0x48]
00b92e80	mov x0,x20
00b92e84	bl 0x00b95cc4
00b92e88	mov w28,w0
00b92e8c	cbnz w0,0x00b92ea0
00b92e90	ldr x1,[sp, #0x70]
00b92e94	mov x0,x20
00b92e98	bl 0x00b93e20
00b92e9c	mov w28,w0
00b92ea0	cbz x27,0x00b92f00
00b92ea4	ldr x8,[x20, #0xb0]
00b92ea8	cmp x27,x8
00b92eac	b.eq 0x00b92f00
00b92eb0	ldr x8,[sp, #0x60]
00b92eb4	cmp w8,#0x7
00b92eb8	b.hi 0x00b92ef8
00b92ebc	ldr w8,[sp, #0x50]
00b92ec0	mov w19,wzr
00b92ec4	orr w23,wzr,#0x30
00b92ec8	and w22,w8,#0xff
00b92ecc	and x8,x19,#0xff
00b92ed0	madd x20,x8,x23,x27
00b92ed4	mov x0,x20
00b92ed8	bl 0x00c41bb0
00b92edc	add x0,x20,#0x10
00b92ee0	bl 0x00c41bb0
00b92ee4	add x0,x20,#0x20
00b92ee8	bl 0x00c41bb0
00b92eec	add w19,w19,#0x1
00b92ef0	cmp w22,w19, UXTB 
00b92ef4	b.hi 0x00b92ecc
00b92ef8	mov x0,x27
00b92efc	bl 0x00c30960
00b92f00	ldr x19,[sp, #0x70]
00b92f04	cbz x19,0x00b9242c
00b92f08	cbz w28,0x00b9242c
00b92f0c	mov x0,x19
00b92f10	bl 0x00c41bb0
00b92f14	add x0,x19,#0x10
00b92f18	bl 0x00c41bb0
00b92f1c	add x0,x19,#0x20
00b92f20	bl 0x00c41bb0
00b92f24	b 0x00b9242c
00b92f28	add x0,sp,#0x78
00b92f2c	str x26,[sp, #0x50]
00b92f30	bl 0x00c41c00
00b92f34	ldr x3,[sp, #0x68]
00b92f38	add x0,sp,#0x78
00b92f3c	mov w1,#0x2
00b92f40	mov x2,x19
00b92f44	mov x4,x22
00b92f48	str x19,[sp, #0x38]
00b92f4c	str x22,[sp, #0x48]
00b92f50	bl 0x00c41c90
00b92f54	mov w28,w0
00b92f58	cbnz w0,0x00b92f90
00b92f5c	add x1,sp,#0xf8
00b92f60	add x2,sp,#0xf8
00b92f64	add x3,sp,#0x78
00b92f68	mov x0,x20
00b92f6c	bl 0x00b953d4
00b92f70	mov w28,w0
00b92f74	cbnz w0,0x00b92f90
00b92f78	add x3,sp,#0x78
00b92f7c	mov x0,x20
00b92f80	mov x1,x24
00b92f84	mov x2,x24
00b92f88	bl 0x00b953d4
00b92f8c	mov w28,w0
00b92f90	add x0,sp,#0x78
00b92f94	bl 0x00c41bb0
00b92f98	ldp x22,x26,[sp, #0x48]
00b92f9c	cmn w28,#0xe
00b92fa0	mov w8,#0xffffb300
00b92fa4	csel w28,w8,w28,eq
00b92fa8	cbnz w28,0x00b934bc
00b92fac	ldr x8,[x20, #0x80]
00b92fb0	add x8,x8,#0x1
00b92fb4	str x8,[sp, #0x30]
00b92fb8	add x8,x20,#0x18
00b92fbc	str x8,[sp, #0x20]
00b92fc0	ldr x8,[sp, #0x30]
00b92fc4	cbz x8,0x00b9351c
00b92fc8	ldr x1,[sp, #0x30]
00b92fcc	mov x0,x23
00b92fd0	sub x1,x1,#0x1
00b92fd4	str x1,[sp, #0x30]
00b92fd8	bl 0x00c41be0
00b92fdc	mov w2,w0
00b92fe0	ldr x0,[sp, #0x70]
00b92fe4	add x1,sp,#0xf8
00b92fe8	str w2,[sp, #0x28]
00b92fec	bl 0x00c41ce0
00b92ff0	mov w28,w0
00b92ff4	cbnz w0,0x00b934b8
00b92ff8	ldr x0,[sp, #0x40]
00b92ffc	ldr w2,[sp, #0x28]
00b93000	mov x1,x24
00b93004	bl 0x00c41ce0
00b93008	mov w28,w0
00b9300c	cbnz w0,0x00b934b8
00b93010	ldr x1,[sp, #0x70]
00b93014	ldr x2,[sp, #0x40]
00b93018	add x0,sp,#0xb8
00b9301c	bl 0x00c41b20
00b93020	mov w28,w0
00b93024	cbnz w0,0x00b934b8
00b93028	ldp x22,x26,[sp, #0x48]
00b9302c	ldr x19,[sp, #0x38]
00b93030	add x0,sp,#0xb8
00b93034	mov x1,x19
00b93038	bl 0x00c41b50
00b9303c	tbnz w0,#0x1f,0x00b9305c
00b93040	add x0,sp,#0xb8
00b93044	add x1,sp,#0xb8
00b93048	mov x2,x19
00b9304c	bl 0x00c41d40
00b93050	mov w28,w0
00b93054	cbz w0,0x00b93030
00b93058	b 0x00b934bc
00b9305c	ldr x0,[sp, #0x60]
00b93060	ldr x1,[sp, #0x70]
00b93064	ldr x2,[sp, #0x40]
00b93068	bl 0x00c41d60
00b9306c	mov w28,w0
00b93070	cbnz w0,0x00b934b8
00b93074	ldrsh w8,[sp, #0xd0]
00b93078	tbz w8,#0x1f,0x00b930ac
00b9307c	ldr x0,[sp, #0x60]
00b93080	mov x1,xzr
00b93084	bl 0x00c41b40
00b93088	cbz w0,0x00b930ac
00b9308c	ldr x0,[sp, #0x60]
00b93090	ldr x2,[sp, #0x38]
00b93094	mov x1,x0
00b93098	bl 0x00c41b20
00b9309c	ldp x22,x26,[sp, #0x48]
00b930a0	mov w28,w0
00b930a4	cbz w0,0x00b93074
00b930a8	b 0x00b934bc
00b930ac	ldr x0,[sp, #0x50]
00b930b0	add x1,sp,#0xf8
00b930b4	mov x2,x24
00b930b8	bl 0x00c41b20
00b930bc	mov w28,w0
00b930c0	cbnz w0,0x00b934b8
00b930c4	ldr x26,[sp, #0x50]
00b930c8	ldr x19,[sp, #0x38]
00b930cc	mov x0,x26
00b930d0	mov x1,x19
00b930d4	bl 0x00c41b50
00b930d8	tbnz w0,#0x1f,0x00b93104
00b930dc	ldr x26,[sp, #0x50]
00b930e0	ldr x19,[sp, #0x38]
00b930e4	mov x0,x26
00b930e8	mov x1,x26
00b930ec	mov x2,x19
00b930f0	bl 0x00c41d40
00b930f4	ldr x22,[sp, #0x48]
00b930f8	mov w28,w0
00b930fc	cbz w0,0x00b930cc
00b93100	b 0x00b934bc
00b93104	ldr x0,[sp, #0x58]
00b93108	add x1,sp,#0xf8
00b9310c	mov x2,x24
00b93110	bl 0x00c41d60
00b93114	mov w28,w0
00b93118	cbnz w0,0x00b934b8
00b9311c	ldrsh w8,[sp, #0xf0]
00b93120	tbz w8,#0x1f,0x00b93154
00b93124	ldr x0,[sp, #0x58]
00b93128	mov x1,xzr
00b9312c	bl 0x00c41b40
00b93130	cbz w0,0x00b93154
00b93134	ldr x0,[sp, #0x58]
00b93138	ldr x2,[sp, #0x38]
00b9313c	mov x1,x0
00b93140	bl 0x00c41b20
00b93144	ldp x22,x26,[sp, #0x48]
00b93148	mov w28,w0
00b9314c	cbz w0,0x00b9311c
00b93150	b 0x00b934bc
00b93154	ldr x1,[sp, #0x58]
00b93158	add x3,sp,#0xb8
00b9315c	mov x0,x20
00b93160	mov x2,x1
00b93164	bl 0x00b953d4
00b93168	mov w28,w0
00b9316c	cbnz w0,0x00b934b8
00b93170	ldr x1,[sp, #0x50]
00b93174	ldr x3,[sp, #0x60]
00b93178	mov x0,x20
00b9317c	mov x2,x1
00b93180	bl 0x00b953d4
00b93184	mov w28,w0
00b93188	cbnz w0,0x00b934b8
00b9318c	add x1,sp,#0xb8
00b93190	add x2,sp,#0xb8
00b93194	add x3,sp,#0xb8
00b93198	mov x0,x20
00b9319c	bl 0x00b953d4
00b931a0	mov w28,w0
00b931a4	cbnz w0,0x00b934b8
00b931a8	ldr x1,[sp, #0x60]
00b931ac	mov x0,x20
00b931b0	mov x2,x1
00b931b4	mov x3,x1
00b931b8	bl 0x00b953d4
00b931bc	mov w28,w0
00b931c0	cbnz w0,0x00b934b8
00b931c4	ldr x1,[sp, #0x70]
00b931c8	ldr x3,[sp, #0x60]
00b931cc	add x2,sp,#0xb8
00b931d0	mov x0,x20
00b931d4	bl 0x00b953d4
00b931d8	mov w28,w0
00b931dc	cbnz w0,0x00b934b8
00b931e0	ldr x2,[sp, #0x60]
00b931e4	add x0,sp,#0xb8
00b931e8	add x1,sp,#0xb8
00b931ec	bl 0x00c41d60
00b931f0	mov w28,w0
00b931f4	cbnz w0,0x00b934b8
00b931f8	ldrsh w8,[sp, #0xc0]
00b931fc	tbz w8,#0x1f,0x00b93230
00b93200	add x0,sp,#0xb8
00b93204	mov x1,xzr
00b93208	bl 0x00c41b40
00b9320c	cbz w0,0x00b93230
00b93210	ldr x2,[sp, #0x38]
00b93214	add x0,sp,#0xb8
00b93218	add x1,sp,#0xb8
00b9321c	bl 0x00c41b20
00b93220	ldp x22,x26,[sp, #0x48]
00b93224	mov w28,w0
00b93228	cbz w0,0x00b931f8
00b9322c	b 0x00b934bc
00b93230	ldr x1,[sp, #0x40]
00b93234	ldr x2,[sp, #0x20]
00b93238	add x3,sp,#0xb8
00b9323c	mov x0,x20
00b93240	bl 0x00b953d4
00b93244	mov w28,w0
00b93248	cbnz w0,0x00b934b8
00b9324c	ldr x0,[sp, #0x40]
00b93250	ldr x1,[sp, #0x60]
00b93254	mov x2,x0
00b93258	bl 0x00c41b20
00b9325c	mov w28,w0
00b93260	cbnz w0,0x00b934b8
00b93264	ldr x19,[sp, #0x38]
00b93268	ldr x0,[sp, #0x40]
00b9326c	mov x1,x19
00b93270	bl 0x00c41b50
00b93274	tbnz w0,#0x1f,0x00b93298
00b93278	ldp x19,x0,[sp, #0x38]
00b9327c	mov x1,x0
00b93280	mov x2,x19
00b93284	bl 0x00c41d40
00b93288	ldp x22,x26,[sp, #0x48]
00b9328c	mov w28,w0
00b93290	cbz w0,0x00b93268
00b93294	b 0x00b934bc
00b93298	ldp x2,x1,[sp, #0x50]
00b9329c	add x0,sp,#0xf8
00b932a0	bl 0x00c41b20
00b932a4	mov w28,w0
00b932a8	cbnz w0,0x00b934b8
00b932ac	ldr x19,[sp, #0x38]
00b932b0	add x0,sp,#0xf8
00b932b4	mov x1,x19
00b932b8	bl 0x00c41b50
00b932bc	tbnz w0,#0x1f,0x00b932e4
00b932c0	ldr x19,[sp, #0x38]
00b932c4	add x0,sp,#0xf8
00b932c8	add x1,sp,#0xf8
00b932cc	mov x2,x19
00b932d0	bl 0x00c41d40
00b932d4	ldp x22,x26,[sp, #0x48]
00b932d8	mov w28,w0
00b932dc	cbz w0,0x00b932b0
00b932e0	b 0x00b934bc
00b932e4	add x1,sp,#0xf8
00b932e8	add x2,sp,#0xf8
00b932ec	add x3,sp,#0xf8
00b932f0	mov x0,x20
00b932f4	bl 0x00b953d4
00b932f8	mov w28,w0
00b932fc	cbnz w0,0x00b934b8
00b93300	ldp x2,x1,[sp, #0x50]
00b93304	mov x0,x24
00b93308	bl 0x00c41d60
00b9330c	mov w28,w0
00b93310	cbnz w0,0x00b934b8
00b93314	ldrsh w8,[sp, #0x120]
00b93318	tbz w8,#0x1f,0x00b9334c
00b9331c	mov x0,x24
00b93320	mov x1,xzr
00b93324	bl 0x00c41b40
00b93328	cbz w0,0x00b9334c
00b9332c	ldr x2,[sp, #0x38]
00b93330	mov x0,x24
00b93334	mov x1,x24
00b93338	bl 0x00c41b20
00b9333c	ldp x22,x26,[sp, #0x48]
00b93340	mov w28,w0
00b93344	cbz w0,0x00b93314
00b93348	b 0x00b934bc
00b9334c	mov x0,x20
00b93350	mov x1,x24
00b93354	mov x2,x24
00b93358	mov x3,x24
00b9335c	bl 0x00b953d4
00b93360	mov w28,w0
00b93364	cbnz w0,0x00b934b8
00b93368	add x2,sp,#0xa8
00b9336c	mov x0,x20
00b93370	mov x1,x24
00b93374	mov x3,x24
00b93378	bl 0x00b953d4
00b9337c	mov w28,w0
00b93380	cbnz w0,0x00b934b8
00b93384	ldr x1,[sp, #0x40]
00b93388	add x2,sp,#0xb8
00b9338c	mov x0,x20
00b93390	mov x3,x1
00b93394	bl 0x00b953d4
00b93398	mov w28,w0
00b9339c	cbnz w0,0x00b934b8
00b933a0	ldr x0,[sp, #0x70]
00b933a4	ldr w2,[sp, #0x28]
00b933a8	add x1,sp,#0xf8
00b933ac	bl 0x00c41ce0
00b933b0	mov w28,w0
00b933b4	cbnz w0,0x00b934b8
00b933b8	ldr x0,[sp, #0x40]
00b933bc	ldr w2,[sp, #0x28]
00b933c0	mov x1,x24
00b933c4	bl 0x00c41ce0
00b933c8	ldp x22,x26,[sp, #0x48]
00b933cc	mov w28,w0
00b933d0	cbz w0,0x00b92fc0
00b933d4	b 0x00b934bc
00b933d8	ldr w9,[sp, #0x50]
00b933dc	adrp x13,0x29c000
00b933e0	ldr q1,[x13, #0x550]
00b933e4	add x10,sp,#0xf8
00b933e8	sub w9,w9,#0x1
00b933ec	and w11,w9,#0x3
00b933f0	orr w14,wzr,#0x60
00b933f4	sub x9,x2,x11
00b933f8	mov w13,#0x4
00b933fc	dup v0.2D,x8
00b93400	add x12,x10,#0x10
00b93404	dup v2.2D,x14
00b93408	add x10,x9,#0x1
00b9340c	dup v3.2D,x13
00b93410	mov x13,x9
00b93414	fmov x14,d1
00b93418	add x14,x14,x14, LSL #0x1
00b9341c	mov x15,v1.D[0x1]
00b93420	lsl x14,x14,#0x4
00b93424	add x15,x15,x15, LSL #0x1
00b93428	fmov d4,x14
00b9342c	lsl x14,x15,#0x4
00b93430	mov v4.D[0x1],x14
00b93434	add v4.2D,v0.2D,v4.2D
00b93438	add v5.2D,v4.2D,v2.2D
00b9343c	add v1.2D,v1.2D,v3.2D
00b93440	subs x13,x13,#0x4
00b93444	stp q4,q5,[x12, #-0x10]
00b93448	add x12,x12,#0x20
00b9344c	b.ne 0x00b93414
00b93450	cbz w11,0x00b93478
00b93454	orr w11,wzr,#0x30
00b93458	add x12,sp,#0xf8
00b9345c	mov x13,x10
00b93460	madd x14,x9,x11,x8
00b93464	add x10,x10,#0x1
00b93468	cmp x26,x10
00b9346c	str x14,[x12, x9, LSL #0x3]
00b93470	mov x9,x13
00b93474	b.ne 0x00b9345c
00b93478	add x1,sp,#0xf8
00b9347c	mov x0,x20
00b93480	bl 0x00b95a00
00b93484	mov w28,w0
00b93488	cbnz w0,0x00b92768
00b9348c	mov w19,wzr
00b93490	orr w24,wzr,#0x30
00b93494	and x8,x19,#0xff
00b93498	madd x8,x8,x24,x27
00b9349c	add x0,x8,#0x20
00b934a0	bl 0x00c41bb0
00b934a4	add w19,w19,#0x1
00b934a8	cmp w26,w19, UXTB 
00b934ac	mov w28,wzr
00b934b0	b.hi 0x00b93494
00b934b4	b 0x00b92768
00b934b8	ldp x22,x26,[sp, #0x48]
00b934bc	add x0,sp,#0xf8
00b934c0	bl 0x00c41bb0
00b934c4	mov x0,x27
00b934c8	bl 0x00c41bb0
00b934cc	mov x0,x24
00b934d0	bl 0x00c41bb0
00b934d4	add x0,sp,#0xa8
00b934d8	bl 0x00c41bb0
00b934dc	add x0,sp,#0xb8
00b934e0	bl 0x00c41bb0
00b934e4	ldr x0,[sp, #0x60]
00b934e8	bl 0x00c41bb0
00b934ec	mov x0,x26
00b934f0	bl 0x00c41bb0
00b934f4	ldr x0,[sp, #0x58]
00b934f8	bl 0x00c41bb0
00b934fc	ldr x24,[sp, #0x68]
00b93500	cbnz w28,0x00b9242c
00b93504	ldr x8,[x20, #0x38]
00b93508	cbz x8,0x00b93514
00b9350c	ldr x8,[x20, #0x48]
00b93510	cbnz x8,0x00b92474
00b93514	mov w28,wzr
00b93518	b 0x00b9242c
00b9351c	add x0,sp,#0x78
00b93520	bl 0x00c41c00
00b93524	ldr x2,[sp, #0x38]
00b93528	ldr x3,[sp, #0x68]
00b9352c	ldr x4,[sp, #0x48]
00b93530	add x0,sp,#0x78
00b93534	mov w1,#0x2
00b93538	bl 0x00c41c90
00b9353c	mov w28,w0
00b93540	cbnz w0,0x00b93578
00b93544	ldr x1,[sp, #0x70]
00b93548	add x3,sp,#0x78
00b9354c	mov x0,x20
00b93550	mov x2,x1
00b93554	bl 0x00b953d4
00b93558	mov w28,w0
00b9355c	cbnz w0,0x00b93578
00b93560	ldr x1,[sp, #0x40]
00b93564	add x3,sp,#0x78
00b93568	mov x0,x20
00b9356c	mov x2,x1
00b93570	bl 0x00b953d4
00b93574	mov w28,w0
00b93578	add x0,sp,#0x78
00b9357c	bl 0x00c41bb0
00b93580	ldr x19,[sp, #0x70]
00b93584	ldp x22,x26,[sp, #0x48]
00b93588	ldr x2,[sp, #0x38]
00b9358c	cmn w28,#0xe
00b93590	mov w8,#0xffffb300
00b93594	csel w28,w8,w28,eq
00b93598	cbnz w28,0x00b934bc
00b9359c	ldr x0,[sp, #0x40]
00b935a0	mov x1,x0
00b935a4	bl 0x00c41c10
00b935a8	mov w28,w0
00b935ac	cbnz w0,0x00b934bc
00b935b0	ldr x3,[sp, #0x40]
00b935b4	mov x0,x20
00b935b8	mov x1,x19
00b935bc	mov x2,x19
00b935c0	bl 0x00b953d4
00b935c4	mov w28,w0
00b935c8	cbnz w0,0x00b934bc
00b935cc	ldr x0,[sp, #0x40]
00b935d0	mov w1,#0x1
00b935d4	bl 0x00c41c40
00b935d8	mov w28,w0
00b935dc	b 0x00b934bc
00b935e0	bl 0x00c2fec0

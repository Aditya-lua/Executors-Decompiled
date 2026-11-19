; tls1_enc @ 009ce3b0
009ce3b0	stp x28,x27,[sp, #-0x60]!
009ce3b4	stp x26,x25,[sp, #0x10]
009ce3b8	stp x24,x23,[sp, #0x20]
009ce3bc	stp x22,x21,[sp, #0x30]
009ce3c0	stp x20,x19,[sp, #0x40]
009ce3c4	stp x29,x30,[sp, #0x50]
009ce3c8	add x29,sp,#0x50
009ce3cc	sub sp,sp,#0x480
009ce3d0	cmp w3,#0x0
009ce3d4	mov w8,#0x4
009ce3d8	mov w9,#0x8
009ce3dc	mov x27,x0
009ce3e0	csel w22,w9,w8,ne
009ce3e4	cbz x2,0x009ce4e0
009ce3e8	ldr w24,[x27, #0x540]
009ce3ec	mov x20,x5
009ce3f0	mov x28,x4
009ce3f4	mov w26,w3
009ce3f8	mov x21,x2
009ce3fc	mov x23,x1
009ce400	mov x19,x1
009ce404	str x27,[sp, #0x50]
009ce408	cbz w3,0x009ce51c
009ce40c	ldr x0,[x27, #0x890]
009ce410	bl 0x00c34c00
009ce414	cbz x0,0x009ce428
009ce418	ldr x0,[x27, #0x890]
009ce41c	bl 0x00c34c00
009ce420	bl 0x00c34c20
009ce424	tbnz w0,#0x1f,0x009ce9cc
009ce428	ldr x25,[x27, #0x878]
009ce42c	cbz x25,0x009ce5bc
009ce430	mov x0,x25
009ce434	bl 0x00c34b80
009ce438	ldr x8,[x27, #0x8]
009ce43c	ldr x8,[x8, #0xc0]
009ce440	ldrb w8,[x8, #0x60]
009ce444	tbz w8,#0x0,0x009ce548
009ce448	str w22,[sp, #0x48]
009ce44c	mov w22,w24
009ce450	mov x24,x0
009ce454	bl 0x00c35290
009ce458	cmp w0,#0x2
009ce45c	b.ne 0x009cea04
009ce460	mov x0,x24
009ce464	str x24,[sp, #0x28]
009ce468	bl 0x00c34bc0
009ce46c	cmp w0,#0x2
009ce470	b.lt 0x009cea28
009ce474	mov w24,w22
009ce478	ldr w22,[sp, #0x48]
009ce47c	str x20,[sp, #0x18]
009ce480	mov x20,xzr
009ce484	sxtw x27,w0
009ce488	add x23,x23,#0x28
009ce48c	ldp x1,x8,[x23, #-0x8]
009ce490	cmp x1,x8
009ce494	b.ne 0x009ceac0
009ce498	ldr x8,[sp, #0x50]
009ce49c	mov x2,x27
009ce4a0	mov w3,wzr
009ce4a4	ldr x8,[x8, #0x9a8]
009ce4a8	ldr x0,[x8]
009ce4ac	bl 0x00c347b0
009ce4b0	cmp w0,#0x0
009ce4b4	b.le 0x009cec04
009ce4b8	add x20,x20,#0x1
009ce4bc	cmp x20,x21
009ce4c0	add x23,x23,#0x50
009ce4c4	b.cc 0x009ce48c
009ce4c8	ldr x20,[sp, #0x18]
009ce4cc	ldr x27,[sp, #0x50]
009ce4d0	ldr x0,[sp, #0x28]
009ce4d4	mov x23,x19
009ce4d8	cbnz x0,0x009ce54c
009ce4dc	b 0x009cea38
009ce4e0	bl 0x00c342a0
009ce4e4	adrp x0,0x2cf000
009ce4e8	adrp x2,0x2bd000
009ce4ec	add x0,x0,#0x7d6
009ce4f0	add x2,x2,#0x69f
009ce4f4	mov w1,#0x3db
009ce4f8	bl 0x00c342b0
009ce4fc	mov w2,#0x103
009ce500	mov w1,#0x50
009ce504	movk w2,#0xc, LSL #16
009ce508	mov x0,x27
009ce50c	mov x3,xzr
009ce510	bl 0x00c34410
009ce514	mov w0,wzr
009ce518	b 0x009ceda4
009ce51c	ldr x0,[x27, #0x860]
009ce520	bl 0x00c34c00
009ce524	cbz x0,0x009ce538
009ce528	ldr x0,[x27, #0x860]
009ce52c	bl 0x00c34c00
009ce530	bl 0x00c34c20
009ce534	tbnz w0,#0x1f,0x009ce9e8
009ce538	ldr x25,[x27, #0x848]
009ce53c	cbz x25,0x009ce5bc
009ce540	mov x0,x25
009ce544	bl 0x00c34b80
009ce548	cbz x0,0x009cea38
009ce54c	cbz x25,0x009cea38
009ce550	ldr x8,[x27, #0x918]
009ce554	cbz x8,0x009cea38
009ce558	str w24,[sp, #0x48]
009ce55c	str x0,[sp, #0x28]
009ce560	bl 0x00c34bb0
009ce564	mov x24,x0
009ce568	mov x0,x25
009ce56c	bl 0x00c34b80
009ce570	bl 0x00c35270
009ce574	cmp x21,#0x2
009ce578	mov w27,w0
009ce57c	b.cc 0x009ce5c8
009ce580	mov x0,x25
009ce584	bl 0x00c34b80
009ce588	bl 0x00c35280
009ce58c	tbnz w0,#0x17,0x009ce5c8
009ce590	bl 0x00c342a0
009ce594	adrp x0,0x2cf000
009ce598	adrp x2,0x2bd000
009ce59c	add x0,x0,#0x7d6
009ce5a0	add x2,x2,#0x69f
009ce5a4	mov w1,#0x425
009ce5a8	bl 0x00c342b0
009ce5ac	ldr x0,[sp, #0x50]
009ce5b0	mov w1,#0x50
009ce5b4	mov w2,#0x196
009ce5b8	b 0x009ce50c
009ce5bc	mov x0,xzr
009ce5c0	cbnz x0,0x009ce54c
009ce5c4	b 0x009cea38
009ce5c8	ldr w8,[sp, #0x48]
009ce5cc	sxtw x11,w27
009ce5d0	cmp x24,#0x0
009ce5d4	cset w10,ne
009ce5d8	str x11,[sp, #0x48]
009ce5dc	cmp w11,#0x1
009ce5e0	ldr x11,[sp, #0x50]
009ce5e4	and w8,w8,w22
009ce5e8	str w8,[sp, #0xc]
009ce5ec	mov w8,#0x1d00
009ce5f0	mov w9,#0x1cf8
009ce5f4	add x8,x11,x8
009ce5f8	add x9,x11,x9
009ce5fc	cset w11,eq
009ce600	cmp w26,#0x0
009ce604	csel x27,x8,x9,ne
009ce608	cset w8,eq
009ce60c	orr w8,w8,w11
009ce610	stp x20,x28,[sp, #0x18]
009ce614	mov w28,wzr
009ce618	mov x20,xzr
009ce61c	str x24,[sp, #0x10]
009ce620	mov w22,#0x50
009ce624	add x24,sp,#0x378
009ce628	add x9,x27,#0x2
009ce62c	orr w8,w10,w8
009ce630	str x9,[sp, #0x30]
009ce634	str w8,[sp, #0x40]
009ce638	nop
009ce63c	madd x23,x20,x22,x23
009ce640	ldr x8,[x23, #0x8]!
009ce644	mov x0,x25
009ce648	str x8,[x24, x20, LSL #0x3]
009ce64c	bl 0x00c34b80
009ce650	bl 0x00c35280
009ce654	tbnz w0,#0x15,0x009ce6cc
009ce658	ldr w8,[sp, #0x40]
009ce65c	tbnz w8,#0x0,0x009ce6c0
009ce660	ldr x9,[x24, x20, LSL #0x3]
009ce664	ldr x10,[sp, #0x48]
009ce668	udiv x8,x9,x10
009ce66c	msub x8,x8,x10,x9
009ce670	sub x8,x10,x8
009ce674	cmp x8,#0x101
009ce678	b.cs 0x009cea60
009ce67c	add x11,x9,x8
009ce680	cmp x9,x11
009ce684	b.cs 0x009ce6b0
009ce688	madd x11,x20,x22,x19
009ce68c	sub w10,w8,#0x1
009ce690	add x12,x11,#0x28
009ce694	ldr x11,[x12]
009ce698	strb w10,[x11, x9]
009ce69c	ldr x11,[x24, x20, LSL #0x3]
009ce6a0	add x9,x9,#0x1
009ce6a4	add x11,x11,x8
009ce6a8	cmp x9,x11
009ce6ac	b.cc 0x009ce694
009ce6b0	str x11,[x24, x20, LSL #0x3]
009ce6b4	ldr x9,[x23]
009ce6b8	add x8,x9,x8
009ce6bc	str x8,[x23]
009ce6c0	mov x23,x19
009ce6c4	cbnz w26,0x009ce86c
009ce6c8	b 0x009ce854
009ce6cc	ldr x10,[sp, #0x50]
009ce6d0	mov w11,#0xd
009ce6d4	ldr x8,[x10, #0x8]
009ce6d8	ldr x8,[x8, #0xc0]
009ce6dc	ldrb w8,[x8, #0x60]
009ce6e0	tbnz w8,#0x3,0x009ce794
009ce6e4	ldr x8,[x27]
009ce6e8	add x12,sp,#0x1d8
009ce6ec	madd x3,x20,x11,x12
009ce6f0	str x8,[x3]
009ce6f4	ldrb w9,[x27, #0x7]
009ce6f8	add w9,w9,#0x1
009ce6fc	tst w9,#0xff
009ce700	strb w9,[x27, #0x7]
009ce704	b.ne 0x009ce78c
009ce708	ldrb w9,[x27, #0x6]
009ce70c	add w9,w9,#0x1
009ce710	tst w9,#0xff
009ce714	strb w9,[x27, #0x6]
009ce718	b.ne 0x009ce78c
009ce71c	ldrb w9,[x27, #0x5]
009ce720	add w9,w9,#0x1
009ce724	tst w9,#0xff
009ce728	strb w9,[x27, #0x5]
009ce72c	b.ne 0x009ce78c
009ce730	ldrb w9,[x27, #0x4]
009ce734	add w9,w9,#0x1
009ce738	tst w9,#0xff
009ce73c	strb w9,[x27, #0x4]
009ce740	b.ne 0x009ce78c
009ce744	ldrb w9,[x27, #0x3]
009ce748	add w9,w9,#0x1
009ce74c	tst w9,#0xff
009ce750	strb w9,[x27, #0x3]
009ce754	b.ne 0x009ce78c
009ce758	ldr x10,[sp, #0x30]
009ce75c	ldrb w9,[x10]
009ce760	add w9,w9,#0x1
009ce764	tst w9,#0xff
009ce768	strb w9,[x10]
009ce76c	b.ne 0x009ce78c
009ce770	ldrb w9,[x27, #0x1]
009ce774	add w9,w9,#0x1
009ce778	tst w9,#0xff
009ce77c	strb w9,[x27, #0x1]
009ce780	b.ne 0x009ce78c
009ce784	add w8,w8,#0x1
009ce788	strb w8,[x27]
009ce78c	ldr x10,[sp, #0x50]
009ce790	b 0x009ce7d4
009ce794	ldr x8,[x10, #0x1d10]
009ce798	cmp w26,#0x0
009ce79c	cset w9,ne
009ce7a0	add x12,sp,#0x1d8
009ce7a4	ldrh w8,[x8, w9, UXTW #0x1]
009ce7a8	nop
009ce7ac	madd x3,x20,x11,x12
009ce7b0	lsr w9,w8,#0x8
009ce7b4	strb w9,[x3]
009ce7b8	ldr x9,[sp, #0x30]
009ce7bc	strb w8,[x3, #0x1]
009ce7c0	ldrh w8,[x9, #0x4]
009ce7c4	strh w8,[x3, #0x6]
009ce7c8	ldr w8,[x9]
009ce7cc	stur w8,[x3, #0x2]
009ce7d0	nop
009ce7d4	madd x8,x20,x22,x19
009ce7d8	ldr w8,[x8, #0x4]
009ce7dc	nop
009ce7e0	madd x9,x20,x11,x12
009ce7e4	mov w1,#0x16
009ce7e8	mov w2,#0xd
009ce7ec	strb w8,[x9, #0x8]
009ce7f0	ldr w8,[x10]
009ce7f4	mov x0,x25
009ce7f8	lsr w10,w8,#0x8
009ce7fc	strb w8,[x9, #0xa]
009ce800	strb w10,[x9, #0x9]
009ce804	ldr x8,[x23]
009ce808	lsr x10,x8,#0x8
009ce80c	strb w10,[x9, #0xb]
009ce810	strb w8,[x9, #0xc]
009ce814	bl 0x00c361b0
009ce818	mov w28,w0
009ce81c	cmp w0,#0x1
009ce820	b.lt 0x009cea0c
009ce824	cbz w26,0x009ce850
009ce828	lsl x8,x20,#0x3
009ce82c	ldr x9,[x24, x8#0x0]
009ce830	sxtw x10,w28
009ce834	add x9,x9,x10
009ce838	str x9,[x24, x8#0x0]
009ce83c	ldr x8,[x23]
009ce840	add x8,x8,x10
009ce844	str x8,[x23]
009ce848	mov x23,x19
009ce84c	b 0x009ce86c
009ce850	mov x23,x19
009ce854	ldr x8,[x24, x20, LSL #0x3]
009ce858	cbz x8,0x009ceda0
009ce85c	ldr x10,[sp, #0x48]
009ce860	udiv x9,x8,x10
009ce864	msub x8,x9,x10,x8
009ce868	cbnz x8,0x009ceda0
009ce86c	add x20,x20,#0x1
009ce870	cmp x20,x21
009ce874	b.cc 0x009ce63c
009ce878	ldp x22,x20,[sp, #0x10]
009ce87c	ldr x19,[sp, #0x50]
009ce880	cmp x21,#0x2
009ce884	b.cc 0x009ce9a0
009ce888	and x8,x21,#-0x2
009ce88c	add x10,sp,#0xd8
009ce890	add x9,x23,#0x70
009ce894	add x10,x10,#0x8
009ce898	mov x11,x8
009ce89c	ldur x12,[x9, #-0x50]
009ce8a0	ldr x13,[x9], #0xa0
009ce8a4	subs x11,x11,#0x2
009ce8a8	stp x12,x13,[x10, #-0x8]
009ce8ac	add x10,x10,#0x10
009ce8b0	b.ne 0x009ce89c
009ce8b4	cmp x8,x21
009ce8b8	b.eq 0x009ce8e4
009ce8bc	add x10,sp,#0xd8
009ce8c0	mov w11,#0x50
009ce8c4	sub x9,x21,x8
009ce8c8	add x10,x10,x8, LSL #0x3
009ce8cc	madd x8,x8,x11,x23
009ce8d0	add x8,x8,#0x20
009ce8d4	ldr x11,[x8], #0x50
009ce8d8	subs x9,x9,#0x1
009ce8dc	str x11,[x10], #0x8
009ce8e0	b.ne 0x009ce8d4
009ce8e4	mov w1,#0x22
009ce8e8	add x3,sp,#0xd8
009ce8ec	mov x0,x25
009ce8f0	mov w2,w21
009ce8f4	bl 0x00c361b0
009ce8f8	cmp w0,#0x1
009ce8fc	b.lt 0x009cea98
009ce900	cmp x21,#0x1
009ce904	mov x8,xzr
009ce908	b.ls 0x009ce940
009ce90c	and x8,x21,#-0x2
009ce910	add x10,sp,#0xd8
009ce914	add x9,x23,#0x78
009ce918	add x10,x10,#0x8
009ce91c	mov x11,x8
009ce920	ldur x12,[x9, #-0x50]
009ce924	ldr x13,[x9], #0xa0
009ce928	subs x11,x11,#0x2
009ce92c	stp x12,x13,[x10, #-0x8]
009ce930	add x10,x10,#0x10
009ce934	b.ne 0x009ce920
009ce938	cmp x8,x21
009ce93c	b.eq 0x009ce968
009ce940	add x10,sp,#0xd8
009ce944	mov w11,#0x50
009ce948	sub x9,x21,x8
009ce94c	add x10,x10,x8, LSL #0x3
009ce950	madd x8,x8,x11,x23
009ce954	add x8,x8,#0x28
009ce958	ldr x11,[x8], #0x50
009ce95c	subs x9,x9,#0x1
009ce960	str x11,[x10], #0x8
009ce964	b.ne 0x009ce958
009ce968	mov w1,#0x23
009ce96c	add x3,sp,#0xd8
009ce970	mov x0,x25
009ce974	mov w2,w21
009ce978	bl 0x00c361b0
009ce97c	cmp w0,#0x1
009ce980	b.lt 0x009cea7c
009ce984	mov w1,#0x24
009ce988	add x3,sp,#0x378
009ce98c	mov x0,x25
009ce990	mov w2,w21
009ce994	bl 0x00c361b0
009ce998	cmp w0,#0x0
009ce99c	b.le 0x009cea7c
009ce9a0	ldr w8,[sp, #0xc]
009ce9a4	cbz w8,0x009ceb0c
009ce9a8	ldr x8,[x19, #0x8]
009ce9ac	ldr x8,[x8, #0xc0]
009ce9b0	ldr w8,[x8, #0x60]
009ce9b4	tbnz w8,#0x3,0x009ceb0c
009ce9b8	cbz w26,0x009ceadc
009ce9bc	ldr w8,[x19, #0xa8]
009ce9c0	mov w9,#0x1
009ce9c4	bic w2,w9,w8, LSR #0xa
009ce9c8	b 0x009ceae0
009ce9cc	bl 0x00c342a0
009ce9d0	adrp x0,0x2cf000
009ce9d4	adrp x2,0x2bd000
009ce9d8	add x0,x0,#0x7d6
009ce9dc	add x2,x2,#0x69f
009ce9e0	mov w1,#0x3e3
009ce9e4	b 0x009ce4f8
009ce9e8	bl 0x00c342a0
009ce9ec	adrp x0,0x2cf000
009ce9f0	adrp x2,0x2bd000
009ce9f4	add x0,x0,#0x7d6
009ce9f8	add x2,x2,#0x69f
009ce9fc	mov w1,#0x409
009cea00	b 0x009ce4f8
009cea04	mov x0,x24
009cea08	b 0x009cea2c
009cea0c	bl 0x00c342a0
009cea10	adrp x0,0x2cf000
009cea14	adrp x2,0x2bd000
009cea18	add x0,x0,#0x7d6
009cea1c	add x2,x2,#0x69f
009cea20	mov w1,#0x44c
009cea24	b 0x009cec1c
009cea28	ldr x0,[sp, #0x28]
009cea2c	mov w24,w22
009cea30	ldr w22,[sp, #0x48]
009cea34	cbnz x0,0x009ce54c
009cea38	add x19,x23,#0x28
009cea3c	ldp x0,x1,[x19, #-0x8]
009cea40	ldur x2,[x19, #-0x20]
009cea44	bl 0x00c2ff60
009cea48	ldur x8,[x19, #-0x8]
009cea4c	subs x21,x21,#0x1
009cea50	str x8,[x19], #0x50
009cea54	b.ne 0x009cea3c
009cea58	mov w0,#0x1
009cea5c	b 0x009ceda4
009cea60	bl 0x00c342a0
009cea64	adrp x0,0x2cf000
009cea68	adrp x2,0x2bd000
009cea6c	add x0,x0,#0x7d6
009cea70	add x2,x2,#0x69f
009cea74	mov w1,#0x45f
009cea78	b 0x009cec1c
009cea7c	bl 0x00c342a0
009cea80	adrp x0,0x2cf000
009cea84	adrp x2,0x2bd000
009cea88	add x0,x0,#0x7d6
009cea8c	add x2,x2,#0x69f
009cea90	mov w1,#0x483
009cea94	b 0x009ceab0
009cea98	bl 0x00c342a0
009cea9c	adrp x0,0x2cf000
009ceaa0	adrp x2,0x2bd000
009ceaa4	add x0,x0,#0x7d6
009ceaa8	add x2,x2,#0x69f
009ceaac	mov w1,#0x478
009ceab0	bl 0x00c342b0
009ceab4	mov w1,#0x50
009ceab8	mov w2,#0x196
009ceabc	b 0x009cebfc
009ceac0	bl 0x00c342a0
009ceac4	adrp x0,0x2cf000
009ceac8	adrp x2,0x2bd000
009ceacc	add x0,x0,#0x7d6
009cead0	add x2,x2,#0x69f
009cead4	mov w1,#0x3fb
009cead8	b 0x009cec1c
009ceadc	mov w2,wzr
009ceae0	mov w8,#0x1d00
009ceae4	mov w9,#0x1cf8
009ceae8	add x8,x19,x8
009ceaec	add x9,x19,x9
009ceaf0	cmp w26,#0x0
009ceaf4	csel x3,x8,x9,ne
009ceaf8	mov w1,#0x2a
009ceafc	mov x0,x25
009ceb00	bl 0x00c361b0
009ceb04	cmp w0,#0x0
009ceb08	b.le 0x009cebd4
009ceb0c	cbz x22,0x009ceb50
009ceb10	cmp x21,#0x2
009ceb14	b.cc 0x009ceb8c
009ceb18	bl 0x00c342a0
009ceb1c	adrp x0,0x2cf000
009ceb20	adrp x2,0x2bd000
009ceb24	add x0,x0,#0x7d6
009ceb28	add x2,x2,#0x69f
009ceb2c	mov w1,#0x4a1
009ceb30	bl 0x00c342b0
009ceb34	mov w2,#0x103
009ceb38	mov w1,#0x50
009ceb3c	movk w2,#0xc, LSL #16
009ceb40	mov x0,x19
009ceb44	mov x3,xzr
009ceb48	bl 0x00c34410
009ceb4c	b 0x009ceda0
009ceb50	ldp x1,x2,[x23, #0x20]
009ceb54	ldr w3,[sp, #0x378]
009ceb58	mov x0,x25
009ceb5c	bl 0x00c36d60
009ceb60	mov w19,w0
009ceb64	mov x0,x25
009ceb68	bl 0x00c34b80
009ceb6c	bl 0x00c35280
009ceb70	tbnz w0,#0x14,0x009cec34
009ceb74	cmp w19,#0x0
009ceb78	cset w0,ne
009ceb7c	cbnz w26,0x009ceda4
009ceb80	ldr x25,[sp, #0x48]
009ceb84	cbnz w19,0x009cec48
009ceb88	b 0x009ceda4
009ceb8c	ldp x1,x3,[x23, #0x20]
009ceb90	ldr w4,[sp, #0x378]
009ceb94	add x2,sp,#0xd4
009ceb98	mov x0,x25
009ceb9c	bl 0x00c36d70
009ceba0	cbz w0,0x009ceda0
009ceba4	ldrsw x8,[sp, #0xd4]
009ceba8	str x8,[x23, #0x8]
009cebac	cbnz w26,0x009cea58
009cebb0	ldr x21,[sp, #0x28]
009cebb4	mov x0,x21
009cebb8	bl 0x00c35290
009cebbc	cmp w0,#0x6
009cebc0	b.ne 0x009cedc4
009cebc4	ldr q0,[x23, #0x20]
009cebc8	mov w8,#0x8
009cebcc	ldr x11,[sp, #0x20]
009cebd0	b 0x009cede0
009cebd4	bl 0x00c342a0
009cebd8	adrp x0,0x2cf000
009cebdc	adrp x2,0x2bd000
009cebe0	add x0,x0,#0x7d6
009cebe4	add x2,x2,#0x69f
009cebe8	mov w1,#0x497
009cebec	bl 0x00c342b0
009cebf0	mov w2,#0x103
009cebf4	mov w1,#0x50
009cebf8	movk w2,#0xc, LSL #16
009cebfc	mov x0,x19
009cec00	b 0x009ce50c
009cec04	bl 0x00c342a0
009cec08	adrp x0,0x2cf000
009cec0c	adrp x2,0x2bd000
009cec10	add x0,x0,#0x7d6
009cec14	add x2,x2,#0x69f
009cec18	orr w1,wzr,#0x3ff
009cec1c	bl 0x00c342b0
009cec20	ldr x0,[sp, #0x50]
009cec24	mov w2,#0x103
009cec28	mov w1,#0x50
009cec2c	movk w2,#0xc, LSL #16
009cec30	b 0x009ce50c
009cec34	lsr w8,w19,#0x1f
009cec38	eor w0,w8,#0x1
009cec3c	cbnz w26,0x009ceda4
009cec40	ldr x25,[sp, #0x48]
009cec44	tbnz w19,#0x1f,0x009ceda4
009cec48	ldp x27,x19,[sp, #0x20]
009cec4c	mov x9,x20
009cec50	sxtw x8,w28
009cec54	cmp w28,#0x0
009cec58	mov w10,#0x8
009cec5c	csel x8,x9,x8,eq
009cec60	dup v0.2D,x10
009cec64	mov x20,xzr
009cec68	add x24,x23,#0x20
009cec6c	str x8,[sp, #0x40]
009cec70	str q0,[sp, #0x30]
009cec74	mov x0,x19
009cec78	bl 0x00c35290
009cec7c	cmp w0,#0x6
009cec80	b.ne 0x009ceca4
009cec84	ldr q0,[x24]
009cec88	ldur x8,[x24, #-0x18]
009cec8c	ldr q1,[sp, #0x30]
009cec90	ldr x12,[sp, #0x20]
009cec94	mov x0,x19
009cec98	sub x8,x8,#0x8
009cec9c	add v0.2D,v0.2D,v1.2D
009ceca0	b 0x009cecd4
009ceca4	mov x0,x19
009ceca8	bl 0x00c35290
009cecac	ldr x12,[sp, #0x20]
009cecb0	cmp w0,#0x7
009cecb4	b.ne 0x009ced50
009cecb8	ldr q0,[x24]
009cecbc	ldur x8,[x24, #-0x18]
009cecc0	mov w9,#0x8
009cecc4	ldr x0,[sp, #0x28]
009cecc8	dup v1.2D,x9
009ceccc	add v0.2D,v0.2D,v1.2D
009cecd0	sub x8,x8,#0x8
009cecd4	str q0,[x24]
009cecd8	stur x8,[x24, #-0x18]
009cecdc	ldur x25,[x24, #-0x10]
009cece0	ldr x26,[x24]
009cece4	cmp x12,#0x0
009cece8	add x8,x27,#0x8
009cecec	sub x23,x24,#0x18
009cecf0	csel x28,x27,xzr,ne
009cecf4	csel x22,x8,xzr,ne
009cecf8	bl 0x00c35280
009cecfc	ldr x8,[sp, #0x50]
009ced00	mov x1,x25
009ced04	ldp x6,x25,[sp, #0x40]
009ced08	ubfx w7,w0,#0x15,#0x1
009ced0c	ldr x8,[x8, #0x9a8]
009ced10	mov x0,x23
009ced14	mov x2,x26
009ced18	mov x3,x28
009ced1c	ldr x8,[x8]
009ced20	mov x4,x22
009ced24	mov x5,x25
009ced28	str x8,[sp]
009ced2c	bl 0x00c36e10
009ced30	cbz w0,0x009ceda4
009ced34	add x20,x20,#0x1
009ced38	add x24,x24,#0x50
009ced3c	add x27,x27,#0x10
009ced40	cmp x20,x21
009ced44	mov w0,#0x1
009ced48	b.cc 0x009cec74
009ced4c	b 0x009ceda4
009ced50	ldr x0,[sp, #0x28]
009ced54	cmp w25,#0x1
009ced58	b.eq 0x009cecdc
009ced5c	ldr x8,[sp, #0x50]
009ced60	ldr x8,[x8, #0x8]
009ced64	ldr x8,[x8, #0xc0]
009ced68	ldrb w8,[x8, #0x60]
009ced6c	tbz w8,#0x0,0x009cecdc
009ced70	ldur x8,[x24, #-0x18]
009ced74	subs x8,x8,x25
009ced78	b.cc 0x009ceda0
009ced7c	ldp x9,x10,[x24]
009ced80	ldur x11,[x24, #-0x10]
009ced84	stur x8,[x24, #-0x18]
009ced88	add x8,x9,x25
009ced8c	add x9,x10,x25
009ced90	sub x10,x11,x25
009ced94	stp x8,x9,[x24]
009ced98	stur x10,[x24, #-0x10]
009ced9c	b 0x009cecdc
009ceda0	mov w0,wzr
009ceda4	add sp,sp,#0x480
009ceda8	ldp x29,x30,[sp, #0x50]
009cedac	ldp x20,x19,[sp, #0x40]
009cedb0	ldp x22,x21,[sp, #0x30]
009cedb4	ldp x24,x23,[sp, #0x20]
009cedb8	ldp x26,x25,[sp, #0x10]
009cedbc	ldp x28,x27,[sp], #0x60
009cedc0	ret
009cedc4	mov x0,x21
009cedc8	bl 0x00c35290
009cedcc	ldr x11,[sp, #0x20]
009cedd0	cmp w0,#0x7
009cedd4	b.ne 0x009cedf4
009cedd8	ldr q0,[x23, #0x20]
009ceddc	mov w8,#0x8
009cede0	dup v1.2D,x8
009cede4	add v0.2D,v0.2D,v1.2D
009cede8	str q0,[x23, #0x20]
009cedec	cbnz x11,0x009cee30
009cedf0	b 0x009cea58
009cedf4	ldr x12,[sp, #0x48]
009cedf8	cmp w12,#0x1
009cedfc	b.eq 0x009cee2c
009cee00	ldr x8,[x19, #0x8]
009cee04	ldr x8,[x8, #0xc0]
009cee08	ldrb w8,[x8, #0x60]
009cee0c	tbz w8,#0x0,0x009cee2c
009cee10	ldp x8,x9,[x23, #0x20]
009cee14	ldr x10,[x23, #0x10]
009cee18	add x8,x8,x12
009cee1c	add x9,x9,x12
009cee20	sub x10,x10,x12
009cee24	stp x8,x9,[x23, #0x20]
009cee28	str x10,[x23, #0x10]
009cee2c	cbz x11,0x009cea58
009cee30	ldr x1,[sp, #0x20]
009cee34	adrp x0,0x2cf000
009cee38	add x0,x0,#0x7ef
009cee3c	add x8,sp,#0x58
009cee40	mov x2,x20
009cee44	str wzr,[x1, #0x8]
009cee48	bl 0x00c36de0
009cee4c	ldr x8,[sp, #0x78]
009cee50	ldur q0,[sp, #0x68]
009cee54	ldur q1,[sp, #0x58]
009cee58	str x8,[sp, #0xa0]
009cee5c	add x8,sp,#0x58
009cee60	stp q1,q0,[sp, #0x80]
009cee64	bl 0x00c34c40
009cee68	ldr x8,[sp, #0x78]
009cee6c	ldur q0,[sp, #0x68]
009cee70	ldur q1,[sp, #0x58]
009cee74	add x1,sp,#0x80
009cee78	mov x0,x25
009cee7c	str x8,[sp, #0xc8]
009cee80	stur q0,[sp, #0xb8]
009cee84	stur q1,[sp, #0xa8]
009cee88	bl 0x00c36d50
009cee8c	cbnz w0,0x009cea58
009cee90	bl 0x00c342a0
009cee94	adrp x0,0x2cf000
009cee98	adrp x2,0x2bd000
009cee9c	add x0,x0,#0x7d6
009ceea0	add x2,x2,#0x69f
009ceea4	mov w1,#0x4cb
009ceea8	b 0x009ceb30

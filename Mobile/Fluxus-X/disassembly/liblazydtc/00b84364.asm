; mbedtls_mpi_core_montmul @ 00b84364
00b84364	sub sp,sp,#0x70
00b84368	stp x28,x27,[sp, #0x10]
00b8436c	stp x26,x25,[sp, #0x20]
00b84370	stp x24,x23,[sp, #0x30]
00b84374	stp x22,x21,[sp, #0x40]
00b84378	stp x20,x19,[sp, #0x50]
00b8437c	stp x29,x30,[sp, #0x60]
00b84380	add x29,sp,#0x60
00b84384	mov x24,x2
00b84388	mov w2,#0x8
00b8438c	mov x25,x1
00b84390	mov x19,x0
00b84394	bfm x2,x5,#0x3c,#0x3b
00b84398	mov x0,x7
00b8439c	mov w1,wzr
00b843a0	mov x21,x7
00b843a4	mov x23,x6
00b843a8	mov x20,x5
00b843ac	mov x22,x4
00b843b0	mov x26,x3
00b843b4	bl 0x00c301c0
00b843b8	cbz x20,0x00b847ec
00b843bc	adds x12,x20,#0x2
00b843c0	orr x9,xzr,#-0x3
00b843c4	mvn x13,x26
00b843c8	csel x11,x12,x20,cs
00b843cc	cmp x12,x26
00b843d0	sub x1,x9,x20
00b843d4	mvn x17,x20
00b843d8	csel x14,x12,x26,cc
00b843dc	cmp x13,x1
00b843e0	csinv x0,x1,x26,ls
00b843e4	cmp x17,x1
00b843e8	sub x9,x12,x11
00b843ec	lsr x10,x11,#0x3
00b843f0	and x11,x11,#0x7
00b843f4	sub x12,x12,x14
00b843f8	lsr x13,x14,#0x3
00b843fc	and x14,x14,#0x7
00b84400	csinv x17,x1,x20,ls
00b84404	str x19,[sp]
00b84408	mov x8,xzr
00b8440c	neg x15,x10
00b84410	neg x16,x11
00b84414	neg x19,x13
00b84418	neg x18,x14
00b8441c	sub x0,x1,x0
00b84420	sub x1,x1,x17
00b84424	mov x2,x21
00b84428	str x21,[sp, #0x8]
00b8442c	b 0x00b84444
00b84430	mov x28,x22
00b84434	mov x27,x2
00b84438	mov x21,x16
00b8443c	cbnz x11,0x00b84738
00b84440	b 0x00b84764
00b84444	ldr x26,[x25, x8, LSL #0x3]
00b84448	ldr x30,[x2]
00b8444c	ldr x21,[x24]
00b84450	mov x3,xzr
00b84454	cbz x13,0x00b84590
00b84458	mov x17,x19
00b8445c	mov x27,x2
00b84460	mov x28,x24
00b84464	ldr x4,[x28], #0x8
00b84468	ldr x5,[x27]
00b8446c	mul x6,x4,x26
00b84470	umulh x7,x4,x26
00b84474	adds x5,x5,x6
00b84478	adc x7,x7,xzr
00b8447c	adds x5,x5,x3
00b84480	adc x3,x7,xzr
00b84484	str x5,[x27], #0x8
00b84488	ldr x4,[x28], #0x8
00b8448c	ldr x5,[x27]
00b84490	mul x6,x4,x26
00b84494	umulh x7,x4,x26
00b84498	adds x5,x5,x6
00b8449c	adc x7,x7,xzr
00b844a0	adds x5,x5,x3
00b844a4	adc x3,x7,xzr
00b844a8	str x5,[x27], #0x8
00b844ac	ldr x4,[x28], #0x8
00b844b0	ldr x5,[x27]
00b844b4	mul x6,x4,x26
00b844b8	umulh x7,x4,x26
00b844bc	adds x5,x5,x6
00b844c0	adc x7,x7,xzr
00b844c4	adds x5,x5,x3
00b844c8	adc x3,x7,xzr
00b844cc	str x5,[x27], #0x8
00b844d0	ldr x4,[x28], #0x8
00b844d4	ldr x5,[x27]
00b844d8	mul x6,x4,x26
00b844dc	umulh x7,x4,x26
00b844e0	adds x5,x5,x6
00b844e4	adc x7,x7,xzr
00b844e8	adds x5,x5,x3
00b844ec	adc x3,x7,xzr
00b844f0	str x5,[x27], #0x8
00b844f4	ldr x4,[x28], #0x8
00b844f8	ldr x5,[x27]
00b844fc	mul x6,x4,x26
00b84500	umulh x7,x4,x26
00b84504	adds x5,x5,x6
00b84508	adc x7,x7,xzr
00b8450c	adds x5,x5,x3
00b84510	adc x3,x7,xzr
00b84514	str x5,[x27], #0x8
00b84518	ldr x4,[x28], #0x8
00b8451c	ldr x5,[x27]
00b84520	mul x6,x4,x26
00b84524	umulh x7,x4,x26
00b84528	adds x5,x5,x6
00b8452c	adc x7,x7,xzr
00b84530	adds x5,x5,x3
00b84534	adc x3,x7,xzr
00b84538	str x5,[x27], #0x8
00b8453c	ldr x4,[x28], #0x8
00b84540	ldr x5,[x27]
00b84544	mul x6,x4,x26
00b84548	umulh x7,x4,x26
00b8454c	adds x5,x5,x6
00b84550	adc x7,x7,xzr
00b84554	adds x5,x5,x3
00b84558	adc x3,x7,xzr
00b8455c	str x5,[x27], #0x8
00b84560	ldr x4,[x28], #0x8
00b84564	ldr x5,[x27]
00b84568	mul x6,x4,x26
00b8456c	umulh x7,x4,x26
00b84570	adds x5,x5,x6
00b84574	adc x7,x7,xzr
00b84578	adds x5,x5,x3
00b8457c	adc x3,x7,xzr
00b84580	str x5,[x27], #0x8
00b84584	adds x17,x17,#0x1
00b84588	b.ne 0x00b84464
00b8458c	b 0x00b84598
00b84590	mov x28,x24
00b84594	mov x27,x2
00b84598	madd x21,x21,x26,x30
00b8459c	mov x30,x18
00b845a0	cbz x14,0x00b845d0
00b845a4	ldr x4,[x28], #0x8
00b845a8	ldr x5,[x27]
00b845ac	mul x6,x4,x26
00b845b0	umulh x7,x4,x26
00b845b4	adds x5,x5,x6
00b845b8	adc x7,x7,xzr
00b845bc	adds x5,x5,x3
00b845c0	adc x3,x7,xzr
00b845c4	str x5,[x27], #0x8
00b845c8	adds x30,x30,#0x1
00b845cc	b.ne 0x00b845a4
00b845d0	mul x26,x21,x23
00b845d4	mov x17,x0
00b845d8	cbz x12,0x00b845f4
00b845dc	ldr x4,[x27]
00b845e0	adds x4,x4,x3
00b845e4	cset w3,cs
00b845e8	adds x17,x17,#0x1
00b845ec	str x4,[x27], #0x8
00b845f0	b.ne 0x00b845dc
00b845f4	mov x3,xzr
00b845f8	cbz x10,0x00b84430
00b845fc	mov x17,x15
00b84600	mov x27,x2
00b84604	mov x28,x22
00b84608	ldr x4,[x28], #0x8
00b8460c	ldr x5,[x27]
00b84610	mul x6,x4,x26
00b84614	umulh x7,x4,x26
00b84618	adds x5,x5,x6
00b8461c	adc x7,x7,xzr
00b84620	adds x5,x5,x3
00b84624	adc x3,x7,xzr
00b84628	str x5,[x27], #0x8
00b8462c	ldr x4,[x28], #0x8
00b84630	ldr x5,[x27]
00b84634	mul x6,x4,x26
00b84638	umulh x7,x4,x26
00b8463c	adds x5,x5,x6
00b84640	adc x7,x7,xzr
00b84644	adds x5,x5,x3
00b84648	adc x3,x7,xzr
00b8464c	str x5,[x27], #0x8
00b84650	ldr x4,[x28], #0x8
00b84654	ldr x5,[x27]
00b84658	mul x6,x4,x26
00b8465c	umulh x7,x4,x26
00b84660	adds x5,x5,x6
00b84664	adc x7,x7,xzr
00b84668	adds x5,x5,x3
00b8466c	adc x3,x7,xzr
00b84670	str x5,[x27], #0x8
00b84674	ldr x4,[x28], #0x8
00b84678	ldr x5,[x27]
00b8467c	mul x6,x4,x26
00b84680	umulh x7,x4,x26
00b84684	adds x5,x5,x6
00b84688	adc x7,x7,xzr
00b8468c	adds x5,x5,x3
00b84690	adc x3,x7,xzr
00b84694	str x5,[x27], #0x8
00b84698	ldr x4,[x28], #0x8
00b8469c	ldr x5,[x27]
00b846a0	mul x6,x4,x26
00b846a4	umulh x7,x4,x26
00b846a8	adds x5,x5,x6
00b846ac	adc x7,x7,xzr
00b846b0	adds x5,x5,x3
00b846b4	adc x3,x7,xzr
00b846b8	str x5,[x27], #0x8
00b846bc	ldr x4,[x28], #0x8
00b846c0	ldr x5,[x27]
00b846c4	mul x6,x4,x26
00b846c8	umulh x7,x4,x26
00b846cc	adds x5,x5,x6
00b846d0	adc x7,x7,xzr
00b846d4	adds x5,x5,x3
00b846d8	adc x3,x7,xzr
00b846dc	str x5,[x27], #0x8
00b846e0	ldr x4,[x28], #0x8
00b846e4	ldr x5,[x27]
00b846e8	mul x6,x4,x26
00b846ec	umulh x7,x4,x26
00b846f0	adds x5,x5,x6
00b846f4	adc x7,x7,xzr
00b846f8	adds x5,x5,x3
00b846fc	adc x3,x7,xzr
00b84700	str x5,[x27], #0x8
00b84704	ldr x4,[x28], #0x8
00b84708	ldr x5,[x27]
00b8470c	mul x6,x4,x26
00b84710	umulh x7,x4,x26
00b84714	adds x5,x5,x6
00b84718	adc x7,x7,xzr
00b8471c	adds x5,x5,x3
00b84720	adc x3,x7,xzr
00b84724	str x5,[x27], #0x8
00b84728	adds x17,x17,#0x1
00b8472c	b.ne 0x00b84608
00b84730	mov x21,x16
00b84734	cbz x11,0x00b84764
00b84738	ldr x4,[x28], #0x8
00b8473c	ldr x5,[x27]
00b84740	mul x6,x4,x26
00b84744	umulh x7,x4,x26
00b84748	adds x5,x5,x6
00b8474c	adc x7,x7,xzr
00b84750	adds x5,x5,x3
00b84754	adc x3,x7,xzr
00b84758	str x5,[x27], #0x8
00b8475c	adds x21,x21,#0x1
00b84760	b.ne 0x00b84738
00b84764	mov x17,x1
00b84768	cbz x9,0x00b84784
00b8476c	ldr x4,[x27]
00b84770	adds x4,x4,x3
00b84774	cset w3,cs
00b84778	adds x17,x17,#0x1
00b8477c	str x4,[x27], #0x8
00b84780	b.ne 0x00b8476c
00b84784	add x8,x8,#0x1
00b84788	cmp x8,x20
00b8478c	add x2,x2,#0x8
00b84790	b.ne 0x00b84444
00b84794	ldr x21,[sp, #0x8]
00b84798	lsl x8,x20,#0x3
00b8479c	mov x9,xzr
00b847a0	add x21,x21,x8
00b847a4	ldr x8,[x21, x8#0x0]
00b847a8	cbz x20,0x00b847f8
00b847ac	ldr x19,[sp]
00b847b0	mov w10,#0x2
00b847b4	mov x11,x21
00b847b8	mov x13,x20
00b847bc	mov x12,x19
00b847c0	ldr x14,[x11], #0x8
00b847c4	ldr x15,[x22], #0x8
00b847c8	subs x9,x14,x9
00b847cc	cset w14,cc
00b847d0	csinc x16,x10,xzr,cc
00b847d4	subs x15,x9,x15
00b847d8	csel x9,x14,x16,cs
00b847dc	subs x13,x13,#0x1
00b847e0	str x15,[x12], #0x8
00b847e4	b.ne 0x00b847c0
00b847e8	b 0x00b847fc
00b847ec	ldr x8,[x21, x20, LSL #0x3]
00b847f0	mov x9,xzr
00b847f4	b 0x00b847fc
00b847f8	ldr x19,[sp]
00b847fc	eor x0,x9,x8
00b84800	neg x8,x0
00b84804	orr x0,x8,x0
00b84808	asr x0,x0,#0x3f
00b8480c	lsl x4,x20,#0x3
00b84810	mov x1,x19
00b84814	mov x2,x21
00b84818	ldp x29,x30,[sp, #0x60]
00b8481c	ldp x20,x19,[sp, #0x50]
00b84820	ldp x22,x21,[sp, #0x40]
00b84824	ldp x24,x23,[sp, #0x30]
00b84828	ldp x26,x25,[sp, #0x20]
00b8482c	ldp x28,x27,[sp, #0x10]
00b84830	mov x3,xzr
00b84834	add sp,sp,#0x70
00b84838	b 0x00c423f0

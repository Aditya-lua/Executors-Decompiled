; BN_nist_mod_384 @ 00a29360
00a29360	sub sp,sp,#0xa0
00a29364	stp x24,x23,[sp, #0x60]
00a29368	stp x22,x21,[sp, #0x70]
00a2936c	stp x20,x19,[sp, #0x80]
00a29370	stp x29,x30,[sp, #0x90]
00a29374	ldr w23,[x1, #0x8]
00a29378	ldr x22,[x1]
00a2937c	mov x19,x0
00a29380	mov x0,x1
00a29384	add x29,sp,#0x90
00a29388	mov x21,x3
00a2938c	mov x20,x1
00a29390	bl 0x00c37f40
00a29394	cbnz w0,0x00a293ac
00a29398	adrp x1,0xc5b000
00a2939c	add x1,x1,#0xf38
00a293a0	mov x0,x20
00a293a4	bl 0x00c369c0
00a293a8	tbnz w0,#0x1f,0x00a293dc
00a293ac	adrp x2,0xc5b000
00a293b0	add x2,x2,#0xec0
00a293b4	mov x0,x19
00a293b8	mov x1,x20
00a293bc	mov x3,x21
00a293c0	bl 0x00c38f30
00a293c4	ldp x29,x30,[sp, #0x90]
00a293c8	ldp x20,x19,[sp, #0x80]
00a293cc	ldp x22,x21,[sp, #0x70]
00a293d0	ldp x24,x23,[sp, #0x60]
00a293d4	add sp,sp,#0xa0
00a293d8	ret
00a293dc	adrp x0,0xc5b000
00a293e0	add x0,x0,#0xec0
00a293e4	mov x1,x20
00a293e8	bl 0x00c369c0
00a293ec	cbz w0,0x00a29418
00a293f0	cmp w0,#0x1
00a293f4	b.lt 0x00a29424
00a293f8	cmp x19,x20
00a293fc	b.eq 0x00a29814
00a29400	mov x0,x19
00a29404	mov x1,x20
00a29408	bl 0x00c36990
00a2940c	cmp x0,#0x0
00a29410	cset w0,ne
00a29414	b 0x00a293c4
00a29418	mov x0,x19
00a2941c	bl 0x00c38e00
00a29420	b 0x00a29814
00a29424	cmp x19,x20
00a29428	b.eq 0x00a29474
00a2942c	orr w1,wzr,#0x6
00a29430	mov x0,x19
00a29434	bl 0x00c38e80
00a29438	cbz x0,0x00a293c4
00a2943c	ldr x20,[x19]
00a29440	ldr x8,[x22]
00a29444	str x8,[x20]
00a29448	ldr x8,[x22, #0x8]
00a2944c	str x8,[x20, #0x8]
00a29450	ldr x8,[x22, #0x10]
00a29454	str x8,[x20, #0x10]
00a29458	ldr x8,[x22, #0x18]
00a2945c	str x8,[x20, #0x18]
00a29460	ldr x8,[x22, #0x20]
00a29464	str x8,[x20, #0x20]
00a29468	ldr x8,[x22, #0x28]
00a2946c	str x8,[x20, #0x28]
00a29470	b 0x00a29478
00a29474	mov x20,x22
00a29478	cmp w23,#0x7
00a2947c	mov w8,wzr
00a29480	b.lt 0x00a29520
00a29484	sub w8,w23,#0x6
00a29488	cmp w8,#0x3
00a2948c	mov x9,xzr
00a29490	b.ls 0x00a294f0
00a29494	lsl x9,x8,#0x3
00a29498	add x10,x22,x9
00a2949c	add x11,sp,#0x30
00a294a0	add x10,x10,#0x30
00a294a4	cmp x11,x10
00a294a8	b.cs 0x00a294c0
00a294ac	add x10,x22,#0x30
00a294b0	add x9,x11,x9
00a294b4	cmp x10,x9
00a294b8	mov x9,xzr
00a294bc	b.cc 0x00a294f0
00a294c0	and x9,x8,#0xfffffffc
00a294c4	add x10,x22,#0x40
00a294c8	add x11,x11,#0x10
00a294cc	mov x12,x9
00a294d0	ldp q0,q1,[x10, #-0x10]
00a294d4	add x10,x10,#0x20
00a294d8	subs x12,x12,#0x4
00a294dc	stp q0,q1,[x11, #-0x10]
00a294e0	add x11,x11,#0x20
00a294e4	b.ne 0x00a294d0
00a294e8	cmp x9,x8
00a294ec	b.eq 0x00a29518
00a294f0	lsl x10,x9,#0x3
00a294f4	add x11,sp,#0x30
00a294f8	add x12,x22,x10
00a294fc	add x10,x11,x10
00a29500	add x11,x12,#0x30
00a29504	sub x9,x8,x9
00a29508	ldr x12,[x11], #0x8
00a2950c	subs x9,x9,#0x1
00a29510	str x12,[x10], #0x8
00a29514	b.ne 0x00a29508
00a29518	cmp w8,#0x5
00a2951c	b.hi 0x00a29540
00a29520	add x9,sp,#0x30
00a29524	mov w10,#0x5
00a29528	add x0,x9,w8, UXTW  #0x3
00a2952c	sub w8,w10,w8
00a29530	lsl x8,x8,#0x3
00a29534	add x2,x8,#0x8
00a29538	mov w1,wzr
00a2953c	bl 0x00c301c0
00a29540	ldp x8,x9,[sp, #0x50]
00a29544	add x0,x20,#0x10
00a29548	add x10,sp,#0x30
00a2954c	movi v0.2D,#0x0
00a29550	extr x8,x9,x8,#0x20
00a29554	lsr x9,x9,#0x1f
00a29558	lsl x8,x8,#0x1
00a2955c	mov x2,sp
00a29560	mov w3,#0x4
00a29564	mov x1,x0
00a29568	add x22,x10,#0x20
00a2956c	stp x8,x9,[sp]
00a29570	str q0,[sp, #0x10]
00a29574	bl 0x00c388b0
00a29578	mov x21,x0
00a2957c	add x2,sp,#0x30
00a29580	orr w3,wzr,#0x6
00a29584	mov x0,x20
00a29588	mov x1,x20
00a2958c	bl 0x00c388b0
00a29590	ldp x8,x9,[sp, #0x50]
00a29594	ldp x10,x11,[sp, #0x30]
00a29598	ldp x12,x13,[sp, #0x40]
00a2959c	add w21,w0,w21
00a295a0	extr x14,x9,x8,#0x20
00a295a4	extr x9,x10,x9,#0x20
00a295a8	extr x10,x11,x10,#0x20
00a295ac	extr x11,x12,x11,#0x20
00a295b0	extr x12,x13,x12,#0x20
00a295b4	extr x8,x8,x13,#0x20
00a295b8	mov x2,sp
00a295bc	orr w3,wzr,#0x6
00a295c0	mov x0,x20
00a295c4	mov x1,x20
00a295c8	stp x14,x9,[sp]
00a295cc	stp x10,x11,[sp, #0x10]
00a295d0	stp x12,x8,[sp, #0x20]
00a295d4	bl 0x00c388b0
00a295d8	ldp x9,x8,[sp, #0x50]
00a295dc	ldp q0,q1,[sp, #0x30]
00a295e0	add w21,w21,w0
00a295e4	mov x2,sp
00a295e8	and x8,x8,#-0x100000000
00a295ec	lsl x9,x9,#0x20
00a295f0	orr w3,wzr,#0x6
00a295f4	mov x0,x20
00a295f8	mov x1,x20
00a295fc	stp x8,x9,[sp]
00a29600	stp q0,q1,[sp, #0x10]
00a29604	bl 0x00c388b0
00a29608	ldr q0,[sp, #0x50]
00a2960c	add w21,w21,w0
00a29610	movi v1.2D,#0x0
00a29614	mov x2,sp
00a29618	orr w3,wzr,#0x6
00a2961c	mov x0,x20
00a29620	mov x1,x20
00a29624	stp q1,q0,[sp]
00a29628	str q1,[sp, #0x20]
00a2962c	bl 0x00c388b0
00a29630	adrp x8,0x29c000
00a29634	ld1r {v0.2D},[x22]
00a29638	ldr q1,[x8, #0x720]
00a2963c	ldr x8,[sp, #0x58]
00a29640	add w21,w21,w0
00a29644	mov x2,sp
00a29648	and v0.16B,v0.16B,v1.16B
00a2964c	str q0,[sp]
00a29650	movi v0.2D,#0x0
00a29654	orr w3,wzr,#0x6
00a29658	mov x0,x20
00a2965c	mov x1,x20
00a29660	stp x8,xzr,[sp, #0x10]
00a29664	str q0,[sp, #0x20]
00a29668	bl 0x00c388b0
00a2966c	ldp x13,x8,[sp, #0x50]
00a29670	ldp x9,x10,[sp, #0x30]
00a29674	ldp x11,x12,[sp, #0x40]
00a29678	add w21,w21,w0
00a2967c	mov x2,sp
00a29680	extr x14,x9,x8,#0x20
00a29684	extr x9,x10,x9,#0x20
00a29688	extr x10,x11,x10,#0x20
00a2968c	extr x11,x12,x11,#0x20
00a29690	extr x12,x13,x12,#0x20
00a29694	extr x8,x8,x13,#0x20
00a29698	orr w3,wzr,#0x6
00a2969c	mov x0,x20
00a296a0	mov x1,x20
00a296a4	stp x14,x9,[sp]
00a296a8	stp x10,x11,[sp, #0x10]
00a296ac	stp x12,x8,[sp, #0x20]
00a296b0	bl 0x00c38940
00a296b4	ldp x8,x9,[sp, #0x50]
00a296b8	sub w21,w21,w0
00a296bc	movi v0.2D,#0x0
00a296c0	mov x2,sp
00a296c4	lsl x10,x8,#0x20
00a296c8	extr x8,x9,x8,#0x20
00a296cc	lsr x9,x9,#0x20
00a296d0	orr w3,wzr,#0x6
00a296d4	mov x0,x20
00a296d8	mov x1,x20
00a296dc	stp x10,x8,[sp]
00a296e0	stp x9,xzr,[sp, #0x10]
00a296e4	str q0,[sp, #0x20]
00a296e8	bl 0x00c38940
00a296ec	ldr x8,[sp, #0x58]
00a296f0	sub w21,w21,w0
00a296f4	movi v0.2D,#0x0
00a296f8	mov x2,sp
00a296fc	and x9,x8,#-0x100000000
00a29700	lsr x8,x8,#0x20
00a29704	orr w3,wzr,#0x6
00a29708	mov x0,x20
00a2970c	mov x1,x20
00a29710	stp xzr,x9,[sp]
00a29714	stp x8,xzr,[sp, #0x10]
00a29718	str q0,[sp, #0x20]
00a2971c	bl 0x00c38940
00a29720	sub w8,w21,w0
00a29724	cmp w8,#0x1
00a29728	b.lt 0x00a29760
00a2972c	adrp x9,0x758000
00a29730	add x9,x9,#0xa28
00a29734	orr w10,wzr,#0x30
00a29738	smaddl x8,w8,w10,x9
00a2973c	sub x2,x8,#0x30
00a29740	orr w3,wzr,#0x6
00a29744	mov x0,x20
00a29748	mov x1,x20
00a2974c	bl 0x00c38940
00a29750	adrp x22,0xcb5000
00a29754	ldr x22,[x22, #0x3e0]
00a29758	mov x21,x0
00a2975c	b 0x00a297ac
00a29760	adrp x22,0xcb5000
00a29764	ldr x22,[x22, #0x3e0]
00a29768	tbnz w8,#0x1f,0x00a29774
00a2976c	mov w21,#0x1
00a29770	b 0x00a297ac
00a29774	adrp x9,0x758000
00a29778	mvn w8,w8
00a2977c	add x9,x9,#0xa28
00a29780	orr w10,wzr,#0x30
00a29784	smaddl x2,w8,w10,x9
00a29788	orr w3,wzr,#0x6
00a2978c	mov x0,x20
00a29790	mov x1,x20
00a29794	bl 0x00c388b0
00a29798	adrp x8,0xcb5000
00a2979c	ldr x8,[x8, #0x3d8]
00a297a0	mov x21,x0
00a297a4	cmp w21,#0x0
00a297a8	csel x22,x8,x22,eq
00a297ac	adrp x2,0x758000
00a297b0	add x2,x2,#0xa28
00a297b4	mov x0,sp
00a297b8	orr w3,wzr,#0x6
00a297bc	mov x1,x20
00a297c0	mov x23,sp
00a297c4	orr w24,wzr,#0x6
00a297c8	blr x22
00a297cc	cmp x0,#0x0
00a297d0	ccmp w21,#0x0,#0x4,ne
00a297d4	csel x8,x20,x23,ne
00a297d8	ldr x9,[x8]
00a297dc	mov x0,x19
00a297e0	str x9,[x20]
00a297e4	ldr x9,[x8, #0x8]
00a297e8	str x9,[x20, #0x8]
00a297ec	ldr x9,[x8, #0x10]
00a297f0	str x9,[x20, #0x10]
00a297f4	ldr x9,[x8, #0x18]
00a297f8	str x9,[x20, #0x18]
00a297fc	ldr x9,[x8, #0x20]
00a29800	str x9,[x20, #0x20]
00a29804	ldr x8,[x8, #0x28]
00a29808	str x8,[x20, #0x28]
00a2980c	str w24,[x19, #0x8]
00a29810	bl 0x00c38e40
00a29814	mov w0,#0x1
00a29818	b 0x00a293c4

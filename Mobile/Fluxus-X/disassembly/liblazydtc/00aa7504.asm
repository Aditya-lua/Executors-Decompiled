; CRYPTO_cbc128_decrypt @ 00aa7504
00aa7504	sub sp,sp,#0xa0
00aa7508	stp x28,x27,[sp, #0x40]
00aa750c	stp x26,x25,[sp, #0x50]
00aa7510	stp x24,x23,[sp, #0x60]
00aa7514	stp x22,x21,[sp, #0x70]
00aa7518	stp x20,x19,[sp, #0x80]
00aa751c	stp x29,x30,[sp, #0x90]
00aa7520	add x29,sp,#0x90
00aa7524	cbz x2,0x00aa789c
00aa7528	mov x21,x5
00aa752c	mov x19,x4
00aa7530	mov x28,x3
00aa7534	mov x23,x2
00aa7538	mov x26,x0
00aa753c	cmp x0,x1
00aa7540	b.eq 0x00aa75e4
00aa7544	subs x20,x23,#0x10
00aa7548	b.cc 0x00aa7674
00aa754c	and x25,x20,#-0x10
00aa7550	add x8,x25,#0x10
00aa7554	str x8,[sp, #0x20]
00aa7558	add x8,x1,x8
00aa755c	str x8,[sp, #0x28]
00aa7560	mov x8,x26
00aa7564	mov x27,x19
00aa7568	mov x0,x8
00aa756c	mov x2,x28
00aa7570	mov x24,x8
00aa7574	mov x22,x1
00aa7578	blr x21
00aa757c	ldr x8,[x27]
00aa7580	ldp x9,x10,[x22]
00aa7584	sub x23,x23,#0x10
00aa7588	mov x1,x22
00aa758c	cmp x23,#0xf
00aa7590	eor x8,x9,x8
00aa7594	str x8,[x22]
00aa7598	ldr x9,[x27, #0x8]
00aa759c	add x8,x24,#0x10
00aa75a0	add x1,x22,#0x10
00aa75a4	mov x27,x24
00aa75a8	eor x9,x10,x9
00aa75ac	str x9,[x22, #0x8]
00aa75b0	b.hi 0x00aa7568
00aa75b4	ldr x8,[sp, #0x20]
00aa75b8	add x9,x26,x25
00aa75bc	sub x23,x20,x25
00aa75c0	cmp x9,x19
00aa75c4	add x26,x26,x8
00aa75c8	b.eq 0x00aa7668
00aa75cc	ldr q0,[x9]
00aa75d0	ldr x20,[sp, #0x28]
00aa75d4	str q0,[x19]
00aa75d8	mov x1,x20
00aa75dc	cbnz x23,0x00aa7674
00aa75e0	b 0x00aa789c
00aa75e4	subs x22,x23,#0x10
00aa75e8	b.cc 0x00aa7660
00aa75ec	mov x24,x23
00aa75f0	and x23,x22,#-0x10
00aa75f4	add x8,x26,x23
00aa75f8	add x20,x8,#0x10
00aa75fc	add x1,sp,#0x30
00aa7600	mov x0,x26
00aa7604	mov x2,x28
00aa7608	blr x21
00aa760c	ldr x8,[sp, #0x30]
00aa7610	ldr x9,[x19]
00aa7614	ldr x10,[x26]
00aa7618	sub x24,x24,#0x10
00aa761c	cmp x24,#0xf
00aa7620	eor x8,x9,x8
00aa7624	str x8,[x26]
00aa7628	str x10,[x19]
00aa762c	ldr x8,[sp, #0x38]
00aa7630	ldr x9,[x19, #0x8]
00aa7634	ldr x10,[x26, #0x8]
00aa7638	eor x8,x9,x8
00aa763c	str x8,[x26, #0x8]
00aa7640	add x26,x26,#0x10
00aa7644	str x10,[x19, #0x8]
00aa7648	b.hi 0x00aa75fc
00aa764c	sub x23,x22,x23
00aa7650	mov x26,x20
00aa7654	mov x1,x20
00aa7658	cbnz x23,0x00aa7674
00aa765c	b 0x00aa789c
00aa7660	mov x1,x26
00aa7664	b 0x00aa7674
00aa7668	ldr x20,[sp, #0x28]
00aa766c	mov x1,x20
00aa7670	cbz x23,0x00aa789c
00aa7674	add x27,sp,#0x30
00aa7678	stp x28,x21,[sp, #0x18]
00aa767c	mov x8,xzr
00aa7680	add x28,x19,#0x10
00aa7684	add x20,x27,#0x10
00aa7688	mov x22,x23
00aa768c	mov x25,x1
00aa7690	mov x24,x26
00aa7694	stp x1,x26,[sp]
00aa7698	str x23,[sp, #0x10]
00aa769c	b 0x00aa76b0
00aa76a0	ldr x8,[sp, #0x28]
00aa76a4	add x24,x24,#0x10
00aa76a8	add x25,x25,#0x10
00aa76ac	add x8,x8,#0x1
00aa76b0	lsl x26,x8,#0x4
00aa76b4	str x8,[sp, #0x28]
00aa76b8	sub x8,x23,x26
00aa76bc	cmp x8,#0x1
00aa76c0	csinc x8,x8,xzr,hi
00aa76c4	neg x9,x8
00aa76c8	cmn x9,#0x10
00aa76cc	orr x9,xzr,#-0x10
00aa76d0	csneg x21,x9,x8,ls
00aa76d4	ldp x2,x8,[sp, #0x18]
00aa76d8	add x1,sp,#0x30
00aa76dc	mov x0,x24
00aa76e0	neg x23,x21
00aa76e4	blr x8
00aa76e8	cmp x23,#0x20
00aa76ec	b.cc 0x00aa77c0
00aa76f0	ldr x8,[sp]
00aa76f4	sub x15,x19,x21
00aa76f8	sub x16,x27,x21
00aa76fc	add x9,x8,x26
00aa7700	ldr x8,[sp, #0x8]
00aa7704	sub x10,x9,x21
00aa7708	cmp x9,x15
00aa770c	add x11,x8,x26
00aa7710	sub x14,x11,x21
00aa7714	cset w8,cc
00aa7718	cmp x10,x19
00aa771c	cset w12,hi
00aa7720	cmp x9,x14
00aa7724	and w17,w8,w12
00aa7728	cset w8,cc
00aa772c	cmp x11,x10
00aa7730	cset w12,cc
00aa7734	cmp x9,x16
00aa7738	cset w9,cc
00aa773c	cmp x10,x27
00aa7740	cset w13,hi
00aa7744	cmp x14,x19
00aa7748	cset w10,hi
00aa774c	cmp x11,x15
00aa7750	cset w14,cc
00aa7754	cmp x16,x19
00aa7758	cset w11,hi
00aa775c	cmp x15,x27
00aa7760	cset w15,hi
00aa7764	tbnz w17,#0x0,0x00aa77c0
00aa7768	and w8,w8,w12
00aa776c	tbnz w8,#0x0,0x00aa77c0
00aa7770	and w8,w9,w13
00aa7774	tbnz w8,#0x0,0x00aa77c0
00aa7778	and w8,w10,w14
00aa777c	tbnz w8,#0x0,0x00aa77c0
00aa7780	and w8,w11,w15
00aa7784	tbnz w8,#0x0,0x00aa77c0
00aa7788	mov x8,xzr
00aa778c	add x10,x28,x8
00aa7790	add x9,x24,x8
00aa7794	ldr q0,[x27,x8]
00aa7798	ldr q1,[x20,x8]
00aa779c	ldp q4,q5,[x10, #-0x10]
00aa77a0	ldp q2,q3,[x9]
00aa77a4	add x9,x25,x8
00aa77a8	adds x8,x8,#0x20
00aa77ac	eor v0.16B,v4.16B,v0.16B
00aa77b0	eor v1.16B,v5.16B,v1.16B
00aa77b4	stp q0,q1,[x9]
00aa77b8	stp q2,q3,[x10, #-0x10]
00aa77bc	b.ne 0x00aa778c
00aa77c0	mov x8,xzr
00aa77c4	mov w9,#0x10
00aa77c8	ldrb w10,[x27, x8]
00aa77cc	ldrb w11,[x19, x8]
00aa77d0	ldrb w12,[x24, x8]
00aa77d4	sub x9,x9,#0x1
00aa77d8	eor w10,w11,w10
00aa77dc	strb w10,[x25, x8]
00aa77e0	strb w12,[x19, x8]
00aa77e4	add x8,x8,#0x1
00aa77e8	cmp x8,#0xf
00aa77ec	b.hi 0x00aa77f8
00aa77f0	cmp x8,x22
00aa77f4	b.cc 0x00aa77c8
00aa77f8	ldr x23,[sp, #0x10]
00aa77fc	subs x22,x22,#0x10
00aa7800	b.hi 0x00aa76a0
00aa7804	cmp x8,#0xf
00aa7808	b.hi 0x00aa789c
00aa780c	mov w10,#0x10
00aa7810	sub x10,x10,x8
00aa7814	cmp x10,#0x20
00aa7818	b.cc 0x00aa7888
00aa781c	add x11,x19,x8
00aa7820	add x12,x24,#0x10
00aa7824	cmp x11,x12
00aa7828	b.cs 0x00aa783c
00aa782c	add x11,x19,#0x10
00aa7830	add x12,x24,x8
00aa7834	cmp x12,x11
00aa7838	b.cc 0x00aa7888
00aa783c	and x9,x9,#-0x20
00aa7840	mov w14,#0x10
00aa7844	add x12,x24,x8
00aa7848	add x13,x19,x8
00aa784c	add x9,x9,x8
00aa7850	sub x8,x14,x8
00aa7854	and x11,x10,#-0x20
00aa7858	add x12,x12,#0x10
00aa785c	add x13,x13,#0x10
00aa7860	and x8,x8,#-0x20
00aa7864	ldp q0,q1,[x12, #-0x10]
00aa7868	subs x8,x8,#0x20
00aa786c	add x12,x12,#0x20
00aa7870	stp q0,q1,[x13, #-0x10]
00aa7874	add x13,x13,#0x20
00aa7878	b.ne 0x00aa7864
00aa787c	cmp x10,x11
00aa7880	mov x8,x9
00aa7884	b.eq 0x00aa789c
00aa7888	ldrb w9,[x24, x8]
00aa788c	strb w9,[x19, x8]
00aa7890	add x8,x8,#0x1
00aa7894	cmp x8,#0x10
00aa7898	b.ne 0x00aa7888
00aa789c	ldp x29,x30,[sp, #0x90]
00aa78a0	ldp x20,x19,[sp, #0x80]
00aa78a4	ldp x22,x21,[sp, #0x70]
00aa78a8	ldp x24,x23,[sp, #0x60]
00aa78ac	ldp x26,x25,[sp, #0x50]
00aa78b0	ldp x28,x27,[sp, #0x40]
00aa78b4	add sp,sp,#0xa0
00aa78b8	ret

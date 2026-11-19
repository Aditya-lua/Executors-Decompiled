; bn_div_fixed_top @ 00a043a0
00a043a0	sub sp,sp,#0xe0
00a043a4	stp x24,x23,[sp, #0xa0]
00a043a8	mov x24,x0
00a043ac	mov x0,x4
00a043b0	stp x28,x27,[sp, #0x80]
00a043b4	stp x26,x25,[sp, #0x90]
00a043b8	stp x22,x21,[sp, #0xb0]
00a043bc	stp x20,x19,[sp, #0xc0]
00a043c0	stp x29,x30,[sp, #0xd0]
00a043c4	add x29,sp,#0xd0
00a043c8	mov x23,x4
00a043cc	mov x20,x3
00a043d0	mov x28,x2
00a043d4	mov x27,x1
00a043d8	bl 0x00c38a90
00a043dc	cbnz x24,0x00a043ec
00a043e0	mov x0,x23
00a043e4	bl 0x00c38a40
00a043e8	mov x24,x0
00a043ec	mov x0,x23
00a043f0	bl 0x00c38a40
00a043f4	str x0,[sp, #0x68]
00a043f8	mov x0,x23
00a043fc	bl 0x00c38a40
00a04400	mov x22,x0
00a04404	mov x0,x23
00a04408	bl 0x00c38a40
00a0440c	cbz x0,0x00a047fc
00a04410	mov x1,x20
00a04414	stur x0,[x29, #-0x58]
00a04418	bl 0x00c36990
00a0441c	ldur x8,[x29, #-0x58]
00a04420	cbz x0,0x00a047fc
00a04424	ldr w19,[x8, #0x8]
00a04428	ldr x21,[x8]
00a0442c	subs w8,w19,#0x1
00a04430	ldr x0,[x21, w8, SXTW #0x3]
00a04434	bl 0x00c38d80
00a04438	mov w8,#0x40
00a0443c	add w9,w0,#0x3f
00a04440	cmp w0,#0x0
00a04444	csel w9,w9,w0,lt
00a04448	cmp w19,#0x1
00a0444c	sub w2,w8,w0
00a04450	b.lt 0x00a04494
00a04454	and w11,w9,#0xffffffc0
00a04458	mov x10,xzr
00a0445c	sub w11,w0,w11
00a04460	sub x10,x10,w11, SXTW 
00a04464	mov x8,xzr
00a04468	mov w9,w2
00a0446c	orr x10,x10,x10, LSR #0x8
00a04470	mov w11,w11
00a04474	ldr x12,[x21]
00a04478	subs x19,x19,#0x1
00a0447c	lsl x13,x12,x9
00a04480	lsr x12,x12,x11
00a04484	orr x8,x13,x8
00a04488	str x8,[x21], #0x8
00a0448c	and x8,x12,x10
00a04490	b.ne 0x00a04474
00a04494	ldur x19,[x29, #-0x58]
00a04498	mov x0,x22
00a0449c	mov x1,x28
00a044a0	str w2,[sp, #0x2c]
00a044a4	str wzr,[x19, #0x10]
00a044a8	bl 0x00c39030
00a044ac	cbz w0,0x00a047fc
00a044b0	mov x8,x19
00a044b4	ldr w25,[x19, #0x8]
00a044b8	ldr w19,[x22, #0x8]
00a044bc	mov x26,x22
00a044c0	cmp w25,w19
00a044c4	b.lt 0x00a04508
00a044c8	add w21,w25,#0x1
00a044cc	mov x0,x26
00a044d0	mov w1,w21
00a044d4	bl 0x00c38e80
00a044d8	cbz x0,0x00a047fc
00a044dc	ldr x8,[x22]
00a044e0	sxtw x9,w19
00a044e4	sub w10,w21,w19
00a044e8	sbfiz x2,x10,#0x3,#0x20
00a044ec	add x0,x8,x9, LSL #0x3
00a044f0	mov w1,wzr
00a044f4	mov x26,x22
00a044f8	bl 0x00c301c0
00a044fc	ldur x8,[x29, #-0x58]
00a04500	mov w19,w21
00a04504	str w21,[x22, #0x8]
00a04508	ldr x8,[x8]
00a0450c	subs w9,w25,#0x1
00a04510	str x26,[sp, #0x18]
00a04514	ldr x21,[x26]
00a04518	ldr x26,[x8, w9, SXTW #0x3]
00a0451c	mov x10,xzr
00a04520	sub w22,w19,w25
00a04524	b.eq 0x00a04530
00a04528	sub w9,w25,#0x2
00a0452c	ldr x10,[x8, w9, SXTW #0x3]
00a04530	mov x0,x24
00a04534	mov w1,w22
00a04538	str x10,[sp, #0x38]
00a0453c	bl 0x00c38e80
00a04540	cbz x0,0x00a047fc
00a04544	ldr w28,[x28, #0x10]
00a04548	ldr w8,[x20, #0x10]
00a0454c	ldr x0,[sp, #0x68]
00a04550	ldr x20,[x24]
00a04554	add w1,w25,#0x1
00a04558	eor w8,w8,w28
00a0455c	str w22,[x24, #0x8]
00a04560	str w8,[x24, #0x10]
00a04564	str w1,[sp, #0x64]
00a04568	bl 0x00c38e80
00a0456c	cbz x0,0x00a047fc
00a04570	stp x27,x23,[sp, #0x8]
00a04574	ldr x23,[sp, #0x68]
00a04578	cmp w22,#0x1
00a0457c	str w28,[sp, #0x4]
00a04580	b.lt 0x00a047c4
00a04584	ldr x10,[sp, #0x38]
00a04588	mov x11,x22
00a0458c	sub w8,w19,#0x1
00a04590	sxtw x9,w25
00a04594	mov x13,x20
00a04598	stp x9,x11,[sp, #0x50]
00a0459c	sxtw x9,w22
00a045a0	and x12,x10,#0xffffffff
00a045a4	lsr x10,x10,#0x20
00a045a8	add x19,x21,w8, SXTW  #0x3
00a045ac	mov w28,wzr
00a045b0	add x20,x21,w11, SXTW  #0x3
00a045b4	stp x10,x12,[sp, #0x40]
00a045b8	and x10,x25,#0xfffffffc
00a045bc	add x22,x13,x9, LSL #0x3
00a045c0	neg x8,x26
00a045c4	mov x24,x19
00a045c8	str x10,[sp, #0x30]
00a045cc	str x8,[sp, #0x20]
00a045d0	ldr x0,[x19]
00a045d4	ldr x21,[x24, #-0x8]!
00a045d8	cmp x0,x26
00a045dc	stur x24,[x29, #-0x60]
00a045e0	b.ne 0x00a045ec
00a045e4	mov x24,#-0x1
00a045e8	b 0x00a046ac
00a045ec	cmp x19,x20
00a045f0	b.eq 0x00a045fc
00a045f4	ldur x23,[x19, #-0x10]
00a045f8	b 0x00a04600
00a045fc	mov x23,xzr
00a04600	mov x1,x21
00a04604	mov x2,x26
00a04608	bl 0x00c388c0
00a0460c	ldp x13,x12,[sp, #0x40]
00a04610	and x8,x0,#0xffffffff
00a04614	lsr x9,x0,#0x20
00a04618	msub x10,x0,x26,x21
00a0461c	mul x11,x9,x12
00a04620	mul x12,x8,x12
00a04624	mul x8,x8,x13
00a04628	mul x9,x9,x13
00a0462c	adds x11,x11,x8
00a04630	cset w13,cs
00a04634	add x9,x9,x11, LSR #0x20
00a04638	adds x8,x12,x11, LSL #0x20
00a0463c	add x9,x9,x13, LSL #0x20
00a04640	cinc x9,x9,cs
00a04644	mov x24,x0
00a04648	cmp x9,x10
00a0464c	b.cc 0x00a046a8
00a04650	ldr x10,[sp, #0x20]
00a04654	ldr x13,[sp, #0x38]
00a04658	mov w11,#0x1
00a0465c	sub x11,x11,x24
00a04660	mul x10,x10,x24
00a04664	mul x11,x26,x11
00a04668	cmp x8,x23
00a0466c	b.hi 0x00a0467c
00a04670	add x12,x10,x21
00a04674	cmp x12,x9
00a04678	b.eq 0x00a046a8
00a0467c	add x12,x11,x21
00a04680	cmp x12,x26
00a04684	sub x24,x24,#0x1
00a04688	b.cc 0x00a046a8
00a0468c	subs x8,x8,x13
00a04690	add x21,x21,x26
00a04694	cset w12,cc
00a04698	sub x9,x9,x12
00a0469c	add x12,x10,x21
00a046a0	cmp x9,x12
00a046a4	b.cs 0x00a04668
00a046a8	ldr x23,[sp, #0x68]
00a046ac	ldur x27,[x29, #-0x58]
00a046b0	ldr x0,[x23]
00a046b4	mov w2,w25
00a046b8	mov x3,x24
00a046bc	ldr x1,[x27]
00a046c0	bl 0x00c38900
00a046c4	ldr x2,[x23]
00a046c8	ldr x8,[sp, #0x50]
00a046cc	ldr w3,[sp, #0x64]
00a046d0	sub x20,x20,#0x8
00a046d4	mov x1,x20
00a046d8	str x0,[x2, x8, LSL #0x3]
00a046dc	mov x0,x20
00a046e0	bl 0x00c38940
00a046e4	cmp w25,#0x0
00a046e8	sub x21,x24,x0
00a046ec	b.le 0x00a04788
00a046f0	ldr x8,[x27]
00a046f4	ldr x2,[x23]
00a046f8	ldur x24,[x29, #-0x60]
00a046fc	mov x10,xzr
00a04700	cmp w25,#0x4
00a04704	neg x9,x0
00a04708	b.cc 0x00a04768
00a0470c	lsl x10,x25,#0x3
00a04710	add x11,x8,x10
00a04714	cmp x2,x11
00a04718	b.cs 0x00a0472c
00a0471c	add x10,x2,x10
00a04720	cmp x8,x10
00a04724	mov x10,xzr
00a04728	b.cc 0x00a04768
00a0472c	ldr x11,[sp, #0x30]
00a04730	mov x10,xzr
00a04734	dup v0.2D,x9
00a04738	add x12,x8,x10
00a0473c	ldp q1,q2,[x12]
00a04740	add x12,x2,x10
00a04744	subs x11,x11,#0x4
00a04748	add x10,x10,#0x20
00a0474c	and v1.16B,v1.16B,v0.16B
00a04750	and v2.16B,v2.16B,v0.16B
00a04754	stp q1,q2,[x12]
00a04758	b.ne 0x00a04738
00a0475c	ldr x10,[sp, #0x30]
00a04760	cmp x10,x25
00a04764	b.eq 0x00a04790
00a04768	lsl x11,x10,#0x3
00a0476c	ldr x12,[x8, x11#0x0]
00a04770	add x10,x10,#0x1
00a04774	cmp x25,x10
00a04778	and x12,x12,x9
00a0477c	str x12,[x2, x11#0x0]
00a04780	b.ne 0x00a04768
00a04784	b 0x00a04790
00a04788	ldr x2,[x23]
00a0478c	ldur x24,[x29, #-0x60]
00a04790	mov x0,x20
00a04794	mov x1,x20
00a04798	mov w3,w25
00a0479c	bl 0x00c388b0
00a047a0	ldr x8,[x19]
00a047a4	ldr x9,[sp, #0x58]
00a047a8	add w28,w28,#0x1
00a047ac	add x8,x8,x0
00a047b0	cmp w28,w9
00a047b4	str x8,[x19]
00a047b8	str x21,[x22, #-0x8]!
00a047bc	mov x19,x24
00a047c0	b.ne 0x00a045d0
00a047c4	ldp x23,x8,[sp, #0x10]
00a047c8	ldr w9,[sp, #0x4]
00a047cc	ldr x0,[sp, #0x8]
00a047d0	str w25,[x8, #0x8]
00a047d4	str w9,[x8, #0x10]
00a047d8	cbz x0,0x00a047ec
00a047dc	ldr x1,[sp, #0x18]
00a047e0	ldr w2,[sp, #0x2c]
00a047e4	bl 0x00c39040
00a047e8	cbz w0,0x00a047fc
00a047ec	mov x0,x23
00a047f0	bl 0x00c38a20
00a047f4	mov w0,#0x1
00a047f8	b 0x00a04808
00a047fc	mov x0,x23
00a04800	bl 0x00c38a20
00a04804	mov w0,wzr
00a04808	ldp x29,x30,[sp, #0xd0]
00a0480c	ldp x20,x19,[sp, #0xc0]
00a04810	ldp x22,x21,[sp, #0xb0]
00a04814	ldp x24,x23,[sp, #0xa0]
00a04818	ldp x26,x25,[sp, #0x90]
00a0481c	ldp x28,x27,[sp, #0x80]
00a04820	add sp,sp,#0xe0
00a04824	ret

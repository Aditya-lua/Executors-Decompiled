; FUN_008de49c @ 008de49c
008de49c	sub sp,sp,#0x70
008de4a0	stp x29,x30,[sp, #0x10]
008de4a4	stp x28,x27,[sp, #0x20]
008de4a8	stp x26,x25,[sp, #0x30]
008de4ac	stp x24,x23,[sp, #0x40]
008de4b0	stp x22,x21,[sp, #0x50]
008de4b4	stp x20,x19,[sp, #0x60]
008de4b8	add x29,sp,#0x10
008de4bc	mov x19,x1
008de4c0	cmp x4,#0x1
008de4c4	b.lt 0x008de7a4
008de4c8	ldp x27,x8,[x0, #0x8]
008de4cc	mov x20,x4
008de4d0	sub x9,x8,x27
008de4d4	cmp x4,x9
008de4d8	b.le 0x008de530
008de4dc	ldr x21,[x0]
008de4e0	sub x9,x27,x21
008de4e4	adds x9,x9,x20
008de4e8	b.mi 0x008de7c8
008de4ec	sub x22,x8,x21
008de4f0	mov x10,#0x3fffffffffffffff
008de4f4	sub x23,x19,x21
008de4f8	lsl x8,x22,#0x1
008de4fc	str x0,[sp, #0x8]
008de500	cmp x8,x9
008de504	csel x8,x8,x9,hi
008de508	cmp x22,x10
008de50c	mov x9,#0x7fffffffffffffff
008de510	csel x26,x8,x9,cc
008de514	cbz x26,0x008de614
008de518	mov x0,x26
008de51c	mov x24,x2
008de520	bl 0x00c2fed0
008de524	mov x2,x24
008de528	mov x25,x0
008de52c	b 0x008de618
008de530	sub x21,x27,x19
008de534	cmp x20,x21
008de538	b.le 0x008de5ac
008de53c	add x8,x2,x21
008de540	cmp x8,x3
008de544	b.eq 0x008de6c0
008de548	add x9,x19,x3
008de54c	sub x9,x9,x2
008de550	sub x10,x9,x27
008de554	cmp x10,#0x20
008de558	b.cc 0x008de6c8
008de55c	sub x9,x19,x2
008de560	cmp x9,#0x20
008de564	mov x9,x27
008de568	b.cc 0x008de6cc
008de56c	add x12,x27,#0x10
008de570	and x11,x10,#-0x20
008de574	sub x13,x12,x19
008de578	add x8,x8,x11
008de57c	add x9,x27,x11
008de580	add x13,x2,x13
008de584	mov x14,x11
008de588	ldp q0,q1,[x13, #-0x10]
008de58c	subs x14,x14,#0x20
008de590	add x13,x13,#0x20
008de594	stp q0,q1,[x12, #-0x10]
008de598	add x12,x12,#0x20
008de59c	b.ne 0x008de588
008de5a0	cmp x10,x11
008de5a4	b.ne 0x008de6cc
008de5a8	b 0x008de6dc
008de5ac	sub x9,x27,x20
008de5b0	add x8,x19,x20
008de5b4	cmp x9,x27
008de5b8	b.cs 0x008de684
008de5bc	cmp x20,#0x20
008de5c0	mov x10,x27
008de5c4	b.cc 0x008de600
008de5c8	and x11,x20,#0x7fffffffffffffe0
008de5cc	add x12,x27,#0x10
008de5d0	add x9,x9,x11
008de5d4	add x10,x27,x11
008de5d8	sub x13,x12,x20
008de5dc	mov x14,x11
008de5e0	ldp q0,q1,[x13, #-0x10]
008de5e4	subs x14,x14,#0x20
008de5e8	add x13,x13,#0x20
008de5ec	stp q0,q1,[x12, #-0x10]
008de5f0	add x12,x12,#0x20
008de5f4	b.ne 0x008de5e0
008de5f8	cmp x20,x11
008de5fc	b.eq 0x008de688
008de600	ldrb w11,[x9], #0x1
008de604	cmp x9,x27
008de608	strb w11,[x10], #0x1
008de60c	b.ne 0x008de600
008de610	b 0x008de688
008de614	mov x25,xzr
008de618	add x24,x25,x23
008de61c	mov x1,x2
008de620	mov x2,x20
008de624	mov x0,x24
008de628	add x28,x25,x26
008de62c	bl 0x00c2ffd0
008de630	add x20,x24,x20
008de634	sub x26,x27,x19
008de638	mov x1,x19
008de63c	mov x0,x20
008de640	mov x2,x26
008de644	bl 0x00c2ffd0
008de648	add x20,x20,x26
008de64c	ldr x26,[sp, #0x8]
008de650	mov x0,x25
008de654	mov x1,x21
008de658	mov x2,x23
008de65c	str x19,[x26, #0x8]
008de660	bl 0x00c2ffd0
008de664	stp x25,x20,[x26]
008de668	str x28,[x26, #0x10]
008de66c	cbz x21,0x008de67c
008de670	mov x0,x21
008de674	mov x1,x22
008de678	bl 0x00c2fe80
008de67c	mov x19,x24
008de680	b 0x008de7a4
008de684	mov x10,x27
008de688	cmp x27,x8
008de68c	str x10,[x0, #0x8]
008de690	b.eq 0x008de6b0
008de694	sub x8,x27,x8
008de698	mov x1,x19
008de69c	mov x21,x2
008de6a0	sub x0,x27,x8
008de6a4	mov x2,x8
008de6a8	bl 0x00c2ff60
008de6ac	mov x2,x21
008de6b0	mov x0,x19
008de6b4	mov x1,x2
008de6b8	mov x2,x20
008de6bc	b 0x008de7a0
008de6c0	mov x9,x27
008de6c4	b 0x008de6dc
008de6c8	mov x9,x27
008de6cc	ldrb w10,[x8], #0x1
008de6d0	cmp x8,x3
008de6d4	strb w10,[x9], #0x1
008de6d8	b.ne 0x008de6cc
008de6dc	cmp x21,#0x1
008de6e0	str x9,[x0, #0x8]
008de6e4	b.lt 0x008de7a4
008de6e8	sub x10,x9,x20
008de6ec	add x8,x19,x20
008de6f0	cmp x10,x27
008de6f4	b.cs 0x008de750
008de6f8	add x11,x20,x27
008de6fc	sub x12,x11,x9
008de700	cmp x12,#0x20
008de704	b.cc 0x008de758
008de708	cmp x20,#0x20
008de70c	mov x11,x9
008de710	b.cc 0x008de75c
008de714	and x13,x12,#-0x20
008de718	add x14,x9,#0x10
008de71c	add x10,x10,x13
008de720	add x11,x9,x13
008de724	sub x15,x14,x20
008de728	mov x16,x13
008de72c	ldp q0,q1,[x15, #-0x10]
008de730	subs x16,x16,#0x20
008de734	add x15,x15,#0x20
008de738	stp q0,q1,[x14, #-0x10]
008de73c	add x14,x14,#0x20
008de740	b.ne 0x008de72c
008de744	cmp x12,x13
008de748	b.ne 0x008de75c
008de74c	b 0x008de76c
008de750	mov x11,x9
008de754	b 0x008de76c
008de758	mov x11,x9
008de75c	ldrb w12,[x10], #0x1
008de760	cmp x10,x27
008de764	strb w12,[x11], #0x1
008de768	b.ne 0x008de75c
008de76c	cmp x9,x8
008de770	str x11,[x0, #0x8]
008de774	b.eq 0x008de794
008de778	sub x8,x9,x8
008de77c	mov x1,x19
008de780	mov x20,x2
008de784	sub x0,x9,x8
008de788	mov x2,x8
008de78c	bl 0x00c2ff60
008de790	mov x2,x20
008de794	mov x0,x19
008de798	mov x1,x2
008de79c	mov x2,x21
008de7a0	bl 0x00c2ff60
008de7a4	mov x0,x19
008de7a8	ldp x20,x19,[sp, #0x60]
008de7ac	ldp x22,x21,[sp, #0x50]
008de7b0	ldp x24,x23,[sp, #0x40]
008de7b4	ldp x26,x25,[sp, #0x30]
008de7b8	ldp x28,x27,[sp, #0x20]
008de7bc	ldp x29,x30,[sp, #0x10]
008de7c0	add sp,sp,#0x70
008de7c4	ret
008de7c8	bl 0x0080734c
008de7cc	cbz x1,0x008de86c
008de7d0	stp x29,x30,[sp, #-0x20]!
008de7d4	str x19,[sp, #0x10]
008de7d8	mov x29,sp
008de7dc	ldr x0,[x1, #0x870]
008de7e0	mov x19,x1
008de7e4	cbz x0,0x008de7f8
008de7e8	ldr x8,[x19, #0x880]
008de7ec	str x0,[x19, #0x878]
008de7f0	sub x1,x8,x0
008de7f4	bl 0x00c2fe80
008de7f8	ldr x0,[x19, #0x858]
008de7fc	cbz x0,0x008de810
008de800	ldr x8,[x19, #0x868]
008de804	str x0,[x19, #0x860]
008de808	sub x1,x8,x0
008de80c	bl 0x00c2fe80
008de810	ldr x0,[x19, #0x40]
008de814	cbz x0,0x008de828
008de818	ldr x8,[x19, #0x50]
008de81c	str x0,[x19, #0x48]
008de820	sub x1,x8,x0
008de824	bl 0x00c2fe80
008de828	ldr x0,[x19, #0x28]
008de82c	cbz x0,0x008de840
008de830	ldr x8,[x19, #0x38]
008de834	str x0,[x19, #0x30]
008de838	sub x1,x8,x0
008de83c	bl 0x00c2fe80
008de840	ldr x0,[x19, #0x10]
008de844	cbz x0,0x008de858
008de848	ldr x8,[x19, #0x20]
008de84c	str x0,[x19, #0x18]
008de850	sub x1,x8,x0
008de854	bl 0x00c2fe80
008de858	mov x0,x19
008de85c	mov w1,#0x888
008de860	ldr x19,[sp, #0x10]
008de864	ldp x29,x30,[sp], #0x20
008de868	b 0x00c2fe80
008de86c	ret

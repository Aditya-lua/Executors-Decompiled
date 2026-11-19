; cpr::Cookie::Cookie @ 008ff4f4
008ff4f4	sub sp,sp,#0x70
008ff4f8	stp x28,x27,[sp, #0x10]
008ff4fc	stp x26,x25,[sp, #0x20]
008ff500	stp x24,x23,[sp, #0x30]
008ff504	stp x22,x21,[sp, #0x40]
008ff508	stp x20,x19,[sp, #0x50]
008ff50c	stp x29,x30,[sp, #0x60]
008ff510	add x29,sp,#0x60
008ff514	stp xzr,xzr,[x0, #0x8]
008ff518	str xzr,[x0]
008ff51c	ldrb w8,[x1]
008ff520	mov x20,x7
008ff524	mov w21,w6
008ff528	mov x22,x5
008ff52c	mov w24,w4
008ff530	mov x25,x3
008ff534	mov x19,x0
008ff538	mov x26,x2
008ff53c	tbnz w8,#0x0,0x008ff554
008ff540	ldr x8,[x1, #0x10]
008ff544	str x8,[x19, #0x10]
008ff548	ldr q0,[x1]
008ff54c	str q0,[x19]
008ff550	b 0x008ff5cc
008ff554	ldr x23,[x1, #0x8]
008ff558	cmn x23,#0x10
008ff55c	b.cs 0x008ff7d4
008ff560	ldr x27,[x1, #0x10]
008ff564	cmp x23,#0x17
008ff568	b.cs 0x008ff580
008ff56c	lsl w8,w23,#0x1
008ff570	mov x28,x19
008ff574	strb w8,[x28], #0x1
008ff578	cbnz x23,0x008ff5b8
008ff57c	b 0x008ff5c8
008ff580	add x8,x23,#0x10
008ff584	str w24,[sp, #0xc]
008ff588	mov w24,w21
008ff58c	mov x21,x20
008ff590	and x20,x8,#-0x10
008ff594	mov x0,x20
008ff598	bl 0x00c2fed0
008ff59c	stp x23,x0,[x19, #0x8]
008ff5a0	orr x8,x20,#0x1
008ff5a4	mov x20,x21
008ff5a8	mov w21,w24
008ff5ac	ldr w24,[sp, #0xc]
008ff5b0	mov x28,x0
008ff5b4	str x8,[x19]
008ff5b8	mov x0,x28
008ff5bc	mov x1,x27
008ff5c0	mov x2,x23
008ff5c4	bl 0x00c2ffd0
008ff5c8	strb wzr,[x28, x23]
008ff5cc	mov x23,x19
008ff5d0	str xzr,[x23, #0x18]!
008ff5d4	stp xzr,xzr,[x23, #0x8]
008ff5d8	ldrb w8,[x26]
008ff5dc	tbnz w8,#0x0,0x008ff5f4
008ff5e0	ldr x8,[x26, #0x10]
008ff5e4	str x8,[x23, #0x10]
008ff5e8	ldr q0,[x26]
008ff5ec	str q0,[x23]
008ff5f0	b 0x008ff66c
008ff5f4	ldr x27,[x26, #0x8]
008ff5f8	cmn x27,#0x10
008ff5fc	b.cs 0x008ff7dc
008ff600	ldr x26,[x26, #0x10]
008ff604	cmp x27,#0x17
008ff608	b.cs 0x008ff620
008ff60c	lsl w8,w27,#0x1
008ff610	mov x28,x23
008ff614	strb w8,[x28], #0x1
008ff618	cbnz x27,0x008ff658
008ff61c	b 0x008ff668
008ff620	add x8,x27,#0x10
008ff624	str w24,[sp, #0xc]
008ff628	mov w24,w21
008ff62c	mov x21,x20
008ff630	and x20,x8,#-0x10
008ff634	mov x0,x20
008ff638	bl 0x00c2fed0
008ff63c	stp x27,x0,[x19, #0x20]
008ff640	orr x8,x20,#0x1
008ff644	mov x20,x21
008ff648	mov w21,w24
008ff64c	ldr w24,[sp, #0xc]
008ff650	mov x28,x0
008ff654	str x8,[x19, #0x18]
008ff658	mov x0,x28
008ff65c	mov x1,x26
008ff660	mov x2,x27
008ff664	bl 0x00c2ffd0
008ff668	strb wzr,[x28, x27]
008ff66c	mov x26,x19
008ff670	str xzr,[x26, #0x30]!
008ff674	stp xzr,xzr,[x26, #0x8]
008ff678	ldrb w8,[x25]
008ff67c	tbnz w8,#0x0,0x008ff694
008ff680	ldr x8,[x25, #0x10]
008ff684	str x8,[x26, #0x10]
008ff688	ldr q0,[x25]
008ff68c	str q0,[x26]
008ff690	b 0x008ff70c
008ff694	ldr x27,[x25, #0x8]
008ff698	cmn x27,#0x10
008ff69c	b.cs 0x008ff7e4
008ff6a0	ldr x25,[x25, #0x10]
008ff6a4	cmp x27,#0x17
008ff6a8	b.cs 0x008ff6c0
008ff6ac	lsl w8,w27,#0x1
008ff6b0	mov x28,x26
008ff6b4	strb w8,[x28], #0x1
008ff6b8	cbnz x27,0x008ff6f8
008ff6bc	b 0x008ff708
008ff6c0	add x8,x27,#0x10
008ff6c4	str w24,[sp, #0xc]
008ff6c8	mov w24,w21
008ff6cc	mov x21,x20
008ff6d0	and x20,x8,#-0x10
008ff6d4	mov x0,x20
008ff6d8	bl 0x00c2fed0
008ff6dc	stp x27,x0,[x19, #0x38]
008ff6e0	orr x8,x20,#0x1
008ff6e4	mov x20,x21
008ff6e8	mov w21,w24
008ff6ec	ldr w24,[sp, #0xc]
008ff6f0	mov x28,x0
008ff6f4	str x8,[x19, #0x30]
008ff6f8	mov x0,x28
008ff6fc	mov x1,x25
008ff700	mov x2,x27
008ff704	bl 0x00c2ffd0
008ff708	strb wzr,[x28, x27]
008ff70c	and w8,w24,#0x1
008ff710	mov x24,x19
008ff714	str xzr,[x24, #0x50]!
008ff718	sturb w8,[x24, #-0x8]
008ff71c	stp xzr,xzr,[x24, #0x8]
008ff720	ldrb w8,[x22]
008ff724	tbnz w8,#0x0,0x008ff73c
008ff728	ldr x8,[x22, #0x10]
008ff72c	str x8,[x24, #0x10]
008ff730	ldr q0,[x22]
008ff734	str q0,[x24]
008ff738	b 0x008ff7a8
008ff73c	ldr x25,[x22, #0x8]
008ff740	cmn x25,#0x10
008ff744	b.cs 0x008ff7ec
008ff748	ldr x22,[x22, #0x10]
008ff74c	cmp x25,#0x17
008ff750	b.cs 0x008ff764
008ff754	lsl w8,w25,#0x1
008ff758	strb w8,[x24], #0x1
008ff75c	cbnz x25,0x008ff794
008ff760	b 0x008ff7a4
008ff764	add x8,x25,#0x10
008ff768	mov w27,w21
008ff76c	mov x21,x20
008ff770	and x20,x8,#-0x10
008ff774	mov x0,x20
008ff778	bl 0x00c2fed0
008ff77c	orr x8,x20,#0x1
008ff780	mov x24,x0
008ff784	stp x25,x0,[x19, #0x58]
008ff788	str x8,[x19, #0x50]
008ff78c	mov x20,x21
008ff790	mov w21,w27
008ff794	mov x0,x24
008ff798	mov x1,x22
008ff79c	mov x2,x25
008ff7a0	bl 0x00c2ffd0
008ff7a4	strb wzr,[x24, x25]
008ff7a8	and w8,w21,#0x1
008ff7ac	strb w8,[x19, #0x68]
008ff7b0	str x20,[x19, #0x70]
008ff7b4	ldp x29,x30,[sp, #0x60]
008ff7b8	ldp x20,x19,[sp, #0x50]
008ff7bc	ldp x22,x21,[sp, #0x40]
008ff7c0	ldp x24,x23,[sp, #0x30]
008ff7c4	ldp x26,x25,[sp, #0x20]
008ff7c8	ldp x28,x27,[sp, #0x10]
008ff7cc	add sp,sp,#0x70
008ff7d0	ret
008ff7d4	mov x0,x19
008ff7d8	bl 0x00c30ce0
008ff7dc	mov x0,x23
008ff7e0	bl 0x00c30ce0
008ff7e4	mov x0,x26
008ff7e8	bl 0x00c30ce0
008ff7ec	mov x0,x24
008ff7f0	bl 0x00c30ce0

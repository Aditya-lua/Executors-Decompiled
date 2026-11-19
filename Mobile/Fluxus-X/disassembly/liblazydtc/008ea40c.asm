; cpr::Cookie::Cookie @ 008ea40c
008ea40c	stp x26,x25,[sp, #-0x50]!
008ea410	stp x24,x23,[sp, #0x10]
008ea414	stp x22,x21,[sp, #0x20]
008ea418	stp x20,x19,[sp, #0x30]
008ea41c	stp x29,x30,[sp, #0x40]
008ea420	add x29,sp,#0x40
008ea424	stp xzr,xzr,[x0, #0x8]
008ea428	str xzr,[x0]
008ea42c	ldrb w8,[x1]
008ea430	mov x20,x1
008ea434	mov x19,x0
008ea438	tbnz w8,#0x0,0x008ea450
008ea43c	ldr x8,[x20, #0x10]
008ea440	str x8,[x19, #0x10]
008ea444	ldr q0,[x20]
008ea448	str q0,[x19]
008ea44c	b 0x008ea4b0
008ea450	ldr x21,[x20, #0x8]
008ea454	cmn x21,#0x10
008ea458	b.cs 0x008ea678
008ea45c	ldr x22,[x20, #0x10]
008ea460	cmp x21,#0x17
008ea464	b.cs 0x008ea47c
008ea468	lsl w8,w21,#0x1
008ea46c	mov x23,x19
008ea470	strb w8,[x23], #0x1
008ea474	cbnz x21,0x008ea49c
008ea478	b 0x008ea4ac
008ea47c	add x8,x21,#0x10
008ea480	and x24,x8,#-0x10
008ea484	mov x0,x24
008ea488	bl 0x00c2fed0
008ea48c	orr x8,x24,#0x1
008ea490	mov x23,x0
008ea494	stp x21,x0,[x19, #0x8]
008ea498	str x8,[x19]
008ea49c	mov x0,x23
008ea4a0	mov x1,x22
008ea4a4	mov x2,x21
008ea4a8	bl 0x00c2ffd0
008ea4ac	strb wzr,[x23, x21]
008ea4b0	mov x21,x19
008ea4b4	str xzr,[x21, #0x18]!
008ea4b8	stp xzr,xzr,[x21, #0x8]
008ea4bc	mov x8,x20
008ea4c0	ldrb w9,[x8, #0x18]!
008ea4c4	tbnz w9,#0x0,0x008ea4dc
008ea4c8	ldr x9,[x8, #0x10]
008ea4cc	str x9,[x21, #0x10]
008ea4d0	ldr q0,[x8]
008ea4d4	str q0,[x21]
008ea4d8	b 0x008ea53c
008ea4dc	ldr x22,[x20, #0x20]
008ea4e0	cmn x22,#0x10
008ea4e4	b.cs 0x008ea680
008ea4e8	ldr x23,[x20, #0x28]
008ea4ec	cmp x22,#0x17
008ea4f0	b.cs 0x008ea508
008ea4f4	lsl w8,w22,#0x1
008ea4f8	mov x24,x21
008ea4fc	strb w8,[x24], #0x1
008ea500	cbnz x22,0x008ea528
008ea504	b 0x008ea538
008ea508	add x8,x22,#0x10
008ea50c	and x25,x8,#-0x10
008ea510	mov x0,x25
008ea514	bl 0x00c2fed0
008ea518	orr x8,x25,#0x1
008ea51c	mov x24,x0
008ea520	stp x22,x0,[x19, #0x20]
008ea524	str x8,[x19, #0x18]
008ea528	mov x0,x24
008ea52c	mov x1,x23
008ea530	mov x2,x22
008ea534	bl 0x00c2ffd0
008ea538	strb wzr,[x24, x22]
008ea53c	mov x22,x19
008ea540	str xzr,[x22, #0x30]!
008ea544	stp xzr,xzr,[x22, #0x8]
008ea548	mov x8,x20
008ea54c	ldrb w9,[x8, #0x30]!
008ea550	tbnz w9,#0x0,0x008ea568
008ea554	ldr x9,[x8, #0x10]
008ea558	str x9,[x22, #0x10]
008ea55c	ldr q0,[x8]
008ea560	str q0,[x22]
008ea564	b 0x008ea5c8
008ea568	ldr x23,[x20, #0x38]
008ea56c	cmn x23,#0x10
008ea570	b.cs 0x008ea688
008ea574	ldr x24,[x20, #0x40]
008ea578	cmp x23,#0x17
008ea57c	b.cs 0x008ea594
008ea580	lsl w8,w23,#0x1
008ea584	mov x25,x22
008ea588	strb w8,[x25], #0x1
008ea58c	cbnz x23,0x008ea5b4
008ea590	b 0x008ea5c4
008ea594	add x8,x23,#0x10
008ea598	and x26,x8,#-0x10
008ea59c	mov x0,x26
008ea5a0	bl 0x00c2fed0
008ea5a4	orr x8,x26,#0x1
008ea5a8	mov x25,x0
008ea5ac	stp x23,x0,[x19, #0x38]
008ea5b0	str x8,[x19, #0x30]
008ea5b4	mov x0,x25
008ea5b8	mov x1,x24
008ea5bc	mov x2,x23
008ea5c0	bl 0x00c2ffd0
008ea5c4	strb wzr,[x25, x23]
008ea5c8	ldrb w8,[x20, #0x48]
008ea5cc	mov x23,x19
008ea5d0	str xzr,[x23, #0x50]!
008ea5d4	stp xzr,xzr,[x23, #0x8]
008ea5d8	sturb w8,[x23, #-0x8]
008ea5dc	mov x8,x20
008ea5e0	ldrb w9,[x8, #0x50]!
008ea5e4	tbnz w9,#0x0,0x008ea5fc
008ea5e8	ldr x9,[x8, #0x10]
008ea5ec	str x9,[x23, #0x10]
008ea5f0	ldr q0,[x8]
008ea5f4	str q0,[x23]
008ea5f8	b 0x008ea658
008ea5fc	ldr x24,[x20, #0x58]
008ea600	cmn x24,#0x10
008ea604	b.cs 0x008ea690
008ea608	ldr x25,[x20, #0x60]
008ea60c	cmp x24,#0x17
008ea610	b.cs 0x008ea624
008ea614	lsl w8,w24,#0x1
008ea618	strb w8,[x23], #0x1
008ea61c	cbnz x24,0x008ea644
008ea620	b 0x008ea654
008ea624	add x8,x24,#0x10
008ea628	and x26,x8,#-0x10
008ea62c	mov x0,x26
008ea630	bl 0x00c2fed0
008ea634	orr x8,x26,#0x1
008ea638	mov x23,x0
008ea63c	stp x24,x0,[x19, #0x58]
008ea640	str x8,[x19, #0x50]
008ea644	mov x0,x23
008ea648	mov x1,x25
008ea64c	mov x2,x24
008ea650	bl 0x00c2ffd0
008ea654	strb wzr,[x23, x24]
008ea658	ldur q0,[x20, #0x68]
008ea65c	stur q0,[x19, #0x68]
008ea660	ldp x29,x30,[sp, #0x40]
008ea664	ldp x20,x19,[sp, #0x30]
008ea668	ldp x22,x21,[sp, #0x20]
008ea66c	ldp x24,x23,[sp, #0x10]
008ea670	ldp x26,x25,[sp], #0x50
008ea674	ret
008ea678	mov x0,x19
008ea67c	bl 0x00c30ce0
008ea680	mov x0,x21
008ea684	bl 0x00c30ce0
008ea688	mov x0,x22
008ea68c	bl 0x00c30ce0
008ea690	mov x0,x23
008ea694	bl 0x00c30ce0

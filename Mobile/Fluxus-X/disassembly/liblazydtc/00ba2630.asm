; psa_load_persistent_key @ 00ba2630
00ba2630	sub sp,sp,#0x70
00ba2634	stp x26,x25,[sp, #0x20]
00ba2638	stp x24,x23,[sp, #0x30]
00ba263c	stp x22,x21,[sp, #0x40]
00ba2640	stp x20,x19,[sp, #0x50]
00ba2644	stp x29,x30,[sp, #0x60]
00ba2648	add x29,sp,#0x60
00ba264c	mrs x26,tpidr_el0
00ba2650	ldr x8,[x26, #0x28]
00ba2654	mov x21,x0
00ba2658	mov x22,x1
00ba265c	add x1,sp,#0x10
00ba2660	str x8,[sp, #0x18]
00ba2664	ldr w25,[x0, #0x14]
00ba2668	mov x23,x2
00ba266c	mov x0,x25
00ba2670	bl 0x00c43270
00ba2674	mov w24,w0
00ba2678	cbnz w0,0x00ba271c
00ba267c	ldr w19,[sp, #0x10]
00ba2680	mov w0,#0x1
00ba2684	mov x1,x19
00ba2688	bl 0x00c30a30
00ba268c	mov x20,x0
00ba2690	cbz x0,0x00ba2718
00ba2694	add x1,sp,#0x10
00ba2698	mov x0,x25
00ba269c	str xzr,[sp, #0x8]
00ba26a0	bl 0x00c43270
00ba26a4	mov w24,w0
00ba26a8	cbnz w0,0x00ba2708
00ba26ac	add x4,sp,#0x8
00ba26b0	mov x0,x25
00ba26b4	mov w1,wzr
00ba26b8	mov w2,w19
00ba26bc	mov x3,x20
00ba26c0	bl 0x00c43260
00ba26c4	ldr x8,[sp, #0x8]
00ba26c8	mov w24,w0
00ba26cc	cmp x8,x19
00ba26d0	b.ne 0x00ba2704
00ba26d4	cbnz w24,0x00ba2708
00ba26d8	cmp w19,#0x24
00ba26dc	b.cc 0x00ba2704
00ba26e0	ldr x8,[x20]
00ba26e4	mov x9,#0x5350
00ba26e8	movk x9,#0x41, LSL #16
00ba26ec	movk x9,#0x454b, LSL #32
00ba26f0	movk x9,#0x59, LSL #48
00ba26f4	cmp x8,x9
00ba26f8	b.ne 0x00ba2704
00ba26fc	ldr w8,[x20, #0x8]
00ba2700	cbz w8,0x00ba274c
00ba2704	mov w24,#0xffffff67
00ba2708	mov x0,x20
00ba270c	mov x1,x19
00ba2710	bl 0x00c42230
00ba2714	b 0x00ba271c
00ba2718	mov w24,#0xffffff73
00ba271c	ldr x8,[x26, #0x28]
00ba2720	ldr x9,[sp, #0x18]
00ba2724	cmp x8,x9
00ba2728	b.ne 0x00ba27ec
00ba272c	mov w0,w24
00ba2730	ldp x29,x30,[sp, #0x60]
00ba2734	ldp x20,x19,[sp, #0x50]
00ba2738	ldp x22,x21,[sp, #0x40]
00ba273c	ldp x24,x23,[sp, #0x30]
00ba2740	ldp x26,x25,[sp, #0x20]
00ba2744	add sp,sp,#0x70
00ba2748	ret
00ba274c	ldr w25,[x20, #0x20]
00ba2750	mov w24,#0xffffff67
00ba2754	ubfx x8,x25,#0xd,#0x13
00ba2758	str x25,[x23]
00ba275c	cbnz w8,0x00ba2708
00ba2760	sub x8,x19,#0x24
00ba2764	cmp x8,x25
00ba2768	b.cc 0x00ba2708
00ba276c	cbz w25,0x00ba2798
00ba2770	mov w0,#0x1
00ba2774	mov x1,x25
00ba2778	bl 0x00c30a30
00ba277c	str x0,[x22]
00ba2780	cbz x0,0x00ba27e4
00ba2784	add x1,x20,#0x24
00ba2788	mov x2,x25
00ba278c	bl 0x00c2ffd0
00ba2790	mov w8,wzr
00ba2794	b 0x00ba27a0
00ba2798	str xzr,[x22]
00ba279c	mov w8,#0x1
00ba27a0	ldr w9,[x20, #0xc]
00ba27a4	cmp w25,#0x0
00ba27a8	cset w10,eq
00ba27ac	orr w8,w8,w10
00ba27b0	str w9,[x21, #0x4]
00ba27b4	ldrh w9,[x20, #0x10]
00ba27b8	mov w10,#0xffffff6e
00ba27bc	cmp w8,#0x0
00ba27c0	csel w24,w10,wzr,ne
00ba27c4	strh w9,[x21]
00ba27c8	ldrh w9,[x20, #0x12]
00ba27cc	strh w9,[x21, #0x2]
00ba27d0	ldur x9,[x20, #0x14]
00ba27d4	str x9,[x21, #0x8]
00ba27d8	ldr w9,[x20, #0x1c]
00ba27dc	str w9,[x21, #0x10]
00ba27e0	b 0x00ba2708
00ba27e4	mov w24,#0xffffff73
00ba27e8	b 0x00ba2708
00ba27ec	bl 0x00c2fec0

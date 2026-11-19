; std::__ndk1::__money_put<wchar_t>::__gather_info @ 00bf282c
00bf282c	paciasp
00bf2830	sub sp,sp,#0x80
00bf2834	stp x29,x30,[sp, #0x20]
00bf2838	str x27,[sp, #0x30]
00bf283c	stp x26,x25,[sp, #0x40]
00bf2840	stp x24,x23,[sp, #0x50]
00bf2844	stp x22,x21,[sp, #0x60]
00bf2848	stp x20,x19,[sp, #0x70]
00bf284c	add x29,sp,#0x20
00bf2850	ldr x26,[x29, #0x60]
00bf2854	ldr x21,[x2]
00bf2858	mov x19,x7
00bf285c	mov x20,x6
00bf2860	mov x22,x5
00bf2864	mov x23,x4
00bf2868	mov x24,x3
00bf286c	mov w25,w1
00bf2870	tbz w0,#0x0,0x00bf28a8
00bf2874	adrp x27,0xcb5000
00bf2878	ldr x27,[x27, #0xc30]
00bf287c	stur x27,[x29, #-0x8]
00bf2880	ldar x8,[x27]
00bf2884	cmn x8,#0x1
00bf2888	b.eq 0x00bf28e8
00bf288c	sub x8,x29,#0x8
00bf2890	mov x9,sp
00bf2894	adrp x0,0xcb5000
00bf2898	str x8,[sp]
00bf289c	str x9,[x29, #0x18]
00bf28a0	ldr x0,[x0, #0xc30]
00bf28a4	b 0x00bf28d8
00bf28a8	adrp x27,0xcb5000
00bf28ac	ldr x27,[x27, #0xc38]
00bf28b0	stur x27,[x29, #-0x8]
00bf28b4	ldar x8,[x27]
00bf28b8	cmn x8,#0x1
00bf28bc	b.eq 0x00bf28e8
00bf28c0	sub x8,x29,#0x8
00bf28c4	mov x9,sp
00bf28c8	adrp x0,0xcb5000
00bf28cc	str x8,[sp]
00bf28d0	str x9,[x29, #0x18]
00bf28d4	ldr x0,[x0, #0xc38]
00bf28d8	nop
00bf28dc	adr x2,0xc0bab0
00bf28e0	add x1,x29,#0x18
00bf28e4	bl 0x00c305d0
00bf28e8	ldp x8,x10,[x21, #0x10]
00bf28ec	ldrsw x9,[x27, #0x8]
00bf28f0	sub x9,x9,#0x1
00bf28f4	sub x10,x10,x8
00bf28f8	cmp x9,x10, ASR #0x3
00bf28fc	b.cs 0x00bf2a5c
00bf2900	ldr x21,[x8, x9, LSL #0x3]
00bf2904	cbz x21,0x00bf2a5c
00bf2908	ldr x8,[x21]
00bf290c	tbz w25,#0x0,0x00bf292c
00bf2910	ldr x8,[x8, #0x58]
00bf2914	mov x0,x21
00bf2918	blr x8
00bf291c	str w0,[x24]
00bf2920	ldr x8,[x21]
00bf2924	ldr x9,[x8, #0x40]
00bf2928	b 0x00bf2944
00bf292c	ldr x8,[x8, #0x50]
00bf2930	mov x0,x21
00bf2934	blr x8
00bf2938	str w0,[x24]
00bf293c	ldr x8,[x21]
00bf2940	ldr x9,[x8, #0x38]
00bf2944	mov x8,sp
00bf2948	mov x0,x21
00bf294c	blr x9
00bf2950	ldrb w8,[x26]
00bf2954	tbz w8,#0x0,0x00bf296c
00bf2958	ldr x8,[x26]
00bf295c	ldr x0,[x26, #0x10]
00bf2960	lsl x8,x8,#0x2
00bf2964	and x1,x8,#-0x8
00bf2968	bl 0x00c2fe80
00bf296c	ldr q0,[sp]
00bf2970	ldr x8,[sp, #0x10]
00bf2974	mov x0,x21
00bf2978	str q0,[x26]
00bf297c	str x8,[x26, #0x10]
00bf2980	ldr x8,[x21]
00bf2984	ldr x8,[x8, #0x18]
00bf2988	blr x8
00bf298c	str w0,[x23]
00bf2990	mov x0,x21
00bf2994	ldr x8,[x21]
00bf2998	ldr x8,[x8, #0x20]
00bf299c	blr x8
00bf29a0	str w0,[x22]
00bf29a4	mov x0,x21
00bf29a8	ldr x8,[x21]
00bf29ac	ldr x9,[x8, #0x28]
00bf29b0	mov x8,sp
00bf29b4	blr x9
00bf29b8	ldrb w8,[x20]
00bf29bc	tbz w8,#0x0,0x00bf29d0
00bf29c0	ldr x8,[x20]
00bf29c4	ldr x0,[x20, #0x10]
00bf29c8	and x1,x8,#-0x2
00bf29cc	bl 0x00c2fe80
00bf29d0	ldr q0,[sp]
00bf29d4	ldr x8,[sp, #0x10]
00bf29d8	mov x0,x21
00bf29dc	str q0,[x20]
00bf29e0	str x8,[x20, #0x10]
00bf29e4	ldr x8,[x21]
00bf29e8	ldr x9,[x8, #0x30]
00bf29ec	mov x8,sp
00bf29f0	blr x9
00bf29f4	ldrb w8,[x19]
00bf29f8	tbz w8,#0x0,0x00bf2a10
00bf29fc	ldr x8,[x19]
00bf2a00	ldr x0,[x19, #0x10]
00bf2a04	lsl x8,x8,#0x2
00bf2a08	and x1,x8,#-0x8
00bf2a0c	bl 0x00c2fe80
00bf2a10	ldr q0,[sp]
00bf2a14	ldr x8,[sp, #0x10]
00bf2a18	mov x0,x21
00bf2a1c	str q0,[x19]
00bf2a20	str x8,[x19, #0x10]
00bf2a24	ldr x19,[x29, #0x68]
00bf2a28	ldr x8,[x21]
00bf2a2c	ldr x8,[x8, #0x48]
00bf2a30	blr x8
00bf2a34	str w0,[x19]
00bf2a38	ldp x20,x19,[sp, #0x70]
00bf2a3c	ldr x27,[sp, #0x30]
00bf2a40	ldp x22,x21,[sp, #0x60]
00bf2a44	ldp x24,x23,[sp, #0x50]
00bf2a48	ldp x26,x25,[sp, #0x40]
00bf2a4c	ldp x29,x30,[sp, #0x20]
00bf2a50	add sp,sp,#0x80
00bf2a54	autiasp
00bf2a58	ret
00bf2a5c	bl 0x00bd8968

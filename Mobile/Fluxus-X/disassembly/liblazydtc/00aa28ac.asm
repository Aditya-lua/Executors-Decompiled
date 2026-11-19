; ossl_provider_info_add_to_store @ 00aa28ac
00aa28ac	stp x22,x21,[sp, #-0x30]!
00aa28b0	adrp x2,0xc6d000
00aa28b4	stp x20,x19,[sp, #0x10]
00aa28b8	mov x20,x1
00aa28bc	mov w21,#0x100
00aa28c0	add x2,x2,#0x4c8
00aa28c4	mov w1,#0x1
00aa28c8	stp x29,x30,[sp, #0x20]
00aa28cc	add x29,sp,#0x20
00aa28d0	movk w21,#0xc, LSL #16
00aa28d4	bl 0x00c3b520
00aa28d8	mov x19,x0
00aa28dc	cbz x0,0x00aa2940
00aa28e0	ldr x8,[x20]
00aa28e4	cbz x8,0x00aa2974
00aa28e8	cbz x19,0x00aa2998
00aa28ec	ldr x0,[x19, #0x20]
00aa28f0	bl 0x00c356a0
00aa28f4	cbz w0,0x00aa29c4
00aa28f8	ldr x8,[x19, #0x40]
00aa28fc	cbz x8,0x00aa29cc
00aa2900	mov x21,x19
00aa2904	ldr x9,[x21, #0x38]!
00aa2908	cmp x9,x8
00aa290c	b.ne 0x00aa29f8
00aa2910	ldr x0,[x19, #0x30]
00aa2914	add x22,x8,#0xa
00aa2918	add x8,x22,x22, LSL #0x2
00aa291c	adrp x2,0x2aa000
00aa2920	lsl x1,x8,#0x3
00aa2924	add x2,x2,#0x4b5
00aa2928	mov w3,#0x189
00aa292c	bl 0x00c356f0
00aa2930	cbz x0,0x00aa2a50
00aa2934	str x0,[x19, #0x30]
00aa2938	str x22,[x19, #0x40]
00aa293c	b 0x00aa29fc
00aa2940	bl 0x00c342a0
00aa2944	adrp x0,0x2aa000
00aa2948	adrp x2,0x2bb000
00aa294c	add x0,x0,#0x4b5
00aa2950	add x2,x2,#0xf7d
00aa2954	mov w1,#0x156
00aa2958	bl 0x00c342b0
00aa295c	add w1,w21,#0x3
00aa2960	orr w0,wzr,#0xf
00aa2964	mov x2,xzr
00aa2968	bl 0x00c342c0
00aa296c	ldr x8,[x20]
00aa2970	cbnz x8,0x00aa28e8
00aa2974	bl 0x00c342a0
00aa2978	adrp x0,0x2aa000
00aa297c	adrp x2,0x2cf000
00aa2980	add x0,x0,#0x4b5
00aa2984	add x2,x2,#0xe34
00aa2988	mov w1,#0x171
00aa298c	bl 0x00c342b0
00aa2990	add w1,w21,#0x2
00aa2994	b 0x00aa29b8
00aa2998	bl 0x00c342a0
00aa299c	adrp x0,0x2aa000
00aa29a0	adrp x2,0x2cf000
00aa29a4	add x0,x0,#0x4b5
00aa29a8	add x2,x2,#0xe34
00aa29ac	mov w1,#0x176
00aa29b0	bl 0x00c342b0
00aa29b4	add w1,w21,#0x3
00aa29b8	orr w0,wzr,#0xf
00aa29bc	mov x2,xzr
00aa29c0	bl 0x00c342c0
00aa29c4	mov w20,wzr
00aa29c8	b 0x00aa2a8c
00aa29cc	adrp x1,0x2aa000
00aa29d0	add x1,x1,#0x4b5
00aa29d4	mov w0,#0x190
00aa29d8	mov w2,#0x17e
00aa29dc	bl 0x00c34250
00aa29e0	str x0,[x19, #0x30]
00aa29e4	cbz x0,0x00aa2a34
00aa29e8	mov w8,#0xa
00aa29ec	add x21,x19,#0x38
00aa29f0	str x8,[x19, #0x40]
00aa29f4	b 0x00aa29fc
00aa29f8	ldr x0,[x19, #0x30]
00aa29fc	ldr x8,[x21]
00aa2a00	ldr x9,[x20, #0x20]
00aa2a04	mov w10,#0x28
00aa2a08	madd x8,x8,x10,x0
00aa2a0c	str x9,[x8, #0x20]
00aa2a10	ldr q0,[x20, #0x10]
00aa2a14	str q0,[x8, #0x10]
00aa2a18	ldr q0,[x20]
00aa2a1c	mov w20,#0x1
00aa2a20	str q0,[x8]
00aa2a24	ldr x8,[x21]
00aa2a28	add x8,x8,#0x1
00aa2a2c	str x8,[x21]
00aa2a30	b 0x00aa2a84
00aa2a34	bl 0x00c342a0
00aa2a38	adrp x0,0x2aa000
00aa2a3c	adrp x2,0x2cf000
00aa2a40	add x0,x0,#0x4b5
00aa2a44	add x2,x2,#0xe34
00aa2a48	orr w1,wzr,#0x180
00aa2a4c	b 0x00aa2a68
00aa2a50	bl 0x00c342a0
00aa2a54	adrp x0,0x2aa000
00aa2a58	adrp x2,0x2cf000
00aa2a5c	add x0,x0,#0x4b5
00aa2a60	add x2,x2,#0xe34
00aa2a64	mov w1,#0x18b
00aa2a68	bl 0x00c342b0
00aa2a6c	mov w1,#0x100
00aa2a70	orr w0,wzr,#0xf
00aa2a74	movk w1,#0xc, LSL #16
00aa2a78	mov x2,xzr
00aa2a7c	bl 0x00c342c0
00aa2a80	mov w20,wzr
00aa2a84	ldr x0,[x19, #0x20]
00aa2a88	bl 0x00c35690
00aa2a8c	mov w0,w20
00aa2a90	ldp x29,x30,[sp, #0x20]
00aa2a94	ldp x20,x19,[sp, #0x10]
00aa2a98	ldp x22,x21,[sp], #0x30
00aa2a9c	ret

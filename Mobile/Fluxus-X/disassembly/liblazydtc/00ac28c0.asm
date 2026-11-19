; PKCS7_set_type @ 00ac28c0
00ac28c0	stp x20,x19,[sp, #-0x20]!
00ac28c4	mov x19,x0
00ac28c8	mov w0,w1
00ac28cc	stp x29,x30,[sp, #0x10]
00ac28d0	add x29,sp,#0x10
00ac28d4	mov w20,w1
00ac28d8	bl 0x00c37740
00ac28dc	sub w8,w20,#0x15
00ac28e0	cmp w8,#0x5
00ac28e4	b.hi 0x00ac2910
00ac28e8	adrp x9,0x774000
00ac28ec	add x9,x9,#0x6c0
00ac28f0	ldrsw x8,[x9, x8, LSL #0x2]
00ac28f4	add x8,x8,x9
00ac28f8	br x8
00ac28fc	str x0,[x19, #0x18]
00ac2900	bl 0x00c38170
00ac2904	str x0,[x19, #0x20]
00ac2908	cbnz x0,0x00ac29fc
00ac290c	b 0x00ac2a40
00ac2910	bl 0x00c342a0
00ac2914	adrp x0,0x2ce000
00ac2918	adrp x2,0x2a6000
00ac291c	add x0,x0,#0x1ca
00ac2920	add x2,x2,#0x6c3
00ac2924	mov w1,#0xad
00ac2928	bl 0x00c342b0
00ac292c	mov w0,#0x21
00ac2930	orr w1,wzr,#0x70
00ac2934	mov x2,xzr
00ac2938	bl 0x00c342c0
00ac293c	b 0x00ac2a40
00ac2940	str x0,[x19, #0x18]
00ac2944	bl 0x00c3f6b0
00ac2948	str x0,[x19, #0x20]
00ac294c	cbz x0,0x00ac2a40
00ac2950	ldr x0,[x0]
00ac2954	mov w1,#0x1
00ac2958	mov w20,#0x1
00ac295c	bl 0x00c375b0
00ac2960	cbnz w0,0x00ac2a44
00ac2964	ldr x0,[x19, #0x20]
00ac2968	bl 0x00c3f6a0
00ac296c	str xzr,[x19, #0x20]
00ac2970	b 0x00ac2a40
00ac2974	str x0,[x19, #0x18]
00ac2978	bl 0x00c3f660
00ac297c	str x0,[x19, #0x20]
00ac2980	cbz x0,0x00ac2a40
00ac2984	ldr x0,[x0]
00ac2988	mov x1,xzr
00ac298c	bl 0x00c375b0
00ac2990	cbz w0,0x00ac2a40
00ac2994	mov w0,#0x15
00ac2998	bl 0x00c37740
00ac299c	ldr x8,[x19, #0x20]
00ac29a0	ldr x8,[x8, #0x10]
00ac29a4	b 0x00ac2a34
00ac29a8	str x0,[x19, #0x18]
00ac29ac	bl 0x00c3f6e0
00ac29b0	str x0,[x19, #0x20]
00ac29b4	cbz x0,0x00ac2a40
00ac29b8	ldr x0,[x0]
00ac29bc	mov w1,#0x1
00ac29c0	bl 0x00c375b0
00ac29c4	cbz w0,0x00ac2a40
00ac29c8	mov w0,#0x15
00ac29cc	bl 0x00c37740
00ac29d0	ldr x8,[x19, #0x20]
00ac29d4	ldr x8,[x8, #0x28]
00ac29d8	b 0x00ac2a34
00ac29dc	str x0,[x19, #0x18]
00ac29e0	bl 0x00c3f640
00ac29e4	str x0,[x19, #0x20]
00ac29e8	cbz x0,0x00ac2a40
00ac29ec	ldr x0,[x0]
00ac29f0	mov x1,xzr
00ac29f4	bl 0x00c375b0
00ac29f8	cbz w0,0x00ac2a40
00ac29fc	mov w20,#0x1
00ac2a00	b 0x00ac2a44
00ac2a04	str x0,[x19, #0x18]
00ac2a08	bl 0x00c3f650
00ac2a0c	str x0,[x19, #0x20]
00ac2a10	cbz x0,0x00ac2a40
00ac2a14	ldr x0,[x0]
00ac2a18	mov x1,xzr
00ac2a1c	bl 0x00c375b0
00ac2a20	cbz w0,0x00ac2a40
00ac2a24	mov w0,#0x15
00ac2a28	bl 0x00c37740
00ac2a2c	ldr x8,[x19, #0x20]
00ac2a30	ldr x8,[x8, #0x8]
00ac2a34	str x0,[x8]
00ac2a38	mov w20,#0x1
00ac2a3c	b 0x00ac2a44
00ac2a40	mov w20,wzr
00ac2a44	ldp x29,x30,[sp, #0x10]
00ac2a48	mov w0,w20
00ac2a4c	ldp x20,x19,[sp], #0x20
00ac2a50	ret

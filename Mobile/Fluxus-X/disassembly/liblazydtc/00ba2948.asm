; psa_its_get @ 00ba2948
00ba2948	sub sp,sp,#0x70
00ba294c	str x25,[sp, #0x20]
00ba2950	stp x24,x23,[sp, #0x30]
00ba2954	stp x22,x21,[sp, #0x40]
00ba2958	stp x20,x19,[sp, #0x50]
00ba295c	stp x29,x30,[sp, #0x60]
00ba2960	add x29,sp,#0x60
00ba2964	mrs x25,tpidr_el0
00ba2968	ldr x8,[x25, #0x28]
00ba296c	mov w22,w2
00ba2970	mov w24,w1
00ba2974	add x1,sp,#0x8
00ba2978	add x2,sp,#0x10
00ba297c	mov x19,x4
00ba2980	mov x20,x3
00ba2984	str x8,[sp, #0x18]
00ba2988	str xzr,[sp, #0x10]
00ba298c	bl 0x00ba2854
00ba2990	mov w21,w0
00ba2994	cbnz w0,0x00ba29c0
00ba2998	adds w8,w22,w24
00ba299c	b.cc 0x00ba29b0
00ba29a0	mov w21,#0xffffff79
00ba29a4	ldr x23,[sp, #0x10]
00ba29a8	cbnz x23,0x00ba29c8
00ba29ac	b 0x00ba29d0
00ba29b0	ldr w9,[sp, #0x8]
00ba29b4	cmp w8,w9
00ba29b8	b.ls 0x00ba2a00
00ba29bc	mov w21,#0xffffff79
00ba29c0	ldr x23,[sp, #0x10]
00ba29c4	cbz x23,0x00ba29d0
00ba29c8	mov x0,x23
00ba29cc	bl 0x00c30be0
00ba29d0	ldr x8,[x25, #0x28]
00ba29d4	ldr x9,[sp, #0x18]
00ba29d8	cmp x8,x9
00ba29dc	b.ne 0x00ba2a6c
00ba29e0	mov w0,w21
00ba29e4	ldp x29,x30,[sp, #0x60]
00ba29e8	ldp x20,x19,[sp, #0x50]
00ba29ec	ldp x22,x21,[sp, #0x40]
00ba29f0	ldp x24,x23,[sp, #0x30]
00ba29f4	ldr x25,[sp, #0x20]
00ba29f8	add sp,sp,#0x70
00ba29fc	ret
00ba2a00	ldr x23,[sp, #0x10]
00ba2a04	mov w1,w24
00ba2a08	mov w2,#0x1
00ba2a0c	mov x0,x23
00ba2a10	bl 0x00c31ec0
00ba2a14	cbz w0,0x00ba2a24
00ba2a18	mov w21,#0xffffff6e
00ba2a1c	cbnz x23,0x00ba29c8
00ba2a20	b 0x00ba29d0
00ba2a24	mov w22,w22
00ba2a28	mov w1,#0x1
00ba2a2c	mov x0,x20
00ba2a30	mov x2,x22
00ba2a34	mov x3,x23
00ba2a38	bl 0x00c31e60
00ba2a3c	cmp x0,x22
00ba2a40	b.ne 0x00ba2a5c
00ba2a44	mov w21,wzr
00ba2a48	cbz x19,0x00ba29c0
00ba2a4c	str x22,[x19]
00ba2a50	ldr x23,[sp, #0x10]
00ba2a54	cbnz x23,0x00ba29c8
00ba2a58	b 0x00ba29d0
00ba2a5c	mov w21,#0xffffff6e
00ba2a60	ldr x23,[sp, #0x10]
00ba2a64	cbnz x23,0x00ba29c8
00ba2a68	b 0x00ba29d0
00ba2a6c	bl 0x00c2fec0

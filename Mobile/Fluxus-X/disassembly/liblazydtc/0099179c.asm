; _INIT_184 @ 0099179c
0099179c	sub sp,sp,#0x40
009917a0	str x21,[sp, #0x10]
009917a4	stp x20,x19,[sp, #0x20]
009917a8	stp x29,x30,[sp, #0x30]
009917ac	add x29,sp,#0x30
009917b0	adrp x8,0x2d5000
009917b4	adrp x1,0xcb4000
009917b8	add x8,x8,#0x5d0
009917bc	ldr x1,[x1, #0xa48]
009917c0	ldr x9,[x8]
009917c4	ldur x8,[x8, #0x6]
009917c8	orr w21,wzr,#0x1c
009917cc	str xzr,[x1, #0x10]
009917d0	strb w21,[x1]
009917d4	stur x9,[x1, #0x1]
009917d8	stur x8,[x1, #0x7]
009917dc	strb wzr,[x1, #0xf]
009917e0	adrp x19,0xcb4000
009917e4	ldr x19,[x19, #0x9c0]
009917e8	adrp x20,0xc48000
009917ec	add x20,x20,#0x880
009917f0	mov x2,x20
009917f4	mov x0,x19
009917f8	bl 0x00c2fe70
009917fc	adrp x8,0x2c3000
00991800	adrp x1,0xcb5000
00991804	add x8,x8,#0x19b
00991808	ldr x1,[x1, #0x88]
0099180c	ldr x9,[x8]
00991810	ldur x8,[x8, #0x6]
00991814	mov x0,x19
00991818	mov x2,x20
0099181c	str xzr,[x1, #0x10]
00991820	strb w21,[x1]
00991824	stur x9,[x1, #0x1]
00991828	stur x8,[x1, #0x7]
0099182c	strb wzr,[x1, #0xf]
00991830	bl 0x00c2fe70
00991834	adrp x9,0x2a5000
00991838	adrp x1,0xcb5000
0099183c	add x9,x9,#0x77a
00991840	ldr x1,[x1, #0x80]
00991844	ldr q0,[x9]
00991848	mov w8,#0x20
0099184c	mov x0,x19
00991850	mov x2,x20
00991854	stp xzr,xzr,[x1, #0x8]
00991858	str xzr,[x1]
0099185c	strb w8,[x1]
00991860	stur q0,[x1, #0x1]
00991864	strb wzr,[x1, #0x11]
00991868	bl 0x00c2fe70
0099186c	adrp x10,0x2ad000
00991870	adrp x1,0xcb5000
00991874	add x10,x10,#0x56a
00991878	ldr x1,[x1, #0x78]
0099187c	ldr x10,[x10]
00991880	mov w9,#0x6f65
00991884	orr w8,wzr,#0x18
00991888	movk w9,#0x7475, LSL #16
0099188c	mov x0,x19
00991890	mov x2,x20
00991894	stp xzr,xzr,[x1]
00991898	str xzr,[x1, #0x10]
0099189c	strb w8,[x1]
009918a0	stur w9,[x1, #0x9]
009918a4	stur x10,[x1, #0x1]
009918a8	strb wzr,[x1, #0xd]
009918ac	bl 0x00c2fe70
009918b0	adrp x8,0x2a9000
009918b4	adrp x1,0xcb5000
009918b8	add x8,x8,#0xaa1
009918bc	ldr x1,[x1, #0x90]
009918c0	ldr x9,[x8]
009918c4	ldur x8,[x8, #0x6]
009918c8	mov x0,x19
009918cc	mov x2,x20
009918d0	str xzr,[x1, #0x10]
009918d4	strb w21,[x1]
009918d8	stur x9,[x1, #0x1]
009918dc	stur x8,[x1, #0x7]
009918e0	strb wzr,[x1, #0xf]
009918e4	bl 0x00c2fe70
009918e8	adrp x8,0x2b1000
009918ec	adrp x1,0xcb5000
009918f0	add x8,x8,#0x9b2
009918f4	ldr x1,[x1, #0xa8]
009918f8	ldr x9,[x8]
009918fc	ldur x8,[x8, #0x6]
00991900	mov x0,x19
00991904	mov x2,x20
00991908	str xzr,[x1, #0x10]
0099190c	strb w21,[x1]
00991910	stur x9,[x1, #0x1]
00991914	stur x8,[x1, #0x7]
00991918	strb wzr,[x1, #0xf]
0099191c	bl 0x00c2fe70
00991920	adrp x1,0xcb5000
00991924	adrp x9,0x2cb000
00991928	ldr x1,[x1, #0xb0]
0099192c	add x9,x9,#0x2d1
00991930	ldr q0,[x9]
00991934	mov w8,#0x22
00991938	str xzr,[x1]
0099193c	strb w8,[x1]
00991940	mov w8,#0x64
00991944	mov x0,x19
00991948	mov x2,x20
0099194c	stp xzr,xzr,[x1, #0x8]
00991950	sturh w8,[x1, #0x11]
00991954	stur q0,[x1, #0x1]
00991958	bl 0x00c2fe70
0099195c	adrp x21,0xcb5000
00991960	ldr x21,[x21, #0xb8]
00991964	mov w0,#0x40
00991968	stp xzr,xzr,[x21, #0x8]
0099196c	str xzr,[x21]
00991970	bl 0x00c2fed0
00991974	adrp x9,0x2a1000
00991978	add x9,x9,#0xbbc
0099197c	adrp x8,0x29c000
00991980	ldur q1,[x9, #0x2a]
00991984	ldp q4,q2,[x9, #0x10]
00991988	ldr q3,[x9]
0099198c	ldr q0,[x8, #0x1d0]
00991990	str x0,[x21, #0x10]
00991994	stur q1,[x0, #0x2a]
00991998	stp q4,q2,[x0, #0x10]
0099199c	str q3,[x0]
009919a0	strb wzr,[x0, #0x3a]
009919a4	mov x0,x19
009919a8	mov x1,x21
009919ac	mov x2,x20
009919b0	str q0,[x21]
009919b4	bl 0x00c2fe70
009919b8	adrp x21,0xcb5000
009919bc	ldr x21,[x21, #0xc8]
009919c0	mov w0,#0x20
009919c4	stp xzr,xzr,[x21, #0x8]
009919c8	str xzr,[x21]
009919cc	bl 0x00c2fed0
009919d0	adrp x9,0x29f000
009919d4	add x9,x9,#0x9e3
009919d8	adrp x8,0x29c000
009919dc	ldur q0,[x9, #0xa]
009919e0	ldr q1,[x9]
009919e4	ldr q2,[x8, #0xb80]
009919e8	str x0,[x21, #0x10]
009919ec	stur q0,[x0, #0xa]
009919f0	str q1,[x0]
009919f4	strb wzr,[x0, #0x1a]
009919f8	mov x0,x19
009919fc	mov x1,x21
00991a00	mov x2,x20
00991a04	str q2,[sp]
00991a08	str q2,[x21]
00991a0c	bl 0x00c2fe70
00991a10	adrp x21,0xcb5000
00991a14	ldr x21,[x21, #0xc0]
00991a18	orr w0,wzr,#0x30
00991a1c	stp xzr,xzr,[x21, #0x8]
00991a20	str xzr,[x21]
00991a24	bl 0x00c2fed0
00991a28	adrp x9,0x2d9000
00991a2c	add x9,x9,#0x384
00991a30	adrp x8,0x29c000
00991a34	ldur q1,[x9, #0x1b]
00991a38	ldp q2,q3,[x9]
00991a3c	ldr q0,[x8, #0xf20]
00991a40	str x0,[x21, #0x10]
00991a44	stur q1,[x0, #0x1b]
00991a48	stp q2,q3,[x0]
00991a4c	strb wzr,[x0, #0x2b]
00991a50	mov x0,x19
00991a54	mov x1,x21
00991a58	mov x2,x20
00991a5c	str q0,[x21]
00991a60	bl 0x00c2fe70
00991a64	adrp x21,0xcb5000
00991a68	ldr x21,[x21, #0xd0]
00991a6c	mov w0,#0x40
00991a70	stp xzr,xzr,[x21, #0x8]
00991a74	str xzr,[x21]
00991a78	bl 0x00c2fed0
00991a7c	adrp x9,0x2ab000
00991a80	add x9,x9,#0x9b4
00991a84	adrp x8,0x29c000
00991a88	ldp q1,q2,[x9]
00991a8c	ldr q3,[x9, #0x20]
00991a90	ldr q0,[x8, #0xa50]
00991a94	mov w10,#0x6563
00991a98	str x0,[x21, #0x10]
00991a9c	strh w10,[x0, #0x30]
00991aa0	stp q2,q3,[x0, #0x10]
00991aa4	str q1,[x0]
00991aa8	strb wzr,[x0, #0x32]
00991aac	mov x0,x19
00991ab0	mov x1,x21
00991ab4	mov x2,x20
00991ab8	str q0,[x21]
00991abc	bl 0x00c2fe70
00991ac0	adrp x21,0xcb5000
00991ac4	ldr x21,[x21, #0x28]
00991ac8	mov w0,#0x20
00991acc	stp xzr,xzr,[x21, #0x8]
00991ad0	str xzr,[x21]
00991ad4	bl 0x00c2fed0
00991ad8	adrp x8,0x2b9000
00991adc	add x8,x8,#0x654
00991ae0	ldur q0,[x8, #0xa]
00991ae4	ldr q1,[x8]
00991ae8	ldr q2,[sp]
00991aec	str x0,[x21, #0x10]
00991af0	stur q0,[x0, #0xa]
00991af4	str q1,[x0]
00991af8	strb wzr,[x0, #0x1a]
00991afc	mov x0,x19
00991b00	mov x1,x21
00991b04	mov x2,x20
00991b08	str q2,[x21]
00991b0c	bl 0x00c2fe70
00991b10	adrp x9,0x2c7000
00991b14	adrp x1,0xcb5000
00991b18	add x9,x9,#0x3d2
00991b1c	ldr x1,[x1, #0xa0]
00991b20	ldr q0,[x9]
00991b24	mov w8,#0x24
00991b28	mov w10,#0x6564
00991b2c	stp xzr,xzr,[x1, #0x8]
00991b30	str xzr,[x1]
00991b34	strb w8,[x1]
00991b38	sturh w10,[x1, #0x11]
00991b3c	stur q0,[x1, #0x1]
00991b40	strb wzr,[x1, #0x13]
00991b44	mov x0,x19
00991b48	mov x2,x20
00991b4c	ldp x29,x30,[sp, #0x30]
00991b50	ldp x20,x19,[sp, #0x20]
00991b54	ldr x21,[sp, #0x10]
00991b58	add sp,sp,#0x40
00991b5c	b 0x00c2fe70

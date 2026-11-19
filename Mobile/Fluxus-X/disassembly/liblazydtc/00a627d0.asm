; OSSL_ENCODER_CTX_new_for_pkey @ 00a627d0
00a627d0	sub sp,sp,#0xd0
00a627d4	stp x26,x25,[sp, #0x80]
00a627d8	stp x24,x23,[sp, #0x90]
00a627dc	stp x22,x21,[sp, #0xa0]
00a627e0	stp x20,x19,[sp, #0xb0]
00a627e4	stp x29,x30,[sp, #0xc0]
00a627e8	add x29,sp,#0xc0
00a627ec	cbz x0,0x00a62838
00a627f0	ldr x8,[x0, #0x20]
00a627f4	mov x21,x4
00a627f8	mov x24,x3
00a627fc	mov x25,x2
00a62800	mov w22,w1
00a62804	mov x20,x0
00a62808	cbnz x8,0x00a62814
00a6280c	ldr x8,[x20, #0x68]
00a62810	cbz x8,0x00a629c4
00a62814	bl 0x00c3b8a0
00a62818	mov x19,x0
00a6281c	cbz x0,0x00a62870
00a62820	ldr x0,[x20, #0x60]
00a62824	cbz x0,0x00a628a4
00a62828	bl 0x00c36360
00a6282c	bl 0x00c3b2f0
00a62830	mov x23,x0
00a62834	b 0x00a628a8
00a62838	bl 0x00c342a0
00a6283c	adrp x0,0x2cb000
00a62840	adrp x2,0x2b5000
00a62844	add x0,x0,#0x96c
00a62848	add x2,x2,#0xc5c
00a6284c	mov w1,#0x147
00a62850	bl 0x00c342b0
00a62854	mov w8,#0x100
00a62858	movk w8,#0xc, LSL #16
00a6285c	add w1,w8,#0x2
00a62860	mov w0,#0x3b
00a62864	mov x2,xzr
00a62868	bl 0x00c342c0
00a6286c	b 0x00a62b64
00a62870	bl 0x00c342a0
00a62874	adrp x0,0x2cb000
00a62878	adrp x2,0x2b5000
00a6287c	add x0,x0,#0x96c
00a62880	add x2,x2,#0xc5c
00a62884	mov w1,#0x152
00a62888	bl 0x00c342b0
00a6288c	mov w1,#0x100
00a62890	mov w0,#0x3b
00a62894	movk w1,#0xc, LSL #16
00a62898	mov x2,xzr
00a6289c	bl 0x00c342c0
00a628a0	b 0x00a62b68
00a628a4	mov x23,xzr
00a628a8	mov x0,x19
00a628ac	mov x1,x25
00a628b0	bl 0x00c3b820
00a628b4	cbz w0,0x00a62b5c
00a628b8	cbz x24,0x00a628cc
00a628bc	mov x0,x19
00a628c0	mov x1,x24
00a628c4	bl 0x00c3b810
00a628c8	cbz w0,0x00a62b5c
00a628cc	mov x0,x19
00a628d0	mov w1,w22
00a628d4	bl 0x00c3b830
00a628d8	cbz w0,0x00a62b5c
00a628dc	ldr x0,[x20, #0x60]
00a628e0	cbz x0,0x00a62afc
00a628e4	bl 0x00c36360
00a628e8	mov x26,x0
00a628ec	bl 0x00c3b2f0
00a628f0	ldr x8,[x20, #0x60]
00a628f4	cbz x8,0x00a62afc
00a628f8	adrp x1,0x2cb000
00a628fc	mov x25,x0
00a62900	add x1,x1,#0x96c
00a62904	mov w0,#0x28
00a62908	mov w2,#0xf6
00a6290c	bl 0x00c34250
00a62910	cbz x0,0x00a629fc
00a62914	mov x24,x0
00a62918	bl 0x00c34780
00a6291c	str x0,[sp]
00a62920	cbz x0,0x00a62a30
00a62924	strb wzr,[sp, #0x8]
00a62928	ldr x0,[x20, #0x60]
00a6292c	adrp x1,0xa62000
00a62930	add x1,x1,#0xb88
00a62934	mov x2,sp
00a62938	bl 0x00c3b6e0
00a6293c	ldrb w8,[sp, #0x8]
00a62940	ldr x0,[sp]
00a62944	tbnz w8,#0x0,0x00a62a64
00a62948	ldr x8,[x19, #0x8]
00a6294c	add x2,sp,#0x30
00a62950	str x8,[sp, #0x40]
00a62954	ldr x8,[x19, #0x10]
00a62958	stp x26,x19,[sp, #0x48]
00a6295c	adrp x26,0xa62000
00a62960	add x26,x26,#0xbd4
00a62964	stp x0,x8,[sp, #0x30]
00a62968	mov x0,x25
00a6296c	mov x1,x26
00a62970	str wzr,[sp, #0x5c]
00a62974	strb wzr,[sp, #0x58]
00a62978	bl 0x00c3b8c0
00a6297c	ldrb w8,[sp, #0x58]
00a62980	add x2,sp,#0x30
00a62984	mov x0,x25
00a62988	mov x1,x26
00a6298c	orr w8,w8,#0x1
00a62990	strb w8,[sp, #0x58]
00a62994	bl 0x00c3b8c0
00a62998	ldr x0,[sp]
00a6299c	bl 0x00c34770
00a629a0	ldr w8,[sp, #0x5c]
00a629a4	cbz w8,0x00a62a8c
00a629a8	bl 0x00c342a0
00a629ac	adrp x0,0x2cb000
00a629b0	adrp x2,0x2dc000
00a629b4	add x0,x0,#0x96c
00a629b8	add x2,x2,#0x3c
00a629bc	mov w1,#0x123
00a629c0	b 0x00a62a48
00a629c4	bl 0x00c342a0
00a629c8	adrp x0,0x2cb000
00a629cc	adrp x2,0x2b5000
00a629d0	add x0,x0,#0x96c
00a629d4	add x2,x2,#0xc5c
00a629d8	mov w1,#0x14c
00a629dc	bl 0x00c342b0
00a629e0	adrp x2,0x2a0000
00a629e4	mov w1,#0x106
00a629e8	add x2,x2,#0x290
00a629ec	mov w0,#0x3b
00a629f0	movk w1,#0x8, LSL #16
00a629f4	bl 0x00c342c0
00a629f8	b 0x00a62b64
00a629fc	bl 0x00c342a0
00a62a00	adrp x0,0x2cb000
00a62a04	adrp x2,0x2dc000
00a62a08	add x0,x0,#0x96c
00a62a0c	add x2,x2,#0x3c
00a62a10	mov w1,#0xf7
00a62a14	bl 0x00c342b0
00a62a18	mov w1,#0x100
00a62a1c	mov w0,#0x3b
00a62a20	movk w1,#0xc, LSL #16
00a62a24	mov x2,xzr
00a62a28	bl 0x00c342c0
00a62a2c	b 0x00a62b5c
00a62a30	bl 0x00c342a0
00a62a34	adrp x0,0x2cb000
00a62a38	adrp x2,0x2dc000
00a62a3c	add x0,x0,#0x96c
00a62a40	add x2,x2,#0x3c
00a62a44	mov w1,#0x101
00a62a48	bl 0x00c342b0
00a62a4c	mov w1,#0x100
00a62a50	mov w0,#0x3b
00a62a54	movk w1,#0xc, LSL #16
00a62a58	mov x2,xzr
00a62a5c	bl 0x00c342c0
00a62a60	b 0x00a62a68
00a62a64	bl 0x00c34770
00a62a68	mov x0,x19
00a62a6c	mov x1,xzr
00a62a70	bl 0x00c3b800
00a62a74	adrp x1,0x2cb000
00a62a78	add x1,x1,#0x96c
00a62a7c	mov w2,#0x138
00a62a80	mov x0,x24
00a62a84	bl 0x00c32310
00a62a88	b 0x00a62b5c
00a62a8c	mov x0,x19
00a62a90	bl 0x00c3b7d0
00a62a94	cbz w0,0x00a62adc
00a62a98	adrp x1,0xa62000
00a62a9c	add x1,x1,#0xcd4
00a62aa0	mov x0,x19
00a62aa4	bl 0x00c3b7f0
00a62aa8	cbz w0,0x00a62a68
00a62aac	mov x0,x19
00a62ab0	mov x1,x24
00a62ab4	bl 0x00c3b800
00a62ab8	cbz w0,0x00a62a68
00a62abc	adrp x1,0xa62000
00a62ac0	add x1,x1,#0xd74
00a62ac4	mov x0,x19
00a62ac8	bl 0x00c3b7e0
00a62acc	cbz w0,0x00a62a68
00a62ad0	str x20,[x24]
00a62ad4	str w22,[x24, #0x8]
00a62ad8	b 0x00a62afc
00a62adc	mov x0,x19
00a62ae0	mov x1,xzr
00a62ae4	bl 0x00c3b800
00a62ae8	adrp x1,0x2cb000
00a62aec	add x1,x1,#0x96c
00a62af0	mov w2,#0x138
00a62af4	mov x0,x24
00a62af8	bl 0x00c32310
00a62afc	mov x0,x19
00a62b00	mov x1,x23
00a62b04	mov x2,x21
00a62b08	bl 0x00c3b7c0
00a62b0c	cbz w0,0x00a62b5c
00a62b10	add x0,sp,#0x30
00a62b14	mov w2,#0x50
00a62b18	mov w1,wzr
00a62b1c	bl 0x00c301c0
00a62b20	ldr w8,[x20, #0x48]
00a62b24	adrp x0,0x2a0000
00a62b28	add x0,x0,#0x2bb
00a62b2c	add x1,sp,#0x2c
00a62b30	str w8,[sp, #0x2c]
00a62b34	mov x8,sp
00a62b38	bl 0x00c36260
00a62b3c	ldr x8,[sp, #0x20]
00a62b40	ldp q1,q0,[sp]
00a62b44	add x1,sp,#0x30
00a62b48	mov x0,x19
00a62b4c	str x8,[sp, #0x50]
00a62b50	stp q1,q0,[sp, #0x30]
00a62b54	bl 0x00c3b8b0
00a62b58	b 0x00a62b68
00a62b5c	mov x0,x19
00a62b60	bl 0x00c3b890
00a62b64	mov x19,xzr
00a62b68	mov x0,x19
00a62b6c	ldp x29,x30,[sp, #0xc0]
00a62b70	ldp x20,x19,[sp, #0xb0]
00a62b74	ldp x22,x21,[sp, #0xa0]
00a62b78	ldp x24,x23,[sp, #0x90]
00a62b7c	ldp x26,x25,[sp, #0x80]
00a62b80	add sp,sp,#0xd0
00a62b84	ret

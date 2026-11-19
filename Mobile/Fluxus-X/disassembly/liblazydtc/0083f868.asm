; FUN_0083f868 @ 0083f868
0083f868	sub sp,sp,#0x40
0083f86c	stp x29,x30,[sp, #0x10]
0083f870	stp x22,x21,[sp, #0x20]
0083f874	stp x20,x19,[sp, #0x30]
0083f878	add x29,sp,#0x10
0083f87c	mrs x22,tpidr_el0
0083f880	mov w1,wzr
0083f884	mov w2,wzr
0083f888	ldr x8,[x22, #0x28]
0083f88c	mov x19,x0
0083f890	str x8,[sp, #0x8]
0083f894	bl 0x008ad0b0
0083f898	adrp x8,0xd1e000
0083f89c	add x8,x8,#0x878
0083f8a0	adrp x20,0xd1e000
0083f8a4	add x20,x20,#0x868
0083f8a8	ldarb w8,[x8]
0083f8ac	tbz w8,#0x0,0x0083fc70
0083f8b0	adrp x8,0xd1e000
0083f8b4	ldrb w8,[x8, #0x870]
0083f8b8	cmp w8,#0x1
0083f8bc	b.ne 0x0083f8d8
0083f8c0	adrp x8,0x29a000
0083f8c4	ldr d0,[x20]
0083f8c8	strb wzr,[x20, #0x8]
0083f8cc	ldr d1,[x8, #0x2c0]
0083f8d0	eor v0.8B,v0.8B,v1.8B
0083f8d4	str d0,[x20]
0083f8d8	nop
0083f8dc	adr x20,0x83fe9c
0083f8e0	adrp x21,0xd1e000
0083f8e4	add x21,x21,#0x868
0083f8e8	mov x0,x19
0083f8ec	mov x1,x20
0083f8f0	mov x2,x21
0083f8f4	mov w3,wzr
0083f8f8	mov x4,xzr
0083f8fc	bl 0x008ac76c
0083f900	mov x0,x19
0083f904	mov w1,#0xffffffff
0083f908	bl 0x008aa2e4
0083f90c	ldr x8,[x0]
0083f910	adrp x0,0xd1e000
0083f914	add x0,x0,#0x628
0083f918	mov x1,sp
0083f91c	mov x2,sp
0083f920	str x8,[sp]
0083f924	bl 0x00807f14
0083f928	adrp x0,0xcca000
0083f92c	add x0,x0,#0x848
0083f930	mov x1,sp
0083f934	mov x2,sp
0083f938	str x20,[sp]
0083f93c	bl 0x0080837c
0083f940	mov x0,x19
0083f944	mov w1,#0xfffffffe
0083f948	mov x2,x21
0083f94c	bl 0x008ad800
0083f950	adrp x8,0xd1e000
0083f954	add x8,x8,#0x890
0083f958	ldarb w9,[x8]
0083f95c	adrp x8,0xd1e000
0083f960	add x8,x8,#0x880
0083f964	tbz w9,#0x0,0x0083fcbc
0083f968	adrp x9,0xd1e000
0083f96c	ldrb w9,[x9, #0x888]
0083f970	cmp w9,#0x1
0083f974	b.ne 0x0083f990
0083f978	adrp x9,0x29b000
0083f97c	ldr d0,[x8]
0083f980	strb wzr,[x8, #0x8]
0083f984	ldr d1,[x9, #0xd28]
0083f988	eor v0.8B,v0.8B,v1.8B
0083f98c	str d0,[x8]
0083f990	adrp x21,0xd1e000
0083f994	add x21,x21,#0x880
0083f998	mov x0,x19
0083f99c	mov x1,x20
0083f9a0	mov x2,x21
0083f9a4	mov w3,wzr
0083f9a8	mov x4,xzr
0083f9ac	bl 0x008ac76c
0083f9b0	mov x0,x19
0083f9b4	mov w1,#0xffffffff
0083f9b8	bl 0x008aa2e4
0083f9bc	ldr x8,[x0]
0083f9c0	adrp x0,0xd1e000
0083f9c4	add x0,x0,#0x628
0083f9c8	mov x1,sp
0083f9cc	mov x2,sp
0083f9d0	str x8,[sp]
0083f9d4	bl 0x00807f14
0083f9d8	adrp x0,0xcca000
0083f9dc	add x0,x0,#0x848
0083f9e0	mov x1,sp
0083f9e4	mov x2,sp
0083f9e8	str x20,[sp]
0083f9ec	bl 0x0080837c
0083f9f0	mov x0,x19
0083f9f4	mov w1,#0xfffffffe
0083f9f8	mov x2,x21
0083f9fc	bl 0x008ad800
0083fa00	adrp x8,0xd1e000
0083fa04	add x8,x8,#0x8a8
0083fa08	ldarb w9,[x8]
0083fa0c	adrp x8,0xd1e000
0083fa10	add x8,x8,#0x898
0083fa14	tbz w9,#0x0,0x0083fd1c
0083fa18	adrp x9,0xd1e000
0083fa1c	ldrb w9,[x9, #0x8a2]
0083fa20	cmp w9,#0x1
0083fa24	b.ne 0x0083fa5c
0083fa28	adrp x9,0x29a000
0083fa2c	ldr d0,[x8]
0083fa30	ldrb w10,[x8, #0x8]
0083fa34	ldr d1,[x9, #0xd18]
0083fa38	ldrb w11,[x8, #0x9]
0083fa3c	mov w9,#0x5d
0083fa40	eor w9,w10,w9
0083fa44	strb wzr,[x8, #0xa]
0083fa48	eor v0.8B,v0.8B,v1.8B
0083fa4c	eor w10,w11,#0x1f
0083fa50	strb w9,[x8, #0x8]
0083fa54	strb w10,[x8, #0x9]
0083fa58	str d0,[x8]
0083fa5c	adrp x1,0xd1e000
0083fa60	add x1,x1,#0x898
0083fa64	mov x0,x19
0083fa68	bl 0x00807e7c
0083fa6c	mov x0,x19
0083fa70	mov w1,wzr
0083fa74	mov w2,wzr
0083fa78	bl 0x008ad0b0
0083fa7c	adrp x8,0xd1e000
0083fa80	add x8,x8,#0x8c0
0083fa84	ldarb w9,[x8]
0083fa88	adrp x8,0xd1e000
0083fa8c	add x8,x8,#0x8b0
0083fa90	tbz w9,#0x0,0x0083fd84
0083fa94	adrp x9,0xd1e000
0083fa98	ldrb w9,[x9, #0x8b8]
0083fa9c	cmp w9,#0x1
0083faa0	b.ne 0x0083fabc
0083faa4	adrp x9,0x29b000
0083faa8	ldr d0,[x8]
0083faac	strb wzr,[x8, #0x8]
0083fab0	ldr d1,[x9, #0xc78]
0083fab4	eor v0.8B,v0.8B,v1.8B
0083fab8	str d0,[x8]
0083fabc	adrp x21,0xd1e000
0083fac0	add x21,x21,#0x8b0
0083fac4	mov x0,x19
0083fac8	mov x1,x20
0083facc	mov x2,x21
0083fad0	mov w3,wzr
0083fad4	mov x4,xzr
0083fad8	bl 0x008ac76c
0083fadc	mov x0,x19
0083fae0	mov w1,#0xffffffff
0083fae4	bl 0x008aa2e4
0083fae8	ldr x8,[x0]
0083faec	adrp x0,0xd1e000
0083faf0	add x0,x0,#0x628
0083faf4	mov x1,sp
0083faf8	mov x2,sp
0083fafc	str x8,[sp]
0083fb00	bl 0x00807f14
0083fb04	adrp x0,0xcca000
0083fb08	add x0,x0,#0x848
0083fb0c	mov x1,sp
0083fb10	mov x2,sp
0083fb14	str x20,[sp]
0083fb18	bl 0x0080837c
0083fb1c	mov x0,x19
0083fb20	mov w1,#0xfffffffe
0083fb24	mov x2,x21
0083fb28	bl 0x008ad800
0083fb2c	adrp x8,0xd1e000
0083fb30	add x8,x8,#0x8d8
0083fb34	ldarb w9,[x8]
0083fb38	adrp x8,0xd1e000
0083fb3c	add x8,x8,#0x8c8
0083fb40	tbz w9,#0x0,0x0083fde4
0083fb44	adrp x9,0xd1e000
0083fb48	ldrb w9,[x9, #0x8d0]
0083fb4c	cmp w9,#0x1
0083fb50	b.ne 0x0083fb6c
0083fb54	adrp x9,0x29a000
0083fb58	ldr d0,[x8]
0083fb5c	strb wzr,[x8, #0x8]
0083fb60	ldr d1,[x9, #0xa90]
0083fb64	eor v0.8B,v0.8B,v1.8B
0083fb68	str d0,[x8]
0083fb6c	adrp x21,0xd1e000
0083fb70	add x21,x21,#0x8c8
0083fb74	mov x0,x19
0083fb78	mov x1,x20
0083fb7c	mov x2,x21
0083fb80	mov w3,wzr
0083fb84	mov x4,xzr
0083fb88	bl 0x008ac76c
0083fb8c	mov x0,x19
0083fb90	mov w1,#0xffffffff
0083fb94	bl 0x008aa2e4
0083fb98	ldr x8,[x0]
0083fb9c	adrp x0,0xd1e000
0083fba0	add x0,x0,#0x628
0083fba4	mov x1,sp
0083fba8	mov x2,sp
0083fbac	str x8,[sp]
0083fbb0	bl 0x00807f14
0083fbb4	adrp x0,0xcca000
0083fbb8	add x0,x0,#0x848
0083fbbc	mov x1,sp
0083fbc0	mov x2,sp
0083fbc4	str x20,[sp]
0083fbc8	bl 0x0080837c
0083fbcc	mov x0,x19
0083fbd0	mov w1,#0xfffffffe
0083fbd4	mov x2,x21
0083fbd8	bl 0x008ad800
0083fbdc	adrp x8,0xd1e000
0083fbe0	add x8,x8,#0x8f0
0083fbe4	adrp x20,0xd1e000
0083fbe8	add x20,x20,#0x8e0
0083fbec	ldarb w8,[x8]
0083fbf0	tbz w8,#0x0,0x0083fe44
0083fbf4	adrp x8,0xd1e000
0083fbf8	ldrb w8,[x8, #0x8ea]
0083fbfc	cmp w8,#0x1
0083fc00	b.ne 0x0083fc3c
0083fc04	adrp x8,0x29b000
0083fc08	ldr d0,[x20]
0083fc0c	ldrb w9,[x20, #0x8]
0083fc10	ldr d1,[x8, #0x458]
0083fc14	ldrb w10,[x20, #0x9]
0083fc18	mov w8,#0x29
0083fc1c	mov w11,#0x8b
0083fc20	eor w8,w9,w8
0083fc24	strb wzr,[x20, #0xa]
0083fc28	eor v0.8B,v0.8B,v1.8B
0083fc2c	eor w9,w10,w11
0083fc30	strb w8,[x20, #0x8]
0083fc34	strb w9,[x20, #0x9]
0083fc38	str d0,[x20]
0083fc3c	adrp x1,0xd1e000
0083fc40	add x1,x1,#0x8e0
0083fc44	mov x0,x19
0083fc48	bl 0x00807e7c
0083fc4c	ldr x8,[x22, #0x28]
0083fc50	ldr x9,[sp, #0x8]
0083fc54	cmp x8,x9
0083fc58	b.ne 0x0083fe98
0083fc5c	ldp x20,x19,[sp, #0x30]
0083fc60	ldp x22,x21,[sp, #0x20]
0083fc64	ldp x29,x30,[sp, #0x10]
0083fc68	add sp,sp,#0x40
0083fc6c	ret
0083fc70	adrp x0,0xd1e000
0083fc74	add x0,x0,#0x878
0083fc78	bl 0x00c2fe90
0083fc7c	cbz w0,0x0083f8b0
0083fc80	adrp x8,0x29b000
0083fc84	mov w9,#0x1
0083fc88	nop
0083fc8c	adr x0,0x84e784
0083fc90	ldr d0,[x8, #0xe78]
0083fc94	adrp x2,0xc48000
0083fc98	add x2,x2,#0x880
0083fc9c	mov x1,x20
0083fca0	strb w9,[x20, #0x8]
0083fca4	str d0,[x20]
0083fca8	bl 0x00c2fe70
0083fcac	adrp x0,0xd1e000
0083fcb0	add x0,x0,#0x878
0083fcb4	bl 0x00c2fea0
0083fcb8	b 0x0083f8b0
0083fcbc	adrp x0,0xd1e000
0083fcc0	add x0,x0,#0x890
0083fcc4	bl 0x00c2fe90
0083fcc8	adrp x8,0xd1e000
0083fccc	add x8,x8,#0x880
0083fcd0	cbz w0,0x0083f968
0083fcd4	adrp x9,0x29a000
0083fcd8	mov w10,#0x1
0083fcdc	nop
0083fce0	adr x0,0x84e78c
0083fce4	ldr d0,[x9, #0xb68]
0083fce8	adrp x2,0xc48000
0083fcec	add x2,x2,#0x880
0083fcf0	adrp x1,0xd1e000
0083fcf4	add x1,x1,#0x880
0083fcf8	strb w10,[x8, #0x8]
0083fcfc	str d0,[x8]
0083fd00	bl 0x00c2fe70
0083fd04	adrp x0,0xd1e000
0083fd08	add x0,x0,#0x890
0083fd0c	bl 0x00c2fea0
0083fd10	adrp x8,0xd1e000
0083fd14	add x8,x8,#0x880
0083fd18	b 0x0083f968
0083fd1c	adrp x0,0xd1e000
0083fd20	add x0,x0,#0x8a8
0083fd24	bl 0x00c2fe90
0083fd28	adrp x8,0xd1e000
0083fd2c	add x8,x8,#0x898
0083fd30	cbz w0,0x0083fa18
0083fd34	adrp x9,0x29b000
0083fd38	mov w10,#0x1
0083fd3c	nop
0083fd40	adr x0,0x84e794
0083fd44	ldr d0,[x9, #0xd40]
0083fd48	mov w9,#0x1f29
0083fd4c	adrp x2,0xc48000
0083fd50	add x2,x2,#0x880
0083fd54	adrp x1,0xd1e000
0083fd58	add x1,x1,#0x898
0083fd5c	strb w10,[x8, #0xa]
0083fd60	str d0,[x8]
0083fd64	strh w9,[x8, #0x8]
0083fd68	bl 0x00c2fe70
0083fd6c	adrp x0,0xd1e000
0083fd70	add x0,x0,#0x8a8
0083fd74	bl 0x00c2fea0
0083fd78	adrp x8,0xd1e000
0083fd7c	add x8,x8,#0x898
0083fd80	b 0x0083fa18
0083fd84	adrp x0,0xd1e000
0083fd88	add x0,x0,#0x8c0
0083fd8c	bl 0x00c2fe90
0083fd90	adrp x8,0xd1e000
0083fd94	add x8,x8,#0x8b0
0083fd98	cbz w0,0x0083fa94
0083fd9c	adrp x9,0x29b000
0083fda0	mov w10,#0x1
0083fda4	nop
0083fda8	adr x0,0x84e7a0
0083fdac	ldr d0,[x9, #0xd48]
0083fdb0	adrp x2,0xc48000
0083fdb4	add x2,x2,#0x880
0083fdb8	adrp x1,0xd1e000
0083fdbc	add x1,x1,#0x8b0
0083fdc0	strb w10,[x8, #0x8]
0083fdc4	str d0,[x8]
0083fdc8	bl 0x00c2fe70
0083fdcc	adrp x0,0xd1e000
0083fdd0	add x0,x0,#0x8c0
0083fdd4	bl 0x00c2fea0
0083fdd8	adrp x8,0xd1e000
0083fddc	add x8,x8,#0x8b0
0083fde0	b 0x0083fa94
0083fde4	adrp x0,0xd1e000
0083fde8	add x0,x0,#0x8d8
0083fdec	bl 0x00c2fe90
0083fdf0	adrp x8,0xd1e000
0083fdf4	add x8,x8,#0x8c8
0083fdf8	cbz w0,0x0083fb44
0083fdfc	adrp x9,0x29a000
0083fe00	mov w10,#0x1
0083fe04	nop
0083fe08	adr x0,0x84e7a8
0083fe0c	ldr d0,[x9, #0x668]
0083fe10	adrp x2,0xc48000
0083fe14	add x2,x2,#0x880
0083fe18	adrp x1,0xd1e000
0083fe1c	add x1,x1,#0x8c8
0083fe20	strb w10,[x8, #0x8]
0083fe24	str d0,[x8]
0083fe28	bl 0x00c2fe70
0083fe2c	adrp x0,0xd1e000
0083fe30	add x0,x0,#0x8d8
0083fe34	bl 0x00c2fea0
0083fe38	adrp x8,0xd1e000
0083fe3c	add x8,x8,#0x8c8
0083fe40	b 0x0083fb44
0083fe44	adrp x0,0xd1e000
0083fe48	add x0,x0,#0x8f0
0083fe4c	bl 0x00c2fe90
0083fe50	cbz w0,0x0083fbf4
0083fe54	adrp x8,0x29b000
0083fe58	mov w9,#0x1
0083fe5c	nop
0083fe60	adr x0,0x84e7b0
0083fe64	ldr d0,[x8, #0xa30]
0083fe68	mov w8,#0x8b5d
0083fe6c	adrp x2,0xc48000
0083fe70	add x2,x2,#0x880
0083fe74	mov x1,x20
0083fe78	strb w9,[x20, #0xa]
0083fe7c	str d0,[x20]
0083fe80	strh w8,[x20, #0x8]
0083fe84	bl 0x00c2fe70
0083fe88	adrp x0,0xd1e000
0083fe8c	add x0,x0,#0x8f0
0083fe90	bl 0x00c2fea0
0083fe94	b 0x0083fbf4
0083fe98	bl 0x00c2fec0

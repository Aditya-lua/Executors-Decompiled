; RAND_get0_primary @ 00ac7f78
00ac7f78	stp x22,x21,[sp, #-0x30]!
00ac7f7c	adrp x2,0xc7c000
00ac7f80	add x2,x2,#0xa38
00ac7f84	mov w1,#0x5
00ac7f88	stp x20,x19,[sp, #0x10]
00ac7f8c	stp x29,x30,[sp, #0x20]
00ac7f90	add x29,sp,#0x20
00ac7f94	mov x20,x0
00ac7f98	bl 0x00c3b520
00ac7f9c	cbz x0,0x00ac7fe0
00ac7fa0	mov x19,x0
00ac7fa4	ldr x0,[x0]
00ac7fa8	bl 0x00c35680
00ac7fac	cbz w0,0x00ac7fe0
00ac7fb0	ldr x0,[x19]
00ac7fb4	ldr x21,[x19, #0x10]
00ac7fb8	bl 0x00c35690
00ac7fbc	cbnz x21,0x00ac7fe4
00ac7fc0	ldr x0,[x19]
00ac7fc4	bl 0x00c356a0
00ac7fc8	cbz w0,0x00ac7fe0
00ac7fcc	ldr x21,[x19, #0x10]
00ac7fd0	cbz x21,0x00ac7ff8
00ac7fd4	ldr x0,[x19]
00ac7fd8	bl 0x00c35690
00ac7fdc	b 0x00ac7fe4
00ac7fe0	mov x21,xzr
00ac7fe4	ldp x29,x30,[sp, #0x20]
00ac7fe8	ldp x20,x19,[sp, #0x10]
00ac7fec	mov x0,x21
00ac7ff0	ldp x22,x21,[sp], #0x30
00ac7ff4	ret
00ac7ff8	ldr x1,[x19, #0x8]
00ac7ffc	cbnz x1,0x00ac80ec
00ac8000	bl 0x00c35250
00ac8004	adrp x2,0xc7c000
00ac8008	add x2,x2,#0xa38
00ac800c	mov w1,#0x5
00ac8010	mov x0,x20
00ac8014	bl 0x00c3b520
00ac8018	cbz x0,0x00ac80dc
00ac801c	ldp x8,x2,[x0, #0x40]
00ac8020	adrp x9,0x2b2000
00ac8024	add x9,x9,#0xa75
00ac8028	mov x0,x20
00ac802c	cmp x8,#0x0
00ac8030	csel x1,x9,x8,eq
00ac8034	bl 0x00c3d170
00ac8038	cbz x0,0x00ac80b0
00ac803c	mov x1,xzr
00ac8040	mov x22,x0
00ac8044	bl 0x00c3d150
00ac8048	mov x21,x0
00ac804c	mov x0,x22
00ac8050	bl 0x00c3d180
00ac8054	cbz x21,0x00ac8154
00ac8058	mov x0,x21
00ac805c	mov w1,wzr
00ac8060	mov w2,wzr
00ac8064	mov x3,xzr
00ac8068	mov x4,xzr
00ac806c	mov x5,xzr
00ac8070	bl 0x00c3d1b0
00ac8074	cbnz w0,0x00ac80e0
00ac8078	bl 0x00c342a0
00ac807c	adrp x0,0x2da000
00ac8080	adrp x2,0x2ac000
00ac8084	add x0,x0,#0x554
00ac8088	add x2,x2,#0x77f
00ac808c	mov w1,#0x22a
00ac8090	bl 0x00c342b0
00ac8094	mov w0,#0x24
00ac8098	mov w1,#0x6c
00ac809c	mov x2,xzr
00ac80a0	bl 0x00c342c0
00ac80a4	mov x0,x21
00ac80a8	bl 0x00c3d140
00ac80ac	b 0x00ac80dc
00ac80b0	bl 0x00c342a0
00ac80b4	adrp x0,0x2da000
00ac80b8	adrp x2,0x2ac000
00ac80bc	add x0,x0,#0x554
00ac80c0	add x2,x2,#0x77f
00ac80c4	mov w1,#0x220
00ac80c8	bl 0x00c342b0
00ac80cc	mov w0,#0x24
00ac80d0	mov w1,#0x90
00ac80d4	mov x2,xzr
00ac80d8	bl 0x00c342c0
00ac80dc	mov x21,xzr
00ac80e0	str x21,[x19, #0x8]
00ac80e4	bl 0x00c35240
00ac80e8	ldr x1,[x19, #0x8]
00ac80ec	mov w2,#0x100
00ac80f0	mov w3,#0xe10
00ac80f4	mov x0,x20
00ac80f8	bl 0x00ac871c
00ac80fc	mov x21,x0
00ac8100	str x0,[x19, #0x10]
00ac8104	cbz x0,0x00ac7fd4
00ac8108	mov x0,x21
00ac810c	bl 0x00c3d160
00ac8110	cbnz w0,0x00ac7fd4
00ac8114	bl 0x00c342a0
00ac8118	adrp x0,0x2da000
00ac811c	adrp x2,0x2b6000
00ac8120	add x0,x0,#0x554
00ac8124	add x2,x2,#0x391
00ac8128	mov w1,#0x295
00ac812c	bl 0x00c342b0
00ac8130	orr w0,wzr,#0x6
00ac8134	mov w1,#0xd4
00ac8138	mov x2,xzr
00ac813c	bl 0x00c342c0
00ac8140	mov x0,x21
00ac8144	bl 0x00c3d140
00ac8148	mov x21,xzr
00ac814c	str xzr,[x19, #0x10]
00ac8150	b 0x00ac7fd4
00ac8154	bl 0x00c342a0
00ac8158	adrp x0,0x2da000
00ac815c	adrp x2,0x2ac000
00ac8160	add x0,x0,#0x554
00ac8164	add x2,x2,#0x77f
00ac8168	mov w1,#0x226
00ac816c	bl 0x00c342b0
00ac8170	mov w0,#0x24
00ac8174	mov w1,#0x8f
00ac8178	mov x2,xzr
00ac817c	bl 0x00c342c0
00ac8180	b 0x00ac80e0

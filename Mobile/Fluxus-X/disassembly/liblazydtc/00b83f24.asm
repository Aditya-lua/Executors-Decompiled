; mbedtls_mpi_core_mla @ 00b83f24
00b83f24	cmp x1,x3
00b83f28	csel x11,x1,x3,cc
00b83f2c	mov x9,x4
00b83f30	lsr x12,x11,#0x3
00b83f34	and x10,x11,#0x7
00b83f38	mov x8,xzr
00b83f3c	cbz x12,0x00b8406c
00b83f40	neg x12,x12
00b83f44	ldr x4,[x2], #0x8
00b83f48	ldr x5,[x0]
00b83f4c	mul x6,x4,x9
00b83f50	umulh x7,x4,x9
00b83f54	adds x5,x5,x6
00b83f58	adc x7,x7,xzr
00b83f5c	adds x5,x5,x8
00b83f60	adc x8,x7,xzr
00b83f64	str x5,[x0], #0x8
00b83f68	ldr x4,[x2], #0x8
00b83f6c	ldr x5,[x0]
00b83f70	mul x6,x4,x9
00b83f74	umulh x7,x4,x9
00b83f78	adds x5,x5,x6
00b83f7c	adc x7,x7,xzr
00b83f80	adds x5,x5,x8
00b83f84	adc x8,x7,xzr
00b83f88	str x5,[x0], #0x8
00b83f8c	ldr x4,[x2], #0x8
00b83f90	ldr x5,[x0]
00b83f94	mul x6,x4,x9
00b83f98	umulh x7,x4,x9
00b83f9c	adds x5,x5,x6
00b83fa0	adc x7,x7,xzr
00b83fa4	adds x5,x5,x8
00b83fa8	adc x8,x7,xzr
00b83fac	str x5,[x0], #0x8
00b83fb0	ldr x4,[x2], #0x8
00b83fb4	ldr x5,[x0]
00b83fb8	mul x6,x4,x9
00b83fbc	umulh x7,x4,x9
00b83fc0	adds x5,x5,x6
00b83fc4	adc x7,x7,xzr
00b83fc8	adds x5,x5,x8
00b83fcc	adc x8,x7,xzr
00b83fd0	str x5,[x0], #0x8
00b83fd4	ldr x4,[x2], #0x8
00b83fd8	ldr x5,[x0]
00b83fdc	mul x6,x4,x9
00b83fe0	umulh x7,x4,x9
00b83fe4	adds x5,x5,x6
00b83fe8	adc x7,x7,xzr
00b83fec	adds x5,x5,x8
00b83ff0	adc x8,x7,xzr
00b83ff4	str x5,[x0], #0x8
00b83ff8	ldr x4,[x2], #0x8
00b83ffc	ldr x5,[x0]
00b84000	mul x6,x4,x9
00b84004	umulh x7,x4,x9
00b84008	adds x5,x5,x6
00b8400c	adc x7,x7,xzr
00b84010	adds x5,x5,x8
00b84014	adc x8,x7,xzr
00b84018	str x5,[x0], #0x8
00b8401c	ldr x4,[x2], #0x8
00b84020	ldr x5,[x0]
00b84024	mul x6,x4,x9
00b84028	umulh x7,x4,x9
00b8402c	adds x5,x5,x6
00b84030	adc x7,x7,xzr
00b84034	adds x5,x5,x8
00b84038	adc x8,x7,xzr
00b8403c	str x5,[x0], #0x8
00b84040	ldr x4,[x2], #0x8
00b84044	ldr x5,[x0]
00b84048	mul x6,x4,x9
00b8404c	umulh x7,x4,x9
00b84050	adds x5,x5,x6
00b84054	adc x7,x7,xzr
00b84058	adds x5,x5,x8
00b8405c	adc x8,x7,xzr
00b84060	str x5,[x0], #0x8
00b84064	adds x12,x12,#0x1
00b84068	b.ne 0x00b83f44
00b8406c	sub x11,x1,x11
00b84070	cbz x10,0x00b840a4
00b84074	neg x10,x10
00b84078	ldr x4,[x2], #0x8
00b8407c	ldr x5,[x0]
00b84080	mul x6,x4,x9
00b84084	umulh x7,x4,x9
00b84088	adds x5,x5,x6
00b8408c	adc x7,x7,xzr
00b84090	adds x5,x5,x8
00b84094	adc x8,x7,xzr
00b84098	str x5,[x0], #0x8
00b8409c	adds x10,x10,#0x1
00b840a0	b.ne 0x00b84078
00b840a4	cbz x11,0x00b840e0
00b840a8	mvn x9,x1
00b840ac	mvn x10,x3
00b840b0	cmp x9,x10
00b840b4	csinv x10,x10,x1,ls
00b840b8	sub x9,x9,x10
00b840bc	ldr x11,[x0]
00b840c0	mov x10,x8
00b840c4	adds x11,x11,x8
00b840c8	cset w8,cs
00b840cc	adds x9,x9,#0x1
00b840d0	str x11,[x0], #0x8
00b840d4	b.ne 0x00b840bc
00b840d8	cmp x11,x10
00b840dc	cset w8,cc
00b840e0	mov x0,x8
00b840e4	ret

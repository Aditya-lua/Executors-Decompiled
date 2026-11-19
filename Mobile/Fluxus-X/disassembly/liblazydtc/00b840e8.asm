; mbedtls_mpi_core_mul @ 00b840e8
00b840e8	str x23,[sp, #-0x40]!
00b840ec	stp x22,x21,[sp, #0x10]
00b840f0	stp x20,x19,[sp, #0x20]
00b840f4	stp x29,x30,[sp, #0x30]
00b840f8	add x29,sp,#0x30
00b840fc	add x8,x4,x2
00b84100	mov x23,x2
00b84104	mov x21,x1
00b84108	lsl x2,x8,#0x3
00b8410c	mov w1,wzr
00b84110	mov x19,x4
00b84114	mov x20,x3
00b84118	mov x22,x0
00b8411c	bl 0x00c301c0
00b84120	cbz x19,0x00b84314
00b84124	orr x10,xzr,#-0x2
00b84128	adds x9,x23,#0x1
00b8412c	mvn x12,x23
00b84130	sub x14,x10,x23
00b84134	csel x11,x9,x23,cs
00b84138	cmp x12,x14
00b8413c	sub x9,x9,x11
00b84140	lsr x10,x11,#0x3
00b84144	and x11,x11,#0x7
00b84148	csinv x15,x14,x23,ls
00b8414c	mov x8,xzr
00b84150	neg x12,x10
00b84154	neg x13,x11
00b84158	sub x14,x14,x15
00b8415c	b 0x00b84170
00b84160	mov x18,x21
00b84164	mov x0,x13
00b84168	cbnz x11,0x00b842bc
00b8416c	b 0x00b842e8
00b84170	lsl x15,x8,#0x3
00b84174	ldr x17,[x20, x15#0x0]
00b84178	add x15,x22,x15
00b8417c	mov x16,xzr
00b84180	cbz x10,0x00b84160
00b84184	mov x0,x12
00b84188	mov x18,x21
00b8418c	ldr x4,[x18], #0x8
00b84190	ldr x5,[x15]
00b84194	mul x6,x4,x17
00b84198	umulh x7,x4,x17
00b8419c	adds x5,x5,x6
00b841a0	adc x7,x7,xzr
00b841a4	adds x5,x5,x16
00b841a8	adc x16,x7,xzr
00b841ac	str x5,[x15], #0x8
00b841b0	ldr x4,[x18], #0x8
00b841b4	ldr x5,[x15]
00b841b8	mul x6,x4,x17
00b841bc	umulh x7,x4,x17
00b841c0	adds x5,x5,x6
00b841c4	adc x7,x7,xzr
00b841c8	adds x5,x5,x16
00b841cc	adc x16,x7,xzr
00b841d0	str x5,[x15], #0x8
00b841d4	ldr x4,[x18], #0x8
00b841d8	ldr x5,[x15]
00b841dc	mul x6,x4,x17
00b841e0	umulh x7,x4,x17
00b841e4	adds x5,x5,x6
00b841e8	adc x7,x7,xzr
00b841ec	adds x5,x5,x16
00b841f0	adc x16,x7,xzr
00b841f4	str x5,[x15], #0x8
00b841f8	ldr x4,[x18], #0x8
00b841fc	ldr x5,[x15]
00b84200	mul x6,x4,x17
00b84204	umulh x7,x4,x17
00b84208	adds x5,x5,x6
00b8420c	adc x7,x7,xzr
00b84210	adds x5,x5,x16
00b84214	adc x16,x7,xzr
00b84218	str x5,[x15], #0x8
00b8421c	ldr x4,[x18], #0x8
00b84220	ldr x5,[x15]
00b84224	mul x6,x4,x17
00b84228	umulh x7,x4,x17
00b8422c	adds x5,x5,x6
00b84230	adc x7,x7,xzr
00b84234	adds x5,x5,x16
00b84238	adc x16,x7,xzr
00b8423c	str x5,[x15], #0x8
00b84240	ldr x4,[x18], #0x8
00b84244	ldr x5,[x15]
00b84248	mul x6,x4,x17
00b8424c	umulh x7,x4,x17
00b84250	adds x5,x5,x6
00b84254	adc x7,x7,xzr
00b84258	adds x5,x5,x16
00b8425c	adc x16,x7,xzr
00b84260	str x5,[x15], #0x8
00b84264	ldr x4,[x18], #0x8
00b84268	ldr x5,[x15]
00b8426c	mul x6,x4,x17
00b84270	umulh x7,x4,x17
00b84274	adds x5,x5,x6
00b84278	adc x7,x7,xzr
00b8427c	adds x5,x5,x16
00b84280	adc x16,x7,xzr
00b84284	str x5,[x15], #0x8
00b84288	ldr x4,[x18], #0x8
00b8428c	ldr x5,[x15]
00b84290	mul x6,x4,x17
00b84294	umulh x7,x4,x17
00b84298	adds x5,x5,x6
00b8429c	adc x7,x7,xzr
00b842a0	adds x5,x5,x16
00b842a4	adc x16,x7,xzr
00b842a8	str x5,[x15], #0x8
00b842ac	adds x0,x0,#0x1
00b842b0	b.ne 0x00b8418c
00b842b4	mov x0,x13
00b842b8	cbz x11,0x00b842e8
00b842bc	ldr x4,[x18], #0x8
00b842c0	ldr x5,[x15]
00b842c4	mul x6,x4,x17
00b842c8	umulh x7,x4,x17
00b842cc	adds x5,x5,x6
00b842d0	adc x7,x7,xzr
00b842d4	adds x5,x5,x16
00b842d8	adc x16,x7,xzr
00b842dc	str x5,[x15], #0x8
00b842e0	adds x0,x0,#0x1
00b842e4	b.ne 0x00b842bc
00b842e8	mov x17,x14
00b842ec	cbz x9,0x00b84308
00b842f0	ldr x18,[x15]
00b842f4	adds x18,x18,x16
00b842f8	cset w16,cs
00b842fc	adds x17,x17,#0x1
00b84300	str x18,[x15], #0x8
00b84304	b.ne 0x00b842f0
00b84308	add x8,x8,#0x1
00b8430c	cmp x8,x19
00b84310	b.ne 0x00b84170
00b84314	ldp x29,x30,[sp, #0x30]
00b84318	ldp x20,x19,[sp, #0x20]
00b8431c	ldp x22,x21,[sp, #0x10]
00b84320	ldr x23,[sp], #0x40
00b84324	ret

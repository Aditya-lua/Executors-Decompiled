; FUN_00af6210 @ 00af6210
00af6210	stp x24,x23,[sp, #-0x40]!
00af6214	add w8,w2,#0x7
00af6218	add w9,w2,#0xe
00af621c	cmp w8,#0x0
00af6220	csel w23,w9,w8,lt
00af6224	cmp w2,#0x0
00af6228	stp x20,x19,[sp, #0x20]
00af622c	mov x19,x0
00af6230	mov w0,wzr
00af6234	csel w24,w8,w2,lt
00af6238	stp x22,x21,[sp, #0x10]
00af623c	stp x29,x30,[sp, #0x30]
00af6240	add x29,sp,#0x30
00af6244	tbnz w2,#0x1f,0x00af6328
00af6248	lsl w8,w3,#0x3
00af624c	mov w21,w2
00af6250	cmp w8,w2
00af6254	b.lt 0x00af6328
00af6258	adrp x0,0xc7e000
00af625c	add x0,x0,#0x788
00af6260	mov x22,x1
00af6264	bl 0x00c372e0
00af6268	cbz x0,0x00af6328
00af626c	mov x20,x0
00af6270	ldr x0,[x0, #0x8]
00af6274	str wzr,[x20]
00af6278	cbnz x0,0x00af6288
00af627c	bl 0x00c38040
00af6280	str x0,[x20, #0x8]
00af6284	cbz x0,0x00af6314
00af6288	asr w23,w23,#0x3
00af628c	mov x1,x22
00af6290	mov w2,w23
00af6294	bl 0x00c373c0
00af6298	cbz w0,0x00af6314
00af629c	ldr x8,[x20, #0x8]
00af62a0	ldr x9,[x8, #0x10]
00af62a4	and x9,x9,#-0x8
00af62a8	str x9,[x8, #0x10]
00af62ac	ldr x9,[x20, #0x8]
00af62b0	and w8,w24,#0xfffffff8
00af62b4	sub w8,w21,w8
00af62b8	cmp w8,#0x1
00af62bc	ldr x10,[x9, #0x10]
00af62c0	orr x10,x10,#0x8
00af62c4	str x10,[x9, #0x10]
00af62c8	b.lt 0x00af6308
00af62cc	ldr x9,[x20, #0x8]
00af62d0	orr w11,wzr,#0xffffff00
00af62d4	asr w11,w11,w8
00af62d8	ldr x9,[x9, #0x8]
00af62dc	add x9,x9,w23, SXTW 
00af62e0	ldurb w10,[x9, #-0x1]
00af62e4	and w10,w10,w11
00af62e8	sturb w10,[x9, #-0x1]
00af62ec	ldr x9,[x20, #0x8]
00af62f0	mov w11,#0x8
00af62f4	sub w8,w11,w8
00af62f8	sxtw x8,w8
00af62fc	ldr x10,[x9, #0x10]
00af6300	orr x8,x10,x8
00af6304	str x8,[x9, #0x10]
00af6308	str x20,[x19]
00af630c	mov w0,#0x1
00af6310	b 0x00af6328
00af6314	adrp x1,0xc7e000
00af6318	add x1,x1,#0x788
00af631c	mov x0,x20
00af6320	bl 0x00c36160
00af6324	mov w0,wzr
00af6328	ldp x29,x30,[sp, #0x30]
00af632c	ldp x20,x19,[sp, #0x20]
00af6330	ldp x22,x21,[sp, #0x10]
00af6334	ldp x24,x23,[sp], #0x40
00af6338	ret

; FUN_00bf9374 @ 00bf9374
00bf9374	paciasp
00bf9378	sub sp,sp,#0x50
00bf937c	stp x29,x30,[sp, #0x20]
00bf9380	stp x22,x21,[sp, #0x30]
00bf9384	stp x20,x19,[sp, #0x40]
00bf9388	add x29,sp,#0x20
00bf938c	adrp x20,0xcb5000
00bf9390	mov x19,x1
00bf9394	mov x21,x0
00bf9398	ldr x20,[x20, #0xc30]
00bf939c	str x20,[sp, #0x8]
00bf93a0	ldar x8,[x20]
00bf93a4	cmn x8,#0x1
00bf93a8	b.eq 0x00bf93d4
00bf93ac	add x8,sp,#0x8
00bf93b0	sub x9,x29,#0x8
00bf93b4	adrp x0,0xcb5000
00bf93b8	stur x8,[x29, #-0x8]
00bf93bc	nop
00bf93c0	adr x2,0xc0bab0
00bf93c4	str x9,[sp, #0x10]
00bf93c8	add x1,sp,#0x10
00bf93cc	ldr x0,[x0, #0xc30]
00bf93d0	bl 0x00c305d0
00bf93d4	ldp x8,x10,[x19, #0x10]
00bf93d8	ldrsw x9,[x20, #0x8]
00bf93dc	sub x22,x9,#0x1
00bf93e0	sub x9,x10,x8
00bf93e4	cmp x22,x9, ASR #0x3
00bf93e8	b.cs 0x00bf9488
00bf93ec	ldr x19,[x8, x22, LSL #0x3]
00bf93f0	cbz x19,0x00bf9488
00bf93f4	add x1,x19,#0x8
00bf93f8	mov w0,#0x1
00bf93fc	bl 0x00c2bce0
00bf9400	mov x20,x21
00bf9404	ldp x8,x9,[x20, #0x10]!
00bf9408	sub x9,x9,x8
00bf940c	asr x10,x9,#0x3
00bf9410	cmp x10,x22
00bf9414	b.hi 0x00bf9440
00bf9418	add x9,x22,#0x1
00bf941c	subs x1,x9,x10
00bf9420	b.ls 0x00bf9434
00bf9424	mov x0,x20
00bf9428	bl 0x00c0b6e4
00bf942c	ldr x8,[x20]
00bf9430	b 0x00bf9440
00bf9434	b.cs 0x00bf9440
00bf9438	add x9,x8,x9, LSL #0x3
00bf943c	str x9,[x21, #0x18]
00bf9440	ldr x21,[x8, x22, LSL #0x3]
00bf9444	cbz x21,0x00bf9468
00bf9448	add x1,x21,#0x8
00bf944c	mov x0,#-0x1
00bf9450	bl 0x00c2bd10
00bf9454	cbnz x0,0x00bf9468
00bf9458	ldr x8,[x21]
00bf945c	mov x0,x21
00bf9460	ldr x8,[x8, #0x10]
00bf9464	blr x8
00bf9468	ldr x8,[x20]
00bf946c	str x19,[x8, x22, LSL #0x3]
00bf9470	ldp x20,x19,[sp, #0x40]
00bf9474	ldp x22,x21,[sp, #0x30]
00bf9478	ldp x29,x30,[sp, #0x20]
00bf947c	add sp,sp,#0x50
00bf9480	autiasp
00bf9484	ret
00bf9488	bl 0x00bd8968

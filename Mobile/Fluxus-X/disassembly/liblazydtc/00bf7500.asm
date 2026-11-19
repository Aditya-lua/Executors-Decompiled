; FUN_00bf7500 @ 00bf7500
00bf7500	paciasp
00bf7504	sub sp,sp,#0x50
00bf7508	stp x29,x30,[sp, #0x20]
00bf750c	stp x22,x21,[sp, #0x30]
00bf7510	stp x20,x19,[sp, #0x40]
00bf7514	add x29,sp,#0x20
00bf7518	adrp x20,0xcb5000
00bf751c	mov x19,x1
00bf7520	mov x21,x0
00bf7524	ldr x20,[x20, #0xd70]
00bf7528	str x20,[sp, #0x8]
00bf752c	ldar x8,[x20]
00bf7530	cmn x8,#0x1
00bf7534	b.eq 0x00bf7560
00bf7538	add x8,sp,#0x8
00bf753c	sub x9,x29,#0x8
00bf7540	adrp x0,0xcb5000
00bf7544	stur x8,[x29, #-0x8]
00bf7548	nop
00bf754c	adr x2,0xc0bab0
00bf7550	str x9,[sp, #0x10]
00bf7554	add x1,sp,#0x10
00bf7558	ldr x0,[x0, #0xd70]
00bf755c	bl 0x00c305d0
00bf7560	ldrsw x8,[x20, #0x8]
00bf7564	add x1,x19,#0x8
00bf7568	mov w0,#0x1
00bf756c	sub x22,x8,#0x1
00bf7570	bl 0x00c2bce0
00bf7574	mov x20,x21
00bf7578	ldp x8,x9,[x20, #0x10]!
00bf757c	sub x9,x9,x8
00bf7580	asr x10,x9,#0x3
00bf7584	cmp x10,x22
00bf7588	b.hi 0x00bf75b4
00bf758c	add x9,x22,#0x1
00bf7590	subs x1,x9,x10
00bf7594	b.ls 0x00bf75a8
00bf7598	mov x0,x20
00bf759c	bl 0x00c0b6e4
00bf75a0	ldr x8,[x20]
00bf75a4	b 0x00bf75b4
00bf75a8	b.cs 0x00bf75b4
00bf75ac	add x9,x8,x9, LSL #0x3
00bf75b0	str x9,[x21, #0x18]
00bf75b4	ldr x21,[x8, x22, LSL #0x3]
00bf75b8	cbz x21,0x00bf75dc
00bf75bc	add x1,x21,#0x8
00bf75c0	mov x0,#-0x1
00bf75c4	bl 0x00c2bd10
00bf75c8	cbnz x0,0x00bf75dc
00bf75cc	ldr x8,[x21]
00bf75d0	mov x0,x21
00bf75d4	ldr x8,[x8, #0x10]
00bf75d8	blr x8
00bf75dc	ldr x8,[x20]
00bf75e0	str x19,[x8, x22, LSL #0x3]
00bf75e4	ldp x20,x19,[sp, #0x40]
00bf75e8	ldp x22,x21,[sp, #0x30]
00bf75ec	ldp x29,x30,[sp, #0x20]
00bf75f0	add sp,sp,#0x50
00bf75f4	autiasp
00bf75f8	ret

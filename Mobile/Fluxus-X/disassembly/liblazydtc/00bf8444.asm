; FUN_00bf8444 @ 00bf8444
00bf8444	paciasp
00bf8448	sub sp,sp,#0x50
00bf844c	stp x29,x30,[sp, #0x20]
00bf8450	stp x22,x21,[sp, #0x30]
00bf8454	stp x20,x19,[sp, #0x40]
00bf8458	add x29,sp,#0x20
00bf845c	adrp x20,0xcb5000
00bf8460	mov x19,x1
00bf8464	mov x21,x0
00bf8468	ldr x20,[x20, #0xc50]
00bf846c	str x20,[sp, #0x8]
00bf8470	ldar x8,[x20]
00bf8474	cmn x8,#0x1
00bf8478	b.eq 0x00bf84a4
00bf847c	add x8,sp,#0x8
00bf8480	sub x9,x29,#0x8
00bf8484	adrp x0,0xcb5000
00bf8488	stur x8,[x29, #-0x8]
00bf848c	nop
00bf8490	adr x2,0xc0bab0
00bf8494	str x9,[sp, #0x10]
00bf8498	add x1,sp,#0x10
00bf849c	ldr x0,[x0, #0xc50]
00bf84a0	bl 0x00c305d0
00bf84a4	ldp x8,x10,[x19, #0x10]
00bf84a8	ldrsw x9,[x20, #0x8]
00bf84ac	sub x22,x9,#0x1
00bf84b0	sub x9,x10,x8
00bf84b4	cmp x22,x9, ASR #0x3
00bf84b8	b.cs 0x00bf8558
00bf84bc	ldr x19,[x8, x22, LSL #0x3]
00bf84c0	cbz x19,0x00bf8558
00bf84c4	add x1,x19,#0x8
00bf84c8	mov w0,#0x1
00bf84cc	bl 0x00c2bce0
00bf84d0	mov x20,x21
00bf84d4	ldp x8,x9,[x20, #0x10]!
00bf84d8	sub x9,x9,x8
00bf84dc	asr x10,x9,#0x3
00bf84e0	cmp x10,x22
00bf84e4	b.hi 0x00bf8510
00bf84e8	add x9,x22,#0x1
00bf84ec	subs x1,x9,x10
00bf84f0	b.ls 0x00bf8504
00bf84f4	mov x0,x20
00bf84f8	bl 0x00c0b6e4
00bf84fc	ldr x8,[x20]
00bf8500	b 0x00bf8510
00bf8504	b.cs 0x00bf8510
00bf8508	add x9,x8,x9, LSL #0x3
00bf850c	str x9,[x21, #0x18]
00bf8510	ldr x21,[x8, x22, LSL #0x3]
00bf8514	cbz x21,0x00bf8538
00bf8518	add x1,x21,#0x8
00bf851c	mov x0,#-0x1
00bf8520	bl 0x00c2bd10
00bf8524	cbnz x0,0x00bf8538
00bf8528	ldr x8,[x21]
00bf852c	mov x0,x21
00bf8530	ldr x8,[x8, #0x10]
00bf8534	blr x8
00bf8538	ldr x8,[x20]
00bf853c	str x19,[x8, x22, LSL #0x3]
00bf8540	ldp x20,x19,[sp, #0x40]
00bf8544	ldp x22,x21,[sp, #0x30]
00bf8548	ldp x29,x30,[sp, #0x20]
00bf854c	add sp,sp,#0x50
00bf8550	autiasp
00bf8554	ret
00bf8558	bl 0x00bd8968

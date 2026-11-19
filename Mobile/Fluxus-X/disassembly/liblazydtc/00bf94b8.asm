; FUN_00bf94b8 @ 00bf94b8
00bf94b8	paciasp
00bf94bc	sub sp,sp,#0x50
00bf94c0	stp x29,x30,[sp, #0x20]
00bf94c4	stp x22,x21,[sp, #0x30]
00bf94c8	stp x20,x19,[sp, #0x40]
00bf94cc	add x29,sp,#0x20
00bf94d0	adrp x20,0xcb5000
00bf94d4	mov x19,x1
00bf94d8	mov x21,x0
00bf94dc	ldr x20,[x20, #0xcf0]
00bf94e0	str x20,[sp, #0x8]
00bf94e4	ldar x8,[x20]
00bf94e8	cmn x8,#0x1
00bf94ec	b.eq 0x00bf9518
00bf94f0	add x8,sp,#0x8
00bf94f4	sub x9,x29,#0x8
00bf94f8	adrp x0,0xcb5000
00bf94fc	stur x8,[x29, #-0x8]
00bf9500	nop
00bf9504	adr x2,0xc0bab0
00bf9508	str x9,[sp, #0x10]
00bf950c	add x1,sp,#0x10
00bf9510	ldr x0,[x0, #0xcf0]
00bf9514	bl 0x00c305d0
00bf9518	ldp x8,x10,[x19, #0x10]
00bf951c	ldrsw x9,[x20, #0x8]
00bf9520	sub x22,x9,#0x1
00bf9524	sub x9,x10,x8
00bf9528	cmp x22,x9, ASR #0x3
00bf952c	b.cs 0x00bf95cc
00bf9530	ldr x19,[x8, x22, LSL #0x3]
00bf9534	cbz x19,0x00bf95cc
00bf9538	add x1,x19,#0x8
00bf953c	mov w0,#0x1
00bf9540	bl 0x00c2bce0
00bf9544	mov x20,x21
00bf9548	ldp x8,x9,[x20, #0x10]!
00bf954c	sub x9,x9,x8
00bf9550	asr x10,x9,#0x3
00bf9554	cmp x10,x22
00bf9558	b.hi 0x00bf9584
00bf955c	add x9,x22,#0x1
00bf9560	subs x1,x9,x10
00bf9564	b.ls 0x00bf9578
00bf9568	mov x0,x20
00bf956c	bl 0x00c0b6e4
00bf9570	ldr x8,[x20]
00bf9574	b 0x00bf9584
00bf9578	b.cs 0x00bf9584
00bf957c	add x9,x8,x9, LSL #0x3
00bf9580	str x9,[x21, #0x18]
00bf9584	ldr x21,[x8, x22, LSL #0x3]
00bf9588	cbz x21,0x00bf95ac
00bf958c	add x1,x21,#0x8
00bf9590	mov x0,#-0x1
00bf9594	bl 0x00c2bd10
00bf9598	cbnz x0,0x00bf95ac
00bf959c	ldr x8,[x21]
00bf95a0	mov x0,x21
00bf95a4	ldr x8,[x8, #0x10]
00bf95a8	blr x8
00bf95ac	ldr x8,[x20]
00bf95b0	str x19,[x8, x22, LSL #0x3]
00bf95b4	ldp x20,x19,[sp, #0x40]
00bf95b8	ldp x22,x21,[sp, #0x30]
00bf95bc	ldp x29,x30,[sp, #0x20]
00bf95c0	add sp,sp,#0x50
00bf95c4	autiasp
00bf95c8	ret
00bf95cc	bl 0x00bd8968

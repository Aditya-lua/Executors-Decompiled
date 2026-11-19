; FUN_00bf86cc @ 00bf86cc
00bf86cc	paciasp
00bf86d0	sub sp,sp,#0x50
00bf86d4	stp x29,x30,[sp, #0x20]
00bf86d8	stp x22,x21,[sp, #0x30]
00bf86dc	stp x20,x19,[sp, #0x40]
00bf86e0	add x29,sp,#0x20
00bf86e4	adrp x20,0xcb5000
00bf86e8	mov x19,x1
00bf86ec	mov x21,x0
00bf86f0	ldr x20,[x20, #0xb98]
00bf86f4	str x20,[sp, #0x8]
00bf86f8	ldar x8,[x20]
00bf86fc	cmn x8,#0x1
00bf8700	b.eq 0x00bf872c
00bf8704	add x8,sp,#0x8
00bf8708	sub x9,x29,#0x8
00bf870c	adrp x0,0xcb5000
00bf8710	stur x8,[x29, #-0x8]
00bf8714	nop
00bf8718	adr x2,0xc0bab0
00bf871c	str x9,[sp, #0x10]
00bf8720	add x1,sp,#0x10
00bf8724	ldr x0,[x0, #0xb98]
00bf8728	bl 0x00c305d0
00bf872c	ldp x8,x10,[x19, #0x10]
00bf8730	ldrsw x9,[x20, #0x8]
00bf8734	sub x22,x9,#0x1
00bf8738	sub x9,x10,x8
00bf873c	cmp x22,x9, ASR #0x3
00bf8740	b.cs 0x00bf87e0
00bf8744	ldr x19,[x8, x22, LSL #0x3]
00bf8748	cbz x19,0x00bf87e0
00bf874c	add x1,x19,#0x8
00bf8750	mov w0,#0x1
00bf8754	bl 0x00c2bce0
00bf8758	mov x20,x21
00bf875c	ldp x8,x9,[x20, #0x10]!
00bf8760	sub x9,x9,x8
00bf8764	asr x10,x9,#0x3
00bf8768	cmp x10,x22
00bf876c	b.hi 0x00bf8798
00bf8770	add x9,x22,#0x1
00bf8774	subs x1,x9,x10
00bf8778	b.ls 0x00bf878c
00bf877c	mov x0,x20
00bf8780	bl 0x00c0b6e4
00bf8784	ldr x8,[x20]
00bf8788	b 0x00bf8798
00bf878c	b.cs 0x00bf8798
00bf8790	add x9,x8,x9, LSL #0x3
00bf8794	str x9,[x21, #0x18]
00bf8798	ldr x21,[x8, x22, LSL #0x3]
00bf879c	cbz x21,0x00bf87c0
00bf87a0	add x1,x21,#0x8
00bf87a4	mov x0,#-0x1
00bf87a8	bl 0x00c2bd10
00bf87ac	cbnz x0,0x00bf87c0
00bf87b0	ldr x8,[x21]
00bf87b4	mov x0,x21
00bf87b8	ldr x8,[x8, #0x10]
00bf87bc	blr x8
00bf87c0	ldr x8,[x20]
00bf87c4	str x19,[x8, x22, LSL #0x3]
00bf87c8	ldp x20,x19,[sp, #0x40]
00bf87cc	ldp x22,x21,[sp, #0x30]
00bf87d0	ldp x29,x30,[sp, #0x20]
00bf87d4	add sp,sp,#0x50
00bf87d8	autiasp
00bf87dc	ret
00bf87e0	bl 0x00bd8968

; FUN_00bf8588 @ 00bf8588
00bf8588	paciasp
00bf858c	sub sp,sp,#0x50
00bf8590	stp x29,x30,[sp, #0x20]
00bf8594	stp x22,x21,[sp, #0x30]
00bf8598	stp x20,x19,[sp, #0x40]
00bf859c	add x29,sp,#0x20
00bf85a0	adrp x20,0xcb4000
00bf85a4	mov x19,x1
00bf85a8	mov x21,x0
00bf85ac	ldr x20,[x20, #0x998]
00bf85b0	str x20,[sp, #0x8]
00bf85b4	ldar x8,[x20]
00bf85b8	cmn x8,#0x1
00bf85bc	b.eq 0x00bf85e8
00bf85c0	add x8,sp,#0x8
00bf85c4	sub x9,x29,#0x8
00bf85c8	adrp x0,0xcb4000
00bf85cc	stur x8,[x29, #-0x8]
00bf85d0	nop
00bf85d4	adr x2,0xc0bab0
00bf85d8	str x9,[sp, #0x10]
00bf85dc	add x1,sp,#0x10
00bf85e0	ldr x0,[x0, #0x998]
00bf85e4	bl 0x00c305d0
00bf85e8	ldp x8,x10,[x19, #0x10]
00bf85ec	ldrsw x9,[x20, #0x8]
00bf85f0	sub x22,x9,#0x1
00bf85f4	sub x9,x10,x8
00bf85f8	cmp x22,x9, ASR #0x3
00bf85fc	b.cs 0x00bf869c
00bf8600	ldr x19,[x8, x22, LSL #0x3]
00bf8604	cbz x19,0x00bf869c
00bf8608	add x1,x19,#0x8
00bf860c	mov w0,#0x1
00bf8610	bl 0x00c2bce0
00bf8614	mov x20,x21
00bf8618	ldp x8,x9,[x20, #0x10]!
00bf861c	sub x9,x9,x8
00bf8620	asr x10,x9,#0x3
00bf8624	cmp x10,x22
00bf8628	b.hi 0x00bf8654
00bf862c	add x9,x22,#0x1
00bf8630	subs x1,x9,x10
00bf8634	b.ls 0x00bf8648
00bf8638	mov x0,x20
00bf863c	bl 0x00c0b6e4
00bf8640	ldr x8,[x20]
00bf8644	b 0x00bf8654
00bf8648	b.cs 0x00bf8654
00bf864c	add x9,x8,x9, LSL #0x3
00bf8650	str x9,[x21, #0x18]
00bf8654	ldr x21,[x8, x22, LSL #0x3]
00bf8658	cbz x21,0x00bf867c
00bf865c	add x1,x21,#0x8
00bf8660	mov x0,#-0x1
00bf8664	bl 0x00c2bd10
00bf8668	cbnz x0,0x00bf867c
00bf866c	ldr x8,[x21]
00bf8670	mov x0,x21
00bf8674	ldr x8,[x8, #0x10]
00bf8678	blr x8
00bf867c	ldr x8,[x20]
00bf8680	str x19,[x8, x22, LSL #0x3]
00bf8684	ldp x20,x19,[sp, #0x40]
00bf8688	ldp x22,x21,[sp, #0x30]
00bf868c	ldp x29,x30,[sp, #0x20]
00bf8690	add sp,sp,#0x50
00bf8694	autiasp
00bf8698	ret
00bf869c	bl 0x00bd8968

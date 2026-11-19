; FUN_00bf8810 @ 00bf8810
00bf8810	paciasp
00bf8814	sub sp,sp,#0x50
00bf8818	stp x29,x30,[sp, #0x20]
00bf881c	stp x22,x21,[sp, #0x30]
00bf8820	stp x20,x19,[sp, #0x40]
00bf8824	add x29,sp,#0x20
00bf8828	adrp x20,0xcb4000
00bf882c	mov x19,x1
00bf8830	mov x21,x0
00bf8834	ldr x20,[x20, #0xf70]
00bf8838	str x20,[sp, #0x8]
00bf883c	ldar x8,[x20]
00bf8840	cmn x8,#0x1
00bf8844	b.eq 0x00bf8870
00bf8848	add x8,sp,#0x8
00bf884c	sub x9,x29,#0x8
00bf8850	adrp x0,0xcb4000
00bf8854	stur x8,[x29, #-0x8]
00bf8858	nop
00bf885c	adr x2,0xc0bab0
00bf8860	str x9,[sp, #0x10]
00bf8864	add x1,sp,#0x10
00bf8868	ldr x0,[x0, #0xf70]
00bf886c	bl 0x00c305d0
00bf8870	ldp x8,x10,[x19, #0x10]
00bf8874	ldrsw x9,[x20, #0x8]
00bf8878	sub x22,x9,#0x1
00bf887c	sub x9,x10,x8
00bf8880	cmp x22,x9, ASR #0x3
00bf8884	b.cs 0x00bf8924
00bf8888	ldr x19,[x8, x22, LSL #0x3]
00bf888c	cbz x19,0x00bf8924
00bf8890	add x1,x19,#0x8
00bf8894	mov w0,#0x1
00bf8898	bl 0x00c2bce0
00bf889c	mov x20,x21
00bf88a0	ldp x8,x9,[x20, #0x10]!
00bf88a4	sub x9,x9,x8
00bf88a8	asr x10,x9,#0x3
00bf88ac	cmp x10,x22
00bf88b0	b.hi 0x00bf88dc
00bf88b4	add x9,x22,#0x1
00bf88b8	subs x1,x9,x10
00bf88bc	b.ls 0x00bf88d0
00bf88c0	mov x0,x20
00bf88c4	bl 0x00c0b6e4
00bf88c8	ldr x8,[x20]
00bf88cc	b 0x00bf88dc
00bf88d0	b.cs 0x00bf88dc
00bf88d4	add x9,x8,x9, LSL #0x3
00bf88d8	str x9,[x21, #0x18]
00bf88dc	ldr x21,[x8, x22, LSL #0x3]
00bf88e0	cbz x21,0x00bf8904
00bf88e4	add x1,x21,#0x8
00bf88e8	mov x0,#-0x1
00bf88ec	bl 0x00c2bd10
00bf88f0	cbnz x0,0x00bf8904
00bf88f4	ldr x8,[x21]
00bf88f8	mov x0,x21
00bf88fc	ldr x8,[x8, #0x10]
00bf8900	blr x8
00bf8904	ldr x8,[x20]
00bf8908	str x19,[x8, x22, LSL #0x3]
00bf890c	ldp x20,x19,[sp, #0x40]
00bf8910	ldp x22,x21,[sp, #0x30]
00bf8914	ldp x29,x30,[sp, #0x20]
00bf8918	add sp,sp,#0x50
00bf891c	autiasp
00bf8920	ret
00bf8924	bl 0x00bd8968

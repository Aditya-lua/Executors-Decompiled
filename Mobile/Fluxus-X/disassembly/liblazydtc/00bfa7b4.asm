; FUN_00bfa7b4 @ 00bfa7b4
00bfa7b4	paciasp
00bfa7b8	sub sp,sp,#0x50
00bfa7bc	stp x29,x30,[sp, #0x20]
00bfa7c0	stp x22,x21,[sp, #0x30]
00bfa7c4	stp x20,x19,[sp, #0x40]
00bfa7c8	add x29,sp,#0x20
00bfa7cc	adrp x20,0xcb5000
00bfa7d0	mov x19,x1
00bfa7d4	mov x21,x0
00bfa7d8	ldr x20,[x20, #0xd80]
00bfa7dc	str x20,[sp, #0x8]
00bfa7e0	ldar x8,[x20]
00bfa7e4	cmn x8,#0x1
00bfa7e8	b.eq 0x00bfa814
00bfa7ec	add x8,sp,#0x8
00bfa7f0	sub x9,x29,#0x8
00bfa7f4	adrp x0,0xcb5000
00bfa7f8	stur x8,[x29, #-0x8]
00bfa7fc	nop
00bfa800	adr x2,0xc0bab0
00bfa804	str x9,[sp, #0x10]
00bfa808	add x1,sp,#0x10
00bfa80c	ldr x0,[x0, #0xd80]
00bfa810	bl 0x00c305d0
00bfa814	ldp x8,x10,[x19, #0x10]
00bfa818	ldrsw x9,[x20, #0x8]
00bfa81c	sub x22,x9,#0x1
00bfa820	sub x9,x10,x8
00bfa824	cmp x22,x9, ASR #0x3
00bfa828	b.cs 0x00bfa8c8
00bfa82c	ldr x19,[x8, x22, LSL #0x3]
00bfa830	cbz x19,0x00bfa8c8
00bfa834	add x1,x19,#0x8
00bfa838	mov w0,#0x1
00bfa83c	bl 0x00c2bce0
00bfa840	mov x20,x21
00bfa844	ldp x8,x9,[x20, #0x10]!
00bfa848	sub x9,x9,x8
00bfa84c	asr x10,x9,#0x3
00bfa850	cmp x10,x22
00bfa854	b.hi 0x00bfa880
00bfa858	add x9,x22,#0x1
00bfa85c	subs x1,x9,x10
00bfa860	b.ls 0x00bfa874
00bfa864	mov x0,x20
00bfa868	bl 0x00c0b6e4
00bfa86c	ldr x8,[x20]
00bfa870	b 0x00bfa880
00bfa874	b.cs 0x00bfa880
00bfa878	add x9,x8,x9, LSL #0x3
00bfa87c	str x9,[x21, #0x18]
00bfa880	ldr x21,[x8, x22, LSL #0x3]
00bfa884	cbz x21,0x00bfa8a8
00bfa888	add x1,x21,#0x8
00bfa88c	mov x0,#-0x1
00bfa890	bl 0x00c2bd10
00bfa894	cbnz x0,0x00bfa8a8
00bfa898	ldr x8,[x21]
00bfa89c	mov x0,x21
00bfa8a0	ldr x8,[x8, #0x10]
00bfa8a4	blr x8
00bfa8a8	ldr x8,[x20]
00bfa8ac	str x19,[x8, x22, LSL #0x3]
00bfa8b0	ldp x20,x19,[sp, #0x40]
00bfa8b4	ldp x22,x21,[sp, #0x30]
00bfa8b8	ldp x29,x30,[sp, #0x20]
00bfa8bc	add sp,sp,#0x50
00bfa8c0	autiasp
00bfa8c4	ret
00bfa8c8	bl 0x00bd8968

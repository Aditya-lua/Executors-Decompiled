; FUN_00bf65e8 @ 00bf65e8
00bf65e8	paciasp
00bf65ec	sub sp,sp,#0x50
00bf65f0	stp x29,x30,[sp, #0x20]
00bf65f4	stp x22,x21,[sp, #0x30]
00bf65f8	stp x20,x19,[sp, #0x40]
00bf65fc	add x29,sp,#0x20
00bf6600	adrp x20,0xcb5000
00bf6604	mov x19,x1
00bf6608	mov x21,x0
00bf660c	ldr x20,[x20, #0xc00]
00bf6610	str x20,[sp, #0x8]
00bf6614	ldar x8,[x20]
00bf6618	cmn x8,#0x1
00bf661c	b.eq 0x00bf6648
00bf6620	add x8,sp,#0x8
00bf6624	sub x9,x29,#0x8
00bf6628	adrp x0,0xcb5000
00bf662c	stur x8,[x29, #-0x8]
00bf6630	nop
00bf6634	adr x2,0xc0bab0
00bf6638	str x9,[sp, #0x10]
00bf663c	add x1,sp,#0x10
00bf6640	ldr x0,[x0, #0xc00]
00bf6644	bl 0x00c305d0
00bf6648	ldrsw x8,[x20, #0x8]
00bf664c	add x1,x19,#0x8
00bf6650	mov w0,#0x1
00bf6654	sub x22,x8,#0x1
00bf6658	bl 0x00c2bce0
00bf665c	mov x20,x21
00bf6660	ldp x8,x9,[x20, #0x10]!
00bf6664	sub x9,x9,x8
00bf6668	asr x10,x9,#0x3
00bf666c	cmp x10,x22
00bf6670	b.hi 0x00bf669c
00bf6674	add x9,x22,#0x1
00bf6678	subs x1,x9,x10
00bf667c	b.ls 0x00bf6690
00bf6680	mov x0,x20
00bf6684	bl 0x00c0b6e4
00bf6688	ldr x8,[x20]
00bf668c	b 0x00bf669c
00bf6690	b.cs 0x00bf669c
00bf6694	add x9,x8,x9, LSL #0x3
00bf6698	str x9,[x21, #0x18]
00bf669c	ldr x21,[x8, x22, LSL #0x3]
00bf66a0	cbz x21,0x00bf66c4
00bf66a4	add x1,x21,#0x8
00bf66a8	mov x0,#-0x1
00bf66ac	bl 0x00c2bd10
00bf66b0	cbnz x0,0x00bf66c4
00bf66b4	ldr x8,[x21]
00bf66b8	mov x0,x21
00bf66bc	ldr x8,[x8, #0x10]
00bf66c0	blr x8
00bf66c4	ldr x8,[x20]
00bf66c8	str x19,[x8, x22, LSL #0x3]
00bf66cc	ldp x20,x19,[sp, #0x40]
00bf66d0	ldp x22,x21,[sp, #0x30]
00bf66d4	ldp x29,x30,[sp, #0x20]
00bf66d8	add sp,sp,#0x50
00bf66dc	autiasp
00bf66e0	ret

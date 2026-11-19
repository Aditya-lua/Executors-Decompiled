; FUN_00bcd424 @ 00bcd424
00bcd424	paciasp
00bcd428	stp x29,x30,[sp, #-0x30]!
00bcd42c	stp x22,x21,[sp, #0x10]
00bcd430	stp x20,x19,[sp, #0x20]
00bcd434	mov x29,sp
00bcd438	ldp x20,x21,[x0, #0x18]
00bcd43c	mov x19,x0
00bcd440	cmp x20,x21
00bcd444	b.eq 0x00bcd464
00bcd448	ldr x0,[x20]
00bcd44c	bl 0x00c315e0
00bcd450	ldr x0,[x20, #0x8]
00bcd454	bl 0x00c2ff20
00bcd458	add x20,x20,#0x10
00bcd45c	cmp x20,x21
00bcd460	b.ne 0x00bcd448
00bcd464	ldp x21,x22,[x19]
00bcd468	b 0x00bcd470
00bcd46c	add x21,x21,#0x8
00bcd470	cmp x21,x22
00bcd474	b.eq 0x00bcd4a8
00bcd478	ldr x0,[x21]
00bcd47c	bl 0x00c43ea0
00bcd480	ldr x20,[x21]
00bcd484	mov x0,#-0x1
00bcd488	add x1,x20,#0x8
00bcd48c	bl 0x00c2bd10
00bcd490	cbnz x0,0x00bcd46c
00bcd494	ldr x8,[x20]
00bcd498	mov x0,x20
00bcd49c	ldr x8,[x8, #0x10]
00bcd4a0	blr x8
00bcd4a4	b 0x00bcd46c
00bcd4a8	ldr x0,[x19, #0x18]
00bcd4ac	cbz x0,0x00bcd4b8
00bcd4b0	str x0,[x19, #0x20]
00bcd4b4	bl 0x00c301d0
00bcd4b8	ldr x0,[x19]
00bcd4bc	cbz x0,0x00bcd4d8
00bcd4c0	str x0,[x19, #0x8]
00bcd4c4	ldp x20,x19,[sp, #0x20]
00bcd4c8	ldp x22,x21,[sp, #0x10]
00bcd4cc	ldp x29,x30,[sp], #0x30
00bcd4d0	autiasp
00bcd4d4	b 0x00c301d0
00bcd4d8	ldp x20,x19,[sp, #0x20]
00bcd4dc	ldp x22,x21,[sp, #0x10]
00bcd4e0	ldp x29,x30,[sp], #0x30
00bcd4e4	autiasp
00bcd4e8	ret

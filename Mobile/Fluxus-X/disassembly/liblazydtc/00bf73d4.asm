; FUN_00bf73d4 @ 00bf73d4
00bf73d4	paciasp
00bf73d8	sub sp,sp,#0x50
00bf73dc	stp x29,x30,[sp, #0x20]
00bf73e0	stp x22,x21,[sp, #0x30]
00bf73e4	stp x20,x19,[sp, #0x40]
00bf73e8	add x29,sp,#0x20
00bf73ec	adrp x20,0xcb5000
00bf73f0	mov x19,x1
00bf73f4	mov x21,x0
00bf73f8	ldr x20,[x20, #0xd60]
00bf73fc	str x20,[sp, #0x8]
00bf7400	ldar x8,[x20]
00bf7404	cmn x8,#0x1
00bf7408	b.eq 0x00bf7434
00bf740c	add x8,sp,#0x8
00bf7410	sub x9,x29,#0x8
00bf7414	adrp x0,0xcb5000
00bf7418	stur x8,[x29, #-0x8]
00bf741c	nop
00bf7420	adr x2,0xc0bab0
00bf7424	str x9,[sp, #0x10]
00bf7428	add x1,sp,#0x10
00bf742c	ldr x0,[x0, #0xd60]
00bf7430	bl 0x00c305d0
00bf7434	ldrsw x8,[x20, #0x8]
00bf7438	add x1,x19,#0x8
00bf743c	mov w0,#0x1
00bf7440	sub x22,x8,#0x1
00bf7444	bl 0x00c2bce0
00bf7448	mov x20,x21
00bf744c	ldp x8,x9,[x20, #0x10]!
00bf7450	sub x9,x9,x8
00bf7454	asr x10,x9,#0x3
00bf7458	cmp x10,x22
00bf745c	b.hi 0x00bf7488
00bf7460	add x9,x22,#0x1
00bf7464	subs x1,x9,x10
00bf7468	b.ls 0x00bf747c
00bf746c	mov x0,x20
00bf7470	bl 0x00c0b6e4
00bf7474	ldr x8,[x20]
00bf7478	b 0x00bf7488
00bf747c	b.cs 0x00bf7488
00bf7480	add x9,x8,x9, LSL #0x3
00bf7484	str x9,[x21, #0x18]
00bf7488	ldr x21,[x8, x22, LSL #0x3]
00bf748c	cbz x21,0x00bf74b0
00bf7490	add x1,x21,#0x8
00bf7494	mov x0,#-0x1
00bf7498	bl 0x00c2bd10
00bf749c	cbnz x0,0x00bf74b0
00bf74a0	ldr x8,[x21]
00bf74a4	mov x0,x21
00bf74a8	ldr x8,[x8, #0x10]
00bf74ac	blr x8
00bf74b0	ldr x8,[x20]
00bf74b4	str x19,[x8, x22, LSL #0x3]
00bf74b8	ldp x20,x19,[sp, #0x40]
00bf74bc	ldp x22,x21,[sp, #0x30]
00bf74c0	ldp x29,x30,[sp, #0x20]
00bf74c4	add sp,sp,#0x50
00bf74c8	autiasp
00bf74cc	ret

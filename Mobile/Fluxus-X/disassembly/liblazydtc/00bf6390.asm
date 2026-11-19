; FUN_00bf6390 @ 00bf6390
00bf6390	paciasp
00bf6394	sub sp,sp,#0x50
00bf6398	stp x29,x30,[sp, #0x20]
00bf639c	stp x22,x21,[sp, #0x30]
00bf63a0	stp x20,x19,[sp, #0x40]
00bf63a4	add x29,sp,#0x20
00bf63a8	adrp x20,0xcb5000
00bf63ac	mov x19,x1
00bf63b0	mov x21,x0
00bf63b4	ldr x20,[x20, #0xc90]
00bf63b8	str x20,[sp, #0x8]
00bf63bc	ldar x8,[x20]
00bf63c0	cmn x8,#0x1
00bf63c4	b.eq 0x00bf63f0
00bf63c8	add x8,sp,#0x8
00bf63cc	sub x9,x29,#0x8
00bf63d0	adrp x0,0xcb5000
00bf63d4	stur x8,[x29, #-0x8]
00bf63d8	nop
00bf63dc	adr x2,0xc0bab0
00bf63e0	str x9,[sp, #0x10]
00bf63e4	add x1,sp,#0x10
00bf63e8	ldr x0,[x0, #0xc90]
00bf63ec	bl 0x00c305d0
00bf63f0	ldrsw x8,[x20, #0x8]
00bf63f4	add x1,x19,#0x8
00bf63f8	mov w0,#0x1
00bf63fc	sub x22,x8,#0x1
00bf6400	bl 0x00c2bce0
00bf6404	mov x20,x21
00bf6408	ldp x8,x9,[x20, #0x10]!
00bf640c	sub x9,x9,x8
00bf6410	asr x10,x9,#0x3
00bf6414	cmp x10,x22
00bf6418	b.hi 0x00bf6444
00bf641c	add x9,x22,#0x1
00bf6420	subs x1,x9,x10
00bf6424	b.ls 0x00bf6438
00bf6428	mov x0,x20
00bf642c	bl 0x00c0b6e4
00bf6430	ldr x8,[x20]
00bf6434	b 0x00bf6444
00bf6438	b.cs 0x00bf6444
00bf643c	add x9,x8,x9, LSL #0x3
00bf6440	str x9,[x21, #0x18]
00bf6444	ldr x21,[x8, x22, LSL #0x3]
00bf6448	cbz x21,0x00bf646c
00bf644c	add x1,x21,#0x8
00bf6450	mov x0,#-0x1
00bf6454	bl 0x00c2bd10
00bf6458	cbnz x0,0x00bf646c
00bf645c	ldr x8,[x21]
00bf6460	mov x0,x21
00bf6464	ldr x8,[x8, #0x10]
00bf6468	blr x8
00bf646c	ldr x8,[x20]
00bf6470	str x19,[x8, x22, LSL #0x3]
00bf6474	ldp x20,x19,[sp, #0x40]
00bf6478	ldp x22,x21,[sp, #0x30]
00bf647c	ldp x29,x30,[sp, #0x20]
00bf6480	add sp,sp,#0x50
00bf6484	autiasp
00bf6488	ret

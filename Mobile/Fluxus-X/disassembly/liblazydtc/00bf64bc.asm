; FUN_00bf64bc @ 00bf64bc
00bf64bc	paciasp
00bf64c0	sub sp,sp,#0x50
00bf64c4	stp x29,x30,[sp, #0x20]
00bf64c8	stp x22,x21,[sp, #0x30]
00bf64cc	stp x20,x19,[sp, #0x40]
00bf64d0	add x29,sp,#0x20
00bf64d4	adrp x20,0xcb5000
00bf64d8	mov x19,x1
00bf64dc	mov x21,x0
00bf64e0	ldr x20,[x20, #0xca0]
00bf64e4	str x20,[sp, #0x8]
00bf64e8	ldar x8,[x20]
00bf64ec	cmn x8,#0x1
00bf64f0	b.eq 0x00bf651c
00bf64f4	add x8,sp,#0x8
00bf64f8	sub x9,x29,#0x8
00bf64fc	adrp x0,0xcb5000
00bf6500	stur x8,[x29, #-0x8]
00bf6504	nop
00bf6508	adr x2,0xc0bab0
00bf650c	str x9,[sp, #0x10]
00bf6510	add x1,sp,#0x10
00bf6514	ldr x0,[x0, #0xca0]
00bf6518	bl 0x00c305d0
00bf651c	ldrsw x8,[x20, #0x8]
00bf6520	add x1,x19,#0x8
00bf6524	mov w0,#0x1
00bf6528	sub x22,x8,#0x1
00bf652c	bl 0x00c2bce0
00bf6530	mov x20,x21
00bf6534	ldp x8,x9,[x20, #0x10]!
00bf6538	sub x9,x9,x8
00bf653c	asr x10,x9,#0x3
00bf6540	cmp x10,x22
00bf6544	b.hi 0x00bf6570
00bf6548	add x9,x22,#0x1
00bf654c	subs x1,x9,x10
00bf6550	b.ls 0x00bf6564
00bf6554	mov x0,x20
00bf6558	bl 0x00c0b6e4
00bf655c	ldr x8,[x20]
00bf6560	b 0x00bf6570
00bf6564	b.cs 0x00bf6570
00bf6568	add x9,x8,x9, LSL #0x3
00bf656c	str x9,[x21, #0x18]
00bf6570	ldr x21,[x8, x22, LSL #0x3]
00bf6574	cbz x21,0x00bf6598
00bf6578	add x1,x21,#0x8
00bf657c	mov x0,#-0x1
00bf6580	bl 0x00c2bd10
00bf6584	cbnz x0,0x00bf6598
00bf6588	ldr x8,[x21]
00bf658c	mov x0,x21
00bf6590	ldr x8,[x8, #0x10]
00bf6594	blr x8
00bf6598	ldr x8,[x20]
00bf659c	str x19,[x8, x22, LSL #0x3]
00bf65a0	ldp x20,x19,[sp, #0x40]
00bf65a4	ldp x22,x21,[sp, #0x30]
00bf65a8	ldp x29,x30,[sp, #0x20]
00bf65ac	add sp,sp,#0x50
00bf65b0	autiasp
00bf65b4	ret

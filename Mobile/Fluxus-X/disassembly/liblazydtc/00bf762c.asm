; FUN_00bf762c @ 00bf762c
00bf762c	paciasp
00bf7630	sub sp,sp,#0x50
00bf7634	stp x29,x30,[sp, #0x20]
00bf7638	stp x22,x21,[sp, #0x30]
00bf763c	stp x20,x19,[sp, #0x40]
00bf7640	add x29,sp,#0x20
00bf7644	adrp x20,0xcb5000
00bf7648	mov x19,x1
00bf764c	mov x21,x0
00bf7650	ldr x20,[x20, #0xd80]
00bf7654	str x20,[sp, #0x8]
00bf7658	ldar x8,[x20]
00bf765c	cmn x8,#0x1
00bf7660	b.eq 0x00bf768c
00bf7664	add x8,sp,#0x8
00bf7668	sub x9,x29,#0x8
00bf766c	adrp x0,0xcb5000
00bf7670	stur x8,[x29, #-0x8]
00bf7674	nop
00bf7678	adr x2,0xc0bab0
00bf767c	str x9,[sp, #0x10]
00bf7680	add x1,sp,#0x10
00bf7684	ldr x0,[x0, #0xd80]
00bf7688	bl 0x00c305d0
00bf768c	ldrsw x8,[x20, #0x8]
00bf7690	add x1,x19,#0x8
00bf7694	mov w0,#0x1
00bf7698	sub x22,x8,#0x1
00bf769c	bl 0x00c2bce0
00bf76a0	mov x20,x21
00bf76a4	ldp x8,x9,[x20, #0x10]!
00bf76a8	sub x9,x9,x8
00bf76ac	asr x10,x9,#0x3
00bf76b0	cmp x10,x22
00bf76b4	b.hi 0x00bf76e0
00bf76b8	add x9,x22,#0x1
00bf76bc	subs x1,x9,x10
00bf76c0	b.ls 0x00bf76d4
00bf76c4	mov x0,x20
00bf76c8	bl 0x00c0b6e4
00bf76cc	ldr x8,[x20]
00bf76d0	b 0x00bf76e0
00bf76d4	b.cs 0x00bf76e0
00bf76d8	add x9,x8,x9, LSL #0x3
00bf76dc	str x9,[x21, #0x18]
00bf76e0	ldr x21,[x8, x22, LSL #0x3]
00bf76e4	cbz x21,0x00bf7708
00bf76e8	add x1,x21,#0x8
00bf76ec	mov x0,#-0x1
00bf76f0	bl 0x00c2bd10
00bf76f4	cbnz x0,0x00bf7708
00bf76f8	ldr x8,[x21]
00bf76fc	mov x0,x21
00bf7700	ldr x8,[x8, #0x10]
00bf7704	blr x8
00bf7708	ldr x8,[x20]
00bf770c	str x19,[x8, x22, LSL #0x3]
00bf7710	ldp x20,x19,[sp, #0x40]
00bf7714	ldp x22,x21,[sp, #0x30]
00bf7718	ldp x29,x30,[sp, #0x20]
00bf771c	add sp,sp,#0x50
00bf7720	autiasp
00bf7724	ret

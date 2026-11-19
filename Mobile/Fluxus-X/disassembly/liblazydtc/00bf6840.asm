; FUN_00bf6840 @ 00bf6840
00bf6840	paciasp
00bf6844	sub sp,sp,#0x50
00bf6848	stp x29,x30,[sp, #0x20]
00bf684c	stp x22,x21,[sp, #0x30]
00bf6850	stp x20,x19,[sp, #0x40]
00bf6854	add x29,sp,#0x20
00bf6858	adrp x20,0xcb5000
00bf685c	mov x19,x1
00bf6860	mov x21,x0
00bf6864	ldr x20,[x20, #0xc28]
00bf6868	str x20,[sp, #0x8]
00bf686c	ldar x8,[x20]
00bf6870	cmn x8,#0x1
00bf6874	b.eq 0x00bf68a0
00bf6878	add x8,sp,#0x8
00bf687c	sub x9,x29,#0x8
00bf6880	adrp x0,0xcb5000
00bf6884	stur x8,[x29, #-0x8]
00bf6888	nop
00bf688c	adr x2,0xc0bab0
00bf6890	str x9,[sp, #0x10]
00bf6894	add x1,sp,#0x10
00bf6898	ldr x0,[x0, #0xc28]
00bf689c	bl 0x00c305d0
00bf68a0	ldrsw x8,[x20, #0x8]
00bf68a4	add x1,x19,#0x8
00bf68a8	mov w0,#0x1
00bf68ac	sub x22,x8,#0x1
00bf68b0	bl 0x00c2bce0
00bf68b4	mov x20,x21
00bf68b8	ldp x8,x9,[x20, #0x10]!
00bf68bc	sub x9,x9,x8
00bf68c0	asr x10,x9,#0x3
00bf68c4	cmp x10,x22
00bf68c8	b.hi 0x00bf68f4
00bf68cc	add x9,x22,#0x1
00bf68d0	subs x1,x9,x10
00bf68d4	b.ls 0x00bf68e8
00bf68d8	mov x0,x20
00bf68dc	bl 0x00c0b6e4
00bf68e0	ldr x8,[x20]
00bf68e4	b 0x00bf68f4
00bf68e8	b.cs 0x00bf68f4
00bf68ec	add x9,x8,x9, LSL #0x3
00bf68f0	str x9,[x21, #0x18]
00bf68f4	ldr x21,[x8, x22, LSL #0x3]
00bf68f8	cbz x21,0x00bf691c
00bf68fc	add x1,x21,#0x8
00bf6900	mov x0,#-0x1
00bf6904	bl 0x00c2bd10
00bf6908	cbnz x0,0x00bf691c
00bf690c	ldr x8,[x21]
00bf6910	mov x0,x21
00bf6914	ldr x8,[x8, #0x10]
00bf6918	blr x8
00bf691c	ldr x8,[x20]
00bf6920	str x19,[x8, x22, LSL #0x3]
00bf6924	ldp x20,x19,[sp, #0x40]
00bf6928	ldp x22,x21,[sp, #0x30]
00bf692c	ldp x29,x30,[sp, #0x20]
00bf6930	add sp,sp,#0x50
00bf6934	autiasp
00bf6938	ret

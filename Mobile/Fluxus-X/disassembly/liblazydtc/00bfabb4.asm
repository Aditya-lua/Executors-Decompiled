; FUN_00bfabb4 @ 00bfabb4
00bfabb4	paciasp
00bfabb8	stp x29,x30,[sp, #-0x30]!
00bfabbc	str x21,[sp, #0x10]
00bfabc0	stp x20,x19,[sp, #0x20]
00bfabc4	mov x29,sp
00bfabc8	mov x19,x0
00bfabcc	ldp x0,x8,[x0, #0x10]
00bfabd0	cmp x8,x0
00bfabd4	adrp x8,0xcad000
00bfabd8	add x8,x8,#0x530
00bfabdc	str x8,[x19]
00bfabe0	b.eq 0x00bfac34
00bfabe4	mov x8,xzr
00bfabe8	mov w21,#0x1
00bfabec	b 0x00bfac08
00bfabf0	ldp x0,x9,[x19, #0x10]
00bfabf4	mov w8,w21
00bfabf8	add w21,w21,#0x1
00bfabfc	sub x9,x9,x0
00bfac00	cmp x8,x9, ASR #0x3
00bfac04	b.cs 0x00bfac34
00bfac08	ldr x20,[x0, x8, LSL #0x3]
00bfac0c	cbz x20,0x00bfabf0
00bfac10	add x1,x20,#0x8
00bfac14	mov x0,#-0x1
00bfac18	bl 0x00c2bd10
00bfac1c	cbnz x0,0x00bfabf0
00bfac20	ldr x8,[x20]
00bfac24	mov x0,x20
00bfac28	ldr x8,[x8, #0x10]
00bfac2c	blr x8
00bfac30	b 0x00bfabf0
00bfac34	ldrb w8,[x19, #0x120]
00bfac38	tbz w8,#0x0,0x00bfac50
00bfac3c	ldr x8,[x19, #0x120]
00bfac40	ldr x0,[x19, #0x130]
00bfac44	and x1,x8,#-0x2
00bfac48	bl 0x00c2fe80
00bfac4c	ldr x0,[x19, #0x10]
00bfac50	cbz x0,0x00bfac78
00bfac54	add x8,x19,#0x28
00bfac58	str x0,[x19, #0x18]
00bfac5c	cmp x0,x8
00bfac60	b.eq 0x00bfac74
00bfac64	ldr x8,[x19, #0x20]
00bfac68	sub x1,x8,x0
00bfac6c	bl 0x00c2fe80
00bfac70	b 0x00bfac78
00bfac74	strb wzr,[x19, #0x118]
00bfac78	mov x0,x19
00bfac7c	ldp x20,x19,[sp, #0x20]
00bfac80	ldr x21,[sp, #0x10]
00bfac84	ldp x29,x30,[sp], #0x30
00bfac88	autiasp
00bfac8c	b 0x00c31530

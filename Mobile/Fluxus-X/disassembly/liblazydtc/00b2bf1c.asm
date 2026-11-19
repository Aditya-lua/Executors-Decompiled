; FUN_00b2bf1c @ 00b2bf1c
00b2bf1c	stp x24,x23,[sp, #-0x40]!
00b2bf20	stp x22,x21,[sp, #0x10]
00b2bf24	stp x20,x19,[sp, #0x20]
00b2bf28	stp x29,x30,[sp, #0x30]
00b2bf2c	add x29,sp,#0x30
00b2bf30	mov x19,x5
00b2bf34	mov x21,x4
00b2bf38	mov x23,x3
00b2bf3c	mov x20,x2
00b2bf40	mov x22,x1
00b2bf44	mov x24,x0
00b2bf48	bl 0x00c41000
00b2bf4c	cbz w0,0x00b2bf9c
00b2bf50	ldr w8,[x24]
00b2bf54	cbz w8,0x00b2bf88
00b2bf58	cmp x19,x23
00b2bf5c	mov w0,wzr
00b2bf60	b.hi 0x00b2bf9c
00b2bf64	cmp x21,x22
00b2bf68	b.eq 0x00b2bf7c
00b2bf6c	mov x0,x22
00b2bf70	mov x1,x21
00b2bf74	mov x2,x19
00b2bf78	bl 0x00c2ffd0
00b2bf7c	mov w0,#0x1
00b2bf80	str x19,[x20]
00b2bf84	b 0x00b2bf9c
00b2bf88	ldr x8,[x24, #0x8]
00b2bf8c	cbz x8,0x00b2bf58
00b2bf90	cmp x8,x19
00b2bf94	mov w0,wzr
00b2bf98	b.ls 0x00b2bfb0
00b2bf9c	ldp x29,x30,[sp, #0x30]
00b2bfa0	ldp x20,x19,[sp, #0x20]
00b2bfa4	ldp x22,x21,[sp, #0x10]
00b2bfa8	ldp x24,x23,[sp], #0x40
00b2bfac	ret
00b2bfb0	add x9,x21,x19
00b2bfb4	sub x9,x9,x8
00b2bfb8	sub x19,x19,x8
00b2bfbc	str x9,[x24, #0x10]
00b2bfc0	b 0x00b2bf58

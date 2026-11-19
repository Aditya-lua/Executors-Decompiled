; FUN_00c0c96c @ 00c0c96c
00c0c96c	paciasp
00c0c970	sub sp,sp,#0x50
00c0c974	stp x29,x30,[sp, #0x10]
00c0c978	stp x24,x23,[sp, #0x20]
00c0c97c	stp x22,x21,[sp, #0x30]
00c0c980	stp x20,x19,[sp, #0x40]
00c0c984	add x29,sp,#0x10
00c0c988	cmp x0,x1
00c0c98c	mov x19,x2
00c0c990	b.eq 0x00c0c9f0
00c0c994	mov x20,x1
00c0c998	mov x22,x0
00c0c99c	bl 0x00c30710
00c0c9a0	ldr w23,[x0]
00c0c9a4	str wzr,[x0]
00c0c9a8	adrp x8,0xd27000
00c0c9ac	add x8,x8,#0xf8
00c0c9b0	mov x21,x0
00c0c9b4	adrp x24,0xd27000
00c0c9b8	ldarb w8,[x8]
00c0c9bc	tbz w8,#0x0,0x00c0ca40
00c0c9c0	ldr x2,[x24, #0xf0]
00c0c9c4	add x1,sp,#0x8
00c0c9c8	mov x0,x22
00c0c9cc	bl 0x00c43a30
00c0c9d0	ldr w8,[x21]
00c0c9d4	cbz w8,0x00c0ca04
00c0c9d8	ldr x9,[sp, #0x8]
00c0c9dc	cmp x9,x20
00c0c9e0	b.ne 0x00c0ca14
00c0c9e4	cmp w8,#0x22
00c0c9e8	b.eq 0x00c0ca1c
00c0c9ec	b 0x00c0ca24
00c0c9f0	adrp x8,0x29c000
00c0c9f4	mov w9,#0x4
00c0c9f8	ldr q0,[x8, #0xec0]
00c0c9fc	str w9,[x19]
00c0ca00	b 0x00c0ca24
00c0ca04	ldr x8,[sp, #0x8]
00c0ca08	str w23,[x21]
00c0ca0c	cmp x8,x20
00c0ca10	b.eq 0x00c0ca24
00c0ca14	adrp x8,0x29c000
00c0ca18	ldr q0,[x8, #0xec0]
00c0ca1c	mov w8,#0x4
00c0ca20	str w8,[x19]
00c0ca24	ldp x20,x19,[sp, #0x40]
00c0ca28	ldp x22,x21,[sp, #0x30]
00c0ca2c	ldp x24,x23,[sp, #0x20]
00c0ca30	ldp x29,x30,[sp, #0x10]
00c0ca34	add sp,sp,#0x50
00c0ca38	autiasp
00c0ca3c	ret
00c0ca40	adrp x0,0xd27000
00c0ca44	add x0,x0,#0xf8
00c0ca48	bl 0x00c2fe90
00c0ca4c	cbz w0,0x00c0c9c0
00c0ca50	adrp x1,0x2c6000
00c0ca54	add x1,x1,#0xbfc
00c0ca58	mov w0,#0x1fbf
00c0ca5c	mov x2,xzr
00c0ca60	bl 0x00c43890
00c0ca64	str x0,[x24, #0xf0]
00c0ca68	adrp x0,0xd27000
00c0ca6c	add x0,x0,#0xf8
00c0ca70	bl 0x00c2fea0
00c0ca74	b 0x00c0c9c0

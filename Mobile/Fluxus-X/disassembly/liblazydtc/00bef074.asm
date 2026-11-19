; FUN_00bef074 @ 00bef074
00bef074	paciasp
00bef078	stp x29,x30,[sp, #-0x50]!
00bef07c	str x25,[sp, #0x10]
00bef080	stp x24,x23,[sp, #0x20]
00bef084	stp x22,x21,[sp, #0x30]
00bef088	stp x20,x19,[sp, #0x40]
00bef08c	mov x29,sp
00bef090	ldp x22,x25,[x0]
00bef094	adrp x10,0xcb5000
00bef098	ldr x8,[x2]
00bef09c	ldr x10,[x10, #0xc18]
00bef0a0	mov x11,#0x7fffffffffffffff
00bef0a4	ldr x24,[x1]
00bef0a8	mov x19,x2
00bef0ac	mov x21,x1
00bef0b0	sub x8,x8,x22
00bef0b4	mov x20,x0
00bef0b8	lsl x9,x8,#0x1
00bef0bc	cmp x9,#0x1
00bef0c0	csinc x9,x9,xzr,hi
00bef0c4	cmp x8,x11
00bef0c8	csinv x23,x9,xzr,cc
00bef0cc	cmp x25,x10
00bef0d0	b.eq 0x00bef0ec
00bef0d4	mov x0,x22
00bef0d8	mov x1,x23
00bef0dc	bl 0x00c30950
00bef0e0	cbz x0,0x00bef14c
00bef0e4	str x0,[x20]
00bef0e8	b 0x00bef10c
00bef0ec	mov x0,x23
00bef0f0	bl 0x00c308d0
00bef0f4	cbz x0,0x00bef14c
00bef0f8	str x0,[x20]
00bef0fc	cbz x22,0x00bef10c
00bef100	mov x0,x22
00bef104	blr x25
00bef108	ldr x0,[x20]
00bef10c	sub x8,x24,x22
00bef110	add x8,x0,x8
00bef114	str x8,[x21]
00bef118	adrp x8,0xcb4000
00bef11c	ldr x8,[x8, #0xbf8]
00bef120	ldr x9,[x20]
00bef124	str x8,[x20, #0x8]
00bef128	add x8,x9,x23
00bef12c	str x8,[x19]
00bef130	ldp x20,x19,[sp, #0x40]
00bef134	ldr x25,[sp, #0x10]
00bef138	ldp x22,x21,[sp, #0x30]
00bef13c	ldp x24,x23,[sp, #0x20]
00bef140	ldp x29,x30,[sp], #0x50
00bef144	autiasp
00bef148	ret
00bef14c	bl 0x00c43cc0
00bef150	bl 0x007fe114

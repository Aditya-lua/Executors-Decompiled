; FUN_00a73070 @ 00a73070
00a73070	sub sp,sp,#0xd0
00a73074	stp x22,x21,[sp, #0xa0]
00a73078	stp x20,x19,[sp, #0xb0]
00a7307c	stp x29,x30,[sp, #0xc0]
00a73080	ldr x8,[x2, #0x20]
00a73084	mov w21,w0
00a73088	add x29,sp,#0xc0
00a7308c	mov x19,x2
00a73090	mov x0,x8
00a73094	mov x20,x1
00a73098	bl 0x00c37cd0
00a7309c	cmp w0,#0x6
00a730a0	b.eq 0x00a730b8
00a730a4	ldr x0,[x19, #0x20]
00a730a8	bl 0x00c37cd0
00a730ac	cmp w0,#0x390
00a730b0	mov w0,wzr
00a730b4	b.ne 0x00a7311c
00a730b8	ldr x0,[x19, #0x20]
00a730bc	bl 0x00c3d8d0
00a730c0	mov x22,x0
00a730c4	bl 0x00c3db80
00a730c8	cmp w0,#0x3
00a730cc	b.cc 0x00a73118
00a730d0	add x1,sp,#0x50
00a730d4	mov x2,sp
00a730d8	mov x0,x22
00a730dc	bl 0x00c3db30
00a730e0	cbz w0,0x00a73118
00a730e4	ldr x8,[sp, #0x60]
00a730e8	cbz x8,0x00a73118
00a730ec	ldr x9,[x19, #0x30]
00a730f0	mov w0,wzr
00a730f4	ldr w9,[x9, #0x8]
00a730f8	cmp w9,#0x2
00a730fc	b.ne 0x00a7311c
00a73100	mov w0,w21
00a73104	mov x1,x20
00a73108	mov x2,x19
00a7310c	str x8,[x19, #0x20]
00a73110	bl 0x00a6fd84
00a73114	b 0x00a7311c
00a73118	mov w0,wzr
00a7311c	ldp x29,x30,[sp, #0xc0]
00a73120	ldp x20,x19,[sp, #0xb0]
00a73124	ldp x22,x21,[sp, #0xa0]
00a73128	add sp,sp,#0xd0
00a7312c	ret

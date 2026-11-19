; FUN_00acdafc @ 00acdafc
00acdafc	sub sp,sp,#0x40
00acdb00	stp x20,x19,[sp, #0x20]
00acdb04	mov x4,x1
00acdb08	mov x19,x0
00acdb0c	add x1,sp,#0x18
00acdb10	add x2,sp,#0x14
00acdb14	add x3,sp,#0x8
00acdb18	mov x0,xzr
00acdb1c	stp x29,x30,[sp, #0x30]
00acdb20	add x29,sp,#0x30
00acdb24	bl 0x00c32be0
00acdb28	cbz w0,0x00acdbb8
00acdb2c	ldrsw x2,[sp, #0x14]
00acdb30	add x1,sp,#0x18
00acdb34	mov x0,xzr
00acdb38	bl 0x00c3f220
00acdb3c	cbz x0,0x00acdbb8
00acdb40	ldr x1,[sp, #0x8]
00acdb44	mov x20,x0
00acdb48	bl 0x00c3fb20
00acdb4c	cbz w0,0x00acdbac
00acdb50	orr w1,wzr,#0xf000
00acdb54	mov x0,x20
00acdb58	bl 0x00c3fa80
00acdb5c	ldr x8,[x19, #0x8]
00acdb60	ldr w8,[x8]
00acdb64	cmp w8,#0x390
00acdb68	b.eq 0x00acdb80
00acdb6c	cmp w8,#0x6
00acdb70	b.ne 0x00acdb8c
00acdb74	mov x0,x20
00acdb78	mov w1,wzr
00acdb7c	b 0x00acdb88
00acdb80	mov w1,#0x1000
00acdb84	mov x0,x20
00acdb88	bl 0x00c3faa0
00acdb8c	ldr x8,[x19, #0x8]
00acdb90	mov x0,x19
00acdb94	mov x2,x20
00acdb98	ldr w1,[x8]
00acdb9c	bl 0x00c39b70
00acdba0	cbz w0,0x00acdbac
00acdba4	mov w0,#0x1
00acdba8	b 0x00acdbb8
00acdbac	mov x0,x20
00acdbb0	bl 0x00c326d0
00acdbb4	mov w0,wzr
00acdbb8	ldp x29,x30,[sp, #0x30]
00acdbbc	ldp x20,x19,[sp, #0x20]
00acdbc0	add sp,sp,#0x40
00acdbc4	ret

; FUN_00bccb74 @ 00bccb74
00bccb74	paciasp
00bccb78	stp x29,x30,[sp, #-0x20]!
00bccb7c	stp x20,x19,[sp, #0x10]
00bccb80	mov x29,sp
00bccb84	adrp x8,0xcb4000
00bccb88	mov x19,x0
00bccb8c	mov x20,x0
00bccb90	ldr x8,[x8, #0xd48]
00bccb94	add x0,x0,#0x40
00bccb98	add x8,x8,#0x10
00bccb9c	str x8,[x20], #0x10
00bccba0	bl 0x00c31600
00bccba4	add x0,x19,#0x18
00bccba8	bl 0x00c2fee0
00bccbac	mov x0,x20
00bccbb0	bl 0x00c31450
00bccbb4	mov x0,x19
00bccbb8	bl 0x00c31530
00bccbbc	mov x0,x19
00bccbc0	mov w1,#0x78
00bccbc4	ldp x20,x19,[sp, #0x10]
00bccbc8	ldp x29,x30,[sp], #0x20
00bccbcc	autiasp
00bccbd0	b 0x00c2fe80

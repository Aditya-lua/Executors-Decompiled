; FUN_00c0b0e0 @ 00c0b0e0
00c0b0e0	paciasp
00c0b0e4	stp x29,x30,[sp, #-0x20]!
00c0b0e8	str x19,[sp, #0x10]
00c0b0ec	mov x29,sp
00c0b0f0	adrp x8,0xcb5000
00c0b0f4	mov x19,x0
00c0b0f8	ldr x8,[x8, #0xdf0]
00c0b0fc	ldrb w9,[x0, #0x60]
00c0b100	add x8,x8,#0x10
00c0b104	str x8,[x0]
00c0b108	tbnz w9,#0x0,0x00c0b148
00c0b10c	ldrb w8,[x19, #0x48]
00c0b110	tbnz w8,#0x0,0x00c0b160
00c0b114	ldrb w8,[x19, #0x30]
00c0b118	tbnz w8,#0x0,0x00c0b178
00c0b11c	ldrb w8,[x19, #0x18]
00c0b120	tbz w8,#0x0,0x00c0b134
00c0b124	ldr x8,[x19, #0x18]
00c0b128	ldr x0,[x19, #0x28]
00c0b12c	and x1,x8,#-0x2
00c0b130	bl 0x00c2fe80
00c0b134	mov x0,x19
00c0b138	ldr x19,[sp, #0x10]
00c0b13c	ldp x29,x30,[sp], #0x20
00c0b140	autiasp
00c0b144	b 0x00c31530
00c0b148	ldr x8,[x19, #0x60]
00c0b14c	ldr x0,[x19, #0x70]
00c0b150	and x1,x8,#-0x2
00c0b154	bl 0x00c2fe80
00c0b158	ldrb w8,[x19, #0x48]
00c0b15c	tbz w8,#0x0,0x00c0b114
00c0b160	ldr x8,[x19, #0x48]
00c0b164	ldr x0,[x19, #0x58]
00c0b168	and x1,x8,#-0x2
00c0b16c	bl 0x00c2fe80
00c0b170	ldrb w8,[x19, #0x30]
00c0b174	tbz w8,#0x0,0x00c0b11c
00c0b178	ldr x8,[x19, #0x30]
00c0b17c	ldr x0,[x19, #0x40]
00c0b180	and x1,x8,#-0x2
00c0b184	bl 0x00c2fe80
00c0b188	ldrb w8,[x19, #0x18]
00c0b18c	tbnz w8,#0x0,0x00c0b124
00c0b190	b 0x00c0b134

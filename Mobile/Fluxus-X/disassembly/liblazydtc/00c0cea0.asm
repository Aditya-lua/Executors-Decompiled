; FUN_00c0cea0 @ 00c0cea0
00c0cea0	paciasp
00c0cea4	stp x29,x30,[sp, #-0x20]!
00c0cea8	stp x20,x19,[sp, #0x10]
00c0ceac	mov x29,sp
00c0ceb0	ldrb w8,[x0, #0x410]
00c0ceb4	mov x19,x0
00c0ceb8	tbnz w8,#0x0,0x00c0cf68
00c0cebc	ldrb w8,[x19, #0x3f8]
00c0cec0	tbnz w8,#0x0,0x00c0cf80
00c0cec4	ldrb w8,[x19, #0x3e0]
00c0cec8	tbnz w8,#0x0,0x00c0cf98
00c0cecc	ldrb w8,[x19, #0x3c8]
00c0ced0	tbnz w8,#0x0,0x00c0cfb0
00c0ced4	ldrb w8,[x19, #0x3b0]
00c0ced8	tbnz w8,#0x0,0x00c0cfc8
00c0cedc	ldrb w8,[x19, #0x398]
00c0cee0	tbz w8,#0x0,0x00c0cef4
00c0cee4	ldr x8,[x19, #0x398]
00c0cee8	ldr x0,[x19, #0x3a8]
00c0ceec	and x1,x8,#-0x2
00c0cef0	bl 0x00c2fe80
00c0cef4	mov w20,#0x240
00c0cef8	b 0x00c0cf04
00c0cefc	subs x20,x20,#0x18
00c0cf00	b.eq 0x00c0cf30
00c0cf04	add x8,x19,x20
00c0cf08	ldrb w9,[x8, #0x140]
00c0cf0c	tbz w9,#0x0,0x00c0cefc
00c0cf10	ldr x0,[x8, #0x150]
00c0cf14	ldr x8,[x8, #0x140]
00c0cf18	and x1,x8,#-0x2
00c0cf1c	bl 0x00c2fe80
00c0cf20	b 0x00c0cefc
00c0cf24	sub x20,x20,#0x18
00c0cf28	cmn x20,#0x150
00c0cf2c	b.eq 0x00c0cf50
00c0cf30	add x8,x19,x20
00c0cf34	ldrb w9,[x8, #0x140]
00c0cf38	tbz w9,#0x0,0x00c0cf24
00c0cf3c	ldr x0,[x8, #0x150]
00c0cf40	ldr x8,[x8, #0x140]
00c0cf44	and x1,x8,#-0x2
00c0cf48	bl 0x00c2fe80
00c0cf4c	b 0x00c0cf24
00c0cf50	ldr x0,[x19]
00c0cf54	bl 0x00c43980
00c0cf58	ldp x20,x19,[sp, #0x10]
00c0cf5c	ldp x29,x30,[sp], #0x20
00c0cf60	autiasp
00c0cf64	ret
00c0cf68	ldr x8,[x19, #0x410]
00c0cf6c	ldr x0,[x19, #0x420]
00c0cf70	and x1,x8,#-0x2
00c0cf74	bl 0x00c2fe80
00c0cf78	ldrb w8,[x19, #0x3f8]
00c0cf7c	tbz w8,#0x0,0x00c0cec4
00c0cf80	ldr x8,[x19, #0x3f8]
00c0cf84	ldr x0,[x19, #0x408]
00c0cf88	and x1,x8,#-0x2
00c0cf8c	bl 0x00c2fe80
00c0cf90	ldrb w8,[x19, #0x3e0]
00c0cf94	tbz w8,#0x0,0x00c0cecc
00c0cf98	ldr x8,[x19, #0x3e0]
00c0cf9c	ldr x0,[x19, #0x3f0]
00c0cfa0	and x1,x8,#-0x2
00c0cfa4	bl 0x00c2fe80
00c0cfa8	ldrb w8,[x19, #0x3c8]
00c0cfac	tbz w8,#0x0,0x00c0ced4
00c0cfb0	ldr x8,[x19, #0x3c8]
00c0cfb4	ldr x0,[x19, #0x3d8]
00c0cfb8	and x1,x8,#-0x2
00c0cfbc	bl 0x00c2fe80
00c0cfc0	ldrb w8,[x19, #0x3b0]
00c0cfc4	tbz w8,#0x0,0x00c0cedc
00c0cfc8	ldr x8,[x19, #0x3b0]
00c0cfcc	ldr x0,[x19, #0x3c0]
00c0cfd0	and x1,x8,#-0x2
00c0cfd4	bl 0x00c2fe80
00c0cfd8	ldrb w8,[x19, #0x398]
00c0cfdc	tbnz w8,#0x0,0x00c0cee4
00c0cfe0	b 0x00c0cef4

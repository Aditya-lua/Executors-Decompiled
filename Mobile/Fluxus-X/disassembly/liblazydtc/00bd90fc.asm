; FUN_00bd90fc @ 00bd90fc
00bd90fc	paciasp
00bd9100	stp x29,x30,[sp, #-0x20]!
00bd9104	str x19,[sp, #0x10]
00bd9108	mov x29,sp
00bd910c	adrp x8,0xcb4000
00bd9110	mov x19,x0
00bd9114	ldr x8,[x8, #0xa08]
00bd9118	add x8,x8,#0x10
00bd911c	str x8,[x0], #0x8
00bd9120	bl 0x00c30090
00bd9124	mov x0,x19
00bd9128	mov w1,#0x68
00bd912c	ldr x19,[sp, #0x10]
00bd9130	ldp x29,x30,[sp], #0x20
00bd9134	autiasp
00bd9138	b 0x00c2fe80

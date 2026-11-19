; std::__ndk1::ios_base::failure::failure @ 00bcda68
00bcda68	paciasp
00bcda6c	stp x29,x30,[sp, #-0x20]!
00bcda70	str x19,[sp, #0x10]
00bcda74	mov x29,sp
00bcda78	mov x3,x1
00bcda7c	ldp x1,x2,[x2]
00bcda80	mov x19,x0
00bcda84	bl 0x00c43df0
00bcda88	adrp x8,0xcb5000
00bcda8c	ldr x8,[x8, #0xb30]
00bcda90	add x8,x8,#0x10
00bcda94	str x8,[x19]
00bcda98	ldr x19,[sp, #0x10]
00bcda9c	ldp x29,x30,[sp], #0x20
00bcdaa0	autiasp
00bcdaa4	ret

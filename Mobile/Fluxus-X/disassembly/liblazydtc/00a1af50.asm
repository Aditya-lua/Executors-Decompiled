; BN_check_prime @ 00a1af50
00a1af50	str x21,[sp, #-0x30]!
00a1af54	stp x20,x19,[sp, #0x10]
00a1af58	stp x29,x30,[sp, #0x20]
00a1af5c	add x29,sp,#0x20
00a1af60	mov x19,x2
00a1af64	mov x20,x1
00a1af68	mov x21,x0
00a1af6c	bl 0x00c322f0
00a1af70	mov x2,x20
00a1af74	mov x4,x19
00a1af78	ldp x29,x30,[sp, #0x20]
00a1af7c	ldp x20,x19,[sp, #0x10]
00a1af80	cmp w0,#0x800
00a1af84	mov w8,#0x40
00a1af88	mov w9,#0x80
00a1af8c	csel w1,w9,w8,gt
00a1af90	mov w3,#0x1
00a1af94	mov x0,x21
00a1af98	ldr x21,[sp], #0x30
00a1af9c	b 0x00a1abb8

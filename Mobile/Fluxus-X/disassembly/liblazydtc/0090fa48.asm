; FUN_0090fa48 @ 0090fa48
0090fa48	str x19,[sp, #-0x20]!
0090fa4c	stp x29,x30,[sp, #0x10]
0090fa50	add x29,sp,#0x10
0090fa54	mov x19,x0
0090fa58	cbz x0,0x0090fa80
0090fa5c	ldr x0,[x19]
0090fa60	bl 0x00c31cf0
0090fa64	adrp x8,0xcc4000
0090fa68	add x8,x8,#0x678
0090fa6c	ldp x29,x30,[sp, #0x10]
0090fa70	mov x0,x19
0090fa74	ldr x1,[x8]
0090fa78	ldr x19,[sp], #0x20
0090fa7c	br x1
0090fa80	ldp x29,x30,[sp, #0x10]
0090fa84	ldr x19,[sp], #0x20
0090fa88	ret

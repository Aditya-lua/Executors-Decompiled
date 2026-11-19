; FUN_00c0be60 @ 00c0be60
00c0be60	paciasp
00c0be64	stp x29,x30,[sp, #-0x20]!
00c0be68	str x19,[sp, #0x10]
00c0be6c	mov x29,sp
00c0be70	ldrb w8,[x0]
00c0be74	ldp x11,x9,[x0, #0x8]
00c0be78	add x10,x0,#0x4
00c0be7c	mov x19,x1
00c0be80	tst w8,#0x1
00c0be84	lsr x8,x8,#0x1
00c0be88	csel x9,x10,x9,eq
00c0be8c	sub x9,x1,x9
00c0be90	csel x8,x8,x11,eq
00c0be94	asr x1,x9,#0x2
00c0be98	cmp x1,x8
00c0be9c	b.hi 0x00c0bebc
00c0bea0	mov w2,#0x1
00c0bea4	bl 0x00bc6aa0
00c0bea8	mov x0,x19
00c0beac	ldr x19,[sp, #0x10]
00c0beb0	ldp x29,x30,[sp], #0x20
00c0beb4	autiasp
00c0beb8	ret
00c0bebc	bl 0x00bc531c

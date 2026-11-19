; FUN_0084fb38 @ 0084fb38
0084fb38	stp x29,x30,[sp, #-0x20]!
0084fb3c	stp x20,x19,[sp, #0x10]
0084fb40	mov x29,sp
0084fb44	ldr x8,[x1]
0084fb48	mov x20,x0
0084fb4c	mov x19,x1
0084fb50	mov x0,x1
0084fb54	mov x1,x20
0084fb58	ldr x8,[x8, #0xf0]
0084fb5c	blr x8
0084fb60	tbz w0,#0x0,0x0084fbc8
0084fb64	adrp x8,0xd1e000
0084fb68	add x8,x8,#0xd00
0084fb6c	ldrb w8,[x8]
0084fb70	cmp w8,#0x1
0084fb74	b.ne 0x0084fb98
0084fb78	ldr x8,[x20, #0x48]
0084fb7c	cbz x8,0x0084fb98
0084fb80	ldr x0,[x8, #0x38]
0084fb84	cbz x0,0x0084fb98
0084fb88	ldr x8,[x0]
0084fb8c	mov x1,x19
0084fb90	ldr x8,[x8]
0084fb94	blr x8
0084fb98	ldr x0,[x20, #0x20]
0084fb9c	mov x1,x19
0084fba0	ldr x8,[x0]
0084fba4	ldr x8,[x8]
0084fba8	blr x8
0084fbac	ldr x0,[x20, #0x28]
0084fbb0	ldr x8,[x0]
0084fbb4	ldr x2,[x8]
0084fbb8	mov x1,x19
0084fbbc	ldp x20,x19,[sp, #0x10]
0084fbc0	ldp x29,x30,[sp], #0x20
0084fbc4	br x2
0084fbc8	ldp x20,x19,[sp, #0x10]
0084fbcc	ldp x29,x30,[sp], #0x20
0084fbd0	ret

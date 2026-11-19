; FUN_0084c0ac @ 0084c0ac
0084c0ac	stp x29,x30,[sp, #-0x30]!
0084c0b0	str x21,[sp, #0x10]
0084c0b4	stp x20,x19,[sp, #0x20]
0084c0b8	mov x29,sp
0084c0bc	mov x19,x0
0084c0c0	bl 0x0084bf48
0084c0c4	ldp x21,x20,[x19, #0x8]
0084c0c8	cmp x21,x20
0084c0cc	b.eq 0x0084c0e8
0084c0d0	ldr x0,[x21], #0x8
0084c0d4	mov w1,#0xfc0
0084c0d8	bl 0x00c2fe80
0084c0dc	cmp x21,x20
0084c0e0	b.ne 0x0084c0d0
0084c0e4	ldp x21,x20,[x19, #0x8]
0084c0e8	subs x8,x21,x20
0084c0ec	b.eq 0x0084c100
0084c0f0	add x8,x8,#0x7
0084c0f4	and x8,x8,#-0x8
0084c0f8	add x8,x20,x8
0084c0fc	str x8,[x19, #0x10]
0084c100	ldr x0,[x19]
0084c104	cbz x0,0x0084c120
0084c108	ldr x8,[x19, #0x18]
0084c10c	sub x1,x8,x0
0084c110	ldp x20,x19,[sp, #0x20]
0084c114	ldr x21,[sp, #0x10]
0084c118	ldp x29,x30,[sp], #0x30
0084c11c	b 0x00c2fe80
0084c120	ldp x20,x19,[sp, #0x20]
0084c124	ldr x21,[sp, #0x10]
0084c128	ldp x29,x30,[sp], #0x30
0084c12c	ret

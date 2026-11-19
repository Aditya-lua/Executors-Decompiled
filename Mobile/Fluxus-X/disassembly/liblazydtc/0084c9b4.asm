; FUN_0084c9b4 @ 0084c9b4
0084c9b4	ldp x9,x8,[x0, #0x8]
0084c9b8	subs x9,x9,x8
0084c9bc	b.eq 0x0084c9d0
0084c9c0	add x9,x9,#0x7
0084c9c4	and x9,x9,#-0x8
0084c9c8	add x8,x8,x9
0084c9cc	str x8,[x0, #0x10]
0084c9d0	ldr x8,[x0]
0084c9d4	cbz x8,0x0084c9e8
0084c9d8	ldr x9,[x0, #0x18]
0084c9dc	mov x0,x8
0084c9e0	sub x1,x9,x8
0084c9e4	b 0x00c2fe80
0084c9e8	ret

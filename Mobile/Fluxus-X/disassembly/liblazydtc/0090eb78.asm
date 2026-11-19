; FUN_0090eb78 @ 0090eb78
0090eb78	stp x20,x19,[sp, #-0x20]!
0090eb7c	stp x29,x30,[sp, #0x10]
0090eb80	add x29,sp,#0x10
0090eb84	mov x19,x0
0090eb88	ldr x0,[x0, #0xda0]
0090eb8c	cbz x0,0x0090ebbc
0090eb90	ldr x8,[x0]
0090eb94	cbz x8,0x0090ebbc
0090eb98	ldrb w8,[x19, #0xa82]
0090eb9c	tbnz w8,#0x6,0x0090ebbc
0090eba0	add x20,x19,#0xd90
0090eba4	bl 0x0090fa8c
0090eba8	ldrb w8,[x19, #0xdb8]
0090ebac	mov x0,x20
0090ebb0	orr w8,w8,#0x1
0090ebb4	strb w8,[x19, #0xdb8]
0090ebb8	b 0x0090ebc0
0090ebbc	add x0,x19,#0xd90
0090ebc0	ldp x29,x30,[sp, #0x10]
0090ebc4	ldp x20,x19,[sp], #0x20
0090ebc8	b 0x0090ea5c

; FUN_0083d38c @ 0083d38c
0083d38c	mov x8,x0
0083d390	ldr x0,[x0]
0083d394	str xzr,[x8]
0083d398	cbz x0,0x0083d3e8
0083d39c	ldrb w8,[x8, #0x10]
0083d3a0	cmp w8,#0x1
0083d3a4	b.ne 0x0083d3e0
0083d3a8	ldrb w8,[x0, #0x10]
0083d3ac	tbz w8,#0x0,0x0083d3e0
0083d3b0	stp x29,x30,[sp, #-0x20]!
0083d3b4	str x19,[sp, #0x10]
0083d3b8	mov x29,sp
0083d3bc	ldr x8,[x0, #0x20]
0083d3c0	ldr x9,[x0, #0x10]
0083d3c4	mov x19,x0
0083d3c8	and x1,x9,#-0x2
0083d3cc	mov x0,x8
0083d3d0	bl 0x00c2fe80
0083d3d4	mov x0,x19
0083d3d8	ldr x19,[sp, #0x10]
0083d3dc	ldp x29,x30,[sp], #0x20
0083d3e0	mov w1,#0x30
0083d3e4	b 0x00c2fe80
0083d3e8	ret

; ix::WebSocket::stop @ 0098d158
0098d158	str x21,[sp, #-0x30]!
0098d15c	stp x20,x19,[sp, #0x10]
0098d160	stp x29,x30,[sp, #0x20]
0098d164	add x29,sp,#0x20
0098d168	mov x3,xzr
0098d16c	mov w4,wzr
0098d170	mov x19,x0
0098d174	bl 0x00c33890
0098d178	ldr x8,[x19, #0x408]
0098d17c	cbz x8,0x0098d1a4
0098d180	add x21,x19,#0x400
0098d184	mov w8,#0x1
0098d188	add x0,x19,#0x46c
0098d18c	add x20,x19,#0x408
0098d190	stlrb w8,[x21]
0098d194	bl 0x00c315f0
0098d198	mov x0,x20
0098d19c	bl 0x00c31920
0098d1a0	stlrb wzr,[x21]
0098d1a4	ldp x29,x30,[sp, #0x20]
0098d1a8	ldp x20,x19,[sp, #0x10]
0098d1ac	ldr x21,[sp], #0x30
0098d1b0	ret

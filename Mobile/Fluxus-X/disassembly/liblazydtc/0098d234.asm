; ix::WebSocket::setExtraHeaders @ 0098d234
0098d234	str x21,[sp, #-0x30]!
0098d238	stp x20,x19,[sp, #0x10]
0098d23c	stp x29,x30,[sp, #0x20]
0098d240	add x29,sp,#0x20
0098d244	add x19,x0,#0x3a0
0098d248	mov x21,x0
0098d24c	mov x0,x19
0098d250	mov x20,x1
0098d254	bl 0x00c2ff10
0098d258	add x0,x21,#0x2f8
0098d25c	cmp x0,x20
0098d260	b.eq 0x0098d270
0098d264	ldr x1,[x20], #0x8
0098d268	mov x2,x20
0098d26c	bl 0x00c33130
0098d270	mov x0,x19
0098d274	ldp x29,x30,[sp, #0x20]
0098d278	ldp x20,x19,[sp, #0x10]
0098d27c	ldr x21,[sp], #0x30
0098d280	b 0x00c2ff20

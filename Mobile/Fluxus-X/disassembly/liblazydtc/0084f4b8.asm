; FUN_0084f4b8 @ 0084f4b8
0084f4b8	adrp x8,0xd1b000
0084f4bc	adrp x9,0xc4a000
0084f4c0	add x9,x9,#0x508
0084f4c4	ldr w8,[x8, #0xc0]
0084f4c8	str x9,[x0]
0084f4cc	ldr x9,[sp, #0x8]
0084f4d0	str w8,[x0, #0x8]
0084f4d4	adrp x8,0xc49000
0084f4d8	add x8,x8,#0x650
0084f4dc	ldr q0,[x1]
0084f4e0	str x8,[x0]
0084f4e4	ldrb w8,[sp]
0084f4e8	str x2,[x0, #0x20]
0084f4ec	strb w3,[x0, #0x28]
0084f4f0	stur q0,[x0, #0xc]
0084f4f4	str x4,[x0, #0x30]
0084f4f8	strb w5,[x0, #0x38]
0084f4fc	str x6,[x0, #0x40]
0084f500	str x7,[x0, #0x48]
0084f504	strb w8,[x0, #0x50]
0084f508	ldr q0,[x9]
0084f50c	ldr w8,[x9, #0x10]
0084f510	ldr x9,[sp, #0x10]
0084f514	stur q0,[x0, #0x54]
0084f518	str w8,[x0, #0x64]
0084f51c	ldr q0,[x9]
0084f520	ldr w8,[x9, #0x10]
0084f524	stur q0,[x0, #0x68]
0084f528	str w8,[x0, #0x78]
0084f52c	ret

; FUN_0086f480 @ 0086f480
0086f480	stp x29,x30,[sp, #-0x40]!
0086f484	str x23,[sp, #0x10]
0086f488	stp x22,x21,[sp, #0x20]
0086f48c	stp x20,x19,[sp, #0x30]
0086f490	mov x29,sp
0086f494	ldrb w8,[x0, #0x8]
0086f498	tbnz w8,#0x0,0x0086f510
0086f49c	ldr x20,[x0]
0086f4a0	ldr x21,[x20]
0086f4a4	cbz x21,0x0086f510
0086f4a8	ldr x10,[x20, #0x8]
0086f4ac	mov x8,x21
0086f4b0	mov x9,x20
0086f4b4	cmp x21,x10
0086f4b8	b.eq 0x0086f4ec
0086f4bc	sub x19,x10,#0x30
0086f4c0	mov x22,x0
0086f4c4	mov x23,x19
0086f4c8	ldr x8,[x23], #-0x30
0086f4cc	mov x0,x19
0086f4d0	ldr x8,[x8]
0086f4d4	blr x8
0086f4d8	cmp x19,x21
0086f4dc	mov x19,x23
0086f4e0	b.ne 0x0086f4c8
0086f4e4	ldr x9,[x22]
0086f4e8	ldr x8,[x9]
0086f4ec	ldr x9,[x9, #0x10]
0086f4f0	mov x0,x8
0086f4f4	str x21,[x20, #0x8]
0086f4f8	sub x1,x9,x8
0086f4fc	ldp x20,x19,[sp, #0x30]
0086f500	ldr x23,[sp, #0x10]
0086f504	ldp x22,x21,[sp, #0x20]
0086f508	ldp x29,x30,[sp], #0x40
0086f50c	b 0x00c2fe80
0086f510	ldp x20,x19,[sp, #0x30]
0086f514	ldr x23,[sp, #0x10]
0086f518	ldp x22,x21,[sp, #0x20]
0086f51c	ldp x29,x30,[sp], #0x40
0086f520	ret

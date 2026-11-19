; FUN_0090fa8c @ 0090fa8c
0090fa8c	stp x20,x19,[sp, #-0x20]!
0090fa90	stp x29,x30,[sp, #0x10]
0090fa94	add x29,sp,#0x10
0090fa98	ldr x8,[x0]
0090fa9c	mov x19,x0
0090faa0	mov x1,xzr
0090faa4	ldr x0,[x8]
0090faa8	bl 0x00c31d00
0090faac	adrp x8,0xcc4000
0090fab0	add x8,x8,#0x678
0090fab4	cmp w0,#0x0
0090fab8	cset w20,eq
0090fabc	ldr x9,[x8]
0090fac0	ldr x8,[x19]
0090fac4	mov x0,x8
0090fac8	blr x9
0090facc	str xzr,[x19]
0090fad0	ldp x29,x30,[sp, #0x10]
0090fad4	mov w0,w20
0090fad8	ldp x20,x19,[sp], #0x20
0090fadc	ret

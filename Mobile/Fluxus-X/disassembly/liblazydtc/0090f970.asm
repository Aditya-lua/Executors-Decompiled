; FUN_0090f970 @ 0090f970
0090f970	stp x22,x21,[sp, #-0x30]!
0090f974	stp x20,x19,[sp, #0x10]
0090f978	stp x29,x30,[sp, #0x20]
0090f97c	add x29,sp,#0x20
0090f980	adrp x19,0xcc4000
0090f984	add x19,x19,#0x670
0090f988	mov x22,x0
0090f98c	mov w0,#0x8
0090f990	mov x21,x1
0090f994	ldr x8,[x19]
0090f998	blr x8
0090f99c	ldr x8,[x19]
0090f9a0	mov x19,x0
0090f9a4	mov w0,#0x10
0090f9a8	blr x8
0090f9ac	mov x20,x0
0090f9b0	cbz x19,0x0090f9d8
0090f9b4	cbz x20,0x0090f9d8
0090f9b8	nop
0090f9bc	adr x2,0x90fa10
0090f9c0	mov x0,x19
0090f9c4	mov x1,xzr
0090f9c8	mov x3,x20
0090f9cc	stp x22,x21,[x20]
0090f9d0	bl 0x00c2ffb0
0090f9d4	cbz w0,0x0090f9fc
0090f9d8	adrp x21,0xcc4000
0090f9dc	add x21,x21,#0x678
0090f9e0	mov x0,x19
0090f9e4	ldr x8,[x21]
0090f9e8	blr x8
0090f9ec	ldr x8,[x21]
0090f9f0	mov x0,x20
0090f9f4	blr x8
0090f9f8	mov x19,xzr
0090f9fc	mov x0,x19
0090fa00	ldp x29,x30,[sp, #0x20]
0090fa04	ldp x20,x19,[sp, #0x10]
0090fa08	ldp x22,x21,[sp], #0x30
0090fa0c	ret

; FUN_0096a95c @ 0096a95c
0096a95c	stp x24,x23,[sp, #-0x40]!
0096a960	stp x22,x21,[sp, #0x10]
0096a964	stp x20,x19,[sp, #0x20]
0096a968	stp x29,x30,[sp, #0x30]
0096a96c	add x29,sp,#0x30
0096a970	mov x20,x1
0096a974	mov x19,x0
0096a978	movi v0.2D,#0x0
0096a97c	str xzr,[x0, #0x20]
0096a980	stp q0,q0,[x0]
0096a984	cbz x1,0x0096a9f8
0096a988	ldr x8,[x20, #0x20]
0096a98c	cbz x8,0x0096a9f8
0096a990	mov x22,xzr
0096a994	mov w23,wzr
0096a998	mov x21,x20
0096a99c	mov x0,x21
0096a9a0	bl 0x00c2ff50
0096a9a4	cmp x0,#0x9
0096a9a8	b.hi 0x0096aa08
0096a9ac	and w24,w0,#0xff
0096a9b0	add w8,w24,w23
0096a9b4	cmp w8,#0x1f
0096a9b8	b.gt 0x0096aa08
0096a9bc	sxtw x8,w23
0096a9c0	add x23,x8,#0x1
0096a9c4	strb w0,[x19, x8]
0096a9c8	add x8,x19,x23
0096a9cc	and x2,x0,#0xff
0096a9d0	mov x0,x8
0096a9d4	mov x1,x21
0096a9d8	bl 0x00c2ffd0
0096a9dc	ldr x8,[x20, #0x20]
0096a9e0	add x22,x22,#0x1
0096a9e4	add w23,w24,w23
0096a9e8	add x21,x21,#0xa
0096a9ec	cmp x22,x8
0096a9f0	b.cc 0x0096a99c
0096a9f4	b 0x0096a9fc
0096a9f8	mov w23,wzr
0096a9fc	mov w0,wzr
0096aa00	str w23,[x19, #0x24]
0096aa04	b 0x0096aa0c
0096aa08	mov w0,#0x2
0096aa0c	ldp x29,x30,[sp, #0x30]
0096aa10	ldp x20,x19,[sp, #0x20]
0096aa14	ldp x22,x21,[sp, #0x10]
0096aa18	ldp x24,x23,[sp], #0x40
0096aa1c	ret

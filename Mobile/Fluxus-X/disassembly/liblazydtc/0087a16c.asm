; FUN_0087a16c @ 0087a16c
0087a16c	stp x29,x30,[sp, #-0x30]!
0087a170	str x21,[sp, #0x10]
0087a174	stp x20,x19,[sp, #0x20]
0087a178	mov x29,sp
0087a17c	ldp x20,x21,[x0, #0x8]
0087a180	mov x19,x0
0087a184	b 0x0087a18c
0087a188	ldr x21,[x19, #0x10]
0087a18c	cmp x20,x21
0087a190	b.eq 0x0087a1d0
0087a194	ldur x0,[x21, #-0x18]
0087a198	sub x8,x21,#0x38
0087a19c	str x8,[x19, #0x10]
0087a1a0	cbz x0,0x0087a1b4
0087a1a4	ldur x8,[x21, #-0x8]
0087a1a8	stur x0,[x21, #-0x10]
0087a1ac	sub x1,x8,x0
0087a1b0	bl 0x00c2fe80
0087a1b4	ldur x0,[x21, #-0x30]
0087a1b8	cbz x0,0x0087a188
0087a1bc	ldur x8,[x21, #-0x20]
0087a1c0	stur x0,[x21, #-0x28]
0087a1c4	sub x1,x8,x0
0087a1c8	bl 0x00c2fe80
0087a1cc	b 0x0087a188
0087a1d0	ldr x0,[x19]
0087a1d4	cbz x0,0x0087a1f0
0087a1d8	ldr x8,[x19, #0x18]
0087a1dc	sub x1,x8,x0
0087a1e0	ldp x20,x19,[sp, #0x20]
0087a1e4	ldr x21,[sp, #0x10]
0087a1e8	ldp x29,x30,[sp], #0x30
0087a1ec	b 0x00c2fe80
0087a1f0	ldp x20,x19,[sp, #0x20]
0087a1f4	ldr x21,[sp, #0x10]
0087a1f8	ldp x29,x30,[sp], #0x30
0087a1fc	ret

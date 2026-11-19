; cpr::ThreadPool::CreateThread @ 008fe09c
008fe09c	stp x22,x21,[sp, #-0x30]!
008fe0a0	stp x20,x19,[sp, #0x10]
008fe0a4	stp x29,x30,[sp, #0x20]
008fe0a8	add x29,sp,#0x20
008fe0ac	add x8,x0,#0x28
008fe0b0	ldar x8,[x8]
008fe0b4	ldr x9,[x0, #0x10]
008fe0b8	mov x20,x0
008fe0bc	mov w0,wzr
008fe0c0	cmp x8,x9
008fe0c4	b.cs 0x008fe120
008fe0c8	mov w0,#0x8
008fe0cc	bl 0x00c2fed0
008fe0d0	mov x19,x0
008fe0d4	mov w0,#0x8
008fe0d8	bl 0x00c2fed0
008fe0dc	mov x22,x0
008fe0e0	bl 0x00c2ffa0
008fe0e4	mov w0,#0x10
008fe0e8	bl 0x00c2fed0
008fe0ec	mov x21,x0
008fe0f0	stp x22,x20,[x0]
008fe0f4	nop
008fe0f8	adr x2,0x8fe638
008fe0fc	mov x0,x19
008fe100	mov x1,xzr
008fe104	mov x3,x21
008fe108	bl 0x00c2ffb0
008fe10c	cbnz w0,0x008fe130
008fe110	mov x0,x20
008fe114	mov x1,x19
008fe118	bl 0x00c318a0
008fe11c	mov w0,#0x1
008fe120	ldp x29,x30,[sp, #0x20]
008fe124	ldp x20,x19,[sp, #0x10]
008fe128	ldp x22,x21,[sp], #0x30
008fe12c	ret
008fe130	adrp x1,0x2a7000
008fe134	add x1,x1,#0x22
008fe138	bl 0x00c2ffc0

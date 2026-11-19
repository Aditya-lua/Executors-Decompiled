; cpr::Files::emplace_back @ 008fd09c
008fd09c	str x19,[sp, #-0x20]!
008fd0a0	stp x29,x30,[sp, #0x10]
008fd0a4	add x29,sp,#0x10
008fd0a8	mov x19,x0
008fd0ac	ldr x0,[x0, #0x8]
008fd0b0	ldr x8,[x19, #0x10]
008fd0b4	cmp x0,x8
008fd0b8	b.cs 0x008fd0d8
008fd0bc	bl 0x00c31060
008fd0c0	ldr x8,[x19, #0x8]
008fd0c4	add x8,x8,#0x30
008fd0c8	str x8,[x19, #0x8]
008fd0cc	ldp x29,x30,[sp, #0x10]
008fd0d0	ldr x19,[sp], #0x20
008fd0d4	ret
008fd0d8	ldp x29,x30,[sp, #0x10]
008fd0dc	mov x0,x19
008fd0e0	ldr x19,[sp], #0x20
008fd0e4	b 0x00c310c0

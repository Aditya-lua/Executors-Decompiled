; cpr::ThreadPool::Wait @ 008fe1dc
008fe1dc	str x19,[sp, #-0x20]!
008fe1e0	stp x29,x30,[sp, #0x10]
008fe1e4	add x29,sp,#0x10
008fe1e8	mov x19,x0
008fe1ec	add x8,x19,#0x20
008fe1f0	ldar w8,[x8]
008fe1f4	cbz w8,0x008fe220
008fe1f8	ldr x8,[x19, #0xa0]
008fe1fc	cbnz x8,0x008fe218
008fe200	add x8,x19,#0x30
008fe204	add x9,x19,#0x28
008fe208	ldar x8,[x8]
008fe20c	ldar x9,[x9]
008fe210	cmp x8,x9
008fe214	b.eq 0x008fe220
008fe218	bl 0x00c31950
008fe21c	b 0x008fe1ec
008fe220	ldp x29,x30,[sp, #0x10]
008fe224	mov w0,wzr
008fe228	ldr x19,[sp], #0x20
008fe22c	ret

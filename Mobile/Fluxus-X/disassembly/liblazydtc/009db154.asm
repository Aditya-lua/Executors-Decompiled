; statem_flush @ 009db154
009db154	str x19,[sp, #-0x20]!
009db158	stp x29,x30,[sp, #0x10]
009db15c	mov x19,x0
009db160	ldr x0,[x0, #0x18]
009db164	mov w8,#0x2
009db168	mov w1,#0xb
009db16c	mov x2,xzr
009db170	mov x3,xzr
009db174	add x29,sp,#0x10
009db178	str w8,[x19, #0x28]
009db17c	bl 0x00c321a0
009db180	cmp w0,#0x1
009db184	b.lt 0x009db194
009db188	mov w0,#0x1
009db18c	str w0,[x19, #0x28]
009db190	b 0x009db198
009db194	mov w0,wzr
009db198	ldp x29,x30,[sp, #0x10]
009db19c	ldr x19,[sp], #0x20
009db1a0	ret

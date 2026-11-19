; cpr::Session::SetProxyAuth @ 008ee648
008ee648	str x21,[sp, #-0x30]!
008ee64c	stp x20,x19,[sp, #0x10]
008ee650	stp x29,x30,[sp, #0x20]
008ee654	add x29,sp,#0x20
008ee658	mov x19,x0
008ee65c	mov x20,x1
008ee660	ldr x1,[x19, #0x88]!
008ee664	sub x21,x19,#0x8
008ee668	mov x0,x21
008ee66c	bl 0x00826780
008ee670	ldr x8,[x20]
008ee674	stur x8,[x19, #-0x8]
008ee678	mov x8,x20
008ee67c	ldr x9,[x8, #0x8]!
008ee680	str x9,[x19]
008ee684	ldr x10,[x8, #0x8]
008ee688	str x10,[x19, #0x8]
008ee68c	cbz x10,0x008ee6a0
008ee690	str x19,[x9, #0x10]
008ee694	str x8,[x20]
008ee698	stp xzr,xzr,[x8]
008ee69c	b 0x008ee6a4
008ee6a0	str x19,[x21]
008ee6a4	ldp x29,x30,[sp, #0x20]
008ee6a8	ldp x20,x19,[sp, #0x10]
008ee6ac	ldr x21,[sp], #0x30
008ee6b0	ret

; cpr::Session::SetProxies @ 008ee5dc
008ee5dc	str x21,[sp, #-0x30]!
008ee5e0	stp x20,x19,[sp, #0x10]
008ee5e4	stp x29,x30,[sp, #0x20]
008ee5e8	add x29,sp,#0x20
008ee5ec	mov x19,x0
008ee5f0	mov x20,x1
008ee5f4	ldr x1,[x19, #0x70]!
008ee5f8	sub x21,x19,#0x8
008ee5fc	mov x0,x21
008ee600	bl 0x008267e4
008ee604	ldr x8,[x20]
008ee608	stur x8,[x19, #-0x8]
008ee60c	mov x8,x20
008ee610	ldr x9,[x8, #0x8]!
008ee614	str x9,[x19]
008ee618	ldr x10,[x8, #0x8]
008ee61c	str x10,[x19, #0x8]
008ee620	cbz x10,0x008ee634
008ee624	str x19,[x9, #0x10]
008ee628	str x8,[x20]
008ee62c	stp xzr,xzr,[x8]
008ee630	b 0x008ee638
008ee634	str x19,[x21]
008ee638	ldp x29,x30,[sp, #0x20]
008ee63c	ldp x20,x19,[sp, #0x10]
008ee640	ldr x21,[sp], #0x30
008ee644	ret

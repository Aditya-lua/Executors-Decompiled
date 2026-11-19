; BIO_ADDRINFO_free @ 009fb1d4
009fb1d4	str x21,[sp, #-0x30]!
009fb1d8	stp x20,x19,[sp, #0x10]
009fb1dc	stp x29,x30,[sp, #0x20]
009fb1e0	add x29,sp,#0x20
009fb1e4	cbz x0,0x009fb228
009fb1e8	ldr w8,[x0, #0x4]
009fb1ec	mov x19,x0
009fb1f0	cmp w8,#0x1
009fb1f4	b.ne 0x009fb238
009fb1f8	adrp x20,0x2cd000
009fb1fc	add x20,x20,#0x866
009fb200	ldp x0,x21,[x19, #0x20]
009fb204	mov w2,#0x1c1
009fb208	mov x1,x20
009fb20c	bl 0x00c32310
009fb210	mov w2,#0x1c2
009fb214	mov x0,x19
009fb218	mov x1,x20
009fb21c	bl 0x00c32310
009fb220	mov x19,x21
009fb224	cbnz x21,0x009fb200
009fb228	ldp x29,x30,[sp, #0x20]
009fb22c	ldp x20,x19,[sp, #0x10]
009fb230	ldr x21,[sp], #0x30
009fb234	ret
009fb238	mov x0,x19
009fb23c	ldp x29,x30,[sp, #0x20]
009fb240	ldp x20,x19,[sp, #0x10]
009fb244	ldr x21,[sp], #0x30
009fb248	b 0x00c31cd0

; ASN1_item_unpack @ 009f22cc
009f22cc	str x19,[sp, #-0x20]!
009f22d0	stp x29,x30,[sp, #0x10]
009f22d4	ldr x8,[x0, #0x8]
009f22d8	mov x3,x1
009f22dc	add x1,sp,#0x8
009f22e0	add x29,sp,#0x10
009f22e4	str x8,[sp, #0x8]
009f22e8	ldrsw x2,[x0]
009f22ec	mov x0,xzr
009f22f0	bl 0x00c36150
009f22f4	mov x19,x0
009f22f8	cbnz x0,0x009f2328
009f22fc	bl 0x00c342a0
009f2300	adrp x0,0x2db000
009f2304	adrp x2,0x29d000
009f2308	add x0,x0,#0xd56
009f230c	add x2,x2,#0xf1c
009f2310	orr w1,wzr,#0x3c
009f2314	bl 0x00c342b0
009f2318	mov w0,#0xd
009f231c	mov w1,#0x6e
009f2320	mov x2,xzr
009f2324	bl 0x00c342c0
009f2328	ldp x29,x30,[sp, #0x10]
009f232c	mov x0,x19
009f2330	ldr x19,[sp], #0x20
009f2334	ret

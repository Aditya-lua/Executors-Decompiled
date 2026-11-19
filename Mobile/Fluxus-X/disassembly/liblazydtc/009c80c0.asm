; ssl_dh_to_pkey @ 009c80c0
009c80c0	stp x20,x19,[sp, #-0x20]!
009c80c4	stp x29,x30,[sp, #0x10]
009c80c8	add x29,sp,#0x10
009c80cc	cbz x0,0x009c80f4
009c80d0	mov x20,x0
009c80d4	bl 0x00c36450
009c80d8	mov x1,x20
009c80dc	mov x19,x0
009c80e0	bl 0x00c368f0
009c80e4	cmp w0,#0x0
009c80e8	b.gt 0x009c80f8
009c80ec	mov x0,x19
009c80f0	bl 0x00c32450
009c80f4	mov x19,xzr
009c80f8	ldp x29,x30,[sp, #0x10]
009c80fc	mov x0,x19
009c8100	ldp x20,x19,[sp], #0x20
009c8104	ret

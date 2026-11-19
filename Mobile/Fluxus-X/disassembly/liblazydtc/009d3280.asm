; tls_construct_ctos_sct @ 009d3280
009d3280	stp x20,x19,[sp, #-0x20]!
009d3284	mov x19,x0
009d3288	mov w0,#0x2
009d328c	stp x29,x30,[sp, #0x10]
009d3290	add x29,sp,#0x10
009d3294	cbnz x3,0x009d330c
009d3298	ldr x8,[x19, #0xb68]
009d329c	cbz x8,0x009d330c
009d32a0	mov x20,x1
009d32a4	mov w1,#0x12
009d32a8	mov w2,#0x2
009d32ac	mov x0,x20
009d32b0	bl 0x00c343a0
009d32b4	cbz w0,0x009d32d4
009d32b8	mov w2,#0x2
009d32bc	mov x0,x20
009d32c0	mov x1,xzr
009d32c4	bl 0x00c343a0
009d32c8	cbz w0,0x009d32d4
009d32cc	mov w0,#0x1
009d32d0	b 0x009d330c
009d32d4	bl 0x00c342a0
009d32d8	adrp x0,0x2bf000
009d32dc	adrp x2,0x2af000
009d32e0	add x0,x0,#0x967
009d32e4	add x2,x2,#0xba9
009d32e8	mov w1,#0x1f4
009d32ec	bl 0x00c342b0
009d32f0	mov w2,#0x103
009d32f4	mov w1,#0x50
009d32f8	movk w2,#0xc, LSL #16
009d32fc	mov x0,x19
009d3300	mov x3,xzr
009d3304	bl 0x00c34410
009d3308	mov w0,wzr
009d330c	ldp x29,x30,[sp, #0x10]
009d3310	ldp x20,x19,[sp], #0x20
009d3314	ret

; tls_construct_change_cipher_spec @ 009e42b4
009e42b4	stp x20,x19,[sp, #-0x20]!
009e42b8	mov x8,x1
009e42bc	mov x19,x0
009e42c0	mov w1,#0x1
009e42c4	mov w2,#0x1
009e42c8	mov x0,x8
009e42cc	stp x29,x30,[sp, #0x10]
009e42d0	add x29,sp,#0x10
009e42d4	mov w20,#0x1
009e42d8	bl 0x00c343a0
009e42dc	cbnz w0,0x009e4318
009e42e0	bl 0x00c342a0
009e42e4	adrp x0,0x2bb000
009e42e8	adrp x2,0x2b3000
009e42ec	add x0,x0,#0x912
009e42f0	add x2,x2,#0xfb5
009e42f4	mov w1,#0x379
009e42f8	bl 0x00c342b0
009e42fc	mov w2,#0x103
009e4300	mov w1,#0x50
009e4304	movk w2,#0xc, LSL #16
009e4308	mov x0,x19
009e430c	mov x3,xzr
009e4310	bl 0x00c34410
009e4314	mov w20,wzr
009e4318	ldp x29,x30,[sp, #0x10]
009e431c	mov w0,w20
009e4320	ldp x20,x19,[sp], #0x20
009e4324	ret

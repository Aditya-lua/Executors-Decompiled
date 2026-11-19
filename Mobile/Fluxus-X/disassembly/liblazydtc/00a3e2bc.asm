; ossl_ecx_key_free @ 00a3e2bc
00a3e2bc	stp x20,x19,[sp, #-0x20]!
00a3e2c0	stp x29,x30,[sp, #0x10]
00a3e2c4	add x29,sp,#0x10
00a3e2c8	cbz x0,0x00a3e2f8
00a3e2cc	mov x19,x0
00a3e2d0	add x9,x0,#0x64
00a3e2d4	ldxr w8,[x9]
00a3e2d8	subs w10,w8,#0x1
00a3e2dc	stxr w11,w10,[x9]
00a3e2e0	cbnz w11,0x00a3e2d4
00a3e2e4	b.ne 0x00a3e2f0
00a3e2e8	dmb ISHLD
00a3e2ec	b 0x00a3e304
00a3e2f0	cmp w8,#0x1
00a3e2f4	b.le 0x00a3e304
00a3e2f8	ldp x29,x30,[sp, #0x10]
00a3e2fc	ldp x20,x19,[sp], #0x20
00a3e300	ret
00a3e304	ldr x0,[x19, #0x8]
00a3e308	adrp x20,0x2b9000
00a3e30c	add x20,x20,#0xcc5
00a3e310	mov w2,#0x46
00a3e314	mov x1,x20
00a3e318	bl 0x00c32310
00a3e31c	ldp x0,x1,[x19, #0x50]
00a3e320	mov w3,#0x47
00a3e324	mov x2,x20
00a3e328	bl 0x00c38e10
00a3e32c	ldr x0,[x19, #0x68]
00a3e330	bl 0x00c34d40
00a3e334	ldp x29,x30,[sp, #0x10]
00a3e338	mov w2,#0x49
00a3e33c	mov x0,x19
00a3e340	mov x1,x20
00a3e344	ldp x20,x19,[sp], #0x20
00a3e348	b 0x00c32310

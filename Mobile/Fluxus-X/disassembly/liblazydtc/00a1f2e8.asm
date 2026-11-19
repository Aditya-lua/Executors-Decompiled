; DH_set0_key @ 00a1f2e8
00a1f2e8	str x21,[sp, #-0x30]!
00a1f2ec	stp x20,x19,[sp, #0x10]
00a1f2f0	mov x20,x2
00a1f2f4	mov x19,x0
00a1f2f8	stp x29,x30,[sp, #0x20]
00a1f2fc	add x29,sp,#0x20
00a1f300	cbz x1,0x00a1f314
00a1f304	ldr x0,[x19, #0x70]
00a1f308	mov x21,x1
00a1f30c	bl 0x00c322e0
00a1f310	str x21,[x19, #0x70]
00a1f314	cbz x20,0x00a1f324
00a1f318	ldr x0,[x19, #0x78]
00a1f31c	bl 0x00c322e0
00a1f320	str x20,[x19, #0x78]
00a1f324	ldr x8,[x19, #0xc8]
00a1f328	mov w0,#0x1
00a1f32c	add x8,x8,#0x1
00a1f330	str x8,[x19, #0xc8]
00a1f334	ldp x29,x30,[sp, #0x20]
00a1f338	ldp x20,x19,[sp, #0x10]
00a1f33c	ldr x21,[sp], #0x30
00a1f340	ret

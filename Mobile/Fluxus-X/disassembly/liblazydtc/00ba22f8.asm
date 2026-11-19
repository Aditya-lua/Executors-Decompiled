; psa_destroy_persistent_key @ 00ba22f8
00ba22f8	sub sp,sp,#0x40
00ba22fc	str x21,[sp, #0x10]
00ba2300	stp x20,x19,[sp, #0x20]
00ba2304	stp x29,x30,[sp, #0x30]
00ba2308	add x29,sp,#0x30
00ba230c	mrs x21,tpidr_el0
00ba2310	ldr x8,[x21, #0x28]
00ba2314	mov w19,w0
00ba2318	mov x1,sp
00ba231c	mov x0,x19
00ba2320	str x8,[sp, #0x8]
00ba2324	bl 0x00c43270
00ba2328	cmn w0,#0x8c
00ba232c	mov w20,wzr
00ba2330	b.eq 0x00ba2358
00ba2334	mov x0,x19
00ba2338	bl 0x00c43280
00ba233c	mov w20,#0xffffff67
00ba2340	cbnz w0,0x00ba2358
00ba2344	mov x1,sp
00ba2348	mov x0,x19
00ba234c	bl 0x00c43270
00ba2350	cmn w0,#0x8c
00ba2354	csel w20,wzr,w20,eq
00ba2358	ldr x8,[x21, #0x28]
00ba235c	ldr x9,[sp, #0x8]
00ba2360	cmp x8,x9
00ba2364	b.ne 0x00ba2380
00ba2368	mov w0,w20
00ba236c	ldp x29,x30,[sp, #0x30]
00ba2370	ldp x20,x19,[sp, #0x20]
00ba2374	ldr x21,[sp, #0x10]
00ba2378	add sp,sp,#0x40
00ba237c	ret
00ba2380	bl 0x00c2fec0

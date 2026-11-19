; X509_add1_trust_object @ 00b1f310
00b1f310	str x21,[sp, #-0x30]!
00b1f314	stp x20,x19,[sp, #0x10]
00b1f318	mov x20,x0
00b1f31c	stp x29,x30,[sp, #0x20]
00b1f320	add x29,sp,#0x20
00b1f324	cbz x1,0x00b1f388
00b1f328	mov x0,x1
00b1f32c	bl 0x00c37730
00b1f330	mov x19,x0
00b1f334	cbz x0,0x00b1f39c
00b1f338	cbz x20,0x00b1f390
00b1f33c	ldr x21,[x20, #0x150]
00b1f340	cbnz x21,0x00b1f35c
00b1f344	adrp x0,0xc82000
00b1f348	add x0,x0,#0xc60
00b1f34c	bl 0x00c372e0
00b1f350	mov x21,x0
00b1f354	str x0,[x20, #0x150]
00b1f358	cbz x0,0x00b1f390
00b1f35c	ldr x0,[x21]
00b1f360	cbnz x0,0x00b1f370
00b1f364	bl 0x00c34780
00b1f368	str x0,[x21]
00b1f36c	cbz x0,0x00b1f390
00b1f370	cbz x19,0x00b1f380
00b1f374	mov x1,x19
00b1f378	bl 0x00c347a0
00b1f37c	cbz w0,0x00b1f390
00b1f380	mov w0,#0x1
00b1f384	b 0x00b1f39c
00b1f388	mov x19,xzr
00b1f38c	cbnz x20,0x00b1f33c
00b1f390	mov x0,x19
00b1f394	bl 0x00c37660
00b1f398	mov w0,wzr
00b1f39c	ldp x29,x30,[sp, #0x20]
00b1f3a0	ldp x20,x19,[sp, #0x10]
00b1f3a4	ldr x21,[sp], #0x30
00b1f3a8	ret

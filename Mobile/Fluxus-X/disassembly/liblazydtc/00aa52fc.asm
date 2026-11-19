; OSSL_SELF_TEST_oncorrupt_byte @ 00aa52fc
00aa52fc	stp x20,x19,[sp, #-0x20]!
00aa5300	stp x29,x30,[sp, #0x10]
00aa5304	add x29,sp,#0x10
00aa5308	cbz x0,0x00aa5364
00aa530c	ldr x8,[x0, #0x18]
00aa5310	mov x20,x0
00aa5314	cbz x8,0x00aa5360
00aa5318	adrp x8,0x2c1000
00aa531c	add x8,x8,#0xf7d
00aa5320	mov x0,x20
00aa5324	mov x19,x1
00aa5328	str x8,[x20]
00aa532c	bl 0x00aa513c
00aa5330	ldr x8,[x20, #0x18]
00aa5334	ldr x1,[x20, #0xc0]
00aa5338	add x0,x20,#0x20
00aa533c	blr x8
00aa5340	mov w8,w0
00aa5344	mov w0,wzr
00aa5348	cbnz w8,0x00aa5364
00aa534c	ldrb w8,[x19]
00aa5350	mov w0,#0x1
00aa5354	eor w8,w8,#0x1
00aa5358	strb w8,[x19]
00aa535c	b 0x00aa5364
00aa5360	mov w0,wzr
00aa5364	ldp x29,x30,[sp, #0x10]
00aa5368	ldp x20,x19,[sp], #0x20
00aa536c	ret

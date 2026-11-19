; ossl_DER_w_boolean @ 00b4b290
00b4b290	sub sp,sp,#0x40
00b4b294	str x21,[sp, #0x10]
00b4b298	stp x20,x19,[sp, #0x20]
00b4b29c	mov w21,w2
00b4b2a0	mov w20,w1
00b4b2a4	mov x19,x0
00b4b2a8	stp x29,x30,[sp, #0x30]
00b4b2ac	add x29,sp,#0x30
00b4b2b0	tbnz w1,#0x1f,0x00b4b2cc
00b4b2b4	cmp w20,#0x1e
00b4b2b8	mov w0,wzr
00b4b2bc	b.gt 0x00b4b364
00b4b2c0	mov x0,x19
00b4b2c4	bl 0x00c37240
00b4b2c8	cbz w0,0x00b4b364
00b4b2cc	mov x0,x19
00b4b2d0	bl 0x00c37240
00b4b2d4	cbz w0,0x00b4b364
00b4b2d8	cbz w21,0x00b4b2f0
00b4b2dc	orr w1,wzr,#0xff
00b4b2e0	mov w2,#0x1
00b4b2e4	mov x0,x19
00b4b2e8	bl 0x00c343a0
00b4b2ec	cbz w0,0x00b4b364
00b4b2f0	mov x0,x19
00b4b2f4	bl 0x00c34350
00b4b2f8	mov w8,w0
00b4b2fc	mov w0,wzr
00b4b300	cbnz w8,0x00b4b364
00b4b304	mov w1,#0x1
00b4b308	mov w2,#0x1
00b4b30c	mov x0,x19
00b4b310	bl 0x00c343a0
00b4b314	mov w8,w0
00b4b318	mov w0,wzr
00b4b31c	cbnz w8,0x00b4b364
00b4b320	tbnz w20,#0x1f,0x00b4b360
00b4b324	add x1,sp,#0x18
00b4b328	mov x0,x19
00b4b32c	bl 0x00c34370
00b4b330	cbz w0,0x00b4b364
00b4b334	mov x0,x19
00b4b338	bl 0x00c34350
00b4b33c	cbz w0,0x00b4b364
00b4b340	add x1,sp,#0x8
00b4b344	mov x0,x19
00b4b348	bl 0x00c34370
00b4b34c	cbz w0,0x00b4b364
00b4b350	ldr x8,[sp, #0x18]
00b4b354	ldr x9,[sp, #0x8]
00b4b358	cmp x8,x9
00b4b35c	b.ne 0x00b4b378
00b4b360	mov w0,#0x1
00b4b364	ldp x29,x30,[sp, #0x30]
00b4b368	ldp x20,x19,[sp, #0x20]
00b4b36c	ldr x21,[sp, #0x10]
00b4b370	add sp,sp,#0x40
00b4b374	ret
00b4b378	mov w8,#0xa0
00b4b37c	orr w8,w20,w8
00b4b380	sxtw x1,w8
00b4b384	mov w2,#0x1
00b4b388	mov x0,x19
00b4b38c	bl 0x00c343a0
00b4b390	cmp w0,#0x0
00b4b394	cset w0,ne
00b4b398	b 0x00b4b364

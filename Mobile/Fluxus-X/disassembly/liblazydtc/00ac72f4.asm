; ossl_property_is_enabled @ 00ac72f4
00ac72f4	str x19,[sp, #-0x20]!
00ac72f8	stp x29,x30,[sp, #0x10]
00ac72fc	add x29,sp,#0x10
00ac7300	cbz x1,0x00ac7388
00ac7304	mov x19,x2
00ac7308	cbz x2,0x00ac7388
00ac730c	mov w2,wzr
00ac7310	bl 0x00c3f870
00ac7314	stur w0,[x29, #-0x4]
00ac7318	cbz w0,0x00ac7388
00ac731c	ldr w2,[x19], #0x8
00ac7320	adrp x4,0xac7000
00ac7324	add x4,x4,#0x28c
00ac7328	sub x0,x29,#0x4
00ac732c	orr w3,wzr,#0x18
00ac7330	mov x1,x19
00ac7334	mov w5,wzr
00ac7338	bl 0x00c3de50
00ac733c	cbz x0,0x00ac7388
00ac7340	ldrb w9,[x0, #0xc]
00ac7344	mov w8,wzr
00ac7348	tbnz w9,#0x0,0x00ac738c
00ac734c	ldr w9,[x0, #0x8]
00ac7350	mov w8,wzr
00ac7354	cmp w9,#0x2
00ac7358	b.eq 0x00ac738c
00ac735c	ldr w10,[x0, #0x4]
00ac7360	mov w8,wzr
00ac7364	cbnz w10,0x00ac738c
00ac7368	cmp w9,#0x1
00ac736c	b.eq 0x00ac739c
00ac7370	mov w8,wzr
00ac7374	cbnz w9,0x00ac738c
00ac7378	ldr w8,[x0, #0x10]
00ac737c	cmp w8,#0x1
00ac7380	cset w0,eq
00ac7384	b 0x00ac7390
00ac7388	mov w8,wzr
00ac738c	mov w0,w8
00ac7390	ldp x29,x30,[sp, #0x10]
00ac7394	ldr x19,[sp], #0x20
00ac7398	ret
00ac739c	ldr w8,[x0, #0x10]
00ac73a0	cmp w8,#0x1
00ac73a4	cset w8,ne
00ac73a8	b 0x00ac738c

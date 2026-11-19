; X509_signature_dump @ 00af32c8
00af32c8	stp x28,x27,[sp, #-0x60]!
00af32cc	stp x26,x25,[sp, #0x10]
00af32d0	stp x24,x23,[sp, #0x20]
00af32d4	stp x22,x21,[sp, #0x30]
00af32d8	stp x20,x19,[sp, #0x40]
00af32dc	stp x29,x30,[sp, #0x50]
00af32e0	ldr w8,[x1]
00af32e4	ldr x23,[x1, #0x8]
00af32e8	adrp x26,0x2bc000
00af32ec	adrp x27,0x2ab000
00af32f0	adrp x22,0x2a3000
00af32f4	mov w20,w2
00af32f8	mov x19,x0
00af32fc	mov x25,xzr
00af3300	add x26,x26,#0xda4
00af3304	add x27,x27,#0x32c
00af3308	sxtw x28,w8
00af330c	sub x21,x8,#0x1
00af3310	add x22,x22,#0xe88
00af3314	add x29,sp,#0x50
00af3318	cmp x25,x28
00af331c	b.ge 0x00af33ac
00af3320	mov w9,#0x8e39
00af3324	and x8,x25,#0xffffffff
00af3328	movk w9,#0x38e3, LSL #16
00af332c	mul x8,x8,x9
00af3330	lsr x8,x8,#0x22
00af3334	add w8,w8,w8, LSL #0x3
00af3338	lsl w8,w8,#0x1
00af333c	cmp w8,w25
00af3340	b.ne 0x00af337c
00af3344	cbz x25,0x00af3364
00af3348	adrp x1,0x2c4000
00af334c	mov w2,#0x1
00af3350	mov x0,x19
00af3354	add x1,x1,#0xdae
00af3358	bl 0x00c34240
00af335c	cmp w0,#0x1
00af3360	b.lt 0x00af33a4
00af3364	mov x0,x19
00af3368	mov w1,w20
00af336c	mov w2,w20
00af3370	bl 0x00c38640
00af3374	cmp w0,#0x1
00af3378	b.lt 0x00af33a4
00af337c	ldrb w2,[x23, x25]
00af3380	cmp x21,x25
00af3384	csel x3,x27,x26,eq
00af3388	mov x0,x19
00af338c	mov x1,x22
00af3390	add x24,x25,#0x1
00af3394	bl 0x00c32250
00af3398	cmp w0,#0x1
00af339c	mov x25,x24
00af33a0	b.ge 0x00af3318
00af33a4	mov w0,wzr
00af33a8	b 0x00af33c8
00af33ac	adrp x1,0x2c4000
00af33b0	add x1,x1,#0xdae
00af33b4	mov w2,#0x1
00af33b8	mov x0,x19
00af33bc	bl 0x00c34240
00af33c0	cmp w0,#0x1
00af33c4	cset w0,eq
00af33c8	ldp x29,x30,[sp, #0x50]
00af33cc	ldp x20,x19,[sp, #0x40]
00af33d0	ldp x22,x21,[sp, #0x30]
00af33d4	ldp x24,x23,[sp, #0x20]
00af33d8	ldp x26,x25,[sp, #0x10]
00af33dc	ldp x28,x27,[sp], #0x60
00af33e0	ret

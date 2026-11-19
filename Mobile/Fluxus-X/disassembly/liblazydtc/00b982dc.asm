; mbedtls_psa_aead_set_nonce @ 00b982dc
00b982dc	stp x29,x30,[sp, #-0x10]!
00b982e0	mov x29,sp
00b982e4	ldr w9,[x0]
00b982e8	mov w8,#0x500
00b982ec	movk w8,#0x510, LSL #16
00b982f0	mov x3,x2
00b982f4	cmp w9,w8
00b982f8	mov x8,x1
00b982fc	b.eq 0x00b98358
00b98300	mov w10,#0x100
00b98304	movk w10,#0x550, LSL #16
00b98308	cmp w9,w10
00b9830c	b.eq 0x00b9833c
00b98310	mov w10,#0x200
00b98314	movk w10,#0x550, LSL #16
00b98318	cmp w9,w10
00b9831c	b.ne 0x00b98380
00b98320	ldrb w9,[x0, #0x6]
00b98324	add x0,x0,#0x8
00b98328	mov x2,x8
00b9832c	and w1,w9,#0x1
00b98330	bl 0x00c421d0
00b98334	ldp x29,x30,[sp], #0x10
00b98338	b 0x00c42bf0
00b9833c	ldrb w9,[x0, #0x6]
00b98340	add x0,x0,#0x8
00b98344	mov x2,x8
00b98348	and w1,w9,#0x1
00b9834c	bl 0x00c42040
00b98350	ldp x29,x30,[sp], #0x10
00b98354	b 0x00c42bf0
00b98358	cmp x3,#0xc
00b9835c	b.ne 0x00b9838c
00b98360	ldrb w9,[x0, #0x6]
00b98364	add x0,x0,#0x8
00b98368	mov x1,x8
00b9836c	mvn w9,w9
00b98370	and w2,w9,#0x1
00b98374	bl 0x00c42120
00b98378	ldp x29,x30,[sp], #0x10
00b9837c	b 0x00c42bf0
00b98380	mov w0,#0xffffff7a
00b98384	ldp x29,x30,[sp], #0x10
00b98388	ret
00b9838c	mov w0,#0xffffff79
00b98390	ldp x29,x30,[sp], #0x10
00b98394	ret

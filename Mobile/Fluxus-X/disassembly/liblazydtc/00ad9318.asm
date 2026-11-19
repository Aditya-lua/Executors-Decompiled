; ossl_rsa_oaeppss_nid2name @ 00ad9318
00ad9318	mov w8,w0
00ad931c	cmp w0,#0x445
00ad9320	mov x0,xzr
00ad9324	b.gt 0x00ad9350
00ad9328	sub w9,w8,#0x2a0
00ad932c	cmp w9,#0x3
00ad9330	b.hi 0x00ad9368
00ad9334	adrp x8,0x774000
00ad9338	add x8,x8,#0x930
00ad933c	ldrsw x9,[x8, x9, LSL #0x2]
00ad9340	add x8,x9,x8
00ad9344	br x8
00ad9348	mov w8,#0x2
00ad934c	b 0x00ad9394
00ad9350	cmp w8,#0x446
00ad9354	b.eq 0x00ad9390
00ad9358	cmp w8,#0x447
00ad935c	b.ne 0x00ad9374
00ad9360	orr w8,wzr,#0x6
00ad9364	b 0x00ad9394
00ad9368	cmp w8,#0x40
00ad936c	mov x8,xzr
00ad9370	b.eq 0x00ad9394
00ad9374	ret
00ad9378	orr w8,wzr,#0x3
00ad937c	b 0x00ad9394
00ad9380	mov w8,#0x4
00ad9384	b 0x00ad9394
00ad9388	mov w8,#0x1
00ad938c	b 0x00ad9394
00ad9390	mov w8,#0x5
00ad9394	adrp x9,0xc7d000
00ad9398	add x9,x9,#0xa88
00ad939c	add x8,x9,x8, LSL #0x4
00ad93a0	ldr x0,[x8, #0x8]
00ad93a4	ret

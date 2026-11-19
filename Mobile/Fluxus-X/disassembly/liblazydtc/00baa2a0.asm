; mbedtls_oid_get_numeric_string @ 00baa2a0
00baa2a0	stp x26,x25,[sp, #-0x50]!
00baa2a4	stp x24,x23,[sp, #0x10]
00baa2a8	stp x22,x21,[sp, #0x20]
00baa2ac	stp x20,x19,[sp, #0x30]
00baa2b0	stp x29,x30,[sp, #0x40]
00baa2b4	add x29,sp,#0x40
00baa2b8	mov x20,x2
00baa2bc	mov x19,x1
00baa2c0	lsr x8,x1,#0x1f
00baa2c4	mov x21,x0
00baa2c8	cbz x8,0x00baa2d4
00baa2cc	mov w0,#0xffffff9c
00baa2d0	b 0x00baa3d0
00baa2d4	ldr x8,[x20, #0x8]
00baa2d8	cbz x8,0x00baa3b4
00baa2dc	adrp x22,0x2cc000
00baa2e0	adrp x24,0x2b6000
00baa2e4	mov x25,xzr
00baa2e8	mov w9,wzr
00baa2ec	add x22,x22,#0x9a0
00baa2f0	orr w26,wzr,#0x30
00baa2f4	add x24,x24,#0xad8
00baa2f8	mov x23,x19
00baa2fc	lsr w10,w9,#0x19
00baa300	cbnz w10,0x00baa3bc
00baa304	ldr x10,[x20, #0x10]
00baa308	ldrb w3,[x10, x25]
00baa30c	cbnz w9,0x00baa318
00baa310	cmp w3,#0x80
00baa314	b.eq 0x00baa3bc
00baa318	mov w10,w3
00baa31c	bfm w3,w9,#0x19,#0x18
00baa320	tbnz w10,#0x7,0x00baa33c
00baa324	cmp x23,x19
00baa328	b.ne 0x00baa344
00baa32c	subs w4,w3,#0x50
00baa330	b.cc 0x00baa360
00baa334	mov w8,#0x32
00baa338	b 0x00baa370
00baa33c	mov w9,w3
00baa340	b 0x00baa3a4
00baa344	mov x0,x21
00baa348	mov x1,x23
00baa34c	mov x2,x24
00baa350	bl 0x00c31ed0
00baa354	cmp w0,#0x2
00baa358	b.ge 0x00baa38c
00baa35c	b 0x00baa3c4
00baa360	sub w9,w3,#0x28
00baa364	cmp w3,#0x27
00baa368	cinc w8,w26,hi
00baa36c	csel w4,w9,w3,hi
00baa370	mov x0,x21
00baa374	mov x1,x19
00baa378	mov x2,x22
00baa37c	mov w3,w8
00baa380	bl 0x00c31ed0
00baa384	cmp w0,#0x2
00baa388	b.lt 0x00baa3c4
00baa38c	sxtw x10,w0
00baa390	subs x23,x23,x10
00baa394	b.ls 0x00baa3c4
00baa398	ldr x8,[x20, #0x8]
00baa39c	mov w9,wzr
00baa3a0	add x21,x21,x10
00baa3a4	add x25,x25,#0x1
00baa3a8	cmp x25,x8
00baa3ac	b.cc 0x00baa2fc
00baa3b0	cbz w9,0x00baa3cc
00baa3b4	mov w0,#0xffffffa0
00baa3b8	b 0x00baa3d0
00baa3bc	mov w0,#0xffffff98
00baa3c0	b 0x00baa3d0
00baa3c4	mov w0,#0xfffffff5
00baa3c8	b 0x00baa3d0
00baa3cc	sub w0,w19,w23
00baa3d0	ldp x29,x30,[sp, #0x40]
00baa3d4	ldp x20,x19,[sp, #0x30]
00baa3d8	ldp x22,x21,[sp, #0x20]
00baa3dc	ldp x24,x23,[sp, #0x10]
00baa3e0	ldp x26,x25,[sp], #0x50
00baa3e4	ret

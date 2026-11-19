; mbedtls_aes_crypt_cfb8 @ 00b6f320
00b6f320	sub sp,sp,#0x80
00b6f324	str x27,[sp, #0x20]
00b6f328	stp x26,x25,[sp, #0x30]
00b6f32c	stp x24,x23,[sp, #0x40]
00b6f330	stp x22,x21,[sp, #0x50]
00b6f334	stp x20,x19,[sp, #0x60]
00b6f338	stp x29,x30,[sp, #0x70]
00b6f33c	add x29,sp,#0x70
00b6f340	mrs x25,tpidr_el0
00b6f344	ldr x8,[x25, #0x28]
00b6f348	mov x19,x5
00b6f34c	mov x20,x4
00b6f350	mov x21,x3
00b6f354	mov x22,x2
00b6f358	mov w23,w1
00b6f35c	mov x24,x0
00b6f360	cmp w1,#0x1
00b6f364	str x8,[sp, #0x18]
00b6f368	b.ls 0x00b6f374
00b6f36c	orr w0,wzr,#0xffffffdf
00b6f370	b 0x00b6f3d8
00b6f374	cbz x22,0x00b6f3d4
00b6f378	mov x8,sp
00b6f37c	orr x26,x8,#0x1
00b6f380	ldr q0,[x21]
00b6f384	mov x0,x24
00b6f388	mov x1,x21
00b6f38c	mov x2,x21
00b6f390	sub x22,x22,#0x1
00b6f394	str q0,[sp]
00b6f398	bl 0x00c419a0
00b6f39c	ldrb w8,[x20], #0x1
00b6f3a0	ldrb w9,[x21]
00b6f3a4	cmp w23,#0x0
00b6f3a8	eor w9,w8,w9
00b6f3ac	strb w9,[x19], #0x1
00b6f3b0	ldur x10,[x26, #0x7]
00b6f3b4	csel w8,w8,w27,eq
00b6f3b8	cmp w23,#0x1
00b6f3bc	csel w27,w9,w8,eq
00b6f3c0	stur x10,[x21, #0x7]
00b6f3c4	ldr x10,[x26]
00b6f3c8	strb w27,[x21, #0xf]
00b6f3cc	str x10,[x21]
00b6f3d0	cbnz x22,0x00b6f380
00b6f3d4	mov w0,wzr
00b6f3d8	ldr x8,[x25, #0x28]
00b6f3dc	ldr x9,[sp, #0x18]
00b6f3e0	cmp x8,x9
00b6f3e4	b.ne 0x00b6f408
00b6f3e8	ldp x29,x30,[sp, #0x70]
00b6f3ec	ldp x20,x19,[sp, #0x60]
00b6f3f0	ldp x22,x21,[sp, #0x50]
00b6f3f4	ldp x24,x23,[sp, #0x40]
00b6f3f8	ldp x26,x25,[sp, #0x30]
00b6f3fc	ldr x27,[sp, #0x20]
00b6f400	add sp,sp,#0x80
00b6f404	ret
00b6f408	bl 0x00c2fec0

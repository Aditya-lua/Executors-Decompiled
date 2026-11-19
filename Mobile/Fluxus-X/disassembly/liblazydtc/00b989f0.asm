; mbedtls_cipher_info_from_psa @ 00b989f0
00b989f0	sub sp,sp,#0x40
00b989f4	stp x20,x19,[sp, #0x20]
00b989f8	stp x29,x30,[sp, #0x30]
00b989fc	add x29,sp,#0x30
00b98a00	mrs x20,tpidr_el0
00b98a04	ldr x8,[x20, #0x28]
00b98a08	mov x19,x3
00b98a0c	add x3,sp,#0xc
00b98a10	add x4,sp,#0x8
00b98a14	str x8,[sp, #0x18]
00b98a18	str x2,[sp, #0x10]
00b98a1c	add x2,sp,#0x10
00b98a20	str wzr,[sp, #0x8]
00b98a24	bl 0x00c42e60
00b98a28	mov w8,w0
00b98a2c	mov x0,xzr
00b98a30	cbnz w8,0x00b98a48
00b98a34	ldr w0,[sp, #0x8]
00b98a38	cbz x19,0x00b98a40
00b98a3c	str w0,[x19]
00b98a40	ldp w2,w1,[sp, #0xc]
00b98a44	bl 0x00c42160
00b98a48	ldr x8,[x20, #0x28]
00b98a4c	ldr x9,[sp, #0x18]
00b98a50	cmp x8,x9
00b98a54	b.ne 0x00b98a68
00b98a58	ldp x29,x30,[sp, #0x30]
00b98a5c	ldp x20,x19,[sp, #0x20]
00b98a60	add sp,sp,#0x40
00b98a64	ret
00b98a68	bl 0x00c2fec0

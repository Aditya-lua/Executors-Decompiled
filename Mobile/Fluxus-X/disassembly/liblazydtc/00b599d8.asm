; ossl_rand_drbg_free @ 00b599d8
00b599d8	cbz x0,0x00b59a10
00b599dc	str x19,[sp, #-0x20]!
00b599e0	stp x29,x30,[sp, #0x10]
00b599e4	mov x19,x0
00b599e8	ldr x0,[x0]
00b599ec	add x29,sp,#0x10
00b599f0	bl 0x00c34d40
00b599f4	ldp x29,x30,[sp, #0x10]
00b599f8	adrp x1,0x2be000
00b599fc	add x1,x1,#0xab1
00b59a00	mov w2,#0x35a
00b59a04	mov x0,x19
00b59a08	ldr x19,[sp], #0x20
00b59a0c	b 0x00c32310
00b59a10	ret

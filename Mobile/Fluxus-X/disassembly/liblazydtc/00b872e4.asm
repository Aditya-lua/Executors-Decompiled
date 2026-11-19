; psa_crypto_local_output_free @ 00b872e4
00b872e4	str x19,[sp, #-0x20]!
00b872e8	stp x29,x30,[sp, #0x10]
00b872ec	add x29,sp,#0x10
00b872f0	mov x19,x0
00b872f4	ldr x1,[x19, #0x8]!
00b872f8	mov x8,x0
00b872fc	cbz x1,0x00b8732c
00b87300	ldr x0,[x8]
00b87304	cbz x0,0x00b87338
00b87308	ldr x2,[x8, #0x10]
00b8730c	cbz x2,0x00b87318
00b87310	bl 0x00c2ffd0
00b87314	ldr x1,[x19]
00b87318	mov x0,x1
00b8731c	bl 0x00c30960
00b87320	mov w0,wzr
00b87324	stp xzr,xzr,[x19]
00b87328	b 0x00b8733c
00b8732c	mov w0,wzr
00b87330	str xzr,[x8, #0x10]
00b87334	b 0x00b8733c
00b87338	mov w0,#0xffffff69
00b8733c	ldp x29,x30,[sp, #0x10]
00b87340	ldr x19,[sp], #0x20
00b87344	ret

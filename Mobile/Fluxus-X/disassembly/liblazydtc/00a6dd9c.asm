; EVP_PKEY_get_base_id @ 00a6dd9c
00a6dd9c	str x19,[sp, #-0x20]!
00a6dda0	stp x29,x30,[sp, #0x10]
00a6dda4	ldr w1,[x0]
00a6dda8	add x0,sp,#0x8
00a6ddac	add x29,sp,#0x10
00a6ddb0	bl 0x00c37b20
00a6ddb4	cbz x0,0x00a6ddc0
00a6ddb8	ldr w19,[x0]
00a6ddbc	b 0x00a6ddc4
00a6ddc0	mov w19,wzr
00a6ddc4	ldr x0,[sp, #0x8]
00a6ddc8	bl 0x00c32360
00a6ddcc	ldp x29,x30,[sp, #0x10]
00a6ddd0	mov w0,w19
00a6ddd4	ldr x19,[sp], #0x20
00a6ddd8	ret

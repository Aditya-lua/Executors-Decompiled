; OPENSSL_sk_delete_ptr @ 00ae8e7c
00ae8e7c	stp x20,x19,[sp, #-0x20]!
00ae8e80	stp x29,x30,[sp, #0x10]
00ae8e84	add x29,sp,#0x10
00ae8e88	cbz x0,0x00ae8ec0
00ae8e8c	ldrsw x8,[x0]
00ae8e90	mov x19,x0
00ae8e94	cmp w8,#0x1
00ae8e98	b.lt 0x00ae8ec0
00ae8e9c	ldr x0,[x19, #0x8]
00ae8ea0	mov x9,xzr
00ae8ea4	ldr x10,[x0]
00ae8ea8	cmp x10,x1
00ae8eac	b.eq 0x00ae8ed4
00ae8eb0	add x9,x9,#0x1
00ae8eb4	cmp x9,x8
00ae8eb8	add x0,x0,#0x8
00ae8ebc	b.lt 0x00ae8ea4
00ae8ec0	mov x20,xzr
00ae8ec4	ldp x29,x30,[sp, #0x10]
00ae8ec8	mov x0,x20
00ae8ecc	ldp x20,x19,[sp], #0x20
00ae8ed0	ret
00ae8ed4	ldr x20,[x0]
00ae8ed8	sub w10,w8,#0x1
00ae8edc	cmp w10,w9
00ae8ee0	b.ne 0x00ae8eec
00ae8ee4	str w9,[x19]
00ae8ee8	b 0x00ae8ec4
00ae8eec	sub w8,w8,#0x1
00ae8ef0	sub w8,w8,w9
00ae8ef4	add x1,x0,#0x8
00ae8ef8	sbfiz x2,x8,#0x3,#0x20
00ae8efc	bl 0x00c2ff60
00ae8f00	ldr w8,[x19]
00ae8f04	sub w8,w8,#0x1
00ae8f08	str w8,[x19]
00ae8f0c	b 0x00ae8ec4

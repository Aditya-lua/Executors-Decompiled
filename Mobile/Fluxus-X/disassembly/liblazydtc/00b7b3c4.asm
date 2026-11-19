; mbedtls_poly1305_starts @ 00b7b3c4
00b7b3c4	str x19,[sp, #-0x20]!
00b7b3c8	stp x29,x30,[sp, #0x10]
00b7b3cc	add x29,sp,#0x10
00b7b3d0	ldr w8,[x1]
00b7b3d4	mov x19,x0
00b7b3d8	and w8,w8,#0xfffffff
00b7b3dc	str w8,[x0]
00b7b3e0	ldr w8,[x1, #0x4]
00b7b3e4	and w8,w8,#0xffffffc
00b7b3e8	str w8,[x0, #0x4]
00b7b3ec	ldr w8,[x1, #0x8]
00b7b3f0	and w8,w8,#0xffffffc
00b7b3f4	str w8,[x0, #0x8]
00b7b3f8	ldr w8,[x1, #0xc]
00b7b3fc	and w8,w8,#0xffffffc
00b7b400	str w8,[x0, #0xc]
00b7b404	ldr w8,[x1, #0x10]
00b7b408	str w8,[x0, #0x10]
00b7b40c	ldr w8,[x1, #0x14]
00b7b410	str w8,[x0, #0x14]
00b7b414	ldr w8,[x1, #0x18]
00b7b418	str w8,[x0, #0x18]
00b7b41c	ldr w8,[x1, #0x1c]
00b7b420	add x0,x0,#0x34
00b7b424	mov w1,#0x10
00b7b428	stp xzr,xzr,[x19, #0x20]
00b7b42c	str w8,[x19, #0x1c]
00b7b430	str wzr,[x19, #0x30]
00b7b434	bl 0x00c42220
00b7b438	str xzr,[x19, #0x48]
00b7b43c	ldp x29,x30,[sp, #0x10]
00b7b440	mov w0,wzr
00b7b444	ldr x19,[sp], #0x20
00b7b448	ret

; ossl_gcm_stream_final @ 00b67f94
00b67f94	str x21,[sp, #-0x30]!
00b67f98	stp x20,x19,[sp, #0x10]
00b67f9c	stp x29,x30,[sp, #0x20]
00b67fa0	add x29,sp,#0x20
00b67fa4	mov x19,x2
00b67fa8	mov x20,x1
00b67fac	mov x21,x0
00b67fb0	bl 0x00c41000
00b67fb4	cbz w0,0x00b67fe8
00b67fb8	mov x0,x21
00b67fbc	mov x1,x20
00b67fc0	mov x2,x19
00b67fc4	mov x3,xzr
00b67fc8	mov x4,xzr
00b67fcc	bl 0x00b67c64
00b67fd0	cmp w0,#0x1
00b67fd4	b.lt 0x00b67fe4
00b67fd8	mov w0,#0x1
00b67fdc	str xzr,[x19]
00b67fe0	b 0x00b67fe8
00b67fe4	mov w0,wzr
00b67fe8	ldp x29,x30,[sp, #0x20]
00b67fec	ldp x20,x19,[sp, #0x10]
00b67ff0	ldr x21,[sp], #0x30
00b67ff4	ret

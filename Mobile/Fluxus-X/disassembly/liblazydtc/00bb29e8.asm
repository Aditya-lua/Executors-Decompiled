; ZSTD_initDStream_usingDDict @ 00bb29e8
00bb29e8	stp x29,x30,[sp, #-0x20]!
00bb29ec	str x19,[sp, #0x10]
00bb29f0	mov x29,sp
00bb29f4	mov w8,#0x1
00bb29f8	add x19,x0,#0x7, LSL #12
00bb29fc	str wzr,[x19, #0x61c]
00bb2a00	str wzr,[x19, #0x66c]
00bb2a04	str w8,[x19, #0x5e0]
00bb2a08	bl 0x00c43710
00bb2a0c	cmn x0,#0x78
00bb2a10	b.hi 0x00bb2a24
00bb2a14	ldr w8,[x19, #0x598]
00bb2a18	cmp w8,#0x0
00bb2a1c	mov w8,#0x5
00bb2a20	csinc x0,x8,xzr,eq
00bb2a24	ldr x19,[sp, #0x10]
00bb2a28	ldp x29,x30,[sp], #0x20
00bb2a2c	ret

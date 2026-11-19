; BN_is_one @ 00a02d10
00a02d10	ldr w8,[x0, #0x8]
00a02d14	cmp w8,#0x1
00a02d18	mov w8,wzr
00a02d1c	b.ne 0x00a02d40
00a02d20	ldr x8,[x0]
00a02d24	ldr x8,[x8]
00a02d28	cmp x8,#0x1
00a02d2c	mov w8,wzr
00a02d30	b.ne 0x00a02d40
00a02d34	ldr w8,[x0, #0x10]
00a02d38	cmp w8,#0x0
00a02d3c	cset w8,eq
00a02d40	mov w0,w8
00a02d44	ret

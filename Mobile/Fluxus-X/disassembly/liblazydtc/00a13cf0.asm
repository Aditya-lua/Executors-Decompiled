; SCT_set_log_entry_type @ 00a13cf0
00a13cf0	cmp w1,#0x1
00a13cf4	str wzr,[x0, #0x60]
00a13cf8	b.hi 0x00a13d08
00a13cfc	str w1,[x0, #0x58]
00a13d00	mov w0,#0x1
00a13d04	ret
00a13d08	stp x29,x30,[sp, #-0x10]!
00a13d0c	mov x29,sp
00a13d10	bl 0x00c342a0
00a13d14	adrp x0,0x2a7000
00a13d18	adrp x2,0x2bf000
00a13d1c	add x0,x0,#0xdc3
00a13d20	add x2,x2,#0xac4
00a13d24	mov w1,#0x4c
00a13d28	bl 0x00c342b0
00a13d2c	mov w0,#0x32
00a13d30	mov w1,#0x66
00a13d34	mov x2,xzr
00a13d38	bl 0x00c342c0
00a13d3c	mov w0,wzr
00a13d40	ldp x29,x30,[sp], #0x10
00a13d44	ret

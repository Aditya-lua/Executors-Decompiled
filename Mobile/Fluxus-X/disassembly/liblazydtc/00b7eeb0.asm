; mbedtls_mpi_cmp_int @ 00b7eeb0
00b7eeb0	ldrh w8,[x0, #0xa]
00b7eeb4	cmp x1,#0x0
00b7eeb8	asr x10,x1,#0x3f
00b7eebc	cneg x9,x1,mi
00b7eec0	orr w10,w10,#0x1
00b7eec4	sub x8,x8,#0x1
00b7eec8	cmn x8,#0x1
00b7eecc	b.eq 0x00b7eee8
00b7eed0	ldr x11,[x0]
00b7eed4	ldr x11,[x11, x8, LSL #0x3]
00b7eed8	sub x8,x8,#0x1
00b7eedc	cbz x11,0x00b7eec8
00b7eee0	add x11,x8,#0x2
00b7eee4	b 0x00b7eeec
00b7eee8	mov x11,xzr
00b7eeec	mov w8,#0x2
00b7eef0	subs x8,x8,#0x1
00b7eef4	b.eq 0x00b7eefc
00b7eef8	cbz x9,0x00b7eef0
00b7eefc	orr x12,x8,x11
00b7ef00	cbz x12,0x00b7ef18
00b7ef04	cmp x11,x8
00b7ef08	b.ls 0x00b7ef20
00b7ef0c	ldrsh w8,[x0, #0x8]
00b7ef10	mov w0,w8
00b7ef14	ret
00b7ef18	mov w0,wzr
00b7ef1c	ret
00b7ef20	cmp x8,x11
00b7ef24	b.ls 0x00b7ef34
00b7ef28	neg w8,w10
00b7ef2c	mov w0,w8
00b7ef30	ret
00b7ef34	ldrsh w8,[x0, #0x8]
00b7ef38	cmp w8,#0x1
00b7ef3c	b.lt 0x00b7ef50
00b7ef40	tbz w10,#0x1f,0x00b7ef68
00b7ef44	mov w8,#0x1
00b7ef48	mov w0,w8
00b7ef4c	ret
00b7ef50	cmp w10,#0x1
00b7ef54	b.lt 0x00b7ef68
00b7ef58	cbz w8,0x00b7ef68
00b7ef5c	mov w8,#0xffffffff
00b7ef60	mov w0,w8
00b7ef64	ret
00b7ef68	sub x10,x11,#0x1
00b7ef6c	cmn x10,#0x1
00b7ef70	b.eq 0x00b7ef9c
00b7ef74	ldr x11,[x0]
00b7ef78	ldr x11,[x11, x10, LSL #0x3]
00b7ef7c	cmp x11,x9
00b7ef80	b.hi 0x00b7ef94
00b7ef84	cmp x11,x9
00b7ef88	sub x10,x10,#0x1
00b7ef8c	b.cs 0x00b7ef6c
00b7ef90	neg w8,w8
00b7ef94	mov w0,w8
00b7ef98	ret
00b7ef9c	mov w0,wzr
00b7efa0	ret

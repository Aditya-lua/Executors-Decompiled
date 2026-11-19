; PKCS12_get_friendlyname @ 00abced8
00abced8	stp x29,x30,[sp, #-0x10]!
00abcedc	mov w1,#0x9c
00abcee0	mov x29,sp
00abcee4	bl 0x00c3f4e0
00abcee8	cbz x0,0x00abcf0c
00abceec	ldr w8,[x0]
00abcef0	cmp w8,#0x1e
00abcef4	b.ne 0x00abcf0c
00abcef8	ldr x8,[x0, #0x8]
00abcefc	ldr x0,[x8, #0x8]
00abcf00	ldr w1,[x8]
00abcf04	ldp x29,x30,[sp], #0x10
00abcf08	b 0x00c3f600
00abcf0c	mov x0,xzr
00abcf10	ldp x29,x30,[sp], #0x10
00abcf14	ret

; mbedtls_psa_mac_update @ 00b9e14c
00b9e14c	ldr w8,[x0]
00b9e150	cbz w8,0x00b9e198
00b9e154	mov w10,#0x200
00b9e158	and w9,w8,#0xffc07fff
00b9e15c	movk w10,#0x3c0, LSL #16
00b9e160	cmp w9,w10
00b9e164	b.ne 0x00b9e180
00b9e168	stp x29,x30,[sp, #-0x10]!
00b9e16c	mov x29,sp
00b9e170	add x0,x0,#0x8
00b9e174	bl 0x00c42450
00b9e178	ldp x29,x30,[sp], #0x10
00b9e17c	b 0x00c42bf0
00b9e180	and w8,w8,#0x7fc00000
00b9e184	orr w9,wzr,#0x3800000
00b9e188	cmp w8,w9
00b9e18c	b.ne 0x00b9e198
00b9e190	add x0,x0,#0x10
00b9e194	b 0x00c42d00
00b9e198	mov w0,#0xffffff77
00b9e19c	ret

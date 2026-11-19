; mbedtls_psa_mac_abort @ 00b9dc70
00b9dc70	str x19,[sp, #-0x20]!
00b9dc74	stp x29,x30,[sp, #0x10]
00b9dc78	add x29,sp,#0x10
00b9dc7c	ldr w8,[x0]
00b9dc80	mov x19,x0
00b9dc84	cbz w8,0x00b9dca8
00b9dc88	mov w10,#0x200
00b9dc8c	and w9,w8,#0xffc07fff
00b9dc90	movk w10,#0x3c0, LSL #16
00b9dc94	cmp w9,w10
00b9dc98	b.ne 0x00b9dcb0
00b9dc9c	add x0,x19,#0x8
00b9dca0	bl 0x00c30290
00b9dca4	b 0x00b9dcd4
00b9dca8	mov w0,wzr
00b9dcac	b 0x00b9dcf4
00b9dcb0	and w8,w8,#0x7fc00000
00b9dcb4	orr w9,wzr,#0x3800000
00b9dcb8	cmp w8,w9
00b9dcbc	b.ne 0x00b9dce0
00b9dcc0	add x0,x19,#0xf8
00b9dcc4	mov w1,#0x90
00b9dcc8	bl 0x00c42220
00b9dccc	add x0,x19,#0x10
00b9dcd0	bl 0x00c42cc0
00b9dcd4	mov w0,wzr
00b9dcd8	str wzr,[x19]
00b9dcdc	b 0x00b9dcf4
00b9dce0	mov w2,#0x188
00b9dce4	mov x0,x19
00b9dce8	mov w1,wzr
00b9dcec	bl 0x00c301c0
00b9dcf0	mov w0,#0xffffff77
00b9dcf4	ldp x29,x30,[sp, #0x10]
00b9dcf8	ldr x19,[sp], #0x20
00b9dcfc	ret

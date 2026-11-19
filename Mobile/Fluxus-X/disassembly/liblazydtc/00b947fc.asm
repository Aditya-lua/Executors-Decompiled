; mbedtls_ecp_write_key_ext @ 00b947fc
00b947fc	ldr x8,[x0, #0x80]
00b94800	add x8,x8,#0x7
00b94804	lsr x8,x8,#0x3
00b94808	cmp x8,x3
00b9480c	b.ls 0x00b9481c
00b94810	mov w0,#0xffffb100
00b94814	str xzr,[x1]
00b94818	ret
00b9481c	str x8,[x1]
00b94820	ldrh w9,[x0, #0xca]
00b94824	cbz w9,0x00b94848
00b94828	ldr x9,[x0, #0x38]
00b9482c	cbz x9,0x00b94850
00b94830	ldr x9,[x0, #0x48]
00b94834	add x0,x0,#0xc0
00b94838	mov x1,x2
00b9483c	mov x2,x8
00b94840	cbz x9,0x00b94858
00b94844	b 0x00c41d80
00b94848	mov w0,#0xffffb080
00b9484c	ret
00b94850	mov w0,#0xffffff92
00b94854	ret
00b94858	b 0x00c41d90

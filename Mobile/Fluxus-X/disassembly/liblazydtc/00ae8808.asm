; OPENSSL_sk_free @ 00ae8808
00ae8808	cbz x0,0x00ae884c
00ae880c	stp x20,x19,[sp, #-0x20]!
00ae8810	stp x29,x30,[sp, #0x10]
00ae8814	mov x19,x0
00ae8818	ldr x0,[x0, #0x8]
00ae881c	adrp x20,0x2c6000
00ae8820	add x20,x20,#0x275
00ae8824	mov w2,#0x1b2
00ae8828	mov x1,x20
00ae882c	add x29,sp,#0x10
00ae8830	bl 0x00c32310
00ae8834	ldp x29,x30,[sp, #0x10]
00ae8838	mov w2,#0x1b3
00ae883c	mov x0,x19
00ae8840	mov x1,x20
00ae8844	ldp x20,x19,[sp], #0x20
00ae8848	b 0x00c32310
00ae884c	ret

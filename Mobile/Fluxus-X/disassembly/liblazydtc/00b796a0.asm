; mbedtls_md5_starts @ 00b796a0
00b796a0	adrp x8,0x29c000
00b796a4	ldr q0,[x8, #0x80]
00b796a8	mov x8,#0xdcfe
00b796ac	movk x8,#0x98ba, LSL #16
00b796b0	movk x8,#0x5476, LSL #32
00b796b4	movk x8,#0x1032, LSL #48
00b796b8	str q0,[x0]
00b796bc	str x8,[x0, #0x10]
00b796c0	mov w0,wzr
00b796c4	ret

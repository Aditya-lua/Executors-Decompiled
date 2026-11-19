; mbedtls_ripemd160_starts @ 00ba3928
00ba3928	adrp x8,0x29c000
00ba392c	ldr q0,[x8, #0x80]
00ba3930	mov x8,#0xdcfe
00ba3934	movk x8,#0x98ba, LSL #16
00ba3938	movk x8,#0x5476, LSL #32
00ba393c	mov w9,#0xe1f0
00ba3940	movk x8,#0x1032, LSL #48
00ba3944	movk w9,#0xc3d2, LSL #16
00ba3948	str x8,[x0, #0x10]
00ba394c	str q0,[x0]
00ba3950	str w9,[x0, #0x18]
00ba3954	mov w0,wzr
00ba3958	ret

; mbedtls_sha1_starts @ 00bab1d0
00bab1d0	adrp x8,0x29c000
00bab1d4	ldr q0,[x8, #0x80]
00bab1d8	mov x8,#0xdcfe
00bab1dc	movk x8,#0x98ba, LSL #16
00bab1e0	movk x8,#0x5476, LSL #32
00bab1e4	mov w9,#0xe1f0
00bab1e8	movk x8,#0x1032, LSL #48
00bab1ec	movk w9,#0xc3d2, LSL #16
00bab1f0	str x8,[x0, #0x10]
00bab1f4	str q0,[x0]
00bab1f8	str w9,[x0, #0x18]
00bab1fc	mov w0,wzr
00bab200	ret

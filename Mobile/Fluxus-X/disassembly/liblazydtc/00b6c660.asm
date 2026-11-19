; mbedtls_chacha20_setkey @ 00b6c660
00b6c660	adrp x8,0x29c000
00b6c664	ldr q0,[x8, #0x450]
00b6c668	str q0,[x0]
00b6c66c	ldr w8,[x1]
00b6c670	str w8,[x0, #0x10]
00b6c674	ldr w8,[x1, #0x4]
00b6c678	str w8,[x0, #0x14]
00b6c67c	ldr w8,[x1, #0x8]
00b6c680	str w8,[x0, #0x18]
00b6c684	ldr w8,[x1, #0xc]
00b6c688	str w8,[x0, #0x1c]
00b6c68c	ldr w8,[x1, #0x10]
00b6c690	str w8,[x0, #0x20]
00b6c694	ldr w8,[x1, #0x14]
00b6c698	str w8,[x0, #0x24]
00b6c69c	ldr w8,[x1, #0x18]
00b6c6a0	str w8,[x0, #0x28]
00b6c6a4	ldr w8,[x1, #0x1c]
00b6c6a8	str w8,[x0, #0x2c]
00b6c6ac	mov w0,wzr
00b6c6b0	ret

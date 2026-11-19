; mbedtls_cipher_cmac_reset @ 00b9f024
00b9f024	str x19,[sp, #-0x20]!
00b9f028	stp x29,x30,[sp, #0x10]
00b9f02c	add x29,sp,#0x10
00b9f030	cbz x0,0x00b9f068
00b9f034	ldr x8,[x0]
00b9f038	cbz x8,0x00b9f068
00b9f03c	ldr x19,[x0, #0x58]
00b9f040	cbz x19,0x00b9f068
00b9f044	add x0,x19,#0x10
00b9f048	mov w1,#0x10
00b9f04c	str xzr,[x19, #0x20]
00b9f050	bl 0x00c42220
00b9f054	mov w1,#0x10
00b9f058	mov x0,x19
00b9f05c	bl 0x00c42220
00b9f060	mov w0,wzr
00b9f064	b 0x00b9f06c
00b9f068	mov w0,#0xffff9f00
00b9f06c	ldp x29,x30,[sp, #0x10]
00b9f070	ldr x19,[sp], #0x20
00b9f074	ret

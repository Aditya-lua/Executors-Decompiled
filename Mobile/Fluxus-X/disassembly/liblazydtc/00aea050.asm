; OSSL_STORE_eof @ 00aea050
00aea050	str x19,[sp, #-0x20]!
00aea054	stp x29,x30,[sp, #0x10]
00aea058	ldr x8,[x0, #0x8]
00aea05c	mov x19,x0
00aea060	add x29,sp,#0x10
00aea064	cbz x8,0x00aea080
00aea068	ldr x8,[x19]
00aea06c	ldr x0,[x19, #0x10]
00aea070	ldr x8,[x8, #0xb8]
00aea074	blr x8
00aea078	ldr x8,[x19, #0x8]
00aea07c	cbnz x8,0x00aea090
00aea080	ldr x8,[x19]
00aea084	ldr x0,[x19, #0x10]
00aea088	ldr x8,[x8, #0x40]
00aea08c	blr x8
00aea090	ldp x29,x30,[sp, #0x10]
00aea094	cmp w0,#0x0
00aea098	cset w0,ne
00aea09c	ldr x19,[sp], #0x20
00aea0a0	ret

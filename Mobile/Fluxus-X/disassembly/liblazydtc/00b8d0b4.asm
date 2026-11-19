; psa_key_derivation_get_capacity @ 00b8d0b4
00b8d0b4	ldr w9,[x0]
00b8d0b8	mov x8,x0
00b8d0bc	cbz w9,0x00b8d0d0
00b8d0c0	ldr x8,[x8, #0x8]
00b8d0c4	mov w0,wzr
00b8d0c8	str x8,[x1]
00b8d0cc	ret
00b8d0d0	mov w0,#0xffffff77
00b8d0d4	ret

; psa_key_derivation_set_capacity @ 00b8d0d8
00b8d0d8	ldr w9,[x0]
00b8d0dc	mov x8,x0
00b8d0e0	cbz w9,0x00b8d0f8
00b8d0e4	ldr x9,[x8, #0x8]
00b8d0e8	cmp x9,x1
00b8d0ec	b.cs 0x00b8d100
00b8d0f0	mov w0,#0xffffff79
00b8d0f4	ret
00b8d0f8	mov w0,#0xffffff77
00b8d0fc	ret
00b8d100	mov w0,wzr
00b8d104	str x1,[x8, #0x8]
00b8d108	ret

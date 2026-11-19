; EC_GROUP_have_precompute_mult @ 00a32220
00a32220	ldr x8,[x0]
00a32224	ldr x9,[x8, #0xe0]
00a32228	cbz x9,0x00a32238
00a3222c	ldr x1,[x8, #0xf0]
00a32230	cbz x1,0x00a3223c
00a32234	br x1
00a32238	b 0x00c3b110
00a3223c	mov w0,wzr
00a32240	ret

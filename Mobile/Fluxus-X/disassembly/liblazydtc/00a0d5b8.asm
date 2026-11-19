; NCONF_free_data @ 00a0d5b8
00a0d5b8	cbz x0,0x00a0d5c8
00a0d5bc	ldr x8,[x0]
00a0d5c0	ldr x1,[x8, #0x20]
00a0d5c4	br x1
00a0d5c8	ret

; RSA_get0_factors @ 00ad1eac
00ad1eac	cbz x1,0x00ad1eb8
00ad1eb0	ldr x8,[x0, #0x40]
00ad1eb4	str x8,[x1]
00ad1eb8	cbz x2,0x00ad1ec4
00ad1ebc	ldr x8,[x0, #0x48]
00ad1ec0	str x8,[x2]
00ad1ec4	ret

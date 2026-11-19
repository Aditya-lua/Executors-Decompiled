; DSA_get0_key @ 00a20ad4
00a20ad4	cbz x1,0x00a20ae0
00a20ad8	ldr x8,[x0, #0x68]
00a20adc	str x8,[x1]
00a20ae0	cbz x2,0x00a20aec
00a20ae4	ldr x8,[x0, #0x70]
00a20ae8	str x8,[x2]
00a20aec	ret

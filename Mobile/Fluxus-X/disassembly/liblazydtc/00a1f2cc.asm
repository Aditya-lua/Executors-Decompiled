; DH_get0_key @ 00a1f2cc
00a1f2cc	cbz x1,0x00a1f2d8
00a1f2d0	ldr x8,[x0, #0x70]
00a1f2d4	str x8,[x1]
00a1f2d8	cbz x2,0x00a1f2e4
00a1f2dc	ldr x8,[x0, #0x78]
00a1f2e0	str x8,[x2]
00a1f2e4	ret

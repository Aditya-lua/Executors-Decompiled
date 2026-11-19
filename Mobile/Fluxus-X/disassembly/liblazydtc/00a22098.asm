; DSA_SIG_get0 @ 00a22098
00a22098	cbz x1,0x00a220a4
00a2209c	ldr x8,[x0]
00a220a0	str x8,[x1]
00a220a4	cbz x2,0x00a220b0
00a220a8	ldr x8,[x0, #0x8]
00a220ac	str x8,[x2]
00a220b0	ret

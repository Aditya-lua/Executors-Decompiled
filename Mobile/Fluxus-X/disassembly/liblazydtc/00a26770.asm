; ECDSA_SIG_get0 @ 00a26770
00a26770	cbz x1,0x00a2677c
00a26774	ldr x8,[x0]
00a26778	str x8,[x1]
00a2677c	cbz x2,0x00a26788
00a26780	ldr x8,[x0, #0x8]
00a26784	str x8,[x2]
00a26788	ret

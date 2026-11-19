; NCONF_free @ 00a0d820
00a0d820	cbz x0,0x00a0d830
00a0d824	ldr x8,[x0]
00a0d828	ldr x1,[x8, #0x18]
00a0d82c	br x1
00a0d830	ret

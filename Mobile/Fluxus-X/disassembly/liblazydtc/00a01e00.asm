; BN_get_word @ 00a01e00
00a01e00	ldr w9,[x0, #0x8]
00a01e04	cmp w9,#0x1
00a01e08	b.le 0x00a01e14
00a01e0c	mov x0,#-0x1
00a01e10	ret
00a01e14	mov x8,x0
00a01e18	mov x0,xzr
00a01e1c	b.ne 0x00a01e28
00a01e20	ldr x8,[x8]
00a01e24	ldr x0,[x8]
00a01e28	ret

; UI_get0_test_string @ 00aeef00
00aeef00	ldr w8,[x0]
00aeef04	cmp w8,#0x2
00aeef08	mov x8,xzr
00aeef0c	b.ne 0x00aeef14
00aeef10	ldr x8,[x0, #0x30]
00aeef14	mov x0,x8
00aeef18	ret

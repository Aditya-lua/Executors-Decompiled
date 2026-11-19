; UI_get0_action_string @ 00aeeee4
00aeeee4	ldr w8,[x0]
00aeeee8	cmp w8,#0x3
00aeeeec	mov x8,xzr
00aeeef0	b.ne 0x00aeeef8
00aeeef4	ldr x8,[x0, #0x28]
00aeeef8	mov x0,x8
00aeeefc	ret

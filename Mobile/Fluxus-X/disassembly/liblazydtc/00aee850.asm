; UI_get0_result_string @ 00aee850
00aee850	ldr w8,[x0]
00aee854	sub w8,w8,#0x1
00aee858	cmp w8,#0x1
00aee85c	mov x8,xzr
00aee860	b.hi 0x00aee868
00aee864	ldr x8,[x0, #0x18]
00aee868	mov x0,x8
00aee86c	ret

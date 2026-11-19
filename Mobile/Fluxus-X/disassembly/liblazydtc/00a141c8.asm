; SCT_is_complete @ 00a141c8
00a141c8	ldr w8,[x0]
00a141cc	cmn w8,#0x1
00a141d0	b.eq 0x00a14214
00a141d4	cbnz w8,0x00a1421c
00a141d8	ldr x8,[x0, #0x18]
00a141dc	cbz x8,0x00a14228
00a141e0	ldrb w8,[x0, #0x40]
00a141e4	cmp w8,#0x4
00a141e8	mov w8,wzr
00a141ec	b.ne 0x00a14228
00a141f0	ldrb w8,[x0, #0x41]
00a141f4	orr w8,w8,#0x2
00a141f8	cmp w8,#0x3
00a141fc	mov w8,wzr
00a14200	b.ne 0x00a14228
00a14204	ldr x8,[x0, #0x48]
00a14208	cbz x8,0x00a14228
00a1420c	ldr x8,[x0, #0x50]
00a14210	b 0x00a14220
00a14214	mov w0,wzr
00a14218	ret
00a1421c	ldr x8,[x0, #0x8]
00a14220	cmp x8,#0x0
00a14224	cset w8,ne
00a14228	mov w0,w8
00a1422c	ret

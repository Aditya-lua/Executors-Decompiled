; WPACKET_fill_lengths @ 00a9ca6c
00a9ca6c	stp x20,x19,[sp, #-0x20]!
00a9ca70	stp x29,x30,[sp, #0x10]
00a9ca74	ldr x20,[x0, #0x28]
00a9ca78	add x29,sp,#0x10
00a9ca7c	cbz x20,0x00a9caa8
00a9ca80	mov x19,x0
00a9ca84	mov x0,x19
00a9ca88	mov x1,x20
00a9ca8c	mov w2,wzr
00a9ca90	bl 0x00a9cab8
00a9ca94	cbz w0,0x00a9caac
00a9ca98	ldr x20,[x20]
00a9ca9c	cbnz x20,0x00a9ca84
00a9caa0	mov w0,#0x1
00a9caa4	b 0x00a9caac
00a9caa8	mov w0,wzr
00a9caac	ldp x29,x30,[sp, #0x10]
00a9cab0	ldp x20,x19,[sp], #0x20
00a9cab4	ret

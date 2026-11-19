; ix::Socket::isWaitNeeded @ 00984a7c
00984a7c	stp x29,x30,[sp, #-0x10]!
00984a80	mov x29,sp
00984a84	bl 0x00c30710
00984a88	ldr w8,[x0]
00984a8c	mov w0,#0x1
00984a90	cmp w8,#0xb
00984a94	b.eq 0x00984aa0
00984a98	cmp w8,#0x73
00984a9c	b.ne 0x00984aa8
00984aa0	ldp x29,x30,[sp], #0x10
00984aa4	ret
00984aa8	mov w0,wzr
00984aac	ldp x29,x30,[sp], #0x10
00984ab0	ret

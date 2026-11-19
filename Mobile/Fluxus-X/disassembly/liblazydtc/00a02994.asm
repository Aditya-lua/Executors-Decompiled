; bn_cmp_words @ 00a02994
00a02994	cbz w2,0x00a029f4
00a02998	sub w8,w2,#0x1
00a0299c	sbfiz x8,x8,#0x3,#0x20
00a029a0	ldr x9,[x0, x8#0x0]
00a029a4	ldr x8,[x1, x8#0x0]
00a029a8	cmp x9,x8
00a029ac	b.ne 0x00a029e4
00a029b0	subs w9,w2,#0x2
00a029b4	mov w8,wzr
00a029b8	b.lt 0x00a029ec
00a029bc	sxtw x8,w9
00a029c0	lsl x9,x8,#0x3
00a029c4	ldr x10,[x0, x9#0x0]
00a029c8	ldr x9,[x1, x9#0x0]
00a029cc	cmp x10,x9
00a029d0	b.ne 0x00a029e4
00a029d4	subs x8,x8,#0x1
00a029d8	b.ge 0x00a029c0
00a029dc	mov w0,wzr
00a029e0	ret
00a029e4	mov w8,#0x1
00a029e8	cneg w8,w8,ls
00a029ec	mov w0,w8
00a029f0	ret
00a029f4	mov w0,wzr
00a029f8	ret

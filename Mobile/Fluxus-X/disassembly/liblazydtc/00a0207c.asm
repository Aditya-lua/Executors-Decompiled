; bn_correct_top @ 00a0207c
00a0207c	ldr w8,[x0, #0x8]
00a02080	cmp w8,#0x1
00a02084	b.lt 0x00a020b0
00a02088	ldr x9,[x0]
00a0208c	sxtw x10,w8
00a02090	add x9,x9,x10, LSL #0x3
00a02094	sub x9,x9,#0x8
00a02098	ldr x10,[x9]
00a0209c	cbnz x10,0x00a020ac
00a020a0	subs w8,w8,#0x1
00a020a4	sub x9,x9,#0x8
00a020a8	b.gt 0x00a02098
00a020ac	str w8,[x0, #0x8]
00a020b0	cbz w8,0x00a020b8
00a020b4	ret
00a020b8	str wzr,[x0, #0x10]
00a020bc	ret

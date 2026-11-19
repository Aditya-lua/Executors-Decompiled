; ZSTD_checkContinuity @ 00bbf814
00bbf814	cbz x2,0x00bbf840
00bbf818	ldr x8,[x0, #0x74c0]
00bbf81c	cmp x1,x8
00bbf820	b.eq 0x00bbf840
00bbf824	ldr x9,[x0, #0x74c8]
00bbf828	str x8,[x0, #0x74d8]
00bbf82c	str x1,[x0, #0x74c8]
00bbf830	sub x8,x9,x8
00bbf834	str x1,[x0, #0x74c0]
00bbf838	add x8,x1,x8
00bbf83c	str x8,[x0, #0x74d0]
00bbf840	ret

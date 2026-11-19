; ossl_statem_send_fatal @ 009da290
009da290	ldr w8,[x0, #0x64]
009da294	mov w2,w1
009da298	cbz w8,0x009da2a8
009da29c	ldr w8,[x0, #0x48]
009da2a0	cmp w8,#0x1
009da2a4	b.eq 0x009da2c8
009da2a8	mov w8,#0x1
009da2ac	cmn w2,#0x1
009da2b0	str w8,[x0, #0x64]
009da2b4	str w8,[x0, #0x48]
009da2b8	b.eq 0x009da2c8
009da2bc	ldr w8,[x0, #0x7c]
009da2c0	cmp w8,#0x1
009da2c4	b.ne 0x009da2cc
009da2c8	ret
009da2cc	mov w1,#0x2
009da2d0	b 0x00c34890

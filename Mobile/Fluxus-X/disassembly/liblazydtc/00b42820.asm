; ossl_prov_get_keymgmt_import @ 00b42820
00b42820	add x8,x0,#0x8
00b42824	ldur w9,[x8, #-0x8]
00b42828	cbnz w9,0x00b4283c
00b4282c	b 0x00b4284c
00b42830	add x8,x8,#0x10
00b42834	ldur w9,[x8, #-0x8]
00b42838	cbz w9,0x00b4284c
00b4283c	cmp w9,#0x28
00b42840	b.ne 0x00b42830
00b42844	ldr x0,[x8]
00b42848	ret
00b4284c	mov x0,xzr
00b42850	ret

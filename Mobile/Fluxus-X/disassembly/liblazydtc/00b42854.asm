; ossl_prov_get_keymgmt_export @ 00b42854
00b42854	add x8,x0,#0x8
00b42858	ldur w9,[x8, #-0x8]
00b4285c	cbnz w9,0x00b42870
00b42860	b 0x00b42880
00b42864	add x8,x8,#0x10
00b42868	ldur w9,[x8, #-0x8]
00b4286c	cbz w9,0x00b42880
00b42870	cmp w9,#0x2a
00b42874	b.ne 0x00b42864
00b42878	ldr x0,[x8]
00b4287c	ret
00b42880	mov x0,xzr
00b42884	ret

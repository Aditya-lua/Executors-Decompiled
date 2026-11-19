; ossl_prov_get_keymgmt_new @ 00b427b8
00b427b8	add x8,x0,#0x8
00b427bc	ldur w9,[x8, #-0x8]
00b427c0	cbnz w9,0x00b427d4
00b427c4	b 0x00b427e4
00b427c8	add x8,x8,#0x10
00b427cc	ldur w9,[x8, #-0x8]
00b427d0	cbz w9,0x00b427e4
00b427d4	cmp w9,#0x1
00b427d8	b.ne 0x00b427c8
00b427dc	ldr x0,[x8]
00b427e0	ret
00b427e4	mov x0,xzr
00b427e8	ret
